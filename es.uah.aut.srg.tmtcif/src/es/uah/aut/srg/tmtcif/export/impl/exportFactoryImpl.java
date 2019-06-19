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

import es.uah.aut.srg.tmtcif.export.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class exportFactoryImpl extends EFactoryImpl implements exportFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static exportFactory init() {
		try {
			exportFactory theexportFactory = (exportFactory)EPackage.Registry.INSTANCE.getEFactory(exportPackage.eNS_URI);
			if (theexportFactory != null) {
				return theexportFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new exportFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case exportPackage.TMTCIF_EXPORT_EXPORT: return createTMTCIFExportExport();
			case exportPackage.TMTCIF_EXPORT_SIZES: return createTMTCIFExportSizes();
			case exportPackage.TMTCIF_EXPORT_SIZE: return createTMTCIFExportSize();
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH: return createTMTCIFExportSizeFromFileLength();
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LINE: return createTMTCIFExportSizeFromFileLine();
			case exportPackage.TMTCIF_EXPORT_SIZE_IN_BITS: return createTMTCIFExportSizeInBits();
			case exportPackage.TMTCIF_EXPORT_SETTINGS: return createTMTCIFExportSettings();
			case exportPackage.TMTCIF_EXPORT_SETTING: return createTMTCIFExportSetting();
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_CONST: return createTMTCIFExportSettingFromConst();
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_SIZE: return createTMTCIFExportSettingFromSize();
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FILE: return createTMTCIFExportSettingFromFile();
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FIELD: return createTMTCIFExportSettingFromField();
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST: return createTMTCIFExportSettingAIFromConst();
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_FILE: return createTMTCIFExportSettingAIFromFile();
			case exportPackage.TMTCIF_EXPORT_ACTIVATE_DI_CS: return createTMTCIFExportActivateDICs();
			case exportPackage.TMTCIF_EXPORT_DIC: return createTMTCIFExportDIC();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case exportPackage.TMTCIF_EXPORT_UNIT:
				return createTMTCIFExportUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case exportPackage.TMTCIF_EXPORT_UNIT:
				return convertTMTCIFExportUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport createTMTCIFExportExport() {
		TMTCIFExportExportImpl tmtcifExportExport = new TMTCIFExportExportImpl();
		return tmtcifExportExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSizes createTMTCIFExportSizes() {
		TMTCIFExportSizesImpl tmtcifExportSizes = new TMTCIFExportSizesImpl();
		return tmtcifExportSizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSize createTMTCIFExportSize() {
		TMTCIFExportSizeImpl tmtcifExportSize = new TMTCIFExportSizeImpl();
		return tmtcifExportSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSizeFromFileLength createTMTCIFExportSizeFromFileLength() {
		TMTCIFExportSizeFromFileLengthImpl tmtcifExportSizeFromFileLength = new TMTCIFExportSizeFromFileLengthImpl();
		return tmtcifExportSizeFromFileLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSizeFromFileLine createTMTCIFExportSizeFromFileLine() {
		TMTCIFExportSizeFromFileLineImpl tmtcifExportSizeFromFileLine = new TMTCIFExportSizeFromFileLineImpl();
		return tmtcifExportSizeFromFileLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSizeInBits createTMTCIFExportSizeInBits() {
		TMTCIFExportSizeInBitsImpl tmtcifExportSizeInBits = new TMTCIFExportSizeInBitsImpl();
		return tmtcifExportSizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettings createTMTCIFExportSettings() {
		TMTCIFExportSettingsImpl tmtcifExportSettings = new TMTCIFExportSettingsImpl();
		return tmtcifExportSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSetting createTMTCIFExportSetting() {
		TMTCIFExportSettingImpl tmtcifExportSetting = new TMTCIFExportSettingImpl();
		return tmtcifExportSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingFromConst createTMTCIFExportSettingFromConst() {
		TMTCIFExportSettingFromConstImpl tmtcifExportSettingFromConst = new TMTCIFExportSettingFromConstImpl();
		return tmtcifExportSettingFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingFromSize createTMTCIFExportSettingFromSize() {
		TMTCIFExportSettingFromSizeImpl tmtcifExportSettingFromSize = new TMTCIFExportSettingFromSizeImpl();
		return tmtcifExportSettingFromSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingFromFile createTMTCIFExportSettingFromFile() {
		TMTCIFExportSettingFromFileImpl tmtcifExportSettingFromFile = new TMTCIFExportSettingFromFileImpl();
		return tmtcifExportSettingFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingFromField createTMTCIFExportSettingFromField() {
		TMTCIFExportSettingFromFieldImpl tmtcifExportSettingFromField = new TMTCIFExportSettingFromFieldImpl();
		return tmtcifExportSettingFromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingAIFromConst createTMTCIFExportSettingAIFromConst() {
		TMTCIFExportSettingAIFromConstImpl tmtcifExportSettingAIFromConst = new TMTCIFExportSettingAIFromConstImpl();
		return tmtcifExportSettingAIFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettingAIFromFile createTMTCIFExportSettingAIFromFile() {
		TMTCIFExportSettingAIFromFileImpl tmtcifExportSettingAIFromFile = new TMTCIFExportSettingAIFromFileImpl();
		return tmtcifExportSettingAIFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportActivateDICs createTMTCIFExportActivateDICs() {
		TMTCIFExportActivateDICsImpl tmtcifExportActivateDICs = new TMTCIFExportActivateDICsImpl();
		return tmtcifExportActivateDICs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportDIC createTMTCIFExportDIC() {
		TMTCIFExportDICImpl tmtcifExportDIC = new TMTCIFExportDICImpl();
		return tmtcifExportDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportUnit createTMTCIFExportUnitFromString(EDataType eDataType, String initialValue) {
		TMTCIFExportUnit result = TMTCIFExportUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFExportUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportPackage getexportPackage() {
		return (exportPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static exportPackage getPackage() {
		return exportPackage.eINSTANCE;
	}

} //exportFactoryImpl
