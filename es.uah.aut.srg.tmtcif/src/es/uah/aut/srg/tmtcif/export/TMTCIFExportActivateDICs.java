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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export Activate DI Cs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs#getDIC <em>DIC</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportActivateDICs()
 * @model
 * @generated
 */
public interface TMTCIFExportActivateDICs extends EObject {
	/**
	 * Returns the value of the '<em><b>DIC</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIC</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportActivateDICs_DIC()
	 * @model containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<TMTCIFExportDIC> getDIC();

} // TMTCIFExportActivateDICs
