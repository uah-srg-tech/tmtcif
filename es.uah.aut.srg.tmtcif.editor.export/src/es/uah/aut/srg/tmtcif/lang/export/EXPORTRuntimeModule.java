/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.tmtcif.lang.export;

import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import es.uah.aut.srg.tmtcif.xtext.TMTCIFDescriptionAssociator;
import es.uah.aut.srg.tmtcif.xtext.TMTCIFLazyLinker;
import es.uah.aut.srg.tmtcif.xtext.TMTCIFQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EXPORTRuntimeModule extends AbstractEXPORTRuntimeModule {
	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return TMTCIFQualifiedNameProvider.TMTCIFDefaultNameConverter.class;
	}
	
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {  
		return TMTCIFQualifiedNameProvider.class;
	}
	
	public Class<? extends TMTCIFDescriptionAssociator> bindDescriptionAssociator() {
		return TMTCIFDescriptionAssociator.class;
	}
	
	public Class<? extends ILinker> bindILinker() {
		return TMTCIFLazyLinker.class;
	}
	
}
