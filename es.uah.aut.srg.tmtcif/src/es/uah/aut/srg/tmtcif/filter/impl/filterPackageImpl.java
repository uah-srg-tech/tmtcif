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
package es.uah.aut.srg.tmtcif.filter.impl;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterOPType;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectType;
import es.uah.aut.srg.tmtcif.filter.filterFactory;
import es.uah.aut.srg.tmtcif.filter.filterPackage;

import es.uah.aut.srg.tmtcif.format.formatPackage;

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
public class filterPackageImpl extends EPackageImpl implements filterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterMaxtermFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterMintermFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterBoolVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterFieldOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterSelectLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterBoolVarFromArrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterBoolVarFromGroupedArrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterBoolVarFDICEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterMaxtermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterMintermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFilterBoolVarRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFilterConstantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFilterOPTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFilterSelectTypeEEnum = null;

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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private filterPackageImpl() {
		super(eNS_URI, filterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link filterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static filterPackage init() {
		if (isInited) return (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);

		// Obtain or create and register package
		filterPackageImpl thefilterPackage = (filterPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof filterPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new filterPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thefilterPackage.createPackageContents();

		// Initialize created meta-data
		thefilterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thefilterPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(filterPackage.eNS_URI, thefilterPackage);
		return thefilterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterFilter() {
		return tmtcifFilterFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterFilter_FormatFile() {
		return (EReference)tmtcifFilterFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterFilter_BoolVar() {
		return (EReference)tmtcifFilterFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterFilter_BoolVarFromArrayItem() {
		return (EReference)tmtcifFilterFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterFilter_BoolVarFromGroupedArrayItem() {
		return (EReference)tmtcifFilterFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterFilter_BoolVarFDIC() {
		return (EReference)tmtcifFilterFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterMaxtermFilter() {
		return tmtcifFilterMaxtermFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterMaxtermFilter_Maxterm() {
		return (EReference)tmtcifFilterMaxtermFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterMintermFilter() {
		return tmtcifFilterMintermFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterMintermFilter_Minterm() {
		return (EReference)tmtcifFilterMintermFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterBoolVar() {
		return tmtcifFilterBoolVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVar_Id() {
		return (EAttribute)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVar_Name() {
		return (EAttribute)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVar_ConstantType() {
		return (EAttribute)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVar_FieldRef() {
		return (EReference)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVar_Op() {
		return (EReference)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVar_Constant() {
		return (EReference)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVar_Select() {
		return (EReference)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVar_SelectLine() {
		return (EReference)tmtcifFilterBoolVarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterFieldOp() {
		return tmtcifFilterFieldOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterFieldOp_Type() {
		return (EAttribute)tmtcifFilterFieldOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterConstant() {
		return tmtcifFilterConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterConstant_Value() {
		return (EAttribute)tmtcifFilterConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterConstant_Mask() {
		return (EAttribute)tmtcifFilterConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterSelect() {
		return tmtcifFilterSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelect_FromFile() {
		return (EAttribute)tmtcifFilterSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelect_Type() {
		return (EAttribute)tmtcifFilterSelectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelect_Offset() {
		return (EAttribute)tmtcifFilterSelectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelect_Size() {
		return (EAttribute)tmtcifFilterSelectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelect_Mask() {
		return (EAttribute)tmtcifFilterSelectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterSelectLine() {
		return tmtcifFilterSelectLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelectLine_FromFile() {
		return (EAttribute)tmtcifFilterSelectLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelectLine_Line() {
		return (EAttribute)tmtcifFilterSelectLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelectLine_LeftTrim() {
		return (EAttribute)tmtcifFilterSelectLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelectLine_RightTrim() {
		return (EAttribute)tmtcifFilterSelectLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterSelectLine_Mask() {
		return (EAttribute)tmtcifFilterSelectLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterBoolVarFromArrayItem() {
		return tmtcifFilterBoolVarFromArrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromArrayItem_Id() {
		return (EAttribute)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromArrayItem_Name() {
		return (EAttribute)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromArrayItem_ConstantType() {
		return (EAttribute)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromArrayItem_AIFieldRef() {
		return (EReference)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromArrayItem_Op() {
		return (EReference)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromArrayItem_Constant() {
		return (EReference)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromArrayItem_Select() {
		return (EReference)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromArrayItem_SelectLine() {
		return (EReference)tmtcifFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterBoolVarFromGroupedArrayItem() {
		return tmtcifFilterBoolVarFromGroupedArrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Id() {
		return (EAttribute)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Name() {
		return (EAttribute)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_ConstantType() {
		return (EAttribute)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFromGroupedArrayItem_Group() {
		return (EAttribute)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_AIFieldRefs() {
		return (EReference)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Op() {
		return (EReference)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Constant() {
		return (EReference)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_Select() {
		return (EReference)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFromGroupedArrayItem_SelectLine() {
		return (EReference)tmtcifFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterBoolVarFDIC() {
		return tmtcifFilterBoolVarFDICEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFDIC_Id() {
		return (EAttribute)tmtcifFilterBoolVarFDICEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarFDIC_Name() {
		return (EAttribute)tmtcifFilterBoolVarFDICEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFDIC_FieldRef() {
		return (EReference)tmtcifFilterBoolVarFDICEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterBoolVarFDIC_Op() {
		return (EReference)tmtcifFilterBoolVarFDICEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterMaxterm() {
		return tmtcifFilterMaxtermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterMaxterm_Id() {
		return (EAttribute)tmtcifFilterMaxtermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterMaxterm_BoolVarRef() {
		return (EReference)tmtcifFilterMaxtermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterMinterm() {
		return tmtcifFilterMintermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterMinterm_Id() {
		return (EAttribute)tmtcifFilterMintermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFilterMinterm_BoolVarRef() {
		return (EReference)tmtcifFilterMintermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFilterBoolVarRef() {
		return tmtcifFilterBoolVarRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFilterBoolVarRef_IdRef() {
		return (EAttribute)tmtcifFilterBoolVarRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFilterConstantType() {
		return tmtcifFilterConstantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFilterOPType() {
		return tmtcifFilterOPTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFilterSelectType() {
		return tmtcifFilterSelectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterFactory getfilterFactory() {
		return (filterFactory)getEFactoryInstance();
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
		tmtcifFilterFilterEClass = createEClass(TMTCIF_FILTER_FILTER);
		createEReference(tmtcifFilterFilterEClass, TMTCIF_FILTER_FILTER__FORMAT_FILE);
		createEReference(tmtcifFilterFilterEClass, TMTCIF_FILTER_FILTER__BOOL_VAR);
		createEReference(tmtcifFilterFilterEClass, TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
		createEReference(tmtcifFilterFilterEClass, TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		createEReference(tmtcifFilterFilterEClass, TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC);

		tmtcifFilterMaxtermFilterEClass = createEClass(TMTCIF_FILTER_MAXTERM_FILTER);
		createEReference(tmtcifFilterMaxtermFilterEClass, TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM);

		tmtcifFilterMintermFilterEClass = createEClass(TMTCIF_FILTER_MINTERM_FILTER);
		createEReference(tmtcifFilterMintermFilterEClass, TMTCIF_FILTER_MINTERM_FILTER__MINTERM);

		tmtcifFilterBoolVarEClass = createEClass(TMTCIF_FILTER_BOOL_VAR);
		createEAttribute(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__ID);
		createEAttribute(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__NAME);
		createEAttribute(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__CONSTANT_TYPE);
		createEReference(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__FIELD_REF);
		createEReference(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__OP);
		createEReference(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__CONSTANT);
		createEReference(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__SELECT);
		createEReference(tmtcifFilterBoolVarEClass, TMTCIF_FILTER_BOOL_VAR__SELECT_LINE);

		tmtcifFilterFieldOpEClass = createEClass(TMTCIF_FILTER_FIELD_OP);
		createEAttribute(tmtcifFilterFieldOpEClass, TMTCIF_FILTER_FIELD_OP__TYPE);

		tmtcifFilterConstantEClass = createEClass(TMTCIF_FILTER_CONSTANT);
		createEAttribute(tmtcifFilterConstantEClass, TMTCIF_FILTER_CONSTANT__VALUE);
		createEAttribute(tmtcifFilterConstantEClass, TMTCIF_FILTER_CONSTANT__MASK);

		tmtcifFilterSelectEClass = createEClass(TMTCIF_FILTER_SELECT);
		createEAttribute(tmtcifFilterSelectEClass, TMTCIF_FILTER_SELECT__FROM_FILE);
		createEAttribute(tmtcifFilterSelectEClass, TMTCIF_FILTER_SELECT__TYPE);
		createEAttribute(tmtcifFilterSelectEClass, TMTCIF_FILTER_SELECT__OFFSET);
		createEAttribute(tmtcifFilterSelectEClass, TMTCIF_FILTER_SELECT__SIZE);
		createEAttribute(tmtcifFilterSelectEClass, TMTCIF_FILTER_SELECT__MASK);

		tmtcifFilterSelectLineEClass = createEClass(TMTCIF_FILTER_SELECT_LINE);
		createEAttribute(tmtcifFilterSelectLineEClass, TMTCIF_FILTER_SELECT_LINE__FROM_FILE);
		createEAttribute(tmtcifFilterSelectLineEClass, TMTCIF_FILTER_SELECT_LINE__LINE);
		createEAttribute(tmtcifFilterSelectLineEClass, TMTCIF_FILTER_SELECT_LINE__LEFT_TRIM);
		createEAttribute(tmtcifFilterSelectLineEClass, TMTCIF_FILTER_SELECT_LINE__RIGHT_TRIM);
		createEAttribute(tmtcifFilterSelectLineEClass, TMTCIF_FILTER_SELECT_LINE__MASK);

		tmtcifFilterBoolVarFromArrayItemEClass = createEClass(TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM);
		createEAttribute(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID);
		createEAttribute(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME);
		createEAttribute(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE);
		createEReference(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF);
		createEReference(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP);
		createEReference(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT);
		createEReference(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT);
		createEReference(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE);

		tmtcifFilterBoolVarFromGroupedArrayItemEClass = createEClass(TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		createEAttribute(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID);
		createEAttribute(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME);
		createEAttribute(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE);
		createEAttribute(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP);
		createEReference(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS);
		createEReference(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP);
		createEReference(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT);
		createEReference(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT);
		createEReference(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE);

		tmtcifFilterBoolVarFDICEClass = createEClass(TMTCIF_FILTER_BOOL_VAR_FDIC);
		createEAttribute(tmtcifFilterBoolVarFDICEClass, TMTCIF_FILTER_BOOL_VAR_FDIC__ID);
		createEAttribute(tmtcifFilterBoolVarFDICEClass, TMTCIF_FILTER_BOOL_VAR_FDIC__NAME);
		createEReference(tmtcifFilterBoolVarFDICEClass, TMTCIF_FILTER_BOOL_VAR_FDIC__FIELD_REF);
		createEReference(tmtcifFilterBoolVarFDICEClass, TMTCIF_FILTER_BOOL_VAR_FDIC__OP);

		tmtcifFilterMaxtermEClass = createEClass(TMTCIF_FILTER_MAXTERM);
		createEAttribute(tmtcifFilterMaxtermEClass, TMTCIF_FILTER_MAXTERM__ID);
		createEReference(tmtcifFilterMaxtermEClass, TMTCIF_FILTER_MAXTERM__BOOL_VAR_REF);

		tmtcifFilterMintermEClass = createEClass(TMTCIF_FILTER_MINTERM);
		createEAttribute(tmtcifFilterMintermEClass, TMTCIF_FILTER_MINTERM__ID);
		createEReference(tmtcifFilterMintermEClass, TMTCIF_FILTER_MINTERM__BOOL_VAR_REF);

		tmtcifFilterBoolVarRefEClass = createEClass(TMTCIF_FILTER_BOOL_VAR_REF);
		createEAttribute(tmtcifFilterBoolVarRefEClass, TMTCIF_FILTER_BOOL_VAR_REF__ID_REF);

		// Create enums
		tmtcifFilterConstantTypeEEnum = createEEnum(TMTCIF_FILTER_CONSTANT_TYPE);
		tmtcifFilterOPTypeEEnum = createEEnum(TMTCIF_FILTER_OP_TYPE);
		tmtcifFilterSelectTypeEEnum = createEEnum(TMTCIF_FILTER_SELECT_TYPE);
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
		tmtcifFilterFilterEClass.getESuperTypes().add(thecommonPackage.getTMTCIFModelElement());
		tmtcifFilterMaxtermFilterEClass.getESuperTypes().add(this.getTMTCIFFilterFilter());
		tmtcifFilterMintermFilterEClass.getESuperTypes().add(this.getTMTCIFFilterFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifFilterFilterEClass, TMTCIFFilterFilter.class, "TMTCIFFilterFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFilterFilter_FormatFile(), theformatPackage.getTMTCIFFormatFormat(), null, "formatFile", null, 1, 1, TMTCIFFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterFilter_BoolVar(), this.getTMTCIFFilterBoolVar(), null, "BoolVar", null, 0, -1, TMTCIFFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterFilter_BoolVarFromArrayItem(), this.getTMTCIFFilterBoolVarFromArrayItem(), null, "BoolVarFromArrayItem", null, 0, -1, TMTCIFFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterFilter_BoolVarFromGroupedArrayItem(), this.getTMTCIFFilterBoolVarFromGroupedArrayItem(), null, "BoolVarFromGroupedArrayItem", null, 0, -1, TMTCIFFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterFilter_BoolVarFDIC(), this.getTMTCIFFilterBoolVarFDIC(), null, "BoolVarFDIC", null, 0, -1, TMTCIFFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterMaxtermFilterEClass, TMTCIFFilterMaxtermFilter.class, "TMTCIFFilterMaxtermFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFilterMaxtermFilter_Maxterm(), this.getTMTCIFFilterMaxterm(), null, "Maxterm", null, 1, 10, TMTCIFFilterMaxtermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterMintermFilterEClass, TMTCIFFilterMintermFilter.class, "TMTCIFFilterMintermFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFilterMintermFilter_Minterm(), this.getTMTCIFFilterMinterm(), null, "Minterm", null, 1, 10, TMTCIFFilterMintermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterBoolVarEClass, TMTCIFFilterBoolVar.class, "TMTCIFFilterBoolVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterBoolVar_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVar_ConstantType(), this.getTMTCIFFilterConstantType(), "constantType", null, 1, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVar_FieldRef(), theformatPackage.getTMTCIFFormatField(), null, "FieldRef", null, 1, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVar_Op(), this.getTMTCIFFilterFieldOp(), null, "Op", null, 1, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVar_Constant(), this.getTMTCIFFilterConstant(), null, "Constant", null, 0, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVar_Select(), this.getTMTCIFFilterSelect(), null, "Select", null, 0, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVar_SelectLine(), this.getTMTCIFFilterSelectLine(), null, "SelectLine", null, 0, 1, TMTCIFFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterFieldOpEClass, TMTCIFFilterFieldOp.class, "TMTCIFFilterFieldOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterFieldOp_Type(), this.getTMTCIFFilterOPType(), "type", null, 1, 1, TMTCIFFilterFieldOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterConstantEClass, TMTCIFFilterConstant.class, "TMTCIFFilterConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, TMTCIFFilterConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterConstant_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, TMTCIFFilterConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterSelectEClass, TMTCIFFilterSelect.class, "TMTCIFFilterSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterSelect_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, TMTCIFFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelect_Type(), this.getTMTCIFFilterSelectType(), "type", null, 1, 1, TMTCIFFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelect_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, TMTCIFFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelect_Size(), ecorePackage.getEString(), "size", null, 0, 1, TMTCIFFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelect_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, TMTCIFFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterSelectLineEClass, TMTCIFFilterSelectLine.class, "TMTCIFFilterSelectLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterSelectLine_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, TMTCIFFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelectLine_Line(), ecorePackage.getEString(), "line", null, 1, 1, TMTCIFFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelectLine_LeftTrim(), ecorePackage.getEString(), "leftTrim", null, 0, 1, TMTCIFFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelectLine_RightTrim(), ecorePackage.getEString(), "rightTrim", null, 0, 1, TMTCIFFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterSelectLine_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, TMTCIFFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterBoolVarFromArrayItemEClass, TMTCIFFilterBoolVarFromArrayItem.class, "TMTCIFFilterBoolVarFromArrayItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterBoolVarFromArrayItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFromArrayItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFromArrayItem_ConstantType(), this.getTMTCIFFilterConstantType(), "constantType", null, 1, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromArrayItem_AIFieldRef(), theformatPackage.getTMTCIFFormatAIField(), null, "AIFieldRef", null, 1, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromArrayItem_Op(), this.getTMTCIFFilterFieldOp(), null, "Op", null, 1, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromArrayItem_Constant(), this.getTMTCIFFilterConstant(), null, "Constant", null, 0, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromArrayItem_Select(), this.getTMTCIFFilterSelect(), null, "Select", null, 0, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromArrayItem_SelectLine(), this.getTMTCIFFilterSelectLine(), null, "SelectLine", null, 0, 1, TMTCIFFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterBoolVarFromGroupedArrayItemEClass, TMTCIFFilterBoolVarFromGroupedArrayItem.class, "TMTCIFFilterBoolVarFromGroupedArrayItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterBoolVarFromGroupedArrayItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFromGroupedArrayItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFromGroupedArrayItem_ConstantType(), this.getTMTCIFFilterConstantType(), "constantType", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFromGroupedArrayItem_Group(), ecorePackage.getEString(), "group", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromGroupedArrayItem_AIFieldRefs(), theformatPackage.getTMTCIFFormatAField(), null, "AIFieldRefs", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromGroupedArrayItem_Op(), this.getTMTCIFFilterFieldOp(), null, "Op", null, 1, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromGroupedArrayItem_Constant(), this.getTMTCIFFilterConstant(), null, "Constant", null, 0, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromGroupedArrayItem_Select(), this.getTMTCIFFilterSelect(), null, "Select", null, 0, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFromGroupedArrayItem_SelectLine(), this.getTMTCIFFilterSelectLine(), null, "SelectLine", null, 0, 1, TMTCIFFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterBoolVarFDICEClass, TMTCIFFilterBoolVarFDIC.class, "TMTCIFFilterBoolVarFDIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterBoolVarFDIC_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFilterBoolVarFDIC_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFDIC_FieldRef(), theformatPackage.getTMTCIFFormatFDICField(), null, "FieldRef", null, 1, 1, TMTCIFFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterBoolVarFDIC_Op(), this.getTMTCIFFilterFieldOp(), null, "Op", null, 1, 1, TMTCIFFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterMaxtermEClass, TMTCIFFilterMaxterm.class, "TMTCIFFilterMaxterm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterMaxterm_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterMaxterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterMaxterm_BoolVarRef(), this.getTMTCIFFilterBoolVarRef(), null, "BoolVarRef", null, 1, -1, TMTCIFFilterMaxterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterMintermEClass, TMTCIFFilterMinterm.class, "TMTCIFFilterMinterm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterMinterm_Id(), ecorePackage.getEString(), "id", null, 1, 1, TMTCIFFilterMinterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFilterMinterm_BoolVarRef(), this.getTMTCIFFilterBoolVarRef(), null, "BoolVarRef", null, 1, -1, TMTCIFFilterMinterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFilterBoolVarRefEClass, TMTCIFFilterBoolVarRef.class, "TMTCIFFilterBoolVarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFilterBoolVarRef_IdRef(), ecorePackage.getEString(), "idRef", null, 1, 1, TMTCIFFilterBoolVarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.class, "TMTCIFFilterConstantType");
		addEEnumLiteral(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.DECIMAL);
		addEEnumLiteral(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.HEX);
		addEEnumLiteral(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.BINARY);
		addEEnumLiteral(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.CHAR);
		addEEnumLiteral(tmtcifFilterConstantTypeEEnum, TMTCIFFilterConstantType.STRING);

		initEEnum(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.class, "TMTCIFFilterOPType");
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.EQUAL);
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.DIFFERENT);
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.BIGGER_THAN);
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.SMALLER_THAN);
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.BIGGER_OR_EQUAL);
		addEEnumLiteral(tmtcifFilterOPTypeEEnum, TMTCIFFilterOPType.SMALLER_OR_EQUAL);

		initEEnum(tmtcifFilterSelectTypeEEnum, TMTCIFFilterSelectType.class, "TMTCIFFilterSelectType");
		addEEnumLiteral(tmtcifFilterSelectTypeEEnum, TMTCIFFilterSelectType.DATA);
		addEEnumLiteral(tmtcifFilterSelectTypeEEnum, TMTCIFFilterSelectType.SIZE);
		addEEnumLiteral(tmtcifFilterSelectTypeEEnum, TMTCIFFilterSelectType.CRC);

		// Create resource
		createResource(eNS_URI);
	}

} //filterPackageImpl
