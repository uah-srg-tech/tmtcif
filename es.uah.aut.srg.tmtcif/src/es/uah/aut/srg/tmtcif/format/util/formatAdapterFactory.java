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
package es.uah.aut.srg.tmtcif.format.util;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;

import es.uah.aut.srg.tmtcif.format.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.format.formatPackage
 * @generated
 */
public class formatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = formatPackage.eINSTANCE;
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
	protected formatSwitch<Adapter> modelSwitch =
		new formatSwitch<Adapter>() {
			@Override
			public Adapter caseTMTCIFFormatFormat(TMTCIFFormatFormat object) {
				return createTMTCIFFormatFormatAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatField(TMTCIFFormatField object) {
				return createTMTCIFFormatFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatCSField(TMTCIFFormatCSField object) {
				return createTMTCIFFormatCSFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatCSFormulaField(TMTCIFFormatCSFormulaField object) {
				return createTMTCIFFormatCSFormulaFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatVSField(TMTCIFFormatVSField object) {
				return createTMTCIFFormatVSFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatVRFieldSize(TMTCIFFormatVRFieldSize object) {
				return createTMTCIFFormatVRFieldSizeAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatFDICField(TMTCIFFormatFDICField object) {
				return createTMTCIFFormatFDICFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatAField(TMTCIFFormatAField object) {
				return createTMTCIFFormatAFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatAIField(TMTCIFFormatAIField object) {
				return createTMTCIFFormatAIFieldAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatBytesBits(TMTCIFFormatBytesBits object) {
				return createTMTCIFFormatBytesBitsAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatFormula(TMTCIFFormatFormula object) {
				return createTMTCIFFormatFormulaAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatVariableSize(TMTCIFFormatVariableSize object) {
				return createTMTCIFFormatVariableSizeAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatFloatingOffset(TMTCIFFormatFloatingOffset object) {
				return createTMTCIFFormatFloatingOffsetAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatSortedFieldsToCheck(TMTCIFFormatSortedFieldsToCheck object) {
				return createTMTCIFFormatSortedFieldsToCheckAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatFieldToCheck(TMTCIFFormatFieldToCheck object) {
				return createTMTCIFFormatFieldToCheckAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatArrayDimension(TMTCIFFormatArrayDimension object) {
				return createTMTCIFFormatArrayDimensionAdapter();
			}
			@Override
			public Adapter caseTMTCIFFormatArrayRef(TMTCIFFormatArrayRef object) {
				return createTMTCIFFormatArrayRefAdapter();
			}
			@Override
			public Adapter caseTMTCIFModelElement(TMTCIFModelElement object) {
				return createTMTCIFModelElementAdapter();
			}
			@Override
			public Adapter caseTMTCIFModelObject(TMTCIFModelObject object) {
				return createTMTCIFModelObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat <em>TMTCIF Format Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat
	 * @generated
	 */
	public Adapter createTMTCIFFormatFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatField <em>TMTCIF Format Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatField
	 * @generated
	 */
	public Adapter createTMTCIFFormatFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField <em>TMTCIF Format CS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField
	 * @generated
	 */
	public Adapter createTMTCIFFormatCSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField <em>TMTCIF Format CS Formula Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField
	 * @generated
	 */
	public Adapter createTMTCIFFormatCSFormulaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField <em>TMTCIF Format VS Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField
	 * @generated
	 */
	public Adapter createTMTCIFFormatVSFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize <em>TMTCIF Format VR Field Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize
	 * @generated
	 */
	public Adapter createTMTCIFFormatVRFieldSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField <em>TMTCIF Format FDIC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField
	 * @generated
	 */
	public Adapter createTMTCIFFormatFDICFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField <em>TMTCIF Format AField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField
	 * @generated
	 */
	public Adapter createTMTCIFFormatAFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField <em>TMTCIF Format AI Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField
	 * @generated
	 */
	public Adapter createTMTCIFFormatAIFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits <em>TMTCIF Format Bytes Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits
	 * @generated
	 */
	public Adapter createTMTCIFFormatBytesBitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula <em>TMTCIF Format Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula
	 * @generated
	 */
	public Adapter createTMTCIFFormatFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize <em>TMTCIF Format Variable Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize
	 * @generated
	 */
	public Adapter createTMTCIFFormatVariableSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset <em>TMTCIF Format Floating Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset
	 * @generated
	 */
	public Adapter createTMTCIFFormatFloatingOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck <em>TMTCIF Format Sorted Fields To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck
	 * @generated
	 */
	public Adapter createTMTCIFFormatSortedFieldsToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck <em>TMTCIF Format Field To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck
	 * @generated
	 */
	public Adapter createTMTCIFFormatFieldToCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension <em>TMTCIF Format Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension
	 * @generated
	 */
	public Adapter createTMTCIFFormatArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef <em>TMTCIF Format Array Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef
	 * @generated
	 */
	public Adapter createTMTCIFFormatArrayRefAdapter() {
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
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.tmtcif.common.TMTCIFModelObject <em>TMTCIF Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.tmtcif.common.TMTCIFModelObject
	 * @generated
	 */
	public Adapter createTMTCIFModelObjectAdapter() {
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

} //formatAdapterFactory
