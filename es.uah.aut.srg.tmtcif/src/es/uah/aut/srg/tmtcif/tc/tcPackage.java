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
package es.uah.aut.srg.tmtcif.tc;

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
 * @see es.uah.aut.srg.tmtcif.tc.tcFactory
 * @model kind="package"
 * @generated
 */
public interface tcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/tc";

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
	tcPackage eINSTANCE = es.uah.aut.srg.tmtcif.tc.impl.tcPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCImpl <em>TMTCIFTC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCImpl
	 * @see es.uah.aut.srg.tmtcif.tc.impl.tcPackageImpl#getTMTCIFTC()
	 * @generated
	 */
	int TMTCIFTC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC__SUBTYPE = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC__FIELDS = 3;

	/**
	 * The number of structural features of the '<em>TMTCIFTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TMTCIFTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl <em>TMTCIFTC Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl
	 * @see es.uah.aut.srg.tmtcif.tc.impl.tcPackageImpl#getTMTCIFTCField()
	 * @generated
	 */
	int TMTCIFTC_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_FIELD__ENUM_REF = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTC <em>TMTCIFTC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTC</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTC
	 * @generated
	 */
	EClass getTMTCIFTC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getName()
	 * @see #getTMTCIFTC()
	 * @generated
	 */
	EAttribute getTMTCIFTC_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getType()
	 * @see #getTMTCIFTC()
	 * @generated
	 */
	EAttribute getTMTCIFTC_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getSubtype()
	 * @see #getTMTCIFTC()
	 * @generated
	 */
	EAttribute getTMTCIFTC_Subtype();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTC#getFields()
	 * @see #getTMTCIFTC()
	 * @generated
	 */
	EReference getTMTCIFTC_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTCField <em>TMTCIFTC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTC Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTCField
	 * @generated
	 */
	EClass getTMTCIFTCField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTCField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTCField#getName()
	 * @see #getTMTCIFTCField()
	 * @generated
	 */
	EAttribute getTMTCIFTCField_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.tc.TMTCIFTCField#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.tc.TMTCIFTCField#getEnumRef()
	 * @see #getTMTCIFTCField()
	 * @generated
	 */
	EReference getTMTCIFTCField_EnumRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcFactory gettcFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCImpl <em>TMTCIFTC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCImpl
		 * @see es.uah.aut.srg.tmtcif.tc.impl.tcPackageImpl#getTMTCIFTC()
		 * @generated
		 */
		EClass TMTCIFTC = eINSTANCE.getTMTCIFTC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC__NAME = eINSTANCE.getTMTCIFTC_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC__TYPE = eINSTANCE.getTMTCIFTC_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC__SUBTYPE = eINSTANCE.getTMTCIFTC_Subtype();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTC__FIELDS = eINSTANCE.getTMTCIFTC_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl <em>TMTCIFTC Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl
		 * @see es.uah.aut.srg.tmtcif.tc.impl.tcPackageImpl#getTMTCIFTCField()
		 * @generated
		 */
		EClass TMTCIFTC_FIELD = eINSTANCE.getTMTCIFTCField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC_FIELD__NAME = eINSTANCE.getTMTCIFTCField_Name();

		/**
		 * The meta object literal for the '<em><b>Enum Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTC_FIELD__ENUM_REF = eINSTANCE.getTMTCIFTCField_EnumRef();

	}

} //tcPackage
