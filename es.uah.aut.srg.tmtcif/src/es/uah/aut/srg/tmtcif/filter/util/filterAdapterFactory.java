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
package es.uah.aut.srg.tmtcif.filter.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;

import es.uah.aut.srg.tmtcif.filter.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage
 * @generated
 */
public class filterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static filterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = filterPackage.eINSTANCE;
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
	protected filterSwitch<Adapter> modelSwitch =
		new filterSwitch<Adapter>() {
			@Override
			public Adapter caseTMTCIFFilterFilter(TMTCIFFilterFilter object) {
				return createTMTCIFFilterFilterAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterMaxtermFilter(TMTCIFFilterMaxtermFilter object) {
				return createTMTCIFFilterMaxtermFilterAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterMintermFilter(TMTCIFFilterMintermFilter object) {
				return createTMTCIFFilterMintermFilterAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterBoolVar(TMTCIFFilterBoolVar object) {
				return createTMTCIFFilterBoolVarAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterFieldOp(TMTCIFFilterFieldOp object) {
				return createTMTCIFFilterFieldOpAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterConstant(TMTCIFFilterConstant object) {
				return createTMTCIFFilterConstantAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterSelect(TMTCIFFilterSelect object) {
				return createTMTCIFFilterSelectAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterSelectLine(TMTCIFFilterSelectLine object) {
				return createTMTCIFFilterSelectLineAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterBoolVarFromArrayItem(TMTCIFFilterBoolVarFromArrayItem object) {
				return createTMTCIFFilterBoolVarFromArrayItemAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterBoolVarFromGroupedArrayItem(TMTCIFFilterBoolVarFromGroupedArrayItem object) {
				return createTMTCIFFilterBoolVarFromGroupedArrayItemAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterBoolVarFDIC(TMTCIFFilterBoolVarFDIC object) {
				return createTMTCIFFilterBoolVarFDICAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterMaxterm(TMTCIFFilterMaxterm object) {
				return createTMTCIFFilterMaxtermAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterMinterm(TMTCIFFilterMinterm object) {
				return createTMTCIFFilterMintermAdapter();
			}
			@Override
			public Adapter caseTMTCIFFilterBoolVarRef(TMTCIFFilterBoolVarRef object) {
				return createTMTCIFFilterBoolVarRefAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter <em>TMTCIF Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter
	 * @generated
	 */
	public Adapter createTMTCIFFilterFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter <em>TMTCIF Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter
	 * @generated
	 */
	public Adapter createTMTCIFFilterMaxtermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter <em>TMTCIF Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter
	 * @generated
	 */
	public Adapter createTMTCIFFilterMintermFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar <em>TMTCIF Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar
	 * @generated
	 */
	public Adapter createTMTCIFFilterBoolVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp <em>TMTCIF Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp
	 * @generated
	 */
	public Adapter createTMTCIFFilterFieldOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant <em>TMTCIF Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant
	 * @generated
	 */
	public Adapter createTMTCIFFilterConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect <em>TMTCIF Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect
	 * @generated
	 */
	public Adapter createTMTCIFFilterSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine <em>TMTCIF Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine
	 * @generated
	 */
	public Adapter createTMTCIFFilterSelectLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem <em>TMTCIF Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem
	 * @generated
	 */
	public Adapter createTMTCIFFilterBoolVarFromArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem <em>TMTCIF Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	public Adapter createTMTCIFFilterBoolVarFromGroupedArrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC <em>TMTCIF Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC
	 * @generated
	 */
	public Adapter createTMTCIFFilterBoolVarFDICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm <em>TMTCIF Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm
	 * @generated
	 */
	public Adapter createTMTCIFFilterMaxtermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm <em>TMTCIF Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm
	 * @generated
	 */
	public Adapter createTMTCIFFilterMintermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef <em>TMTCIF Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef
	 * @generated
	 */
	public Adapter createTMTCIFFilterBoolVarRefAdapter() {
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

} //filterAdapterFactory
