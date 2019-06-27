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
grammar InternalIMPORT;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.import_.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.import_.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.import_.services.IMPORTGrammarAccess;

}
@parser::members {
	private IMPORTGrammarAccess grammarAccess;

	public void setGrammarAccess(IMPORTGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTMTCIFImportImport
entryRuleTMTCIFImportImport
:
{ before(grammarAccess.getTMTCIFImportImportRule()); }
	 ruleTMTCIFImportImport
{ after(grammarAccess.getTMTCIFImportImportRule()); } 
	 EOF 
;

// Rule TMTCIFImportImport
ruleTMTCIFImportImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getGroup()); }
		(rule__TMTCIFImportImport__Group__0)
		{ after(grammarAccess.getTMTCIFImportImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFImportDataSource
entryRuleTMTCIFImportDataSource
:
{ before(grammarAccess.getTMTCIFImportDataSourceRule()); }
	 ruleTMTCIFImportDataSource
{ after(grammarAccess.getTMTCIFImportDataSourceRule()); } 
	 EOF 
;

// Rule TMTCIFImportDataSource
ruleTMTCIFImportDataSource 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getGroup()); }
		(rule__TMTCIFImportDataSource__Group__0)
		{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFImportVirtualSize
entryRuleTMTCIFImportVirtualSize
:
{ before(grammarAccess.getTMTCIFImportVirtualSizeRule()); }
	 ruleTMTCIFImportVirtualSize
{ after(grammarAccess.getTMTCIFImportVirtualSizeRule()); } 
	 EOF 
;

// Rule TMTCIFImportVirtualSize
ruleTMTCIFImportVirtualSize 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup()); }
		(rule__TMTCIFImportVirtualSize__Group__0)
		{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup()); }
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

// Rule TMTCIFImportUnit
ruleTMTCIFImportUnit
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportUnitAccess().getAlternatives()); }
		(rule__TMTCIFImportUnit__Alternatives)
		{ after(grammarAccess.getTMTCIFImportUnitAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getNULLKeyword_10_0()); }
		'NULL'
		{ after(grammarAccess.getTMTCIFImportImportAccess().getNULLKeyword_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getToAssignment_10_1()); }
		(rule__TMTCIFImportImport__ToAssignment_10_1)
		{ after(grammarAccess.getTMTCIFImportImportAccess().getToAssignment_10_1()); }
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

