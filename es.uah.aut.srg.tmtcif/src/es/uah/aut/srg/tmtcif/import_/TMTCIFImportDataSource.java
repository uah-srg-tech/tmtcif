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
package es.uah.aut.srg.tmtcif.import_;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Import Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getRightTrim <em>Right Trim</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportDataSource()
 * @model
 * @generated
 */
public interface TMTCIFImportDataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(TMTCIFFormatField)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportDataSource_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(TMTCIFFormatField value);

	/**
	 * Returns the value of the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Trim</em>' attribute.
	 * @see #setLeftTrim(String)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportDataSource_LeftTrim()
	 * @model required="true"
	 * @generated
	 */
	String getLeftTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getLeftTrim <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Trim</em>' attribute.
	 * @see #getLeftTrim()
	 * @generated
	 */
	void setLeftTrim(String value);

	/**
	 * Returns the value of the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Trim</em>' attribute.
	 * @see #setRightTrim(String)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportDataSource_RightTrim()
	 * @model required="true"
	 * @generated
	 */
	String getRightTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource#getRightTrim <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Trim</em>' attribute.
	 * @see #getRightTrim()
	 * @generated
	 */
	void setRightTrim(String value);

} // TMTCIFImportDataSource
