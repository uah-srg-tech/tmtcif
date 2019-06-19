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
package es.uah.aut.srg.tmtcif.import_;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uah.aut.srg.tmtcif.import_.importFactory
 * @model kind="package"
 * @generated
 */
public interface importPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "import";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/import";

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
	importPackage eINSTANCE = es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportImportImpl <em>TMTCIF Import Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportImportImpl
	 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportImport()
	 * @generated
	 */
	int TMTCIF_IMPORT_IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__NAME = commonPackage.TMTCIF_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__URI = commonPackage.TMTCIF_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__VERSION = commonPackage.TMTCIF_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__DESCRIPTION = commonPackage.TMTCIF_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__FROM = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__TO = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__DATA_SOURCE = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT__VIRTUAL_SIZE = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Import Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT_FEATURE_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMTCIF Import Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_IMPORT_OPERATION_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl <em>TMTCIF Import Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl
	 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportDataSource()
	 * @generated
	 */
	int TMTCIF_IMPORT_DATA_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM = 1;

	/**
	 * The feature id for the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM = 2;

	/**
	 * The number of structural features of the '<em>TMTCIF Import Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_DATA_SOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TMTCIF Import Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportVirtualSizeImpl <em>TMTCIF Import Virtual Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportVirtualSizeImpl
	 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportVirtualSize()
	 * @generated
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE__FIELD_REF = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE__TO = 1;

	/**
	 * The feature id for the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE__ADD_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE__UNIT = 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Import Virtual Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TMTCIF Import Virtual Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_IMPORT_VIRTUAL_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit <em>TMTCIF Import Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit
	 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportUnit()
	 * @generated
	 */
	int TMTCIF_IMPORT_UNIT = 3;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport <em>TMTCIF Import Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Import Import</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport
	 * @generated
	 */
	EClass getTMTCIFImportImport();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getFrom()
	 * @see #getTMTCIFImportImport()
	 * @generated
	 */
	EReference getTMTCIFImportImport_From();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getTo()
	 * @see #getTMTCIFImportImport()
	 * @generated
	 */
	EReference getTMTCIFImportImport_To();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Source</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getDataSource()
	 * @see #getTMTCIFImportImport()
	 * @generated
	 */
	EReference getTMTCIFImportImport_DataSource();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getVirtualSize <em>Virtual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Virtual Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getVirtualSize()
	 * @see #getTMTCIFImportImport()
	 * @generated
	 */
	EReference getTMTCIFImportImport_VirtualSize();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource <em>TMTCIF Import Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Import Data Source</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource
	 * @generated
	 */
	EClass getTMTCIFImportDataSource();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getFieldRef()
	 * @see #getTMTCIFImportDataSource()
	 * @generated
	 */
	EReference getTMTCIFImportDataSource_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getLeftTrim <em>Left Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Trim</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getLeftTrim()
	 * @see #getTMTCIFImportDataSource()
	 * @generated
	 */
	EAttribute getTMTCIFImportDataSource_LeftTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getRightTrim <em>Right Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Trim</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getRightTrim()
	 * @see #getTMTCIFImportDataSource()
	 * @generated
	 */
	EAttribute getTMTCIFImportDataSource_RightTrim();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize <em>TMTCIF Import Virtual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Import Virtual Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize
	 * @generated
	 */
	EClass getTMTCIFImportVirtualSize();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getFieldRef()
	 * @see #getTMTCIFImportVirtualSize()
	 * @generated
	 */
	EReference getTMTCIFImportVirtualSize_FieldRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getTo()
	 * @see #getTMTCIFImportVirtualSize()
	 * @generated
	 */
	EReference getTMTCIFImportVirtualSize_To();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getAddSize <em>Add Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getAddSize()
	 * @see #getTMTCIFImportVirtualSize()
	 * @generated
	 */
	EAttribute getTMTCIFImportVirtualSize_AddSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize#getUnit()
	 * @see #getTMTCIFImportVirtualSize()
	 * @generated
	 */
	EAttribute getTMTCIFImportVirtualSize_Unit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit <em>TMTCIF Import Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Import Unit</em>'.
	 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit
	 * @generated
	 */
	EEnum getTMTCIFImportUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	importFactory getimportFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportImportImpl <em>TMTCIF Import Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportImportImpl
		 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportImport()
		 * @generated
		 */
		EClass TMTCIF_IMPORT_IMPORT = eINSTANCE.getTMTCIFImportImport();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_IMPORT__FROM = eINSTANCE.getTMTCIFImportImport_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_IMPORT__TO = eINSTANCE.getTMTCIFImportImport_To();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_IMPORT__DATA_SOURCE = eINSTANCE.getTMTCIFImportImport_DataSource();

		/**
		 * The meta object literal for the '<em><b>Virtual Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_IMPORT__VIRTUAL_SIZE = eINSTANCE.getTMTCIFImportImport_VirtualSize();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl <em>TMTCIF Import Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl
		 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportDataSource()
		 * @generated
		 */
		EClass TMTCIF_IMPORT_DATA_SOURCE = eINSTANCE.getTMTCIFImportDataSource();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF = eINSTANCE.getTMTCIFImportDataSource_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Left Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM = eINSTANCE.getTMTCIFImportDataSource_LeftTrim();

		/**
		 * The meta object literal for the '<em><b>Right Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM = eINSTANCE.getTMTCIFImportDataSource_RightTrim();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportVirtualSizeImpl <em>TMTCIF Import Virtual Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportVirtualSizeImpl
		 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportVirtualSize()
		 * @generated
		 */
		EClass TMTCIF_IMPORT_VIRTUAL_SIZE = eINSTANCE.getTMTCIFImportVirtualSize();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_VIRTUAL_SIZE__FIELD_REF = eINSTANCE.getTMTCIFImportVirtualSize_FieldRef();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_IMPORT_VIRTUAL_SIZE__TO = eINSTANCE.getTMTCIFImportVirtualSize_To();

		/**
		 * The meta object literal for the '<em><b>Add Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_IMPORT_VIRTUAL_SIZE__ADD_SIZE = eINSTANCE.getTMTCIFImportVirtualSize_AddSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_IMPORT_VIRTUAL_SIZE__UNIT = eINSTANCE.getTMTCIFImportVirtualSize_Unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit <em>TMTCIF Import Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.import_.TMTCIFImportUnit
		 * @see es.uah.aut.srg.tmtcif.import_.impl.importPackageImpl#getTMTCIFImportUnit()
		 * @generated
		 */
		EEnum TMTCIF_IMPORT_UNIT = eINSTANCE.getTMTCIFImportUnit();

	}

} //importPackage