rule__TMTCIFImportUnit__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
		('bits')
		{ after(grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
		('bytes')
		{ after(grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1()); }
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


rule__TMTCIFImportImport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__0__Impl
	rule__TMTCIFImportImport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getTMTCIFImportImportKeyword_0()); }
	'TMTCIFImportImport'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getTMTCIFImportImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__1__Impl
	rule__TMTCIFImportImport__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getNameAssignment_1()); }
	(rule__TMTCIFImportImport__NameAssignment_1)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__2__Impl
	rule__TMTCIFImportImport__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__3__Impl
	rule__TMTCIFImportImport__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()); }
	(rule__TMTCIFImportImport__UnorderedGroup_3)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__4__Impl
	rule__TMTCIFImportImport__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getFromKeyword_4()); }
	'from'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getFromKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__5__Impl
	rule__TMTCIFImportImport__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_5()); }
	':='
	{ after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__6__Impl
	rule__TMTCIFImportImport__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getFromAssignment_6()); }
	(rule__TMTCIFImportImport__FromAssignment_6)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getFromAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__7__Impl
	rule__TMTCIFImportImport__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__8__Impl
	rule__TMTCIFImportImport__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getToKeyword_8()); }
	'to'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getToKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__9__Impl
	rule__TMTCIFImportImport__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_9()); }
	':='
	{ after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__10__Impl
	rule__TMTCIFImportImport__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getAlternatives_10()); }
	(rule__TMTCIFImportImport__Alternatives_10)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__11__Impl
	rule__TMTCIFImportImport__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_11()); }
	';'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__12__Impl
	rule__TMTCIFImportImport__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); }
		(rule__TMTCIFImportImport__DataSourceAssignment_12)
		{ after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); }
	)
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); }
		(rule__TMTCIFImportImport__DataSourceAssignment_12)*
		{ after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__13__Impl
	rule__TMTCIFImportImport__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeAssignment_13()); }
	(rule__TMTCIFImportImport__VirtualSizeAssignment_13)?
	{ after(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__14__Impl
	rule__TMTCIFImportImport__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportImport__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_0__0__Impl
	rule__TMTCIFImportImport__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_0__1__Impl
	rule__TMTCIFImportImport__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_0__2__Impl
	rule__TMTCIFImportImport__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getUriAssignment_3_0_2()); }
	(rule__TMTCIFImportImport__UriAssignment_3_0_2)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportImport__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_1__0__Impl
	rule__TMTCIFImportImport__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getVersionKeyword_3_1_0()); }
	'version'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getVersionKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_1__1__Impl
	rule__TMTCIFImportImport__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_1_1()); }
	':='
	{ after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_1__2__Impl
	rule__TMTCIFImportImport__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getVersionAssignment_3_1_2()); }
	(rule__TMTCIFImportImport__VersionAssignment_3_1_2)
	{ after(grammarAccess.getTMTCIFImportImportAccess().getVersionAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__Group_3_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_1_3()); }
	';'
	{ after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportDataSource__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__0__Impl
	rule__TMTCIFImportDataSource__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getTMTCIFImportDataSourceKeyword_0()); }
	'TMTCIFImportDataSource'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getTMTCIFImportDataSourceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__1__Impl
	rule__TMTCIFImportDataSource__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__2__Impl
	rule__TMTCIFImportDataSource__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefKeyword_2()); }
	'FieldRef'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__3__Impl
	rule__TMTCIFImportDataSource__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__4__Impl
	rule__TMTCIFImportDataSource__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefAssignment_4()); }
	(rule__TMTCIFImportDataSource__FieldRefAssignment_4)
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__5__Impl
	rule__TMTCIFImportDataSource__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__6__Impl
	rule__TMTCIFImportDataSource__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimKeyword_6()); }
	'leftTrim'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__7__Impl
	rule__TMTCIFImportDataSource__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__8__Impl
	rule__TMTCIFImportDataSource__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimAssignment_8()); }
	(rule__TMTCIFImportDataSource__LeftTrimAssignment_8)
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__9__Impl
	rule__TMTCIFImportDataSource__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__10__Impl
	rule__TMTCIFImportDataSource__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimKeyword_10()); }
	'rightTrim'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__11__Impl
	rule__TMTCIFImportDataSource__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__12__Impl
	rule__TMTCIFImportDataSource__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimAssignment_12()); }
	(rule__TMTCIFImportDataSource__RightTrimAssignment_12)
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__13__Impl
	rule__TMTCIFImportDataSource__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__14__Impl
	rule__TMTCIFImportDataSource__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportDataSource__Group__15__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_15()); }
	';'
	{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportVirtualSize__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__0__Impl
	rule__TMTCIFImportVirtualSize__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getTMTCIFImportVirtualSizeKeyword_0()); }
	'TMTCIFImportVirtualSize'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getTMTCIFImportVirtualSizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__1__Impl
	rule__TMTCIFImportVirtualSize__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__2__Impl
	rule__TMTCIFImportVirtualSize__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefKeyword_2()); }
	'FieldRef'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__3__Impl
	rule__TMTCIFImportVirtualSize__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__4__Impl
	rule__TMTCIFImportVirtualSize__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefAssignment_4()); }
	(rule__TMTCIFImportVirtualSize__FieldRefAssignment_4)
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__5__Impl
	rule__TMTCIFImportVirtualSize__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__6__Impl
	rule__TMTCIFImportVirtualSize__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToKeyword_6()); }
	'to'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__7__Impl
	rule__TMTCIFImportVirtualSize__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__8__Impl
	rule__TMTCIFImportVirtualSize__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToAssignment_8()); }
	(rule__TMTCIFImportVirtualSize__ToAssignment_8)
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__9__Impl
	rule__TMTCIFImportVirtualSize__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__10__Impl
	rule__TMTCIFImportVirtualSize__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_10()); }
	(rule__TMTCIFImportVirtualSize__Group_10__0)?
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__11__Impl
	rule__TMTCIFImportVirtualSize__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_11()); }
	(rule__TMTCIFImportVirtualSize__Group_11__0)?
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__12__Impl
	rule__TMTCIFImportVirtualSize__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); }
	'}'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group__13__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportVirtualSize__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_10__0__Impl
	rule__TMTCIFImportVirtualSize__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeKeyword_10_0()); }
	'addSize'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_10__1__Impl
	rule__TMTCIFImportVirtualSize__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_10__2__Impl
	rule__TMTCIFImportVirtualSize__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeAssignment_10_2()); }
	(rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2)
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFImportVirtualSize__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_11__0__Impl
	rule__TMTCIFImportVirtualSize__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitKeyword_11_0()); }
	'unit'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_11__1__Impl
	rule__TMTCIFImportVirtualSize__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_11__2__Impl
	rule__TMTCIFImportVirtualSize__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitAssignment_11_2()); }
	(rule__TMTCIFImportVirtualSize__UnitAssignment_11_2)
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportVirtualSize__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_11_3()); }
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


rule__TMTCIFImportImport__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
	}
:
	rule__TMTCIFImportImport__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0()); }
					(rule__TMTCIFImportImport__Group_3_0__0)
					{ after(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_1()); }
					(rule__TMTCIFImportImport__Group_3_1__0)
					{ after(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__UnorderedGroup_3__Impl
	rule__TMTCIFImportImport__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFImportImport__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFImportImportParserRuleCall_1_0()); }
		ruleTMTCIFImportImport
		{ after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFImportImportParserRuleCall_1_0()); }
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

rule__TMTCIFImportImport__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFImportImportAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTMTCIFImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__VersionAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
		ruleVersion
		{ after(grammarAccess.getTMTCIFImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__FromAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatCrossReference_6_0()); }
		(
			{ before(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__ToAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatCrossReference_10_1_0()); }
		(
			{ before(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatCrossReference_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__DataSourceAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0()); }
		ruleTMTCIFImportDataSource
		{ after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportImport__VirtualSizeAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0()); }
		ruleTMTCIFImportVirtualSize
		{ after(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__LeftTrimAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportDataSource__RightTrimAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__FieldRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
		(
			{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__ToAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldCrossReference_8_0()); }
		(
			{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFImportVirtualSize__UnitAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitTMTCIFImportUnitEnumRuleCall_11_2_0()); }
		ruleTMTCIFImportUnit
		{ after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitTMTCIFImportUnitEnumRuleCall_11_2_0()); }
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
