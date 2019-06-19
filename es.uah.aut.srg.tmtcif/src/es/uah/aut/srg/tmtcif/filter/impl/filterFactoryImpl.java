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

import es.uah.aut.srg.tmtcif.filter.*;

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
public class filterFactoryImpl extends EFactoryImpl implements filterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static filterFactory init() {
		try {
			filterFactory thefilterFactory = (filterFactory)EPackage.Registry.INSTANCE.getEFactory(filterPackage.eNS_URI);
			if (thefilterFactory != null) {
				return thefilterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new filterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterFactoryImpl() {
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
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER: return createTMTCIFFilterMaxtermFilter();
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER: return createTMTCIFFilterMintermFilter();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR: return createTMTCIFFilterBoolVar();
			case filterPackage.TMTCIF_FILTER_FIELD_OP: return createTMTCIFFilterFieldOp();
			case filterPackage.TMTCIF_FILTER_CONSTANT: return createTMTCIFFilterConstant();
			case filterPackage.TMTCIF_FILTER_SELECT: return createTMTCIFFilterSelect();
			case filterPackage.TMTCIF_FILTER_SELECT_LINE: return createTMTCIFFilterSelectLine();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM: return createTMTCIFFilterBoolVarFromArrayItem();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM: return createTMTCIFFilterBoolVarFromGroupedArrayItem();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FDIC: return createTMTCIFFilterBoolVarFDIC();
			case filterPackage.TMTCIF_FILTER_MAXTERM: return createTMTCIFFilterMaxterm();
			case filterPackage.TMTCIF_FILTER_MINTERM: return createTMTCIFFilterMinterm();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_REF: return createTMTCIFFilterBoolVarRef();
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
			case filterPackage.TMTCIF_FILTER_CONSTANT_TYPE:
				return createTMTCIFFilterConstantTypeFromString(eDataType, initialValue);
			case filterPackage.TMTCIF_FILTER_OP_TYPE:
				return createTMTCIFFilterOPTypeFromString(eDataType, initialValue);
			case filterPackage.TMTCIF_FILTER_SELECT_TYPE:
				return createTMTCIFFilterSelectTypeFromString(eDataType, initialValue);
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
			case filterPackage.TMTCIF_FILTER_CONSTANT_TYPE:
				return convertTMTCIFFilterConstantTypeToString(eDataType, instanceValue);
			case filterPackage.TMTCIF_FILTER_OP_TYPE:
				return convertTMTCIFFilterOPTypeToString(eDataType, instanceValue);
			case filterPackage.TMTCIF_FILTER_SELECT_TYPE:
				return convertTMTCIFFilterSelectTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterMaxtermFilter createTMTCIFFilterMaxtermFilter() {
		TMTCIFFilterMaxtermFilterImpl tmtcifFilterMaxtermFilter = new TMTCIFFilterMaxtermFilterImpl();
		return tmtcifFilterMaxtermFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterMintermFilter createTMTCIFFilterMintermFilter() {
		TMTCIFFilterMintermFilterImpl tmtcifFilterMintermFilter = new TMTCIFFilterMintermFilterImpl();
		return tmtcifFilterMintermFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterBoolVar createTMTCIFFilterBoolVar() {
		TMTCIFFilterBoolVarImpl tmtcifFilterBoolVar = new TMTCIFFilterBoolVarImpl();
		return tmtcifFilterBoolVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFieldOp createTMTCIFFilterFieldOp() {
		TMTCIFFilterFieldOpImpl tmtcifFilterFieldOp = new TMTCIFFilterFieldOpImpl();
		return tmtcifFilterFieldOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterConstant createTMTCIFFilterConstant() {
		TMTCIFFilterConstantImpl tmtcifFilterConstant = new TMTCIFFilterConstantImpl();
		return tmtcifFilterConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterSelect createTMTCIFFilterSelect() {
		TMTCIFFilterSelectImpl tmtcifFilterSelect = new TMTCIFFilterSelectImpl();
		return tmtcifFilterSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterSelectLine createTMTCIFFilterSelectLine() {
		TMTCIFFilterSelectLineImpl tmtcifFilterSelectLine = new TMTCIFFilterSelectLineImpl();
		return tmtcifFilterSelectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterBoolVarFromArrayItem createTMTCIFFilterBoolVarFromArrayItem() {
		TMTCIFFilterBoolVarFromArrayItemImpl tmtcifFilterBoolVarFromArrayItem = new TMTCIFFilterBoolVarFromArrayItemImpl();
		return tmtcifFilterBoolVarFromArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterBoolVarFromGroupedArrayItem createTMTCIFFilterBoolVarFromGroupedArrayItem() {
		TMTCIFFilterBoolVarFromGroupedArrayItemImpl tmtcifFilterBoolVarFromGroupedArrayItem = new TMTCIFFilterBoolVarFromGroupedArrayItemImpl();
		return tmtcifFilterBoolVarFromGroupedArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterBoolVarFDIC createTMTCIFFilterBoolVarFDIC() {
		TMTCIFFilterBoolVarFDICImpl tmtcifFilterBoolVarFDIC = new TMTCIFFilterBoolVarFDICImpl();
		return tmtcifFilterBoolVarFDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterMaxterm createTMTCIFFilterMaxterm() {
		TMTCIFFilterMaxtermImpl tmtcifFilterMaxterm = new TMTCIFFilterMaxtermImpl();
		return tmtcifFilterMaxterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterMinterm createTMTCIFFilterMinterm() {
		TMTCIFFilterMintermImpl tmtcifFilterMinterm = new TMTCIFFilterMintermImpl();
		return tmtcifFilterMinterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterBoolVarRef createTMTCIFFilterBoolVarRef() {
		TMTCIFFilterBoolVarRefImpl tmtcifFilterBoolVarRef = new TMTCIFFilterBoolVarRefImpl();
		return tmtcifFilterBoolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterConstantType createTMTCIFFilterConstantTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFilterConstantType result = TMTCIFFilterConstantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFilterConstantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterOPType createTMTCIFFilterOPTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFilterOPType result = TMTCIFFilterOPType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFilterOPTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterSelectType createTMTCIFFilterSelectTypeFromString(EDataType eDataType, String initialValue) {
		TMTCIFFilterSelectType result = TMTCIFFilterSelectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMTCIFFilterSelectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterPackage getfilterPackage() {
		return (filterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static filterPackage getPackage() {
		return filterPackage.eINSTANCE;
	}

} //filterFactoryImpl
