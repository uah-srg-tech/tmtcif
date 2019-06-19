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
grammar InternalFORMAT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.format.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.format.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import es.uah.aut.srg.tmtcif.lang.format.services.FORMATGrammarAccess;

}
@parser::members {
	private FORMATGrammarAccess grammarAccess;

	public void setGrammarAccess(FORMATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleTMTCIFModelFile
entryRuleTMTCIFModelFile
:
{ before(grammarAccess.getTMTCIFModelFileRule()); }
	 ruleTMTCIFModelFile
{ after(grammarAccess.getTMTCIFModelFileRule()); } 
	 EOF 
;

// Rule TMTCIFModelFile
ruleTMTCIFModelFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFModelFileAccess().getGroup()); }
		(rule__TMTCIFModelFile__Group__0)
		{ after(grammarAccess.getTMTCIFModelFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFModelFileImport
entryRuleTMTCIFModelFileImport
:
{ before(grammarAccess.getTMTCIFModelFileImportRule()); }
	 ruleTMTCIFModelFileImport
{ after(grammarAccess.getTMTCIFModelFileImportRule()); } 
	 EOF 
;

// Rule TMTCIFModelFileImport
ruleTMTCIFModelFileImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); }
		(rule__TMTCIFModelFileImport__Group__0)
		{ after(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatFormat
entryRuleTMTCIFFormatFormat
:
{ before(grammarAccess.getTMTCIFFormatFormatRule()); }
	 ruleTMTCIFFormatFormat
{ after(grammarAccess.getTMTCIFFormatFormatRule()); } 
	 EOF 
;

// Rule TMTCIFFormatFormat
ruleTMTCIFFormatFormat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup()); }
		(rule__TMTCIFFormatFormat__Group__0)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatCSField
entryRuleTMTCIFFormatCSField
:
{ before(grammarAccess.getTMTCIFFormatCSFieldRule()); }
	 ruleTMTCIFFormatCSField
{ after(grammarAccess.getTMTCIFFormatCSFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatCSField
ruleTMTCIFFormatCSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup()); }
		(rule__TMTCIFFormatCSField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatCSFormulaField
entryRuleTMTCIFFormatCSFormulaField
:
{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldRule()); }
	 ruleTMTCIFFormatCSFormulaField
{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatCSFormulaField
ruleTMTCIFFormatCSFormulaField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup()); }
		(rule__TMTCIFFormatCSFormulaField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatVSField
entryRuleTMTCIFFormatVSField
:
{ before(grammarAccess.getTMTCIFFormatVSFieldRule()); }
	 ruleTMTCIFFormatVSField
{ after(grammarAccess.getTMTCIFFormatVSFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatVSField
ruleTMTCIFFormatVSField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup()); }
		(rule__TMTCIFFormatVSField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatVRFieldSize
entryRuleTMTCIFFormatVRFieldSize
:
{ before(grammarAccess.getTMTCIFFormatVRFieldSizeRule()); }
	 ruleTMTCIFFormatVRFieldSize
{ after(grammarAccess.getTMTCIFFormatVRFieldSizeRule()); } 
	 EOF 
;

// Rule TMTCIFFormatVRFieldSize
ruleTMTCIFFormatVRFieldSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getGroup()); }
		(rule__TMTCIFFormatVRFieldSize__Group__0)
		{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatFDICField
entryRuleTMTCIFFormatFDICField
:
{ before(grammarAccess.getTMTCIFFormatFDICFieldRule()); }
	 ruleTMTCIFFormatFDICField
{ after(grammarAccess.getTMTCIFFormatFDICFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatFDICField
ruleTMTCIFFormatFDICField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup()); }
		(rule__TMTCIFFormatFDICField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatAField
entryRuleTMTCIFFormatAField
:
{ before(grammarAccess.getTMTCIFFormatAFieldRule()); }
	 ruleTMTCIFFormatAField
{ after(grammarAccess.getTMTCIFFormatAFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatAField
ruleTMTCIFFormatAField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup()); }
		(rule__TMTCIFFormatAField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatAIField
entryRuleTMTCIFFormatAIField
:
{ before(grammarAccess.getTMTCIFFormatAIFieldRule()); }
	 ruleTMTCIFFormatAIField
{ after(grammarAccess.getTMTCIFFormatAIFieldRule()); } 
	 EOF 
;

// Rule TMTCIFFormatAIField
ruleTMTCIFFormatAIField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup()); }
		(rule__TMTCIFFormatAIField__Group__0)
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatSize
entryRuleTMTCIFFormatSize
:
{ before(grammarAccess.getTMTCIFFormatSizeRule()); }
	 ruleTMTCIFFormatSize
{ after(grammarAccess.getTMTCIFFormatSizeRule()); } 
	 EOF 
;

// Rule TMTCIFFormatSize
ruleTMTCIFFormatSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatSizeAccess().getGroup()); }
		(rule__TMTCIFFormatSize__Group__0)
		{ after(grammarAccess.getTMTCIFFormatSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatGlobalOffset
entryRuleTMTCIFFormatGlobalOffset
:
{ before(grammarAccess.getTMTCIFFormatGlobalOffsetRule()); }
	 ruleTMTCIFFormatGlobalOffset
{ after(grammarAccess.getTMTCIFFormatGlobalOffsetRule()); } 
	 EOF 
;

// Rule TMTCIFFormatGlobalOffset
ruleTMTCIFFormatGlobalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getGroup()); }
		(rule__TMTCIFFormatGlobalOffset__Group__0)
		{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatFormula
entryRuleTMTCIFFormatFormula
:
{ before(grammarAccess.getTMTCIFFormatFormulaRule()); }
	 ruleTMTCIFFormatFormula
{ after(grammarAccess.getTMTCIFFormatFormulaRule()); } 
	 EOF 
;

// Rule TMTCIFFormatFormula
ruleTMTCIFFormatFormula 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getGroup()); }
		(rule__TMTCIFFormatFormula__Group__0)
		{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatConstSize
entryRuleTMTCIFFormatConstSize
:
{ before(grammarAccess.getTMTCIFFormatConstSizeRule()); }
	 ruleTMTCIFFormatConstSize
{ after(grammarAccess.getTMTCIFFormatConstSizeRule()); } 
	 EOF 
;

// Rule TMTCIFFormatConstSize
ruleTMTCIFFormatConstSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getGroup()); }
		(rule__TMTCIFFormatConstSize__Group__0)
		{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatMaxSize
entryRuleTMTCIFFormatMaxSize
:
{ before(grammarAccess.getTMTCIFFormatMaxSizeRule()); }
	 ruleTMTCIFFormatMaxSize
{ after(grammarAccess.getTMTCIFFormatMaxSizeRule()); } 
	 EOF 
;

// Rule TMTCIFFormatMaxSize
ruleTMTCIFFormatMaxSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getGroup()); }
		(rule__TMTCIFFormatMaxSize__Group__0)
		{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatVariableSize
entryRuleTMTCIFFormatVariableSize
:
{ before(grammarAccess.getTMTCIFFormatVariableSizeRule()); }
	 ruleTMTCIFFormatVariableSize
{ after(grammarAccess.getTMTCIFFormatVariableSizeRule()); } 
	 EOF 
;

// Rule TMTCIFFormatVariableSize
ruleTMTCIFFormatVariableSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup()); }
		(rule__TMTCIFFormatVariableSize__Group__0)
		{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatFloatingOffset
entryRuleTMTCIFFormatFloatingOffset
:
{ before(grammarAccess.getTMTCIFFormatFloatingOffsetRule()); }
	 ruleTMTCIFFormatFloatingOffset
{ after(grammarAccess.getTMTCIFFormatFloatingOffsetRule()); } 
	 EOF 
;

// Rule TMTCIFFormatFloatingOffset
ruleTMTCIFFormatFloatingOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getGroup()); }
		(rule__TMTCIFFormatFloatingOffset__Group__0)
		{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatSortedFieldsToCheck
entryRuleTMTCIFFormatSortedFieldsToCheck
:
{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule()); }
	 ruleTMTCIFFormatSortedFieldsToCheck
{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule()); } 
	 EOF 
