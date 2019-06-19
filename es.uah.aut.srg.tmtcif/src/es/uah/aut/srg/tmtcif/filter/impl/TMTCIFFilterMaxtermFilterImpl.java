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

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter;
import es.uah.aut.srg.tmtcif.filter.filterPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Filter Maxterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMaxtermFilterImpl#getMaxterm <em>Maxterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFilterMaxtermFilterImpl extends TMTCIFFilterFilterImpl implements TMTCIFFilterMaxtermFilter {
	/**
	 * The cached value of the '{@link #getMaxterm() <em>Maxterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxterm()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterMaxterm> maxterm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFilterMaxtermFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.TMTCIF_FILTER_MAXTERM_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterMaxterm> getMaxterm() {
		if (maxterm == null) {
			maxterm = new EObjectContainmentEList<TMTCIFFilterMaxterm>(TMTCIFFilterMaxterm.class, this, filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM);
		}
		return maxterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM:
				return ((InternalEList<?>)getMaxterm()).basicRemove(otherEnd, msgs);
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
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM:
				return getMaxterm();
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
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM:
				getMaxterm().clear();
				getMaxterm().addAll((Collection<? extends TMTCIFFilterMaxterm>)newValue);
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
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM:
				getMaxterm().clear();
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
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER__MAXTERM:
				return maxterm != null && !maxterm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFFilterMaxtermFilterImpl
