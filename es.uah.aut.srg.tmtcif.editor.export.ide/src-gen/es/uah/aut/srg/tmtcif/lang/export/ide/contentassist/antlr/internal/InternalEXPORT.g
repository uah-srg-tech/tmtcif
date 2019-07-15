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
grammar InternalEXPORT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.export.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.export.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.export.services.EXPORTGrammarAccess;

}
@parser::members {
	private EXPORTGrammarAccess grammarAccess;

	public void setGrammarAccess(EXPORTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTMTCIFExportExport
entryRuleTMTCIFExportExport
:
{ before(grammarAccess.getTMTCIFExportExportRule()); }
	 ruleTMTCIFExportExport
{ after(grammarAccess.getTMTCIFExportExportRule()); } 
	 EOF 
;

// Rule TMTCIFExportExport
ruleTMTCIFExportExport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getGroup()); }
		(rule__TMTCIFExportExport__Group__0)
		{ after(grammarAccess.getTMTCIFExportExportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSizes
entryRuleTMTCIFExportSizes
:
{ before(grammarAccess.getTMTCIFExportSizesRule()); }
	 ruleTMTCIFExportSizes
{ after(grammarAccess.getTMTCIFExportSizesRule()); } 
	 EOF 
;

// Rule TMTCIFExportSizes
ruleTMTCIFExportSizes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getGroup()); }
		(rule__TMTCIFExportSizes__Group__0)
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSizeFromFileLength
entryRuleTMTCIFExportSizeFromFileLength
:
{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); }
	 ruleTMTCIFExportSizeFromFileLength
{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); } 
	 EOF 
;

// Rule TMTCIFExportSizeFromFileLength
ruleTMTCIFExportSizeFromFileLength 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup()); }
		(rule__TMTCIFExportSizeFromFileLength__Group__0)
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSizeFromFileLine
entryRuleTMTCIFExportSizeFromFileLine
:
{ before(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); }
	 ruleTMTCIFExportSizeFromFileLine
{ after(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); } 
	 EOF 
;

// Rule TMTCIFExportSizeFromFileLine
ruleTMTCIFExportSizeFromFileLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup()); }
		(rule__TMTCIFExportSizeFromFileLine__Group__0)
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSizeInBits
entryRuleTMTCIFExportSizeInBits
:
{ before(grammarAccess.getTMTCIFExportSizeInBitsRule()); }
	 ruleTMTCIFExportSizeInBits
{ after(grammarAccess.getTMTCIFExportSizeInBitsRule()); } 
	 EOF 
;

