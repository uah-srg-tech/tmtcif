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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export Setting AI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAI#getToFieldRef <em>To Field Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettingAI()
 * @model
 * @generated
 */
public interface TMTCIFExportSettingAI extends EObject {
	/**
	 * Returns the value of the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Field Ref</em>' reference.
	 * @see #setToFieldRef(TMTCIFFormatAIField)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettingAI_ToFieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatAIField getToFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAI#getToFieldRef <em>To Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Field Ref</em>' reference.
	 * @see #getToFieldRef()
	 * @generated
	 */
	void setToFieldRef(TMTCIFFormatAIField value);

} // TMTCIFExportSettingAI
