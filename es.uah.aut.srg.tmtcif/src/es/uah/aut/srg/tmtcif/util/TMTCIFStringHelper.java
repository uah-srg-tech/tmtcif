/*******************************************************************************
 * Copyright (c) 2013-2017 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.tmtcif.util;

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelElement;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelObject;


/**
 * Helper functions to manage strings of the TMTCIF common classes.
 */
public class TMTCIFStringHelper {

	/**
	 * The delimiter string that will be used to form the object names.
	 */
	public static final String OBJECT_DELIMITER = "::";

	/**
	 * Returns the full name of an element. This name is formed by adding
	 * to the URI of the element a dot '.', the name of the element and the
	 * version between brackets.
	 * @param element the element.
	 * @return the full name of the element.
	 */
	public static String getFullElementName(TMTCIFModelElement element)
	{
		return (element.getUri() + "(" + element.getVersion() + ")");
	}

	/**
	 * Returns the reference name of an element. This name is formed by the
	 * name given to the element plus its version between brackets.
	 * @param element the element.
	 * @return the reference name of the element.
	 */
	public static String getElementName(TMTCIFModelElement element)
	{
		return (element.getName() + "(" + element.getVersion() + ")");
	}

	/**
	 * Returns the partial name of an object by moving upwards in its
	 * its containment tree until it has completed "index" steps or reaches
	 * its parent element. The parent element part is its name and version.
	 * 
	 * If index has a negative value, the function will reach the containment
	 * element and returns the full name of the object. If index is zero, the
	 * function will return the name of the object without the part of the
	 * containment element. If index is greater than zero, it will run the
	 * object's containment tree and compose the object's name from the 
	 * parent referenceable objects until reaching the parent element or
	 * completing the hops marked by the index parameter.
	 * 
	 * @param object the referenceable object from which to obtain the name.
	 * @param index the index containing the number of steps to hop in the
	 * 	            object's containment tree. 
	 * @return the partial name of the object.
	 */
	public static String getPartialObjectNameToElement(TMTCIFModelObject object, int index)
	{
		String name = object.getName();

		EObject container = object.eContainer();

		int i = 1;

		for (;;)
		{
			if (container == null ||
					index == i)
			{
				return name;
			}
			else if (container instanceof TMTCIFModelElement)
			{
				if (index != 0)
				{
					TMTCIFModelElement tmp = (TMTCIFModelElement)container;
					return TMTCIFStringHelper.getElementName(tmp) + OBJECT_DELIMITER + name;
				}
				else
				{
					return name;
				}
			}
			else if (container instanceof TMTCIFModelObject)
			{
				TMTCIFModelObject tmp = (TMTCIFModelObject)container;
				if (index <= 0 || i < index)
				{
					name = tmp.getName() + OBJECT_DELIMITER + name;
					i++;
				}
				else
				{
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
			}
			container = container.eContainer();
		}
	}

	/**
	 * Returns the full name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The full
	 * name includes the reference name of the containing element.
	 * @param object the object.
	 * @return the full name of the object.
	 */
	public static String getFullObjectNameToElement(TMTCIFModelObject object)
	{
		return getPartialObjectNameToElement(object, -1);
	}

	/**
	 * Returns the relative name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The relative
	 * name does not include the reference name of the containing element.
	 * @see #getFullObjectNameToElement(TMTCIFModelObject)
	 * @param object the object.
	 * @return the full name of the object.
	 */
	public static String getRelativeObjectName(TMTCIFModelObject object)
	{
		return getPartialObjectNameToElement(object, 0);
	}


	/**
	 * Returns the partial name of an object by moving upwards in its
	 * its containment tree until it has completed "index" steps or reaches
	 * its parent element. The parent element part is just its name.
	 * 
	 * If index has a negative value, the function will reach the containment
	 * element and returns the full name of the object. If index is zero, the
	 * function will return the name of the object without the part of the
	 * containment element. If index is greater than zero, it will run the
	 * object's containment tree and compose the object's name from the 
	 * parent referenceable objects until reaching the parent element or
	 * completing the hops marked by the index parameter.
	 * 
	 * @param object The referenceable object from which to obtain the name.
	 * @param index The index containing the number of steps to hop in the
	 * 	            object's containment tree. 
	 * @return The partial name of the object.
	 */
	public static String getPartialObjectNameToElementWithoutVersion(TMTCIFModelObject object, int index)
	{
		String name = object.getName();

		EObject container = object.eContainer();

		int i = 1;

		for (;;)
		{
			if (container == null ||
					index == i)
			{
				return name;
			}
			else if (container instanceof TMTCIFModelElement)
			{
				if (index != 0)
				{
					TMTCIFModelElement tmp = (TMTCIFModelElement)container;
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
				else
				{
					return name;
				}
			}
			else if (container instanceof TMTCIFModelObject)
			{
				TMTCIFModelObject tmp = (TMTCIFModelObject)container;
				if (index <= 0 || i < index)
				{
					name = tmp.getName() + OBJECT_DELIMITER + name;
					i++;
				}
				else
				{
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
			}
			container = container.eContainer();
		}
	}

	/**
	 * Returns the full name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The full
	 * name includes the name (without the version) of the containing element.
	 * @see #getFullObjectNameToEleme
	 * @param object the object.
	 * @return the full name of the object without the version of the
	 * 		   containing element.
	 */
	public static String getFullObjectNameToElementWithoutVersion(TMTCIFModelObject object)
	{
		return getPartialObjectNameToElementWithoutVersion(object, -1);
	}
	
	public static String getPackageFromURI(String uri)
	{
		String[] tmp = uri.split("[.]");
		String _package = "";
		
		if (tmp != null)
		{
			if (tmp.length == 1)
			{
				return uri;
			}
			for (int i = 0; i < tmp.length-1; i++)
			{
				_package += tmp[i]+".";
			}
			return _package;
		}
		return null;
	}
	
	public static String getNameFromURI(String uri)
	{
		String[] tmp = uri.split("[.]");
		
		if (tmp != null)
		{
			if (tmp.length >= 1)
				return tmp[tmp.length-1];
			else
				return uri;
		}
		else
		{
			return null;
		}
	}

}
