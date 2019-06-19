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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem()
 * @model
 * @generated
 */
public interface TMTCIFFilterBoolVarFromGroupedArrayItem extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(TMTCIFFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>AI Field Refs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Refs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Refs</em>' reference.
	 * @see #setAIFieldRefs(TMTCIFFormatAField)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_AIFieldRefs()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatAField getAIFieldRefs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Refs</em>' reference.
	 * @see #getAIFieldRefs()
	 * @generated
	 */
	void setAIFieldRefs(TMTCIFFormatAField value);

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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}' containment reference.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Constant()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}' containment reference.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_Select()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}' containment reference.
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
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterBoolVarFromGroupedArrayItem_SelectLine()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' containment reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(TMTCIFFilterSelectLine value);

} // TMTCIFFilterBoolVarFromGroupedArrayItem
