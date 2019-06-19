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
package es.uah.aut.srg.tmtcif.format.impl;

import es.uah.aut.srg.tmtcif.common.commonPackage;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize;
import es.uah.aut.srg.tmtcif.format.formatFactory;
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
public class formatPackageImpl extends EPackageImpl implements formatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatCSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatCSFormulaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatVSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatVRFieldSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFDICFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatAFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatAIFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatBytesBitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatVariableSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFloatingOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatSortedFieldsToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatFieldToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatArrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifFormatArrayRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatFieldByteOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatSFieldFirstBitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatCheckTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tmtcifFormatPowerEEnum = null;

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
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private formatPackageImpl() {
		super(eNS_URI, formatFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link formatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static formatPackage init() {
		if (isInited) return (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Obtain or create and register package
		formatPackageImpl theformatPackage = (formatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof formatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new formatPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theformatPackage.createPackageContents();

		// Initialize created meta-data
		theformatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theformatPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(formatPackage.eNS_URI, theformatPackage);
		return theformatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatFormat() {
		return tmtcifFormatFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFormat_Protocol() {
		return (EAttribute)tmtcifFormatFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFormat_Type() {
		return (EAttribute)tmtcifFormatFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_CSField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_CSFormulaField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_VSField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_FDICField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_VRFieldSize() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_AField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFormat_AIField() {
		return (EReference)tmtcifFormatFormatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatField() {
		return tmtcifFormatFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatField_Fid() {
		return (EAttribute)tmtcifFormatFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatField_Pfid() {
		return (EAttribute)tmtcifFormatFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatCSField() {
		return tmtcifFormatCSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatCSField_Type() {
		return (EAttribute)tmtcifFormatCSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatCSField_ByteOrder() {
		return (EAttribute)tmtcifFormatCSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatCSField_FirstBit() {
		return (EAttribute)tmtcifFormatCSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatCSField_Size() {
		return (EReference)tmtcifFormatCSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatCSField_GlobalOffset() {
		return (EReference)tmtcifFormatCSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatCSFormulaField() {
		return tmtcifFormatCSFormulaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatCSFormulaField_Formula() {
		return (EReference)tmtcifFormatCSFormulaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatVSField() {
		return tmtcifFormatVSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVSField_Type() {
		return (EAttribute)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVSField_ByteOrder() {
		return (EAttribute)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVSField_FirstBit() {
		return (EAttribute)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatVSField_ConstSize() {
		return (EReference)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatVSField_VariableSize() {
		return (EReference)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatVSField_MaxSize() {
		return (EReference)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatVSField_GlobalOffset() {
		return (EReference)tmtcifFormatVSFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatVRFieldSize() {
		return tmtcifFormatVRFieldSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatFDICField() {
		return tmtcifFormatFDICFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFDICField_CheckType() {
		return (EAttribute)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFDICField_ByteOrder() {
		return (EAttribute)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFDICField_FirstBit() {
		return (EAttribute)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFDICField_Size() {
		return (EReference)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFDICField_FloatingOffset() {
		return (EReference)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatFDICField_SortedFieldsToCheck() {
		return (EReference)tmtcifFormatFDICFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatAField() {
		return tmtcifFormatAFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAField_Type() {
		return (EAttribute)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAField_ByteOrder() {
		return (EAttribute)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAField_FirstBit() {
		return (EAttribute)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAField_ArrayDimension() {
		return (EReference)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAField_Size() {
		return (EReference)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAField_GlobalOffset() {
		return (EReference)tmtcifFormatAFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatAIField() {
		return tmtcifFormatAIFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAIField_Type() {
		return (EAttribute)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAIField_ByteOrder() {
		return (EAttribute)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatAIField_FirstBit() {
		return (EAttribute)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAIField_ArrayRef() {
		return (EReference)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAIField_Size() {
		return (EReference)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatAIField_LocalOffset() {
		return (EReference)tmtcifFormatAIFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatBytesBits() {
		return tmtcifFormatBytesBitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatBytesBits_Bytes() {
		return (EAttribute)tmtcifFormatBytesBitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatBytesBits_Bits() {
		return (EAttribute)tmtcifFormatBytesBitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatFormula() {
		return tmtcifFormatFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFormula_Slope() {
		return (EAttribute)tmtcifFormatFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFormula_Intercept() {
		return (EAttribute)tmtcifFormatFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatVariableSize() {
		return tmtcifFormatVariableSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVariableSize_FidRef() {
		return (EAttribute)tmtcifFormatVariableSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVariableSize_Unit() {
		return (EAttribute)tmtcifFormatVariableSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatVariableSize_Power() {
		return (EAttribute)tmtcifFormatVariableSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatFloatingOffset() {
		return tmtcifFormatFloatingOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFloatingOffset_FidRef() {
		return (EAttribute)tmtcifFormatFloatingOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatSortedFieldsToCheck() {
		return tmtcifFormatSortedFieldsToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFFormatSortedFieldsToCheck_FieldToCheck() {
		return (EReference)tmtcifFormatSortedFieldsToCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatFieldToCheck() {
		return tmtcifFormatFieldToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatFieldToCheck_FidRef() {
		return (EAttribute)tmtcifFormatFieldToCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatArrayDimension() {
		return tmtcifFormatArrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatArrayDimension_FidRef() {
		return (EAttribute)tmtcifFormatArrayDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatArrayDimension_MaxItems() {
		return (EAttribute)tmtcifFormatArrayDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFFormatArrayRef() {
		return tmtcifFormatArrayRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFFormatArrayRef_FidRef() {
		return (EAttribute)tmtcifFormatArrayRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatFormatType() {
		return tmtcifFormatFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatFieldType() {
		return tmtcifFormatFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatFieldByteOrder() {
		return tmtcifFormatFieldByteOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatSFieldFirstBit() {
		return tmtcifFormatSFieldFirstBitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatCheckType() {
		return tmtcifFormatCheckTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatUnit() {
		return tmtcifFormatUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTMTCIFFormatPower() {
		return tmtcifFormatPowerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatFactory getformatFactory() {
		return (formatFactory)getEFactoryInstance();
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
		tmtcifFormatFormatEClass = createEClass(TMTCIF_FORMAT_FORMAT);
		createEAttribute(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__PROTOCOL);
		createEAttribute(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__TYPE);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__CS_FIELD);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__VS_FIELD);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__FDIC_FIELD);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__AFIELD);
		createEReference(tmtcifFormatFormatEClass, TMTCIF_FORMAT_FORMAT__AI_FIELD);

		tmtcifFormatFieldEClass = createEClass(TMTCIF_FORMAT_FIELD);
		createEAttribute(tmtcifFormatFieldEClass, TMTCIF_FORMAT_FIELD__FID);
		createEAttribute(tmtcifFormatFieldEClass, TMTCIF_FORMAT_FIELD__PFID);

		tmtcifFormatCSFieldEClass = createEClass(TMTCIF_FORMAT_CS_FIELD);
		createEAttribute(tmtcifFormatCSFieldEClass, TMTCIF_FORMAT_CS_FIELD__TYPE);
		createEAttribute(tmtcifFormatCSFieldEClass, TMTCIF_FORMAT_CS_FIELD__BYTE_ORDER);
		createEAttribute(tmtcifFormatCSFieldEClass, TMTCIF_FORMAT_CS_FIELD__FIRST_BIT);
		createEReference(tmtcifFormatCSFieldEClass, TMTCIF_FORMAT_CS_FIELD__SIZE);
		createEReference(tmtcifFormatCSFieldEClass, TMTCIF_FORMAT_CS_FIELD__GLOBAL_OFFSET);

		tmtcifFormatCSFormulaFieldEClass = createEClass(TMTCIF_FORMAT_CS_FORMULA_FIELD);
		createEReference(tmtcifFormatCSFormulaFieldEClass, TMTCIF_FORMAT_CS_FORMULA_FIELD__FORMULA);

		tmtcifFormatVSFieldEClass = createEClass(TMTCIF_FORMAT_VS_FIELD);
		createEAttribute(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__TYPE);
		createEAttribute(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER);
		createEAttribute(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__FIRST_BIT);
		createEReference(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__CONST_SIZE);
		createEReference(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE);
		createEReference(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__MAX_SIZE);
		createEReference(tmtcifFormatVSFieldEClass, TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET);

		tmtcifFormatVRFieldSizeEClass = createEClass(TMTCIF_FORMAT_VR_FIELD_SIZE);

		tmtcifFormatFDICFieldEClass = createEClass(TMTCIF_FORMAT_FDIC_FIELD);
		createEAttribute(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE);
		createEAttribute(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER);
		createEAttribute(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT);
		createEReference(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__SIZE);
		createEReference(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET);
		createEReference(tmtcifFormatFDICFieldEClass, TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK);

		tmtcifFormatAFieldEClass = createEClass(TMTCIF_FORMAT_AFIELD);
		createEAttribute(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__TYPE);
		createEAttribute(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__BYTE_ORDER);
		createEAttribute(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__FIRST_BIT);
		createEReference(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__ARRAY_DIMENSION);
		createEReference(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__SIZE);
		createEReference(tmtcifFormatAFieldEClass, TMTCIF_FORMAT_AFIELD__GLOBAL_OFFSET);

		tmtcifFormatAIFieldEClass = createEClass(TMTCIF_FORMAT_AI_FIELD);
		createEAttribute(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__TYPE);
		createEAttribute(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER);
		createEAttribute(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__FIRST_BIT);
		createEReference(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__ARRAY_REF);
		createEReference(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__SIZE);
		createEReference(tmtcifFormatAIFieldEClass, TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET);

		tmtcifFormatBytesBitsEClass = createEClass(TMTCIF_FORMAT_BYTES_BITS);
		createEAttribute(tmtcifFormatBytesBitsEClass, TMTCIF_FORMAT_BYTES_BITS__BYTES);
		createEAttribute(tmtcifFormatBytesBitsEClass, TMTCIF_FORMAT_BYTES_BITS__BITS);

		tmtcifFormatFormulaEClass = createEClass(TMTCIF_FORMAT_FORMULA);
		createEAttribute(tmtcifFormatFormulaEClass, TMTCIF_FORMAT_FORMULA__SLOPE);
		createEAttribute(tmtcifFormatFormulaEClass, TMTCIF_FORMAT_FORMULA__INTERCEPT);

		tmtcifFormatVariableSizeEClass = createEClass(TMTCIF_FORMAT_VARIABLE_SIZE);
		createEAttribute(tmtcifFormatVariableSizeEClass, TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF);
		createEAttribute(tmtcifFormatVariableSizeEClass, TMTCIF_FORMAT_VARIABLE_SIZE__UNIT);
		createEAttribute(tmtcifFormatVariableSizeEClass, TMTCIF_FORMAT_VARIABLE_SIZE__POWER);

		tmtcifFormatFloatingOffsetEClass = createEClass(TMTCIF_FORMAT_FLOATING_OFFSET);
		createEAttribute(tmtcifFormatFloatingOffsetEClass, TMTCIF_FORMAT_FLOATING_OFFSET__FID_REF);

		tmtcifFormatSortedFieldsToCheckEClass = createEClass(TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK);
		createEReference(tmtcifFormatSortedFieldsToCheckEClass, TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK);

		tmtcifFormatFieldToCheckEClass = createEClass(TMTCIF_FORMAT_FIELD_TO_CHECK);
		createEAttribute(tmtcifFormatFieldToCheckEClass, TMTCIF_FORMAT_FIELD_TO_CHECK__FID_REF);

		tmtcifFormatArrayDimensionEClass = createEClass(TMTCIF_FORMAT_ARRAY_DIMENSION);
		createEAttribute(tmtcifFormatArrayDimensionEClass, TMTCIF_FORMAT_ARRAY_DIMENSION__FID_REF);
		createEAttribute(tmtcifFormatArrayDimensionEClass, TMTCIF_FORMAT_ARRAY_DIMENSION__MAX_ITEMS);

		tmtcifFormatArrayRefEClass = createEClass(TMTCIF_FORMAT_ARRAY_REF);
		createEAttribute(tmtcifFormatArrayRefEClass, TMTCIF_FORMAT_ARRAY_REF__FID_REF);

		// Create enums
		tmtcifFormatFormatTypeEEnum = createEEnum(TMTCIF_FORMAT_FORMAT_TYPE);
		tmtcifFormatFieldTypeEEnum = createEEnum(TMTCIF_FORMAT_FIELD_TYPE);
		tmtcifFormatFieldByteOrderEEnum = createEEnum(TMTCIF_FORMAT_FIELD_BYTE_ORDER);
		tmtcifFormatSFieldFirstBitEEnum = createEEnum(TMTCIF_FORMAT_SFIELD_FIRST_BIT);
		tmtcifFormatCheckTypeEEnum = createEEnum(TMTCIF_FORMAT_CHECK_TYPE);
		tmtcifFormatUnitEEnum = createEEnum(TMTCIF_FORMAT_UNIT);
		tmtcifFormatPowerEEnum = createEEnum(TMTCIF_FORMAT_POWER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tmtcifFormatFormatEClass.getESuperTypes().add(thecommonPackage.getTMTCIFModelElement());
		tmtcifFormatFieldEClass.getESuperTypes().add(thecommonPackage.getTMTCIFModelObject());
		tmtcifFormatCSFieldEClass.getESuperTypes().add(this.getTMTCIFFormatField());
		tmtcifFormatCSFormulaFieldEClass.getESuperTypes().add(this.getTMTCIFFormatCSField());
		tmtcifFormatVSFieldEClass.getESuperTypes().add(this.getTMTCIFFormatField());
		tmtcifFormatVRFieldSizeEClass.getESuperTypes().add(this.getTMTCIFFormatField());
		tmtcifFormatFDICFieldEClass.getESuperTypes().add(this.getTMTCIFFormatField());
		tmtcifFormatAFieldEClass.getESuperTypes().add(this.getTMTCIFFormatField());
		tmtcifFormatAIFieldEClass.getESuperTypes().add(this.getTMTCIFFormatField());

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifFormatFormatEClass, TMTCIFFormatFormat.class, "TMTCIFFormatFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatFormat_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatFormat_Type(), this.getTMTCIFFormatFormatType(), "type", null, 1, 1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_CSField(), this.getTMTCIFFormatCSField(), null, "CSField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_CSFormulaField(), this.getTMTCIFFormatCSFormulaField(), null, "CSFormulaField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_VSField(), this.getTMTCIFFormatVSField(), null, "VSField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_FDICField(), this.getTMTCIFFormatFDICField(), null, "FDICField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_VRFieldSize(), this.getTMTCIFFormatVRFieldSize(), null, "VRFieldSize", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_AField(), this.getTMTCIFFormatAField(), null, "AField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFormat_AIField(), this.getTMTCIFFormatAIField(), null, "AIField", null, 0, -1, TMTCIFFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatFieldEClass, TMTCIFFormatField.class, "TMTCIFFormatField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, TMTCIFFormatField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, TMTCIFFormatField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatCSFieldEClass, TMTCIFFormatCSField.class, "TMTCIFFormatCSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatCSField_Type(), this.getTMTCIFFormatFieldType(), "type", null, 1, 1, TMTCIFFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatCSField_ByteOrder(), this.getTMTCIFFormatFieldByteOrder(), "byteOrder", null, 1, 1, TMTCIFFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatCSField_FirstBit(), this.getTMTCIFFormatSFieldFirstBit(), "firstBit", null, 1, 1, TMTCIFFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatCSField_Size(), this.getTMTCIFFormatBytesBits(), null, "size", null, 1, 1, TMTCIFFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatCSField_GlobalOffset(), this.getTMTCIFFormatBytesBits(), null, "globalOffset", null, 1, 1, TMTCIFFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatCSFormulaFieldEClass, TMTCIFFormatCSFormulaField.class, "TMTCIFFormatCSFormulaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFormatCSFormulaField_Formula(), this.getTMTCIFFormatFormula(), null, "formula", null, 1, 1, TMTCIFFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatVSFieldEClass, TMTCIFFormatVSField.class, "TMTCIFFormatVSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatVSField_Type(), this.getTMTCIFFormatFieldType(), "type", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatVSField_ByteOrder(), this.getTMTCIFFormatFieldByteOrder(), "byteOrder", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatVSField_FirstBit(), this.getTMTCIFFormatSFieldFirstBit(), "firstBit", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatVSField_ConstSize(), this.getTMTCIFFormatBytesBits(), null, "constSize", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatVSField_VariableSize(), this.getTMTCIFFormatVariableSize(), null, "variableSize", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatVSField_MaxSize(), this.getTMTCIFFormatBytesBits(), null, "maxSize", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatVSField_GlobalOffset(), this.getTMTCIFFormatBytesBits(), null, "globalOffset", null, 1, 1, TMTCIFFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatVRFieldSizeEClass, TMTCIFFormatVRFieldSize.class, "TMTCIFFormatVRFieldSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tmtcifFormatFDICFieldEClass, TMTCIFFormatFDICField.class, "TMTCIFFormatFDICField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatFDICField_CheckType(), this.getTMTCIFFormatCheckType(), "checkType", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatFDICField_ByteOrder(), this.getTMTCIFFormatFieldByteOrder(), "byteOrder", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatFDICField_FirstBit(), this.getTMTCIFFormatSFieldFirstBit(), "firstBit", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFDICField_Size(), this.getTMTCIFFormatBytesBits(), null, "size", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFDICField_FloatingOffset(), this.getTMTCIFFormatFloatingOffset(), null, "floatingOffset", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatFDICField_SortedFieldsToCheck(), this.getTMTCIFFormatSortedFieldsToCheck(), null, "sortedFieldsToCheck", null, 1, 1, TMTCIFFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatAFieldEClass, TMTCIFFormatAField.class, "TMTCIFFormatAField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatAField_Type(), this.getTMTCIFFormatFieldType(), "type", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatAField_ByteOrder(), this.getTMTCIFFormatFieldByteOrder(), "byteOrder", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatAField_FirstBit(), this.getTMTCIFFormatSFieldFirstBit(), "firstBit", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAField_ArrayDimension(), this.getTMTCIFFormatArrayDimension(), null, "arrayDimension", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAField_Size(), this.getTMTCIFFormatBytesBits(), null, "size", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAField_GlobalOffset(), this.getTMTCIFFormatBytesBits(), null, "globalOffset", null, 1, 1, TMTCIFFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatAIFieldEClass, TMTCIFFormatAIField.class, "TMTCIFFormatAIField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatAIField_Type(), this.getTMTCIFFormatFieldType(), "type", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatAIField_ByteOrder(), this.getTMTCIFFormatFieldByteOrder(), "byteOrder", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatAIField_FirstBit(), this.getTMTCIFFormatSFieldFirstBit(), "firstBit", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAIField_ArrayRef(), this.getTMTCIFFormatArrayRef(), null, "arrayRef", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAIField_Size(), this.getTMTCIFFormatBytesBits(), null, "size", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFFormatAIField_LocalOffset(), this.getTMTCIFFormatBytesBits(), null, "localOffset", null, 1, 1, TMTCIFFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatBytesBitsEClass, TMTCIFFormatBytesBits.class, "TMTCIFFormatBytesBits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatBytesBits_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, TMTCIFFormatBytesBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatBytesBits_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, TMTCIFFormatBytesBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatFormulaEClass, TMTCIFFormatFormula.class, "TMTCIFFormatFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatFormula_Slope(), ecorePackage.getEString(), "slope", null, 1, 1, TMTCIFFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatFormula_Intercept(), ecorePackage.getEString(), "intercept", null, 1, 1, TMTCIFFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatVariableSizeEClass, TMTCIFFormatVariableSize.class, "TMTCIFFormatVariableSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatVariableSize_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, TMTCIFFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatVariableSize_Unit(), this.getTMTCIFFormatUnit(), "unit", null, 1, 1, TMTCIFFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatVariableSize_Power(), this.getTMTCIFFormatPower(), "power", null, 0, 1, TMTCIFFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatFloatingOffsetEClass, TMTCIFFormatFloatingOffset.class, "TMTCIFFormatFloatingOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatFloatingOffset_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, TMTCIFFormatFloatingOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatSortedFieldsToCheckEClass, TMTCIFFormatSortedFieldsToCheck.class, "TMTCIFFormatSortedFieldsToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTMTCIFFormatSortedFieldsToCheck_FieldToCheck(), this.getTMTCIFFormatFieldToCheck(), null, "fieldToCheck", null, 0, -1, TMTCIFFormatSortedFieldsToCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatFieldToCheckEClass, TMTCIFFormatFieldToCheck.class, "TMTCIFFormatFieldToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatFieldToCheck_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, TMTCIFFormatFieldToCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatArrayDimensionEClass, TMTCIFFormatArrayDimension.class, "TMTCIFFormatArrayDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatArrayDimension_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, TMTCIFFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFFormatArrayDimension_MaxItems(), ecorePackage.getEString(), "maxItems", null, 1, 1, TMTCIFFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifFormatArrayRefEClass, TMTCIFFormatArrayRef.class, "TMTCIFFormatArrayRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFFormatArrayRef_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, TMTCIFFormatArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tmtcifFormatFormatTypeEEnum, TMTCIFFormatFormatType.class, "TMTCIFFormatFormatType");
		addEEnumLiteral(tmtcifFormatFormatTypeEEnum, TMTCIFFormatFormatType.TM);
		addEEnumLiteral(tmtcifFormatFormatTypeEEnum, TMTCIFFormatFormatType.TC);

		initEEnum(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.class, "TMTCIFFormatFieldType");
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.STRUCTURED);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.UINT);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.FLAG);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.ENUMERATED);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.BIT_VECTOR);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.BYTE_VECTOR);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.FLOAT);
		addEEnumLiteral(tmtcifFormatFieldTypeEEnum, TMTCIFFormatFieldType.DEDUCED);

		initEEnum(tmtcifFormatFieldByteOrderEEnum, TMTCIFFormatFieldByteOrder.class, "TMTCIFFormatFieldByteOrder");
		addEEnumLiteral(tmtcifFormatFieldByteOrderEEnum, TMTCIFFormatFieldByteOrder.BIG_ENDIAN);
		addEEnumLiteral(tmtcifFormatFieldByteOrderEEnum, TMTCIFFormatFieldByteOrder.LITTLE_ENDIAN);
		addEEnumLiteral(tmtcifFormatFieldByteOrderEEnum, TMTCIFFormatFieldByteOrder.NA);

		initEEnum(tmtcifFormatSFieldFirstBitEEnum, TMTCIFFormatSFieldFirstBit.class, "TMTCIFFormatSFieldFirstBit");
		addEEnumLiteral(tmtcifFormatSFieldFirstBitEEnum, TMTCIFFormatSFieldFirstBit.MSB);
		addEEnumLiteral(tmtcifFormatSFieldFirstBitEEnum, TMTCIFFormatSFieldFirstBit.LSB);

		initEEnum(tmtcifFormatCheckTypeEEnum, TMTCIFFormatCheckType.class, "TMTCIFFormatCheckType");
		addEEnumLiteral(tmtcifFormatCheckTypeEEnum, TMTCIFFormatCheckType.CRC16);
		addEEnumLiteral(tmtcifFormatCheckTypeEEnum, TMTCIFFormatCheckType.CHECKSUM16);

		initEEnum(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.class, "TMTCIFFormatUnit");
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.BYTES);
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.BITS);
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.HALFWORD);
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.STRING10);
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.STRING17);
		addEEnumLiteral(tmtcifFormatUnitEEnum, TMTCIFFormatUnit.STRING69);

		initEEnum(tmtcifFormatPowerEEnum, TMTCIFFormatPower.class, "TMTCIFFormatPower");
		addEEnumLiteral(tmtcifFormatPowerEEnum, TMTCIFFormatPower._2);
		addEEnumLiteral(tmtcifFormatPowerEEnum, TMTCIFFormatPower._2WITH_0);

		// Create resource
		createResource(eNS_URI);
	}

} //formatPackageImpl
