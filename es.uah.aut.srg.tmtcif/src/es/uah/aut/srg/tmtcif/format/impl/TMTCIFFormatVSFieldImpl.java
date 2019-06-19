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
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldByteOrder;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSFieldFirstBit;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize;
import es.uah.aut.srg.tmtcif.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Format VS Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getVariableSize <em>Variable Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVSFieldImpl#getGlobalOffset <em>Global Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatVSFieldImpl extends TMTCIFFormatFieldImpl implements TMTCIFFormatVSField {
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
	 * The cached value of the '{@link #getConstSize() <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSize()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits constSize;

	/**
	 * The cached value of the '{@link #getVariableSize() <em>Variable Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSize()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatVariableSize variableSize;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits maxSize;

	/**
	 * The cached value of the '{@link #getGlobalOffset() <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOffset()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatBytesBits globalOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatVSFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_VS_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
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
	public TMTCIFFormatBytesBits getConstSize() {
		return constSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstSize(TMTCIFFormatBytesBits newConstSize, NotificationChain msgs) {
		TMTCIFFormatBytesBits oldConstSize = constSize;
		constSize = newConstSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE, oldConstSize, newConstSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstSize(TMTCIFFormatBytesBits newConstSize) {
		if (newConstSize != constSize) {
			NotificationChain msgs = null;
			if (constSize != null)
				msgs = ((InternalEObject)constSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			if (newConstSize != null)
				msgs = ((InternalEObject)newConstSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			msgs = basicSetConstSize(newConstSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE, newConstSize, newConstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatVariableSize getVariableSize() {
		return variableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSize(TMTCIFFormatVariableSize newVariableSize, NotificationChain msgs) {
		TMTCIFFormatVariableSize oldVariableSize = variableSize;
		variableSize = newVariableSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE, oldVariableSize, newVariableSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSize(TMTCIFFormatVariableSize newVariableSize) {
		if (newVariableSize != variableSize) {
			NotificationChain msgs = null;
			if (variableSize != null)
				msgs = ((InternalEObject)variableSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			if (newVariableSize != null)
				msgs = ((InternalEObject)newVariableSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			msgs = basicSetVariableSize(newVariableSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE, newVariableSize, newVariableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatBytesBits getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSize(TMTCIFFormatBytesBits newMaxSize, NotificationChain msgs) {
		TMTCIFFormatBytesBits oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE, oldMaxSize, newMaxSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(TMTCIFFormatBytesBits newMaxSize) {
		if (newMaxSize != maxSize) {
			NotificationChain msgs = null;
			if (maxSize != null)
				msgs = ((InternalEObject)maxSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			if (newMaxSize != null)
				msgs = ((InternalEObject)newMaxSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			msgs = basicSetMaxSize(newMaxSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE, newMaxSize, newMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatBytesBits getGlobalOffset() {
		return globalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOffset(TMTCIFFormatBytesBits newGlobalOffset, NotificationChain msgs) {
		TMTCIFFormatBytesBits oldGlobalOffset = globalOffset;
		globalOffset = newGlobalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET, oldGlobalOffset, newGlobalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOffset(TMTCIFFormatBytesBits newGlobalOffset) {
		if (newGlobalOffset != globalOffset) {
			NotificationChain msgs = null;
			if (globalOffset != null)
				msgs = ((InternalEObject)globalOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			if (newGlobalOffset != null)
				msgs = ((InternalEObject)newGlobalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			msgs = basicSetGlobalOffset(newGlobalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET, newGlobalOffset, newGlobalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE:
				return basicSetConstSize(null, msgs);
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return basicSetVariableSize(null, msgs);
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE:
				return basicSetMaxSize(null, msgs);
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return basicSetGlobalOffset(null, msgs);
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
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE:
				return getType();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER:
				return getByteOrder();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT:
				return getFirstBit();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE:
				return getConstSize();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return getVariableSize();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE:
				return getMaxSize();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return getGlobalOffset();
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
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE:
				setType((TMTCIFFormatFieldType)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER:
				setByteOrder((TMTCIFFormatFieldByteOrder)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT:
				setFirstBit((TMTCIFFormatSFieldFirstBit)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((TMTCIFFormatBytesBits)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((TMTCIFFormatVariableSize)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((TMTCIFFormatBytesBits)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((TMTCIFFormatBytesBits)newValue);
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
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE:
				unsetType();
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((TMTCIFFormatBytesBits)null);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((TMTCIFFormatVariableSize)null);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((TMTCIFFormatBytesBits)null);
				return;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((TMTCIFFormatBytesBits)null);
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
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__TYPE:
				return isSetType();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__CONST_SIZE:
				return constSize != null;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return variableSize != null;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__MAX_SIZE:
				return maxSize != null;
			case formatPackage.TMTCIF_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return globalOffset != null;
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

} //TMTCIFFormatVSFieldImpl