// Rule TMTCIFExportSizeInBits
ruleTMTCIFExportSizeInBits 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup()); }
		(rule__TMTCIFExportSizeInBits__Group__0)
		{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettings
entryRuleTMTCIFExportSettings
:
{ before(grammarAccess.getTMTCIFExportSettingsRule()); }
	 ruleTMTCIFExportSettings
{ after(grammarAccess.getTMTCIFExportSettingsRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettings
ruleTMTCIFExportSettings 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getGroup()); }
		(rule__TMTCIFExportSettings__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingFromConst
entryRuleTMTCIFExportSettingFromConst
:
{ before(grammarAccess.getTMTCIFExportSettingFromConstRule()); }
	 ruleTMTCIFExportSettingFromConst
{ after(grammarAccess.getTMTCIFExportSettingFromConstRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingFromConst
ruleTMTCIFExportSettingFromConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getGroup()); }
		(rule__TMTCIFExportSettingFromConst__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingFromSize
entryRuleTMTCIFExportSettingFromSize
:
{ before(grammarAccess.getTMTCIFExportSettingFromSizeRule()); }
	 ruleTMTCIFExportSettingFromSize
{ after(grammarAccess.getTMTCIFExportSettingFromSizeRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingFromSize
ruleTMTCIFExportSettingFromSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getGroup()); }
		(rule__TMTCIFExportSettingFromSize__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingFromFile
entryRuleTMTCIFExportSettingFromFile
:
{ before(grammarAccess.getTMTCIFExportSettingFromFileRule()); }
	 ruleTMTCIFExportSettingFromFile
{ after(grammarAccess.getTMTCIFExportSettingFromFileRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingFromFile
ruleTMTCIFExportSettingFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup()); }
		(rule__TMTCIFExportSettingFromFile__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingFromField
entryRuleTMTCIFExportSettingFromField
:
{ before(grammarAccess.getTMTCIFExportSettingFromFieldRule()); }
	 ruleTMTCIFExportSettingFromField
{ after(grammarAccess.getTMTCIFExportSettingFromFieldRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingFromField
ruleTMTCIFExportSettingFromField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getGroup()); }
		(rule__TMTCIFExportSettingFromField__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingAIFromConst
entryRuleTMTCIFExportSettingAIFromConst
:
{ before(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); }
	 ruleTMTCIFExportSettingAIFromConst
{ after(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingAIFromConst
ruleTMTCIFExportSettingAIFromConst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getGroup()); }
		(rule__TMTCIFExportSettingAIFromConst__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportSettingAIFromFile
entryRuleTMTCIFExportSettingAIFromFile
:
{ before(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); }
	 ruleTMTCIFExportSettingAIFromFile
{ after(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); } 
	 EOF 
;

// Rule TMTCIFExportSettingAIFromFile
ruleTMTCIFExportSettingAIFromFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup()); }
		(rule__TMTCIFExportSettingAIFromFile__Group__0)
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportActivateDICs
entryRuleTMTCIFExportActivateDICs
:
{ before(grammarAccess.getTMTCIFExportActivateDICsRule()); }
	 ruleTMTCIFExportActivateDICs
{ after(grammarAccess.getTMTCIFExportActivateDICsRule()); } 
	 EOF 
;

// Rule TMTCIFExportActivateDICs
ruleTMTCIFExportActivateDICs 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getGroup()); }
		(rule__TMTCIFExportActivateDICs__Group__0)
		{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFExportDIC
entryRuleTMTCIFExportDIC
:
{ before(grammarAccess.getTMTCIFExportDICRule()); }
	 ruleTMTCIFExportDIC
{ after(grammarAccess.getTMTCIFExportDICRule()); } 
	 EOF 
;

// Rule TMTCIFExportDIC
ruleTMTCIFExportDIC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFExportDICAccess().getGroup()); }
		(rule__TMTCIFExportDIC__Group__0)
		{ after(grammarAccess.getTMTCIFExportDICAccess().getGroup()); }
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

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName
:
{ before(grammarAccess.getVersionedQualifiedNameRule()); }
	 ruleVersionedQualifiedName
{ after(grammarAccess.getVersionedQualifiedNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
		(rule__VersionedQualifiedName__Group__0)
		{ after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName
:
{ before(grammarAccess.getVersionedQualifiedReferenceNameRule()); }
	 ruleVersionedQualifiedReferenceName
{ after(grammarAccess.getVersionedQualifiedReferenceNameRule()); } 
	 EOF 
;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
		(rule__VersionedQualifiedReferenceName__Group__0)
		{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); }
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

// Rule TMTCIFExportUnit
ruleTMTCIFExportUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportUnitAccess().getAlternatives()); }
		(rule__TMTCIFExportUnit__Alternatives)
		{ after(grammarAccess.getTMTCIFExportUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0()); }
		'NULL'
		{ after(grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getFromAssignment_6_1()); }
		(rule__TMTCIFExportExport__FromAssignment_6_1)
		{ after(grammarAccess.getTMTCIFExportExportAccess().getFromAssignment_6_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); }
		(rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0)
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineAssignment_3_1()); }
		(rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1)
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsAssignment_3_2()); }
		(rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2)
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsAssignment_3_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstAssignment_3_0()); }
		(rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeAssignment_3_1()); }
		(rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeAssignment_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileAssignment_3_2()); }
		(rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileAssignment_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldAssignment_3_3()); }
		(rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldAssignment_3_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); }
		(rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); }
		(rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5)
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); }
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

