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
package es.uah.aut.srg.tmtcif.common;

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
 * @see es.uah.aut.srg.tmtcif.common.commonFactory
 * @model kind="package"
 * @generated
 */
public interface commonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/common";

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
	commonPackage eINSTANCE = es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImpl <em>TMTCIF Model File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImpl
	 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelFile()
	 * @generated
	 */
	int TMTCIF_MODEL_FILE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Model File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Model File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImportImpl <em>TMTCIF Model File Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImportImpl
	 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelFileImport()
	 * @generated
	 */
	int TMTCIF_MODEL_FILE_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE_IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Model File Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Model File Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_FILE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl <em>TMTCIF Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl
	 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelElement()
	 * @generated
	 */
	int TMTCIF_MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT__URI = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TMTCIF Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelObjectImpl <em>TMTCIF Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelObjectImpl
	 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelObject()
	 * @generated
	 */
	int TMTCIF_MODEL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_OBJECT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_MODEL_OBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile <em>TMTCIF Model File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Model File</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelFile
	 * @generated
	 */
	EClass getTMTCIFModelFile();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getElement()
	 * @see #getTMTCIFModelFile()
	 * @generated
	 */
	EReference getTMTCIFModelFile_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getImports()
	 * @see #getTMTCIFModelFile()
	 * @generated
	 */
	EReference getTMTCIFModelFile_Imports();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport <em>TMTCIF Model File Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Model File Import</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport
	 * @generated
	 */
	EClass getTMTCIFModelFileImport();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport#getImportURI()
	 * @see #getTMTCIFModelFileImport()
	 * @generated
	 */
	EAttribute getTMTCIFModelFileImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement <em>TMTCIF Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Model Element</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement
	 * @generated
	 */
	EClass getTMTCIFModelElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getName()
	 * @see #getTMTCIFModelElement()
	 * @generated
	 */
	EAttribute getTMTCIFModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getUri()
	 * @see #getTMTCIFModelElement()
	 * @generated
	 */
	EAttribute getTMTCIFModelElement_Uri();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getVersion()
	 * @see #getTMTCIFModelElement()
	 * @generated
	 */
	EAttribute getTMTCIFModelElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement#getDescription()
	 * @see #getTMTCIFModelElement()
	 * @generated
	 */
	EAttribute getTMTCIFModelElement_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelObject <em>TMTCIF Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Model Object</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelObject
	 * @generated
	 */
	EClass getTMTCIFModelObject();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelObject#getName()
	 * @see #getTMTCIFModelObject()
	 * @generated
	 */
	EAttribute getTMTCIFModelObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelObject#getDescription()
	 * @see #getTMTCIFModelObject()
	 * @generated
	 */
	EAttribute getTMTCIFModelObject_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	commonFactory getcommonFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImpl <em>TMTCIF Model File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImpl
		 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelFile()
		 * @generated
		 */
		EClass TMTCIF_MODEL_FILE = eINSTANCE.getTMTCIFModelFile();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_MODEL_FILE__ELEMENT = eINSTANCE.getTMTCIFModelFile_Element();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_MODEL_FILE__IMPORTS = eINSTANCE.getTMTCIFModelFile_Imports();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImportImpl <em>TMTCIF Model File Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelFileImportImpl
		 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelFileImport()
		 * @generated
		 */
		EClass TMTCIF_MODEL_FILE_IMPORT = eINSTANCE.getTMTCIFModelFileImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_FILE_IMPORT__IMPORT_URI = eINSTANCE.getTMTCIFModelFileImport_ImportURI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl <em>TMTCIF Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl
		 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelElement()
		 * @generated
		 */
		EClass TMTCIF_MODEL_ELEMENT = eINSTANCE.getTMTCIFModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_ELEMENT__NAME = eINSTANCE.getTMTCIFModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_ELEMENT__URI = eINSTANCE.getTMTCIFModelElement_Uri();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_ELEMENT__VERSION = eINSTANCE.getTMTCIFModelElement_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getTMTCIFModelElement_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelObjectImpl <em>TMTCIF Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelObjectImpl
		 * @see es.uah.aut.srg.tmtcif.common.impl.commonPackageImpl#getTMTCIFModelObject()
		 * @generated
		 */
		EClass TMTCIF_MODEL_OBJECT = eINSTANCE.getTMTCIFModelObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_OBJECT__NAME = eINSTANCE.getTMTCIFModelObject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_MODEL_OBJECT__DESCRIPTION = eINSTANCE.getTMTCIFModelObject_Description();

	}

} //commonPackage
