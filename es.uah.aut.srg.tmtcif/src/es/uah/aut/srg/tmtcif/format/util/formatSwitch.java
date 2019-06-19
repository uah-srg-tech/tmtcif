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
package es.uah.aut.srg.tmtcif.format.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;

import es.uah.aut.srg.tmtcif.format.*;

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
 * @see es.uah.aut.srg.tmtcif.format.formatPackage
 * @generated
 */
public class formatSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formatPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatSwitch() {
		if (modelPackage == null) {
			modelPackage = formatPackage.eINSTANCE;
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
			case formatPackage.TMTCIF_FORMAT_FORMAT: {
				TMTCIFFormatFormat tmtcifFormatFormat = (TMTCIFFormatFormat)theEObject;
				T result = caseTMTCIFFormatFormat(tmtcifFormatFormat);
				if (result == null) result = caseTMTCIFModelElement(tmtcifFormatFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_FIELD: {
				TMTCIFFormatField tmtcifFormatField = (TMTCIFFormatField)theEObject;
				T result = caseTMTCIFFormatField(tmtcifFormatField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_CS_FIELD: {
				TMTCIFFormatCSField tmtcifFormatCSField = (TMTCIFFormatCSField)theEObject;
				T result = caseTMTCIFFormatCSField(tmtcifFormatCSField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatCSField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatCSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_CS_FORMULA_FIELD: {
				TMTCIFFormatCSFormulaField tmtcifFormatCSFormulaField = (TMTCIFFormatCSFormulaField)theEObject;
				T result = caseTMTCIFFormatCSFormulaField(tmtcifFormatCSFormulaField);
				if (result == null) result = caseTMTCIFFormatCSField(tmtcifFormatCSFormulaField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatCSFormulaField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatCSFormulaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_VS_FIELD: {
				TMTCIFFormatVSField tmtcifFormatVSField = (TMTCIFFormatVSField)theEObject;
				T result = caseTMTCIFFormatVSField(tmtcifFormatVSField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatVSField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatVSField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_VR_FIELD_SIZE: {
				TMTCIFFormatVRFieldSize tmtcifFormatVRFieldSize = (TMTCIFFormatVRFieldSize)theEObject;
				T result = caseTMTCIFFormatVRFieldSize(tmtcifFormatVRFieldSize);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatVRFieldSize);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatVRFieldSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD: {
				TMTCIFFormatFDICField tmtcifFormatFDICField = (TMTCIFFormatFDICField)theEObject;
				T result = caseTMTCIFFormatFDICField(tmtcifFormatFDICField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatFDICField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatFDICField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_AFIELD: {
				TMTCIFFormatAField tmtcifFormatAField = (TMTCIFFormatAField)theEObject;
				T result = caseTMTCIFFormatAField(tmtcifFormatAField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatAField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatAField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_AI_FIELD: {
				TMTCIFFormatAIField tmtcifFormatAIField = (TMTCIFFormatAIField)theEObject;
				T result = caseTMTCIFFormatAIField(tmtcifFormatAIField);
				if (result == null) result = caseTMTCIFFormatField(tmtcifFormatAIField);
				if (result == null) result = caseTMTCIFModelObject(tmtcifFormatAIField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_BYTES_BITS: {
				TMTCIFFormatBytesBits tmtcifFormatBytesBits = (TMTCIFFormatBytesBits)theEObject;
				T result = caseTMTCIFFormatBytesBits(tmtcifFormatBytesBits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_FORMULA: {
				TMTCIFFormatFormula tmtcifFormatFormula = (TMTCIFFormatFormula)theEObject;
				T result = caseTMTCIFFormatFormula(tmtcifFormatFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE: {
				TMTCIFFormatVariableSize tmtcifFormatVariableSize = (TMTCIFFormatVariableSize)theEObject;
				T result = caseTMTCIFFormatVariableSize(tmtcifFormatVariableSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_FLOATING_OFFSET: {
				TMTCIFFormatFloatingOffset tmtcifFormatFloatingOffset = (TMTCIFFormatFloatingOffset)theEObject;
				T result = caseTMTCIFFormatFloatingOffset(tmtcifFormatFloatingOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK: {
				TMTCIFFormatSortedFieldsToCheck tmtcifFormatSortedFieldsToCheck = (TMTCIFFormatSortedFieldsToCheck)theEObject;
				T result = caseTMTCIFFormatSortedFieldsToCheck(tmtcifFormatSortedFieldsToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_FIELD_TO_CHECK: {
				TMTCIFFormatFieldToCheck tmtcifFormatFieldToCheck = (TMTCIFFormatFieldToCheck)theEObject;
				T result = caseTMTCIFFormatFieldToCheck(tmtcifFormatFieldToCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_ARRAY_DIMENSION: {
				TMTCIFFormatArrayDimension tmtcifFormatArrayDimension = (TMTCIFFormatArrayDimension)theEObject;
				T result = caseTMTCIFFormatArrayDimension(tmtcifFormatArrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case formatPackage.TMTCIF_FORMAT_ARRAY_REF: {
				TMTCIFFormatArrayRef tmtcifFormatArrayRef = (TMTCIFFormatArrayRef)theEObject;
				T result = caseTMTCIFFormatArrayRef(tmtcifFormatArrayRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatFormat(TMTCIFFormatFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatField(TMTCIFFormatField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format CS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format CS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatCSField(TMTCIFFormatCSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format CS Formula Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format CS Formula Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatCSFormulaField(TMTCIFFormatCSFormulaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format VS Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format VS Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatVSField(TMTCIFFormatVSField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format VR Field Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format VR Field Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatVRFieldSize(TMTCIFFormatVRFieldSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format FDIC Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format FDIC Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatFDICField(TMTCIFFormatFDICField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format AField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format AField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatAField(TMTCIFFormatAField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format AI Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format AI Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatAIField(TMTCIFFormatAIField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Bytes Bits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Bytes Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatBytesBits(TMTCIFFormatBytesBits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatFormula(TMTCIFFormatFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Variable Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Variable Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatVariableSize(TMTCIFFormatVariableSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Floating Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Floating Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatFloatingOffset(TMTCIFFormatFloatingOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Sorted Fields To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Sorted Fields To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Field To Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Field To Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatFieldToCheck(TMTCIFFormatFieldToCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatArrayDimension(TMTCIFFormatArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Format Array Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Format Array Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFFormatArrayRef(TMTCIFFormatArrayRef object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Model Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Model Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFModelObject(TMTCIFModelObject object) {
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

} //formatSwitch
