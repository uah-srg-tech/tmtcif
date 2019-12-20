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
package es.uah.aut.srg.tmtcif.fieldvalue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Field Value File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage#getTMTCIFFieldValueFile()
 * @model
 * @generated
 */
public interface TMTCIFFieldValueFile extends TMTCIFFieldValue {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage#getTMTCIFFieldValueFile_Filename()
	 * @model required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueFile#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // TMTCIFFieldValueFile
