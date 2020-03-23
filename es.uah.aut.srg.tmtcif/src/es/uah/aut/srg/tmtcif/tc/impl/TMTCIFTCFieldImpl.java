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
package es.uah.aut.srg.tmtcif.tc.impl;

import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;

import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;
import es.uah.aut.srg.tmtcif.tc.tcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIFTC Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl#getEnumRef <em>Enum Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMTCIFTCFieldImpl extends MinimalEObjectImpl.Container implements TMTCIFTCField {
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
	 * The cached value of the '{@link #getEnumRef() <em>Enum Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFEnum enumRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFTCFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcPackage.Literals.TMTCIFTC_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.TMTCIFTC_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFEnum getEnumRef() {
		if (enumRef != null && enumRef.eIsProxy()) {
			InternalEObject oldEnumRef = (InternalEObject)enumRef;
			enumRef = (TMTCIFEnum)eResolveProxy(oldEnumRef);
			if (enumRef != oldEnumRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcPackage.TMTCIFTC_FIELD__ENUM_REF, oldEnumRef, enumRef));
			}
		}
		return enumRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFEnum basicGetEnumRef() {
		return enumRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumRef(TMTCIFEnum newEnumRef) {
		TMTCIFEnum oldEnumRef = enumRef;
		enumRef = newEnumRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcPackage.TMTCIFTC_FIELD__ENUM_REF, oldEnumRef, enumRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tcPackage.TMTCIFTC_FIELD__NAME:
				return getName();
			case tcPackage.TMTCIFTC_FIELD__ENUM_REF:
				if (resolve) return getEnumRef();
				return basicGetEnumRef();
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
			case tcPackage.TMTCIFTC_FIELD__NAME:
				setName((String)newValue);
				return;
			case tcPackage.TMTCIFTC_FIELD__ENUM_REF:
				setEnumRef((TMTCIFEnum)newValue);
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
			case tcPackage.TMTCIFTC_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tcPackage.TMTCIFTC_FIELD__ENUM_REF:
				setEnumRef((TMTCIFEnum)null);
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
			case tcPackage.TMTCIFTC_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tcPackage.TMTCIFTC_FIELD__ENUM_REF:
				return enumRef != null;
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

} //TMTCIFTCFieldImpl
