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
package es.uah.aut.srg.tmtcif.export.impl;

import es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes;
import es.uah.aut.srg.tmtcif.export.exportPackage;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Export Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportExportImpl#getActivateDICs <em>Activate DI Cs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFExportExportImpl extends TMTCIFModelElementImpl implements TMTCIFExportExport {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat to;

	/**
	 * The cached value of the '{@link #getSizes() <em>Sizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizes()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportSizes sizes;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportSettings settings;

	/**
	 * The cached value of the '{@link #getActivateDICs() <em>Activate DI Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateDICs()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportActivateDICs activateDICs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFExportExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.TMTCIF_EXPORT_EXPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TMTCIFFormatFormat)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, exportPackage.TMTCIF_EXPORT_EXPORT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TMTCIFFormatFormat newFrom) {
		TMTCIFFormatFormat oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (TMTCIFFormatFormat)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, exportPackage.TMTCIF_EXPORT_EXPORT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(TMTCIFFormatFormat newTo) {
		TMTCIFFormatFormat oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSizes getSizes() {
		return sizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizes(TMTCIFExportSizes newSizes, NotificationChain msgs) {
		TMTCIFExportSizes oldSizes = sizes;
		sizes = newSizes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__SIZES, oldSizes, newSizes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizes(TMTCIFExportSizes newSizes) {
		if (newSizes != sizes) {
			NotificationChain msgs = null;
			if (sizes != null)
				msgs = ((InternalEObject)sizes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__SIZES, null, msgs);
			if (newSizes != null)
				msgs = ((InternalEObject)newSizes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__SIZES, null, msgs);
			msgs = basicSetSizes(newSizes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__SIZES, newSizes, newSizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportSettings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(TMTCIFExportSettings newSettings, NotificationChain msgs) {
		TMTCIFExportSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(TMTCIFExportSettings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportActivateDICs getActivateDICs() {
		return activateDICs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivateDICs(TMTCIFExportActivateDICs newActivateDICs, NotificationChain msgs) {
		TMTCIFExportActivateDICs oldActivateDICs = activateDICs;
		activateDICs = newActivateDICs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS, oldActivateDICs, newActivateDICs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateDICs(TMTCIFExportActivateDICs newActivateDICs) {
		if (newActivateDICs != activateDICs) {
			NotificationChain msgs = null;
			if (activateDICs != null)
				msgs = ((InternalEObject)activateDICs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS, null, msgs);
			if (newActivateDICs != null)
				msgs = ((InternalEObject)newActivateDICs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS, null, msgs);
			msgs = basicSetActivateDICs(newActivateDICs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS, newActivateDICs, newActivateDICs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_EXPORT__SIZES:
				return basicSetSizes(null, msgs);
			case exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS:
				return basicSetSettings(null, msgs);
			case exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return basicSetActivateDICs(null, msgs);
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
			case exportPackage.TMTCIF_EXPORT_EXPORT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case exportPackage.TMTCIF_EXPORT_EXPORT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case exportPackage.TMTCIF_EXPORT_EXPORT__SIZES:
				return getSizes();
			case exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS:
				return getSettings();
			case exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return getActivateDICs();
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
			case exportPackage.TMTCIF_EXPORT_EXPORT__FROM:
				setFrom((TMTCIFFormatFormat)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__TO:
				setTo((TMTCIFFormatFormat)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SIZES:
				setSizes((TMTCIFExportSizes)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS:
				setSettings((TMTCIFExportSettings)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS:
				setActivateDICs((TMTCIFExportActivateDICs)newValue);
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
			case exportPackage.TMTCIF_EXPORT_EXPORT__FROM:
				setFrom((TMTCIFFormatFormat)null);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__TO:
				setTo((TMTCIFFormatFormat)null);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SIZES:
				setSizes((TMTCIFExportSizes)null);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS:
				setSettings((TMTCIFExportSettings)null);
				return;
			case exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS:
				setActivateDICs((TMTCIFExportActivateDICs)null);
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
			case exportPackage.TMTCIF_EXPORT_EXPORT__FROM:
				return from != null;
			case exportPackage.TMTCIF_EXPORT_EXPORT__TO:
				return to != null;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SIZES:
				return sizes != null;
			case exportPackage.TMTCIF_EXPORT_EXPORT__SETTINGS:
				return settings != null;
			case exportPackage.TMTCIF_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return activateDICs != null;
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFExportExportImpl
