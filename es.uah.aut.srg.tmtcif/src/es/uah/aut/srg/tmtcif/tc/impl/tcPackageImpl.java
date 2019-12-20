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
package es.uah.aut.srg.tmtcif.tc.impl;

import es.uah.aut.srg.tmtcif.enum_.enumPackage;

import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;
import es.uah.aut.srg.tmtcif.tc.tcFactory;
import es.uah.aut.srg.tmtcif.tc.tcPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tcPackageImpl extends EPackageImpl implements tcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftcFieldEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.tc.tcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcPackageImpl() {
		super(eNS_URI, tcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcPackage init() {
		if (isInited) return (tcPackage)EPackage.Registry.INSTANCE.getEPackage(tcPackage.eNS_URI);

		// Obtain or create and register package
		tcPackageImpl thetcPackage = (tcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		enumPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcPackage.createPackageContents();

		// Initialize created meta-data
		thetcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcPackage.eNS_URI, thetcPackage);
		return thetcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTC() {
		return tmtciftcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTC_Name() {
		return (EAttribute)tmtciftcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTC_Type() {
		return (EAttribute)tmtciftcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTC_Subtype() {
		return (EAttribute)tmtciftcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTC_Fields() {
		return (EReference)tmtciftcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTCField() {
		return tmtciftcFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTCField_Name() {
		return (EAttribute)tmtciftcFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTCField_EnumRef() {
		return (EReference)tmtciftcFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcFactory gettcFactory() {
		return (tcFactory)getEFactoryInstance();
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
		tmtciftcEClass = createEClass(TMTCIFTC);
		createEAttribute(tmtciftcEClass, TMTCIFTC__NAME);
		createEAttribute(tmtciftcEClass, TMTCIFTC__TYPE);
		createEAttribute(tmtciftcEClass, TMTCIFTC__SUBTYPE);
		createEReference(tmtciftcEClass, TMTCIFTC__FIELDS);

		tmtciftcFieldEClass = createEClass(TMTCIFTC_FIELD);
		createEAttribute(tmtciftcFieldEClass, TMTCIFTC_FIELD__NAME);
		createEReference(tmtciftcFieldEClass, TMTCIFTC_FIELD__ENUM_REF);
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
		enumPackage theenumPackage = (enumPackage)EPackage.Registry.INSTANCE.getEPackage(enumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtciftcEClass, es.uah.aut.srg.tmtcif.tc.TMTCIFTC.class, "TMTCIFTC", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTC_Name(), ecorePackage.getEString(), "name", null, 1, 1, es.uah.aut.srg.tmtcif.tc.TMTCIFTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFTC_Type(), ecorePackage.getEString(), "type", null, 1, 1, es.uah.aut.srg.tmtcif.tc.TMTCIFTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFTC_Subtype(), ecorePackage.getEString(), "subtype", null, 1, 1, es.uah.aut.srg.tmtcif.tc.TMTCIFTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTC_Fields(), this.getTMTCIFTCField(), null, "fields", null, 0, -1, es.uah.aut.srg.tmtcif.tc.TMTCIFTC.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tmtciftcFieldEClass, TMTCIFTCField.class, "TMTCIFTCField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTCField_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTCField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTCField_EnumRef(), theenumPackage.getTMTCIFEnum(), null, "enumRef", null, 0, 1, TMTCIFTCField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcPackageImpl
