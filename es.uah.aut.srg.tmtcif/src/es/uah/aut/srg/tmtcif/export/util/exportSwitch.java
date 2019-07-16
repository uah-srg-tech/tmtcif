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
package es.uah.aut.srg.tmtcif.export.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.export.*;

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
 * @see es.uah.aut.srg.tmtcif.export.exportPackage
 * @generated
 */
public class exportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static exportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportSwitch() {
		if (modelPackage == null) {
			modelPackage = exportPackage.eINSTANCE;
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
			case exportPackage.TMTCIF_EXPORT_EXPORT: {
				TMTCIFExportExport tmtcifExportExport = (TMTCIFExportExport)theEObject;
				T result = caseTMTCIFExportExport(tmtcifExportExport);
				if (result == null) result = caseTMTCIFModelElement(tmtcifExportExport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SIZES: {
				TMTCIFExportSizes tmtcifExportSizes = (TMTCIFExportSizes)theEObject;
				T result = caseTMTCIFExportSizes(tmtcifExportSizes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SIZE: {
				TMTCIFExportSize tmtcifExportSize = (TMTCIFExportSize)theEObject;
				T result = caseTMTCIFExportSize(tmtcifExportSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH: {
				TMTCIFExportSizeFromFileLength tmtcifExportSizeFromFileLength = (TMTCIFExportSizeFromFileLength)theEObject;
				T result = caseTMTCIFExportSizeFromFileLength(tmtcifExportSizeFromFileLength);
				if (result == null) result = caseTMTCIFExportSize(tmtcifExportSizeFromFileLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LINE: {
				TMTCIFExportSizeFromFileLine tmtcifExportSizeFromFileLine = (TMTCIFExportSizeFromFileLine)theEObject;
				T result = caseTMTCIFExportSizeFromFileLine(tmtcifExportSizeFromFileLine);
				if (result == null) result = caseTMTCIFExportSize(tmtcifExportSizeFromFileLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SIZE_IN_BITS: {
				TMTCIFExportSizeInBits tmtcifExportSizeInBits = (TMTCIFExportSizeInBits)theEObject;
				T result = caseTMTCIFExportSizeInBits(tmtcifExportSizeInBits);
				if (result == null) result = caseTMTCIFExportSize(tmtcifExportSizeInBits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTINGS: {
				TMTCIFExportSettings tmtcifExportSettings = (TMTCIFExportSettings)theEObject;
				T result = caseTMTCIFExportSettings(tmtcifExportSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING: {
				TMTCIFExportSetting tmtcifExportSetting = (TMTCIFExportSetting)theEObject;
				T result = caseTMTCIFExportSetting(tmtcifExportSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_CONST: {
				TMTCIFExportSettingFromConst tmtcifExportSettingFromConst = (TMTCIFExportSettingFromConst)theEObject;
				T result = caseTMTCIFExportSettingFromConst(tmtcifExportSettingFromConst);
				if (result == null) result = caseTMTCIFExportSetting(tmtcifExportSettingFromConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_SIZE: {
				TMTCIFExportSettingFromSize tmtcifExportSettingFromSize = (TMTCIFExportSettingFromSize)theEObject;
				T result = caseTMTCIFExportSettingFromSize(tmtcifExportSettingFromSize);
				if (result == null) result = caseTMTCIFExportSetting(tmtcifExportSettingFromSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FILE: {
				TMTCIFExportSettingFromFile tmtcifExportSettingFromFile = (TMTCIFExportSettingFromFile)theEObject;
				T result = caseTMTCIFExportSettingFromFile(tmtcifExportSettingFromFile);
				if (result == null) result = caseTMTCIFExportSetting(tmtcifExportSettingFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FIELD: {
				TMTCIFExportSettingFromField tmtcifExportSettingFromField = (TMTCIFExportSettingFromField)theEObject;
				T result = caseTMTCIFExportSettingFromField(tmtcifExportSettingFromField);
				if (result == null) result = caseTMTCIFExportSetting(tmtcifExportSettingFromField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_AI: {
				TMTCIFExportSettingAI tmtcifExportSettingAI = (TMTCIFExportSettingAI)theEObject;
				T result = caseTMTCIFExportSettingAI(tmtcifExportSettingAI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST: {
				TMTCIFExportSettingAIFromConst tmtcifExportSettingAIFromConst = (TMTCIFExportSettingAIFromConst)theEObject;
				T result = caseTMTCIFExportSettingAIFromConst(tmtcifExportSettingAIFromConst);
				if (result == null) result = caseTMTCIFExportSettingAI(tmtcifExportSettingAIFromConst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_FILE: {
				TMTCIFExportSettingAIFromFile tmtcifExportSettingAIFromFile = (TMTCIFExportSettingAIFromFile)theEObject;
				T result = caseTMTCIFExportSettingAIFromFile(tmtcifExportSettingAIFromFile);
				if (result == null) result = caseTMTCIFExportSettingAI(tmtcifExportSettingAIFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_ACTIVATE_DI_CS: {
				TMTCIFExportActivateDICs tmtcifExportActivateDICs = (TMTCIFExportActivateDICs)theEObject;
				T result = caseTMTCIFExportActivateDICs(tmtcifExportActivateDICs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case exportPackage.TMTCIF_EXPORT_DIC: {
				TMTCIFExportDIC tmtcifExportDIC = (TMTCIFExportDIC)theEObject;
				T result = caseTMTCIFExportDIC(tmtcifExportDIC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportExport(TMTCIFExportExport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Sizes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Sizes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSizes(TMTCIFExportSizes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSize(TMTCIFExportSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Size From File Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Size From File Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSizeFromFileLength(TMTCIFExportSizeFromFileLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Size From File Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Size From File Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSizeFromFileLine(TMTCIFExportSizeFromFileLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Size In Bits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Size In Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSizeInBits(TMTCIFExportSizeInBits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettings(TMTCIFExportSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSetting(TMTCIFExportSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingFromConst(TMTCIFExportSettingFromConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingFromSize(TMTCIFExportSettingFromSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingFromFile(TMTCIFExportSettingFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting From Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingFromField(TMTCIFExportSettingFromField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingAI(TMTCIFExportSettingAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI From Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI From Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingAIFromConst(TMTCIFExportSettingAIFromConst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Setting AI From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportSettingAIFromFile(TMTCIFExportSettingAIFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export Activate DI Cs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export Activate DI Cs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportActivateDICs(TMTCIFExportActivateDICs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Export DIC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Export DIC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFExportDIC(TMTCIFExportDIC object) {
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

} //exportSwitch
