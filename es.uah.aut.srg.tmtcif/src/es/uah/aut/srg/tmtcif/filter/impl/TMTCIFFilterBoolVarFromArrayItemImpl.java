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

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstantType;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine;
import es.uah.aut.srg.tmtcif.filter.filterPackage;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.filter.impl.TMTCIFFilterBoolVarFromArrayItemImpl#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMTCIFFilterBoolVarFromArrayItemImpl extends MinimalEObjectImpl.Container implements TMTCIFFilterBoolVarFromArrayItem {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected static final TMTCIFFilterConstantType CONSTANT_TYPE_EDEFAULT = TMTCIFFilterConstantType.DECIMAL;

	/**
	 * The cached value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterConstantType constantType = CONSTANT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAIFieldRef() <em>AI Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIFieldRef()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatAIField aiFieldRef;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterFieldOp op;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterConstant constant;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterSelect select;

	/**
	 * The cached value of the '{@link #getSelectLine() <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectLine()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterSelectLine selectLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFilterBoolVarFromArrayItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterConstantType getConstantType() {
		return constantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantType(TMTCIFFilterConstantType newConstantType) {
		TMTCIFFilterConstantType oldConstantType = constantType;
		constantType = newConstantType == null ? CONSTANT_TYPE_EDEFAULT : newConstantType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE, oldConstantType, constantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatAIField getAIFieldRef() {
		if (aiFieldRef != null && aiFieldRef.eIsProxy()) {
			InternalEObject oldAIFieldRef = (InternalEObject)aiFieldRef;
			aiFieldRef = (TMTCIFFormatAIField)eResolveProxy(oldAIFieldRef);
			if (aiFieldRef != oldAIFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF, oldAIFieldRef, aiFieldRef));
			}
		}
		return aiFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatAIField basicGetAIFieldRef() {
		return aiFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIFieldRef(TMTCIFFormatAIField newAIFieldRef) {
		TMTCIFFormatAIField oldAIFieldRef = aiFieldRef;
		aiFieldRef = newAIFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF, oldAIFieldRef, aiFieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFieldOp getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(TMTCIFFilterFieldOp newOp, NotificationChain msgs) {
		TMTCIFFilterFieldOp oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(TMTCIFFilterFieldOp newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterConstant getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(TMTCIFFilterConstant newConstant, NotificationChain msgs) {
		TMTCIFFilterConstant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, oldConstant, newConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(TMTCIFFilterConstant newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterSelect getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(TMTCIFFilterSelect newSelect, NotificationChain msgs) {
		TMTCIFFilterSelect oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, oldSelect, newSelect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(TMTCIFFilterSelect newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, newSelect, newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterSelectLine getSelectLine() {
		return selectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectLine(TMTCIFFilterSelectLine newSelectLine, NotificationChain msgs) {
		TMTCIFFilterSelectLine oldSelectLine = selectLine;
		selectLine = newSelectLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, oldSelectLine, newSelectLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectLine(TMTCIFFilterSelectLine newSelectLine) {
		if (newSelectLine != selectLine) {
			NotificationChain msgs = null;
			if (selectLine != null)
				msgs = ((InternalEObject)selectLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, null, msgs);
			if (newSelectLine != null)
				msgs = ((InternalEObject)newSelectLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, null, msgs);
			msgs = basicSetSelectLine(newSelectLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, newSelectLine, newSelectLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP:
				return basicSetOp(null, msgs);
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return basicSetConstant(null, msgs);
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return basicSetSelect(null, msgs);
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return basicSetSelectLine(null, msgs);
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
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID:
				return getId();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME:
				return getName();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				return getConstantType();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				if (resolve) return getAIFieldRef();
				return basicGetAIFieldRef();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP:
				return getOp();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return getConstant();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return getSelect();
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return getSelectLine();
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
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID:
				setId((String)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME:
				setName((String)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType((TMTCIFFilterConstantType)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				setAIFieldRef((TMTCIFFormatAIField)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP:
				setOp((TMTCIFFilterFieldOp)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				setConstant((TMTCIFFilterConstant)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				setSelect((TMTCIFFilterSelect)newValue);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				setSelectLine((TMTCIFFilterSelectLine)newValue);
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
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				setAIFieldRef((TMTCIFFormatAIField)null);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP:
				setOp((TMTCIFFilterFieldOp)null);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				setConstant((TMTCIFFilterConstant)null);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				setSelect((TMTCIFFilterSelect)null);
				return;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				setSelectLine((TMTCIFFilterSelectLine)null);
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
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				return aiFieldRef != null;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP:
				return op != null;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return constant != null;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return select != null;
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return selectLine != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(", constantType: ");
		result.append(constantType);
		result.append(')');
		return result.toString();
	}

} //TMTCIFFilterBoolVarFromArrayItemImpl
