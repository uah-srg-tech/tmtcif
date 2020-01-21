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
package es.uah.aut.srg.tmtcif.tm;

import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIFTM Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getEnumRef <em>Enum Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTMField()
 * @model
 * @generated
 */
public interface TMTCIFTMField extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTMField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Ref</em>' reference.
	 * @see #setEnumRef(TMTCIFEnum)
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTMField_EnumRef()
	 * @model
	 * @generated
	 */
	TMTCIFEnum getEnumRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField#getEnumRef <em>Enum Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Ref</em>' reference.
	 * @see #getEnumRef()
	 * @generated
	 */
	void setEnumRef(TMTCIFEnum value);

} // TMTCIFTMField
