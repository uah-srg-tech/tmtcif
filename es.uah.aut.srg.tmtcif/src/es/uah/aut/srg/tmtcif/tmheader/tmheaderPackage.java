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
package es.uah.aut.srg.tmtcif.tmheader;

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
 * @see es.uah.aut.srg.tmtcif.tmheader.tmheaderFactory
 * @model kind="package"
 * @generated
 */
public interface tmheaderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmheader";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/tmheader";

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
	tmheaderPackage eINSTANCE = es.uah.aut.srg.tmtcif.tmheader.impl.tmheaderPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl <em>TMTCIFTM Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl
	 * @see es.uah.aut.srg.tmtcif.tmheader.impl.tmheaderPackageImpl#getTMTCIFTMHeader()
	 * @generated
	 */
	int TMTCIFTM_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTM Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTM Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderFieldImpl <em>TMTCIFTM Header Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderFieldImpl
	 * @see es.uah.aut.srg.tmtcif.tmheader.impl.tmheaderPackageImpl#getTMTCIFTMHeaderField()
	 * @generated
	 */
	int TMTCIFTM_HEADER_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_FIELD__FIELD_VALUE = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTM Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTM Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTM_HEADER_FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader <em>TMTCIFTM Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTM Header</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader
	 * @generated
	 */
	EClass getTMTCIFTMHeader();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader#getName()
	 * @see #getTMTCIFTMHeader()
	 * @generated
	 */
	EAttribute getTMTCIFTMHeader_Name();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader#getFields()
	 * @see #getTMTCIFTMHeader()
	 * @generated
	 */
	EReference getTMTCIFTMHeader_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField <em>TMTCIFTM Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTM Header Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField
	 * @generated
	 */
	EClass getTMTCIFTMHeaderField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getName()
	 * @see #getTMTCIFTMHeaderField()
	 * @generated
	 */
	EAttribute getTMTCIFTMHeaderField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getFieldValue()
	 * @see #getTMTCIFTMHeaderField()
	 * @generated
	 */
	EReference getTMTCIFTMHeaderField_FieldValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmheaderFactory gettmheaderFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl <em>TMTCIFTM Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl
		 * @see es.uah.aut.srg.tmtcif.tmheader.impl.tmheaderPackageImpl#getTMTCIFTMHeader()
		 * @generated
		 */
		EClass TMTCIFTM_HEADER = eINSTANCE.getTMTCIFTMHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM_HEADER__NAME = eINSTANCE.getTMTCIFTMHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM_HEADER__FIELDS = eINSTANCE.getTMTCIFTMHeader_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderFieldImpl <em>TMTCIFTM Header Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderFieldImpl
		 * @see es.uah.aut.srg.tmtcif.tmheader.impl.tmheaderPackageImpl#getTMTCIFTMHeaderField()
		 * @generated
		 */
		EClass TMTCIFTM_HEADER_FIELD = eINSTANCE.getTMTCIFTMHeaderField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTM_HEADER_FIELD__NAME = eINSTANCE.getTMTCIFTMHeaderField_Name();

		/**
		 * The meta object literal for the '<em><b>Field Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTM_HEADER_FIELD__FIELD_VALUE = eINSTANCE.getTMTCIFTMHeaderField_FieldValue();

	}

} //tmheaderPackage
