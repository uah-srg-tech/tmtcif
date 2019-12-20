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
package es.uah.aut.srg.tmtcif.tmheader.impl;

import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader;
import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;
import es.uah.aut.srg.tmtcif.tmheader.tmheaderFactory;
import es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage;

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
public class tmheaderPackageImpl extends EPackageImpl implements tmheaderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftmHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftmHeaderFieldEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmheaderPackageImpl() {
		super(eNS_URI, tmheaderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmheaderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmheaderPackage init() {
		if (isInited) return (tmheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tmheaderPackage.eNS_URI);

		// Obtain or create and register package
		tmheaderPackageImpl thetmheaderPackage = (tmheaderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmheaderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmheaderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		fieldvaluePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmheaderPackage.createPackageContents();

		// Initialize created meta-data
		thetmheaderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmheaderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmheaderPackage.eNS_URI, thetmheaderPackage);
		return thetmheaderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTMHeader() {
		return tmtciftmHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTMHeader_Name() {
		return (EAttribute)tmtciftmHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTMHeader_Fields() {
		return (EReference)tmtciftmHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTMHeaderField() {
		return tmtciftmHeaderFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTMHeaderField_Name() {
		return (EAttribute)tmtciftmHeaderFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTMHeaderField_FieldValue() {
		return (EReference)tmtciftmHeaderFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderFactory gettmheaderFactory() {
		return (tmheaderFactory)getEFactoryInstance();
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
		tmtciftmHeaderEClass = createEClass(TMTCIFTM_HEADER);
		createEAttribute(tmtciftmHeaderEClass, TMTCIFTM_HEADER__NAME);
		createEReference(tmtciftmHeaderEClass, TMTCIFTM_HEADER__FIELDS);

		tmtciftmHeaderFieldEClass = createEClass(TMTCIFTM_HEADER_FIELD);
		createEAttribute(tmtciftmHeaderFieldEClass, TMTCIFTM_HEADER_FIELD__NAME);
		createEReference(tmtciftmHeaderFieldEClass, TMTCIFTM_HEADER_FIELD__FIELD_VALUE);
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
		fieldvaluePackage thefieldvaluePackage = (fieldvaluePackage)EPackage.Registry.INSTANCE.getEPackage(fieldvaluePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtciftmHeaderEClass, TMTCIFTMHeader.class, "TMTCIFTMHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTMHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTMHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTMHeader_Fields(), this.getTMTCIFTMHeaderField(), null, "fields", null, 0, -1, TMTCIFTMHeader.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tmtciftmHeaderFieldEClass, TMTCIFTMHeaderField.class, "TMTCIFTMHeaderField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTMHeaderField_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTMHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTMHeaderField_FieldValue(), thefieldvaluePackage.getTMTCIFFieldValueRaw(), null, "fieldValue", null, 0, 1, TMTCIFTMHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmheaderPackageImpl
