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
package es.uah.aut.srg.tmtcif.format.impl;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit;
import es.uah.aut.srg.tmtcif.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Format AI Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getArrayRef <em>Array Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatAIFieldImpl#getLocalOffset <em>Local Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatAIFieldImpl extends TMTCIFFormatFieldImpl implements TMTCIFFormatAIField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatFieldType TYPE_EDEFAULT = TMTCIFFormatFieldType.STRUCTURED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFieldType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatFieldByteOrder BYTE_ORDER_EDEFAULT = TMTCIFFormatFieldByteOrder.BIG_ENDIAN;

	/**
	 * The cached value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFieldByteOrder byteOrder = BYTE_ORDER_EDEFAULT;

	/**
	 * This is true if the Byte Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean byteOrderESet;

	/**
	 * The default value of the '{@link #getFirstBit() <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatSFieldFirstBit FIRST_BIT_EDEFAULT = TMTCIFFormatSFieldFirstBit.MSB;

	/**
	 * The cached value of the '{@link #getFirstBit() <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatSFieldFirstBit firstBit = FIRST_BIT_EDEFAULT;

	/**
	 * This is true if the First Bit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstBitESet;

	/**
	 * The cached value of the '{@link #getArrayRef() <em>Array Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatArrayRef arrayRef;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits size;

	/**
	 * The cached value of the '{@link #getLocalOffset() <em>Local Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffset()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits localOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatAIFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_AI_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFieldType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TMTCIFFormatFieldType newType) {
		TMTCIFFormatFieldType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TMTCIFFormatFieldType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFieldByteOrder getByteOrder() {
		return byteOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrder(TMTCIFFormatFieldByteOrder newByteOrder) {
		TMTCIFFormatFieldByteOrder oldByteOrder = byteOrder;
		byteOrder = newByteOrder == null ? BYTE_ORDER_EDEFAULT : newByteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByteOrder() {
		TMTCIFFormatFieldByteOrder oldByteOrder = byteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrder = BYTE_ORDER_EDEFAULT;
		byteOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetByteOrder() {
		return byteOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatSFieldFirstBit getFirstBit() {
		return firstBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBit(TMTCIFFormatSFieldFirstBit newFirstBit) {
		TMTCIFFormatSFieldFirstBit oldFirstBit = firstBit;
		firstBit = newFirstBit == null ? FIRST_BIT_EDEFAULT : newFirstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstBit() {
		TMTCIFFormatSFieldFirstBit oldFirstBit = firstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBit = FIRST_BIT_EDEFAULT;
		firstBitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstBit() {
		return firstBitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatArrayRef getArrayRef() {
		return arrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayRef(TMTCIFFormatArrayRef newArrayRef, NotificationChain msgs) {
		TMTCIFFormatArrayRef oldArrayRef = arrayRef;
		arrayRef = newArrayRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF, oldArrayRef, newArrayRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayRef(TMTCIFFormatArrayRef newArrayRef) {
		if (newArrayRef != arrayRef) {
			NotificationChain msgs = null;
			if (arrayRef != null)
				msgs = ((InternalEObject)arrayRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			if (newArrayRef != null)
				msgs = ((InternalEObject)newArrayRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			msgs = basicSetArrayRef(newArrayRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF, newArrayRef, newArrayRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatBytesBits getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(TMTCIFFormatBytesBits newSize, NotificationChain msgs) {
		TMTCIFFormatBytesBits oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(TMTCIFFormatBytesBits newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatBytesBits getLocalOffset() {
		return localOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalOffset(TMTCIFFormatBytesBits newLocalOffset, NotificationChain msgs) {
		TMTCIFFormatBytesBits oldLocalOffset = localOffset;
		localOffset = newLocalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET, oldLocalOffset, newLocalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOffset(TMTCIFFormatBytesBits newLocalOffset) {
		if (newLocalOffset != localOffset) {
			NotificationChain msgs = null;
			if (localOffset != null)
				msgs = ((InternalEObject)localOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			if (newLocalOffset != null)
				msgs = ((InternalEObject)newLocalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			msgs = basicSetLocalOffset(newLocalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET, newLocalOffset, newLocalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF:
				return basicSetArrayRef(null, msgs);
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return basicSetLocalOffset(null, msgs);
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
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE:
				return getType();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER:
				return getByteOrder();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT:
				return getFirstBit();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF:
				return getArrayRef();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE:
				return getSize();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return getLocalOffset();
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
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE:
				setType((TMTCIFFormatFieldType)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER:
				setByteOrder((TMTCIFFormatFieldByteOrder)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT:
				setFirstBit((TMTCIFFormatSFieldFirstBit)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((TMTCIFFormatArrayRef)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE:
				setSize((TMTCIFFormatBytesBits)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((TMTCIFFormatBytesBits)newValue);
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
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE:
				unsetType();
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((TMTCIFFormatArrayRef)null);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE:
				setSize((TMTCIFFormatBytesBits)null);
				return;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((TMTCIFFormatBytesBits)null);
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
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__TYPE:
				return isSetType();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__ARRAY_REF:
				return arrayRef != null;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__SIZE:
				return size != null;
			case formatPackage.TMTCIF_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return localOffset != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", byteOrder: ");
		if (byteOrderESet) result.append(byteOrder); else result.append("<unset>");
		result.append(", firstBit: ");
		if (firstBitESet) result.append(firstBit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TMTCIFFormatAIFieldImpl
