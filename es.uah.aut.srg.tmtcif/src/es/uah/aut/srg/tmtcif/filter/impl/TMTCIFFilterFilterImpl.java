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

import es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;
import es.uah.aut.srg.tmtcif.filter.filterPackage;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Filter Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterFilterImpl#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMTCIFFilterFilterImpl extends TMTCIFModelElementImpl implements TMTCIFFilterFilter {
	/**
	 * The cached value of the '{@link #getFormatFile() <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatFile()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat formatFile;

	/**
	 * The cached value of the '{@link #getBoolVar() <em>Bool Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVar()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterBoolVar> boolVar;

	/**
	 * The cached value of the '{@link #getBoolVarFromArrayItem() <em>Bool Var From Array Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterBoolVarFromArrayItem> boolVarFromArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFromGroupedArrayItem() <em>Bool Var From Grouped Array Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromGroupedArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterBoolVarFromGroupedArrayItem> boolVarFromGroupedArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFDIC() <em>Bool Var FDIC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFDIC()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFilterBoolVarFDIC> boolVarFDIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFilterFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.TMTCIF_FILTER_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getFormatFile() {
		if (formatFile != null && formatFile.eIsProxy()) {
			InternalEObject oldFormatFile = (InternalEObject)formatFile;
			formatFile = (TMTCIFFormatFormat)eResolveProxy(oldFormatFile);
			if (formatFile != oldFormatFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
			}
		}
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetFormatFile() {
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatFile(TMTCIFFormatFormat newFormatFile) {
		TMTCIFFormatFormat oldFormatFile = formatFile;
		formatFile = newFormatFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterBoolVar> getBoolVar() {
		if (boolVar == null) {
			boolVar = new EObjectContainmentEList<TMTCIFFilterBoolVar>(TMTCIFFilterBoolVar.class, this, filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR);
		}
		return boolVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterBoolVarFromArrayItem> getBoolVarFromArrayItem() {
		if (boolVarFromArrayItem == null) {
			boolVarFromArrayItem = new EObjectContainmentEList<TMTCIFFilterBoolVarFromArrayItem>(TMTCIFFilterBoolVarFromArrayItem.class, this, filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
		}
		return boolVarFromArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem() {
		if (boolVarFromGroupedArrayItem == null) {
			boolVarFromGroupedArrayItem = new EObjectContainmentEList<TMTCIFFilterBoolVarFromGroupedArrayItem>(TMTCIFFilterBoolVarFromGroupedArrayItem.class, this, filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		}
		return boolVarFromGroupedArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFilterBoolVarFDIC> getBoolVarFDIC() {
		if (boolVarFDIC == null) {
			boolVarFDIC = new EObjectContainmentEList<TMTCIFFilterBoolVarFDIC>(TMTCIFFilterBoolVarFDIC.class, this, filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC);
		}
		return boolVarFDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR:
				return ((InternalEList<?>)getBoolVar()).basicRemove(otherEnd, msgs);
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromArrayItem()).basicRemove(otherEnd, msgs);
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return ((InternalEList<?>)getBoolVarFromGroupedArrayItem()).basicRemove(otherEnd, msgs);
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC:
				return ((InternalEList<?>)getBoolVarFDIC()).basicRemove(otherEnd, msgs);
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
			case filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE:
				if (resolve) return getFormatFile();
				return basicGetFormatFile();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR:
				return getBoolVar();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return getBoolVarFromArrayItem();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return getBoolVarFromGroupedArrayItem();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC:
				return getBoolVarFDIC();
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
			case filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE:
				setFormatFile((TMTCIFFormatFormat)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR:
				getBoolVar().clear();
				getBoolVar().addAll((Collection<? extends TMTCIFFilterBoolVar>)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				getBoolVarFromArrayItem().addAll((Collection<? extends TMTCIFFilterBoolVarFromArrayItem>)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				getBoolVarFromGroupedArrayItem().addAll((Collection<? extends TMTCIFFilterBoolVarFromGroupedArrayItem>)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				getBoolVarFDIC().addAll((Collection<? extends TMTCIFFilterBoolVarFDIC>)newValue);
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
			case filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE:
				setFormatFile((TMTCIFFormatFormat)null);
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR:
				getBoolVar().clear();
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				return;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
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
			case filterPackage.TMTCIF_FILTER_FILTER__FORMAT_FILE:
				return formatFile != null;
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR:
				return boolVar != null && !boolVar.isEmpty();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return boolVarFromArrayItem != null && !boolVarFromArrayItem.isEmpty();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return boolVarFromGroupedArrayItem != null && !boolVarFromGroupedArrayItem.isEmpty();
			case filterPackage.TMTCIF_FILTER_FILTER__BOOL_VAR_FDIC:
				return boolVarFDIC != null && !boolVarFDIC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFFilterFilterImpl
