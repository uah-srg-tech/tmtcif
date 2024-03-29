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
package es.uah.aut.srg.tmtcif.scenario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.scenario.scenarioFactory
 * @model kind="package"
 * @generated
 */
public interface scenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/scenario";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmtcif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scenarioPackage eINSTANCE = es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl <em>TMTCIF Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenario()
	 * @generated
	 */
	int TMTCIF_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scenario Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO__SCENARIO_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>Scenario Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO__SCENARIO_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Scenario Packet Configs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS = 3;

	/**
	 * The number of structural features of the '<em>TMTCIF Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TMTCIF Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioInterfaceImpl <em>TMTCIF Scenario Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioInterfaceImpl
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioInterface()
	 * @generated
	 */
	int TMTCIF_SCENARIO_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_INTERFACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Scenario Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Scenario Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_INTERFACE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioVariableImpl <em>TMTCIF Scenario Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioVariableImpl
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioVariable()
	 * @generated
	 */
	int TMTCIF_SCENARIO_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Scenario Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Scenario Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioPacketConfigImpl <em>TMTCIF Scenario Packet Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioPacketConfigImpl
	 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioPacketConfig()
	 * @generated
	 */
	int TMTCIF_SCENARIO_PACKET_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_PACKET_CONFIG__NAME = 0;

	/**
	 * The number of structural features of the '<em>TMTCIF Scenario Packet Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TMTCIF Scenario Packet Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_SCENARIO_PACKET_CONFIG_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario <em>TMTCIF Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Scenario</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario
	 * @generated
	 */
	EClass getTMTCIFScenario();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getName()
	 * @see #getTMTCIFScenario()
	 * @generated
	 */
	EAttribute getTMTCIFScenario_Name();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioInterfaces <em>Scenario Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario Interfaces</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioInterfaces()
	 * @see #getTMTCIFScenario()
	 * @generated
	 */
	EReference getTMTCIFScenario_ScenarioInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioVariables <em>Scenario Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario Variables</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioVariables()
	 * @see #getTMTCIFScenario()
	 * @generated
	 */
	EReference getTMTCIFScenario_ScenarioVariables();

	/**
	 * Returns the meta object for the reference list '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioPacketConfigs <em>Scenario Packet Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenario Packet Configs</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario#getScenarioPacketConfigs()
	 * @see #getTMTCIFScenario()
	 * @generated
	 */
	EReference getTMTCIFScenario_ScenarioPacketConfigs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface <em>TMTCIF Scenario Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Scenario Interface</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface
	 * @generated
	 */
	EClass getTMTCIFScenarioInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface#getName()
	 * @see #getTMTCIFScenarioInterface()
	 * @generated
	 */
	EAttribute getTMTCIFScenarioInterface_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable <em>TMTCIF Scenario Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Scenario Variable</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable
	 * @generated
	 */
	EClass getTMTCIFScenarioVariable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable#getName()
	 * @see #getTMTCIFScenarioVariable()
	 * @generated
	 */
	EAttribute getTMTCIFScenarioVariable_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig <em>TMTCIF Scenario Packet Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Scenario Packet Config</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig
	 * @generated
	 */
	EClass getTMTCIFScenarioPacketConfig();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig#getName()
	 * @see #getTMTCIFScenarioPacketConfig()
	 * @generated
	 */
	EAttribute getTMTCIFScenarioPacketConfig_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	scenarioFactory getscenarioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl <em>TMTCIF Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenario()
		 * @generated
		 */
		EClass TMTCIF_SCENARIO = eINSTANCE.getTMTCIFScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_SCENARIO__NAME = eINSTANCE.getTMTCIFScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Scenario Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_SCENARIO__SCENARIO_INTERFACES = eINSTANCE.getTMTCIFScenario_ScenarioInterfaces();

		/**
		 * The meta object literal for the '<em><b>Scenario Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_SCENARIO__SCENARIO_VARIABLES = eINSTANCE.getTMTCIFScenario_ScenarioVariables();

		/**
		 * The meta object literal for the '<em><b>Scenario Packet Configs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS = eINSTANCE.getTMTCIFScenario_ScenarioPacketConfigs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioInterfaceImpl <em>TMTCIF Scenario Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioInterfaceImpl
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioInterface()
		 * @generated
		 */
		EClass TMTCIF_SCENARIO_INTERFACE = eINSTANCE.getTMTCIFScenarioInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_SCENARIO_INTERFACE__NAME = eINSTANCE.getTMTCIFScenarioInterface_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioVariableImpl <em>TMTCIF Scenario Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioVariableImpl
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioVariable()
		 * @generated
		 */
		EClass TMTCIF_SCENARIO_VARIABLE = eINSTANCE.getTMTCIFScenarioVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_SCENARIO_VARIABLE__NAME = eINSTANCE.getTMTCIFScenarioVariable_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioPacketConfigImpl <em>TMTCIF Scenario Packet Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioPacketConfigImpl
		 * @see es.uah.aut.srg.tmtcif.scenario.impl.scenarioPackageImpl#getTMTCIFScenarioPacketConfig()
		 * @generated
		 */
		EClass TMTCIF_SCENARIO_PACKET_CONFIG = eINSTANCE.getTMTCIFScenarioPacketConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_SCENARIO_PACKET_CONFIG__NAME = eINSTANCE.getTMTCIFScenarioPacketConfig_Name();

	}

} //scenarioPackage
