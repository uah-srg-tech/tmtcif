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

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter;
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
 * An implementation of the model object '<em><b>TMTCIF Filter Minterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterMintermFilterImpl#getMinterm <em>Minterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFilterMintermFilterImpl extends TMTCIFFilterFilterImpl implements TMTCIFFilterMintermFilter {
	/**
	 * The cached value of the '{@link #getMinterm() <em>Minterm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinterm()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterMinterm> minterm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFilterMintermFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.TMTCIF_FILTER_MINTERM_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterMinterm> getMinterm() {
		if (minterm == null) {
			minterm = new EObjectContainmentEList<TMTCIFFilterMinterm>(TMTCIFFilterMinterm.class, this, filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM);
		}
		return minterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM:
				return ((InternalEList<?>)getMinterm()).basicRemove(otherEnd, msgs);
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
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM:
				return getMinterm();
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
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
				getMinterm().addAll((Collection<? extends TMTCIFFilterMinterm>)newValue);
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
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
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
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER__MINTERM:
				return minterm != null && !minterm.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFFilterMintermFilterImpl
