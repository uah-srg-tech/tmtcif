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
package es.uah.aut.srg.tmtcif.format;

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
 * @see es.uah.aut.srg.tmtcif.format.formatFactory
 * @model kind="package"
 * @generated
 */
public interface formatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "format";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/format";

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
	formatPackage eINSTANCE = es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl <em>TMTCIF Format Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormat()
	 * @generated
	 */
	int TMTCIF_FORMAT_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__NAME = commonPackage.TMTCIF_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__URI = commonPackage.TMTCIF_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__VERSION = commonPackage.TMTCIF_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__DESCRIPTION = commonPackage.TMTCIF_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__PROTOCOL = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__TYPE = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CS Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__CS_FIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CS Formula Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>VS Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__VS_FIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>FDIC Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__FDIC_FIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VR Field Size</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>AField</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__AFIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>AI Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT__AI_FIELD = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT_FEATURE_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TMTCIF Format Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMAT_OPERATION_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldImpl <em>TMTCIF Format Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatField()
	 * @generated
	 */
	int TMTCIF_FORMAT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD__NAME = commonPackage.TMTCIF_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD__DESCRIPTION = commonPackage.TMTCIF_MODEL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD__FID = commonPackage.TMTCIF_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD__PFID = commonPackage.TMTCIF_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD_FEATURE_COUNT = commonPackage.TMTCIF_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMTCIF Format Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD_OPERATION_COUNT = commonPackage.TMTCIF_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFieldImpl <em>TMTCIF Format CS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCSField()
	 * @generated
	 */
	int TMTCIF_FORMAT_CS_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__TYPE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__BYTE_ORDER = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__FIRST_BIT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD__GLOBAL_OFFSET = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TMTCIF Format CS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FIELD_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFormulaFieldImpl <em>TMTCIF Format CS Formula Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFormulaFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCSFormulaField()
	 * @generated
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__NAME = TMTCIF_FORMAT_CS_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__DESCRIPTION = TMTCIF_FORMAT_CS_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__FID = TMTCIF_FORMAT_CS_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__PFID = TMTCIF_FORMAT_CS_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__TYPE = TMTCIF_FORMAT_CS_FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__BYTE_ORDER = TMTCIF_FORMAT_CS_FIELD__BYTE_ORDER;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__FIRST_BIT = TMTCIF_FORMAT_CS_FIELD__FIRST_BIT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__SIZE = TMTCIF_FORMAT_CS_FIELD__SIZE;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__GLOBAL_OFFSET = TMTCIF_FORMAT_CS_FIELD__GLOBAL_OFFSET;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD__FORMULA = TMTCIF_FORMAT_CS_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD_FEATURE_COUNT = TMTCIF_FORMAT_CS_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Format CS Formula Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_CS_FORMULA_FIELD_OPERATION_COUNT = TMTCIF_FORMAT_CS_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl <em>TMTCIF Format VS Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVSField()
	 * @generated
	 */
	int TMTCIF_FORMAT_VS_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__TYPE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__FIRST_BIT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__CONST_SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variable Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__MAX_SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TMTCIF Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TMTCIF Format VS Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VS_FIELD_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVRFieldSizeImpl <em>TMTCIF Format VR Field Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVRFieldSizeImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVRFieldSize()
	 * @generated
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The number of structural features of the '<em>TMTCIF Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TMTCIF Format VR Field Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VR_FIELD_SIZE_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl <em>TMTCIF Format FDIC Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFDICField()
	 * @generated
	 */
	int TMTCIF_FORMAT_FDIC_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Check Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Floating Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sorted Fields To Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMTCIF Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TMTCIF Format FDIC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FDIC_FIELD_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAFieldImpl <em>TMTCIF Format AField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatAField()
	 * @generated
	 */
	int TMTCIF_FORMAT_AFIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__TYPE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__BYTE_ORDER = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__FIRST_BIT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__ARRAY_DIMENSION = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD__GLOBAL_OFFSET = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMTCIF Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TMTCIF Format AField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AFIELD_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl <em>TMTCIF Format AI Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatAIField()
	 * @generated
	 */
	int TMTCIF_FORMAT_AI_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__NAME = TMTCIF_FORMAT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__DESCRIPTION = TMTCIF_FORMAT_FIELD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__FID = TMTCIF_FORMAT_FIELD__FID;

	/**
	 * The feature id for the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__PFID = TMTCIF_FORMAT_FIELD__PFID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__TYPE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Byte Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__FIRST_BIT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Array Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__ARRAY_REF = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__SIZE = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TMTCIF Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD_FEATURE_COUNT = TMTCIF_FORMAT_FIELD_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TMTCIF Format AI Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_AI_FIELD_OPERATION_COUNT = TMTCIF_FORMAT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatBytesBitsImpl <em>TMTCIF Format Bytes Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatBytesBitsImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatBytesBits()
	 * @generated
	 */
	int TMTCIF_FORMAT_BYTES_BITS = 9;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_BYTES_BITS__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_BYTES_BITS__BITS = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Bytes Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_BYTES_BITS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Format Bytes Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_BYTES_BITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormulaImpl <em>TMTCIF Format Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormulaImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormula()
	 * @generated
	 */
	int TMTCIF_FORMAT_FORMULA = 10;

	/**
	 * The feature id for the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMULA__SLOPE = 0;

	/**
	 * The feature id for the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMULA__INTERCEPT = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Format Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl <em>TMTCIF Format Variable Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVariableSize()
	 * @generated
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE = 11;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE__POWER = 2;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TMTCIF Format Variable Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_VARIABLE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFloatingOffsetImpl <em>TMTCIF Format Floating Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFloatingOffsetImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFloatingOffset()
	 * @generated
	 */
	int TMTCIF_FORMAT_FLOATING_OFFSET = 12;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FLOATING_OFFSET__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FLOATING_OFFSET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Format Floating Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FLOATING_OFFSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatSortedFieldsToCheckImpl <em>TMTCIF Format Sorted Fields To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatSortedFieldsToCheckImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatSortedFieldsToCheck()
	 * @generated
	 */
	int TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK = 13;

	/**
	 * The feature id for the '<em><b>Field To Check</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Format Sorted Fields To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldToCheckImpl <em>TMTCIF Format Field To Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldToCheckImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldToCheck()
	 * @generated
	 */
	int TMTCIF_FORMAT_FIELD_TO_CHECK = 14;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD_TO_CHECK__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD_TO_CHECK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Format Field To Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_FIELD_TO_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayDimensionImpl <em>TMTCIF Format Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayDimensionImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatArrayDimension()
	 * @generated
	 */
	int TMTCIF_FORMAT_ARRAY_DIMENSION = 15;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_DIMENSION__FID_REF = 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_DIMENSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Format Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayRefImpl <em>TMTCIF Format Array Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayRefImpl
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatArrayRef()
	 * @generated
	 */
	int TMTCIF_FORMAT_ARRAY_REF = 16;

	/**
	 * The feature id for the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_REF__FID_REF = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Format Array Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FORMAT_ARRAY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType <em>TMTCIF Format Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormatType()
	 * @generated
	 */
	int TMTCIF_FORMAT_FORMAT_TYPE = 17;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType <em>TMTCIF Format Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldType()
	 * @generated
	 */
	int TMTCIF_FORMAT_FIELD_TYPE = 18;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder <em>TMTCIF Format Field Byte Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldByteOrder()
	 * @generated
	 */
	int TMTCIF_FORMAT_FIELD_BYTE_ORDER = 19;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit <em>TMTCIF Format SField First Bit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatSFieldFirstBit()
	 * @generated
	 */
	int TMTCIF_FORMAT_SFIELD_FIRST_BIT = 20;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType <em>TMTCIF Format Check Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCheckType()
	 * @generated
	 */
	int TMTCIF_FORMAT_CHECK_TYPE = 21;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit <em>TMTCIF Format Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatUnit()
	 * @generated
	 */
	int TMTCIF_FORMAT_UNIT = 22;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower <em>TMTCIF Format Power</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower
	 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatPower()
	 * @generated
	 */
	int TMTCIF_FORMAT_POWER = 23;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat <em>TMTCIF Format Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Format</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat
	 * @generated
	 */
	EClass getTMTCIFFormatFormat();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getProtocol()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFormat_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFormat_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSField <em>CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CS Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_CSField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSFormulaField <em>CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CS Formula Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSFormulaField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_CSFormulaField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVSField <em>VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VS Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVSField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_VSField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getFDICField <em>FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FDIC Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getFDICField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_FDICField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVRFieldSize <em>VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VR Field Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVRFieldSize()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_VRFieldSize();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAField <em>AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AField</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_AField();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAIField <em>AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AI Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAIField()
	 * @see #getTMTCIFFormatFormat()
	 * @generated
	 */
	EReference getTMTCIFFormatFormat_AIField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatField <em>TMTCIF Format Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatField
	 * @generated
	 */
	EClass getTMTCIFFormatField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatField#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatField#getFid()
	 * @see #getTMTCIFFormatField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatField_Fid();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatField#getPfid <em>Pfid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pfid</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatField#getPfid()
	 * @see #getTMTCIFFormatField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatField_Pfid();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField <em>TMTCIF Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format CS Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField
	 * @generated
	 */
	EClass getTMTCIFFormatCSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getType()
	 * @see #getTMTCIFFormatCSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatCSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getByteOrder()
	 * @see #getTMTCIFFormatCSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatCSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getFirstBit()
	 * @see #getTMTCIFFormatCSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatCSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getSize()
	 * @see #getTMTCIFFormatCSField()
	 * @generated
	 */
	EReference getTMTCIFFormatCSField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField#getGlobalOffset()
	 * @see #getTMTCIFFormatCSField()
	 * @generated
	 */
	EReference getTMTCIFFormatCSField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField <em>TMTCIF Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format CS Formula Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField
	 * @generated
	 */
	EClass getTMTCIFFormatCSFormulaField();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField#getFormula()
	 * @see #getTMTCIFFormatCSFormulaField()
	 * @generated
	 */
	EReference getTMTCIFFormatCSFormulaField_Formula();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField <em>TMTCIF Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format VS Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField
	 * @generated
	 */
	EClass getTMTCIFFormatVSField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getType()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVSField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getByteOrder()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVSField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getFirstBit()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVSField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getConstSize <em>Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getConstSize()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EReference getTMTCIFFormatVSField_ConstSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getVariableSize <em>Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getVariableSize()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EReference getTMTCIFFormatVSField_VariableSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getMaxSize()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EReference getTMTCIFFormatVSField_MaxSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField#getGlobalOffset()
	 * @see #getTMTCIFFormatVSField()
	 * @generated
	 */
	EReference getTMTCIFFormatVSField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize <em>TMTCIF Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format VR Field Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize
	 * @generated
	 */
	EClass getTMTCIFFormatVRFieldSize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField <em>TMTCIF Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format FDIC Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField
	 * @generated
	 */
	EClass getTMTCIFFormatFDICField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType <em>Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFDICField_CheckType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFDICField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFDICField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSize()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EReference getTMTCIFFormatFDICField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFloatingOffset <em>Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floating Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFloatingOffset()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EReference getTMTCIFFormatFDICField_FloatingOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSortedFieldsToCheck()
	 * @see #getTMTCIFFormatFDICField()
	 * @generated
	 */
	EReference getTMTCIFFormatFDICField_SortedFieldsToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField <em>TMTCIF Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format AField</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField
	 * @generated
	 */
	EClass getTMTCIFFormatAField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getType()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getByteOrder()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getFirstBit()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Dimension</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getArrayDimension()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EReference getTMTCIFFormatAField_ArrayDimension();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getSize()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EReference getTMTCIFFormatAField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getGlobalOffset <em>Global Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField#getGlobalOffset()
	 * @see #getTMTCIFFormatAField()
	 * @generated
	 */
	EReference getTMTCIFFormatAField_GlobalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField <em>TMTCIF Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format AI Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField
	 * @generated
	 */
	EClass getTMTCIFFormatAIField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAIField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder <em>Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAIField_ByteOrder();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit <em>First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EAttribute getTMTCIFFormatAIField_FirstBit();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getArrayRef <em>Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getArrayRef()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EReference getTMTCIFFormatAIField_ArrayRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getSize()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EReference getTMTCIFFormatAIField_Size();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getLocalOffset <em>Local Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getLocalOffset()
	 * @see #getTMTCIFFormatAIField()
	 * @generated
	 */
	EReference getTMTCIFFormatAIField_LocalOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits <em>TMTCIF Format Bytes Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Bytes Bits</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits
	 * @generated
	 */
	EClass getTMTCIFFormatBytesBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits#getBytes()
	 * @see #getTMTCIFFormatBytesBits()
	 * @generated
	 */
	EAttribute getTMTCIFFormatBytesBits_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits#getBits()
	 * @see #getTMTCIFFormatBytesBits()
	 * @generated
	 */
	EAttribute getTMTCIFFormatBytesBits_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula <em>TMTCIF Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Formula</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula
	 * @generated
	 */
	EClass getTMTCIFFormatFormula();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula#getSlope <em>Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula#getSlope()
	 * @see #getTMTCIFFormatFormula()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFormula_Slope();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula#getIntercept <em>Intercept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intercept</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula#getIntercept()
	 * @see #getTMTCIFFormatFormula()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFormula_Intercept();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize <em>TMTCIF Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Variable Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize
	 * @generated
	 */
	EClass getTMTCIFFormatVariableSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getFidRef()
	 * @see #getTMTCIFFormatVariableSize()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVariableSize_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit()
	 * @see #getTMTCIFFormatVariableSize()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVariableSize_Unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower()
	 * @see #getTMTCIFFormatVariableSize()
	 * @generated
	 */
	EAttribute getTMTCIFFormatVariableSize_Power();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset <em>TMTCIF Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Floating Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset
	 * @generated
	 */
	EClass getTMTCIFFormatFloatingOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset#getFidRef()
	 * @see #getTMTCIFFormatFloatingOffset()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFloatingOffset_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck <em>TMTCIF Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Sorted Fields To Check</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck
	 * @generated
	 */
	EClass getTMTCIFFormatSortedFieldsToCheck();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field To Check</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck#getFieldToCheck()
	 * @see #getTMTCIFFormatSortedFieldsToCheck()
	 * @generated
	 */
	EReference getTMTCIFFormatSortedFieldsToCheck_FieldToCheck();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck <em>TMTCIF Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Field To Check</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck
	 * @generated
	 */
	EClass getTMTCIFFormatFieldToCheck();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck#getFidRef()
	 * @see #getTMTCIFFormatFieldToCheck()
	 * @generated
	 */
	EAttribute getTMTCIFFormatFieldToCheck_FidRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension <em>TMTCIF Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Array Dimension</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension
	 * @generated
	 */
	EClass getTMTCIFFormatArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension#getFidRef()
	 * @see #getTMTCIFFormatArrayDimension()
	 * @generated
	 */
	EAttribute getTMTCIFFormatArrayDimension_FidRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension#getMaxItems()
	 * @see #getTMTCIFFormatArrayDimension()
	 * @generated
	 */
	EAttribute getTMTCIFFormatArrayDimension_MaxItems();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef <em>TMTCIF Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Format Array Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef
	 * @generated
	 */
	EClass getTMTCIFFormatArrayRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef#getFidRef <em>Fid Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef#getFidRef()
	 * @see #getTMTCIFFormatArrayRef()
	 * @generated
	 */
	EAttribute getTMTCIFFormatArrayRef_FidRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType <em>TMTCIF Format Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Format Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType
	 * @generated
	 */
	EEnum getTMTCIFFormatFormatType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType <em>TMTCIF Format Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Field Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType
	 * @generated
	 */
	EEnum getTMTCIFFormatFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder <em>TMTCIF Format Field Byte Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Field Byte Order</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder
	 * @generated
	 */
	EEnum getTMTCIFFormatFieldByteOrder();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit <em>TMTCIF Format SField First Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format SField First Bit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit
	 * @generated
	 */
	EEnum getTMTCIFFormatSFieldFirstBit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType <em>TMTCIF Format Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Check Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType
	 * @generated
	 */
	EEnum getTMTCIFFormatCheckType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit <em>TMTCIF Format Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit
	 * @generated
	 */
	EEnum getTMTCIFFormatUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower <em>TMTCIF Format Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Format Power</em>'.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower
	 * @generated
	 */
	EEnum getTMTCIFFormatPower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	formatFactory getformatFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl <em>TMTCIF Format Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormat()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FORMAT = eINSTANCE.getTMTCIFFormatFormat();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FORMAT__PROTOCOL = eINSTANCE.getTMTCIFFormatFormat_Protocol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FORMAT__TYPE = eINSTANCE.getTMTCIFFormatFormat_Type();

		/**
		 * The meta object literal for the '<em><b>CS Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__CS_FIELD = eINSTANCE.getTMTCIFFormatFormat_CSField();

		/**
		 * The meta object literal for the '<em><b>CS Formula Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD = eINSTANCE.getTMTCIFFormatFormat_CSFormulaField();

		/**
		 * The meta object literal for the '<em><b>VS Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__VS_FIELD = eINSTANCE.getTMTCIFFormatFormat_VSField();

		/**
		 * The meta object literal for the '<em><b>FDIC Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__FDIC_FIELD = eINSTANCE.getTMTCIFFormatFormat_FDICField();

		/**
		 * The meta object literal for the '<em><b>VR Field Size</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE = eINSTANCE.getTMTCIFFormatFormat_VRFieldSize();

		/**
		 * The meta object literal for the '<em><b>AField</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__AFIELD = eINSTANCE.getTMTCIFFormatFormat_AField();

		/**
		 * The meta object literal for the '<em><b>AI Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FORMAT__AI_FIELD = eINSTANCE.getTMTCIFFormatFormat_AIField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldImpl <em>TMTCIF Format Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FIELD = eINSTANCE.getTMTCIFFormatField();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FIELD__FID = eINSTANCE.getTMTCIFFormatField_Fid();

		/**
		 * The meta object literal for the '<em><b>Pfid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FIELD__PFID = eINSTANCE.getTMTCIFFormatField_Pfid();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFieldImpl <em>TMTCIF Format CS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCSField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_CS_FIELD = eINSTANCE.getTMTCIFFormatCSField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_CS_FIELD__TYPE = eINSTANCE.getTMTCIFFormatCSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_CS_FIELD__BYTE_ORDER = eINSTANCE.getTMTCIFFormatCSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_CS_FIELD__FIRST_BIT = eINSTANCE.getTMTCIFFormatCSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_CS_FIELD__SIZE = eINSTANCE.getTMTCIFFormatCSField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_CS_FIELD__GLOBAL_OFFSET = eINSTANCE.getTMTCIFFormatCSField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFormulaFieldImpl <em>TMTCIF Format CS Formula Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatCSFormulaFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCSFormulaField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_CS_FORMULA_FIELD = eINSTANCE.getTMTCIFFormatCSFormulaField();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_CS_FORMULA_FIELD__FORMULA = eINSTANCE.getTMTCIFFormatCSFormulaField_Formula();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl <em>TMTCIF Format VS Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVSField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_VS_FIELD = eINSTANCE.getTMTCIFFormatVSField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VS_FIELD__TYPE = eINSTANCE.getTMTCIFFormatVSField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER = eINSTANCE.getTMTCIFFormatVSField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VS_FIELD__FIRST_BIT = eINSTANCE.getTMTCIFFormatVSField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Const Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_VS_FIELD__CONST_SIZE = eINSTANCE.getTMTCIFFormatVSField_ConstSize();

		/**
		 * The meta object literal for the '<em><b>Variable Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE = eINSTANCE.getTMTCIFFormatVSField_VariableSize();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_VS_FIELD__MAX_SIZE = eINSTANCE.getTMTCIFFormatVSField_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET = eINSTANCE.getTMTCIFFormatVSField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVRFieldSizeImpl <em>TMTCIF Format VR Field Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVRFieldSizeImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVRFieldSize()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_VR_FIELD_SIZE = eINSTANCE.getTMTCIFFormatVRFieldSize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl <em>TMTCIF Format FDIC Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFDICField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FDIC_FIELD = eINSTANCE.getTMTCIFFormatFDICField();

		/**
		 * The meta object literal for the '<em><b>Check Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE = eINSTANCE.getTMTCIFFormatFDICField_CheckType();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER = eINSTANCE.getTMTCIFFormatFDICField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT = eINSTANCE.getTMTCIFFormatFDICField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FDIC_FIELD__SIZE = eINSTANCE.getTMTCIFFormatFDICField_Size();

		/**
		 * The meta object literal for the '<em><b>Floating Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET = eINSTANCE.getTMTCIFFormatFDICField_FloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Sorted Fields To Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK = eINSTANCE.getTMTCIFFormatFDICField_SortedFieldsToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAFieldImpl <em>TMTCIF Format AField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatAField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_AFIELD = eINSTANCE.getTMTCIFFormatAField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AFIELD__TYPE = eINSTANCE.getTMTCIFFormatAField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AFIELD__BYTE_ORDER = eINSTANCE.getTMTCIFFormatAField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AFIELD__FIRST_BIT = eINSTANCE.getTMTCIFFormatAField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Array Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AFIELD__ARRAY_DIMENSION = eINSTANCE.getTMTCIFFormatAField_ArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AFIELD__SIZE = eINSTANCE.getTMTCIFFormatAField_Size();

		/**
		 * The meta object literal for the '<em><b>Global Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AFIELD__GLOBAL_OFFSET = eINSTANCE.getTMTCIFFormatAField_GlobalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl <em>TMTCIF Format AI Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatAIField()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_AI_FIELD = eINSTANCE.getTMTCIFFormatAIField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AI_FIELD__TYPE = eINSTANCE.getTMTCIFFormatAIField_Type();

		/**
		 * The meta object literal for the '<em><b>Byte Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER = eINSTANCE.getTMTCIFFormatAIField_ByteOrder();

		/**
		 * The meta object literal for the '<em><b>First Bit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_AI_FIELD__FIRST_BIT = eINSTANCE.getTMTCIFFormatAIField_FirstBit();

		/**
		 * The meta object literal for the '<em><b>Array Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AI_FIELD__ARRAY_REF = eINSTANCE.getTMTCIFFormatAIField_ArrayRef();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AI_FIELD__SIZE = eINSTANCE.getTMTCIFFormatAIField_Size();

		/**
		 * The meta object literal for the '<em><b>Local Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET = eINSTANCE.getTMTCIFFormatAIField_LocalOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatBytesBitsImpl <em>TMTCIF Format Bytes Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatBytesBitsImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatBytesBits()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_BYTES_BITS = eINSTANCE.getTMTCIFFormatBytesBits();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_BYTES_BITS__BYTES = eINSTANCE.getTMTCIFFormatBytesBits_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_BYTES_BITS__BITS = eINSTANCE.getTMTCIFFormatBytesBits_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormulaImpl <em>TMTCIF Format Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormulaImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormula()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FORMULA = eINSTANCE.getTMTCIFFormatFormula();

		/**
		 * The meta object literal for the '<em><b>Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FORMULA__SLOPE = eINSTANCE.getTMTCIFFormatFormula_Slope();

		/**
		 * The meta object literal for the '<em><b>Intercept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FORMULA__INTERCEPT = eINSTANCE.getTMTCIFFormatFormula_Intercept();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl <em>TMTCIF Format Variable Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatVariableSize()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_VARIABLE_SIZE = eINSTANCE.getTMTCIFFormatVariableSize();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF = eINSTANCE.getTMTCIFFormatVariableSize_FidRef();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VARIABLE_SIZE__UNIT = eINSTANCE.getTMTCIFFormatVariableSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_VARIABLE_SIZE__POWER = eINSTANCE.getTMTCIFFormatVariableSize_Power();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFloatingOffsetImpl <em>TMTCIF Format Floating Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFloatingOffsetImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFloatingOffset()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FLOATING_OFFSET = eINSTANCE.getTMTCIFFormatFloatingOffset();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FLOATING_OFFSET__FID_REF = eINSTANCE.getTMTCIFFormatFloatingOffset_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatSortedFieldsToCheckImpl <em>TMTCIF Format Sorted Fields To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatSortedFieldsToCheckImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatSortedFieldsToCheck()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK = eINSTANCE.getTMTCIFFormatSortedFieldsToCheck();

		/**
		 * The meta object literal for the '<em><b>Field To Check</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK = eINSTANCE.getTMTCIFFormatSortedFieldsToCheck_FieldToCheck();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldToCheckImpl <em>TMTCIF Format Field To Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFieldToCheckImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldToCheck()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_FIELD_TO_CHECK = eINSTANCE.getTMTCIFFormatFieldToCheck();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_FIELD_TO_CHECK__FID_REF = eINSTANCE.getTMTCIFFormatFieldToCheck_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayDimensionImpl <em>TMTCIF Format Array Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayDimensionImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatArrayDimension()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_ARRAY_DIMENSION = eINSTANCE.getTMTCIFFormatArrayDimension();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_ARRAY_DIMENSION__FID_REF = eINSTANCE.getTMTCIFFormatArrayDimension_FidRef();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_ARRAY_DIMENSION__MAX_ITEMS = eINSTANCE.getTMTCIFFormatArrayDimension_MaxItems();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayRefImpl <em>TMTCIF Format Array Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatArrayRefImpl
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatArrayRef()
		 * @generated
		 */
		EClass TMTCIF_FORMAT_ARRAY_REF = eINSTANCE.getTMTCIFFormatArrayRef();

		/**
		 * The meta object literal for the '<em><b>Fid Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FORMAT_ARRAY_REF__FID_REF = eINSTANCE.getTMTCIFFormatArrayRef_FidRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType <em>TMTCIF Format Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFormatType()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_FORMAT_TYPE = eINSTANCE.getTMTCIFFormatFormatType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType <em>TMTCIF Format Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldType()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_FIELD_TYPE = eINSTANCE.getTMTCIFFormatFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder <em>TMTCIF Format Field Byte Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatFieldByteOrder()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_FIELD_BYTE_ORDER = eINSTANCE.getTMTCIFFormatFieldByteOrder();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit <em>TMTCIF Format SField First Bit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatSFieldFirstBit()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_SFIELD_FIRST_BIT = eINSTANCE.getTMTCIFFormatSFieldFirstBit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType <em>TMTCIF Format Check Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatCheckType()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_CHECK_TYPE = eINSTANCE.getTMTCIFFormatCheckType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit <em>TMTCIF Format Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatUnit()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_UNIT = eINSTANCE.getTMTCIFFormatUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower <em>TMTCIF Format Power</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower
		 * @see es.uah.aut.srg.tmtcif.format.impl.formatPackageImpl#getTMTCIFFormatPower()
		 * @generated
		 */
		EEnum TMTCIF_FORMAT_POWER = eINSTANCE.getTMTCIFFormatPower();

	}

} //formatPackage