;

// Rule TMTCIFFormatSortedFieldsToCheck
ruleTMTCIFFormatSortedFieldsToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getGroup()); }
		(rule__TMTCIFFormatSortedFieldsToCheck__Group__0)
		{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatFieldToCheck
entryRuleTMTCIFFormatFieldToCheck
:
{ before(grammarAccess.getTMTCIFFormatFieldToCheckRule()); }
	 ruleTMTCIFFormatFieldToCheck
{ after(grammarAccess.getTMTCIFFormatFieldToCheckRule()); } 
	 EOF 
;

// Rule TMTCIFFormatFieldToCheck
ruleTMTCIFFormatFieldToCheck 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getGroup()); }
		(rule__TMTCIFFormatFieldToCheck__Group__0)
		{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatArrayDimension
entryRuleTMTCIFFormatArrayDimension
:
{ before(grammarAccess.getTMTCIFFormatArrayDimensionRule()); }
	 ruleTMTCIFFormatArrayDimension
{ after(grammarAccess.getTMTCIFFormatArrayDimensionRule()); } 
	 EOF 
;

// Rule TMTCIFFormatArrayDimension
ruleTMTCIFFormatArrayDimension 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getGroup()); }
		(rule__TMTCIFFormatArrayDimension__Group__0)
		{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatLocalOffset
entryRuleTMTCIFFormatLocalOffset
:
{ before(grammarAccess.getTMTCIFFormatLocalOffsetRule()); }
	 ruleTMTCIFFormatLocalOffset
{ after(grammarAccess.getTMTCIFFormatLocalOffsetRule()); } 
	 EOF 
;

// Rule TMTCIFFormatLocalOffset
ruleTMTCIFFormatLocalOffset 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getGroup()); }
		(rule__TMTCIFFormatLocalOffset__Group__0)
		{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFormatArrayRef
entryRuleTMTCIFFormatArrayRef
:
{ before(grammarAccess.getTMTCIFFormatArrayRefRule()); }
	 ruleTMTCIFFormatArrayRef
{ after(grammarAccess.getTMTCIFFormatArrayRefRule()); } 
	 EOF 
;

// Rule TMTCIFFormatArrayRef
ruleTMTCIFFormatArrayRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getGroup()); }
		(rule__TMTCIFFormatArrayRef__Group__0)
		{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersion
entryRuleVersion
:
{ before(grammarAccess.getVersionRule()); }
	 ruleVersion
{ after(grammarAccess.getVersionRule()); } 
	 EOF 
;

// Rule Version
ruleVersion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionAccess().getGroup()); }
		(rule__Version__Group__0)
		{ after(grammarAccess.getVersionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINTEGER
entryRuleINTEGER
:
{ before(grammarAccess.getINTEGERRule()); }
	 ruleINTEGER
{ after(grammarAccess.getINTEGERRule()); } 
	 EOF 
;

// Rule INTEGER
ruleINTEGER 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINTEGERAccess().getAlternatives()); }
		(rule__INTEGER__Alternatives)
		{ after(grammarAccess.getINTEGERAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatFormatType
ruleTMTCIFFormatFormatType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatTypeAccess().getAlternatives()); }
		(rule__TMTCIFFormatFormatType__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatFormatTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatFieldType
ruleTMTCIFFormatFieldType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getAlternatives()); }
		(rule__TMTCIFFormatFieldType__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatFieldByteOrder
ruleTMTCIFFormatFieldByteOrder
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getAlternatives()); }
		(rule__TMTCIFFormatFieldByteOrder__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatSFieldFirstBit
ruleTMTCIFFormatSFieldFirstBit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getAlternatives()); }
		(rule__TMTCIFFormatSFieldFirstBit__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatUnit
ruleTMTCIFFormatUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getAlternatives()); }
		(rule__TMTCIFFormatUnit__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatPower
ruleTMTCIFFormatPower
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatPowerAccess().getAlternatives()); }
		(rule__TMTCIFFormatPower__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatPowerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFormatCheckType
ruleTMTCIFFormatCheckType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCheckTypeAccess().getAlternatives()); }
		(rule__TMTCIFFormatCheckType__Alternatives)
		{ after(grammarAccess.getTMTCIFFormatCheckTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Alternatives_3_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldAssignment_3_3_1_0()); }
		(rule__TMTCIFFormatFormat__CSFieldAssignment_3_3_1_0)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldAssignment_3_3_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldAssignment_3_3_1_1()); }
		(rule__TMTCIFFormatFormat__CSFormulaFieldAssignment_3_3_1_1)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldAssignment_3_3_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldAssignment_3_3_1_2()); }
		(rule__TMTCIFFormatFormat__VSFieldAssignment_3_3_1_2)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldAssignment_3_3_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldAssignment_3_3_1_3()); }
		(rule__TMTCIFFormatFormat__FDICFieldAssignment_3_3_1_3)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldAssignment_3_3_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeAssignment_3_3_1_4()); }
		(rule__TMTCIFFormatFormat__VRFieldSizeAssignment_3_3_1_4)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeAssignment_3_3_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldAssignment_3_3_1_5()); }
		(rule__TMTCIFFormatFormat__AFieldAssignment_3_3_1_5)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldAssignment_3_3_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldAssignment_3_3_1_6()); }
		(rule__TMTCIFFormatFormat__AIFieldAssignment_3_3_1_6)
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldAssignment_3_3_1_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_0_1()); }
		(rule__Version__Group_0_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
		(rule__Version__Group_1_1_1__0)
		{ after(grammarAccess.getVersionAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINTEGERAccess().getGroup_0()); }
		(rule__INTEGER__Group_0__0)
		{ after(grammarAccess.getINTEGERAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormatType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
		('TM')
		{ after(grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
		('TC')
		{ after(grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
		('structured')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
		('uint')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
		('flag')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
		('enumerated')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
		('bit_vector')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
		('byte_vector')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
		('float')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
		('deduced')
		{ after(grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldByteOrder__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
		('big_endian')
		{ after(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
		('little_endian')
		{ after(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
		('na')
		{ after(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSFieldFirstBit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
		('MSB')
		{ after(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
		('LSB')
		{ after(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
		('bytes')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
		('bits')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
		('halfword')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
		('string10')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
		('string17')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
		('string69')
		{ after(grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatPower__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
		('2bits')
		{ after(grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
		('2bits_with_0')
		{ after(grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCheckType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
		('crc16')
		{ after(grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
		('checksum16')
		{ after(grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFile__Group__0__Impl
	rule__TMTCIFModelFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); }
	(rule__TMTCIFModelFile__ImportsAssignment_0)*
	{ after(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFile__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); }
	(rule__TMTCIFModelFile__ElementAssignment_1)
	{ after(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFModelFileImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFileImport__Group__0__Impl
	rule__TMTCIFModelFileImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFileImport__Group__1__Impl
	rule__TMTCIFModelFileImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1()); }
	':='
	{ after(grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFileImport__Group__2__Impl
	rule__TMTCIFModelFileImport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); }
	(rule__TMTCIFModelFileImport__ImportURIAssignment_2)
	{ after(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFModelFileImport__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__0__Impl
	rule__TMTCIFFormatFormat__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getTMTCIFFormatFormatKeyword_0()); }
	'TMTCIFFormatFormat'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getTMTCIFFormatFormatKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__1__Impl
	rule__TMTCIFFormatFormat__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getNameAssignment_1()); }
	(rule__TMTCIFFormatFormat__NameAssignment_1)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__2__Impl
	rule__TMTCIFFormatFormat__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__3__Impl
	rule__TMTCIFFormatFormat__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()); }
	(rule__TMTCIFFormatFormat__UnorderedGroup_3)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__4__Impl
	rule__TMTCIFFormatFormat__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_0__0__Impl
	rule__TMTCIFFormatFormat__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_0__1__Impl
	rule__TMTCIFFormatFormat__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_0__2__Impl
	rule__TMTCIFFormatFormat__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getUriAssignment_3_0_2()); }
	(rule__TMTCIFFormatFormat__UriAssignment_3_0_2)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_1__0__Impl
	rule__TMTCIFFormatFormat__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_1__1__Impl
	rule__TMTCIFFormatFormat__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_1__2__Impl
	rule__TMTCIFFormatFormat__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVersionAssignment_3_1_2()); }
	(rule__TMTCIFFormatFormat__VersionAssignment_3_1_2)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_2__0__Impl
	rule__TMTCIFFormatFormat__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolKeyword_3_2_0()); }
	'protocol'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_2__1__Impl
	rule__TMTCIFFormatFormat__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_2_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_2__2__Impl
	rule__TMTCIFFormatFormat__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolAssignment_3_2_2()); }
	(rule__TMTCIFFormatFormat__ProtocolAssignment_3_2_2)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolAssignment_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_2_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3__0__Impl
	rule__TMTCIFFormatFormat__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3_0()); }
	(rule__TMTCIFFormatFormat__Group_3_3_0__0)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getAlternatives_3_3_1()); }
	(rule__TMTCIFFormatFormat__Alternatives_3_3_1)*
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getAlternatives_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__Group_3_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3_0__0__Impl
	rule__TMTCIFFormatFormat__Group_3_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getTypeKeyword_3_3_0_0()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getTypeKeyword_3_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3_0__1__Impl
	rule__TMTCIFFormatFormat__Group_3_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3_0__2__Impl
	rule__TMTCIFFormatFormat__Group_3_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getTypeAssignment_3_3_0_2()); }
	(rule__TMTCIFFormatFormat__TypeAssignment_3_3_0_2)
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getTypeAssignment_3_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__Group_3_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__Group_3_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatCSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__0__Impl
	rule__TMTCIFFormatCSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getTMTCIFFormatCSFieldKeyword_0()); }
	'TMTCIFFormatCSField'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getTMTCIFFormatCSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__1__Impl
	rule__TMTCIFFormatCSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__2__Impl
	rule__TMTCIFFormatCSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__3__Impl
	rule__TMTCIFFormatCSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__4__Impl
	rule__TMTCIFFormatCSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatCSField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__5__Impl
	rule__TMTCIFFormatCSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__6__Impl
	rule__TMTCIFFormatCSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__7__Impl
	rule__TMTCIFFormatCSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__8__Impl
	rule__TMTCIFFormatCSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatCSField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__9__Impl
	rule__TMTCIFFormatCSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__10__Impl
	rule__TMTCIFFormatCSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__11__Impl
	rule__TMTCIFFormatCSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__12__Impl
	rule__TMTCIFFormatCSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatCSField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__13__Impl
	rule__TMTCIFFormatCSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__14__Impl
	rule__TMTCIFFormatCSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatCSField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__15__Impl
	rule__TMTCIFFormatCSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__16__Impl
	rule__TMTCIFFormatCSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__17__Impl
	rule__TMTCIFFormatCSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeAssignment_17()); }
	(rule__TMTCIFFormatCSField__TypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__18__Impl
	rule__TMTCIFFormatCSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__19__Impl
	rule__TMTCIFFormatCSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__20__Impl
	rule__TMTCIFFormatCSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__21__Impl
	rule__TMTCIFFormatCSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatCSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__22__Impl
	rule__TMTCIFFormatCSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__23__Impl
	rule__TMTCIFFormatCSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__24__Impl
	rule__TMTCIFFormatCSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__25__Impl
	rule__TMTCIFFormatCSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatCSField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__26__Impl
	rule__TMTCIFFormatCSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__27__Impl
	rule__TMTCIFFormatCSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeAssignment_27()); }
	(rule__TMTCIFFormatCSField__SizeAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__28__Impl
	rule__TMTCIFFormatCSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__TMTCIFFormatCSField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__29__Impl
	rule__TMTCIFFormatCSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getRightCurlyBracketKeyword_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group__30__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_30()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatCSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group_14__0__Impl
	rule__TMTCIFFormatCSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group_14__1__Impl
	rule__TMTCIFFormatCSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group_14__2__Impl
	rule__TMTCIFFormatCSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatCSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatCSFormulaField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__0__Impl
	rule__TMTCIFFormatCSFormulaField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTMTCIFFormatCSFormulaFieldKeyword_0()); }
	'TMTCIFFormatCSFormulaField'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTMTCIFFormatCSFormulaFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__1__Impl
	rule__TMTCIFFormatCSFormulaField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__2__Impl
	rule__TMTCIFFormatCSFormulaField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__3__Impl
	rule__TMTCIFFormatCSFormulaField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__4__Impl
	rule__TMTCIFFormatCSFormulaField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatCSFormulaField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__5__Impl
	rule__TMTCIFFormatCSFormulaField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__6__Impl
	rule__TMTCIFFormatCSFormulaField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__7__Impl
	rule__TMTCIFFormatCSFormulaField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__8__Impl
	rule__TMTCIFFormatCSFormulaField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatCSFormulaField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__9__Impl
	rule__TMTCIFFormatCSFormulaField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__10__Impl
	rule__TMTCIFFormatCSFormulaField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__11__Impl
	rule__TMTCIFFormatCSFormulaField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__12__Impl
	rule__TMTCIFFormatCSFormulaField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatCSFormulaField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__13__Impl
	rule__TMTCIFFormatCSFormulaField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__14__Impl
	rule__TMTCIFFormatCSFormulaField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatCSFormulaField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__15__Impl
	rule__TMTCIFFormatCSFormulaField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__16__Impl
	rule__TMTCIFFormatCSFormulaField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__17__Impl
	rule__TMTCIFFormatCSFormulaField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
	(rule__TMTCIFFormatCSFormulaField__TypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__18__Impl
	rule__TMTCIFFormatCSFormulaField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__19__Impl
	rule__TMTCIFFormatCSFormulaField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__20__Impl
	rule__TMTCIFFormatCSFormulaField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__21__Impl
	rule__TMTCIFFormatCSFormulaField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatCSFormulaField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__22__Impl
	rule__TMTCIFFormatCSFormulaField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__23__Impl
	rule__TMTCIFFormatCSFormulaField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__24__Impl
	rule__TMTCIFFormatCSFormulaField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__25__Impl
	rule__TMTCIFFormatCSFormulaField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatCSFormulaField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__26__Impl
	rule__TMTCIFFormatCSFormulaField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__27__Impl
	rule__TMTCIFFormatCSFormulaField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
	(rule__TMTCIFFormatCSFormulaField__SizeAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__28__Impl
	rule__TMTCIFFormatCSFormulaField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
	(rule__TMTCIFFormatCSFormulaField__GlobalOffsetAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__29__Impl
	rule__TMTCIFFormatCSFormulaField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
	(rule__TMTCIFFormatCSFormulaField__FormulaAssignment_29)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__30__Impl
	rule__TMTCIFFormatCSFormulaField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatCSFormulaField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group_14__0__Impl
	rule__TMTCIFFormatCSFormulaField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group_14__1__Impl
	rule__TMTCIFFormatCSFormulaField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group_14__2__Impl
	rule__TMTCIFFormatCSFormulaField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatCSFormulaField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatCSFormulaField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatVSField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__0__Impl
	rule__TMTCIFFormatVSField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getTMTCIFFormatVSFieldKeyword_0()); }
	'TMTCIFFormatVSField'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getTMTCIFFormatVSFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__1__Impl
	rule__TMTCIFFormatVSField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__2__Impl
	rule__TMTCIFFormatVSField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__3__Impl
	rule__TMTCIFFormatVSField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__4__Impl
	rule__TMTCIFFormatVSField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatVSField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__5__Impl
	rule__TMTCIFFormatVSField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__6__Impl
	rule__TMTCIFFormatVSField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__7__Impl
	rule__TMTCIFFormatVSField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__8__Impl
	rule__TMTCIFFormatVSField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatVSField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__9__Impl
	rule__TMTCIFFormatVSField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__10__Impl
	rule__TMTCIFFormatVSField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__11__Impl
	rule__TMTCIFFormatVSField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__12__Impl
	rule__TMTCIFFormatVSField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatVSField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__13__Impl
	rule__TMTCIFFormatVSField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__14__Impl
	rule__TMTCIFFormatVSField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatVSField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__15__Impl
	rule__TMTCIFFormatVSField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__16__Impl
	rule__TMTCIFFormatVSField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__17__Impl
	rule__TMTCIFFormatVSField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeAssignment_17()); }
	(rule__TMTCIFFormatVSField__TypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__18__Impl
	rule__TMTCIFFormatVSField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__19__Impl
	rule__TMTCIFFormatVSField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__20__Impl
	rule__TMTCIFFormatVSField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__21__Impl
	rule__TMTCIFFormatVSField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatVSField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__22__Impl
	rule__TMTCIFFormatVSField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__23__Impl
	rule__TMTCIFFormatVSField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__24__Impl
	rule__TMTCIFFormatVSField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__25__Impl
	rule__TMTCIFFormatVSField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatVSField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__26__Impl
	rule__TMTCIFFormatVSField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__27__Impl
	rule__TMTCIFFormatVSField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeAssignment_27()); }
	(rule__TMTCIFFormatVSField__ConstSizeAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__28__Impl
	rule__TMTCIFFormatVSField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeAssignment_28()); }
	(rule__TMTCIFFormatVSField__VariableSizeAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__29__Impl
	rule__TMTCIFFormatVSField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeAssignment_29()); }
	(rule__TMTCIFFormatVSField__MaxSizeAssignment_29)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__30__Impl
	rule__TMTCIFFormatVSField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetAssignment_30()); }
	(rule__TMTCIFFormatVSField__GlobalOffsetAssignment_30)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetAssignment_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__31__Impl
	rule__TMTCIFFormatVSField__Group__32
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getRightCurlyBracketKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__32
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group__32__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group__32__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_32()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_32()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatVSField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group_14__0__Impl
	rule__TMTCIFFormatVSField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group_14__1__Impl
	rule__TMTCIFFormatVSField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group_14__2__Impl
	rule__TMTCIFFormatVSField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatVSField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVSField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatVRFieldSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__0__Impl
	rule__TMTCIFFormatVRFieldSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getTMTCIFFormatVRFieldSizeKeyword_0()); }
	'TMTCIFFormatVRFieldSize'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getTMTCIFFormatVRFieldSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__1__Impl
	rule__TMTCIFFormatVRFieldSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__2__Impl
	rule__TMTCIFFormatVRFieldSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__3__Impl
	rule__TMTCIFFormatVRFieldSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__4__Impl
	rule__TMTCIFFormatVRFieldSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatVRFieldSize__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__5__Impl
	rule__TMTCIFFormatVRFieldSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__6__Impl
	rule__TMTCIFFormatVRFieldSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__7__Impl
	rule__TMTCIFFormatVRFieldSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__8__Impl
	rule__TMTCIFFormatVRFieldSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatVRFieldSize__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__9__Impl
	rule__TMTCIFFormatVRFieldSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__10__Impl
	rule__TMTCIFFormatVRFieldSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__11__Impl
	rule__TMTCIFFormatVRFieldSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__12__Impl
	rule__TMTCIFFormatVRFieldSize__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatVRFieldSize__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__13__Impl
	rule__TMTCIFFormatVRFieldSize__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__14__Impl
	rule__TMTCIFFormatVRFieldSize__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVRFieldSize__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFDICField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__0__Impl
	rule__TMTCIFFormatFDICField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getTMTCIFFormatFDICFieldKeyword_0()); }
	'TMTCIFFormatFDICField'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getTMTCIFFormatFDICFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__1__Impl
	rule__TMTCIFFormatFDICField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__2__Impl
	rule__TMTCIFFormatFDICField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__3__Impl
	rule__TMTCIFFormatFDICField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__4__Impl
	rule__TMTCIFFormatFDICField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatFDICField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__5__Impl
	rule__TMTCIFFormatFDICField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__6__Impl
	rule__TMTCIFFormatFDICField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__7__Impl
	rule__TMTCIFFormatFDICField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__8__Impl
	rule__TMTCIFFormatFDICField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatFDICField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__9__Impl
	rule__TMTCIFFormatFDICField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__10__Impl
	rule__TMTCIFFormatFDICField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__11__Impl
	rule__TMTCIFFormatFDICField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__12__Impl
	rule__TMTCIFFormatFDICField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatFDICField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__13__Impl
	rule__TMTCIFFormatFDICField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__14__Impl
	rule__TMTCIFFormatFDICField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatFDICField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__15__Impl
	rule__TMTCIFFormatFDICField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
	'checkType'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__16__Impl
	rule__TMTCIFFormatFDICField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__17__Impl
	rule__TMTCIFFormatFDICField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
	(rule__TMTCIFFormatFDICField__CheckTypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__18__Impl
	rule__TMTCIFFormatFDICField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__19__Impl
	rule__TMTCIFFormatFDICField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__20__Impl
	rule__TMTCIFFormatFDICField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__21__Impl
	rule__TMTCIFFormatFDICField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatFDICField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__22__Impl
	rule__TMTCIFFormatFDICField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__23__Impl
	rule__TMTCIFFormatFDICField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__24__Impl
	rule__TMTCIFFormatFDICField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__25__Impl
	rule__TMTCIFFormatFDICField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatFDICField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__26__Impl
	rule__TMTCIFFormatFDICField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__27__Impl
	rule__TMTCIFFormatFDICField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeAssignment_27()); }
	(rule__TMTCIFFormatFDICField__SizeAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__28__Impl
	rule__TMTCIFFormatFDICField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
	(rule__TMTCIFFormatFDICField__FloatingOffsetAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__29__Impl
	rule__TMTCIFFormatFDICField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
	(rule__TMTCIFFormatFDICField__SortedFieldsToCheckAssignment_29)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__30__Impl
	rule__TMTCIFFormatFDICField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFDICField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group_14__0__Impl
	rule__TMTCIFFormatFDICField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group_14__1__Impl
	rule__TMTCIFFormatFDICField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group_14__2__Impl
	rule__TMTCIFFormatFDICField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatFDICField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFDICField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatAField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__0__Impl
	rule__TMTCIFFormatAField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getTMTCIFFormatAFieldKeyword_0()); }
	'TMTCIFFormatAField'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getTMTCIFFormatAFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__1__Impl
	rule__TMTCIFFormatAField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__2__Impl
	rule__TMTCIFFormatAField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__3__Impl
	rule__TMTCIFFormatAField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__4__Impl
	rule__TMTCIFFormatAField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatAField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__5__Impl
	rule__TMTCIFFormatAField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__6__Impl
	rule__TMTCIFFormatAField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__7__Impl
	rule__TMTCIFFormatAField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__8__Impl
	rule__TMTCIFFormatAField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatAField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__9__Impl
	rule__TMTCIFFormatAField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__10__Impl
	rule__TMTCIFFormatAField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__11__Impl
	rule__TMTCIFFormatAField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__12__Impl
	rule__TMTCIFFormatAField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatAField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__13__Impl
	rule__TMTCIFFormatAField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__14__Impl
	rule__TMTCIFFormatAField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatAField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__15__Impl
	rule__TMTCIFFormatAField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__16__Impl
	rule__TMTCIFFormatAField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__17__Impl
	rule__TMTCIFFormatAField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeAssignment_17()); }
	(rule__TMTCIFFormatAField__TypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__18__Impl
	rule__TMTCIFFormatAField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__19__Impl
	rule__TMTCIFFormatAField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__20__Impl
	rule__TMTCIFFormatAField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__21__Impl
	rule__TMTCIFFormatAField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatAField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__22__Impl
	rule__TMTCIFFormatAField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__23__Impl
	rule__TMTCIFFormatAField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__24__Impl
	rule__TMTCIFFormatAField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__25__Impl
	rule__TMTCIFFormatAField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatAField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__26__Impl
	rule__TMTCIFFormatAField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__27__Impl
	rule__TMTCIFFormatAField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionAssignment_27()); }
	(rule__TMTCIFFormatAField__ArrayDimensionAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__28__Impl
	rule__TMTCIFFormatAField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeAssignment_28()); }
	(rule__TMTCIFFormatAField__SizeAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__29__Impl
	rule__TMTCIFFormatAField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetAssignment_29()); }
	(rule__TMTCIFFormatAField__GlobalOffsetAssignment_29)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__30__Impl
	rule__TMTCIFFormatAField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatAField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group_14__0__Impl
	rule__TMTCIFFormatAField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group_14__1__Impl
	rule__TMTCIFFormatAField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group_14__2__Impl
	rule__TMTCIFFormatAField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatAField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatAIField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__0__Impl
	rule__TMTCIFFormatAIField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getTMTCIFFormatAIFieldKeyword_0()); }
	'TMTCIFFormatAIField'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getTMTCIFFormatAIFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__1__Impl
	rule__TMTCIFFormatAIField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__2__Impl
	rule__TMTCIFFormatAIField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidKeyword_2()); }
	'fid'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__3__Impl
	rule__TMTCIFFormatAIField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__4__Impl
	rule__TMTCIFFormatAIField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidAssignment_4()); }
	(rule__TMTCIFFormatAIField__FidAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__5__Impl
	rule__TMTCIFFormatAIField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__6__Impl
	rule__TMTCIFFormatAIField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidKeyword_6()); }
	'pfid'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__7__Impl
	rule__TMTCIFFormatAIField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__8__Impl
	rule__TMTCIFFormatAIField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidAssignment_8()); }
	(rule__TMTCIFFormatAIField__PfidAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__9__Impl
	rule__TMTCIFFormatAIField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__10__Impl
	rule__TMTCIFFormatAIField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameKeyword_10()); }
	'name'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__11__Impl
	rule__TMTCIFFormatAIField__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__12__Impl
	rule__TMTCIFFormatAIField__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameAssignment_12()); }
	(rule__TMTCIFFormatAIField__NameAssignment_12)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__13__Impl
	rule__TMTCIFFormatAIField__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__14__Impl
	rule__TMTCIFFormatAIField__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup_14()); }
	(rule__TMTCIFFormatAIField__Group_14__0)?
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__15__Impl
	rule__TMTCIFFormatAIField__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeKeyword_15()); }
	'type'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__16__Impl
	rule__TMTCIFFormatAIField__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__17__Impl
	rule__TMTCIFFormatAIField__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeAssignment_17()); }
	(rule__TMTCIFFormatAIField__TypeAssignment_17)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__18__Impl
	rule__TMTCIFFormatAIField__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__19__Impl
	rule__TMTCIFFormatAIField__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderKeyword_19()); }
	'byteOrder'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__20__Impl
	rule__TMTCIFFormatAIField__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__21__Impl
	rule__TMTCIFFormatAIField__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderAssignment_21()); }
	(rule__TMTCIFFormatAIField__ByteOrderAssignment_21)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__22__Impl
	rule__TMTCIFFormatAIField__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_22()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__23__Impl
	rule__TMTCIFFormatAIField__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitKeyword_23()); }
	'firstBit'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__24__Impl
	rule__TMTCIFFormatAIField__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__25__Impl
	rule__TMTCIFFormatAIField__Group__26
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitAssignment_25()); }
	(rule__TMTCIFFormatAIField__FirstBitAssignment_25)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitAssignment_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__26
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__26__Impl
	rule__TMTCIFFormatAIField__Group__27
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__26__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_26()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_26()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__27
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__27__Impl
	rule__TMTCIFFormatAIField__Group__28
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__27__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefAssignment_27()); }
	(rule__TMTCIFFormatAIField__ArrayRefAssignment_27)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefAssignment_27()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__28
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__28__Impl
	rule__TMTCIFFormatAIField__Group__29
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__28__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeAssignment_28()); }
	(rule__TMTCIFFormatAIField__SizeAssignment_28)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeAssignment_28()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__29
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__29__Impl
	rule__TMTCIFFormatAIField__Group__30
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__29__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetAssignment_29()); }
	(rule__TMTCIFFormatAIField__LocalOffsetAssignment_29)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetAssignment_29()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__30
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__30__Impl
	rule__TMTCIFFormatAIField__Group__31
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__30__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getRightCurlyBracketKeyword_30()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__31
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group__31__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group__31__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_31()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_31()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatAIField__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group_14__0__Impl
	rule__TMTCIFFormatAIField__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
	'description'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group_14__1__Impl
	rule__TMTCIFFormatAIField__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group_14__2__Impl
	rule__TMTCIFFormatAIField__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
	(rule__TMTCIFFormatAIField__DescriptionAssignment_14_2)
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatAIField__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__0__Impl
	rule__TMTCIFFormatSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getTMTCIFFormatSizeKeyword_0()); }
	'TMTCIFFormatSize'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getTMTCIFFormatSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__1__Impl
	rule__TMTCIFFormatSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__2__Impl
	rule__TMTCIFFormatSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__3__Impl
	rule__TMTCIFFormatSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__4__Impl
	rule__TMTCIFFormatSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBytesAssignment_4()); }
	(rule__TMTCIFFormatSize__BytesAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__5__Impl
	rule__TMTCIFFormatSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__6__Impl
	rule__TMTCIFFormatSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__7__Impl
	rule__TMTCIFFormatSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__8__Impl
	rule__TMTCIFFormatSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBitsAssignment_8()); }
	(rule__TMTCIFFormatSize__BitsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__9__Impl
	rule__TMTCIFFormatSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__10__Impl
	rule__TMTCIFFormatSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatGlobalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__0__Impl
	rule__TMTCIFFormatGlobalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getTMTCIFFormatGlobalOffsetKeyword_0()); }
	'TMTCIFFormatGlobalOffset'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getTMTCIFFormatGlobalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__1__Impl
	rule__TMTCIFFormatGlobalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__2__Impl
	rule__TMTCIFFormatGlobalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__3__Impl
	rule__TMTCIFFormatGlobalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__4__Impl
	rule__TMTCIFFormatGlobalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesAssignment_4()); }
	(rule__TMTCIFFormatGlobalOffset__BytesAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__5__Impl
	rule__TMTCIFFormatGlobalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__6__Impl
	rule__TMTCIFFormatGlobalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__7__Impl
	rule__TMTCIFFormatGlobalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__8__Impl
	rule__TMTCIFFormatGlobalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsAssignment_8()); }
	(rule__TMTCIFFormatGlobalOffset__BitsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__9__Impl
	rule__TMTCIFFormatGlobalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__10__Impl
	rule__TMTCIFFormatGlobalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatGlobalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormula__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__0__Impl
	rule__TMTCIFFormatFormula__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getTMTCIFFormatFormulaKeyword_0()); }
	'TMTCIFFormatFormula'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getTMTCIFFormatFormulaKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__1__Impl
	rule__TMTCIFFormatFormula__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__2__Impl
	rule__TMTCIFFormatFormula__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeKeyword_2()); }
	'slope'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__3__Impl
	rule__TMTCIFFormatFormula__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__4__Impl
	rule__TMTCIFFormatFormula__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeAssignment_4()); }
	(rule__TMTCIFFormatFormula__SlopeAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__5__Impl
	rule__TMTCIFFormatFormula__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__6__Impl
	rule__TMTCIFFormatFormula__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptKeyword_6()); }
	'intercept'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__7__Impl
	rule__TMTCIFFormatFormula__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__8__Impl
	rule__TMTCIFFormatFormula__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptAssignment_8()); }
	(rule__TMTCIFFormatFormula__InterceptAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__9__Impl
	rule__TMTCIFFormatFormula__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__10__Impl
	rule__TMTCIFFormatFormula__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormula__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatConstSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__0__Impl
	rule__TMTCIFFormatConstSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getTMTCIFFormatConstSizeKeyword_0()); }
	'TMTCIFFormatConstSize'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getTMTCIFFormatConstSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__1__Impl
	rule__TMTCIFFormatConstSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__2__Impl
	rule__TMTCIFFormatConstSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__3__Impl
	rule__TMTCIFFormatConstSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__4__Impl
	rule__TMTCIFFormatConstSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesAssignment_4()); }
	(rule__TMTCIFFormatConstSize__BytesAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__5__Impl
	rule__TMTCIFFormatConstSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__6__Impl
	rule__TMTCIFFormatConstSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__7__Impl
	rule__TMTCIFFormatConstSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__8__Impl
	rule__TMTCIFFormatConstSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsAssignment_8()); }
	(rule__TMTCIFFormatConstSize__BitsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__9__Impl
	rule__TMTCIFFormatConstSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__10__Impl
	rule__TMTCIFFormatConstSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatConstSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatMaxSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__0__Impl
	rule__TMTCIFFormatMaxSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getTMTCIFFormatMaxSizeKeyword_0()); }
	'TMTCIFFormatMaxSize'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getTMTCIFFormatMaxSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__1__Impl
	rule__TMTCIFFormatMaxSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__2__Impl
	rule__TMTCIFFormatMaxSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__3__Impl
	rule__TMTCIFFormatMaxSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__4__Impl
	rule__TMTCIFFormatMaxSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesAssignment_4()); }
	(rule__TMTCIFFormatMaxSize__BytesAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__5__Impl
	rule__TMTCIFFormatMaxSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__6__Impl
	rule__TMTCIFFormatMaxSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__7__Impl
	rule__TMTCIFFormatMaxSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__8__Impl
	rule__TMTCIFFormatMaxSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsAssignment_8()); }
	(rule__TMTCIFFormatMaxSize__BitsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__9__Impl
	rule__TMTCIFFormatMaxSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__10__Impl
	rule__TMTCIFFormatMaxSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatMaxSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatVariableSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__0__Impl
	rule__TMTCIFFormatVariableSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getTMTCIFFormatVariableSizeKeyword_0()); }
	'TMTCIFFormatVariableSize'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getTMTCIFFormatVariableSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__1__Impl
	rule__TMTCIFFormatVariableSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__2__Impl
	rule__TMTCIFFormatVariableSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__3__Impl
	rule__TMTCIFFormatVariableSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__4__Impl
	rule__TMTCIFFormatVariableSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefAssignment_4()); }
	(rule__TMTCIFFormatVariableSize__FidRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__5__Impl
	rule__TMTCIFFormatVariableSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__6__Impl
	rule__TMTCIFFormatVariableSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitKeyword_6()); }
	'unit'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__7__Impl
	rule__TMTCIFFormatVariableSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__8__Impl
	rule__TMTCIFFormatVariableSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitAssignment_8()); }
	(rule__TMTCIFFormatVariableSize__UnitAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__9__Impl
	rule__TMTCIFFormatVariableSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__10__Impl
	rule__TMTCIFFormatVariableSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup_10()); }
	(rule__TMTCIFFormatVariableSize__Group_10__0)?
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__11__Impl
	rule__TMTCIFFormatVariableSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group__12__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_12()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatVariableSize__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group_10__0__Impl
	rule__TMTCIFFormatVariableSize__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerKeyword_10_0()); }
	'power'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group_10__1__Impl
	rule__TMTCIFFormatVariableSize__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group_10__2__Impl
	rule__TMTCIFFormatVariableSize__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerAssignment_10_2()); }
	(rule__TMTCIFFormatVariableSize__PowerAssignment_10_2)
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatVariableSize__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFloatingOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__0__Impl
	rule__TMTCIFFormatFloatingOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getTMTCIFFormatFloatingOffsetKeyword_0()); }
	'TMTCIFFormatFloatingOffset'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getTMTCIFFormatFloatingOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__1__Impl
	rule__TMTCIFFormatFloatingOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__2__Impl
	rule__TMTCIFFormatFloatingOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__3__Impl
	rule__TMTCIFFormatFloatingOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__4__Impl
	rule__TMTCIFFormatFloatingOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
	(rule__TMTCIFFormatFloatingOffset__FidRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__5__Impl
	rule__TMTCIFFormatFloatingOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__6__Impl
	rule__TMTCIFFormatFloatingOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFloatingOffset__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatSortedFieldsToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__0__Impl
	rule__TMTCIFFormatSortedFieldsToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckAction_0()); }
	()
	{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__1__Impl
	rule__TMTCIFFormatSortedFieldsToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckKeyword_1()); }
	'TMTCIFFormatSortedFieldsToCheck'
	{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__2__Impl
	rule__TMTCIFFormatSortedFieldsToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__3__Impl
	rule__TMTCIFFormatSortedFieldsToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__TMTCIFFormatSortedFieldsToCheck__FieldToCheckAssignment_3)
		{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
		(rule__TMTCIFFormatSortedFieldsToCheck__FieldToCheckAssignment_3)*
		{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__4__Impl
	rule__TMTCIFFormatSortedFieldsToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatSortedFieldsToCheck__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFieldToCheck__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__0__Impl
	rule__TMTCIFFormatFieldToCheck__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getTMTCIFFormatFieldToCheckKeyword_0()); }
	'TMTCIFFormatFieldToCheck'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getTMTCIFFormatFieldToCheckKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__1__Impl
	rule__TMTCIFFormatFieldToCheck__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__2__Impl
	rule__TMTCIFFormatFieldToCheck__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__3__Impl
	rule__TMTCIFFormatFieldToCheck__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__4__Impl
	rule__TMTCIFFormatFieldToCheck__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefAssignment_4()); }
	(rule__TMTCIFFormatFieldToCheck__FidRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__5__Impl
	rule__TMTCIFFormatFieldToCheck__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__6__Impl
	rule__TMTCIFFormatFieldToCheck__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFieldToCheck__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatArrayDimension__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__0__Impl
	rule__TMTCIFFormatArrayDimension__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getTMTCIFFormatArrayDimensionKeyword_0()); }
	'TMTCIFFormatArrayDimension'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getTMTCIFFormatArrayDimensionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__1__Impl
	rule__TMTCIFFormatArrayDimension__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__2__Impl
	rule__TMTCIFFormatArrayDimension__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__3__Impl
	rule__TMTCIFFormatArrayDimension__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__4__Impl
	rule__TMTCIFFormatArrayDimension__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefAssignment_4()); }
	(rule__TMTCIFFormatArrayDimension__FidRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__5__Impl
	rule__TMTCIFFormatArrayDimension__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__6__Impl
	rule__TMTCIFFormatArrayDimension__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
	'maxItems'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__7__Impl
	rule__TMTCIFFormatArrayDimension__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__8__Impl
	rule__TMTCIFFormatArrayDimension__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
	(rule__TMTCIFFormatArrayDimension__MaxItemsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__9__Impl
	rule__TMTCIFFormatArrayDimension__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__10__Impl
	rule__TMTCIFFormatArrayDimension__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayDimension__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatLocalOffset__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__0__Impl
	rule__TMTCIFFormatLocalOffset__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getTMTCIFFormatLocalOffsetKeyword_0()); }
	'TMTCIFFormatLocalOffset'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getTMTCIFFormatLocalOffsetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__1__Impl
	rule__TMTCIFFormatLocalOffset__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__2__Impl
	rule__TMTCIFFormatLocalOffset__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesKeyword_2()); }
	'bytes'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__3__Impl
	rule__TMTCIFFormatLocalOffset__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__4__Impl
	rule__TMTCIFFormatLocalOffset__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesAssignment_4()); }
	(rule__TMTCIFFormatLocalOffset__BytesAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__5__Impl
	rule__TMTCIFFormatLocalOffset__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__6__Impl
	rule__TMTCIFFormatLocalOffset__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsKeyword_6()); }
	'bits'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__7__Impl
	rule__TMTCIFFormatLocalOffset__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__8__Impl
	rule__TMTCIFFormatLocalOffset__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsAssignment_8()); }
	(rule__TMTCIFFormatLocalOffset__BitsAssignment_8)
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__9__Impl
	rule__TMTCIFFormatLocalOffset__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__10__Impl
	rule__TMTCIFFormatLocalOffset__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatLocalOffset__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatArrayRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__0__Impl
	rule__TMTCIFFormatArrayRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getTMTCIFFormatArrayRefKeyword_0()); }
	'TMTCIFFormatArrayRef'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getTMTCIFFormatArrayRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__1__Impl
	rule__TMTCIFFormatArrayRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__2__Impl
	rule__TMTCIFFormatArrayRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefKeyword_2()); }
	'fidRef'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__3__Impl
	rule__TMTCIFFormatArrayRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__4__Impl
	rule__TMTCIFFormatArrayRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefAssignment_4()); }
	(rule__TMTCIFFormatArrayRef__FidRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__5__Impl
	rule__TMTCIFFormatArrayRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__6__Impl
	rule__TMTCIFFormatArrayRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatArrayRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__0__Impl
	rule__Version__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_0()); }
	(rule__Version__Alternatives_0)
	{ after(grammarAccess.getVersionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getGroup_1()); }
	(rule__Version__Group_1__0)*
	{ after(grammarAccess.getVersionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__0__Impl
	rule__Version__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__0__Impl
	rule__Version__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
	(rule__Version__Alternatives_1_1)
	{ after(grammarAccess.getVersionAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Version__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__0__Impl
	rule__Version__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Version__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Version__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__INTEGER__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INTEGER__Group_0__0__Impl
	rule__INTEGER__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
	('-')?
	{ after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INTEGER__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__INTEGER__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
	RULE_INT
	{ after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFormatFormat__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
	}
:
	rule__TMTCIFFormatFormat__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_0()); }
					(rule__TMTCIFFormatFormat__Group_3_0__0)
					{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_1()); }
					(rule__TMTCIFFormatFormat__Group_3_1__0)
					{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_2()); }
					(rule__TMTCIFFormatFormat__Group_3_2__0)
					{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3()); }
					(rule__TMTCIFFormatFormat__Group_3_3__0)
					{ after(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__UnorderedGroup_3__Impl
	rule__TMTCIFFormatFormat__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__UnorderedGroup_3__Impl
	rule__TMTCIFFormatFormat__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UnorderedGroup_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__UnorderedGroup_3__Impl
	rule__TMTCIFFormatFormat__UnorderedGroup_3__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UnorderedGroup_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFormatFormat__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFModelFile__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0()); }
		ruleTMTCIFModelFileImport
		{ after(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFile__ElementAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFormatFormatParserRuleCall_1_0()); }
		ruleTMTCIFFormatFormat
		{ after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFormatFormatParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFModelFileImport__ImportURIAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__ProtocolAssignment_3_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__TypeAssignment_3_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0()); }
		ruleTMTCIFFormatFormatType
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__CSFieldAssignment_3_3_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0()); }
		ruleTMTCIFFormatCSField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__CSFormulaFieldAssignment_3_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0()); }
		ruleTMTCIFFormatCSFormulaField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__VSFieldAssignment_3_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0()); }
		ruleTMTCIFFormatVSField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__FDICFieldAssignment_3_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0()); }
		ruleTMTCIFFormatFDICField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__VRFieldSizeAssignment_3_3_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0()); }
		ruleTMTCIFFormatVRFieldSize
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__AFieldAssignment_3_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0()); }
		ruleTMTCIFFormatAField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormat__AIFieldAssignment_3_3_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0()); }
		ruleTMTCIFFormatAIField
		{ after(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatFieldType
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
		ruleTMTCIFFormatSize
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleTMTCIFFormatGlobalOffset
		{ after(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatFieldType
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
		ruleTMTCIFFormatSize
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__GlobalOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0()); }
		ruleTMTCIFFormatGlobalOffset
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatCSFormulaField__FormulaAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaTMTCIFFormatFormulaParserRuleCall_29_0()); }
		ruleTMTCIFFormatFormula
		{ after(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaTMTCIFFormatFormulaParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatFieldType
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__ConstSizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0()); }
		ruleTMTCIFFormatConstSize
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__VariableSizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0()); }
		ruleTMTCIFFormatVariableSize
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__MaxSizeAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0()); }
		ruleTMTCIFFormatMaxSize
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVSField__GlobalOffsetAssignment_30
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0()); }
		ruleTMTCIFFormatGlobalOffset
		{ after(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVRFieldSize__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__CheckTypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatCheckType
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__SizeAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
		ruleTMTCIFFormatSize
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__FloatingOffsetAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0()); }
		ruleTMTCIFFormatFloatingOffset
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFDICField__SortedFieldsToCheckAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0()); }
		ruleTMTCIFFormatSortedFieldsToCheck
		{ after(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatFieldType
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__ArrayDimensionAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0()); }
		ruleTMTCIFFormatArrayDimension
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__SizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0()); }
		ruleTMTCIFFormatSize
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAField__GlobalOffsetAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0()); }
		ruleTMTCIFFormatGlobalOffset
		{ after(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__FidAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__PfidAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__NameAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__DescriptionAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__TypeAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
		ruleTMTCIFFormatFieldType
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__ByteOrderAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
		ruleTMTCIFFormatFieldByteOrder
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__FirstBitAssignment_25
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
		ruleTMTCIFFormatSFieldFirstBit
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__ArrayRefAssignment_27
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0()); }
		ruleTMTCIFFormatArrayRef
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__SizeAssignment_28
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0()); }
		ruleTMTCIFFormatSize
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatAIField__LocalOffsetAssignment_29
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0()); }
		ruleTMTCIFFormatLocalOffset
		{ after(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatGlobalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__SlopeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFormula__InterceptAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatConstSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatMaxSize__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__UnitAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitTMTCIFFormatUnitEnumRuleCall_8_0()); }
		ruleTMTCIFFormatUnit
		{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitTMTCIFFormatUnitEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatVariableSize__PowerAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerTMTCIFFormatPowerEnumRuleCall_10_2_0()); }
		ruleTMTCIFFormatPower
		{ after(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerTMTCIFFormatPowerEnumRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFloatingOffset__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatSortedFieldsToCheck__FieldToCheckAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0()); }
		ruleTMTCIFFormatFieldToCheck
		{ after(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatFieldToCheck__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayDimension__MaxItemsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__BytesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatLocalOffset__BitsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFormatArrayRef__FidRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