rule__TMTCIFExportUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
		('bits')
		{ after(grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
		('bytes')
		{ after(grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
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


rule__TMTCIFExportExport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__0__Impl
	rule__TMTCIFExportExport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0()); }
	'TMTCIFExportExport'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__1__Impl
	rule__TMTCIFExportExport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getNameAssignment_1()); }
	(rule__TMTCIFExportExport__NameAssignment_1)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__2__Impl
	rule__TMTCIFExportExport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__3__Impl
	rule__TMTCIFExportExport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()); }
	(rule__TMTCIFExportExport__UnorderedGroup_3)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__4__Impl
	rule__TMTCIFExportExport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4()); }
	'from'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__5__Impl
	rule__TMTCIFExportExport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__6__Impl
	rule__TMTCIFExportExport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getAlternatives_6()); }
	(rule__TMTCIFExportExport__Alternatives_6)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__7__Impl
	rule__TMTCIFExportExport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__8__Impl
	rule__TMTCIFExportExport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8()); }
	'to'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__9__Impl
	rule__TMTCIFExportExport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__10__Impl
	rule__TMTCIFExportExport__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getToAssignment_10()); }
	(rule__TMTCIFExportExport__ToAssignment_10)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getToAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__11__Impl
	rule__TMTCIFExportExport__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__12__Impl
	rule__TMTCIFExportExport__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSizesAssignment_12()); }
	(rule__TMTCIFExportExport__SizesAssignment_12)?
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSizesAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__13__Impl
	rule__TMTCIFExportExport__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSettingsAssignment_13()); }
	(rule__TMTCIFExportExport__SettingsAssignment_13)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSettingsAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__14__Impl
	rule__TMTCIFExportExport__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsAssignment_14()); }
	(rule__TMTCIFExportExport__ActivateDICsAssignment_14)?
	{ after(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__15__Impl
	rule__TMTCIFExportExport__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportExport__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_0__0__Impl
	rule__TMTCIFExportExport__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_0__1__Impl
	rule__TMTCIFExportExport__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_0__2__Impl
	rule__TMTCIFExportExport__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getUriAssignment_3_0_2()); }
	(rule__TMTCIFExportExport__UriAssignment_3_0_2)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportExport__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_1__0__Impl
	rule__TMTCIFExportExport__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_1__1__Impl
	rule__TMTCIFExportExport__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_1__2__Impl
	rule__TMTCIFExportExport__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getVersionAssignment_3_1_2()); }
	(rule__TMTCIFExportExport__VersionAssignment_3_1_2)
	{ after(grammarAccess.getTMTCIFExportExportAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizes__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__0__Impl
	rule__TMTCIFExportSizes__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0()); }
	()
	{ after(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__1__Impl
	rule__TMTCIFExportSizes__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1()); }
	'TMTCIFExportSizes'
	{ after(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__2__Impl
	rule__TMTCIFExportSizes__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__3__Impl
	rule__TMTCIFExportSizes__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); }
		(rule__TMTCIFExportSizes__Alternatives_3)
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); }
	)
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); }
		(rule__TMTCIFExportSizes__Alternatives_3)*
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__4__Impl
	rule__TMTCIFExportSizes__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizes__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLength__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__0__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0()); }
	'TMTCIFExportSizeFromFileLength'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__1__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__2__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__3__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__4__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdAssignment_4()); }
	(rule__TMTCIFExportSizeFromFileLength__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__5__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__6__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6()); }
	'fromFile'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__7__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__8__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileAssignment_8()); }
	(rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__9__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__10__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_10()); }
	(rule__TMTCIFExportSizeFromFileLength__Group_10__0)?
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__11__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_11()); }
	(rule__TMTCIFExportSizeFromFileLength__Group_11__0)?
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__12__Impl
	rule__TMTCIFExportSizeFromFileLength__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLength__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); }
	(rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLength__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl
	rule__TMTCIFExportSizeFromFileLength__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); }
	(rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__0__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0()); }
	'TMTCIFExportSizeFromFileLine'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__1__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__2__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__3__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__4__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdAssignment_4()); }
	(rule__TMTCIFExportSizeFromFileLine__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__5__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__6__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6()); }
	'fromFile'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__7__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__8__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileAssignment_8()); }
	(rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__9__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__10__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10()); }
	'line'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__11__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__12__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineAssignment_12()); }
	(rule__TMTCIFExportSizeFromFileLine__LineAssignment_12)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__13__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__14__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_14()); }
	(rule__TMTCIFExportSizeFromFileLine__Group_14__0)?
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__15__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_15()); }
	(rule__TMTCIFExportSizeFromFileLine__Group_15__0)?
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__16__Impl
	rule__TMTCIFExportSizeFromFileLine__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group__17__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLine__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); }
	'addSize'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); }
	(rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeFromFileLine__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0()); }
	'unit'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl
	rule__TMTCIFExportSizeFromFileLine__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitAssignment_15_2()); }
	(rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2)
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeInBits__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__0__Impl
	rule__TMTCIFExportSizeInBits__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0()); }
	'TMTCIFExportSizeInBits'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__1__Impl
	rule__TMTCIFExportSizeInBits__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__2__Impl
	rule__TMTCIFExportSizeInBits__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__3__Impl
	rule__TMTCIFExportSizeInBits__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__4__Impl
	rule__TMTCIFExportSizeInBits__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdAssignment_4()); }
	(rule__TMTCIFExportSizeInBits__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__5__Impl
	rule__TMTCIFExportSizeInBits__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__6__Impl
	rule__TMTCIFExportSizeInBits__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6()); }
	'from'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__7__Impl
	rule__TMTCIFExportSizeInBits__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__8__Impl
	rule__TMTCIFExportSizeInBits__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromAssignment_8()); }
	(rule__TMTCIFExportSizeInBits__FromAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__9__Impl
	rule__TMTCIFExportSizeInBits__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__10__Impl
	rule__TMTCIFExportSizeInBits__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_10()); }
	(rule__TMTCIFExportSizeInBits__Group_10__0)?
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__11__Impl
	rule__TMTCIFExportSizeInBits__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_11()); }
	(rule__TMTCIFExportSizeInBits__Group_11__0)?
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__12__Impl
	rule__TMTCIFExportSizeInBits__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeInBits__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_10__0__Impl
	rule__TMTCIFExportSizeInBits__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_10__1__Impl
	rule__TMTCIFExportSizeInBits__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_10__2__Impl
	rule__TMTCIFExportSizeInBits__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeAssignment_10_2()); }
	(rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2)
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSizeInBits__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_11__0__Impl
	rule__TMTCIFExportSizeInBits__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_11__1__Impl
	rule__TMTCIFExportSizeInBits__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_11__2__Impl
	rule__TMTCIFExportSizeInBits__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitAssignment_11_2()); }
	(rule__TMTCIFExportSizeInBits__UnitAssignment_11_2)
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSizeInBits__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettings__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__0__Impl
	rule__TMTCIFExportSettings__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0()); }
	()
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__1__Impl
	rule__TMTCIFExportSettings__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1()); }
	'TMTCIFExportSettings'
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__2__Impl
	rule__TMTCIFExportSettings__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__3__Impl
	rule__TMTCIFExportSettings__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getAlternatives_3()); }
	(rule__TMTCIFExportSettings__Alternatives_3)*
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__4__Impl
	rule__TMTCIFExportSettings__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettings__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromConst__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__0__Impl
	rule__TMTCIFExportSettingFromConst__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0()); }
	'TMTCIFExportSettingFromConst'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__1__Impl
	rule__TMTCIFExportSettingFromConst__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__2__Impl
	rule__TMTCIFExportSettingFromConst__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__3__Impl
	rule__TMTCIFExportSettingFromConst__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__4__Impl
	rule__TMTCIFExportSettingFromConst__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueAssignment_4()); }
	(rule__TMTCIFExportSettingFromConst__ValueAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__5__Impl
	rule__TMTCIFExportSettingFromConst__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__6__Impl
	rule__TMTCIFExportSettingFromConst__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__7__Impl
	rule__TMTCIFExportSettingFromConst__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__8__Impl
	rule__TMTCIFExportSettingFromConst__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__9__Impl
	rule__TMTCIFExportSettingFromConst__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__10__Impl
	rule__TMTCIFExportSettingFromConst__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromConst__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__0__Impl
	rule__TMTCIFExportSettingFromSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0()); }
	'TMTCIFExportSettingFromSize'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__1__Impl
	rule__TMTCIFExportSettingFromSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__2__Impl
	rule__TMTCIFExportSettingFromSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2()); }
	'sizeRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__3__Impl
	rule__TMTCIFExportSettingFromSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__4__Impl
	rule__TMTCIFExportSettingFromSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefAssignment_4()); }
	(rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__5__Impl
	rule__TMTCIFExportSettingFromSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__6__Impl
	rule__TMTCIFExportSettingFromSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__7__Impl
	rule__TMTCIFExportSettingFromSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__8__Impl
	rule__TMTCIFExportSettingFromSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__9__Impl
	rule__TMTCIFExportSettingFromSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__10__Impl
	rule__TMTCIFExportSettingFromSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromSize__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__0__Impl
	rule__TMTCIFExportSettingFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0()); }
	'TMTCIFExportSettingFromFile'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__1__Impl
	rule__TMTCIFExportSettingFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__2__Impl
	rule__TMTCIFExportSettingFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__3__Impl
	rule__TMTCIFExportSettingFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__4__Impl
	rule__TMTCIFExportSettingFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileAssignment_4()); }
	(rule__TMTCIFExportSettingFromFile__FileAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__5__Impl
	rule__TMTCIFExportSettingFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__6__Impl
	rule__TMTCIFExportSettingFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__7__Impl
	rule__TMTCIFExportSettingFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__8__Impl
	rule__TMTCIFExportSettingFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__9__Impl
	rule__TMTCIFExportSettingFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__10__Impl
	rule__TMTCIFExportSettingFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_10()); }
	(rule__TMTCIFExportSettingFromFile__Group_10__0)?
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__11__Impl
	rule__TMTCIFExportSettingFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_11()); }
	(rule__TMTCIFExportSettingFromFile__Group_11__0)?
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__12__Impl
	rule__TMTCIFExportSettingFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_12()); }
	(rule__TMTCIFExportSettingFromFile__Group_12__0)?
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__13__Impl
	rule__TMTCIFExportSettingFromFile__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromFile__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_10__0__Impl
	rule__TMTCIFExportSettingFromFile__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0()); }
	'offset'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_10__1__Impl
	rule__TMTCIFExportSettingFromFile__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_10__2__Impl
	rule__TMTCIFExportSettingFromFile__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetAssignment_10_2()); }
	(rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2)
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromFile__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_11__0__Impl
	rule__TMTCIFExportSettingFromFile__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0()); }
	'size'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_11__1__Impl
	rule__TMTCIFExportSettingFromFile__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_11__2__Impl
	rule__TMTCIFExportSettingFromFile__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeAssignment_11_2()); }
	(rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2)
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromFile__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_12__0__Impl
	rule__TMTCIFExportSettingFromFile__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0()); }
	'line'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_12__1__Impl
	rule__TMTCIFExportSettingFromFile__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_12__2__Impl
	rule__TMTCIFExportSettingFromFile__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineAssignment_12_2()); }
	(rule__TMTCIFExportSettingFromFile__LineAssignment_12_2)
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromFile__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingFromField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__0__Impl
	rule__TMTCIFExportSettingFromField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0()); }
	'TMTCIFExportSettingFromField'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__1__Impl
	rule__TMTCIFExportSettingFromField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__2__Impl
	rule__TMTCIFExportSettingFromField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2()); }
	'fieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__3__Impl
	rule__TMTCIFExportSettingFromField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__4__Impl
	rule__TMTCIFExportSettingFromField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefAssignment_4()); }
	(rule__TMTCIFExportSettingFromField__FieldRefAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__5__Impl
	rule__TMTCIFExportSettingFromField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__6__Impl
	rule__TMTCIFExportSettingFromField__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__7__Impl
	rule__TMTCIFExportSettingFromField__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__8__Impl
	rule__TMTCIFExportSettingFromField__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__9__Impl
	rule__TMTCIFExportSettingFromField__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__10__Impl
	rule__TMTCIFExportSettingFromField__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingFromField__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingAIFromConst__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__0__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0()); }
	'TMTCIFExportSettingAIFromConst'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__1__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__2__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__3__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__4__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueAssignment_4()); }
	(rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__5__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__6__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__7__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__8__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__9__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__10__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexKeyword_10()); }
	'toArrayIndex'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__11__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__12__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexAssignment_12()); }
	(rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__13__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__14__Impl
	rule__TMTCIFExportSettingAIFromConst__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromConst__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingAIFromFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__0__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0()); }
	'TMTCIFExportSettingAIFromFile'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__1__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__2__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2()); }
	'file'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__3__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__4__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileAssignment_4()); }
	(rule__TMTCIFExportSettingAIFromFile__FileAssignment_4)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__5__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__6__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); }
	'toFieldRef'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__7__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__8__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); }
	(rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__9__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__10__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); }
	'toArrayIndex'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__11__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__12__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); }
	(rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__13__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__14__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_14()); }
	(rule__TMTCIFExportSettingAIFromFile__Group_14__0)?
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__15__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_15()); }
	(rule__TMTCIFExportSettingAIFromFile__Group_15__0)?
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__16__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_16()); }
	(rule__TMTCIFExportSettingAIFromFile__Group_16__0)?
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__17__Impl
	rule__TMTCIFExportSettingAIFromFile__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingAIFromFile__Group_14__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_14__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); }
	'offset'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_14__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_14__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); }
	(rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingAIFromFile__Group_15__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_15__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0()); }
	'size'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_15__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_15__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeAssignment_15_2()); }
	(rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeAssignment_15_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportSettingAIFromFile__Group_16__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_16__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0()); }
	'line'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_16__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); }
	':='
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl
	rule__TMTCIFExportSettingAIFromFile__Group_16__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineAssignment_16_2()); }
	(rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2)
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineAssignment_16_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); }
	';'
	{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportActivateDICs__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__0__Impl
	rule__TMTCIFExportActivateDICs__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0()); }
	()
	{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__1__Impl
	rule__TMTCIFExportActivateDICs__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1()); }
	'TMTCIFExportActivateDICs'
	{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__2__Impl
	rule__TMTCIFExportActivateDICs__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__3__Impl
	rule__TMTCIFExportActivateDICs__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); }
		(rule__TMTCIFExportActivateDICs__DICAssignment_3)
		{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); }
	)
	(
		{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); }
		(rule__TMTCIFExportActivateDICs__DICAssignment_3)*
		{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__4__Impl
	rule__TMTCIFExportActivateDICs__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportActivateDICs__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFExportDIC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__0__Impl
	rule__TMTCIFExportDIC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0()); }
	'TMTCIFExportDIC'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__1__Impl
	rule__TMTCIFExportDIC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__2__Impl
	rule__TMTCIFExportDIC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__3__Impl
	rule__TMTCIFExportDIC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__4__Impl
	rule__TMTCIFExportDIC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getIdAssignment_4()); }
	(rule__TMTCIFExportDIC__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFExportDICAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__5__Impl
	rule__TMTCIFExportDIC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__6__Impl
	rule__TMTCIFExportDIC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6()); }
	'DICRef'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__7__Impl
	rule__TMTCIFExportDIC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__8__Impl
	rule__TMTCIFExportDIC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getDICRefAssignment_8()); }
	(rule__TMTCIFExportDIC__DICRefAssignment_8)
	{ after(grammarAccess.getTMTCIFExportDICAccess().getDICRefAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__9__Impl
	rule__TMTCIFExportDIC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__10__Impl
	rule__TMTCIFExportDIC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportDIC__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11()); }
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


