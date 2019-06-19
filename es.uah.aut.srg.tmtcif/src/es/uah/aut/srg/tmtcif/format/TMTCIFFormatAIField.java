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
package es.uah.aut.srg.tmtcif.format;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Format AI Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getArrayRef <em>Array Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getLocalOffset <em>Local Offset</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField()
 * @model
 * @generated
 */
public interface TMTCIFFormatAIField extends TMTCIFFormatField {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TMTCIFFormatFieldType)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatFieldType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TMTCIFFormatFieldType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TMTCIFFormatFieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TMTCIFFormatFieldType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Byte Order</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #setByteOrder(TMTCIFFormatFieldByteOrder)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @generated
	 */
	void setByteOrder(TMTCIFFormatFieldByteOrder value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(TMTCIFFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getByteOrder <em>Byte Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Order</em>' attribute is set.
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(TMTCIFFormatFieldByteOrder)
	 * @generated
	 */
	boolean isSetByteOrder();

	/**
	 * Returns the value of the '<em><b>First Bit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #setFirstBit(TMTCIFFormatSFieldFirstBit)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @generated
	 */
	void setFirstBit(TMTCIFFormatSFieldFirstBit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(TMTCIFFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getFirstBit <em>First Bit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Bit</em>' attribute is set.
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(TMTCIFFormatSFieldFirstBit)
	 * @generated
	 */
	boolean isSetFirstBit();

	/**
	 * Returns the value of the '<em><b>Array Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Ref</em>' containment reference.
	 * @see #setArrayRef(TMTCIFFormatArrayRef)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_ArrayRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatArrayRef getArrayRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getArrayRef <em>Array Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Ref</em>' containment reference.
	 * @see #getArrayRef()
	 * @generated
	 */
	void setArrayRef(TMTCIFFormatArrayRef value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(TMTCIFFormatBytesBits)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatBytesBits getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(TMTCIFFormatBytesBits value);

	/**
	 * Returns the value of the '<em><b>Local Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Offset</em>' containment reference.
	 * @see #setLocalOffset(TMTCIFFormatBytesBits)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatAIField_LocalOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatBytesBits getLocalOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField#getLocalOffset <em>Local Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Offset</em>' containment reference.
	 * @see #getLocalOffset()
	 * @generated
	 */
	void setLocalOffset(TMTCIFFormatBytesBits value);

} // TMTCIFFormatAIField
