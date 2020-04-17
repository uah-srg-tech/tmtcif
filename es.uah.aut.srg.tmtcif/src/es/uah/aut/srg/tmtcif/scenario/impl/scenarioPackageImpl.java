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
import es.uah.aut.srg.tmtcif.scenario.scenarioFactory;
import es.uah.aut.srg.tmtcif.scenario.scenarioPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scenarioPackageImpl extends EPackageImpl implements scenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifScenarioInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifScenarioVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifScenarioPacketConfigEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.tmtcif.scenario.scenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private scenarioPackageImpl() {
		super(eNS_URI, scenarioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link scenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static scenarioPackage init() {
		if (isInited) return (scenarioPackage)EPackage.Registry.INSTANCE.getEPackage(scenarioPackage.eNS_URI);

		// Obtain or create and register package
		scenarioPackageImpl thescenarioPackage = (scenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof scenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new scenarioPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thescenarioPackage.createPackageContents();

		// Initialize created meta-data
		thescenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thescenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(scenarioPackage.eNS_URI, thescenarioPackage);
		return thescenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFScenario() {
		return tmtcifScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFScenario_Name() {
		return (EAttribute)tmtcifScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFScenario_ScenarioInterfaces() {
		return (EReference)tmtcifScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFScenario_ScenarioVariables() {
		return (EReference)tmtcifScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFScenario_ScenarioPacketConfigs() {
		return (EReference)tmtcifScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFScenarioInterface() {
		return tmtcifScenarioInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFScenarioInterface_Name() {
		return (EAttribute)tmtcifScenarioInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFScenarioVariable() {
		return tmtcifScenarioVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFScenarioVariable_Name() {
		return (EAttribute)tmtcifScenarioVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFScenarioPacketConfig() {
		return tmtcifScenarioPacketConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFScenarioPacketConfig_Name() {
		return (EAttribute)tmtcifScenarioPacketConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioFactory getscenarioFactory() {
		return (scenarioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tmtcifScenarioEClass = createEClass(TMTCIF_SCENARIO);
		createEAttribute(tmtcifScenarioEClass, TMTCIF_SCENARIO__NAME);
		createEReference(tmtcifScenarioEClass, TMTCIF_SCENARIO__SCENARIO_INTERFACES);
		createEReference(tmtcifScenarioEClass, TMTCIF_SCENARIO__SCENARIO_VARIABLES);
		createEReference(tmtcifScenarioEClass, TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS);

		tmtcifScenarioInterfaceEClass = createEClass(TMTCIF_SCENARIO_INTERFACE);
		createEAttribute(tmtcifScenarioInterfaceEClass, TMTCIF_SCENARIO_INTERFACE__NAME);

		tmtcifScenarioVariableEClass = createEClass(TMTCIF_SCENARIO_VARIABLE);
		createEAttribute(tmtcifScenarioVariableEClass, TMTCIF_SCENARIO_VARIABLE__NAME);

		tmtcifScenarioPacketConfigEClass = createEClass(TMTCIF_SCENARIO_PACKET_CONFIG);
		createEAttribute(tmtcifScenarioPacketConfigEClass, TMTCIF_SCENARIO_PACKET_CONFIG__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifScenarioEClass, TMTCIFScenario.class, "TMTCIFScenario", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFScenario_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFScenario_ScenarioInterfaces(), this.getTMTCIFScenarioInterface(), null, "scenarioInterfaces", null, 1, -1, TMTCIFScenario.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFScenario_ScenarioVariables(), this.getTMTCIFScenarioVariable(), null, "scenarioVariables", null, 0, -1, TMTCIFScenario.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFScenario_ScenarioPacketConfigs(), this.getTMTCIFScenarioPacketConfig(), null, "scenarioPacketConfigs", null, 0, -1, TMTCIFScenario.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifScenarioInterfaceEClass, TMTCIFScenarioInterface.class, "TMTCIFScenarioInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFScenarioInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifScenarioVariableEClass, TMTCIFScenarioVariable.class, "TMTCIFScenarioVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFScenarioVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFScenarioVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifScenarioPacketConfigEClass, TMTCIFScenarioPacketConfig.class, "TMTCIFScenarioPacketConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFScenarioPacketConfig_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFScenarioPacketConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //scenarioPackageImpl
