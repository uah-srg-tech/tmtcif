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
package es.uah.aut.srg.tmtcif.tcheader;

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
 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderFactory
 * @model kind="package"
 * @generated
 */
public interface tcheaderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcheader";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/tcheader";

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
	tcheaderPackage eINSTANCE = es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderImpl <em>TMTCIFTC Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderImpl
	 * @see es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderPackageImpl#getTMTCIFTCHeader()
	 * @generated
	 */
	int TMTCIFTC_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER__FIELDS = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTC Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTC Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl <em>TMTCIFTC Header Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl
	 * @see es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderPackageImpl#getTMTCIFTCHeaderField()
	 * @generated
	 */
	int TMTCIFTC_HEADER_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_FIELD__FIELD_VALUE = 1;

	/**
	 * The number of structural features of the '<em>TMTCIFTC Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIFTC Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIFTC_HEADER_FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader <em>TMTCIFTC Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTC Header</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader
	 * @generated
	 */
	EClass getTMTCIFTCHeader();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getName()
	 * @see #getTMTCIFTCHeader()
	 * @generated
	 */
	EAttribute getTMTCIFTCHeader_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getFields()
	 * @see #getTMTCIFTCHeader()
	 * @generated
	 */
	EReference getTMTCIFTCHeader_Fields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField <em>TMTCIFTC Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIFTC Header Field</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField
	 * @generated
	 */
	EClass getTMTCIFTCHeaderField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField#getName()
	 * @see #getTMTCIFTCHeaderField()
	 * @generated
	 */
	EAttribute getTMTCIFTCHeaderField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField#getFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField#getFieldValue()
	 * @see #getTMTCIFTCHeaderField()
	 * @generated
	 */
	EReference getTMTCIFTCHeaderField_FieldValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcheaderFactory gettcheaderFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderImpl <em>TMTCIFTC Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderImpl
		 * @see es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderPackageImpl#getTMTCIFTCHeader()
		 * @generated
		 */
		EClass TMTCIFTC_HEADER = eINSTANCE.getTMTCIFTCHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC_HEADER__NAME = eINSTANCE.getTMTCIFTCHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTC_HEADER__FIELDS = eINSTANCE.getTMTCIFTCHeader_Fields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl <em>TMTCIFTC Header Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl
		 * @see es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderPackageImpl#getTMTCIFTCHeaderField()
		 * @generated
		 */
		EClass TMTCIFTC_HEADER_FIELD = eINSTANCE.getTMTCIFTCHeaderField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIFTC_HEADER_FIELD__NAME = eINSTANCE.getTMTCIFTCHeaderField_Name();

		/**
		 * The meta object literal for the '<em><b>Field Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIFTC_HEADER_FIELD__FIELD_VALUE = eINSTANCE.getTMTCIFTCHeaderField_FieldValue();

	}

} //tcheaderPackage
