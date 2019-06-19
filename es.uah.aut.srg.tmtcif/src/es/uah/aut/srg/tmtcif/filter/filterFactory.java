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
package es.uah.aut.srg.tmtcif.filter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.filter.filterPackage
 * @generated
 */
public interface filterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	filterFactory eINSTANCE = es.uah.aut.srg.tmtcif.filter.impl.filterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Maxterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Maxterm Filter</em>'.
	 * @generated
	 */
	TMTCIFFilterMaxtermFilter createTMTCIFFilterMaxtermFilter();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Minterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Minterm Filter</em>'.
	 * @generated
	 */
	TMTCIFFilterMintermFilter createTMTCIFFilterMintermFilter();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Bool Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Bool Var</em>'.
	 * @generated
	 */
	TMTCIFFilterBoolVar createTMTCIFFilterBoolVar();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Field Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Field Op</em>'.
	 * @generated
	 */
	TMTCIFFilterFieldOp createTMTCIFFilterFieldOp();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Constant</em>'.
	 * @generated
	 */
	TMTCIFFilterConstant createTMTCIFFilterConstant();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Select</em>'.
	 * @generated
	 */
	TMTCIFFilterSelect createTMTCIFFilterSelect();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Select Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Select Line</em>'.
	 * @generated
	 */
	TMTCIFFilterSelectLine createTMTCIFFilterSelectLine();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Bool Var From Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Bool Var From Array Item</em>'.
	 * @generated
	 */
	TMTCIFFilterBoolVarFromArrayItem createTMTCIFFilterBoolVarFromArrayItem();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Bool Var From Grouped Array Item</em>'.
	 * @generated
	 */
	TMTCIFFilterBoolVarFromGroupedArrayItem createTMTCIFFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Bool Var FDIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Bool Var FDIC</em>'.
	 * @generated
	 */
	TMTCIFFilterBoolVarFDIC createTMTCIFFilterBoolVarFDIC();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Maxterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Maxterm</em>'.
	 * @generated
	 */
	TMTCIFFilterMaxterm createTMTCIFFilterMaxterm();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Minterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Minterm</em>'.
	 * @generated
	 */
	TMTCIFFilterMinterm createTMTCIFFilterMinterm();

	/**
	 * Returns a new object of class '<em>TMTCIF Filter Bool Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Filter Bool Var Ref</em>'.
	 * @generated
	 */
	TMTCIFFilterBoolVarRef createTMTCIFFilterBoolVarRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	filterPackage getfilterPackage();

} //filterFactory
