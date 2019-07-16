/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.tmtcif.export.impl;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAI;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSize;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit;
import es.uah.aut.srg.tmtcif.export.exportFactory;
import es.uah.aut.srg.tmtcif.export.exportPackage;

import es.uah.aut.srg.tmtcif.format.formatPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class exportPackageImpl extends EPackageImpl implements exportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportExportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSizesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSizeFromFileLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSizeFromFileLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSizeInBitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingFromConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingFromSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingFromFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingAIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingAIFromConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportSettingAIFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportActivateDICsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifExportDICEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifExportUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private exportPackageImpl() {
		super(eNS_URI, exportFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link exportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static exportPackage init() {
		if (isInited) return (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);

		// Obtain or create and register package
		exportPackageImpl theexportPackage = (exportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof exportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new exportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theexportPackage.createPackageContents();

		// Initialize created meta-data
		theexportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theexportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(exportPackage.eNS_URI, theexportPackage);
		return theexportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportExport() {
		return tmtcifExportExportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportExport_From() {
		return (EReference)tmtcifExportExportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportExport_To() {
		return (EReference)tmtcifExportExportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportExport_Sizes() {
		return (EReference)tmtcifExportExportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportExport_Settings() {
		return (EReference)tmtcifExportExportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportExport_ActivateDICs() {
		return (EReference)tmtcifExportExportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSizes() {
		return tmtcifExportSizesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSizes_SizeFromFileLength() {
		return (EReference)tmtcifExportSizesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSizes_SizeFromFileLine() {
		return (EReference)tmtcifExportSizesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSizes_SizeInBits() {
		return (EReference)tmtcifExportSizesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSize() {
		return tmtcifExportSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSize_Id() {
		return (EAttribute)tmtcifExportSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSize_AddSize() {
		return (EAttribute)tmtcifExportSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSize_Unit() {
		return (EAttribute)tmtcifExportSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSizeFromFileLength() {
		return tmtcifExportSizeFromFileLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSizeFromFileLength_FromFile() {
		return (EAttribute)tmtcifExportSizeFromFileLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSizeFromFileLine() {
		return tmtcifExportSizeFromFileLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSizeFromFileLine_FromFile() {
		return (EAttribute)tmtcifExportSizeFromFileLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSizeFromFileLine_Line() {
		return (EAttribute)tmtcifExportSizeFromFileLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSizeInBits() {
		return tmtcifExportSizeInBitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSizeInBits_From() {
		return (EAttribute)tmtcifExportSizeInBitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettings() {
		return tmtcifExportSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingFromConst() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingFromSize() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingFromFile() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingFromField() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingAIFromConst() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettings_SettingAIFromFile() {
		return (EReference)tmtcifExportSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSetting() {
		return tmtcifExportSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSetting_ToFieldRef() {
		return (EReference)tmtcifExportSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingFromConst() {
		return tmtcifExportSettingFromConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromConst_Value() {
		return (EAttribute)tmtcifExportSettingFromConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingFromSize() {
		return tmtcifExportSettingFromSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromSize_SizeRef() {
		return (EAttribute)tmtcifExportSettingFromSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingFromFile() {
		return tmtcifExportSettingFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromFile_File() {
		return (EAttribute)tmtcifExportSettingFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromFile_Offset() {
		return (EAttribute)tmtcifExportSettingFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromFile_Size() {
		return (EAttribute)tmtcifExportSettingFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingFromFile_Line() {
		return (EAttribute)tmtcifExportSettingFromFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingFromField() {
		return tmtcifExportSettingFromFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettingFromField_FieldRef() {
		return (EReference)tmtcifExportSettingFromFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingAI() {
		return tmtcifExportSettingAIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportSettingAI_ToFieldRef() {
		return (EReference)tmtcifExportSettingAIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingAIFromConst() {
		return tmtcifExportSettingAIFromConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromConst_Value() {
		return (EAttribute)tmtcifExportSettingAIFromConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromConst_ToArrayIndex() {
		return (EAttribute)tmtcifExportSettingAIFromConstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportSettingAIFromFile() {
		return tmtcifExportSettingAIFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromFile_File() {
		return (EAttribute)tmtcifExportSettingAIFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromFile_ToArrayIndex() {
		return (EAttribute)tmtcifExportSettingAIFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromFile_Offset() {
		return (EAttribute)tmtcifExportSettingAIFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromFile_Size() {
		return (EAttribute)tmtcifExportSettingAIFromFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportSettingAIFromFile_Line() {
		return (EAttribute)tmtcifExportSettingAIFromFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportActivateDICs() {
		return tmtcifExportActivateDICsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFExportActivateDICs_DIC() {
		return (EReference)tmtcifExportActivateDICsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFExportDIC() {
		return tmtcifExportDICEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportDIC_Id() {
		return (EAttribute)tmtcifExportDICEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFExportDIC_DICRef() {
		return (EAttribute)tmtcifExportDICEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFExportUnit() {
		return tmtcifExportUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportFactory getexportFactory() {
		return (exportFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tmtcifExportExportEClass = createEClass(TMTCIF_EXPORT_EXPORT);
		createEReference(tmtcifExportExportEClass, TMTCIF_EXPORT_EXPORT__FROM);
		createEReference(tmtcifExportExportEClass, TMTCIF_EXPORT_EXPORT__TO);
		createEReference(tmtcifExportExportEClass, TMTCIF_EXPORT_EXPORT__SIZES);
		createEReference(tmtcifExportExportEClass, TMTCIF_EXPORT_EXPORT__SETTINGS);
		createEReference(tmtcifExportExportEClass, TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS);

		tmtcifExportSizesEClass = createEClass(TMTCIF_EXPORT_SIZES);
		createEReference(tmtcifExportSizesEClass, TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH);
		createEReference(tmtcifExportSizesEClass, TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE);
		createEReference(tmtcifExportSizesEClass, TMTCIF_EXPORT_SIZES__SIZE_IN_BITS);

		tmtcifExportSizeEClass = createEClass(TMTCIF_EXPORT_SIZE);
		createEAttribute(tmtcifExportSizeEClass, TMTCIF_EXPORT_SIZE__ID);
		createEAttribute(tmtcifExportSizeEClass, TMTCIF_EXPORT_SIZE__ADD_SIZE);
		createEAttribute(tmtcifExportSizeEClass, TMTCIF_EXPORT_SIZE__UNIT);

		tmtcifExportSizeFromFileLengthEClass = createEClass(TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH);
		createEAttribute(tmtcifExportSizeFromFileLengthEClass, TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE);

		tmtcifExportSizeFromFileLineEClass = createEClass(TMTCIF_EXPORT_SIZE_FROM_FILE_LINE);
		createEAttribute(tmtcifExportSizeFromFileLineEClass, TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE);
		createEAttribute(tmtcifExportSizeFromFileLineEClass, TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__LINE);

		tmtcifExportSizeInBitsEClass = createEClass(TMTCIF_EXPORT_SIZE_IN_BITS);
		createEAttribute(tmtcifExportSizeInBitsEClass, TMTCIF_EXPORT_SIZE_IN_BITS__FROM);

		tmtcifExportSettingsEClass = createEClass(TMTCIF_EXPORT_SETTINGS);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_FROM_CONST);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_FROM_SIZE);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FILE);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FIELD);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_CONST);
		createEReference(tmtcifExportSettingsEClass, TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_FILE);

		tmtcifExportSettingEClass = createEClass(TMTCIF_EXPORT_SETTING);
		createEReference(tmtcifExportSettingEClass, TMTCIF_EXPORT_SETTING__TO_FIELD_REF);

		tmtcifExportSettingFromConstEClass = createEClass(TMTCIF_EXPORT_SETTING_FROM_CONST);
		createEAttribute(tmtcifExportSettingFromConstEClass, TMTCIF_EXPORT_SETTING_FROM_CONST__VALUE);

		tmtcifExportSettingFromSizeEClass = createEClass(TMTCIF_EXPORT_SETTING_FROM_SIZE);
		createEAttribute(tmtcifExportSettingFromSizeEClass, TMTCIF_EXPORT_SETTING_FROM_SIZE__SIZE_REF);

		tmtcifExportSettingFromFileEClass = createEClass(TMTCIF_EXPORT_SETTING_FROM_FILE);
		createEAttribute(tmtcifExportSettingFromFileEClass, TMTCIF_EXPORT_SETTING_FROM_FILE__FILE);
		createEAttribute(tmtcifExportSettingFromFileEClass, TMTCIF_EXPORT_SETTING_FROM_FILE__OFFSET);
		createEAttribute(tmtcifExportSettingFromFileEClass, TMTCIF_EXPORT_SETTING_FROM_FILE__SIZE);
		createEAttribute(tmtcifExportSettingFromFileEClass, TMTCIF_EXPORT_SETTING_FROM_FILE__LINE);

		tmtcifExportSettingFromFieldEClass = createEClass(TMTCIF_EXPORT_SETTING_FROM_FIELD);
		createEReference(tmtcifExportSettingFromFieldEClass, TMTCIF_EXPORT_SETTING_FROM_FIELD__FIELD_REF);

		tmtcifExportSettingAIEClass = createEClass(TMTCIF_EXPORT_SETTING_AI);
		createEReference(tmtcifExportSettingAIEClass, TMTCIF_EXPORT_SETTING_AI__TO_FIELD_REF);

		tmtcifExportSettingAIFromConstEClass = createEClass(TMTCIF_EXPORT_SETTING_AI_FROM_CONST);
		createEAttribute(tmtcifExportSettingAIFromConstEClass, TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE);
		createEAttribute(tmtcifExportSettingAIFromConstEClass, TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX);

		tmtcifExportSettingAIFromFileEClass = createEClass(TMTCIF_EXPORT_SETTING_AI_FROM_FILE);
		createEAttribute(tmtcifExportSettingAIFromFileEClass, TMTCIF_EXPORT_SETTING_AI_FROM_FILE__FILE);
		createEAttribute(tmtcifExportSettingAIFromFileEClass, TMTCIF_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX);
		createEAttribute(tmtcifExportSettingAIFromFileEClass, TMTCIF_EXPORT_SETTING_AI_FROM_FILE__OFFSET);
		createEAttribute(tmtcifExportSettingAIFromFileEClass, TMTCIF_EXPORT_SETTING_AI_FROM_FILE__SIZE);
		createEAttribute(tmtcifExportSettingAIFromFileEClass, TMTCIF_EXPORT_SETTING_AI_FROM_FILE__LINE);

		tmtcifExportActivateDICsEClass = createEClass(TMTCIF_EXPORT_ACTIVATE_DI_CS);
		createEReference(tmtcifExportActivateDICsEClass, TMTCIF_EXPORT_ACTIVATE_DI_CS__DIC);

		tmtcifExportDICEClass = createEClass(TMTCIF_EXPORT_DIC);
		createEAttribute(tmtcifExportDICEClass, TMTCIF_EXPORT_DIC__ID);
		createEAttribute(tmtcifExportDICEClass, TMTCIF_EXPORT_DIC__DIC_REF);

		// Create enums
		tmtcifExportUnitEEnum = createEEnum(TMTCIF_EXPORT_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tmtcifExportExportEClass.getESuperTypes().add(thecommonPackage.getTMTCIFModelElement());
		tmtcifExportSizeFromFileLengthEClass.getESuperTypes().add(this.getTMTCIFExportSize());
		tmtcifExportSizeFromFileLineEClass.getESuperTypes().add(this.getTMTCIFExportSize());
		tmtcifExportSizeInBitsEClass.getESuperTypes().add(this.getTMTCIFExportSize());
		tmtcifExportSettingFromConstEClass.getESuperTypes().add(this.getTMTCIFExportSetting());
		tmtcifExportSettingFromSizeEClass.getESuperTypes().add(this.getTMTCIFExportSetting());
		tmtcifExportSettingFromFileEClass.getESuperTypes().add(this.getTMTCIFExportSetting());
		tmtcifExportSettingFromFieldEClass.getESuperTypes().add(this.getTMTCIFExportSetting());
		tmtcifExportSettingAIFromConstEClass.getESuperTypes().add(this.getTMTCIFExportSettingAI());
		tmtcifExportSettingAIFromFileEClass.getESuperTypes().add(this.getTMTCIFExportSettingAI());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifExportExportEClass, TMTCIFExportExport.class, "TMTCIFExportExport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportExport_From(), theformatPackage.getTMTCIFFormatFormat(), null, "from", null, 0, 1, TMTCIFExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportExport_To(), theformatPackage.getTMTCIFFormatFormat(), null, "to", null, 1, 1, TMTCIFExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportExport_Sizes(), this.getTMTCIFExportSizes(), null, "Sizes", null, 0, 1, TMTCIFExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportExport_Settings(), this.getTMTCIFExportSettings(), null, "settings", null, 1, 1, TMTCIFExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportExport_ActivateDICs(), this.getTMTCIFExportActivateDICs(), null, "activateDICs", null, 0, 1, TMTCIFExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSizesEClass, TMTCIFExportSizes.class, "TMTCIFExportSizes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportSizes_SizeFromFileLength(), this.getTMTCIFExportSizeFromFileLength(), null, "sizeFromFileLength", null, 0, -1, TMTCIFExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSizes_SizeFromFileLine(), this.getTMTCIFExportSizeFromFileLine(), null, "sizeFromFileLine", null, 0, -1, TMTCIFExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSizes_SizeInBits(), this.getTMTCIFExportSizeInBits(), null, "sizeInBits", null, 0, -1, TMTCIFExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSizeEClass, TMTCIFExportSize.class, "TMTCIFExportSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSize_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFExportSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSize_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, TMTCIFExportSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSize_Unit(), this.getTMTCIFExportUnit(), "unit", null, 0, 1, TMTCIFExportSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSizeFromFileLengthEClass, TMTCIFExportSizeFromFileLength.class, "TMTCIFExportSizeFromFileLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSizeFromFileLength_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, TMTCIFExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSizeFromFileLineEClass, TMTCIFExportSizeFromFileLine.class, "TMTCIFExportSizeFromFileLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSizeFromFileLine_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, TMTCIFExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSizeFromFileLine_Line(), ecorePackage.getEString(), "line", null, 1, 1, TMTCIFExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSizeInBitsEClass, TMTCIFExportSizeInBits.class, "TMTCIFExportSizeInBits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSizeInBits_From(), ecorePackage.getEString(), "from", null, 1, 1, TMTCIFExportSizeInBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingsEClass, TMTCIFExportSettings.class, "TMTCIFExportSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportSettings_SettingFromConst(), this.getTMTCIFExportSettingFromConst(), null, "settingFromConst", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSettings_SettingFromSize(), this.getTMTCIFExportSettingFromSize(), null, "settingFromSize", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSettings_SettingFromFile(), this.getTMTCIFExportSettingFromFile(), null, "settingFromFile", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSettings_SettingFromField(), this.getTMTCIFExportSettingFromField(), null, "settingFromField", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSettings_SettingAIFromConst(), this.getTMTCIFExportSettingAIFromConst(), null, "settingAIFromConst", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFExportSettings_SettingAIFromFile(), this.getTMTCIFExportSettingAIFromFile(), null, "settingAIFromFile", null, 0, -1, TMTCIFExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingEClass, TMTCIFExportSetting.class, "TMTCIFExportSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportSetting_ToFieldRef(), theformatPackage.getTMTCIFFormatField(), null, "toFieldRef", null, 1, 1, TMTCIFExportSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingFromConstEClass, TMTCIFExportSettingFromConst.class, "TMTCIFExportSettingFromConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSettingFromConst_Value(), ecorePackage.getEString(), "value", null, 1, 1, TMTCIFExportSettingFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingFromSizeEClass, TMTCIFExportSettingFromSize.class, "TMTCIFExportSettingFromSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSettingFromSize_SizeRef(), ecorePackage.getEString(), "sizeRef", null, 1, 1, TMTCIFExportSettingFromSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingFromFileEClass, TMTCIFExportSettingFromFile.class, "TMTCIFExportSettingFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSettingFromFile_File(), ecorePackage.getEString(), "file", null, 1, 1, TMTCIFExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingFromFile_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, TMTCIFExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingFromFile_Size(), ecorePackage.getEString(), "size", null, 0, 1, TMTCIFExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingFromFile_Line(), ecorePackage.getEString(), "line", null, 0, 1, TMTCIFExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingFromFieldEClass, TMTCIFExportSettingFromField.class, "TMTCIFExportSettingFromField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportSettingFromField_FieldRef(), theformatPackage.getTMTCIFFormatField(), null, "fieldRef", null, 1, 1, TMTCIFExportSettingFromField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingAIEClass, TMTCIFExportSettingAI.class, "TMTCIFExportSettingAI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportSettingAI_ToFieldRef(), theformatPackage.getTMTCIFFormatAIField(), null, "toFieldRef", null, 1, 1, TMTCIFExportSettingAI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingAIFromConstEClass, TMTCIFExportSettingAIFromConst.class, "TMTCIFExportSettingAIFromConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSettingAIFromConst_Value(), ecorePackage.getEString(), "value", null, 1, 1, TMTCIFExportSettingAIFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingAIFromConst_ToArrayIndex(), ecorePackage.getEString(), "toArrayIndex", null, 1, 1, TMTCIFExportSettingAIFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportSettingAIFromFileEClass, TMTCIFExportSettingAIFromFile.class, "TMTCIFExportSettingAIFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportSettingAIFromFile_File(), ecorePackage.getEString(), "file", null, 1, 1, TMTCIFExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingAIFromFile_ToArrayIndex(), ecorePackage.getEString(), "toArrayIndex", null, 1, 1, TMTCIFExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingAIFromFile_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, TMTCIFExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingAIFromFile_Size(), ecorePackage.getEString(), "size", null, 0, 1, TMTCIFExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportSettingAIFromFile_Line(), ecorePackage.getEString(), "line", null, 0, 1, TMTCIFExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportActivateDICsEClass, TMTCIFExportActivateDICs.class, "TMTCIFExportActivateDICs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFExportActivateDICs_DIC(), this.getTMTCIFExportDIC(), null, "DIC", null, 1, 10, TMTCIFExportActivateDICs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifExportDICEClass, TMTCIFExportDIC.class, "TMTCIFExportDIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFExportDIC_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFExportDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFExportDIC_DICRef(), ecorePackage.getEString(), "DICRef", null, 1, 1, TMTCIFExportDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tmtcifExportUnitEEnum, TMTCIFExportUnit.class, "TMTCIFExportUnit");
		addEEnumLiteral(tmtcifExportUnitEEnum, TMTCIFExportUnit.BITS);
		addEEnumLiteral(tmtcifExportUnitEEnum, TMTCIFExportUnit.BYTES);

		// Create resource
		createResource(eNS_URI);
	}

} //exportPackageImpl
