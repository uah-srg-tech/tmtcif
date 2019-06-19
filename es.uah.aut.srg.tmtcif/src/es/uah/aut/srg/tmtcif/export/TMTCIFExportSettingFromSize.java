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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMTCIF Export Setting From Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize#getSizeRef <em>Size Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettingFromSize()
 * @model
 * @generated
 */
public interface TMTCIFExportSettingFromSize extends TMTCIFExportSetting {
	/**
	 * Returns the value of the '<em><b>Size Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Ref</em>' attribute.
	 * @see #setSizeRef(String)
	 * @see es.uah.aut.srg.tmtcif.export.exportPackage#getTMTCIFExportSettingFromSize_SizeRef()
	 * @model required="true"
	 * @generated
	 */
	String getSizeRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize#getSizeRef <em>Size Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Ref</em>' attribute.
	 * @see #getSizeRef()
	 * @generated
	 */
	void setSizeRef(String value);

} // TMTCIFExportSettingFromSize
