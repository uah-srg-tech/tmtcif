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
package es.uah.aut.srg.tmtcif.xtext.ui.handlers;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.xtext.xml.XMLGeneratorUtil;

public class GenerateXML extends AbstractHandler {
	
	protected Shell shell;
	
	protected ResourceSet resourceSet = new ResourceSetImpl();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		if (selection instanceof IStructuredSelection)
		{
			final Object object = ((IStructuredSelection)selection).getFirstElement();
			if (object instanceof IResource)
			{
				shell = HandlerUtil.getActiveShell(event);
				final IRunnableContext context = new ProgressMonitorDialog(shell);
				final Exception except[] = new Exception[1];

				Resource xtextResource = 
					resourceSet.getResource(URI.createPlatformResourceURI(((IResource)object).getFullPath().toString(), true), true);
				
				EObject model = xtextResource.getContents().get(0);
				
				XMLGeneratorUtil.convertReferences(model);

				EObject outputModel = EcoreUtil.copy(((TMTCIFModelFile)model).getElement());
				String pathName = 
						((IResource)object).getFullPath().removeFileExtension().addFileExtension("xmi").toString();
				
				final Resource xmiResource = resourceSet.createResource(URI.createPlatformResourceURI(pathName, true));
												
				xmiResource.getContents().add(outputModel);
				
				shell.getDisplay().syncExec(new Runnable() {

					@Override
					public void run() {
						
						try {
							context.run(false, false, new IRunnableWithProgress() {
								public void run(IProgressMonitor monitor) 
								throws InvocationTargetException, InterruptedException {
									
									monitor.beginTask("Generating XMI files", 50);
									
									try {
										xmiResource.save(null);
									} catch (IOException e) {
										throw new InvocationTargetException(e, e.getMessage());
									}
									
									monitor.done();
									
								}
							});
						} catch (InvocationTargetException e) {
							except[0] = e;
						} catch (InterruptedException e) {
							except[0] = e;
						}
					}
				});
				
				if (except[0] != null)
				{
					throw new ExecutionException(except[0].getMessage());
				}

				try {
					((IResource)object).getProject().refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					throw new ExecutionException(e.getMessage());
				}
			}
		}
		
		return null;
	}

}
