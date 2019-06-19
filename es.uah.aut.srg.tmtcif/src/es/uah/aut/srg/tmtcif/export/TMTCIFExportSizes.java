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
 * A representation of the model object '<em><b>TMTCIF Export Sizes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLength <em>Size From File Length</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeFromFileLine <em>Size From File Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSizes()
 * @model
 * @generated
 */
public interface TMTCIFExportSizes extends EObject {
	/**
	 * Returns the value of the '<em><b>Size From File Length</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size From File Length</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size From File Length</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSizes_SizeFromFileLength()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSizeFromFileLength> getSizeFromFileLength();

	/**
	 * Returns the value of the '<em><b>Size From File Line</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size From File Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size From File Line</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSizes_SizeFromFileLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSizeFromFileLine> getSizeFromFileLine();

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' containment reference list.
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSizes_SizeInBits()
	 * @model containment="true"
	 * @generated
	 */
	EList<TMTCIFExportSizeInBits> getSizeInBits();

} // TMTCIFExportSizes
