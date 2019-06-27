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

import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.commonPackage;

public class TMTCIFAbstractJavaValidator extends AbstractDeclarativeValidator {

	@Check
	public void checkTMTCIFModelElement_URIandName(TMTCIFModelElement element)
	{
		if (element.getName() != null &&
			element.getUri() != null &&
			element.getName() != "")
		{
			String[] tmp = element.getUri().split("[.]");
			String name = "";
			if (tmp != null && tmp.length >= 1)
				name = tmp[tmp.length-1];
			if (element.getName().toLowerCase().matches(name.toLowerCase()) == false)
			{
				error("The name of the element and the last fragment of the URI must match.",
						commonPackage.eINSTANCE.getTMTCIFModelElement_Uri());
			}
		}
	}
	
}
