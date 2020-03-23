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
package es.uah.aut.srg.tmtcif.tm.impl;

import es.uah.aut.srg.tmtcif.enum_.enumPackage;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;
import es.uah.aut.srg.tmtcif.tm.tmFactory;
import es.uah.aut.srg.tmtcif.tm.tmPackage;

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
public class tmPackageImpl extends EPackageImpl implements tmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifpi1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftmFieldEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmPackageImpl() {
		super(eNS_URI, tmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmPackage init() {
		if (isInited) return (tmPackage)EPackage.Registry.INSTANCE.getEPackage(tmPackage.eNS_URI);

		// Obtain or create and register package
		tmPackageImpl thetmPackage = (tmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		enumPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmPackage.createPackageContents();

		// Initialize created meta-data
		thetmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmPackage.eNS_URI, thetmPackage);
		return thetmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTM() {
		return tmtciftmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTM_Name() {
		return (EAttribute)tmtciftmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTM_Type() {
		return (EAttribute)tmtciftmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTM_Subtype() {
		return (EAttribute)tmtciftmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTM_Pi1() {
		return (EReference)tmtciftmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTM_Fields() {
		return (EReference)tmtciftmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFPI1() {
		return tmtcifpi1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFPI1_Name() {
		return (EAttribute)tmtcifpi1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFPI1_Val() {
		return (EAttribute)tmtcifpi1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTMField() {
		return tmtciftmFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTMField_Name() {
		return (EAttribute)tmtciftmFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTMField_EnumRef() {
		return (EReference)tmtciftmFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmFactory gettmFactory() {
		return (tmFactory)getEFactoryInstance();
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
		tmtciftmEClass = createEClass(TMTCIFTM);
		createEAttribute(tmtciftmEClass, TMTCIFTM__NAME);
		createEAttribute(tmtciftmEClass, TMTCIFTM__TYPE);
		createEAttribute(tmtciftmEClass, TMTCIFTM__SUBTYPE);
		createEReference(tmtciftmEClass, TMTCIFTM__PI1);
		createEReference(tmtciftmEClass, TMTCIFTM__FIELDS);

		tmtcifpi1EClass = createEClass(TMTCIFPI1);
		createEAttribute(tmtcifpi1EClass, TMTCIFPI1__NAME);
		createEAttribute(tmtcifpi1EClass, TMTCIFPI1__VAL);

		tmtciftmFieldEClass = createEClass(TMTCIFTM_FIELD);
		createEAttribute(tmtciftmFieldEClass, TMTCIFTM_FIELD__NAME);
		createEReference(tmtciftmFieldEClass, TMTCIFTM_FIELD__ENUM_REF);
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
		initEClass(tmtciftmEClass, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, "TMTCIFTM", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTM_Name(), ecorePackage.getEString(), "name", null, 1, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFTM_Type(), ecorePackage.getEString(), "type", null, 1, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFTM_Subtype(), ecorePackage.getEString(), "subtype", null, 1, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTM_Pi1(), this.getTMTCIFPI1(), null, "pi1", null, 0, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTM_Fields(), this.getTMTCIFTMField(), null, "fields", null, 0, -1, es.uah.aut.srg.tmtcif.tm.TMTCIFTM.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifpi1EClass, es.uah.aut.srg.tmtcif.tm.TMTCIFPI1.class, "TMTCIFPI1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFPI1_Name(), ecorePackage.getEString(), "name", null, 1, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFPI1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFPI1_Val(), ecorePackage.getEString(), "val", null, 0, 1, es.uah.aut.srg.tmtcif.tm.TMTCIFPI1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtciftmFieldEClass, TMTCIFTMField.class, "TMTCIFTMField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTMField_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTMField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTMField_EnumRef(), theenumPackage.getTMTCIFEnum(), null, "enumRef", null, 0, 1, TMTCIFTMField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmPackageImpl
