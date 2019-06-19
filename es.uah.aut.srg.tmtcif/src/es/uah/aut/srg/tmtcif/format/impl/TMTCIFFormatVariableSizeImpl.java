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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatPower;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatUnit;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize;
import es.uah.aut.srg.tmtcif.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Format Variable Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl#getFidRef <em>Fid Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatVariableSizeImpl#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatVariableSizeImpl extends MinimalEObjectImpl.Container implements TMTCIFFormatVariableSize {
	/**
	 * The default value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected String fidRef = FID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatUnit UNIT_EDEFAULT = TMTCIFFormatUnit.BYTES;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatUnit unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatPower POWER_EDEFAULT = TMTCIFFormatPower._2;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatPower power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatVariableSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_VARIABLE_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFidRef() {
		return fidRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFidRef(String newFidRef) {
		String oldFidRef = fidRef;
		fidRef = newFidRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF, oldFidRef, fidRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TMTCIFFormatUnit newUnit) {
		TMTCIFFormatUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		TMTCIFFormatUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatPower getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(TMTCIFFormatPower newPower) {
		TMTCIFFormatPower oldPower = power;
		power = newPower == null ? POWER_EDEFAULT : newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER, oldPower, power, !oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		TMTCIFFormatPower oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER, oldPower, POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF:
				return getFidRef();
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT:
				return getUnit();
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER:
				return getPower();
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
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF:
				setFidRef((String)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT:
				setUnit((TMTCIFFormatUnit)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER:
				setPower((TMTCIFFormatPower)newValue);
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
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF:
				setFidRef(FID_REF_EDEFAULT);
				return;
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT:
				unsetUnit();
				return;
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER:
				unsetPower();
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
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__FID_REF:
				return FID_REF_EDEFAULT == null ? fidRef != null : !FID_REF_EDEFAULT.equals(fidRef);
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__UNIT:
				return isSetUnit();
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE__POWER:
				return isSetPower();
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
		result.append(" (fidRef: ");
		result.append(fidRef);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(", power: ");
		if (powerESet) result.append(power); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TMTCIFFormatVariableSizeImpl
