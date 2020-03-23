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
package es.uah.aut.srg.tmtcif.fieldvalue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see es.uah.aut.srg.tmtcif.fieldvalue.fieldvalueFactory
 * @model kind="package"
 * @generated
 */
public interface fieldvaluePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldvalue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/fieldvalue";

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
	fieldvaluePackage eINSTANCE = es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueImpl <em>TMTCIF Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueImpl
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValue()
	 * @generated
	 */
	int TMTCIF_FIELD_VALUE = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>TMTCIF Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueRawImpl <em>TMTCIF Field Value Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueRawImpl
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueRaw()
	 * @generated
	 */
	int TMTCIF_FIELD_VALUE_RAW = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_RAW__VALUE = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Field Value Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_RAW_FEATURE_COUNT = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Field Value Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_RAW_OPERATION_COUNT = TMTCIF_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueFileImpl <em>TMTCIF Field Value File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueFileImpl
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueFile()
	 * @generated
	 */
	int TMTCIF_FIELD_VALUE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_FILE__FILENAME = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Field Value File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_FILE_FEATURE_COUNT = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Field Value File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_FILE_OPERATION_COUNT = TMTCIF_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl <em>TMTCIF Field Value Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueEnum()
	 * @generated
	 */
	int TMTCIF_FIELD_VALUE_ENUM = 3;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_ENUM__ENUM_REF = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_ENUM__VALUE_REF = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Field Value Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_ENUM_FEATURE_COUNT = TMTCIF_FIELD_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMTCIF Field Value Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FIELD_VALUE_ENUM_OPERATION_COUNT = TMTCIF_FIELD_VALUE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue <em>TMTCIF Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Field Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue
	 * @generated
	 */
	EClass getTMTCIFFieldValue();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw <em>TMTCIF Field Value Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Field Value Raw</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw
	 * @generated
	 */
	EClass getTMTCIFFieldValueRaw();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw#getValue()
	 * @see #getTMTCIFFieldValueRaw()
	 * @generated
	 */
	EAttribute getTMTCIFFieldValueRaw_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile <em>TMTCIF Field Value File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Field Value File</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile
	 * @generated
	 */
	EClass getTMTCIFFieldValueFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile#getFilename()
	 * @see #getTMTCIFFieldValueFile()
	 * @generated
	 */
	EAttribute getTMTCIFFieldValueFile_Filename();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum <em>TMTCIF Field Value Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Field Value Enum</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum
	 * @generated
	 */
	EClass getTMTCIFFieldValueEnum();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum#getEnumRef()
	 * @see #getTMTCIFFieldValueEnum()
	 * @generated
	 */
	EReference getTMTCIFFieldValueEnum_EnumRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum#getValueRef()
	 * @see #getTMTCIFFieldValueEnum()
	 * @generated
	 */
	EReference getTMTCIFFieldValueEnum_ValueRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	fieldvalueFactory getfieldvalueFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueImpl <em>TMTCIF Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueImpl
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValue()
		 * @generated
		 */
		EClass TMTCIF_FIELD_VALUE = eINSTANCE.getTMTCIFFieldValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueRawImpl <em>TMTCIF Field Value Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueRawImpl
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueRaw()
		 * @generated
		 */
		EClass TMTCIF_FIELD_VALUE_RAW = eINSTANCE.getTMTCIFFieldValueRaw();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FIELD_VALUE_RAW__VALUE = eINSTANCE.getTMTCIFFieldValueRaw_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueFileImpl <em>TMTCIF Field Value File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueFileImpl
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueFile()
		 * @generated
		 */
		EClass TMTCIF_FIELD_VALUE_FILE = eINSTANCE.getTMTCIFFieldValueFile();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FIELD_VALUE_FILE__FILENAME = eINSTANCE.getTMTCIFFieldValueFile_Filename();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl <em>TMTCIF Field Value Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl
		 * @see es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvaluePackageImpl#getTMTCIFFieldValueEnum()
		 * @generated
		 */
		EClass TMTCIF_FIELD_VALUE_ENUM = eINSTANCE.getTMTCIFFieldValueEnum();

		/**
		 * The meta object literal for the '<em><b>Enum Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FIELD_VALUE_ENUM__ENUM_REF = eINSTANCE.getTMTCIFFieldValueEnum_EnumRef();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FIELD_VALUE_ENUM__VALUE_REF = eINSTANCE.getTMTCIFFieldValueEnum_ValueRef();

	}

} //fieldvaluePackage
