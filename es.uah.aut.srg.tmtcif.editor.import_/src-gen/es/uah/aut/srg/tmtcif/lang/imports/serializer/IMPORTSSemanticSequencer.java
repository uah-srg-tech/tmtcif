/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.tmtcif.lang.imports.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport;
import es.uah.aut.srg.tmtcif.common.commonPackage;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportDataSource;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;
import es.uah.aut.srg.tmtcif.import_.TMTCIFImportVirtualSize;
import es.uah.aut.srg.tmtcif.import_.importPackage;
import es.uah.aut.srg.tmtcif.lang.imports.services.IMPORTSGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class IMPORTSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IMPORTSGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == commonPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case commonPackage.TMTCIF_MODEL_FILE:
				sequence_TMTCIFModelFile(context, (TMTCIFModelFile) semanticObject); 
				return; 
			case commonPackage.TMTCIF_MODEL_FILE_IMPORT:
				sequence_TMTCIFModelFileImport(context, (TMTCIFModelFileImport) semanticObject); 
				return; 
			}
		else if (epackage == importPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case importPackage.TMTCIF_IMPORT_DATA_SOURCE:
				sequence_TMTCIFImportDataSource(context, (TMTCIFImportDataSource) semanticObject); 
				return; 
			case importPackage.TMTCIF_IMPORT_IMPORT:
				sequence_TMTCIFImportImport(context, (TMTCIFImportImport) semanticObject); 
				return; 
			case importPackage.TMTCIF_IMPORT_VIRTUAL_SIZE:
				sequence_TMTCIFImportVirtualSize(context, (TMTCIFImportVirtualSize) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFImportDataSource returns TMTCIFImportDataSource
	 *
	 * Constraint:
	 *     (FieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName] leftTrim=INTEGER rightTrim=INTEGER)
	 */
	protected void sequence_TMTCIFImportDataSource(ISerializationContext context, TMTCIFImportDataSource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__LEFT_TRIM));
			if (transientValues.isValueTransient(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, importPackage.Literals.TMTCIF_IMPORT_DATA_SOURCE__RIGHT_TRIM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0(), semanticObject.getLeftTrim());
		feeder.accept(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0(), semanticObject.getRightTrim());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFImportImport returns TMTCIFImportImport
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (uri=QualifiedName | version=Version)+ 
	 *         from=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *         to=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         dataSource+=TMTCIFImportDataSource+ 
	 *         virtualSize=TMTCIFImportVirtualSize?
	 *     )
	 */
	protected void sequence_TMTCIFImportImport(ISerializationContext context, TMTCIFImportImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFImportVirtualSize returns TMTCIFImportVirtualSize
	 *
	 * Constraint:
	 *     (
	 *         FieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName] 
	 *         to=[TMTCIFFormatField|VersionedQualifiedReferenceName] 
	 *         addSize=INTEGER? 
	 *         unit=TMTCIFImportUnit?
	 *     )
	 */
	protected void sequence_TMTCIFImportVirtualSize(ISerializationContext context, TMTCIFImportVirtualSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFModelFileImport returns TMTCIFModelFileImport
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_TMTCIFModelFileImport(ISerializationContext context, TMTCIFModelFileImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.TMTCIF_MODEL_FILE_IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.TMTCIF_MODEL_FILE_IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFModelFile returns TMTCIFModelFile
	 *
	 * Constraint:
	 *     (imports+=TMTCIFModelFileImport* element=TMTCIFImportImport)
	 */
	protected void sequence_TMTCIFModelFile(ISerializationContext context, TMTCIFModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
