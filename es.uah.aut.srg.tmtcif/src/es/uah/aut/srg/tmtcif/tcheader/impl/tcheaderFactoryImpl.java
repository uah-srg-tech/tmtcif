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
package es.uah.aut.srg.tmtcif.tcheader.impl;

import es.uah.aut.srg.tmtcif.tcheader.*;

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
public class tcheaderFactoryImpl extends EFactoryImpl implements tcheaderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static tcheaderFactory init() {
		try {
			tcheaderFactory thetcheaderFactory = (tcheaderFactory)EPackage.Registry.INSTANCE.getEFactory(tcheaderPackage.eNS_URI);
			if (thetcheaderFactory != null) {
				return thetcheaderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new tcheaderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderFactoryImpl() {
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
			case tcheaderPackage.TMTCIFTC_HEADER: return createTMTCIFTCHeader();
			case tcheaderPackage.TMTCIFTC_HEADER_FIELD: return createTMTCIFTCHeaderField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTCHeader createTMTCIFTCHeader() {
		TMTCIFTCHeaderImpl tmtciftcHeader = new TMTCIFTCHeaderImpl();
		return tmtciftcHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFTCHeaderField createTMTCIFTCHeaderField() {
		TMTCIFTCHeaderFieldImpl tmtciftcHeaderField = new TMTCIFTCHeaderFieldImpl();
		return tmtciftcHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderPackage gettcheaderPackage() {
		return (tcheaderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static tcheaderPackage getPackage() {
		return tcheaderPackage.eINSTANCE;
	}

} //tcheaderFactoryImpl
