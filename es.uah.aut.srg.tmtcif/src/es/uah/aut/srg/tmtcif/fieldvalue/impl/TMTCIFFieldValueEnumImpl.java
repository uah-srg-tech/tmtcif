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
package es.uah.aut.srg.tmtcif.fieldvalue.impl;

import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnumValue;

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValueEnum;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Field Value Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.fieldvalue.impl.TMTCIFFieldValueEnumImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFieldValueEnumImpl extends TMTCIFFieldValueImpl implements TMTCIFFieldValueEnum {
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
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFEnumValue valueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFieldValueEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE_ENUM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF, oldEnumRef, enumRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF, oldEnumRef, enumRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFEnumValue getValueRef() {
		if (valueRef != null && valueRef.eIsProxy()) {
			InternalEObject oldValueRef = (InternalEObject)valueRef;
			valueRef = (TMTCIFEnumValue)eResolveProxy(oldValueRef);
			if (valueRef != oldValueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF, oldValueRef, valueRef));
			}
		}
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFEnumValue basicGetValueRef() {
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(TMTCIFEnumValue newValueRef) {
		TMTCIFEnumValue oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF, oldValueRef, valueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF:
				if (resolve) return getEnumRef();
				return basicGetEnumRef();
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF:
				if (resolve) return getValueRef();
				return basicGetValueRef();
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
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF:
				setEnumRef((TMTCIFEnum)newValue);
				return;
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF:
				setValueRef((TMTCIFEnumValue)newValue);
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
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF:
				setEnumRef((TMTCIFEnum)null);
				return;
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF:
				setValueRef((TMTCIFEnumValue)null);
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
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__ENUM_REF:
				return enumRef != null;
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM__VALUE_REF:
				return valueRef != null;
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFFieldValueEnumImpl
