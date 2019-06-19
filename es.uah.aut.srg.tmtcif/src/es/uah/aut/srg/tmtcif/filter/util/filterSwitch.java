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
package es.uah.aut.srg.tmtcif.filter.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.filter.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage
 * @generated
 */
public class filterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static filterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterSwitch() {
		if (modelPackage == null) {
			modelPackage = filterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case filterPackage.TMTCIF_FILTER_FILTER: {
				TMTCIFFilterFilter tmtcifFilterFilter = (TMTCIFFilterFilter)theEObject;
				T result = caseTMTCIFFilterFilter(tmtcifFilterFilter);
				if (result == null) result = caseTMTCIFModelElement(tmtcifFilterFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER: {
				TMTCIFFilterMaxtermFilter tmtcifFilterMaxtermFilter = (TMTCIFFilterMaxtermFilter)theEObject;
				T result = caseTMTCIFFilterMaxtermFilter(tmtcifFilterMaxtermFilter);
				if (result == null) result = caseTMTCIFFilterFilter(tmtcifFilterMaxtermFilter);
				if (result == null) result = caseTMTCIFModelElement(tmtcifFilterMaxtermFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER: {
				TMTCIFFilterMintermFilter tmtcifFilterMintermFilter = (TMTCIFFilterMintermFilter)theEObject;
				T result = caseTMTCIFFilterMintermFilter(tmtcifFilterMintermFilter);
				if (result == null) result = caseTMTCIFFilterFilter(tmtcifFilterMintermFilter);
				if (result == null) result = caseTMTCIFModelElement(tmtcifFilterMintermFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_BOOL_VAR: {
				TMTCIFFilterBoolVar tmtcifFilterBoolVar = (TMTCIFFilterBoolVar)theEObject;
				T result = caseTMTCIFFilterBoolVar(tmtcifFilterBoolVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_FIELD_OP: {
				TMTCIFFilterFieldOp tmtcifFilterFieldOp = (TMTCIFFilterFieldOp)theEObject;
				T result = caseTMTCIFFilterFieldOp(tmtcifFilterFieldOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_CONSTANT: {
				TMTCIFFilterConstant tmtcifFilterConstant = (TMTCIFFilterConstant)theEObject;
				T result = caseTMTCIFFilterConstant(tmtcifFilterConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_SELECT: {
				TMTCIFFilterSelect tmtcifFilterSelect = (TMTCIFFilterSelect)theEObject;
				T result = caseTMTCIFFilterSelect(tmtcifFilterSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_SELECT_LINE: {
				TMTCIFFilterSelectLine tmtcifFilterSelectLine = (TMTCIFFilterSelectLine)theEObject;
				T result = caseTMTCIFFilterSelectLine(tmtcifFilterSelectLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM: {
				TMTCIFFilterBoolVarFromArrayItem tmtcifFilterBoolVarFromArrayItem = (TMTCIFFilterBoolVarFromArrayItem)theEObject;
				T result = caseTMTCIFFilterBoolVarFromArrayItem(tmtcifFilterBoolVarFromArrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM: {
				TMTCIFFilterBoolVarFromGroupedArrayItem tmtcifFilterBoolVarFromGroupedArrayItem = (TMTCIFFilterBoolVarFromGroupedArrayItem)theEObject;
				T result = caseTMTCIFFilterBoolVarFromGroupedArrayItem(tmtcifFilterBoolVarFromGroupedArrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FDIC: {
				TMTCIFFilterBoolVarFDIC tmtcifFilterBoolVarFDIC = (TMTCIFFilterBoolVarFDIC)theEObject;
				T result = caseTMTCIFFilterBoolVarFDIC(tmtcifFilterBoolVarFDIC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_MAXTERM: {
				TMTCIFFilterMaxterm tmtcifFilterMaxterm = (TMTCIFFilterMaxterm)theEObject;
				T result = caseTMTCIFFilterMaxterm(tmtcifFilterMaxterm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_MINTERM: {
				TMTCIFFilterMinterm tmtcifFilterMinterm = (TMTCIFFilterMinterm)theEObject;
				T result = caseTMTCIFFilterMinterm(tmtcifFilterMinterm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_REF: {
				TMTCIFFilterBoolVarRef tmtcifFilterBoolVarRef = (TMTCIFFilterBoolVarRef)theEObject;
				T result = caseTMTCIFFilterBoolVarRef(tmtcifFilterBoolVarRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterFilter(TMTCIFFilterFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Maxterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Maxterm Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterMaxtermFilter(TMTCIFFilterMaxtermFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Minterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Minterm Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterMintermFilter(TMTCIFFilterMintermFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterBoolVar(TMTCIFFilterBoolVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Field Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Field Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterFieldOp(TMTCIFFilterFieldOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterConstant(TMTCIFFilterConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterSelect(TMTCIFFilterSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Select Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Select Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterSelectLine(TMTCIFFilterSelectLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var From Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var From Array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterBoolVarFromArrayItem(TMTCIFFilterBoolVarFromArrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterBoolVarFromGroupedArrayItem(TMTCIFFilterBoolVarFromGroupedArrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var FDIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var FDIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterBoolVarFDIC(TMTCIFFilterBoolVarFDIC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Maxterm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Maxterm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterMaxterm(TMTCIFFilterMaxterm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Minterm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Minterm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterMinterm(TMTCIFFilterMinterm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Filter Bool Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFilterBoolVarRef(TMTCIFFilterBoolVarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFModelElement(TMTCIFModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //filterSwitch
