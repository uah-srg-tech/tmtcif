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
package es.uah.aut.srg.tmtcif.lang.format.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFile;
import es.uah.aut.srg.tmtcif.common.TMTCIFModelFileImport;
import es.uah.aut.srg.tmtcif.common.commonPackage;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatAIField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayDimension;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatArrayRef;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatBytesBits;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatCSFormulaField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFDICField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFieldToCheck;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFloatingOffset;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormula;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatSortedFieldsToCheck;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVRFieldSize;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVSField;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatVariableSize;
import es.uah.aut.srg.tmtcif.format.formatPackage;
import es.uah.aut.srg.tmtcif.lang.format.services.FORMATGrammarAccess;
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
public class FORMATSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FORMATGrammarAccess grammarAccess;
	
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
		else if (epackage == formatPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case formatPackage.TMTCIF_FORMAT_AFIELD:
				sequence_TMTCIFFormatAField(context, (TMTCIFFormatAField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_AI_FIELD:
				sequence_TMTCIFFormatAIField(context, (TMTCIFFormatAIField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_ARRAY_DIMENSION:
				sequence_TMTCIFFormatArrayDimension(context, (TMTCIFFormatArrayDimension) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_ARRAY_REF:
				sequence_TMTCIFFormatArrayRef(context, (TMTCIFFormatArrayRef) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_BYTES_BITS:
				if (rule == grammarAccess.getTMTCIFFormatConstSizeRule()) {
					sequence_TMTCIFFormatConstSize(context, (TMTCIFFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTMTCIFFormatGlobalOffsetRule()) {
					sequence_TMTCIFFormatGlobalOffset(context, (TMTCIFFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTMTCIFFormatLocalOffsetRule()) {
					sequence_TMTCIFFormatLocalOffset(context, (TMTCIFFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTMTCIFFormatMaxSizeRule()) {
					sequence_TMTCIFFormatMaxSize(context, (TMTCIFFormatBytesBits) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTMTCIFFormatSizeRule()) {
					sequence_TMTCIFFormatSize(context, (TMTCIFFormatBytesBits) semanticObject); 
					return; 
				}
				else break;
			case formatPackage.TMTCIF_FORMAT_CS_FIELD:
				sequence_TMTCIFFormatCSField(context, (TMTCIFFormatCSField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_CS_FORMULA_FIELD:
				sequence_TMTCIFFormatCSFormulaField(context, (TMTCIFFormatCSFormulaField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_FDIC_FIELD:
				sequence_TMTCIFFormatFDICField(context, (TMTCIFFormatFDICField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_FIELD_TO_CHECK:
				sequence_TMTCIFFormatFieldToCheck(context, (TMTCIFFormatFieldToCheck) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_FLOATING_OFFSET:
				sequence_TMTCIFFormatFloatingOffset(context, (TMTCIFFormatFloatingOffset) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_FORMAT:
				sequence_TMTCIFFormatFormat(context, (TMTCIFFormatFormat) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_FORMULA:
				sequence_TMTCIFFormatFormula(context, (TMTCIFFormatFormula) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_SORTED_FIELDS_TO_CHECK:
				sequence_TMTCIFFormatSortedFieldsToCheck(context, (TMTCIFFormatSortedFieldsToCheck) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_VR_FIELD_SIZE:
				sequence_TMTCIFFormatVRFieldSize(context, (TMTCIFFormatVRFieldSize) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_VS_FIELD:
				sequence_TMTCIFFormatVSField(context, (TMTCIFFormatVSField) semanticObject); 
				return; 
			case formatPackage.TMTCIF_FORMAT_VARIABLE_SIZE:
				sequence_TMTCIFFormatVariableSize(context, (TMTCIFFormatVariableSize) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFFormatAField returns TMTCIFFormatAField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=TMTCIFFormatFieldType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         arrayDimension=TMTCIFFormatArrayDimension 
	 *         size=TMTCIFFormatSize 
	 *         globalOffset=TMTCIFFormatGlobalOffset
	 *     )
	 */
	protected void sequence_TMTCIFFormatAField(ISerializationContext context, TMTCIFFormatAField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatAIField returns TMTCIFFormatAIField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=TMTCIFFormatFieldType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         arrayRef=TMTCIFFormatArrayRef 
	 *         size=TMTCIFFormatSize 
	 *         localOffset=TMTCIFFormatLocalOffset
	 *     )
	 */
	protected void sequence_TMTCIFFormatAIField(ISerializationContext context, TMTCIFFormatAIField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatArrayDimension returns TMTCIFFormatArrayDimension
	 *
	 * Constraint:
	 *     (fidRef=INTEGER maxItems=INTEGER)
	 */
	protected void sequence_TMTCIFFormatArrayDimension(ISerializationContext context, TMTCIFFormatArrayDimension semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_DIMENSION__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_DIMENSION__FID_REF));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_DIMENSION__MAX_ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_DIMENSION__MAX_ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.accept(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0(), semanticObject.getMaxItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatArrayRef returns TMTCIFFormatArrayRef
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_TMTCIFFormatArrayRef(ISerializationContext context, TMTCIFFormatArrayRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_REF__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_ARRAY_REF__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatField returns TMTCIFFormatCSField
	 *     TMTCIFFormatCSField returns TMTCIFFormatCSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=TMTCIFFormatFieldType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         size=TMTCIFFormatSize 
	 *         globalOffset=TMTCIFFormatGlobalOffset
	 *     )
	 */
	protected void sequence_TMTCIFFormatCSField(ISerializationContext context, TMTCIFFormatCSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatField returns TMTCIFFormatCSFormulaField
	 *     TMTCIFFormatCSFormulaField returns TMTCIFFormatCSFormulaField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=TMTCIFFormatFieldType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         size=TMTCIFFormatSize 
	 *         globalOffset=TMTCIFFormatGlobalOffset 
	 *         formula=TMTCIFFormatFormula
	 *     )
	 */
	protected void sequence_TMTCIFFormatCSFormulaField(ISerializationContext context, TMTCIFFormatCSFormulaField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatConstSize returns TMTCIFFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_TMTCIFFormatConstSize(ISerializationContext context, TMTCIFFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatField returns TMTCIFFormatFDICField
	 *     TMTCIFFormatFDICField returns TMTCIFFormatFDICField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         checkType=TMTCIFFormatCheckType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         size=TMTCIFFormatSize 
	 *         floatingOffset=TMTCIFFormatFloatingOffset 
	 *         sortedFieldsToCheck=TMTCIFFormatSortedFieldsToCheck
	 *     )
	 */
	protected void sequence_TMTCIFFormatFDICField(ISerializationContext context, TMTCIFFormatFDICField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatFieldToCheck returns TMTCIFFormatFieldToCheck
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_TMTCIFFormatFieldToCheck(ISerializationContext context, TMTCIFFormatFieldToCheck semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD_TO_CHECK__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD_TO_CHECK__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatFloatingOffset returns TMTCIFFormatFloatingOffset
	 *
	 * Constraint:
	 *     fidRef=INTEGER
	 */
	protected void sequence_TMTCIFFormatFloatingOffset(ISerializationContext context, TMTCIFFormatFloatingOffset semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FLOATING_OFFSET__FID_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FLOATING_OFFSET__FID_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0(), semanticObject.getFidRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatFormat returns TMTCIFFormatFormat
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             ((uri=QualifiedName | version=Version | protocol=ID) (type=TMTCIFFormatFormatType CSField+=TMTCIFFormatCSField?)?)+ | 
	 *             (
	 *                 type=TMTCIFFormatFormatType 
	 *                 CSField+=TMTCIFFormatCSField? 
	 *                 (
	 *                     (
	 *                         type=TMTCIFFormatFormatType | 
	 *                         CSFormulaField+=TMTCIFFormatCSFormulaField | 
	 *                         VSField+=TMTCIFFormatVSField | 
	 *                         FDICField+=TMTCIFFormatFDICField | 
	 *                         VRFieldSize+=TMTCIFFormatVRFieldSize | 
	 *                         AField+=TMTCIFFormatAField | 
	 *                         AIField+=TMTCIFFormatAIField
	 *                     )? 
	 *                     CSField+=TMTCIFFormatCSField?
	 *                 )* 
	 *                 ((uri=QualifiedName | version=Version | protocol=ID) (type=TMTCIFFormatFormatType CSField+=TMTCIFFormatCSField?)?)+
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_TMTCIFFormatFormat(ISerializationContext context, TMTCIFFormatFormat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatFormula returns TMTCIFFormatFormula
	 *
	 * Constraint:
	 *     (slope=STRING intercept=STRING)
	 */
	protected void sequence_TMTCIFFormatFormula(ISerializationContext context, TMTCIFFormatFormula semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FORMULA__SLOPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FORMULA__SLOPE));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FORMULA__INTERCEPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FORMULA__INTERCEPT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0(), semanticObject.getSlope());
		feeder.accept(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0(), semanticObject.getIntercept());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatGlobalOffset returns TMTCIFFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_TMTCIFFormatGlobalOffset(ISerializationContext context, TMTCIFFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatLocalOffset returns TMTCIFFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_TMTCIFFormatLocalOffset(ISerializationContext context, TMTCIFFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatMaxSize returns TMTCIFFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_TMTCIFFormatMaxSize(ISerializationContext context, TMTCIFFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatSize returns TMTCIFFormatBytesBits
	 *
	 * Constraint:
	 *     (bytes=INTEGER bits=INTEGER)
	 */
	protected void sequence_TMTCIFFormatSize(ISerializationContext context, TMTCIFFormatBytesBits semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BYTES));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_BYTES_BITS__BITS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0(), semanticObject.getBytes());
		feeder.accept(grammarAccess.getTMTCIFFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatSortedFieldsToCheck returns TMTCIFFormatSortedFieldsToCheck
	 *
	 * Constraint:
	 *     fieldToCheck+=TMTCIFFormatFieldToCheck+
	 */
	protected void sequence_TMTCIFFormatSortedFieldsToCheck(ISerializationContext context, TMTCIFFormatSortedFieldsToCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatField returns TMTCIFFormatVRFieldSize
	 *     TMTCIFFormatVRFieldSize returns TMTCIFFormatVRFieldSize
	 *
	 * Constraint:
	 *     (fid=INTEGER pfid=INTEGER name=STRING)
	 */
	protected void sequence_TMTCIFFormatVRFieldSize(ISerializationContext context, TMTCIFFormatVRFieldSize semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD__FID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD__FID));
			if (transientValues.isValueTransient(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD__PFID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, formatPackage.Literals.TMTCIF_FORMAT_FIELD__PFID));
			if (transientValues.isValueTransient(semanticObject, commonPackage.Literals.TMTCIF_MODEL_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, commonPackage.Literals.TMTCIF_MODEL_OBJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0(), semanticObject.getFid());
		feeder.accept(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0(), semanticObject.getPfid());
		feeder.accept(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatField returns TMTCIFFormatVSField
	 *     TMTCIFFormatVSField returns TMTCIFFormatVSField
	 *
	 * Constraint:
	 *     (
	 *         fid=INTEGER 
	 *         pfid=INTEGER 
	 *         name=STRING 
	 *         description=STRING? 
	 *         type=TMTCIFFormatFieldType 
	 *         byteOrder=TMTCIFFormatFieldByteOrder 
	 *         firstBit=TMTCIFFormatSFieldFirstBit 
	 *         constSize=TMTCIFFormatConstSize 
	 *         variableSize=TMTCIFFormatVariableSize 
	 *         maxSize=TMTCIFFormatMaxSize 
	 *         globalOffset=TMTCIFFormatGlobalOffset
	 *     )
	 */
	protected void sequence_TMTCIFFormatVSField(ISerializationContext context, TMTCIFFormatVSField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFFormatVariableSize returns TMTCIFFormatVariableSize
	 *
	 * Constraint:
	 *     (fidRef=INTEGER unit=TMTCIFFormatUnit power=TMTCIFFormatPower?)
	 */
	protected void sequence_TMTCIFFormatVariableSize(ISerializationContext context, TMTCIFFormatVariableSize semanticObject) {
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
	 *     (imports+=TMTCIFModelFileImport* element=TMTCIFFormatFormat)
	 */
	protected void sequence_TMTCIFModelFile(ISerializationContext context, TMTCIFModelFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
