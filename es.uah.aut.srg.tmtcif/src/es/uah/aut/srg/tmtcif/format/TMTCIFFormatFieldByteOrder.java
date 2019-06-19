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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TMTCIF Format Field Byte Order</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFieldByteOrder()
 * @model
 * @generated
 */
public enum TMTCIFFormatFieldByteOrder implements Enumerator {
	/**
	 * The '<em><b>Big endian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	BIG_ENDIAN(0, "big_endian", "big_endian"),

	/**
	 * The '<em><b>Little endian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE_ENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	LITTLE_ENDIAN(1, "little_endian", "little_endian"),

	/**
	 * The '<em><b>Na</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(2, "na", "na");

	/**
	 * The '<em><b>Big endian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Big endian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_ENDIAN
	 * @model name="big_endian"
	 * @generated
	 * @ordered
	 */
	public static final int BIG_ENDIAN_VALUE = 0;

	/**
	 * The '<em><b>Little endian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Little endian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITTLE_ENDIAN
	 * @model name="little_endian"
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE_ENDIAN_VALUE = 1;

	/**
	 * The '<em><b>Na</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Na</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model name="na"
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 2;

	/**
	 * An array of all the '<em><b>TMTCIF Format Field Byte Order</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TMTCIFFormatFieldByteOrder[] VALUES_ARRAY =
		new TMTCIFFormatFieldByteOrder[] {
			BIG_ENDIAN,
			LITTLE_ENDIAN,
			NA,
		};

	/**
	 * A public read-only list of all the '<em><b>TMTCIF Format Field Byte Order</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TMTCIFFormatFieldByteOrder> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TMTCIF Format Field Byte Order</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TMTCIFFormatFieldByteOrder get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TMTCIFFormatFieldByteOrder result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TMTCIF Format Field Byte Order</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TMTCIFFormatFieldByteOrder getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TMTCIFFormatFieldByteOrder result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TMTCIF Format Field Byte Order</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TMTCIFFormatFieldByteOrder get(int value) {
		switch (value) {
			case BIG_ENDIAN_VALUE: return BIG_ENDIAN;
			case LITTLE_ENDIAN_VALUE: return LITTLE_ENDIAN;
			case NA_VALUE: return NA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TMTCIFFormatFieldByteOrder(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TMTCIFFormatFieldByteOrder
