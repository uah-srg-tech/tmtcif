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
package es.uah.aut.srg.tmtcif.export;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.export.exportFactory
 * @model kind="package"
 * @generated
 */
public interface exportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "export";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/export";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmtcif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	exportPackage eINSTANCE = es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl <em>TMTCIF Export Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportExport()
	 * @generated
	 */
	int TMTCIF_EXPORT_EXPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__NAME = commonPackage.TMTCIF_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__URI = commonPackage.TMTCIF_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__VERSION = commonPackage.TMTCIF_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__DESCRIPTION = commonPackage.TMTCIF_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__FROM = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__TO = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__SIZES = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__SETTINGS = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activate DI Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT_FEATURE_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TMTCIF Export Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_EXPORT_OPERATION_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl <em>TMTCIF Export Sizes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizes()
	 * @generated
	 */
	int TMTCIF_EXPORT_SIZES = 1;

	/**
	 * The feature id for the '<em><b>Size From File Length</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Size From File Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE = 1;

	/**
	 * The feature id for the '<em><b>Size In Bits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZES__SIZE_IN_BITS = 2;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TMTCIF Export Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeImpl <em>TMTCIF Export Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSize()
	 * @generated
	 */
	int TMTCIF_EXPORT_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE__ID = 0;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE__ADD_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE__UNIT = 2;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TMTCIF Export Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLengthImpl <em>TMTCIF Export Size From File Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLengthImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeFromFileLength()
	 * @generated
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__ID = TMTCIF_EXPORT_SIZE__ID;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE = TMTCIF_EXPORT_SIZE__ADD_SIZE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT = TMTCIF_EXPORT_SIZE__UNIT;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Size From File Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH_FEATURE_COUNT = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Size From File Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH_OPERATION_COUNT = TMTCIF_EXPORT_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLineImpl <em>TMTCIF Export Size From File Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLineImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeFromFileLine()
	 * @generated
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__ID = TMTCIF_EXPORT_SIZE__ID;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE = TMTCIF_EXPORT_SIZE__ADD_SIZE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__UNIT = TMTCIF_EXPORT_SIZE__UNIT;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__LINE = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Size From File Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE_FEATURE_COUNT = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMTCIF Export Size From File Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_FROM_FILE_LINE_OPERATION_COUNT = TMTCIF_EXPORT_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeInBitsImpl <em>TMTCIF Export Size In Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeInBitsImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeInBits()
	 * @generated
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS__ID = TMTCIF_EXPORT_SIZE__ID;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS__ADD_SIZE = TMTCIF_EXPORT_SIZE__ADD_SIZE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS__UNIT = TMTCIF_EXPORT_SIZE__UNIT;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS__FROM = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Size In Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS_FEATURE_COUNT = TMTCIF_EXPORT_SIZE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Size In Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SIZE_IN_BITS_OPERATION_COUNT = TMTCIF_EXPORT_SIZE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingsImpl <em>TMTCIF Export Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingsImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettings()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTINGS = 6;

	/**
	 * The feature id for the '<em><b>Setting From Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_FROM_CONST = 0;

	/**
	 * The feature id for the '<em><b>Setting From Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_FROM_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Setting From File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FILE = 2;

	/**
	 * The feature id for the '<em><b>Setting From Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Setting AI From Const</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_CONST = 4;

	/**
	 * The feature id for the '<em><b>Setting AI From File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_FILE = 5;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TMTCIF Export Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingImpl <em>TMTCIF Export Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSetting()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING = 7;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING__TO_FIELD_REF = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromConstImpl <em>TMTCIF Export Setting From Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromConstImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromConst()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_FROM_CONST = 8;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_CONST__VALUE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_CONST_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_CONST_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromSizeImpl <em>TMTCIF Export Setting From Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromSizeImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromSize()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_FROM_SIZE = 9;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_SIZE__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>Size Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_SIZE__SIZE_REF = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting From Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_SIZE_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting From Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_SIZE_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFileImpl <em>TMTCIF Export Setting From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFileImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromFile()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE = 10;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE__FILE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE__OFFSET = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE__SIZE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE__LINE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FILE_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFieldImpl <em>TMTCIF Export Setting From Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFieldImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromField()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FIELD = 11;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FIELD__FIELD_REF = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting From Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FIELD_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting From Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_FROM_FIELD_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl <em>TMTCIF Export Setting AI From Const</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingAIFromConst()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST = 12;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Array Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting AI From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting AI From Const</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_CONST_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromFileImpl <em>TMTCIF Export Setting AI From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromFileImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE = 13;

	/**
	 * The feature id for the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__TO_FIELD_REF = TMTCIF_EXPORT_SETTING__TO_FIELD_REF;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__FILE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Array Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__OFFSET = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__SIZE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE__LINE = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Setting AI From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE_FEATURE_COUNT = TMTCIF_EXPORT_SETTING_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TMTCIF Export Setting AI From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_SETTING_AI_FROM_FILE_OPERATION_COUNT = TMTCIF_EXPORT_SETTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportActivateDICsImpl <em>TMTCIF Export Activate DI Cs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportActivateDICsImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportActivateDICs()
	 * @generated
	 */
	int TMTCIF_EXPORT_ACTIVATE_DI_CS = 14;

	/**
	 * The feature id for the '<em><b>DIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_ACTIVATE_DI_CS__DIC = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Export Activate DI Cs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_ACTIVATE_DI_CS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Export Activate DI Cs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_ACTIVATE_DI_CS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportDICImpl <em>TMTCIF Export DIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportDICImpl
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportDIC()
	 * @generated
	 */
	int TMTCIF_EXPORT_DIC = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_DIC__ID = 0;

	/**
	 * The feature id for the '<em><b>DIC Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_DIC__DIC_REF = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Export DIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_DIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Export DIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_EXPORT_DIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit <em>TMTCIF Export Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit
	 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportUnit()
	 * @generated
	 */
	int TMTCIF_EXPORT_UNIT = 16;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport <em>TMTCIF Export Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Export</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport
	 * @generated
	 */
	EClass getTMTCIFExportExport();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getFrom()
	 * @see #getTMTCIFExportExport()
	 * @generated
	 */
	EReference getTMTCIFExportExport_From();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getTo()
	 * @see #getTMTCIFExportExport()
	 * @generated
	 */
	EReference getTMTCIFExportExport_To();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSizes <em>Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sizes</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSizes()
	 * @see #getTMTCIFExportExport()
	 * @generated
	 */
	EReference getTMTCIFExportExport_Sizes();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSettings()
	 * @see #getTMTCIFExportExport()
	 * @generated
	 */
	EReference getTMTCIFExportExport_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getActivateDICs <em>Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activate DI Cs</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getActivateDICs()
	 * @see #getTMTCIFExportExport()
	 * @generated
	 */
	EReference getTMTCIFExportExport_ActivateDICs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes <em>TMTCIF Export Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Sizes</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes
	 * @generated
	 */
	EClass getTMTCIFExportSizes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLength <em>Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size From File Length</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLength()
	 * @see #getTMTCIFExportSizes()
	 * @generated
	 */
	EReference getTMTCIFExportSizes_SizeFromFileLength();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLine <em>Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size From File Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLine()
	 * @see #getTMTCIFExportSizes()
	 * @generated
	 */
	EReference getTMTCIFExportSizes_SizeFromFileLine();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeInBits <em>Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Size In Bits</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeInBits()
	 * @see #getTMTCIFExportSizes()
	 * @generated
	 */
	EReference getTMTCIFExportSizes_SizeInBits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSize <em>TMTCIF Export Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSize
	 * @generated
	 */
	EClass getTMTCIFExportSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getId()
	 * @see #getTMTCIFExportSize()
	 * @generated
	 */
	EAttribute getTMTCIFExportSize_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getAddSize()
	 * @see #getTMTCIFExportSize()
	 * @generated
	 */
	EAttribute getTMTCIFExportSize_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSize#getUnit()
	 * @see #getTMTCIFExportSize()
	 * @generated
	 */
	EAttribute getTMTCIFExportSize_Unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength <em>TMTCIF Export Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Size From File Length</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength
	 * @generated
	 */
	EClass getTMTCIFExportSizeFromFileLength();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength#getFromFile()
	 * @see #getTMTCIFExportSizeFromFileLength()
	 * @generated
	 */
	EAttribute getTMTCIFExportSizeFromFileLength_FromFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine <em>TMTCIF Export Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Size From File Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine
	 * @generated
	 */
	EClass getTMTCIFExportSizeFromFileLine();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine#getFromFile()
	 * @see #getTMTCIFExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getTMTCIFExportSizeFromFileLine_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine#getLine()
	 * @see #getTMTCIFExportSizeFromFileLine()
	 * @generated
	 */
	EAttribute getTMTCIFExportSizeFromFileLine_Line();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits <em>TMTCIF Export Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Size In Bits</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits
	 * @generated
	 */
	EClass getTMTCIFExportSizeInBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits#getFrom()
	 * @see #getTMTCIFExportSizeInBits()
	 * @generated
	 */
	EAttribute getTMTCIFExportSizeInBits_From();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings <em>TMTCIF Export Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Settings</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings
	 * @generated
	 */
	EClass getTMTCIFExportSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromConst <em>Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Const</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromConst()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingFromConst();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromSize <em>Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromSize()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingFromSize();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromFile <em>Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromFile()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingFromFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromField <em>Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting From Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromField()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingFromField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromConst <em>Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting AI From Const</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromConst()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingAIFromConst();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromFile <em>Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting AI From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromFile()
	 * @see #getTMTCIFExportSettings()
	 * @generated
	 */
	EReference getTMTCIFExportSettings_SettingAIFromFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting <em>TMTCIF Export Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting
	 * @generated
	 */
	EClass getTMTCIFExportSetting();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting#getToFieldRef <em>To Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting#getToFieldRef()
	 * @see #getTMTCIFExportSetting()
	 * @generated
	 */
	EReference getTMTCIFExportSetting_ToFieldRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst <em>TMTCIF Export Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting From Const</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst
	 * @generated
	 */
	EClass getTMTCIFExportSettingFromConst();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst#getValue()
	 * @see #getTMTCIFExportSettingFromConst()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromConst_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize <em>TMTCIF Export Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting From Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize
	 * @generated
	 */
	EClass getTMTCIFExportSettingFromSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize#getSizeRef <em>Size Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize#getSizeRef()
	 * @see #getTMTCIFExportSettingFromSize()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromSize_SizeRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile <em>TMTCIF Export Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile
	 * @generated
	 */
	EClass getTMTCIFExportSettingFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getFile()
	 * @see #getTMTCIFExportSettingFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromFile_File();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getOffset()
	 * @see #getTMTCIFExportSettingFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromFile_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getSize()
	 * @see #getTMTCIFExportSettingFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile#getLine()
	 * @see #getTMTCIFExportSettingFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingFromFile_Line();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField <em>TMTCIF Export Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting From Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField
	 * @generated
	 */
	EClass getTMTCIFExportSettingFromField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField#getFieldRef()
	 * @see #getTMTCIFExportSettingFromField()
	 * @generated
	 */
	EReference getTMTCIFExportSettingFromField_FieldRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst <em>TMTCIF Export Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting AI From Const</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst
	 * @generated
	 */
	EClass getTMTCIFExportSettingAIFromConst();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst#getValue()
	 * @see #getTMTCIFExportSettingAIFromConst()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromConst_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst#getToArrayIndex <em>To Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Array Index</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst#getToArrayIndex()
	 * @see #getTMTCIFExportSettingAIFromConst()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromConst_ToArrayIndex();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile <em>TMTCIF Export Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Setting AI From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile
	 * @generated
	 */
	EClass getTMTCIFExportSettingAIFromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getFile()
	 * @see #getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromFile_File();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getToArrayIndex <em>To Array Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Array Index</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getToArrayIndex()
	 * @see #getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromFile_ToArrayIndex();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getOffset()
	 * @see #getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromFile_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getSize()
	 * @see #getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile#getLine()
	 * @see #getTMTCIFExportSettingAIFromFile()
	 * @generated
	 */
	EAttribute getTMTCIFExportSettingAIFromFile_Line();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs <em>TMTCIF Export Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export Activate DI Cs</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs
	 * @generated
	 */
	EClass getTMTCIFExportActivateDICs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs#getDIC <em>DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DIC</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs#getDIC()
	 * @see #getTMTCIFExportActivateDICs()
	 * @generated
	 */
	EReference getTMTCIFExportActivateDICs_DIC();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC <em>TMTCIF Export DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Export DIC</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC
	 * @generated
	 */
	EClass getTMTCIFExportDIC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getId()
	 * @see #getTMTCIFExportDIC()
	 * @generated
	 */
	EAttribute getTMTCIFExportDIC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getDICRef <em>DIC Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DIC Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getDICRef()
	 * @see #getTMTCIFExportDIC()
	 * @generated
	 */
	EAttribute getTMTCIFExportDIC_DICRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit <em>TMTCIF Export Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Export Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit
	 * @generated
	 */
	EEnum getTMTCIFExportUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	exportFactory getexportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl <em>TMTCIF Export Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportExport()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_EXPORT = eINSTANCE.getTMTCIFExportExport();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_EXPORT__FROM = eINSTANCE.getTMTCIFExportExport_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_EXPORT__TO = eINSTANCE.getTMTCIFExportExport_To();

		/**
		 * The meta object literal for the '<em><b>Sizes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_EXPORT__SIZES = eINSTANCE.getTMTCIFExportExport_Sizes();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_EXPORT__SETTINGS = eINSTANCE.getTMTCIFExportExport_Settings();

		/**
		 * The meta object literal for the '<em><b>Activate DI Cs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS = eINSTANCE.getTMTCIFExportExport_ActivateDICs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl <em>TMTCIF Export Sizes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizes()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SIZES = eINSTANCE.getTMTCIFExportSizes();

		/**
		 * The meta object literal for the '<em><b>Size From File Length</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH = eINSTANCE.getTMTCIFExportSizes_SizeFromFileLength();

		/**
		 * The meta object literal for the '<em><b>Size From File Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE = eINSTANCE.getTMTCIFExportSizes_SizeFromFileLine();

		/**
		 * The meta object literal for the '<em><b>Size In Bits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SIZES__SIZE_IN_BITS = eINSTANCE.getTMTCIFExportSizes_SizeInBits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeImpl <em>TMTCIF Export Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSize()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SIZE = eINSTANCE.getTMTCIFExportSize();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE__ID = eINSTANCE.getTMTCIFExportSize_Id();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE__ADD_SIZE = eINSTANCE.getTMTCIFExportSize_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE__UNIT = eINSTANCE.getTMTCIFExportSize_Unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLengthImpl <em>TMTCIF Export Size From File Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLengthImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeFromFileLength()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH = eINSTANCE.getTMTCIFExportSizeFromFileLength();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE = eINSTANCE.getTMTCIFExportSizeFromFileLength_FromFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLineImpl <em>TMTCIF Export Size From File Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeFromFileLineImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeFromFileLine()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SIZE_FROM_FILE_LINE = eINSTANCE.getTMTCIFExportSizeFromFileLine();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE = eINSTANCE.getTMTCIFExportSizeFromFileLine_FromFile();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE_FROM_FILE_LINE__LINE = eINSTANCE.getTMTCIFExportSizeFromFileLine_Line();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeInBitsImpl <em>TMTCIF Export Size In Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizeInBitsImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSizeInBits()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SIZE_IN_BITS = eINSTANCE.getTMTCIFExportSizeInBits();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SIZE_IN_BITS__FROM = eINSTANCE.getTMTCIFExportSizeInBits_From();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingsImpl <em>TMTCIF Export Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingsImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettings()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTINGS = eINSTANCE.getTMTCIFExportSettings();

		/**
		 * The meta object literal for the '<em><b>Setting From Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_FROM_CONST = eINSTANCE.getTMTCIFExportSettings_SettingFromConst();

		/**
		 * The meta object literal for the '<em><b>Setting From Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_FROM_SIZE = eINSTANCE.getTMTCIFExportSettings_SettingFromSize();

		/**
		 * The meta object literal for the '<em><b>Setting From File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FILE = eINSTANCE.getTMTCIFExportSettings_SettingFromFile();

		/**
		 * The meta object literal for the '<em><b>Setting From Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_FROM_FIELD = eINSTANCE.getTMTCIFExportSettings_SettingFromField();

		/**
		 * The meta object literal for the '<em><b>Setting AI From Const</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_CONST = eINSTANCE.getTMTCIFExportSettings_SettingAIFromConst();

		/**
		 * The meta object literal for the '<em><b>Setting AI From File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTINGS__SETTING_AI_FROM_FILE = eINSTANCE.getTMTCIFExportSettings_SettingAIFromFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingImpl <em>TMTCIF Export Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSetting()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING = eINSTANCE.getTMTCIFExportSetting();

		/**
		 * The meta object literal for the '<em><b>To Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTING__TO_FIELD_REF = eINSTANCE.getTMTCIFExportSetting_ToFieldRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromConstImpl <em>TMTCIF Export Setting From Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromConstImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromConst()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_FROM_CONST = eINSTANCE.getTMTCIFExportSettingFromConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_CONST__VALUE = eINSTANCE.getTMTCIFExportSettingFromConst_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromSizeImpl <em>TMTCIF Export Setting From Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromSizeImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromSize()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_FROM_SIZE = eINSTANCE.getTMTCIFExportSettingFromSize();

		/**
		 * The meta object literal for the '<em><b>Size Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_SIZE__SIZE_REF = eINSTANCE.getTMTCIFExportSettingFromSize_SizeRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFileImpl <em>TMTCIF Export Setting From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFileImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromFile()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_FROM_FILE = eINSTANCE.getTMTCIFExportSettingFromFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_FILE__FILE = eINSTANCE.getTMTCIFExportSettingFromFile_File();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_FILE__OFFSET = eINSTANCE.getTMTCIFExportSettingFromFile_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_FILE__SIZE = eINSTANCE.getTMTCIFExportSettingFromFile_Size();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_FROM_FILE__LINE = eINSTANCE.getTMTCIFExportSettingFromFile_Line();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFieldImpl <em>TMTCIF Export Setting From Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingFromFieldImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingFromField()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_FROM_FIELD = eINSTANCE.getTMTCIFExportSettingFromField();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_SETTING_FROM_FIELD__FIELD_REF = eINSTANCE.getTMTCIFExportSettingFromField_FieldRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl <em>TMTCIF Export Setting AI From Const</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingAIFromConst()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_AI_FROM_CONST = eINSTANCE.getTMTCIFExportSettingAIFromConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE = eINSTANCE.getTMTCIFExportSettingAIFromConst_Value();

		/**
		 * The meta object literal for the '<em><b>To Array Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX = eINSTANCE.getTMTCIFExportSettingAIFromConst_ToArrayIndex();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromFileImpl <em>TMTCIF Export Setting AI From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromFileImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportSettingAIFromFile()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_SETTING_AI_FROM_FILE = eINSTANCE.getTMTCIFExportSettingAIFromFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_FILE__FILE = eINSTANCE.getTMTCIFExportSettingAIFromFile_File();

		/**
		 * The meta object literal for the '<em><b>To Array Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX = eINSTANCE.getTMTCIFExportSettingAIFromFile_ToArrayIndex();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_FILE__OFFSET = eINSTANCE.getTMTCIFExportSettingAIFromFile_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_FILE__SIZE = eINSTANCE.getTMTCIFExportSettingAIFromFile_Size();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_SETTING_AI_FROM_FILE__LINE = eINSTANCE.getTMTCIFExportSettingAIFromFile_Line();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportActivateDICsImpl <em>TMTCIF Export Activate DI Cs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportActivateDICsImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportActivateDICs()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_ACTIVATE_DI_CS = eINSTANCE.getTMTCIFExportActivateDICs();

		/**
		 * The meta object literal for the '<em><b>DIC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_EXPORT_ACTIVATE_DI_CS__DIC = eINSTANCE.getTMTCIFExportActivateDICs_DIC();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportDICImpl <em>TMTCIF Export DIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportDICImpl
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportDIC()
		 * @generated
		 */
		EClass TMTCIF_EXPORT_DIC = eINSTANCE.getTMTCIFExportDIC();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_DIC__ID = eINSTANCE.getTMTCIFExportDIC_Id();

		/**
		 * The meta object literal for the '<em><b>DIC Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_EXPORT_DIC__DIC_REF = eINSTANCE.getTMTCIFExportDIC_DICRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit <em>TMTCIF Export Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportUnit
		 * @see es.uah.aut.srg.tmtcif.export.impl.exportPackageImpl#getTMTCIFExportUnit()
		 * @generated
		 */
		EEnum TMTCIF_EXPORT_UNIT = eINSTANCE.getTMTCIFExportUnit();

	}

} //exportPackage
