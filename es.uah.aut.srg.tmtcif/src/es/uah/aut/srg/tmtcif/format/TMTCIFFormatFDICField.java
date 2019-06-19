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
 * A representation of the model object '<em><b>TMTCIF Format FDIC Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFloatingOffset <em>Floating Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField()
 * @model
 * @generated
 */
public interface TMTCIFFormatFDICField extends TMTCIFFormatField {
	/**
	 * Returns the value of the '<em><b>Check Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType
	 * @see #isSetCheckType()
	 * @see #unsetCheckType()
	 * @see #setCheckType(TMTCIFFormatCheckType)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_CheckType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatCheckType getCheckType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType
	 * @see #isSetCheckType()
	 * @see #unsetCheckType()
	 * @see #getCheckType()
	 * @generated
	 */
	void setCheckType(TMTCIFFormatCheckType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckType()
	 * @see #getCheckType()
	 * @see #setCheckType(TMTCIFFormatCheckType)
	 * @generated
	 */
	void unsetCheckType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getCheckType <em>Check Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check Type</em>' attribute is set.
	 * @see #unsetCheckType()
	 * @see #getCheckType()
	 * @see #setCheckType(TMTCIFFormatCheckType)
	 * @generated
	 */
	boolean isSetCheckType();

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
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(TMTCIFFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute is set.
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
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit <em>First Bit</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(TMTCIFFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFirstBit <em>First Bit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(TMTCIFFormatBytesBits)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatBytesBits getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(TMTCIFFormatBytesBits value);

	/**
	 * Returns the value of the '<em><b>Floating Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Offset</em>' containment reference.
	 * @see #setFloatingOffset(TMTCIFFormatFloatingOffset)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_FloatingOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatFloatingOffset getFloatingOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getFloatingOffset <em>Floating Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Offset</em>' containment reference.
	 * @see #getFloatingOffset()
	 * @generated
	 */
	void setFloatingOffset(TMTCIFFormatFloatingOffset value);

	/**
	 * Returns the value of the '<em><b>Sorted Fields To Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorted Fields To Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorted Fields To Check</em>' containment reference.
	 * @see #setSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFDICField_SortedFieldsToCheck()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFFormatSortedFieldsToCheck getSortedFieldsToCheck();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorted Fields To Check</em>' containment reference.
	 * @see #getSortedFieldsToCheck()
	 * @generated
	 */
	void setSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck value);

} // TMTCIFFormatFDICField
