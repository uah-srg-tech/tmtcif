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
package es.uah.aut.srg.tmtcif.export;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromConst <em>Setting From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromSize <em>Setting From Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromFile <em>Setting From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingFromField <em>Setting From Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromConst <em>Setting AI From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings#getSettingAIFromFile <em>Setting AI From File</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings()
 * @model
 * @generated
 */
public interface TMTCIFExportSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Setting From Const</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Const</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Const</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingFromConst()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingFromConst> getSettingFromConst();

	/**
	 * Returns the value of the '<em><b>Setting From Size</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Size</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingFromSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingFromSize> getSettingFromSize();

	/**
	 * Returns the value of the '<em><b>Setting From File</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From File</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingFromFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingFromFile> getSettingFromFile();

	/**
	 * Returns the value of the '<em><b>Setting From Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingFromField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingFromField> getSettingFromField();

	/**
	 * Returns the value of the '<em><b>Setting AI From Const</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting AI From Const</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting AI From Const</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingAIFromConst()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingAIFromConst> getSettingAIFromConst();

	/**
	 * Returns the value of the '<em><b>Setting AI From File</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting AI From File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting AI From File</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettings_SettingAIFromFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSettingAIFromFile> getSettingAIFromFile();

} // TMTCIFExportSettings
