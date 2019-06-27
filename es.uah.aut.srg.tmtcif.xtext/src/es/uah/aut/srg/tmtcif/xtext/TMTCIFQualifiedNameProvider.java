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

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;
import es.uah.aut.srg.tmtcif.util.TMTCIFStringHelper;

public class TMTCIFQualifiedNameProvider extends 
	DefaultDeclarativeQualifiedNameProvider {
	
	public static class TMTCIFDefaultNameConverter extends IQualifiedNameConverter.DefaultImpl {

		@Override
		public String getDelimiter() {
			return TMTCIFStringHelper.OBJECT_DELIMITER;
		}
		
	}
	
	public QualifiedName qualifiedName(TMTCIFModelElement element) {
		if (element.getName() == null || element.getVersion() == null)
			return null;
		else
			return getConverter().toQualifiedName(TMTCIFStringHelper.getElementName(element));
	  }
	
	public QualifiedName qualifiedName(TMTCIFModelObject object)
	{	
		return getConverter().toQualifiedName(TMTCIFStringHelper.getFullObjectNameToElement(object));
	}

}
