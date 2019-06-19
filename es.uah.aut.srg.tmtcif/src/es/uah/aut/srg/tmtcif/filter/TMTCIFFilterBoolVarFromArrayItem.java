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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem()
 * @model
 * @generated
 */
public interface TMTCIFFilterBoolVarFromArrayItem extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
	 * @see #setConstantType(TMTCIFFilterConstantType)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(TMTCIFFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>AI Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Ref</em>' reference.
	 * @see #setAIFieldRef(TMTCIFFormatAIField)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_AIFieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatAIField getAIFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Ref</em>' reference.
	 * @see #getAIFieldRef()
	 * @generated
	 */
	void setAIFieldRef(TMTCIFFormatAIField value);

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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(TMTCIFFilterFieldOp value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(TMTCIFFilterConstant)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_Constant()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(TMTCIFFilterConstant value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(TMTCIFFilterSelect)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_Select()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(TMTCIFFilterSelect value);

	/**
	 * Returns the value of the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Line</em>' containment reference.
	 * @see #setSelectLine(TMTCIFFilterSelectLine)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromArrayItem_SelectLine()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' containment reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(TMTCIFFilterSelectLine value);

} // TMTCIFFilterBoolVarFromArrayItem
