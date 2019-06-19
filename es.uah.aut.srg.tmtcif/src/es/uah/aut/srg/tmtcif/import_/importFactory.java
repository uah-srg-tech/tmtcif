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
package es.uah.aut.srg.tmtcif.import_;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.import_.importPackage
 * @generated
 */
public interface importFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	importFactory eINSTANCE = es.uah.aut.srg.tmtcif.import_.impl.importFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TMTCIF Import Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Import Import</em>'.
	 * @generated
	 */
	TMTCIFImportImport createTMTCIFImportImport();

	/**
	 * Returns a new object of class '<em>TMTCIF Import Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Import Data Source</em>'.
	 * @generated
	 */
	TMTCIFImportDataSource createTMTCIFImportDataSource();

	/**
	 * Returns a new object of class '<em>TMTCIF Import Virtual Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Import Virtual Size</em>'.
	 * @generated
	 */
	TMTCIFImportVirtualSize createTMTCIFImportVirtualSize();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	importPackage getimportPackage();

} //importFactory
