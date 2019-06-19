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
package es.uah.aut.srg.tmtcif.export;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export DIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getDICRef <em>DIC Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportDIC()
 * @model
 * @generated
 */
public interface TMTCIFExportDIC extends EObject {
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
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportDIC_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>DIC Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIC Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIC Ref</em>' attribute.
	 * @see #setDICRef(String)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportDIC_DICRef()
	 * @model required="true"
	 * @generated
	 */
	String getDICRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC#getDICRef <em>DIC Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIC Ref</em>' attribute.
	 * @see #getDICRef()
	 * @generated
	 */
	void setDICRef(String value);

} // TMTCIFExportDIC
