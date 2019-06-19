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
package es.uah.aut.srg.tmtcif.filter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Bool Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef#getIdRef <em>Id Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarRef()
 * @model
 * @generated
 */
public interface TMTCIFFilterBoolVarRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarRef_IdRef()
	 * @model required="true"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

} // TMTCIFFilterBoolVarRef
