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
package es.uah.aut.srg.tmtcif.tcheader;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIFTC Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage#getTMTCIFTCHeader()
 * @model abstract="true"
 * @generated
 */
public interface TMTCIFTCHeader extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage#getTMTCIFTCHeader_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage#getTMTCIFTCHeader_Fields()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<TMTCIFTCHeaderField> getFields();

} // TMTCIFTCHeader
