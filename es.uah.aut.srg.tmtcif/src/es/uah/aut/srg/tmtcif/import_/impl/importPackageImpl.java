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
package es.uah.aut.srg.tmtcif.import_.impl;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import es.uah.aut.srg.tmtcif.format.formatPackage;

import es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize;
import es.uah.aut.srg.tmtcif.import_.importFactory;
import es.uah.aut.srg.tmtcif.import_.importPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class importPackageImpl extends EPackageImpl implements importPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifImportImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifImportDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifImportVirtualSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifImportUnitEEnum = null;

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
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private importPackageImpl() {
		super(eNS_URI, importFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link importPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static importPackage init() {
		if (isInited) return (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);

		// Obtain or create and register package
		importPackageImpl theimportPackage = (importPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof importPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new importPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theimportPackage.createPackageContents();

		// Initialize created meta-data
		theimportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theimportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(importPackage.eNS_URI, theimportPackage);
		return theimportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFImportImport() {
		return tmtcifImportImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportImport_From() {
		return (EReference)tmtcifImportImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportImport_To() {
		return (EReference)tmtcifImportImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportImport_DataSource() {
		return (EReference)tmtcifImportImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportImport_VirtualSize() {
		return (EReference)tmtcifImportImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFImportDataSource() {
		return tmtcifImportDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportDataSource_FieldRef() {
		return (EReference)tmtcifImportDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFImportDataSource_LeftTrim() {
		return (EAttribute)tmtcifImportDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFImportDataSource_RightTrim() {
		return (EAttribute)tmtcifImportDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFImportVirtualSize() {
		return tmtcifImportVirtualSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportVirtualSize_FieldRef() {
		return (EReference)tmtcifImportVirtualSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFImportVirtualSize_To() {
		return (EReference)tmtcifImportVirtualSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFImportVirtualSize_AddSize() {
		return (EAttribute)tmtcifImportVirtualSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFImportVirtualSize_Unit() {
		return (EAttribute)tmtcifImportVirtualSizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFImportUnit() {
		return tmtcifImportUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public importFactory getimportFactory() {
		return (importFactory)getEFactoryInstance();
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
		tmtcifImportImportEClass = createEClass(TMTCIF_IMPORT_IMPORT);
		createEReference(tmtcifImportImportEClass, TMTCIF_IMPORT_IMPORT__FROM);
		createEReference(tmtcifImportImportEClass, TMTCIF_IMPORT_IMPORT__TO);
		createEReference(tmtcifImportImportEClass, TMTCIF_IMPORT_IMPORT__DATA_SOURCE);
		createEReference(tmtcifImportImportEClass, TMTCIF_IMPORT_IMPORT__VIRTUAL_SIZE);

		tmtcifImportDataSourceEClass = createEClass(TMTCIF_IMPORT_DATA_SOURCE);
		createEReference(tmtcifImportDataSourceEClass, TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF);
		createEAttribute(tmtcifImportDataSourceEClass, TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM);
		createEAttribute(tmtcifImportDataSourceEClass, TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM);

		tmtcifImportVirtualSizeEClass = createEClass(TMTCIF_IMPORT_VIRTUAL_SIZE);
		createEReference(tmtcifImportVirtualSizeEClass, TMTCIF_IMPORT_VIRTUAL_SIZE__FIELD_REF);
		createEReference(tmtcifImportVirtualSizeEClass, TMTCIF_IMPORT_VIRTUAL_SIZE__TO);
		createEAttribute(tmtcifImportVirtualSizeEClass, TMTCIF_IMPORT_VIRTUAL_SIZE__ADD_SIZE);
		createEAttribute(tmtcifImportVirtualSizeEClass, TMTCIF_IMPORT_VIRTUAL_SIZE__UNIT);

		// Create enums
		tmtcifImportUnitEEnum = createEEnum(TMTCIF_IMPORT_UNIT);
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
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tmtcifImportImportEClass.getESuperTypes().add(thecommonPackage.getTMTCIFModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifImportImportEClass, TMTCIFImportImport.class, "TMTCIFImportImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFImportImport_From(), theformatPackage.getTMTCIFFormatFormat(), null, "from", null, 1, 1, TMTCIFImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFImportImport_To(), theformatPackage.getTMTCIFFormatFormat(), null, "to", null, 0, 1, TMTCIFImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFImportImport_DataSource(), this.getTMTCIFImportDataSource(), null, "dataSource", null, 1, -1, TMTCIFImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFImportImport_VirtualSize(), this.getTMTCIFImportVirtualSize(), null, "virtualSize", null, 0, 1, TMTCIFImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifImportDataSourceEClass, TMTCIFImportDataSource.class, "TMTCIFImportDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFImportDataSource_FieldRef(), theformatPackage.getTMTCIFFormatField(), null, "FieldRef", null, 1, 1, TMTCIFImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFImportDataSource_LeftTrim(), ecorePackage.getEString(), "leftTrim", null, 1, 1, TMTCIFImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFImportDataSource_RightTrim(), ecorePackage.getEString(), "rightTrim", null, 1, 1, TMTCIFImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifImportVirtualSizeEClass, TMTCIFImportVirtualSize.class, "TMTCIFImportVirtualSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFImportVirtualSize_FieldRef(), theformatPackage.getTMTCIFFormatField(), null, "FieldRef", null, 1, 1, TMTCIFImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFImportVirtualSize_To(), theformatPackage.getTMTCIFFormatField(), null, "to", null, 1, 1, TMTCIFImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFImportVirtualSize_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, TMTCIFImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFImportVirtualSize_Unit(), this.getTMTCIFImportUnit(), "unit", null, 0, 1, TMTCIFImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tmtcifImportUnitEEnum, TMTCIFImportUnit.class, "TMTCIFImportUnit");
		addEEnumLiteral(tmtcifImportUnitEEnum, TMTCIFImportUnit.BITS);
		addEEnumLiteral(tmtcifImportUnitEEnum, TMTCIFImportUnit.BYTES);

		// Create resource
		createResource(eNS_URI);
	}

} //importPackageImpl
