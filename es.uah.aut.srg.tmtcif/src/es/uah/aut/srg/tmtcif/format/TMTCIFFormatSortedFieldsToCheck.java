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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Format Sorted Fields To Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck#getFieldToCheck <em>Field To Check</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatSortedFieldsToCheck()
 * @model
 * @generated
 */
public interface TMTCIFFormatSortedFieldsToCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Field To Check</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field To Check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field To Check</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.format.formatPackage#getTMTCIFFormatSortedFieldsToCheck_FieldToCheck()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFormatFieldToCheck> getFieldToCheck();

} // TMTCIFFormatSortedFieldsToCheck