rule__VersionedQualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__0__Impl
	rule__VersionedQualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__1__Impl
	rule__VersionedQualifiedName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__2__Impl
	rule__VersionedQualifiedName__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
	ruleVersion
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedName__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedName__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__0__Impl
	rule__VersionedQualifiedReferenceName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
	(rule__VersionedQualifiedReferenceName__Group_0__0)?
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__1__Impl
	rule__VersionedQualifiedReferenceName__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
	(rule__VersionedQualifiedReferenceName__Group_2__0)*
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_0__0__Impl
	rule__VersionedQualifiedReferenceName__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
	ruleVersionedQualifiedName
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }
	'::'
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VersionedQualifiedReferenceName__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_2__0__Impl
	rule__VersionedQualifiedReferenceName__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }
	'::'
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VersionedQualifiedReferenceName__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VersionedQualifiedReferenceName__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); }
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


rule__TMTCIFExportExport__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
	}
:
	rule__TMTCIFExportExport__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0()); }
					(rule__TMTCIFExportExport__Group_3_0__0)
					{ after(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_1()); }
					(rule__TMTCIFExportExport__Group_3_1__0)
					{ after(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__UnorderedGroup_3__Impl
	rule__TMTCIFExportExport__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFExportExport__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0()); }
		ruleTMTCIFExportExport
		{ after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0()); }
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

