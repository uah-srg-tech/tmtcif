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

import es.uah.aut.srg.tmtcif.format.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class formatFactoryImpl extends EFactoryImpl implements formatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formatFactory init() {
		try {
			formatFactory theformatFactory = (formatFactory)EPackage.Registry.INSTANCE.getEFactory(formatPackage.eNS_URI);
			if (theformatFactory != null) {
				return theformatFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new formatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case formatPackage.TMTCIF_FORMAT_FORMAT: return createTMTCIFFormatFormat();
			case formatPackage.TMTCIF_FORMAT_CS_FIELD: return createTMTCIFFormatCSField();
			case formatPackage.TMTCIF_FORMAT_CS_FORMULA_FIELD: return createTMTCIFFormatCSFormulaField();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD: return createTMTCIFFormatVSField();
			case formatPackage.TMTCIF_FORMAT_VR_FIELD_SIZE: return createTMTCIFFormatVRFieldSize();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD: return createTMTCIFFormatFDICField();
			case formatPackage.TMTCIF_FORMAT_AFIELD: return createTMTCIFFormatAField();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD: return createTMTCIFFormatAIField();
			case formatPackage.TMTCIF_FORMAT_BYTES_BITS: return createTMTCIFFormatBytesBits();
			case formatPackage.TMTCIF_FORMAT_FORMULA: return createTMTCIFFormatFormula();
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE: return createTMTCIFFormatVariableSize();
			case formatPackage.TMTCIF_FORMAT_FLOATING_OFFSET: return createTMTCIFFormatFloatingOffset();
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK: return createTMTCIFFormatSortedFieldsToCheck();
			case formatPackage.TMTCIF_FORMAT_FIELD_TO_CHECK: return createTMTCIFFormatFieldToCheck();
			case formatPackage.TMTCIF_FORMAT_ARRAY_DIMENSION: return createTMTCIFFormatArrayDimension();
			case formatPackage.TMTCIF_FORMAT_ARRAY_REF: return createTMTCIFFormatArrayRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case formatPackage.TMTCIF_FORMAT_FORMAT_TYPE:
				return createTMTCIFFormatFormatTypeFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_FIELD_TYPE:
				return createTMTCIFFormatFieldTypeFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_FIELD_BYTE_ORDER:
				return createTMTCIFFormatFieldByteOrderFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_SFIELD_FIRST_BIT:
				return createTMTCIFFormatSFieldFirstBitFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_CHECK_TYPE:
				return createTMTCIFFormatCheckTypeFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_UNIT:
				return createTMTCIFFormatUnitFromString(eDataType, initialValue);
			case formatPackage.TMTCIF_FORMAT_POWER:
				return createTMTCIFFormatPowerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case formatPackage.TMTCIF_FORMAT_FORMAT_TYPE:
				return convertTMTCIFFormatFormatTypeToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_FIELD_TYPE:
				return convertTMTCIFFormatFieldTypeToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_FIELD_BYTE_ORDER:
				return convertTMTCIFFormatFieldByteOrderToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_SFIELD_FIRST_BIT:
				return convertTMTCIFFormatSFieldFirstBitToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_CHECK_TYPE:
				return convertTMTCIFFormatCheckTypeToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_UNIT:
				return convertTMTCIFFormatUnitToString(eDataType, instanceValue);
			case formatPackage.TMTCIF_FORMAT_POWER:
				return convertTMTCIFFormatPowerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat createTMTCIFFormatFormat() {
		TMTCIFFormatFormatImpl tmtcifFormatFormat = new TMTCIFFormatFormatImpl();
		return tmtcifFormatFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatCSField createTMTCIFFormatCSField() {
		TMTCIFFormatCSFieldImpl tmtcifFormatCSField = new TMTCIFFormatCSFieldImpl();
		return tmtcifFormatCSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatCSFormulaField createTMTCIFFormatCSFormulaField() {
		TMTCIFFormatCSFormulaFieldImpl tmtcifFormatCSFormulaField = new TMTCIFFormatCSFormulaFieldImpl();
		return tmtcifFormatCSFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatVSField createTMTCIFFormatVSField() {
		TMTCIFFormatVSFieldImpl tmtcifFormatVSField = new TMTCIFFormatVSFieldImpl();
		return tmtcifFormatVSField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatVRFieldSize createTMTCIFFormatVRFieldSize() {
		TMTCIFFormatVRFieldSizeImpl tmtcifFormatVRFieldSize = new TMTCIFFormatVRFieldSizeImpl();
		return tmtcifFormatVRFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFDICField createTMTCIFFormatFDICField() {
		TMTCIFFormatFDICFieldImpl tmtcifFormatFDICField = new TMTCIFFormatFDICFieldImpl();
		return tmtcifFormatFDICField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatAField createTMTCIFFormatAField() {
		TMTCIFFormatAFieldImpl tmtcifFormatAField = new TMTCIFFormatAFieldImpl();
		return tmtcifFormatAField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatAIField createTMTCIFFormatAIField() {
		TMTCIFFormatAIFieldImpl tmtcifFormatAIField = new TMTCIFFormatAIFieldImpl();
		return tmtcifFormatAIField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatBytesBits createTMTCIFFormatBytesBits() {
		TMTCIFFormatBytesBitsImpl tmtcifFormatBytesBits = new TMTCIFFormatBytesBitsImpl();
		return tmtcifFormatBytesBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormula createTMTCIFFormatFormula() {
		TMTCIFFormatFormulaImpl tmtcifFormatFormula = new TMTCIFFormatFormulaImpl();
		return tmtcifFormatFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatVariableSize createTMTCIFFormatVariableSize() {
		TMTCIFFormatVariableSizeImpl tmtcifFormatVariableSize = new TMTCIFFormatVariableSizeImpl();
		return tmtcifFormatVariableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFloatingOffset createTMTCIFFormatFloatingOffset() {
		TMTCIFFormatFloatingOffsetImpl tmtcifFormatFloatingOffset = new TMTCIFFormatFloatingOffsetImpl();
		return tmtcifFormatFloatingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatSortedFieldsToCheck createTMTCIFFormatSortedFieldsToCheck() {
		TMTCIFFormatSortedFieldsToCheckImpl tmtcifFormatSortedFieldsToCheck = new TMTCIFFormatSortedFieldsToCheckImpl();
		return tmtcifFormatSortedFieldsToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFieldToCheck createTMTCIFFormatFieldToCheck() {
		TMTCIFFormatFieldToCheckImpl tmtcifFormatFieldToCheck = new TMTCIFFormatFieldToCheckImpl();
		return tmtcifFormatFieldToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatArrayDimension createTMTCIFFormatArrayDimension() {
		TMTCIFFormatArrayDimensionImpl tmtcifFormatArrayDimension = new TMTCIFFormatArrayDimensionImpl();
		return tmtcifFormatArrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatArrayRef createTMTCIFFormatArrayRef() {
		TMTCIFFormatArrayRefImpl tmtcifFormatArrayRef = new TMTCIFFormatArrayRefImpl();
		return tmtcifFormatArrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormatType createTMTCIFFormatFormatTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatFormatType result = TMTCIFFormatFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFieldType createTMTCIFFormatFieldTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatFieldType result = TMTCIFFormatFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFieldByteOrder createTMTCIFFormatFieldByteOrderFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatFieldByteOrder result = TMTCIFFormatFieldByteOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatFieldByteOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatSFieldFirstBit createTMTCIFFormatSFieldFirstBitFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatSFieldFirstBit result = TMTCIFFormatSFieldFirstBit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatSFieldFirstBitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatCheckType createTMTCIFFormatCheckTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatCheckType result = TMTCIFFormatCheckType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatCheckTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatUnit createTMTCIFFormatUnitFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatUnit result = TMTCIFFormatUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatPower createTMTCIFFormatPowerFromString(EDataType eDataType, String initialValue) {
		TMTCIFFormatPower result = TMTCIFFormatPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFormatPowerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatPackage getformatPackage() {
		return (formatPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static formatPackage getPackage() {
		return formatPackage.eINSTANCE;
	}

} //formatFactoryImpl
