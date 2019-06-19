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

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Import Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getVirtualSize <em>Virtual Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportImport()
 * @model
 * @generated
 */
public interface TMTCIFImportImport extends TMTCIFModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportImport_From()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFormat getFrom();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportImport_To()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getTo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportImport_DataSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TMTCIFImportDataSource> getDataSource();

	/**
	 * Returns the value of the '<em><b>Virtual Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Size</em>' containment reference.
	 * @see #setVirtualSize(TMTCIFImportVirtualSize)
	 * @see es.uah.aut.srg.tmtcif.import_.importPackage#getTMTCIFImportImport_VirtualSize()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFImportVirtualSize getVirtualSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport#getVirtualSize <em>Virtual Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Size</em>' containment reference.
	 * @see #getVirtualSize()
	 * @generated
	 */
	void setVirtualSize(TMTCIFImportVirtualSize value);

} // TMTCIFImportImport
