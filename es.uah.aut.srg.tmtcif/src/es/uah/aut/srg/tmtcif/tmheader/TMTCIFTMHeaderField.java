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
package es.uah.aut.srg.tmtcif.tmheader;

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIFTM Header Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getFieldValue <em>Field Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage#getTMTCIFTMHeaderField()
 * @model abstract="true"
 * @generated
 */
public interface TMTCIFTMHeaderField extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage#getTMTCIFTMHeaderField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Value</em>' containment reference.
	 * @see #setFieldValue(TMTCIFFieldValueRaw)
	 * @see es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage#getTMTCIFTMHeaderField_FieldValue()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFieldValueRaw getFieldValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField#getFieldValue <em>Field Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Value</em>' containment reference.
	 * @see #getFieldValue()
	 * @generated
	 */
	void setFieldValue(TMTCIFFieldValueRaw value);

} // TMTCIFTMHeaderField
