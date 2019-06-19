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
package es.uah.aut.srg.tmtcif.common.impl;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;
import es.uah.aut.srg.tmtcif.common.commonFactory;
import es.uah.aut.srg.tmtcif.common.commonPackage;

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
public class commonPackageImpl extends EPackageImpl implements commonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifModelFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifModelFileImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifModelObjectEClass = null;

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
	 * @see es.uah.aut.srg.tmtcif.common.commonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private commonPackageImpl() {
		super(eNS_URI, commonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link commonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static commonPackage init() {
		if (isInited) return (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Obtain or create and register package
		commonPackageImpl thecommonPackage = (commonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof commonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new commonPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thecommonPackage.createPackageContents();

		// Initialize created meta-data
		thecommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(commonPackage.eNS_URI, thecommonPackage);
		return thecommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFModelFile() {
		return tmtcifModelFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFModelFile_Element() {
		return (EReference)tmtcifModelFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFModelFile_Imports() {
		return (EReference)tmtcifModelFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFModelFileImport() {
		return tmtcifModelFileImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelFileImport_ImportURI() {
		return (EAttribute)tmtcifModelFileImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFModelElement() {
		return tmtcifModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelElement_Name() {
		return (EAttribute)tmtcifModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelElement_Uri() {
		return (EAttribute)tmtcifModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelElement_Version() {
		return (EAttribute)tmtcifModelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelElement_Description() {
		return (EAttribute)tmtcifModelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFModelObject() {
		return tmtcifModelObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelObject_Name() {
		return (EAttribute)tmtcifModelObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFModelObject_Description() {
		return (EAttribute)tmtcifModelObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public commonFactory getcommonFactory() {
		return (commonFactory)getEFactoryInstance();
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
		tmtcifModelFileEClass = createEClass(TMTCIF_MODEL_FILE);
		createEReference(tmtcifModelFileEClass, TMTCIF_MODEL_FILE__ELEMENT);
		createEReference(tmtcifModelFileEClass, TMTCIF_MODEL_FILE__IMPORTS);

		tmtcifModelFileImportEClass = createEClass(TMTCIF_MODEL_FILE_IMPORT);
		createEAttribute(tmtcifModelFileImportEClass, TMTCIF_MODEL_FILE_IMPORT__IMPORT_URI);

		tmtcifModelElementEClass = createEClass(TMTCIF_MODEL_ELEMENT);
		createEAttribute(tmtcifModelElementEClass, TMTCIF_MODEL_ELEMENT__NAME);
		createEAttribute(tmtcifModelElementEClass, TMTCIF_MODEL_ELEMENT__URI);
		createEAttribute(tmtcifModelElementEClass, TMTCIF_MODEL_ELEMENT__VERSION);
		createEAttribute(tmtcifModelElementEClass, TMTCIF_MODEL_ELEMENT__DESCRIPTION);

		tmtcifModelObjectEClass = createEClass(TMTCIF_MODEL_OBJECT);
		createEAttribute(tmtcifModelObjectEClass, TMTCIF_MODEL_OBJECT__NAME);
		createEAttribute(tmtcifModelObjectEClass, TMTCIF_MODEL_OBJECT__DESCRIPTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifModelFileEClass, TMTCIFModelFile.class, "TMTCIFModelFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFModelFile_Element(), this.getTMTCIFModelElement(), null, "element", null, 1, 1, TMTCIFModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFModelFile_Imports(), this.getTMTCIFModelFileImport(), null, "imports", null, 0, -1, TMTCIFModelFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifModelFileImportEClass, TMTCIFModelFileImport.class, "TMTCIFModelFileImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFModelFileImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, TMTCIFModelFileImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifModelElementEClass, TMTCIFModelElement.class, "TMTCIFModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFModelElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFModelElement_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, TMTCIFModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFModelElement_Version(), ecorePackage.getEString(), "version", null, 1, 1, TMTCIFModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, TMTCIFModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifModelObjectEClass, TMTCIFModelObject.class, "TMTCIFModelObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFModelObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFModelObject_Description(), ecorePackage.getEString(), "description", null, 0, 1, TMTCIFModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //commonPackageImpl
