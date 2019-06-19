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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Format Variable Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getFidRef <em>Fid Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatVariableSize()
 * @model
 * @generated
 */
public interface TMTCIFFormatVariableSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fid Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fid Ref</em>' attribute.
	 * @see #setFidRef(String)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatVariableSize_FidRef()
	 * @model required="true"
	 * @generated
	 */
	String getFidRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getFidRef <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fid Ref</em>' attribute.
	 * @see #getFidRef()
	 * @generated
	 */
	void setFidRef(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(TMTCIFFormatUnit)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatVariableSize_Unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TMTCIFFormatUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TMTCIFFormatUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(TMTCIFFormatUnit)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(TMTCIFFormatPower)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatVariableSize_Power()
	 * @model unsettable="true"
	 * @generated
	 */
	TMTCIFFormatPower getPower();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(TMTCIFFormatPower value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(TMTCIFFormatPower)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(TMTCIFFormatPower)
	 * @generated
	 */
	boolean isSetPower();

} // TMTCIFFormatVariableSize
