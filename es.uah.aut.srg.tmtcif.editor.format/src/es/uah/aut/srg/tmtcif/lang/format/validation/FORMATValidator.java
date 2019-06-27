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
package es.uah.aut.srg.tmtcif.lang.format.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.tmtcif.common.commonPackage;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatField;
import es.uah.aut.srg.tmtcif.xtext.TMTCIFAbstractJavaValidator;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class FORMATValidator extends TMTCIFAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/tmtcif/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/tmtcif/format"));
		return result;
	}
	
	@Check
	public void checkTMTCIFFormatField_name(TMTCIFFormatField field) {
	
		if (field.getName() != null && field.getName().length() == 0) {
			error("The field name cannot be an empty string", commonPackage.eINSTANCE.getTMTCIFModelObject_Name());
					
		}
		
	}
	
}
