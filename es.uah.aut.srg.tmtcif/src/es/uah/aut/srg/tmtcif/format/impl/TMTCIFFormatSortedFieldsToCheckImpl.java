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

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck;
import es.uah.aut.srg.tmtcif.format.formatPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Format Sorted Fields To Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatSortedFieldsToCheckImpl#getFieldToCheck <em>Field To Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatSortedFieldsToCheckImpl extends MinimalEObjectImpl.Container implements TMTCIFFormatSortedFieldsToCheck {
	/**
	 * The cached value of the '{@link #getFieldToCheck() <em>Field To Check</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldToCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatFieldToCheck> fieldToCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatSortedFieldsToCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatFieldToCheck> getFieldToCheck() {
		if (fieldToCheck == null) {
			fieldToCheck = new EObjectContainmentEList<TMTCIFFormatFieldToCheck>(TMTCIFFormatFieldToCheck.class, this, formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK);
		}
		return fieldToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK:
				return ((InternalEList<?>)getFieldToCheck()).basicRemove(otherEnd, msgs);
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
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK:
				return getFieldToCheck();
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
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK:
				getFieldToCheck().clear();
				getFieldToCheck().addAll((Collection<? extends TMTCIFFormatFieldToCheck>)newValue);
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
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK:
				getFieldToCheck().clear();
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
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK:
				return fieldToCheck != null && !fieldToCheck.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFFormatSortedFieldsToCheckImpl
