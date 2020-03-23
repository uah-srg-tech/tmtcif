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
package es.uah.aut.srg.tmtcif.tcheader.impl;

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueRaw;

import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeaderField;
import es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIFTC Header Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl#getFieldValue <em>Field Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMTCIFTCHeaderFieldImpl extends MinimalEObjectImpl.Container implements TMTCIFTCHeaderField {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFieldValue() <em>Field Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldValue()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFieldValueRaw fieldValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFTCHeaderFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcheaderPackage.Literals.TMTCIFTC_HEADER_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFieldValueRaw getFieldValue() {
		return fieldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFieldValue(TMTCIFFieldValueRaw newFieldValue, NotificationChain msgs) {
		TMTCIFFieldValueRaw oldFieldValue = fieldValue;
		fieldValue = newFieldValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE, oldFieldValue, newFieldValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldValue(TMTCIFFieldValueRaw newFieldValue) {
		if (newFieldValue != fieldValue) {
			NotificationChain msgs = null;
			if (fieldValue != null)
				msgs = ((InternalEObject)fieldValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE, null, msgs);
			if (newFieldValue != null)
				msgs = ((InternalEObject)newFieldValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE, null, msgs);
			msgs = basicSetFieldValue(newFieldValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE, newFieldValue, newFieldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE:
				return basicSetFieldValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME:
				return getName();
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE:
				return getFieldValue();
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
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME:
				setName((String)newValue);
				return;
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE:
				setFieldValue((TMTCIFFieldValueRaw)newValue);
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
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE:
				setFieldValue((TMTCIFFieldValueRaw)null);
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
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE:
				return fieldValue != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TMTCIFTCHeaderFieldImpl
