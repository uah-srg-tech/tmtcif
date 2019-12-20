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
package es.uah.aut.srg.tmtcif.fieldvalue.impl;

import es.uah.aut.srg.tmtcif.fieldvalue.*;

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
public class fieldvalueFactoryImpl extends EFactoryImpl implements fieldvalueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static fieldvalueFactory init() {
		try {
			fieldvalueFactory thefieldvalueFactory = (fieldvalueFactory)EPackage.Registry.INSTANCE.getEFactory(fieldvaluePackage.eNS_URI);
			if (thefieldvalueFactory != null) {
				return thefieldvalueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new fieldvalueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fieldvalueFactoryImpl() {
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
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_RAW: return createTMTCIFFieldValueRaw();
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_FILE: return createTMTCIFFieldValueFile();
			case fieldvaluePackage.TMTCIF_FIELD_VALUE_ENUM: return createTMTCIFFieldValueEnum();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFieldValueRaw createTMTCIFFieldValueRaw() {
		TMTCIFFieldValueRawImpl tmtcifFieldValueRaw = new TMTCIFFieldValueRawImpl();
		return tmtcifFieldValueRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFieldValueFile createTMTCIFFieldValueFile() {
		TMTCIFFieldValueFileImpl tmtcifFieldValueFile = new TMTCIFFieldValueFileImpl();
		return tmtcifFieldValueFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFieldValueEnum createTMTCIFFieldValueEnum() {
		TMTCIFFieldValueEnumImpl tmtcifFieldValueEnum = new TMTCIFFieldValueEnumImpl();
		return tmtcifFieldValueEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fieldvaluePackage getfieldvaluePackage() {
		return (fieldvaluePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static fieldvaluePackage getPackage() {
		return fieldvaluePackage.eINSTANCE;
	}

} //fieldvalueFactoryImpl
