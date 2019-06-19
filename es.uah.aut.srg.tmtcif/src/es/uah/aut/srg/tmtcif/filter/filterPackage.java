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
package es.uah.aut.srg.tmtcif.filter;

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
 * @see es.uah.aut.srg.tmtcif.filter.filterFactory
 * @model kind="package"
 * @generated
 */
public interface filterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/filter";

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
	filterPackage eINSTANCE = es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl <em>TMTCIF Filter Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterFilter()
	 * @generated
	 */
	int TMTCIF_FILTER_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__NAME = commonPackage.TMTCIF_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__URI = commonPackage.TMTCIF_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__VERSION = commonPackage.TMTCIF_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__DESCRIPTION = commonPackage.TMTCIF_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__FORMAT_FILE = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__BOOL_VAR = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER_FEATURE_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FILTER_OPERATION_COUNT = commonPackage.TMTCIF_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermFilterImpl <em>TMTCIF Filter Maxterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermFilterImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMaxtermFilter()
	 * @generated
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__NAME = TMTCIF_FILTER_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__URI = TMTCIF_FILTER_FILTER__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__VERSION = TMTCIF_FILTER_FILTER__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__DESCRIPTION = TMTCIF_FILTER_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__FORMAT_FILE = TMTCIF_FILTER_FILTER__FORMAT_FILE;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__BOOL_VAR = TMTCIF_FILTER_FILTER__BOOL_VAR;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC = TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC;

	/**
	 * The feature id for the '<em><b>Maxterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM = TMTCIF_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER_FEATURE_COUNT = TMTCIF_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FILTER_OPERATION_COUNT = TMTCIF_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermFilterImpl <em>TMTCIF Filter Minterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermFilterImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMintermFilter()
	 * @generated
	 */
	int TMTCIF_FILTER_MINTERM_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__NAME = TMTCIF_FILTER_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__URI = TMTCIF_FILTER_FILTER__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__VERSION = TMTCIF_FILTER_FILTER__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__DESCRIPTION = TMTCIF_FILTER_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__FORMAT_FILE = TMTCIF_FILTER_FILTER__FORMAT_FILE;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__BOOL_VAR = TMTCIF_FILTER_FILTER__BOOL_VAR;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC = TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC;

	/**
	 * The feature id for the '<em><b>Minterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER__MINTERM = TMTCIF_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER_FEATURE_COUNT = TMTCIF_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FILTER_OPERATION_COUNT = TMTCIF_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarImpl <em>TMTCIF Filter Bool Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVar()
	 * @generated
	 */
	int TMTCIF_FILTER_BOOL_VAR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR__SELECT_LINE = 7;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFieldOpImpl <em>TMTCIF Filter Field Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFieldOpImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterFieldOp()
	 * @generated
	 */
	int TMTCIF_FILTER_FIELD_OP = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FIELD_OP__TYPE = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Field Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FIELD_OP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Field Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_FIELD_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterConstantImpl <em>TMTCIF Filter Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterConstantImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterConstant()
	 * @generated
	 */
	int TMTCIF_FILTER_CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_CONSTANT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_CONSTANT__MASK = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_CONSTANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectImpl <em>TMTCIF Filter Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelect()
	 * @generated
	 */
	int TMTCIF_FILTER_SELECT = 6;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT__FROM_FILE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT__MASK = 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectLineImpl <em>TMTCIF Filter Select Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectLineImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelectLine()
	 * @generated
	 */
	int TMTCIF_FILTER_SELECT_LINE = 7;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE__FROM_FILE = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE__LINE = 1;

	/**
	 * The feature id for the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE__LEFT_TRIM = 2;

	/**
	 * The feature id for the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE__RIGHT_TRIM = 3;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE__MASK = 4;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Select Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Select Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_SELECT_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl <em>TMTCIF Filter Bool Var From Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>AI Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE = 7;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Bool Var From Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Bool Var From Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromGroupedArrayItemImpl <em>TMTCIF Filter Bool Var From Grouped Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromGroupedArrayItemImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP = 3;

	/**
	 * The feature id for the '<em><b>AI Field Refs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS = 4;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = 5;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = 7;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE = 8;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFDICImpl <em>TMTCIF Filter Bool Var FDIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFDICImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFDIC()
	 * @generated
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC__OP = 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Bool Var FDIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Bool Var FDIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_FDIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermImpl <em>TMTCIF Filter Maxterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMaxterm()
	 * @generated
	 */
	int TMTCIF_FILTER_MAXTERM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM__BOOL_VAR_REF = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Maxterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Maxterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MAXTERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl <em>TMTCIF Filter Minterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMinterm()
	 * @generated
	 */
	int TMTCIF_FILTER_MINTERM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM__BOOL_VAR_REF = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Minterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Minterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_MINTERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarRefImpl <em>TMTCIF Filter Bool Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarRefImpl
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarRef()
	 * @generated
	 */
	int TMTCIF_FILTER_BOOL_VAR_REF = 13;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_REF__ID_REF = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Filter Bool Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Filter Bool Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_FILTER_BOOL_VAR_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType <em>TMTCIF Filter Constant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterConstantType()
	 * @generated
	 */
	int TMTCIF_FILTER_CONSTANT_TYPE = 14;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType <em>TMTCIF Filter OP Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterOPType()
	 * @generated
	 */
	int TMTCIF_FILTER_OP_TYPE = 15;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType <em>TMTCIF Filter Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType
	 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelectType()
	 * @generated
	 */
	int TMTCIF_FILTER_SELECT_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter <em>TMTCIF Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Filter</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter
	 * @generated
	 */
	EClass getTMTCIFFilterFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getFormatFile <em>Format File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Format File</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getFormatFile()
	 * @see #getTMTCIFFilterFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterFilter_FormatFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVar <em>Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVar()
	 * @see #getTMTCIFFilterFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterFilter_BoolVar();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var From Array Item</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromArrayItem()
	 * @see #getTMTCIFFilterFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterFilter_BoolVarFromArrayItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var From Grouped Array Item</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromGroupedArrayItem()
	 * @see #getTMTCIFFilterFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterFilter_BoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var FDIC</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFDIC()
	 * @see #getTMTCIFFilterFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterFilter_BoolVarFDIC();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter <em>TMTCIF Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Maxterm Filter</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter
	 * @generated
	 */
	EClass getTMTCIFFilterMaxtermFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter#getMaxterm <em>Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maxterm</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter#getMaxterm()
	 * @see #getTMTCIFFilterMaxtermFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterMaxtermFilter_Maxterm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter <em>TMTCIF Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Minterm Filter</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter
	 * @generated
	 */
	EClass getTMTCIFFilterMintermFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter#getMinterm <em>Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minterm</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter#getMinterm()
	 * @see #getTMTCIFFilterMintermFilter()
	 * @generated
	 */
	EReference getTMTCIFFilterMintermFilter_Minterm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar <em>TMTCIF Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Bool Var</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar
	 * @generated
	 */
	EClass getTMTCIFFilterBoolVar();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getId()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getName()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getConstantType()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVar_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getFieldRef()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVar_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getOp()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVar_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getConstant()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVar_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getSelect()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVar_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar#getSelectLine()
	 * @see #getTMTCIFFilterBoolVar()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVar_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp <em>TMTCIF Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Field Op</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp
	 * @generated
	 */
	EClass getTMTCIFFilterFieldOp();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp#getType()
	 * @see #getTMTCIFFilterFieldOp()
	 * @generated
	 */
	EAttribute getTMTCIFFilterFieldOp_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant <em>TMTCIF Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Constant</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant
	 * @generated
	 */
	EClass getTMTCIFFilterConstant();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant#getValue()
	 * @see #getTMTCIFFilterConstant()
	 * @generated
	 */
	EAttribute getTMTCIFFilterConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant#getMask()
	 * @see #getTMTCIFFilterConstant()
	 * @generated
	 */
	EAttribute getTMTCIFFilterConstant_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect <em>TMTCIF Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Select</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect
	 * @generated
	 */
	EClass getTMTCIFFilterSelect();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getFromFile()
	 * @see #getTMTCIFFilterSelect()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelect_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getType()
	 * @see #getTMTCIFFilterSelect()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelect_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getOffset()
	 * @see #getTMTCIFFilterSelect()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelect_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getSize()
	 * @see #getTMTCIFFilterSelect()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelect_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect#getMask()
	 * @see #getTMTCIFFilterSelect()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelect_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine <em>TMTCIF Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Select Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine
	 * @generated
	 */
	EClass getTMTCIFFilterSelectLine();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getFromFile()
	 * @see #getTMTCIFFilterSelectLine()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelectLine_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getLine()
	 * @see #getTMTCIFFilterSelectLine()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelectLine_Line();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getLeftTrim <em>Left Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Trim</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getLeftTrim()
	 * @see #getTMTCIFFilterSelectLine()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelectLine_LeftTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getRightTrim <em>Right Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Trim</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getRightTrim()
	 * @see #getTMTCIFFilterSelectLine()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelectLine_RightTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine#getMask()
	 * @see #getTMTCIFFilterSelectLine()
	 * @generated
	 */
	EAttribute getTMTCIFFilterSelectLine_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem <em>TMTCIF Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Bool Var From Array Item</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem
	 * @generated
	 */
	EClass getTMTCIFFilterBoolVarFromArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getId()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getName()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstantType()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromArrayItem_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getAIFieldRef()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromArrayItem_AIFieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getOp()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromArrayItem_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstant()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromArrayItem_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelect()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromArrayItem_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelectLine()
	 * @see #getTMTCIFFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem <em>TMTCIF Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	EClass getTMTCIFFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getId()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getName()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstantType()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_ConstantType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getGroup()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Group();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Refs</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getAIFieldRefs()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_AIFieldRefs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getOp()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstant()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelect()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelectLine()
	 * @see #getTMTCIFFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC <em>TMTCIF Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Bool Var FDIC</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC
	 * @generated
	 */
	EClass getTMTCIFFilterBoolVarFDIC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getId()
	 * @see #getTMTCIFFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFDIC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getName()
	 * @see #getTMTCIFFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarFDIC_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getFieldRef()
	 * @see #getTMTCIFFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFDIC_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getOp()
	 * @see #getTMTCIFFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getTMTCIFFilterBoolVarFDIC_Op();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm <em>TMTCIF Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Maxterm</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm
	 * @generated
	 */
	EClass getTMTCIFFilterMaxterm();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm#getId()
	 * @see #getTMTCIFFilterMaxterm()
	 * @generated
	 */
	EAttribute getTMTCIFFilterMaxterm_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm#getBoolVarRef()
	 * @see #getTMTCIFFilterMaxterm()
	 * @generated
	 */
	EReference getTMTCIFFilterMaxterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm <em>TMTCIF Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Minterm</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm
	 * @generated
	 */
	EClass getTMTCIFFilterMinterm();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm#getId()
	 * @see #getTMTCIFFilterMinterm()
	 * @generated
	 */
	EAttribute getTMTCIFFilterMinterm_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm#getBoolVarRef()
	 * @see #getTMTCIFFilterMinterm()
	 * @generated
	 */
	EReference getTMTCIFFilterMinterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef <em>TMTCIF Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Filter Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef
	 * @generated
	 */
	EClass getTMTCIFFilterBoolVarRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef#getIdRef()
	 * @see #getTMTCIFFilterBoolVarRef()
	 * @generated
	 */
	EAttribute getTMTCIFFilterBoolVarRef_IdRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType <em>TMTCIF Filter Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Filter Constant Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
	 * @generated
	 */
	EEnum getTMTCIFFilterConstantType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType <em>TMTCIF Filter OP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Filter OP Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType
	 * @generated
	 */
	EEnum getTMTCIFFilterOPType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType <em>TMTCIF Filter Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMTCIF Filter Select Type</em>'.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType
	 * @generated
	 */
	EEnum getTMTCIFFilterSelectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	filterFactory getfilterFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl <em>TMTCIF Filter Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterFilter()
		 * @generated
		 */
		EClass TMTCIF_FILTER_FILTER = eINSTANCE.getTMTCIFFilterFilter();

		/**
		 * The meta object literal for the '<em><b>Format File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_FILTER__FORMAT_FILE = eINSTANCE.getTMTCIFFilterFilter_FormatFile();

		/**
		 * The meta object literal for the '<em><b>Bool Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_FILTER__BOOL_VAR = eINSTANCE.getTMTCIFFilterFilter_BoolVar();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Array Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getTMTCIFFilterFilter_BoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getTMTCIFFilterFilter_BoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var FDIC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC = eINSTANCE.getTMTCIFFilterFilter_BoolVarFDIC();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermFilterImpl <em>TMTCIF Filter Maxterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermFilterImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMaxtermFilter()
		 * @generated
		 */
		EClass TMTCIF_FILTER_MAXTERM_FILTER = eINSTANCE.getTMTCIFFilterMaxtermFilter();

		/**
		 * The meta object literal for the '<em><b>Maxterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM = eINSTANCE.getTMTCIFFilterMaxtermFilter_Maxterm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermFilterImpl <em>TMTCIF Filter Minterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermFilterImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMintermFilter()
		 * @generated
		 */
		EClass TMTCIF_FILTER_MINTERM_FILTER = eINSTANCE.getTMTCIFFilterMintermFilter();

		/**
		 * The meta object literal for the '<em><b>Minterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_MINTERM_FILTER__MINTERM = eINSTANCE.getTMTCIFFilterMintermFilter_Minterm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarImpl <em>TMTCIF Filter Bool Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVar()
		 * @generated
		 */
		EClass TMTCIF_FILTER_BOOL_VAR = eINSTANCE.getTMTCIFFilterBoolVar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR__ID = eINSTANCE.getTMTCIFFilterBoolVar_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR__NAME = eINSTANCE.getTMTCIFFilterBoolVar_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR__CONSTANT_TYPE = eINSTANCE.getTMTCIFFilterBoolVar_ConstantType();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR__FIELD_REF = eINSTANCE.getTMTCIFFilterBoolVar_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR__OP = eINSTANCE.getTMTCIFFilterBoolVar_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR__CONSTANT = eINSTANCE.getTMTCIFFilterBoolVar_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR__SELECT = eINSTANCE.getTMTCIFFilterBoolVar_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR__SELECT_LINE = eINSTANCE.getTMTCIFFilterBoolVar_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFieldOpImpl <em>TMTCIF Filter Field Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFieldOpImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterFieldOp()
		 * @generated
		 */
		EClass TMTCIF_FILTER_FIELD_OP = eINSTANCE.getTMTCIFFilterFieldOp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_FIELD_OP__TYPE = eINSTANCE.getTMTCIFFilterFieldOp_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterConstantImpl <em>TMTCIF Filter Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterConstantImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterConstant()
		 * @generated
		 */
		EClass TMTCIF_FILTER_CONSTANT = eINSTANCE.getTMTCIFFilterConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_CONSTANT__VALUE = eINSTANCE.getTMTCIFFilterConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_CONSTANT__MASK = eINSTANCE.getTMTCIFFilterConstant_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectImpl <em>TMTCIF Filter Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelect()
		 * @generated
		 */
		EClass TMTCIF_FILTER_SELECT = eINSTANCE.getTMTCIFFilterSelect();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT__FROM_FILE = eINSTANCE.getTMTCIFFilterSelect_FromFile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT__TYPE = eINSTANCE.getTMTCIFFilterSelect_Type();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT__OFFSET = eINSTANCE.getTMTCIFFilterSelect_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT__SIZE = eINSTANCE.getTMTCIFFilterSelect_Size();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT__MASK = eINSTANCE.getTMTCIFFilterSelect_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectLineImpl <em>TMTCIF Filter Select Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterSelectLineImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelectLine()
		 * @generated
		 */
		EClass TMTCIF_FILTER_SELECT_LINE = eINSTANCE.getTMTCIFFilterSelectLine();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT_LINE__FROM_FILE = eINSTANCE.getTMTCIFFilterSelectLine_FromFile();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT_LINE__LINE = eINSTANCE.getTMTCIFFilterSelectLine_Line();

		/**
		 * The meta object literal for the '<em><b>Left Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT_LINE__LEFT_TRIM = eINSTANCE.getTMTCIFFilterSelectLine_LeftTrim();

		/**
		 * The meta object literal for the '<em><b>Right Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT_LINE__RIGHT_TRIM = eINSTANCE.getTMTCIFFilterSelectLine_RightTrim();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_SELECT_LINE__MASK = eINSTANCE.getTMTCIFFilterSelectLine_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl <em>TMTCIF Filter Bool Var From Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFromArrayItem()
		 * @generated
		 */
		EClass TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_ConstantType();

		/**
		 * The meta object literal for the '<em><b>AI Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_AIFieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getTMTCIFFilterBoolVarFromArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromGroupedArrayItemImpl <em>TMTCIF Filter Bool Var From Grouped Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromGroupedArrayItemImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFromGroupedArrayItem()
		 * @generated
		 */
		EClass TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_ConstantType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Group();

		/**
		 * The meta object literal for the '<em><b>AI Field Refs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_AIFieldRefs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getTMTCIFFilterBoolVarFromGroupedArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFDICImpl <em>TMTCIF Filter Bool Var FDIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFDICImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarFDIC()
		 * @generated
		 */
		EClass TMTCIF_FILTER_BOOL_VAR_FDIC = eINSTANCE.getTMTCIFFilterBoolVarFDIC();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FDIC__ID = eINSTANCE.getTMTCIFFilterBoolVarFDIC_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_FDIC__NAME = eINSTANCE.getTMTCIFFilterBoolVarFDIC_Name();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FDIC__FIELD_REF = eINSTANCE.getTMTCIFFilterBoolVarFDIC_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_BOOL_VAR_FDIC__OP = eINSTANCE.getTMTCIFFilterBoolVarFDIC_Op();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermImpl <em>TMTCIF Filter Maxterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMaxterm()
		 * @generated
		 */
		EClass TMTCIF_FILTER_MAXTERM = eINSTANCE.getTMTCIFFilterMaxterm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_MAXTERM__ID = eINSTANCE.getTMTCIFFilterMaxterm_Id();

		/**
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_MAXTERM__BOOL_VAR_REF = eINSTANCE.getTMTCIFFilterMaxterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl <em>TMTCIF Filter Minterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterMinterm()
		 * @generated
		 */
		EClass TMTCIF_FILTER_MINTERM = eINSTANCE.getTMTCIFFilterMinterm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_MINTERM__ID = eINSTANCE.getTMTCIFFilterMinterm_Id();

		/**
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_FILTER_MINTERM__BOOL_VAR_REF = eINSTANCE.getTMTCIFFilterMinterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarRefImpl <em>TMTCIF Filter Bool Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarRefImpl
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterBoolVarRef()
		 * @generated
		 */
		EClass TMTCIF_FILTER_BOOL_VAR_REF = eINSTANCE.getTMTCIFFilterBoolVarRef();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_FILTER_BOOL_VAR_REF__ID_REF = eINSTANCE.getTMTCIFFilterBoolVarRef_IdRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType <em>TMTCIF Filter Constant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterConstantType()
		 * @generated
		 */
		EEnum TMTCIF_FILTER_CONSTANT_TYPE = eINSTANCE.getTMTCIFFilterConstantType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType <em>TMTCIF Filter OP Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterOPType()
		 * @generated
		 */
		EEnum TMTCIF_FILTER_OP_TYPE = eINSTANCE.getTMTCIFFilterOPType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType <em>TMTCIF Filter Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType
		 * @see es.uah.aut.srg.tmtcif.filter.impl.filterPackageImpl#getTMTCIFFilterSelectType()
		 * @generated
		 */
		EEnum TMTCIF_FILTER_SELECT_TYPE = eINSTANCE.getTMTCIFFilterSelectType();

	}

} //filterPackage
