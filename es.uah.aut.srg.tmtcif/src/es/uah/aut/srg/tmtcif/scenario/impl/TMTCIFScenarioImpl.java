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
package es.uah.aut.srg.tmtcif.scenario.impl;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;
import es.uah.aut.srg.tmtcif.scenario.scenarioPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl#getScenarioInterfaces <em>Scenario Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl#getScenarioVariables <em>Scenario Variables</em>}</li>
 *   <li>{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl#getScenarioPacketConfigs <em>Scenario Packet Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TMTCIFScenarioImpl extends MinimalEObjectImpl.Container implements TMTCIFScenario {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.TMTCIF_SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.TMTCIF_SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFScenarioInterface> getScenarioInterfaces() {
		// TODO: implement this method to return the 'Scenario Interfaces' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFScenarioVariable> getScenarioVariables() {
		// TODO: implement this method to return the 'Scenario Variables' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TMTCIFScenarioPacketConfig> getScenarioPacketConfigs() {
		// TODO: implement this method to return the 'Scenario Packet Configs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.TMTCIF_SCENARIO__NAME:
				return getName();
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_INTERFACES:
				return getScenarioInterfaces();
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_VARIABLES:
				return getScenarioVariables();
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS:
				return getScenarioPacketConfigs();
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
			case scenarioPackage.TMTCIF_SCENARIO__NAME:
				setName((String)newValue);
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_INTERFACES:
				getScenarioInterfaces().clear();
				getScenarioInterfaces().addAll((Collection<? extends TMTCIFScenarioInterface>)newValue);
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_VARIABLES:
				getScenarioVariables().clear();
				getScenarioVariables().addAll((Collection<? extends TMTCIFScenarioVariable>)newValue);
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS:
				getScenarioPacketConfigs().clear();
				getScenarioPacketConfigs().addAll((Collection<? extends TMTCIFScenarioPacketConfig>)newValue);
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
			case scenarioPackage.TMTCIF_SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_INTERFACES:
				getScenarioInterfaces().clear();
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_VARIABLES:
				getScenarioVariables().clear();
				return;
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS:
				getScenarioPacketConfigs().clear();
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
			case scenarioPackage.TMTCIF_SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_INTERFACES:
				return !getScenarioInterfaces().isEmpty();
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_VARIABLES:
				return !getScenarioVariables().isEmpty();
			case scenarioPackage.TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS:
				return !getScenarioPacketConfigs().isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TMTCIFScenarioImpl
