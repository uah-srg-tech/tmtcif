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
package es.uah.aut.srg.tmtcif.lang.filter.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;
import es.uah.aut.srg.tmtcif.xtext.TMTCIFAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class FILTERScopeProvider extends TMTCIFAbstractScopeProvider {

	public IScope scope_TMTCIFFormatField(final TMTCIFFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		Set<TMTCIFFormatField> fields = new HashSet<TMTCIFFormatField>();
		
		fields.addAll(filter.getFormatFile().getCSField());
		fields.addAll(filter.getFormatFile().getCSFormulaField());
		fields.addAll(filter.getFormatFile().getFDICField());
		fields.addAll(filter.getFormatFile().getVRFieldSize());
		fields.addAll(filter.getFormatFile().getVSField());
		
		return getSimpleObjectScope(fields);
	}

	public IScope scope_TMTCIFFormatField(final TMTCIFFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		Set<TMTCIFFormatField> fields = new HashSet<TMTCIFFormatField>();
		
		fields.addAll(filter.getFormatFile().getCSField());
		fields.addAll(filter.getFormatFile().getCSFormulaField());
		fields.addAll(filter.getFormatFile().getFDICField());
		fields.addAll(filter.getFormatFile().getVRFieldSize());
		fields.addAll(filter.getFormatFile().getVSField());
		
		return getSimpleObjectScope(fields);
	}
	
	public IScope scope_GSSTmTcAIFormatField(final TMTCIFFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getAIField());
	}
	
	public IScope scope_GSSTmTcAIFormatField(final TMTCIFFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getAIField());
	}
	
	public IScope scope_TMTCIFFormatFDICField(final TMTCIFFilterMaxtermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getFDICField());
	}
	
	public IScope scope_TMTCIFFormatFDICField(final TMTCIFFilterMintermFilter filter, EReference reference) {
		
		if (filter.getFormatFile() == null) {
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(filter.getFormatFile().getFDICField());
	}
}
