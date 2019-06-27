package es.uah.aut.srg.tmtcif.generator.ui;

import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit;
import es.uah.aut.srg.tmtcif.export.exportFactory;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter;
import es.uah.aut.srg.tmtcif.filter.filterFactory;
import es.uah.aut.srg.tmtcif.generator.TMTCIFGenerator;
import es.uah.aut.srg.tmtcif.generator.util.XpandGeneratorUtil;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;
import es.uah.aut.srg.tmtcif.import_.importFactory;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType;
import es.uah.aut.srg.tmtcif.format.formatFactory;
import es.uah.aut.srg.tmtcif.xtext.xml.XMLGeneratorUtil;

public class TMTCIFGeneratorLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	static final boolean createXMI=true;
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		boolean useTypeInsteadOfId = true;

		//create common ccsds/pus formats, filters and imports
		TMTCIFFormatFormat ccsdsTcFormat = formatFactory.eINSTANCE.createTMTCIFFormatFormat();
		ccsdsTcFormat.setName("CCSDS_TC");
		ccsdsTcFormat.setDescription("CCSDS_TC");
		ccsdsTcFormat.setUri("es.uah.aut.srg.CCSDS_TC");
		ccsdsTcFormat.setVersion("v1");
		ccsdsTcFormat.setProtocol("CCSDS");
		ccsdsTcFormat.setType(TMTCIFFormatFormatType.TC);
		TMTCIFGenerator.createVSField(ccsdsTcFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 248*8, 0);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 2, 1, "PacketID", null, 16, 0);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 3, 2, "VersionNumber", null, 3, 0);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 4, 2, "Type", null, 1, 3);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 5, 2, "DFHFlag", null, 1, 4);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 6, 2, "APID", null, 11, 5);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 7, 6, "PID", null, 7, 5);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 8, 6, "PCAT", null, 4, 12);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 10, 9, "SequenceFlag", null, 2, 16);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 11, 9, "SequenceCount", null, 14, 18);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 12, 1, "PacketLength", null, 16, 32);
		TMTCIFGenerator.createVSField(ccsdsTcFormat, 13, 0, "PacketDataField", null, 1*8, 12, 8, 242*8, 6*8);
		TMTCIFGenerator.createCSField(ccsdsTcFormat, 14, 13, "SecondaryHeader", null, 4*8, 6*8);
		TMTCIFGenerator.createVSField(ccsdsTcFormat, 15, 13, "ApplicationData", null, -5*8, 12, 8, 236*8, 10*8);
		TMTCIFGenerator.createFDICField(ccsdsTcFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		TMTCIFFormatFormat epdPusTcFormat = formatFactory.eINSTANCE.createTMTCIFFormatFormat();
		epdPusTcFormat.setName("EPD_PUS_TC");
		epdPusTcFormat.setDescription("EPD_PUS_TC");
		epdPusTcFormat.setUri("es.uah.aut.srg.EPD_PUS_TC");
		epdPusTcFormat.setVersion("v1");
		epdPusTcFormat.setProtocol("PUS");
		epdPusTcFormat.setType(TMTCIFFormatFormatType.TC);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 0, 0, "SecondaryHeader", null, 4*8, 0);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 1, 0, "CCSDSSecondaryHeaderFlag", null, 1, 0);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 2, 0, "PUSVersion", null, 3, 1);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 3, 0, "ACK", null, 4, 4);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 4, 0, "ServiceType", null, 1*8, 1*8);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 5, 0, "ServiceSubtype", null, 1*8, 2*8);
		TMTCIFGenerator.createCSField(epdPusTcFormat, 6, 0, "SourceID", null, 1*8, 3*8);
		TMTCIFGenerator.createVSField(epdPusTcFormat, 7, 7, "ApplicationData", null, 0, 8, 8, 236*8, 4*8);
		TMTCIFGenerator.createVRFieldSize(epdPusTcFormat, 8, 7, "AppDataLength");
		
    	TMTCIFExportExport epdExportPusToLevel0 = exportFactory.eINSTANCE.createTMTCIFExportExport();
    	epdExportPusToLevel0.setName("EPD_PUS_TC_TO_CCSDS_TC");
    	epdExportPusToLevel0.setUri("es.uah.aut.srg.EPD_PUS_TC_TO_CCSDS_TC");
    	epdExportPusToLevel0.setVersion("v1");
    	epdExportPusToLevel0.setFrom(epdPusTcFormat);
    	epdExportPusToLevel0.setTo(ccsdsTcFormat);
    	TMTCIFExportSizes epdExportPusToLevel0Sizes = exportFactory.eINSTANCE.createTMTCIFExportSizes();
    	TMTCIFExportSizeInBits epdExportPusToLevel0SizeInBits = exportFactory.eINSTANCE.createTMTCIFExportSizeInBits();
    	epdExportPusToLevel0SizeInBits.setId("0");
    	epdExportPusToLevel0SizeInBits.setFrom("ApplicationData");
    	epdExportPusToLevel0SizeInBits.setAddSize("5");
    	epdExportPusToLevel0SizeInBits.setUnit(TMTCIFExportUnit.BYTES);
    	epdExportPusToLevel0Sizes.getSizeInBits().add(epdExportPusToLevel0SizeInBits);
    	epdExportPusToLevel0.setSizes(epdExportPusToLevel0Sizes);
    	TMTCIFExportSettings epdExportPusToCcsdsSettings = exportFactory.eINSTANCE.createTMTCIFExportSettings();
    	TMTCIFGenerator.createExportSettingFromField(epdExportPusToCcsdsSettings, epdPusTcFormat.getCSField().get(0), ccsdsTcFormat.getCSField().get(12));//SecondaryHeader
    	TMTCIFGenerator.createExportSettingFromField(epdExportPusToCcsdsSettings, epdPusTcFormat.getVSField().get(0), ccsdsTcFormat.getVSField().get(2));//ApplicationData
    	TMTCIFGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "0", ccsdsTcFormat.getCSField().get(2));//VersionNumber
    	TMTCIFGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "1", ccsdsTcFormat.getCSField().get(3));//Type
    	TMTCIFGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "1", ccsdsTcFormat.getCSField().get(4));//DFHFlag
    	TMTCIFGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "812", ccsdsTcFormat.getCSField().get(5));//APID
    	TMTCIFGenerator.createExportSettingFromConst(epdExportPusToCcsdsSettings, "3", ccsdsTcFormat.getCSField().get(9));//SequenceFlag
    	TMTCIFGenerator.createExportSettingFromSize(epdExportPusToCcsdsSettings, "0", ccsdsTcFormat.getCSField().get(11));//PacketLength
    	epdExportPusToLevel0.setSettings(epdExportPusToCcsdsSettings);
		
		TMTCIFFormatFormat ccsdsTmFormat = formatFactory.eINSTANCE.createTMTCIFFormatFormat();
		ccsdsTmFormat.setName("CCSDS_TM");
		ccsdsTmFormat.setDescription("CCSDS_TM");
		ccsdsTmFormat.setUri("es.uah.aut.srg.CCSDS_TM");
		ccsdsTmFormat.setVersion("v1");
		ccsdsTmFormat.setProtocol("CCSDS");
		ccsdsTmFormat.setType(TMTCIFFormatFormatType.TM);
		TMTCIFGenerator.createVSField(ccsdsTmFormat, 0, 0, "CCSDSPacket", null, 7*8, 12, 8, 4112*8, 0);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 1, 0, "PacketHeader", null, 6*8, 0);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 2, 1, "PacketID", null, 16, 0);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 3, 2, "VersionNumber", null, 3, 0);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 4, 2, "Type", null, 1, 3);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 5, 2, "DFHFlag", null, 1, 4);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 6, 2, "APID", null, 11, 5);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 7, 6, "PID", null, 7, 5);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 8, 6, "PCAT", null, 4, 12);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 9, 1, "PacketSequenceControl", null, 16, 16);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 10, 9, "SequenceFlag", null, 2, 16);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 11, 9, "SequenceCount", null, 14, 18);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 12, 1, "PacketLength", null, 16, 32);
		TMTCIFGenerator.createVSField(ccsdsTmFormat, 13, 0, "PacketDataField", null, 8, 12, 8, 4106*8, 6*8);
		TMTCIFGenerator.createCSField(ccsdsTmFormat, 14, 13, "SecondaryHeader", null, 10*8, 6*8);
		TMTCIFGenerator.createVSField(ccsdsTmFormat, 15, 13, "SourceData", null, -11*8, 12, 8, 4096*8, 16*8);
		TMTCIFGenerator.createFDICField(ccsdsTmFormat, 16, 13, "CRC", null, 16, 15,
				new ArrayList<Integer>(Arrays.asList(1, 14, 15)));
		
		TMTCIFFormatFormat epdPusTmFormat = formatFactory.eINSTANCE.createTMTCIFFormatFormat();
		epdPusTmFormat.setName("EPD_PUS_TM");
		epdPusTmFormat.setDescription("EPD_PUS_TM");
		epdPusTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM");
		epdPusTmFormat.setVersion("v1");
		epdPusTmFormat.setProtocol("PUS");
		epdPusTmFormat.setType(TMTCIFFormatFormatType.TM);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 0, 0, "SecondaryHeader", null, 10*8, 0);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 1, 0, "Spare", null, 1, 0);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 2, 0, "PUSVersion", null, 3, 1);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 3, 0, "Spare", null, 4, 4);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 4, 0, "ServiceType", null, 8, 1*8);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 5, 0, "ServiceSubtype", null, 8, 2*8);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 6, 0, "DestinationID", null, 8, 3*8);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 7, 0, "SCTime", null, 6*8, 4*8);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 8, 7, "Sync", null, 1, 4*8);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 9, 7, "Seconds", null, 31, 4*8+1);
		TMTCIFGenerator.createCSField(epdPusTmFormat, 10, 7, "Subseconds", null, 16, 8*8);
		TMTCIFGenerator.createVSField(epdPusTmFormat, 11, 11, "SourceData", null, 0, 12, 8, 4096*8, 10*8);
		TMTCIFGenerator.createVRFieldSize(epdPusTmFormat, 12, 11, "SourceDataLength");
		
		TMTCIFFormatFormat epdPusDataDataTmFormat = formatFactory.eINSTANCE.createTMTCIFFormatFormat();
		epdPusDataDataTmFormat.setName("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setDescription("EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setUri("es.uah.aut.srg.EPD_PUS_TM_DATA");
		epdPusDataDataTmFormat.setVersion("v1");
		epdPusDataDataTmFormat.setProtocol("PUS_DATA");
		epdPusDataDataTmFormat.setType(TMTCIFFormatFormatType.TM);
		TMTCIFGenerator.createVSField(epdPusDataDataTmFormat, 0, 0, "SourceData", null, 0, 1, 8, 4096*8, 10*8);
		TMTCIFGenerator.createVRFieldSize(epdPusDataDataTmFormat, 1, 0, "SourceDataLength");
		
		TMTCIFFilterMintermFilter epdCcsdsFilter = filterFactory.eINSTANCE.createTMTCIFFilterMintermFilter();
		epdCcsdsFilter.setName("EPD_CCSDS_TM");
		epdCcsdsFilter.setDescription("EPD_CCSDS_TM");
		epdCcsdsFilter.setUri("es.uah.aut.srg.EPD_CCSDS_TM");
		epdCcsdsFilter.setVersion("v1");
		epdCcsdsFilter.setFormatFile(ccsdsTmFormat);//CCSDS
		TMTCIFGenerator.createMintermFilterBoolVar(epdCcsdsFilter, "0", ccsdsTmFormat.getCSField().get(2), "0");//Version
		TMTCIFGenerator.createMintermFilterBoolVarFDIC(epdCcsdsFilter, "1", ccsdsTmFormat.getFDICField().get(0));//CRC
		TMTCIFGenerator.createMintermFilterMinterm(epdCcsdsFilter, "0", 0, 2);
		
		TMTCIFFilterMintermFilter epdPusFilter = filterFactory.eINSTANCE.createTMTCIFFilterMintermFilter();
		epdPusFilter.setName("EPD_PUS_TM");
		epdPusFilter.setDescription("EPD_PUS_TM");
		epdPusFilter.setUri("es.uah.aut.srg.EPD_PUS_TM");
		epdPusFilter.setVersion("v1");
		epdPusFilter.setFormatFile(epdPusTmFormat);//CCSDS
		TMTCIFGenerator.createMintermFilterBoolVar(epdPusFilter, "0", epdPusTmFormat.getCSField().get(2), "1");//PUSVersion
		TMTCIFGenerator.createMintermFilterMinterm(epdPusFilter, "0", 0, 1);
		
		TMTCIFImportImport epdPusFromCcsdsImport = importFactory.eINSTANCE.createTMTCIFImportImport();
		epdPusFromCcsdsImport.setName("EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setDescription("EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setUri("es.uah.aut.srg.EPD_PUS_TM_FROM_CCSDS_TM");
		epdPusFromCcsdsImport.setVersion("v1");
		epdPusFromCcsdsImport.setFrom(ccsdsTmFormat);
		epdPusFromCcsdsImport.setTo(epdPusTmFormat);
		TMTCIFGenerator.createImportDataSource(epdPusFromCcsdsImport, ccsdsTmFormat.getCSField().get(12), "0", "0");//SecondaryHeader
		TMTCIFGenerator.createImportDataSource(epdPusFromCcsdsImport, ccsdsTmFormat.getVSField().get(2), "0", "0");//SourceData
		TMTCIFGenerator.createImportVirtualSize(epdPusFromCcsdsImport, ccsdsTmFormat.getCSField().get(11),
				epdPusTmFormat.getVRFieldSize().get(0), "-11");//PacketLength to SourceDataLength
		
		TMTCIFImportImport epdPusDataFromEpdPusImport = importFactory.eINSTANCE.createTMTCIFImportImport();
		epdPusDataFromEpdPusImport.setName("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setDescription("EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setUri("es.uah.aut.srg.EPD_PUS_DATA_TM_FROM_EPD_PUS_TM");
		epdPusDataFromEpdPusImport.setVersion("v1");
		epdPusDataFromEpdPusImport.setFrom(epdPusTmFormat);
		epdPusDataFromEpdPusImport.setTo(epdPusDataDataTmFormat);
		TMTCIFGenerator.createImportDataSource(epdPusDataFromEpdPusImport, epdPusTmFormat.getVSField().get(0), "0", "0");//SourceData
		epdPusDataFromEpdPusImport.setVirtualSize(null);
		
		String database = configuration.getAttribute(TMTCIFGeneratorLaunchConfigurationAttributes.SOURCE_DB, "");
		String output = configuration.getAttribute(TMTCIFGeneratorLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		
		Map<String, TMTCIFFormatFormat> tcFormats = null;
		try {
			tcFormats = TMTCIFGenerator.getTcFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tcFormats.put("CCSDS_TC", ccsdsTcFormat);
		tcFormats.put("EPD_PUS_TC", epdPusTcFormat);
		
		Collection<TMTCIFExportExport> exportsToLevel0 = null;
		try {
			exportsToLevel0 = TMTCIFGenerator.getExportsToLevel0(database, ccsdsTcFormat, epdPusTcFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		exportsToLevel0.add(epdExportPusToLevel0);
		
		Collection<TMTCIFExportExport> exportsToLevel1 = null;
		try {
			exportsToLevel1 = TMTCIFGenerator.getExportsToLevel1(database, tcFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Map<String, TMTCIFFormatFormat> tmFormats = null;
		try {
			tmFormats = TMTCIFGenerator.getTmFormats(database);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		tmFormats.put("CCSDS_TM", ccsdsTmFormat);
		tmFormats.put("EPD_PUS_TM", epdPusTmFormat);
		tmFormats.put("EPD_PUS_TM_DATA", epdPusDataDataTmFormat);
		
		Collection<TMTCIFFilterMintermFilter> filtersLevel0 = null;
		try {
			filtersLevel0 = TMTCIFGenerator.getFiltersLevel0(database, ccsdsTmFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		filtersLevel0.add(epdCcsdsFilter);
		
		Collection<TMTCIFFilterMintermFilter> filtersLevel1 = null;
		try {
			filtersLevel1 = TMTCIFGenerator.getFiltersLevel1(database, epdPusTmFormat);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		filtersLevel1.add(epdPusFilter);
		
		Collection<TMTCIFFilterMintermFilter> filtersLevel2 = null;
		try {
			filtersLevel2 = TMTCIFGenerator.getFiltersLevel2(database, tmFormats);
		} catch (IOException e) {
			throw new CoreException(new Status(
				IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
		
		Collection<TMTCIFImportImport> imports = new HashSet<TMTCIFImportImport>();
		imports.add(epdPusFromCcsdsImport);
		imports.add(epdPusDataFromEpdPusImport);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource folder = root.findMember(output);
		
		if (folder == null || (folder instanceof IFolder) == false) {
			throw new CoreException(new Status(
					IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + output + "' not found!"));
		}
		
		Map<String, String> ZID_tc_type = new HashMap<String, String>();
		Map<String, String> YID_tm_type = new HashMap<String, String>();
		if(useTypeInsteadOfId) {
			for (TMTCIFExportExport TMTCIFExportExport : exportsToLevel1) {
				String typeSubtype = "tc_";
				if(Integer.parseInt(TMTCIFExportExport.getName().substring(5, 8)) >= 500) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += TMTCIFExportExport.getSettings().getSettingFromConst().get(3).getValue() + "_"
						 + TMTCIFExportExport.getSettings().getSettingFromConst().get(4).getValue();
				ZID_tc_type.put(TMTCIFExportExport.getName(), typeSubtype);
			}

			Map<String, String> PI1_Val = new HashMap<String, String>();
			for (TMTCIFFilterMintermFilter TMTCIFFilterMintermFilter : filtersLevel2) {
				PI1_Val.put(TMTCIFFilterMintermFilter.getName(),
						TMTCIFFilterMintermFilter.getBoolVar().get(0).getConstant().getValue());
			}
			for (TMTCIFFilterMintermFilter TMTCIFFilterMintermFilter : filtersLevel1) {
				if(TMTCIFFilterMintermFilter.getName().substring(0, 3).compareTo("EPD") == 0) {
					continue;
				}
				String typeSubtype = "tm_";
				if(Integer.parseInt(TMTCIFFilterMintermFilter.getName().substring(5, 8)) < 700) {
					typeSubtype += "epd_";
				} else {
					typeSubtype += "sis_";
				}
				typeSubtype += TMTCIFFilterMintermFilter.getBoolVar().get(0).getConstant().getValue() + "_"
						 + TMTCIFFilterMintermFilter.getBoolVar().get(1).getConstant().getValue();
				if(PI1_Val.get(TMTCIFFilterMintermFilter.getName()) != null) {
					typeSubtype += "_" + PI1_Val.get(TMTCIFFilterMintermFilter.getName());
				}
				YID_tm_type.put(TMTCIFFilterMintermFilter.getName(), typeSubtype);
			}
		}
		
		for (TMTCIFFormatFormat TMTCIFFormatFormat : tcFormats.values()) {

			if((useTypeInsteadOfId) && (TMTCIFFormatFormat.getName().compareTo("CCSDS_TC") != 0)
					 && (TMTCIFFormatFormat.getName().compareTo("EPD_PUS_TC") != 0)) {
				TMTCIFFormatFormat.setName(ZID_tc_type.get(TMTCIFFormatFormat.getName()));
			}
			TMTCIFFormatFormat.setUri("es.uah.aut.srg." + TMTCIFFormatFormat.getName());
			
			String formatName = "tcFormats\\" + TMTCIFFormatFormat.getName() + ".tmtcif_format";

			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFFormatFormat,
					"es::uah::aut::srg::tmtcif::generator::templates::formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

		if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(formatName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
		}
		}
		
		for (TMTCIFExportExport TMTCIFExportExport : exportsToLevel0) {

			if(TMTCIFExportExport.getName().compareTo("EPD_PUS_TC_TO_CCSDS_TC") != 0) {

				if(useTypeInsteadOfId)
					TMTCIFExportExport.setName(ZID_tc_type.get(TMTCIFExportExport.getName())); 

				TMTCIFExportExport.setName(TMTCIFExportExport.getName() + "_export_to_level_0");
				TMTCIFExportExport.setUri("es.uah.aut.srg." + TMTCIFExportExport.getName());
			}
			
			String exportName = "exportsToLevel0\\" + TMTCIFExportExport.getName() + ".tmtcif_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFExportExport,
					"es::uah::aut::srg::tmtcif::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(exportName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
		
		for (TMTCIFExportExport TMTCIFExportExport : exportsToLevel1) {

			if(useTypeInsteadOfId)
				TMTCIFExportExport.setName(ZID_tc_type.get(TMTCIFExportExport.getName())); 
			    	
	    	if(TMTCIFExportExport.getSettings().getSettingFromConst().get(2).getValue().compareTo("9") == 0) {
	    		TMTCIFExportExport.setName(TMTCIFExportExport.getName() + "_export_to_level_1_ack");
	    	}
	    	else {
	    		TMTCIFExportExport.setName(TMTCIFExportExport.getName() + "_export_to_level_1");
	    	}
			TMTCIFExportExport.setUri("es.uah.aut.srg." + TMTCIFExportExport.getName());
		
			String exportName = "exportsToLevel1\\" + TMTCIFExportExport.getName() + ".tmtcif_export";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFExportExport,
					"es::uah::aut::srg::tmtcif::generator::templates::exportSerializer::Serializer", 
					false, exportName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(exportName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
		
		for (TMTCIFFormatFormat TMTCIFFormatFormat : tmFormats.values()) {

			if((useTypeInsteadOfId) && (TMTCIFFormatFormat.getName().compareTo("CCSDS_TM") != 0)
					 && (TMTCIFFormatFormat.getName().compareTo("EPD_PUS_TM") != 0)
					 && (TMTCIFFormatFormat.getName().compareTo("EPD_PUS_TM_DATA") != 0)) {
				TMTCIFFormatFormat.setName(YID_tm_type.get(TMTCIFFormatFormat.getName()));
			}
			TMTCIFFormatFormat.setUri("es.uah.aut.srg." + TMTCIFFormatFormat.getName());
		
			String formatName = "tmFormats\\" + TMTCIFFormatFormat.getName() + ".tmtcif_format";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFFormatFormat,
					"es::uah::aut::srg::tmtcif::generator::templates::formatSerializer::Serializer", 
					false, formatName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(formatName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
		
		for (TMTCIFFilterMintermFilter TMTCIFFilterMintermFilter : filtersLevel0) {

			if(TMTCIFFilterMintermFilter.getName().compareTo("EPD_CCSDS_TM") != 0) {

				if(useTypeInsteadOfId)
					TMTCIFFilterMintermFilter.setName(YID_tm_type.get(TMTCIFFilterMintermFilter.getName())); 
				
				TMTCIFFilterMintermFilter.setName(TMTCIFFilterMintermFilter.getName() + "_filter_level_0");
				TMTCIFFilterMintermFilter.setUri("es.uah.aut.srg." + TMTCIFFilterMintermFilter.getName());
			}
		
			String filterName = "filtersLevel0\\" + TMTCIFFilterMintermFilter.getName() + ".tmtcif_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFFilterMintermFilter,
					"es::uah::aut::srg::tmtcif::generator::templates::filterSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(filterName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}

		for (TMTCIFFilterMintermFilter TMTCIFFilterMintermFilter : filtersLevel1) {

			if(TMTCIFFilterMintermFilter.getName().compareTo("EPD_PUS_TM") != 0) {

				if(useTypeInsteadOfId)
					TMTCIFFilterMintermFilter.setName(YID_tm_type.get(TMTCIFFilterMintermFilter.getName())); 
				
				TMTCIFFilterMintermFilter.setName(TMTCIFFilterMintermFilter.getName() + "_filter_level_1");
				TMTCIFFilterMintermFilter.setUri("es.uah.aut.srg." + TMTCIFFilterMintermFilter.getName());
			}
		
			String filterName = "filtersLevel1\\" + TMTCIFFilterMintermFilter.getName() + ".tmtcif_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFFilterMintermFilter,
					"es::uah::aut::srg::tmtcif::generator::templates::filterSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(filterName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
		
		for (TMTCIFFilterMintermFilter TMTCIFFilterMintermFilter : filtersLevel2) {
			
			if(useTypeInsteadOfId)
				TMTCIFFilterMintermFilter.setName(YID_tm_type.get(TMTCIFFilterMintermFilter.getName())); 
			
			TMTCIFFilterMintermFilter.setName(TMTCIFFilterMintermFilter.getName() + "_filter_level_2");
			TMTCIFFilterMintermFilter.setUri("es.uah.aut.srg." + TMTCIFFilterMintermFilter.getName());
		
			String filterName = "filtersLevel2\\" + TMTCIFFilterMintermFilter.getName() + ".tmtcif_filter";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFFilterMintermFilter,
					"es::uah::aut::srg::tmtcif::generator::templates::filterSerializer::Serializer", 
					false, filterName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(filterName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
		
		for (TMTCIFImportImport TMTCIFImportImport : imports) {
		
			String importName = "imports\\" + TMTCIFImportImport.getName() + ".tmtcif_import";
			
			XpandGeneratorUtil.generate(folder.getLocation().toPortableString(), TMTCIFImportImport,
					"es::uah::aut::srg::tmtcif::generator::templates::importSerializer::Serializer", 
					false, importName);
			
			folder.getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());

			if(createXMI) {
			// If everything went fine, we should be able to open the new file
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			IResource newFile = ((IFolder)folder).findMember(importName);
			
			if (newFile == null) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Resource '" + newFile + "' not found!"));
			}
			
			Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(newFile.getFullPath().toString(), true), true);
				
			EObject model = xtextResource.getContents().get(0);
				
			XMLGeneratorUtil.convertReferences(model);

			EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
			String pathName = 
					newFile.getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
			final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
			xmiResource.getContents().add(outputModel);
			
			try {
				xmiResource.save(null);
			} catch (IOException e) {
				throw new CoreException(new Status(
						IStatus.ERROR, Activator.PLUGIN_ID, "Error when generating '" + newFile));
			}
			}
		}
	}
}