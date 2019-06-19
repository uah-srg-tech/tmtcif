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

import es.uah.aut.srg.tmtcif.common.impl.TMTCIFModelElementImpl;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormatType;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField;
import es.uah.aut.srg.tmtcif.format.formatPackage;

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
 * An implementation of the model object '<em><b>TMTCIF Format Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.format.impl.TMTCIFFormatFormatImpl#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFormatFormatImpl extends TMTCIFModelElementImpl implements TMTCIFFormatFormat {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFormatFormatType TYPE_EDEFAULT = TMTCIFFormatFormatType.TM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormatType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getCSField() <em>CS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatCSField> csField;

	/**
	 * The cached value of the '{@link #getCSFormulaField() <em>CS Formula Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSFormulaField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatCSFormulaField> csFormulaField;

	/**
	 * The cached value of the '{@link #getVSField() <em>VS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatVSField> vsField;

	/**
	 * The cached value of the '{@link #getFDICField() <em>FDIC Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFDICField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatFDICField> fdicField;

	/**
	 * The cached value of the '{@link #getVRFieldSize() <em>VR Field Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRFieldSize()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatVRFieldSize> vrFieldSize;

	/**
	 * The cached value of the '{@link #getAField() <em>AField</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatAField> aField;

	/**
	 * The cached value of the '{@link #getAIField() <em>AI Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIField()
	 * @generated
	 * @ordered
	 */
	protected EList<TMTCIFFormatAIField> aiField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFormatFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.TMTCIF_FORMAT_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FORMAT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormatType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TMTCIFFormatFormatType newType) {
		TMTCIFFormatFormatType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.TMTCIF_FORMAT_FORMAT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TMTCIFFormatFormatType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.TMTCIF_FORMAT_FORMAT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public EList<TMTCIFFormatCSField> getCSField() {
		if (csField == null) {
			csField = new EObjectContainmentEList<TMTCIFFormatCSField>(TMTCIFFormatCSField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD);
		}
		return csField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatCSFormulaField> getCSFormulaField() {
		if (csFormulaField == null) {
			csFormulaField = new EObjectContainmentEList<TMTCIFFormatCSFormulaField>(TMTCIFFormatCSFormulaField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD);
		}
		return csFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatVSField> getVSField() {
		if (vsField == null) {
			vsField = new EObjectContainmentEList<TMTCIFFormatVSField>(TMTCIFFormatVSField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD);
		}
		return vsField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatFDICField> getFDICField() {
		if (fdicField == null) {
			fdicField = new EObjectContainmentEList<TMTCIFFormatFDICField>(TMTCIFFormatFDICField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD);
		}
		return fdicField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatVRFieldSize> getVRFieldSize() {
		if (vrFieldSize == null) {
			vrFieldSize = new EObjectContainmentEList<TMTCIFFormatVRFieldSize>(TMTCIFFormatVRFieldSize.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE);
		}
		return vrFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatAField> getAField() {
		if (aField == null) {
			aField = new EObjectContainmentEList<TMTCIFFormatAField>(TMTCIFFormatAField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD);
		}
		return aField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFFormatAIField> getAIField() {
		if (aiField == null) {
			aiField = new EObjectContainmentEList<TMTCIFFormatAIField>(TMTCIFFormatAIField.class, this, formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD);
		}
		return aiField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD:
				return ((InternalEList<?>)getCSField()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return ((InternalEList<?>)getCSFormulaField()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD:
				return ((InternalEList<?>)getVSField()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD:
				return ((InternalEList<?>)getFDICField()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE:
				return ((InternalEList<?>)getVRFieldSize()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD:
				return ((InternalEList<?>)getAField()).basicRemove(otherEnd, msgs);
			case formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD:
				return ((InternalEList<?>)getAIField()).basicRemove(otherEnd, msgs);
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
			case formatPackage.TMTCIF_FORMAT_FORMAT__PROTOCOL:
				return getProtocol();
			case formatPackage.TMTCIF_FORMAT_FORMAT__TYPE:
				return getType();
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD:
				return getCSField();
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return getCSFormulaField();
			case formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD:
				return getVSField();
			case formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD:
				return getFDICField();
			case formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE:
				return getVRFieldSize();
			case formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD:
				return getAField();
			case formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD:
				return getAIField();
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
			case formatPackage.TMTCIF_FORMAT_FORMAT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__TYPE:
				setType((TMTCIFFormatFormatType)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD:
				getCSField().clear();
				getCSField().addAll((Collection<? extends TMTCIFFormatCSField>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				getCSFormulaField().addAll((Collection<? extends TMTCIFFormatCSFormulaField>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD:
				getVSField().clear();
				getVSField().addAll((Collection<? extends TMTCIFFormatVSField>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				getFDICField().addAll((Collection<? extends TMTCIFFormatFDICField>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				getVRFieldSize().addAll((Collection<? extends TMTCIFFormatVRFieldSize>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD:
				getAField().clear();
				getAField().addAll((Collection<? extends TMTCIFFormatAField>)newValue);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD:
				getAIField().clear();
				getAIField().addAll((Collection<? extends TMTCIFFormatAIField>)newValue);
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
			case formatPackage.TMTCIF_FORMAT_FORMAT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__TYPE:
				unsetType();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD:
				getCSField().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD:
				getVSField().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD:
				getAField().clear();
				return;
			case formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD:
				getAIField().clear();
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
			case formatPackage.TMTCIF_FORMAT_FORMAT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case formatPackage.TMTCIF_FORMAT_FORMAT__TYPE:
				return isSetType();
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FIELD:
				return csField != null && !csField.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return csFormulaField != null && !csFormulaField.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__VS_FIELD:
				return vsField != null && !vsField.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__FDIC_FIELD:
				return fdicField != null && !fdicField.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__VR_FIELD_SIZE:
				return vrFieldSize != null && !vrFieldSize.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__AFIELD:
				return aField != null && !aField.isEmpty();
			case formatPackage.TMTCIF_FORMAT_FORMAT__AI_FIELD:
				return aiField != null && !aiField.isEmpty();
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TMTCIFFormatFormatImpl
