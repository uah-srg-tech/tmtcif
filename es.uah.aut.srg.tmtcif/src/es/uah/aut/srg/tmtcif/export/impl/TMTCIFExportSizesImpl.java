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

import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes;
import es.uah.aut.srg.tmtcif.export.exportPackage;

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
 * An implementation of the model object '<em><b>TMTCIF Export Sizes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl#getSizeFromFileLength <em>Size From File Length</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl#getSizeFromFileLine <em>Size From File Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.export.impl.TMTCIFExportSizesImpl#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFExportSizesImpl extends MinimalEObjectImpl.Container implements TMTCIFExportSizes {
	/**
	 * The cached value of the '{@link #getSizeFromFileLength() <em>Size From File Length</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFromFileLength()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFExportSizeFromFileLength> sizeFromFileLength;

	/**
	 * The cached value of the '{@link #getSizeFromFileLine() <em>Size From File Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFromFileLine()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFExportSizeFromFileLine> sizeFromFileLine;

	/**
	 * The cached value of the '{@link #getSizeInBits() <em>Size In Bits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInBits()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFExportSizeInBits> sizeInBits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFExportSizesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.TMTCIF_EXPORT_SIZES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFExportSizeFromFileLength> getSizeFromFileLength() {
		if (sizeFromFileLength == null) {
			sizeFromFileLength = new EObjectContainmentEList<TMTCIFExportSizeFromFileLength>(TMTCIFExportSizeFromFileLength.class, this, exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH);
		}
		return sizeFromFileLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFExportSizeFromFileLine> getSizeFromFileLine() {
		if (sizeFromFileLine == null) {
			sizeFromFileLine = new EObjectContainmentEList<TMTCIFExportSizeFromFileLine>(TMTCIFExportSizeFromFileLine.class, this, exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE);
		}
		return sizeFromFileLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFExportSizeInBits> getSizeInBits() {
		if (sizeInBits == null) {
			sizeInBits = new EObjectContainmentEList<TMTCIFExportSizeInBits>(TMTCIFExportSizeInBits.class, this, exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS);
		}
		return sizeInBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return ((InternalEList<?>)getSizeFromFileLength()).basicRemove(otherEnd, msgs);
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return ((InternalEList<?>)getSizeFromFileLine()).basicRemove(otherEnd, msgs);
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS:
				return ((InternalEList<?>)getSizeInBits()).basicRemove(otherEnd, msgs);
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
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return getSizeFromFileLength();
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return getSizeFromFileLine();
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS:
				return getSizeInBits();
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
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				getSizeFromFileLength().clear();
				getSizeFromFileLength().addAll((Collection<? extends TMTCIFExportSizeFromFileLength>)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				getSizeFromFileLine().clear();
				getSizeFromFileLine().addAll((Collection<? extends TMTCIFExportSizeFromFileLine>)newValue);
				return;
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS:
				getSizeInBits().clear();
				getSizeInBits().addAll((Collection<? extends TMTCIFExportSizeInBits>)newValue);
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
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				getSizeFromFileLength().clear();
				return;
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				getSizeFromFileLine().clear();
				return;
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS:
				getSizeInBits().clear();
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
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH:
				return sizeFromFileLength != null && !sizeFromFileLength.isEmpty();
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_FROM_FILE_LINE:
				return sizeFromFileLine != null && !sizeFromFileLine.isEmpty();
			case exportPackage.TMTCIF_EXPORT_SIZES__SIZE_IN_BITS:
				return sizeInBits != null && !sizeInBits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TMTCIFExportSizesImpl
