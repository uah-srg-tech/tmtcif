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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCheckType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck;
import es.uah.aut.srg.tmtcif.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Format FDIC Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getFloatingOffset <em>Floating Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFDICFieldImpl#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatFDICFieldImpl extends TMTCIFFormatFieldImpl implements TMTCIFFormatFDICField {
	/**
	 * The default value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatCheckType CHECK_TYPE_EDEFAULT = TMTCIFFormatCheckType.CRC16;

	/**
	 * The cached value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatCheckType checkType = CHECK_TYPE_EDEFAULT;

	/**
	 * This is true if the Check Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkTypeESet;

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
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits size;

	/**
	 * The cached value of the '{@link #getFloatingOffset() <em>Floating Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingOffset()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFloatingOffset floatingOffset;

	/**
	 * The cached value of the '{@link #getSortedFieldsToCheck() <em>Sorted Fields To Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortedFieldsToCheck()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatSortedFieldsToCheck sortedFieldsToCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatFDICFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_FDIC_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatCheckType getCheckType() {
		return checkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckType(TMTCIFFormatCheckType newCheckType) {
		TMTCIFFormatCheckType oldCheckType = checkType;
		checkType = newCheckType == null ? CHECK_TYPE_EDEFAULT : newCheckType;
		boolean oldCheckTypeESet = checkTypeESet;
		checkTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE, oldCheckType, checkType, !oldCheckTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckType() {
		TMTCIFFormatCheckType oldCheckType = checkType;
		boolean oldCheckTypeESet = checkTypeESet;
		checkType = CHECK_TYPE_EDEFAULT;
		checkTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE, oldCheckType, CHECK_TYPE_EDEFAULT, oldCheckTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckType() {
		return checkTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFloatingOffset getFloatingOffset() {
		return floatingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingOffset(TMTCIFFormatFloatingOffset newFloatingOffset, NotificationChain msgs) {
		TMTCIFFormatFloatingOffset oldFloatingOffset = floatingOffset;
		floatingOffset = newFloatingOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET, oldFloatingOffset, newFloatingOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingOffset(TMTCIFFormatFloatingOffset newFloatingOffset) {
		if (newFloatingOffset != floatingOffset) {
			NotificationChain msgs = null;
			if (floatingOffset != null)
				msgs = ((InternalEObject)floatingOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET, null, msgs);
			if (newFloatingOffset != null)
				msgs = ((InternalEObject)newFloatingOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET, null, msgs);
			msgs = basicSetFloatingOffset(newFloatingOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET, newFloatingOffset, newFloatingOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatSortedFieldsToCheck getSortedFieldsToCheck() {
		return sortedFieldsToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck newSortedFieldsToCheck, NotificationChain msgs) {
		TMTCIFFormatSortedFieldsToCheck oldSortedFieldsToCheck = sortedFieldsToCheck;
		sortedFieldsToCheck = newSortedFieldsToCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, oldSortedFieldsToCheck, newSortedFieldsToCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck newSortedFieldsToCheck) {
		if (newSortedFieldsToCheck != sortedFieldsToCheck) {
			NotificationChain msgs = null;
			if (sortedFieldsToCheck != null)
				msgs = ((InternalEObject)sortedFieldsToCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, null, msgs);
			if (newSortedFieldsToCheck != null)
				msgs = ((InternalEObject)newSortedFieldsToCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, null, msgs);
			msgs = basicSetSortedFieldsToCheck(newSortedFieldsToCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, newSortedFieldsToCheck, newSortedFieldsToCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return basicSetFloatingOffset(null, msgs);
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return basicSetSortedFieldsToCheck(null, msgs);
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
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE:
				return getCheckType();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER:
				return getByteOrder();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT:
				return getFirstBit();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE:
				return getSize();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return getFloatingOffset();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return getSortedFieldsToCheck();
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
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE:
				setCheckType((TMTCIFFormatCheckType)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER:
				setByteOrder((TMTCIFFormatFieldByteOrder)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT:
				setFirstBit((TMTCIFFormatSFieldFirstBit)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE:
				setSize((TMTCIFFormatBytesBits)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				setFloatingOffset((TMTCIFFormatFloatingOffset)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				setSortedFieldsToCheck((TMTCIFFormatSortedFieldsToCheck)newValue);
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
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE:
				unsetCheckType();
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE:
				setSize((TMTCIFFormatBytesBits)null);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				setFloatingOffset((TMTCIFFormatFloatingOffset)null);
				return;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				setSortedFieldsToCheck((TMTCIFFormatSortedFieldsToCheck)null);
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
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__CHECK_TYPE:
				return isSetCheckType();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SIZE:
				return size != null;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return floatingOffset != null;
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return sortedFieldsToCheck != null;
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
		result.append(" (checkType: ");
		if (checkTypeESet) result.append(checkType); else result.append("<unset>");
		result.append(", byteOrder: ");
		if (byteOrderESet) result.append(byteOrder); else result.append("<unset>");
		result.append(", firstBit: ");
		if (firstBitESet) result.append(firstBit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TMTCIFFormatFDICFieldImpl
