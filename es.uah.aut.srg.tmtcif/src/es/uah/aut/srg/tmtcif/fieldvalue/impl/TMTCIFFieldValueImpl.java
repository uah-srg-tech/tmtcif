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

import es.uah.aut.srg.tmtcif.fieldvalue.TMTCIFFieldValue;
import es.uah.aut.srg.tmtcif.fieldvalue.fieldvaluePackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMTCIF Field Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TMTCIFFieldValueImpl extends MinimalEObjectImpl.Container implements TMTCIFFieldValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMTCIFFieldValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return fieldvaluePackage.Literals.TMTCIF_FIELD_VALUE;
	}

} //TMTCIFFieldValueImpl
