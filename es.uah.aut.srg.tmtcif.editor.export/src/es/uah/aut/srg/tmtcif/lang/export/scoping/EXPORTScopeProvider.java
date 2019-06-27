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
package es.uah.aut.srg.tmtcif.lang.export.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;
import es.uah.aut.srg.tmtcif.xtext.TMTCIFAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class EXPORTScopeProvider extends TMTCIFAbstractScopeProvider  {
	
	public IScope scope_TMTCIFFormatField(final TMTCIFExportExport export, EReference reference) {
		
		Set<TMTCIFFormatField> fields = new HashSet<TMTCIFFormatField>();
		
		if(reference.getName() == "toFieldRef") {
			if (export.getTo() == null) {
				return IScope.NULLSCOPE;
			}
			
			fields.addAll(export.getTo().getCSField());
			fields.addAll(export.getTo().getCSFormulaField());
			fields.addAll(export.getTo().getFDICField());
			fields.addAll(export.getTo().getVRFieldSize());
			fields.addAll(export.getTo().getVSField());
			
		} else {

			fields.addAll(export.getFrom().getCSField());
			fields.addAll(export.getFrom().getCSFormulaField());
			fields.addAll(export.getFrom().getFDICField());
			fields.addAll(export.getFrom().getVRFieldSize());
			fields.addAll(export.getFrom().getVSField());
		}
		return getSimpleObjectScope(fields);
		
	}
	public IScope scope_TMTCIFFormatAIField(final TMTCIFExportExport export, EReference reference) {

		if(reference.getName() == "toFieldRef") {
			if (export.getTo() == null) {
				return IScope.NULLSCOPE;
			} else {
				return getSimpleObjectScope(export.getTo().getAIField());
			}
		} else {
			if (export.getFrom() == null) {
				return IScope.NULLSCOPE;
			} else {
				return getSimpleObjectScope(export.getFrom().getAIField());
			}
		}
	}
}
