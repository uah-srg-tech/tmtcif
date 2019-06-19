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
package es.uah.aut.srg.tmtcif.filter.impl;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm;
import es.uah.aut.srg.tmtcif.filter.filterPackage;

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
 * An implementation of the model object '<em><b>TMTCIF Filter Minterm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermImpl#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFilterMintermImpl extends MinimalEObjectImpl.Container implements TMTCIFFilterMinterm {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoolVarRef() <em>Bool Var Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarRef()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterBoolVarRef> boolVarRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFilterMintermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.TMTCIF_FILTER_MINTERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_MINTERM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterBoolVarRef> getBoolVarRef() {
		if (boolVarRef == null) {
			boolVarRef = new EObjectContainmentEList<TMTCIFFilterBoolVarRef>(TMTCIFFilterBoolVarRef.class, this, filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF);
		}
		return boolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF:
				return ((InternalEList<?>)getBoolVarRef()).basicRemove(otherEnd, msgs);
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
			case filterPackage.TMTCIF_FILTER_MINTERM__ID:
				return getId();
			case filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF:
				return getBoolVarRef();
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
			case filterPackage.TMTCIF_FILTER_MINTERM__ID:
				setId((String)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF:
				getBoolVarRef().clear();
				getBoolVarRef().addAll((Collection<? extends TMTCIFFilterBoolVarRef>)newValue);
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
			case filterPackage.TMTCIF_FILTER_MINTERM__ID:
				setId(ID_EDEFAULT);
				return;
			case filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF:
				getBoolVarRef().clear();
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
			case filterPackage.TMTCIF_FILTER_MINTERM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case filterPackage.TMTCIF_FILTER_MINTERM__BOOL_VAR_REF:
				return boolVarRef != null && !boolVarRef.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TMTCIFFilterMintermImpl
