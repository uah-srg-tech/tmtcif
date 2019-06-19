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

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSizes <em>Sizes</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSettings <em>Settings</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getActivateDICs <em>Activate DI Cs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport()
 * @model
 * @generated
 */
public interface TMTCIFExportExport extends TMTCIFModelElement {
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
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport_From()
	 * @model
	 * @generated
	 */
	TMTCIFFormatFormat getFrom();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getFrom <em>From</em>}' reference.
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
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport_To()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFormat getTo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference.
	 * @see #setSizes(TMTCIFExportSizes)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport_Sizes()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFExportSizes getSizes();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSizes <em>Sizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizes</em>' containment reference.
	 * @see #getSizes()
	 * @generated
	 */
	void setSizes(TMTCIFExportSizes value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(TMTCIFExportSettings)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport_Settings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TMTCIFExportSettings getSettings();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(TMTCIFExportSettings value);

	/**
	 * Returns the value of the '<em><b>Activate DI Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate DI Cs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate DI Cs</em>' containment reference.
	 * @see #setActivateDICs(TMTCIFExportActivateDICs)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportExport_ActivateDICs()
	 * @model containment="true"
	 * @generated
	 */
	TMTCIFExportActivateDICs getActivateDICs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport#getActivateDICs <em>Activate DI Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate DI Cs</em>' containment reference.
	 * @see #getActivateDICs()
	 * @generated
	 */
	void setActivateDICs(TMTCIFExportActivateDICs value);

} // TMTCIFExportExport
