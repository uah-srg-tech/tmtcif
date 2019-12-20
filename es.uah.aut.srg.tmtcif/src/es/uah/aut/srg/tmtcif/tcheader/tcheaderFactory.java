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
package es.uah.aut.srg.tmtcif.tcheader;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage
 * @generated
 */
public interface tcheaderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tcheaderFactory eINSTANCE = es.uah.aut.srg.tmtcif.tcheader.impl.tcheaderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TMTCIFTC Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIFTC Header</em>'.
	 * @generated
	 */
	TMTCIFTCHeader createTMTCIFTCHeader();

	/**
	 * Returns a new object of class '<em>TMTCIFTC Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIFTC Header Field</em>'.
	 * @generated
	 */
	TMTCIFTCHeaderField createTMTCIFTCHeaderField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tcheaderPackage gettcheaderPackage();

} //tcheaderFactory
