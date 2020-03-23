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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIFTM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1 <em>Pi1</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM()
 * @model abstract="true"
 * @generated
 */
public interface TMTCIFTM extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' attribute.
	 * @see #setSubtype(String)
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM_Subtype()
	 * @model required="true"
	 * @generated
	 */
	String getSubtype();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getSubtype <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' attribute.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(String value);

	/**
	 * Returns the value of the '<em><b>Pi1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pi1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pi1</em>' reference.
	 * @see #setPi1(TMTCIFPI1)
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM_Pi1()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	TMTCIFPI1 getPi1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tm.TMTCIFTM#getPi1 <em>Pi1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pi1</em>' reference.
	 * @see #getPi1()
	 * @generated
	 */
	void setPi1(TMTCIFPI1 value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.tm.TMTCIFTMField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see es.uah.aut.srg.tmtcif.tm.tmPackage#getTMTCIFTM_Fields()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<TMTCIFTMField> getFields();

} // TMTCIFTM
