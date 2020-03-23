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
package es.uah.aut.srg.tmtcif.fieldvalue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage
 * @generated
 */
public interface fieldvalueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	fieldvalueFactory eINSTANCE = es.uah.aut.srg.tmtcif.fieldvalue.impl.fieldvalueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TMTCIF Field Value Raw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Field Value Raw</em>'.
	 * @generated
	 */
	TMTCIFFieldValueRaw createTMTCIFFieldValueRaw();

	/**
	 * Returns a new object of class '<em>TMTCIF Field Value File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Field Value File</em>'.
	 * @generated
	 */
	TMTCIFFieldValueFile createTMTCIFFieldValueFile();

	/**
	 * Returns a new object of class '<em>TMTCIF Field Value Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMTCIF Field Value Enum</em>'.
	 * @generated
	 */
	TMTCIFFieldValueEnum createTMTCIFFieldValueEnum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	fieldvaluePackage getfieldvaluePackage();

} //fieldvalueFactory
