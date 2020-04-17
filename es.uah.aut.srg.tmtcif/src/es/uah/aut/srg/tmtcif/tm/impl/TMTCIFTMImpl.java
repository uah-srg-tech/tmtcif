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
package es.uah.aut.srg.tmtcif.tm.impl;

import es.uah.aut.srg.tmtcif.tm.TMTCIFPI1;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTM;
import es.uah.aut.srg.tmtcif.tm.TMTCIFTMField;
import es.uah.aut.srg.tmtcif.tm.tmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIFTM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl#getPi1 <em>Pi1</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.tm.impl.TMTCIFTMImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMTCIFTMImpl extends MinimalEObjectImpl.Container implements TMTCIFTM {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected String subtype = SUBTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPi1() <em>Pi1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPi1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFPI1 pi1;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFTMField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFTMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmPackage.Literals.TMTCIFTM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.TMTCIFTM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.TMTCIFTM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(String newSubtype) {
		String oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.TMTCIFTM__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFPI1 getPi1() {
		return pi1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPi1(TMTCIFPI1 newPi1, NotificationChain msgs) {
		TMTCIFPI1 oldPi1 = pi1;
		pi1 = newPi1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tmPackage.TMTCIFTM__PI1, oldPi1, newPi1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPi1(TMTCIFPI1 newPi1) {
		if (newPi1 != pi1) {
			NotificationChain msgs = null;
			if (pi1 != null)
				msgs = ((InternalEObject)pi1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tmPackage.TMTCIFTM__PI1, null, msgs);
			if (newPi1 != null)
				msgs = ((InternalEObject)newPi1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tmPackage.TMTCIFTM__PI1, null, msgs);
			msgs = basicSetPi1(newPi1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmPackage.TMTCIFTM__PI1, newPi1, newPi1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFTMField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<TMTCIFTMField>(TMTCIFTMField.class, this, tmPackage.TMTCIFTM__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tmPackage.TMTCIFTM__PI1:
				return basicSetPi1(null, msgs);
			case tmPackage.TMTCIFTM__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case tmPackage.TMTCIFTM__NAME:
				return getName();
			case tmPackage.TMTCIFTM__TYPE:
				return getType();
			case tmPackage.TMTCIFTM__SUBTYPE:
				return getSubtype();
			case tmPackage.TMTCIFTM__PI1:
				return getPi1();
			case tmPackage.TMTCIFTM__FIELDS:
				return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case tmPackage.TMTCIFTM__NAME:
				setName((String)newValue);
				return;
			case tmPackage.TMTCIFTM__TYPE:
				setType((String)newValue);
				return;
			case tmPackage.TMTCIFTM__SUBTYPE:
				setSubtype((String)newValue);
				return;
			case tmPackage.TMTCIFTM__PI1:
				setPi1((TMTCIFPI1)newValue);
				return;
			case tmPackage.TMTCIFTM__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends TMTCIFTMField>)newValue);
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
			case tmPackage.TMTCIFTM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tmPackage.TMTCIFTM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case tmPackage.TMTCIFTM__SUBTYPE:
				setSubtype(SUBTYPE_EDEFAULT);
				return;
			case tmPackage.TMTCIFTM__PI1:
				setPi1((TMTCIFPI1)null);
				return;
			case tmPackage.TMTCIFTM__FIELDS:
				getFields().clear();
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
			case tmPackage.TMTCIFTM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tmPackage.TMTCIFTM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case tmPackage.TMTCIFTM__SUBTYPE:
				return SUBTYPE_EDEFAULT == null ? subtype != null : !SUBTYPE_EDEFAULT.equals(subtype);
			case tmPackage.TMTCIFTM__PI1:
				return pi1 != null;
			case tmPackage.TMTCIFTM__FIELDS:
				return fields != null && !fields.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", subtype: ");
		result.append(subtype);
		result.append(')');
		return result.toString();
	}

} //TMTCIFTMImpl
