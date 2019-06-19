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
package es.uah.aut.srg.tmtcif.import_.impl;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;

import es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource;
import es.uah.aut.srg.tmtcif.import_.importPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Import Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.import_.impl.TMTCIFImportDataSourceImpl#getRightTrim <em>Right Trim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFImportDataSourceImpl extends MinimalEObjectImpl.Container implements TMTCIFImportDataSource {
	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatField fieldRef;

	/**
	 * The default value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected String leftTrim = LEFT_TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected String rightTrim = RIGHT_TRIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFImportDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (TMTCIFFormatField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(TMTCIFFormatField newFieldRef) {
		TMTCIFFormatField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeftTrim() {
		return leftTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTrim(String newLeftTrim) {
		String oldLeftTrim = leftTrim;
		leftTrim = newLeftTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM, oldLeftTrim, leftTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightTrim() {
		return rightTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTrim(String newRightTrim) {
		String oldRightTrim = rightTrim;
		rightTrim = newRightTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM, oldRightTrim, rightTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM:
				return getLeftTrim();
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				return getRightTrim();
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
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF:
				setFieldRef((TMTCIFFormatField)newValue);
				return;
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM:
				setLeftTrim((String)newValue);
				return;
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				setRightTrim((String)newValue);
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
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF:
				setFieldRef((TMTCIFFormatField)null);
				return;
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM:
				setLeftTrim(LEFT_TRIM_EDEFAULT);
				return;
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				setRightTrim(RIGHT_TRIM_EDEFAULT);
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
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF:
				return fieldRef != null;
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM:
				return LEFT_TRIM_EDEFAULT == null ? leftTrim != null : !LEFT_TRIM_EDEFAULT.equals(leftTrim);
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				return RIGHT_TRIM_EDEFAULT == null ? rightTrim != null : !RIGHT_TRIM_EDEFAULT.equals(rightTrim);
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
		result.append(" (leftTrim: ");
		result.append(leftTrim);
		result.append(", rightTrim: ");
		result.append(rightTrim);
		result.append(')');
		return result.toString();
	}

} //TMTCIFImportDataSourceImpl
