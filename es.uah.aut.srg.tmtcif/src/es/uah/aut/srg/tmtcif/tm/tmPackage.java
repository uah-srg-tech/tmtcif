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
package es.uah.aut.srg.tmtcif.tm;

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
 * @see es.uah.aut.srg.tmtcif.tm.tmFactory
 * @model kind="package"
 * @generated
 */
public interface tmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/tm";

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
	tmPackage eINSTANCE = es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl <em>TMTCIFTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl
	 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFTM()
	 * @generated
	 */
	int TMTCIFTM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__SUBTYPE = 2;

	/**
	 * The feature id for the '<em><b>Pi1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__PI1 = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__FIELDS = 4;

	/**
	 * The number of structural features of the '<em>TMTCIFTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TMTCIFTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFPI1Impl <em>TMTCIFPI1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFPI1Impl
	 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFPI1()
	 * @generated
	 */
	int TMTCIFPI1 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFPI1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFPI1__VAL = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFPI1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFPI1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFPI1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFPI1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl <em>TMTCIFTM Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl
	 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFTMField()
	 * @generated
	 */
	int TMTCIFTM_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD__ENUM_REF = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTM Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTM Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM <em>TMTCIFTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTM</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM
	 * @generated
	 */
	EClass getTMTCIFTM();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getName()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EAttribute getTMTCIFTM_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getType()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EAttribute getTMTCIFTM_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getSubtype()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EAttribute getTMTCIFTM_Subtype();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1 <em>Pi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pi1</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EReference getTMTCIFTM_Pi1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getFields()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EReference getTMTCIFTM_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFPI1 <em>TMTCIFPI1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFPI1</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFPI1
	 * @generated
	 */
	EClass getTMTCIFPI1();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFPI1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFPI1#getName()
	 * @see #getTMTCIFPI1()
	 * @generated
	 */
	EAttribute getTMTCIFPI1_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFPI1#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFPI1#getVal()
	 * @see #getTMTCIFPI1()
	 * @generated
	 */
	EAttribute getTMTCIFPI1_Val();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField <em>TMTCIFTM Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTM Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTMField
	 * @generated
	 */
	EClass getTMTCIFTMField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getName()
	 * @see #getTMTCIFTMField()
	 * @generated
	 */
	EAttribute getTMTCIFTMField_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getEnumRef()
	 * @see #getTMTCIFTMField()
	 * @generated
	 */
	EReference getTMTCIFTMField_EnumRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmFactory gettmFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl <em>TMTCIFTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl
		 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFTM()
		 * @generated
		 */
		EClass TMTCIFTM = eINSTANCE.getTMTCIFTM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM__NAME = eINSTANCE.getTMTCIFTM_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM__TYPE = eINSTANCE.getTMTCIFTM_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM__SUBTYPE = eINSTANCE.getTMTCIFTM_Subtype();

		/**
		 * The meta object literal for the '<em><b>Pi1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM__PI1 = eINSTANCE.getTMTCIFTM_Pi1();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM__FIELDS = eINSTANCE.getTMTCIFTM_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFPI1Impl <em>TMTCIFPI1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFPI1Impl
		 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFPI1()
		 * @generated
		 */
		EClass TMTCIFPI1 = eINSTANCE.getTMTCIFPI1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFPI1__NAME = eINSTANCE.getTMTCIFPI1_Name();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFPI1__VAL = eINSTANCE.getTMTCIFPI1_Val();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl <em>TMTCIFTM Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl
		 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFTMField()
		 * @generated
		 */
		EClass TMTCIFTM_FIELD = eINSTANCE.getTMTCIFTMField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM_FIELD__NAME = eINSTANCE.getTMTCIFTMField_Name();

		/**
		 * The meta object literal for the '<em><b>Enum Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM_FIELD__ENUM_REF = eINSTANCE.getTMTCIFTMField_EnumRef();

	}

} //tmPackage
