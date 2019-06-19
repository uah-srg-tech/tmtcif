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

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Format Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat()
 * @model
 * @generated
 */
public interface TMTCIFFormatFormat extends TMTCIFModelElement {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TMTCIFFormatFormatType)
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	TMTCIFFormatFormatType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TMTCIFFormatFormatType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TMTCIFFormatFormatType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TMTCIFFormatFormatType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>CS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_CSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatCSField> getCSField();

	/**
	 * Returns the value of the '<em><b>CS Formula Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CS Formula Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CS Formula Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_CSFormulaField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatCSFormulaField> getCSFormulaField();

	/**
	 * Returns the value of the '<em><b>VS Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VS Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VS Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_VSField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatVSField> getVSField();

	/**
	 * Returns the value of the '<em><b>FDIC Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FDIC Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FDIC Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_FDICField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatFDICField> getFDICField();

	/**
	 * Returns the value of the '<em><b>VR Field Size</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VR Field Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VR Field Size</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_VRFieldSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatVRFieldSize> getVRFieldSize();

	/**
	 * Returns the value of the '<em><b>AField</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AField</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AField</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_AField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatAField> getAField();

	/**
	 * Returns the value of the '<em><b>AI Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatFormat_AIField()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatAIField> getAIField();

} // TMTCIFFormatFormat
