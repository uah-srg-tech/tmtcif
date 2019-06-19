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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Bool Var FDIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFDIC()
 * @model
 * @generated
 */
public interface TMTCIFFilterBoolVarFDIC extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFDIC_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFDIC_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(TMTCIFFormatFDICField)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFDIC_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFDICField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(TMTCIFFormatFDICField value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(TMTCIFFilterFieldOp)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFDIC_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(TMTCIFFilterFieldOp value);

} // TMTCIFFilterBoolVarFDIC
