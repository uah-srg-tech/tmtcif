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
package es.uah.aut.srg.tmtcif.export.impl;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst;
import es.uah.aut.srg.tmtcif.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Export Setting AI From Const</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl#getValue <em>Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSettingAIFromConstImpl#getToArrayIndex <em>To Array Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFExportSettingAIFromConstImpl extends TMTCIFExportSettingImpl implements TMTCIFExportSettingAIFromConst {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ARRAY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected String toArrayIndex = TO_ARRAY_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFExportSettingAIFromConstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI_FROM_CONST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToArrayIndex() {
		return toArrayIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToArrayIndex(String newToArrayIndex) {
		String oldToArrayIndex = toArrayIndex;
		toArrayIndex = newToArrayIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX, oldToArrayIndex, toArrayIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				return getValue();
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				return getToArrayIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				setValue((String)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				setToArrayIndex((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				setToArrayIndex(TO_ARRAY_INDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				return TO_ARRAY_INDEX_EDEFAULT == null ? toArrayIndex != null : !TO_ARRAY_INDEX_EDEFAULT.equals(toArrayIndex);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", toArrayIndex: ");
		result.append(toArrayIndex);
		result.append(')');
		return result.toString();
	}

} //TMTCIFExportSettingAIFromConstImpl
