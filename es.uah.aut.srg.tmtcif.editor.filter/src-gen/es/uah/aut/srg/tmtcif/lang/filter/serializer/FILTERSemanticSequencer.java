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
package es.uah.aut.srg.tmtcif.lang.filter.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport;
import es.uah.aut.srg.tmtcif.common.commonPackage;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVar;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFDIC;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterBoolVarRef;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterConstant;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFieldOp;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMaxtermFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMinterm;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterMintermFilter;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelect;
import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterSelectLine;
import es.uah.aut.srg.tmtcif.filter.filterPackage;
import es.uah.aut.srg.tmtcif.lang.filter.services.FILTERGrammarAccess;
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
public class FILTERSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FILTERGrammarAccess grammarAccess;
	
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
		else if (epackage == filterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case filterPackage.TMTCIF_FILTER_BOOL_VAR:
				sequence_TMTCIFFilterBoolVar(context, (TMTCIFFilterBoolVar) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FDIC:
				sequence_TMTCIFFilterBoolVarFDIC(context, (TMTCIFFilterBoolVarFDIC) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_ARRAY_ITEM:
				sequence_TMTCIFFilterBoolVarFromArrayItem(context, (TMTCIFFilterBoolVarFromArrayItem) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				sequence_TMTCIFFilterBoolVarFromGroupedArrayItem(context, (TMTCIFFilterBoolVarFromGroupedArrayItem) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_BOOL_VAR_REF:
				sequence_TMTCIFFilterBoolVarRef(context, (TMTCIFFilterBoolVarRef) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_CONSTANT:
				sequence_TMTCIFFilterConstant(context, (TMTCIFFilterConstant) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_FIELD_OP:
				sequence_TMTCIFFilterFieldOp(context, (TMTCIFFilterFieldOp) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_MAXTERM:
				sequence_TMTCIFFilterMaxterm(context, (TMTCIFFilterMaxterm) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_MAXTERM_FILTER:
				sequence_TMTCIFFilterMaxtermFilter(context, (TMTCIFFilterMaxtermFilter) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_MINTERM:
				sequence_TMTCIFFilterMinterm(context, (TMTCIFFilterMinterm) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_MINTERM_FILTER:
				sequence_TMTCIFFilterMintermFilter(context, (TMTCIFFilterMintermFilter) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_SELECT:
				sequence_TMTCIFFilterSelect(context, (TMTCIFFilterSelect) semanticObject); 
				return; 
			case filterPackage.TMTCIF_FILTER_SELECT_LINE:
				sequence_TMTCIFFilterSelectLine(context, (TMTCIFFilterSelectLine) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFFilterBoolVarFDIC returns TMTCIFFilterBoolVarFDIC
	 *
	 * Constraint:
	 *     (id=INTEGER name=ID FieldRef=[TMTCIFFormatFDICField|VersionedQualifiedReferenceName] Op=TMTCIFFilterFieldOp)
	 */
	protected void sequence_TMTCIFFilterBoolVarFDIC(ISerializationContext context, TMTCIFFilterBoolVarFDIC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__ID));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__NAME));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__FIELD_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__FIELD_REF));
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_FDIC__OP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1(), semanticObject.getFieldRef());
		feeder.accept(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0(), semanticObject.getOp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterBoolVarFromArrayItem returns TMTCIFFilterBoolVarFromArrayItem
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=TMTCIFFilterConstantType 
	 *         AIFieldRef=[TMTCIFFormatAIField|VersionedQualifiedReferenceName] 
	 *         Op=TMTCIFFilterFieldOp 
	 *         (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
	 *     )
	 */
	protected void sequence_TMTCIFFilterBoolVarFromArrayItem(ISerializationContext context, TMTCIFFilterBoolVarFromArrayItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterBoolVarFromGroupedArrayItem returns TMTCIFFilterBoolVarFromGroupedArrayItem
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=TMTCIFFilterConstantType 
	 *         group=ID 
	 *         AIFieldRefs=[TMTCIFFormatAField|VersionedQualifiedReferenceName] 
	 *         Op=TMTCIFFilterFieldOp 
	 *         (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
	 *     )
	 */
	protected void sequence_TMTCIFFilterBoolVarFromGroupedArrayItem(ISerializationContext context, TMTCIFFilterBoolVarFromGroupedArrayItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterBoolVarRef returns TMTCIFFilterBoolVarRef
	 *
	 * Constraint:
	 *     idRef=INTEGER
	 */
	protected void sequence_TMTCIFFilterBoolVarRef(ISerializationContext context, TMTCIFFilterBoolVarRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_REF__ID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_BOOL_VAR_REF__ID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0(), semanticObject.getIdRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterBoolVar returns TMTCIFFilterBoolVar
	 *
	 * Constraint:
	 *     (
	 *         id=INTEGER 
	 *         name=ID 
	 *         constantType=TMTCIFFilterConstantType 
	 *         FieldRef=[TMTCIFFormatField|VersionedQualifiedReferenceName] 
	 *         Op=TMTCIFFilterFieldOp 
	 *         (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
	 *     )
	 */
	protected void sequence_TMTCIFFilterBoolVar(ISerializationContext context, TMTCIFFilterBoolVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterConstant returns TMTCIFFilterConstant
	 *
	 * Constraint:
	 *     (value=INTEGER mask=HEXADECIMAL?)
	 */
	protected void sequence_TMTCIFFilterConstant(ISerializationContext context, TMTCIFFilterConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterFieldOp returns TMTCIFFilterFieldOp
	 *
	 * Constraint:
	 *     type=TMTCIFFilterOPType
	 */
	protected void sequence_TMTCIFFilterFieldOp(ISerializationContext context, TMTCIFFilterFieldOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, filterPackage.Literals.TMTCIF_FILTER_FIELD_OP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, filterPackage.Literals.TMTCIF_FILTER_FIELD_OP__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterFilter returns TMTCIFFilterMaxtermFilter
	 *     TMTCIFFilterMaxtermFilter returns TMTCIFFilterMaxtermFilter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             uri=QualifiedName | 
	 *             (
	 *                 version=Version 
	 *                 formatFile=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *                 (
	 *                     BoolVar+=TMTCIFFilterBoolVar | 
	 *                     BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem | 
	 *                     BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | 
	 *                     BoolVarFDIC+=TMTCIFFilterBoolVarFDIC
	 *                 )+
	 *             )
	 *         )+ 
	 *         Maxterm+=TMTCIFFilterMaxterm+
	 *     )
	 */
	protected void sequence_TMTCIFFilterMaxtermFilter(ISerializationContext context, TMTCIFFilterMaxtermFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterMaxterm returns TMTCIFFilterMaxterm
	 *
	 * Constraint:
	 *     (id=INTEGER BoolVarRef+=TMTCIFFilterBoolVarRef+)
	 */
	protected void sequence_TMTCIFFilterMaxterm(ISerializationContext context, TMTCIFFilterMaxterm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterFilter returns TMTCIFFilterMintermFilter
	 *     TMTCIFFilterMintermFilter returns TMTCIFFilterMintermFilter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             uri=QualifiedName | 
	 *             (
	 *                 version=Version 
	 *                 formatFile=[TMTCIFFormatFormat|VersionedQualifiedName] 
	 *                 (
	 *                     BoolVar+=TMTCIFFilterBoolVar | 
	 *                     BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem | 
	 *                     BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | 
	 *                     BoolVarFDIC+=TMTCIFFilterBoolVarFDIC
	 *                 )+
	 *             )
	 *         )+ 
	 *         Minterm+=TMTCIFFilterMinterm+
	 *     )
	 */
	protected void sequence_TMTCIFFilterMintermFilter(ISerializationContext context, TMTCIFFilterMintermFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterMinterm returns TMTCIFFilterMinterm
	 *
	 * Constraint:
	 *     (id=INTEGER BoolVarRef+=TMTCIFFilterBoolVarRef+)
	 */
	protected void sequence_TMTCIFFilterMinterm(ISerializationContext context, TMTCIFFilterMinterm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterSelectLine returns TMTCIFFilterSelectLine
	 *
	 * Constraint:
	 *     (fromFile=ID line=INTEGER leftTrim=INTEGER? rightTrim=INTEGER? mask=HEXADECIMAL?)
	 */
	protected void sequence_TMTCIFFilterSelectLine(ISerializationContext context, TMTCIFFilterSelectLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFilterSelect returns TMTCIFFilterSelect
	 *
	 * Constraint:
	 *     (fromFile=ID type=TMTCIFFilterSelectType offset=INTEGER? size=INTEGER? mask=HEXADECIMAL?)
	 */
	protected void sequence_TMTCIFFilterSelect(ISerializationContext context, TMTCIFFilterSelect semanticObject) {
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
	 *     (imports+=TMTCIFModelFileImport* element=TMTCIFFilterFilter)
	 */
	protected void sequence_TMTCIFModelFile(ISerializationContext context, TMTCIFModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
