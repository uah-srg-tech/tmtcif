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

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Filter Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter()
 * @model abstract="true"
 * @generated
 */
public interface TMTCIFFilterFilter extends TMTCIFModelElement {
	/**
	 * Returns the value of the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format File</em>' reference.
	 * @see #setFormatFile(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter_FormatFile()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFormat getFormatFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter#getFormatFile <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format File</em>' reference.
	 * @see #getFormatFile()
	 * @generated
	 */
	void setFormatFile(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Bool Var</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter_BoolVar()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFilterBoolVar> getBoolVar();

	/**
	 * Returns the value of the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Array Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Array Item</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter_BoolVarFromArrayItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFilterBoolVarFromArrayItem> getBoolVarFromArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Grouped Array Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Grouped Array Item</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter_BoolVarFromGroupedArrayItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var FDIC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var FDIC</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.filter.filterPackage#getTMTCIFFilterFilter_BoolVarFDIC()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFFilterBoolVarFDIC> getBoolVarFDIC();

} // TMTCIFFilterFilter
