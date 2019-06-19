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
package es.uah.aut.srg.tmtcif.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Model File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getElement <em>Element</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.common.commonPackage#getTMTCIFModelFile()
 * @model
 * @generated
 */
public interface TMTCIFModelFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(TMTCIFModelElement)
	 * @see es.uah.aut.srg.tmtcif.common.commonPackage#getTMTCIFModelFile_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFModelElement getElement();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFile#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(TMTCIFModelElement value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.common.commonPackage#getTMTCIFModelFile_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFModelFileImport> getImports();

} // TMTCIFModelFile
