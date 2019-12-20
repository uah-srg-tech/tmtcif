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
	 * The feature id for the '<em><b>Pi1 val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM__PI1_VAL = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
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
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl <em>TMTCIFTM Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMFieldImpl
	 * @see es.uah.aut.srg.tmtcif.tm.impl.tmPackageImpl#getTMTCIFTMField()
	 * @generated
	 */
	int TMTCIFTM_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>TMTCIFTM Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_FIELD_FEATURE_COUNT = 1;

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
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1_val <em>Pi1 val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pi1 val</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1_val()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EAttribute getTMTCIFTM_Pi1_val();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getFields()
	 * @see #getTMTCIFTM()
	 * @generated
	 */
	EReference getTMTCIFTM_Fields();

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
		 * The meta object literal for the '<em><b>Pi1 val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM__PI1_VAL = eINSTANCE.getTMTCIFTM_Pi1_val();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM__FIELDS = eINSTANCE.getTMTCIFTM_Fields();

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

	}

} //tmPackage
