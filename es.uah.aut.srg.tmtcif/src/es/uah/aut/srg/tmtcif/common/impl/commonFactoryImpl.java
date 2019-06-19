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
package es.uah.aut.srg.tmtcif.common.impl;

import es.uah.aut.srg.tmtcif.common.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class commonFactoryImpl extends EFactoryImpl implements commonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static commonFactory init() {
		try {
			commonFactory thecommonFactory = (commonFactory)EPackage.Registry.INSTANCE.getEFactory(commonPackage.eNS_URI);
			if (thecommonFactory != null) {
				return thecommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new commonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public commonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case commonPackage.TMTCIF_MODEL_FILE: return createTMTCIFModelFile();
			case commonPackage.TMTCIF_MODEL_FILE_IMPORT: return createTMTCIFModelFileImport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFModelFile createTMTCIFModelFile() {
		TMTCIFModelFileImpl tmtcifModelFile = new TMTCIFModelFileImpl();
		return tmtcifModelFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFModelFileImport createTMTCIFModelFileImport() {
		TMTCIFModelFileImportImpl tmtcifModelFileImport = new TMTCIFModelFileImportImpl();
		return tmtcifModelFileImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public commonPackage getcommonPackage() {
		return (commonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static commonPackage getPackage() {
		return commonPackage.eINSTANCE;
	}

} //commonFactoryImpl
