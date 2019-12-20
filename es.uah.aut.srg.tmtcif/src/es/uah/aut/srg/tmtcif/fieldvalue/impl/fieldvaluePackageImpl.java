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
package es.uah.aut.srg.tmtcif.fieldvalue.impl;

import es.uah.aut.srg.tmtcif.enum_.enumPackage;

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile;
import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvalueFactory;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

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
public class fieldvaluePackageImpl extends EPackageImpl implements fieldvaluePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFieldValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFieldValueRawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFieldValueFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFieldValueEnumEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private fieldvaluePackageImpl() {
		super(eNS_URI, fieldvalueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link fieldvaluePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static fieldvaluePackage init() {
		if (isInited) return (fieldvaluePackage)EPackage.Registry.INSTANCE.getEPackage(fieldvaluePackage.eNS_URI);

		// Obtain or create and register package
		fieldvaluePackageImpl thefieldvaluePackage = (fieldvaluePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof fieldvaluePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new fieldvaluePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		enumPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thefieldvaluePackage.createPackageContents();

		// Initialize created meta-data
		thefieldvaluePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thefieldvaluePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(fieldvaluePackage.eNS_URI, thefieldvaluePackage);
		return thefieldvaluePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFieldValue() {
		return tmtcifFieldValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFieldValueRaw() {
		return tmtcifFieldValueRawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFieldValueRaw_Value() {
		return (EAttribute)tmtcifFieldValueRawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFieldValueFile() {
		return tmtcifFieldValueFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFieldValueFile_Filename() {
		return (EAttribute)tmtcifFieldValueFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFieldValueEnum() {
		return tmtcifFieldValueEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFieldValueEnum_EnumRef() {
		return (EReference)tmtcifFieldValueEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFieldValueEnum_ValueRef() {
		return (EReference)tmtcifFieldValueEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fieldvalueFactory getfieldvalueFactory() {
		return (fieldvalueFactory)getEFactoryInstance();
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
		tmtcifFieldValueEClass = createEClass(TMTCIF_FIELD_VALUE);

		tmtcifFieldValueRawEClass = createEClass(TMTCIF_FIELD_VALUE_RAW);
		createEAttribute(tmtcifFieldValueRawEClass, TMTCIF_FIELD_VALUE_RAW__VALUE);

		tmtcifFieldValueFileEClass = createEClass(TMTCIF_FIELD_VALUE_FILE);
		createEAttribute(tmtcifFieldValueFileEClass, TMTCIF_FIELD_VALUE_FILE__FILENAME);

		tmtcifFieldValueEnumEClass = createEClass(TMTCIF_FIELD_VALUE_ENUM);
		createEReference(tmtcifFieldValueEnumEClass, TMTCIF_FIELD_VALUE_ENUM__ENUM_REF);
		createEReference(tmtcifFieldValueEnumEClass, TMTCIF_FIELD_VALUE_ENUM__VALUE_REF);
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
		tmtcifFieldValueRawEClass.getESuperTypes().add(this.getTMTCIFFieldValue());
		tmtcifFieldValueFileEClass.getESuperTypes().add(this.getTMTCIFFieldValue());
		tmtcifFieldValueEnumEClass.getESuperTypes().add(this.getTMTCIFFieldValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifFieldValueEClass, TMTCIFFieldValue.class, "TMTCIFFieldValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tmtcifFieldValueRawEClass, TMTCIFFieldValueRaw.class, "TMTCIFFieldValueRaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFieldValueRaw_Value(), ecorePackage.getEString(), "value", null, 1, 1, TMTCIFFieldValueRaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFieldValueFileEClass, TMTCIFFieldValueFile.class, "TMTCIFFieldValueFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFieldValueFile_Filename(), ecorePackage.getEString(), "filename", null, 1, 1, TMTCIFFieldValueFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFieldValueEnumEClass, TMTCIFFieldValueEnum.class, "TMTCIFFieldValueEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFieldValueEnum_EnumRef(), theenumPackage.getTMTCIFEnum(), null, "enumRef", null, 1, 1, TMTCIFFieldValueEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFieldValueEnum_ValueRef(), theenumPackage.getTMTCIFEnumValue(), null, "valueRef", null, 1, 1, TMTCIFFieldValueEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //fieldvaluePackageImpl
