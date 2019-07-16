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
package es.uah.aut.srg.tmtcif.export.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.export.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.export.exportPackage
 * @generated
 */
public class exportAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static exportPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = exportPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected exportSwitch<Adapter> modelSwitch =
		new exportSwitch<Adapter>() {
			@Override
			public Adapter caseTMTCIFExportExport(TMTCIFExportExport object) {
				return createTMTCIFExportExportAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSizes(TMTCIFExportSizes object) {
				return createTMTCIFExportSizesAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSize(TMTCIFExportSize object) {
				return createTMTCIFExportSizeAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSizeFromFileLength(TMTCIFExportSizeFromFileLength object) {
				return createTMTCIFExportSizeFromFileLengthAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSizeFromFileLine(TMTCIFExportSizeFromFileLine object) {
				return createTMTCIFExportSizeFromFileLineAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSizeInBits(TMTCIFExportSizeInBits object) {
				return createTMTCIFExportSizeInBitsAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettings(TMTCIFExportSettings object) {
				return createTMTCIFExportSettingsAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSetting(TMTCIFExportSetting object) {
				return createTMTCIFExportSettingAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingFromConst(TMTCIFExportSettingFromConst object) {
				return createTMTCIFExportSettingFromConstAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingFromSize(TMTCIFExportSettingFromSize object) {
				return createTMTCIFExportSettingFromSizeAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingFromFile(TMTCIFExportSettingFromFile object) {
				return createTMTCIFExportSettingFromFileAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingFromField(TMTCIFExportSettingFromField object) {
				return createTMTCIFExportSettingFromFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingAI(TMTCIFExportSettingAI object) {
				return createTMTCIFExportSettingAIAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingAIFromConst(TMTCIFExportSettingAIFromConst object) {
				return createTMTCIFExportSettingAIFromConstAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportSettingAIFromFile(TMTCIFExportSettingAIFromFile object) {
				return createTMTCIFExportSettingAIFromFileAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportActivateDICs(TMTCIFExportActivateDICs object) {
				return createTMTCIFExportActivateDICsAdapter();
			}
			@Override
			public Adapter caseTMTCIFExportDIC(TMTCIFExportDIC object) {
				return createTMTCIFExportDICAdapter();
			}
			@Override
			public Adapter caseTMTCIFModelElement(TMTCIFModelElement object) {
				return createTMTCIFModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportExport <em>TMTCIF Export Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportExport
	 * @generated
	 */
	public Adapter createTMTCIFExportExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes <em>TMTCIF Export Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes
	 * @generated
	 */
	public Adapter createTMTCIFExportSizesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSize <em>TMTCIF Export Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSize
	 * @generated
	 */
	public Adapter createTMTCIFExportSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength <em>TMTCIF Export Size From File Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength
	 * @generated
	 */
	public Adapter createTMTCIFExportSizeFromFileLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine <em>TMTCIF Export Size From File Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine
	 * @generated
	 */
	public Adapter createTMTCIFExportSizeFromFileLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits <em>TMTCIF Export Size In Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits
	 * @generated
	 */
	public Adapter createTMTCIFExportSizeInBitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings <em>TMTCIF Export Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting <em>TMTCIF Export Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSetting
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst <em>TMTCIF Export Setting From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingFromConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize <em>TMTCIF Export Setting From Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingFromSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile <em>TMTCIF Export Setting From File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingFromFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField <em>TMTCIF Export Setting From Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingFromFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAI <em>TMTCIF Export Setting AI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAI
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingAIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst <em>TMTCIF Export Setting AI From Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingAIFromConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile <em>TMTCIF Export Setting AI From File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile
	 * @generated
	 */
	public Adapter createTMTCIFExportSettingAIFromFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs <em>TMTCIF Export Activate DI Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs
	 * @generated
	 */
	public Adapter createTMTCIFExportActivateDICsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC <em>TMTCIF Export DIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC
	 * @generated
	 */
	public Adapter createTMTCIFExportDICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelElement <em>TMTCIF Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelElement
	 * @generated
	 */
	public Adapter createTMTCIFModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //exportAdapterFactory
