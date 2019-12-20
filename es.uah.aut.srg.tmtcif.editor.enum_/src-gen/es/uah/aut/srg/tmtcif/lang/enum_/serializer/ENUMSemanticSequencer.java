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
package es.uah.aut.srg.tmtcif.lang.enum_.serializer;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnum;
import es.uah.aut.srg.tmtcif.enum_.TMTCIFEnumValue;
import es.uah.aut.srg.tmtcif.enum_.enumPackage;
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;
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
public class ENUMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ENUMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == enumPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case enumPackage.TMTCIF_ENUM:
				sequence_TMTCIFEnum(context, (TMTCIFEnum) semanticObject); 
				return; 
			case enumPackage.TMTCIF_ENUM_VALUE:
				sequence_TMTCIFEnumValue(context, (TMTCIFEnumValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TMTCIFEnumValue returns TMTCIFEnumValue
	 *
	 * Constraint:
	 *     (name=STRING raw=INTEGER)
	 */
	protected void sequence_TMTCIFEnumValue(ISerializationContext context, TMTCIFEnumValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, enumPackage.Literals.TMTCIF_ENUM_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, enumPackage.Literals.TMTCIF_ENUM_VALUE__NAME));
			if (transientValues.isValueTransient(semanticObject, enumPackage.Literals.TMTCIF_ENUM_VALUE__RAW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, enumPackage.Literals.TMTCIF_ENUM_VALUE__RAW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0(), semanticObject.getRaw());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TMTCIFEnum returns TMTCIFEnum
	 *
	 * Constraint:
	 *     (name=STRING values+=TMTCIFEnumValue+)
	 */
	protected void sequence_TMTCIFEnum(ISerializationContext context, TMTCIFEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
