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
package es.uah.aut.srg.tmtcif.lang.export.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport;
import es.uah.aut.srg.tmtcif.common.commonPackage;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportActivateDICs;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportDIC;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromConst;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingAIFromFile;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromConst;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromField;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromFile;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettingFromSize;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSettings;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLength;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeFromFileLine;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizeInBits;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportSizes;
import es.uah.aut.srg.tmtcif.export.exportPackage;
import es.uah.aut.srg.tmtcif.lang.export.services.EXPORTGrammarAccess;
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
public class EXPORTSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EXPORTGrammarAccess grammarAccess;
	
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
		else if (epackage == exportPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case exportPackage.TMTCIF_EXPORT_ACTIVATE_DI_CS:
				sequence_TMTCIFExportActivateDICs(context, (TMTCIFExportActivateDICs) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_DIC:
				sequence_TMTCIFExportDIC(context, (TMTCIFExportDIC) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_EXPORT:
				sequence_TMTCIFExportExport(context, (TMTCIFExportExport) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_CONST:
				sequence_TMTCIFExportSettingAIFromConst(context, (TMTCIFExportSettingAIFromConst) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_AI_FROM_FILE:
				sequence_TMTCIFExportSettingAIFromFile(context, (TMTCIFExportSettingAIFromFile) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_CONST:
				sequence_TMTCIFExportSettingFromConst(context, (TMTCIFExportSettingFromConst) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FIELD:
				sequence_TMTCIFExportSettingFromField(context, (TMTCIFExportSettingFromField) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_FILE:
				sequence_TMTCIFExportSettingFromFile(context, (TMTCIFExportSettingFromFile) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTING_FROM_SIZE:
				sequence_TMTCIFExportSettingFromSize(context, (TMTCIFExportSettingFromSize) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SETTINGS:
				sequence_TMTCIFExportSettings(context, (TMTCIFExportSettings) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LENGTH:
				sequence_TMTCIFExportSizeFromFileLength(context, (TMTCIFExportSizeFromFileLength) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SIZE_FROM_FILE_LINE:
				sequence_TMTCIFExportSizeFromFileLine(context, (TMTCIFExportSizeFromFileLine) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SIZE_IN_BITS:
				sequence_TMTCIFExportSizeInBits(context, (TMTCIFExportSizeInBits) semanticObject); 
				return; 
			case exportPackage.TMTCIF_EXPORT_SIZES:
				sequence_TMTCIFExportSizes(context, (TMTCIFExportSizes) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFExportActivateDICs returns TMTCIFExportActivateDICs
	 *
	 * Constraint:
	 *     DIC+=TMTCIFExportDIC+
	 */
	protected void sequence_TMTCIFExportActivateDICs(ISerializationContext context, TMTCIFExportActivateDICs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportDIC returns TMTCIFExportDIC
	 *
	 * Constraint:
	 *     (id=INTEGER DICRef=ID)
	 */
	protected void sequence_TMTCIFExportDIC(ISerializationContext context, TMTCIFExportDIC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_DIC__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_DIC__ID));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_DIC__DIC_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_DIC__DIC_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0(), semanticObject.getDICRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportExport returns TMTCIFExportExport
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (uri=QualifiedName | version=Version)+ 
	 *         from=[TMTCIFFormatFormat|VersionedQualifiedName]? 
	 *         to=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *         Sizes=TMTCIFExportSizes? 
	 *         settings=TMTCIFExportSettings 
	 *         activateDICs=TMTCIFExportActivateDICs?
	 *     )
	 */
	protected void sequence_TMTCIFExportExport(ISerializationContext context, TMTCIFExportExport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingAIFromConst returns TMTCIFExportSettingAIFromConst
	 *
	 * Constraint:
	 *     (value=INTEGER toFieldRef=[TMTCIFFormatAIField|VersionedQualifiedReferenceName] toArrayIndex=INTEGER)
	 */
	protected void sequence_TMTCIFExportSettingAIFromConst(ISerializationContext context, TMTCIFExportSettingAIFromConst semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__VALUE));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI__TO_FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.accept(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0(), semanticObject.getToArrayIndex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingAIFromFile returns TMTCIFExportSettingAIFromFile
	 *
	 * Constraint:
	 *     (
	 *         file=ID 
	 *         toFieldRef=[TMTCIFFormatAIField|VersionedQualifiedReferenceName] 
	 *         toArrayIndex=INTEGER 
	 *         offset=INTEGER? 
	 *         size=INTEGER? 
	 *         line=INTEGER?
	 *     )
	 */
	protected void sequence_TMTCIFExportSettingAIFromFile(ISerializationContext context, TMTCIFExportSettingAIFromFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingFromConst returns TMTCIFExportSettingFromConst
	 *
	 * Constraint:
	 *     (value=INTEGER toFieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_TMTCIFExportSettingFromConst(ISerializationContext context, TMTCIFExportSettingFromConst semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_CONST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_CONST__VALUE));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingFromField returns TMTCIFExportSettingFromField
	 *
	 * Constraint:
	 *     (fieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName] toFieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_TMTCIFExportSettingFromField(ISerializationContext context, TMTCIFExportSettingFromField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_FIELD__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_FIELD__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingFromFile returns TMTCIFExportSettingFromFile
	 *
	 * Constraint:
	 *     (file=ID toFieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName] offset=INTEGER? size=INTEGER? line=INTEGER?)
	 */
	protected void sequence_TMTCIFExportSettingFromFile(ISerializationContext context, TMTCIFExportSettingFromFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettingFromSize returns TMTCIFExportSettingFromSize
	 *
	 * Constraint:
	 *     (sizeRef=INTEGER toFieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName])
	 */
	protected void sequence_TMTCIFExportSettingFromSize(ISerializationContext context, TMTCIFExportSettingFromSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_SIZE__SIZE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING_FROM_SIZE__SIZE_REF));
			if (transientValues.isValueTransient(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, exportPackage.Literals.TMTCIF_EXPORT_SETTING__TO_FIELD_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0(), semanticObject.getSizeRef());
		feeder.accept(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1(), semanticObject.getToFieldRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSettings returns TMTCIFExportSettings
	 *
	 * Constraint:
	 *     (
	 *         settingFromConst+=TMTCIFExportSettingFromConst | 
	 *         settingFromSize+=TMTCIFExportSettingFromSize | 
	 *         settingFromFile+=TMTCIFExportSettingFromFile | 
	 *         settingFromField+=TMTCIFExportSettingFromField | 
	 *         settingAIFromConst+=TMTCIFExportSettingAIFromConst | 
	 *         settingAIFromFile+=TMTCIFExportSettingAIFromFile
	 *     )*
	 */
	protected void sequence_TMTCIFExportSettings(ISerializationContext context, TMTCIFExportSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSizeFromFileLength returns TMTCIFExportSizeFromFileLength
	 *
	 * Constraint:
	 *     (id=INTEGER fromFile=ID addSize=INTEGER? unit=TMTCIFExportUnit?)
	 */
	protected void sequence_TMTCIFExportSizeFromFileLength(ISerializationContext context, TMTCIFExportSizeFromFileLength semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSizeFromFileLine returns TMTCIFExportSizeFromFileLine
	 *
	 * Constraint:
	 *     (id=INTEGER fromFile=ID line=INTEGER addSize=INTEGER? unit=TMTCIFExportUnit?)
	 */
	protected void sequence_TMTCIFExportSizeFromFileLine(ISerializationContext context, TMTCIFExportSizeFromFileLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSizeInBits returns TMTCIFExportSizeInBits
	 *
	 * Constraint:
	 *     (id=INTEGER from=ID addSize=INTEGER? unit=TMTCIFExportUnit?)
	 */
	protected void sequence_TMTCIFExportSizeInBits(ISerializationContext context, TMTCIFExportSizeInBits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFExportSizes returns TMTCIFExportSizes
	 *
	 * Constraint:
	 *     (sizeFromFileLength+=TMTCIFExportSizeFromFileLength | sizeFromFileLine+=TMTCIFExportSizeFromFileLine | sizeInBits+=TMTCIFExportSizeInBits)+
	 */
	protected void sequence_TMTCIFExportSizes(ISerializationContext context, TMTCIFExportSizes semanticObject) {
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
	 *     (imports+=TMTCIFModelFileImport* element=TMTCIFExportExport)
	 */
	protected void sequence_TMTCIFModelFile(ISerializationContext context, TMTCIFModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
