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
package es.uah.aut.srg.tmtcif.filter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Minterm Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter#getMinterm <em>Minterm</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterMintermFilter()
 * @model
 * @generated
 */
public interface TMTCIFFilterMintermFilter extends TMTCIFFilterFilter {
	/**
	 * Returns the value of the '<em><b>Minterm</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minterm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minterm</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterMintermFilter_Minterm()
	 * @model containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<TMTCIFFilterMinterm> getMinterm();

} // TMTCIFFilterMintermFilter