rule__TMTCIFExportExport__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__FromAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__ToAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__SizesAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0()); }
		ruleTMTCIFExportSizes
		{ after(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__SettingsAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0()); }
		ruleTMTCIFExportSettings
		{ after(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportExport__ActivateDICsAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0()); }
		ruleTMTCIFExportActivateDICs
		{ after(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0()); }
		ruleTMTCIFExportSizeFromFileLength
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0()); }
		ruleTMTCIFExportSizeFromFileLine
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0()); }
		ruleTMTCIFExportSizeInBits
		{ after(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); }
		ruleTMTCIFExportUnit
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__LineAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0()); }
		ruleTMTCIFExportUnit
		{ after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__FromAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSizeInBits__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); }
		ruleTMTCIFExportUnit
		{ after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0()); }
		ruleTMTCIFExportSettingFromConst
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0()); }
		ruleTMTCIFExportSettingFromSize
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0()); }
		ruleTMTCIFExportSettingFromFile
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0()); }
		ruleTMTCIFExportSettingFromField
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0()); }
		ruleTMTCIFExportSettingAIFromConst
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0()); }
		ruleTMTCIFExportSettingAIFromFile
		{ after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromFile__LineAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__FileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportActivateDICs__DICAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0()); }
		ruleTMTCIFExportDIC
		{ after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFExportDIC__DICRefAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); }
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
