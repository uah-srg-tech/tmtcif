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
package es.uah.aut.srg.tmtcif.tcheader.impl;

import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader;
import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField;
import es.uah.aut.srg.tmtcif.tcheader.tcheaderFactory;
import es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage;

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
public class tcheaderPackageImpl extends EPackageImpl implements tcheaderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftcHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtciftcHeaderFieldEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcheaderPackageImpl() {
		super(eNS_URI, tcheaderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcheaderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcheaderPackage init() {
		if (isInited) return (tcheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tcheaderPackage.eNS_URI);

		// Obtain or create and register package
		tcheaderPackageImpl thetcheaderPackage = (tcheaderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcheaderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcheaderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		fieldvaluePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcheaderPackage.createPackageContents();

		// Initialize created meta-data
		thetcheaderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcheaderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcheaderPackage.eNS_URI, thetcheaderPackage);
		return thetcheaderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTCHeader() {
		return tmtciftcHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTCHeader_Name() {
		return (EAttribute)tmtciftcHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTCHeader_Fields() {
		return (EReference)tmtciftcHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFTCHeaderField() {
		return tmtciftcHeaderFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFTCHeaderField_Name() {
		return (EAttribute)tmtciftcHeaderFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFTCHeaderField_FieldValue() {
		return (EReference)tmtciftcHeaderFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderFactory gettcheaderFactory() {
		return (tcheaderFactory)getEFactoryInstance();
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
		tmtciftcHeaderEClass = createEClass(TMTCIFTC_HEADER);
		createEAttribute(tmtciftcHeaderEClass, TMTCIFTC_HEADER__NAME);
		createEReference(tmtciftcHeaderEClass, TMTCIFTC_HEADER__FIELDS);

		tmtciftcHeaderFieldEClass = createEClass(TMTCIFTC_HEADER_FIELD);
		createEAttribute(tmtciftcHeaderFieldEClass, TMTCIFTC_HEADER_FIELD__NAME);
		createEReference(tmtciftcHeaderFieldEClass, TMTCIFTC_HEADER_FIELD__FIELD_VALUE);
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
		initEClass(tmtciftcHeaderEClass, TMTCIFTCHeader.class, "TMTCIFTCHeader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTCHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTCHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTCHeader_Fields(), this.getTMTCIFTCHeaderField(), null, "fields", null, 0, -1, TMTCIFTCHeader.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tmtciftcHeaderFieldEClass, TMTCIFTCHeaderField.class, "TMTCIFTCHeaderField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFTCHeaderField_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFTCHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFTCHeaderField_FieldValue(), thefieldvaluePackage.getTMTCIFFieldValueRaw(), null, "fieldValue", null, 0, 1, TMTCIFTCHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcheaderPackageImpl
