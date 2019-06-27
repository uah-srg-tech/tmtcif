/*******************************************************************************
 * Copyright (c) 2013-2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.tmtcif.xtext;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;
import es.uah.aut.srg.tmtcif.util.TMTCIFStringHelper;


public abstract class TMTCIFAbstractScopeProvider extends
	AbstractDeclarativeScopeProvider {
	
	@Inject
	protected IQualifiedNameProvider qualifiedNameProvider;
	
	@Inject
	protected IQualifiedNameConverter qualifiedNameConverter;
	
	public IScope getFullElementScope(final TMTCIFModelElement element) {
		return getFullElementScope(element, IScope.NULLSCOPE);
	}
	
	public IScope getFullElementScope(TMTCIFModelElement element, IScope parentScope) {
		
		if (element == null)
		{
			return parentScope;
		}
		
		Set<IEObjectDescription> descriptions = new HashSet<IEObjectDescription>();
		descriptions.add(EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(element), element));
		
		return new SimpleScope(parentScope, descriptions);
			
	}

	public IScope getFullElementScope(final Collection<? extends TMTCIFModelElement> elements) {
		return getFullElementScope(elements, IScope.NULLSCOPE);
	}
	
	public IScope getFullElementScope(final Collection<? extends TMTCIFModelElement> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQNs = Iterables.transform(elements, new Function<TMTCIFModelElement, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(TMTCIFModelElement from) {
				return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
			}
		});
		
		return new SimpleScope(parentScope, fullQNs);
			
	}
		
	public IScope getFullObjectScope(final Collection<? extends TMTCIFModelObject> elements) {
		return getFullObjectScope(elements, IScope.NULLSCOPE);
	}
	
	public IScope getFullObjectScope(final Collection<? extends TMTCIFModelObject> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		// First we have to obtain the scope with the fully qualified names of everything
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<TMTCIFModelObject, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(TMTCIFModelObject from) {
				return EObjectDescription.create(qualifiedNameProvider.getFullyQualifiedName(from), from);
			}
		});
		
		// Then with the parent MCommonElement
		
		return new SimpleScope(parentScope, fullQN);		
	}
	
	public IScope getRelativeObjectScope(final Collection<? extends TMTCIFModelObject> elements) {
		return getRelativeObjectScope(elements, IScope.NULLSCOPE);
	}
	
	public IScope getRelativeObjectScope(final Collection<? extends TMTCIFModelObject> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<TMTCIFModelObject, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(TMTCIFModelObject from) {
				return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(TMTCIFStringHelper.getPartialObjectNameToElement(from, 0)), from);
			}
		});

		
		return new SimpleScope(parentScope, fullQN);		
	}

		
	public IScope getSimpleObjectScope(final Collection<? extends TMTCIFModelObject> elements) {
		return getSimpleObjectScope(elements, IScope.NULLSCOPE);
		
	}
	
	public IScope getSimpleObjectScope(final Collection<? extends TMTCIFModelObject> elements, IScope parentScope) {
		
		if (elements.isEmpty())
		{
			return parentScope;
		}
		
		Iterable<IEObjectDescription> fullQN = Iterables.transform(elements, new Function<TMTCIFModelObject, IEObjectDescription>(){
			
			@Override
			public IEObjectDescription apply(TMTCIFModelObject from) {
				return EObjectDescription.create(qualifiedNameConverter.toQualifiedName(from.getName()), from);
			}
		});

		
		return new SimpleScope(parentScope, fullQN);		
	}

}
