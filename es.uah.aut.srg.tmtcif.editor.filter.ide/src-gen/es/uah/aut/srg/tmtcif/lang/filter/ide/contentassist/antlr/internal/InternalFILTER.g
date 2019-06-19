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
grammar InternalFILTER;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.filter.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.filter.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.filter.services.FILTERGrammarAccess;

}
@parser::members {
	private FILTERGrammarAccess grammarAccess;

	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTMTCIFFilterFilter
entryRuleTMTCIFFilterFilter
:
{ before(grammarAccess.getTMTCIFFilterFilterRule()); }
	 ruleTMTCIFFilterFilter
{ after(grammarAccess.getTMTCIFFilterFilterRule()); } 
	 EOF 
;

// Rule TMTCIFFilterFilter
ruleTMTCIFFilterFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterFilterAccess().getAlternatives()); }
		(rule__TMTCIFFilterFilter__Alternatives)
		{ after(grammarAccess.getTMTCIFFilterFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterMaxtermFilter
entryRuleTMTCIFFilterMaxtermFilter
:
{ before(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); }
	 ruleTMTCIFFilterMaxtermFilter
{ after(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); } 
	 EOF 
;

// Rule TMTCIFFilterMaxtermFilter
ruleTMTCIFFilterMaxtermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup()); }
		(rule__TMTCIFFilterMaxtermFilter__Group__0)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterMintermFilter
entryRuleTMTCIFFilterMintermFilter
:
{ before(grammarAccess.getTMTCIFFilterMintermFilterRule()); }
	 ruleTMTCIFFilterMintermFilter
{ after(grammarAccess.getTMTCIFFilterMintermFilterRule()); } 
	 EOF 
;

// Rule TMTCIFFilterMintermFilter
ruleTMTCIFFilterMintermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup()); }
		(rule__TMTCIFFilterMintermFilter__Group__0)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterBoolVar
entryRuleTMTCIFFilterBoolVar
:
{ before(grammarAccess.getTMTCIFFilterBoolVarRule()); }
	 ruleTMTCIFFilterBoolVar
{ after(grammarAccess.getTMTCIFFilterBoolVarRule()); } 
	 EOF 
;

// Rule TMTCIFFilterBoolVar
ruleTMTCIFFilterBoolVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getGroup()); }
		(rule__TMTCIFFilterBoolVar__Group__0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterBoolVarFromArrayItem
entryRuleTMTCIFFilterBoolVarFromArrayItem
:
{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); }
	 ruleTMTCIFFilterBoolVarFromArrayItem
{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); } 
	 EOF 
;

// Rule TMTCIFFilterBoolVarFromArrayItem
ruleTMTCIFFilterBoolVarFromArrayItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getGroup()); }
		(rule__TMTCIFFilterBoolVarFromArrayItem__Group__0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem
entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem
:
{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); }
	 ruleTMTCIFFilterBoolVarFromGroupedArrayItem
{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); } 
	 EOF 
;

// Rule TMTCIFFilterBoolVarFromGroupedArrayItem
ruleTMTCIFFilterBoolVarFromGroupedArrayItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroup()); }
		(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterBoolVarFDIC
entryRuleTMTCIFFilterBoolVarFDIC
:
{ before(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); }
	 ruleTMTCIFFilterBoolVarFDIC
{ after(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); } 
	 EOF 
;

// Rule TMTCIFFilterBoolVarFDIC
ruleTMTCIFFilterBoolVarFDIC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getGroup()); }
		(rule__TMTCIFFilterBoolVarFDIC__Group__0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterFieldOp
entryRuleTMTCIFFilterFieldOp
:
{ before(grammarAccess.getTMTCIFFilterFieldOpRule()); }
	 ruleTMTCIFFilterFieldOp
{ after(grammarAccess.getTMTCIFFilterFieldOpRule()); } 
	 EOF 
;

// Rule TMTCIFFilterFieldOp
ruleTMTCIFFilterFieldOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getGroup()); }
		(rule__TMTCIFFilterFieldOp__Group__0)
		{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterConstant
entryRuleTMTCIFFilterConstant
:
{ before(grammarAccess.getTMTCIFFilterConstantRule()); }
	 ruleTMTCIFFilterConstant
{ after(grammarAccess.getTMTCIFFilterConstantRule()); } 
	 EOF 
;

// Rule TMTCIFFilterConstant
ruleTMTCIFFilterConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterConstantAccess().getGroup()); }
		(rule__TMTCIFFilterConstant__Group__0)
		{ after(grammarAccess.getTMTCIFFilterConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterSelect
entryRuleTMTCIFFilterSelect
:
{ before(grammarAccess.getTMTCIFFilterSelectRule()); }
	 ruleTMTCIFFilterSelect
{ after(grammarAccess.getTMTCIFFilterSelectRule()); } 
	 EOF 
;

// Rule TMTCIFFilterSelect
ruleTMTCIFFilterSelect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup()); }
		(rule__TMTCIFFilterSelect__Group__0)
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterSelectLine
entryRuleTMTCIFFilterSelectLine
:
{ before(grammarAccess.getTMTCIFFilterSelectLineRule()); }
	 ruleTMTCIFFilterSelectLine
{ after(grammarAccess.getTMTCIFFilterSelectLineRule()); } 
	 EOF 
;

// Rule TMTCIFFilterSelectLine
ruleTMTCIFFilterSelectLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup()); }
		(rule__TMTCIFFilterSelectLine__Group__0)
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterMaxterm
entryRuleTMTCIFFilterMaxterm
:
{ before(grammarAccess.getTMTCIFFilterMaxtermRule()); }
	 ruleTMTCIFFilterMaxterm
{ after(grammarAccess.getTMTCIFFilterMaxtermRule()); } 
	 EOF 
;

// Rule TMTCIFFilterMaxterm
ruleTMTCIFFilterMaxterm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getGroup()); }
		(rule__TMTCIFFilterMaxterm__Group__0)
		{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterMinterm
entryRuleTMTCIFFilterMinterm
:
{ before(grammarAccess.getTMTCIFFilterMintermRule()); }
	 ruleTMTCIFFilterMinterm
{ after(grammarAccess.getTMTCIFFilterMintermRule()); } 
	 EOF 
;

// Rule TMTCIFFilterMinterm
ruleTMTCIFFilterMinterm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermAccess().getGroup()); }
		(rule__TMTCIFFilterMinterm__Group__0)
		{ after(grammarAccess.getTMTCIFFilterMintermAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFFilterBoolVarRef
entryRuleTMTCIFFilterBoolVarRef
:
{ before(grammarAccess.getTMTCIFFilterBoolVarRefRule()); }
	 ruleTMTCIFFilterBoolVarRef
{ after(grammarAccess.getTMTCIFFilterBoolVarRefRule()); } 
	 EOF 
;

// Rule TMTCIFFilterBoolVarRef
ruleTMTCIFFilterBoolVarRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getGroup()); }
		(rule__TMTCIFFilterBoolVarRef__Group__0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getGroup()); }
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

// Rule TMTCIFFilterConstantType
ruleTMTCIFFilterConstantType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getAlternatives()); }
		(rule__TMTCIFFilterConstantType__Alternatives)
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFilterOPType
ruleTMTCIFFilterOPType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getAlternatives()); }
		(rule__TMTCIFFilterOPType__Alternatives)
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TMTCIFFilterSelectType
ruleTMTCIFFilterSelectType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getAlternatives()); }
		(rule__TMTCIFFilterSelectType__Alternatives)
		{ after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0()); }
		ruleTMTCIFFilterMaxtermFilter
		{ after(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1()); }
		ruleTMTCIFFilterMintermFilter
		{ after(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
		(rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
		(rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
		(rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
		(rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
		(rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
		(rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
		(rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
		(rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Alternatives_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantAssignment_19_0()); }
		(rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantAssignment_19_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectAssignment_19_1()); }
		(rule__TMTCIFFilterBoolVar__SelectAssignment_19_1)
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectAssignment_19_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineAssignment_19_2()); }
		(rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2)
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineAssignment_19_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); }
		(rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); }
		(rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); }
		(rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); }
		(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); }
		(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); }
		(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); }
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

rule__TMTCIFFilterConstantType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); }
		('decimal')
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); }
		('hex')
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); }
		('binary')
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); }
		('char')
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); }
		('string')
		{ after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterOPType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); }
		('equal')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); }
		('different')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); }
		('bigger_than')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); }
		('smaller_than')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); }
		('bigger_or_equal')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); }
		('smaller_or_equal')
		{ after(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); }
		('data')
		{ after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); }
		('size')
		{ after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); }
		('crc')
		{ after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); }
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


rule__TMTCIFFilterMaxtermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__0__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0()); }
	'TMTCIFFilterMaxtermFilter'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__1__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameAssignment_1()); }
	(rule__TMTCIFFilterMaxtermFilter__NameAssignment_1)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__2__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__3__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()); }
	(rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__4__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
		(rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
		(rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4)*
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__5__Impl
	rule__TMTCIFFilterMaxtermFilter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMaxtermFilter__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); }
	(rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMaxtermFilter__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1_0()); }
	(rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); }
	'formatFile'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); }
	(rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
		(rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
		(rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5)*
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); }
	'version'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); }
	(rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2)
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMintermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__0__Impl
	rule__TMTCIFFilterMintermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0()); }
	'TMTCIFFilterMintermFilter'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__1__Impl
	rule__TMTCIFFilterMintermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameAssignment_1()); }
	(rule__TMTCIFFilterMintermFilter__NameAssignment_1)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__2__Impl
	rule__TMTCIFFilterMintermFilter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__3__Impl
	rule__TMTCIFFilterMintermFilter__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()); }
	(rule__TMTCIFFilterMintermFilter__UnorderedGroup_3)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__4__Impl
	rule__TMTCIFFilterMintermFilter__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); }
		(rule__TMTCIFFilterMintermFilter__MintermAssignment_4)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); }
		(rule__TMTCIFFilterMintermFilter__MintermAssignment_4)*
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__5__Impl
	rule__TMTCIFFilterMintermFilter__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMintermFilter__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0()); }
	'uri'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriAssignment_3_0_2()); }
	(rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMintermFilter__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1_0()); }
	(rule__TMTCIFFilterMintermFilter__Group_3_1_0__0)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); }
	'formatFile'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); }
	(rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); }
		(rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); }
		(rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5)*
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMintermFilter__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); }
	'version'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); }
	(rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2)
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterBoolVar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__0__Impl
	rule__TMTCIFFilterBoolVar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0()); }
	'TMTCIFFilterBoolVar'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__1__Impl
	rule__TMTCIFFilterBoolVar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__2__Impl
	rule__TMTCIFFilterBoolVar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__3__Impl
	rule__TMTCIFFilterBoolVar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__4__Impl
	rule__TMTCIFFilterBoolVar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterBoolVar__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__5__Impl
	rule__TMTCIFFilterBoolVar__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__6__Impl
	rule__TMTCIFFilterBoolVar__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__7__Impl
	rule__TMTCIFFilterBoolVar__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__8__Impl
	rule__TMTCIFFilterBoolVar__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameAssignment_8()); }
	(rule__TMTCIFFilterBoolVar__NameAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__9__Impl
	rule__TMTCIFFilterBoolVar__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__10__Impl
	rule__TMTCIFFilterBoolVar__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__11__Impl
	rule__TMTCIFFilterBoolVar__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__12__Impl
	rule__TMTCIFFilterBoolVar__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeAssignment_12()); }
	(rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__13__Impl
	rule__TMTCIFFilterBoolVar__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__14__Impl
	rule__TMTCIFFilterBoolVar__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14()); }
	'FieldRef'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__15__Impl
	rule__TMTCIFFilterBoolVar__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__16__Impl
	rule__TMTCIFFilterBoolVar__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefAssignment_16()); }
	(rule__TMTCIFFilterBoolVar__FieldRefAssignment_16)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__17__Impl
	rule__TMTCIFFilterBoolVar__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__18__Impl
	rule__TMTCIFFilterBoolVar__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpAssignment_18()); }
	(rule__TMTCIFFilterBoolVar__OpAssignment_18)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__19__Impl
	rule__TMTCIFFilterBoolVar__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getAlternatives_19()); }
	(rule__TMTCIFFilterBoolVar__Alternatives_19)
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getAlternatives_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__20__Impl
	rule__TMTCIFFilterBoolVar__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVar__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterBoolVarFromArrayItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0()); }
	'TMTCIFFilterBoolVarFromArrayItem'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); }
	'AIFieldRef'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAlternatives_19()); }
	(rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAlternatives_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0()); }
	'TMTCIFFilterBoolVarFromGroupedArrayItem'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); }
	'constantType'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); }
	'group'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); }
	'AIFieldRefs'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); }
	(rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterBoolVarFDIC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0()); }
	'TMTCIFFilterBoolVarFDIC'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6()); }
	'name'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameAssignment_8()); }
	(rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10()); }
	'FieldRef'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefAssignment_12()); }
	(rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefAssignment_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpAssignment_14()); }
	(rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14)
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpAssignment_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl
	rule__TMTCIFFilterBoolVarFDIC__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterFieldOp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__0__Impl
	rule__TMTCIFFilterFieldOp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0()); }
	'TMTCIFFilterFieldOp'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__1__Impl
	rule__TMTCIFFilterFieldOp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__2__Impl
	rule__TMTCIFFilterFieldOp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2()); }
	'type'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__3__Impl
	rule__TMTCIFFilterFieldOp__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__4__Impl
	rule__TMTCIFFilterFieldOp__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeAssignment_4()); }
	(rule__TMTCIFFilterFieldOp__TypeAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__5__Impl
	rule__TMTCIFFilterFieldOp__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__6__Impl
	rule__TMTCIFFilterFieldOp__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterFieldOp__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterConstant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__0__Impl
	rule__TMTCIFFilterConstant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0()); }
	'TMTCIFFilterConstant'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__1__Impl
	rule__TMTCIFFilterConstant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__2__Impl
	rule__TMTCIFFilterConstant__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2()); }
	'value'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__3__Impl
	rule__TMTCIFFilterConstant__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__4__Impl
	rule__TMTCIFFilterConstant__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getValueAssignment_4()); }
	(rule__TMTCIFFilterConstant__ValueAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getValueAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__5__Impl
	rule__TMTCIFFilterConstant__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__6__Impl
	rule__TMTCIFFilterConstant__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getGroup_6()); }
	(rule__TMTCIFFilterConstant__Group_6__0)?
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__7__Impl
	rule__TMTCIFFilterConstant__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterConstant__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group_6__0__Impl
	rule__TMTCIFFilterConstant__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0()); }
	'mask'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group_6__1__Impl
	rule__TMTCIFFilterConstant__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group_6__2__Impl
	rule__TMTCIFFilterConstant__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskAssignment_6_2()); }
	(rule__TMTCIFFilterConstant__MaskAssignment_6_2)
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskAssignment_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterConstant__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__Group_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__0__Impl
	rule__TMTCIFFilterSelect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0()); }
	'TMTCIFFilterSelect'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__1__Impl
	rule__TMTCIFFilterSelect__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__2__Impl
	rule__TMTCIFFilterSelect__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2()); }
	'fromFile'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__3__Impl
	rule__TMTCIFFilterSelect__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__4__Impl
	rule__TMTCIFFilterSelect__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileAssignment_4()); }
	(rule__TMTCIFFilterSelect__FromFileAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__5__Impl
	rule__TMTCIFFilterSelect__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__6__Impl
	rule__TMTCIFFilterSelect__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6()); }
	'type'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__7__Impl
	rule__TMTCIFFilterSelect__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__8__Impl
	rule__TMTCIFFilterSelect__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeAssignment_8()); }
	(rule__TMTCIFFilterSelect__TypeAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__9__Impl
	rule__TMTCIFFilterSelect__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__10__Impl
	rule__TMTCIFFilterSelect__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_10()); }
	(rule__TMTCIFFilterSelect__Group_10__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__11__Impl
	rule__TMTCIFFilterSelect__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_11()); }
	(rule__TMTCIFFilterSelect__Group_11__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__12__Impl
	rule__TMTCIFFilterSelect__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_12()); }
	(rule__TMTCIFFilterSelect__Group_12__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__13__Impl
	rule__TMTCIFFilterSelect__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelect__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_10__0__Impl
	rule__TMTCIFFilterSelect__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0()); }
	'offset'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_10__1__Impl
	rule__TMTCIFFilterSelect__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_10__2__Impl
	rule__TMTCIFFilterSelect__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetAssignment_10_2()); }
	(rule__TMTCIFFilterSelect__OffsetAssignment_10_2)
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelect__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_11__0__Impl
	rule__TMTCIFFilterSelect__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0()); }
	'size'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_11__1__Impl
	rule__TMTCIFFilterSelect__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_11__2__Impl
	rule__TMTCIFFilterSelect__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeAssignment_11_2()); }
	(rule__TMTCIFFilterSelect__SizeAssignment_11_2)
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelect__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_12__0__Impl
	rule__TMTCIFFilterSelect__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0()); }
	'mask'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_12__1__Impl
	rule__TMTCIFFilterSelect__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_12__2__Impl
	rule__TMTCIFFilterSelect__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskAssignment_12_2()); }
	(rule__TMTCIFFilterSelect__MaskAssignment_12_2)
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelect__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelectLine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__0__Impl
	rule__TMTCIFFilterSelectLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0()); }
	'TMTCIFFilterSelectLine'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__1__Impl
	rule__TMTCIFFilterSelectLine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__2__Impl
	rule__TMTCIFFilterSelectLine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2()); }
	'fromFile'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__3__Impl
	rule__TMTCIFFilterSelectLine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__4__Impl
	rule__TMTCIFFilterSelectLine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileAssignment_4()); }
	(rule__TMTCIFFilterSelectLine__FromFileAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__5__Impl
	rule__TMTCIFFilterSelectLine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__6__Impl
	rule__TMTCIFFilterSelectLine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6()); }
	'line'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__7__Impl
	rule__TMTCIFFilterSelectLine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__8__Impl
	rule__TMTCIFFilterSelectLine__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineAssignment_8()); }
	(rule__TMTCIFFilterSelectLine__LineAssignment_8)
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__9__Impl
	rule__TMTCIFFilterSelectLine__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__10__Impl
	rule__TMTCIFFilterSelectLine__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_10()); }
	(rule__TMTCIFFilterSelectLine__Group_10__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__11__Impl
	rule__TMTCIFFilterSelectLine__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_11()); }
	(rule__TMTCIFFilterSelectLine__Group_11__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__12__Impl
	rule__TMTCIFFilterSelectLine__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_12()); }
	(rule__TMTCIFFilterSelectLine__Group_12__0)?
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__13__Impl
	rule__TMTCIFFilterSelectLine__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group__14__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelectLine__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_10__0__Impl
	rule__TMTCIFFilterSelectLine__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0()); }
	'leftTrim'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_10__1__Impl
	rule__TMTCIFFilterSelectLine__Group_10__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_10__2__Impl
	rule__TMTCIFFilterSelectLine__Group_10__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimAssignment_10_2()); }
	(rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2)
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimAssignment_10_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_10__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_10__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelectLine__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_11__0__Impl
	rule__TMTCIFFilterSelectLine__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0()); }
	'rightTrim'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_11__1__Impl
	rule__TMTCIFFilterSelectLine__Group_11__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_11__2__Impl
	rule__TMTCIFFilterSelectLine__Group_11__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimAssignment_11_2()); }
	(rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2)
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimAssignment_11_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_11__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_11__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterSelectLine__Group_12__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_12__0__Impl
	rule__TMTCIFFilterSelectLine__Group_12__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0()); }
	'mask'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_12__1__Impl
	rule__TMTCIFFilterSelectLine__Group_12__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_12__2__Impl
	rule__TMTCIFFilterSelectLine__Group_12__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskAssignment_12_2()); }
	(rule__TMTCIFFilterSelectLine__MaskAssignment_12_2)
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskAssignment_12_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterSelectLine__Group_12__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__Group_12__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMaxterm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__0__Impl
	rule__TMTCIFFilterMaxterm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0()); }
	'TMTCIFFilterMaxterm'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__1__Impl
	rule__TMTCIFFilterMaxterm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__2__Impl
	rule__TMTCIFFilterMaxterm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__3__Impl
	rule__TMTCIFFilterMaxterm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__4__Impl
	rule__TMTCIFFilterMaxterm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterMaxterm__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__5__Impl
	rule__TMTCIFFilterMaxterm__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__6__Impl
	rule__TMTCIFFilterMaxterm__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
		(rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6)
		{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
		(rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6)*
		{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__7__Impl
	rule__TMTCIFFilterMaxterm__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxterm__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMinterm__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__0__Impl
	rule__TMTCIFFilterMinterm__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0()); }
	'TMTCIFFilterMinterm'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__1__Impl
	rule__TMTCIFFilterMinterm__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__2__Impl
	rule__TMTCIFFilterMinterm__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2()); }
	'id'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__3__Impl
	rule__TMTCIFFilterMinterm__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__4__Impl
	rule__TMTCIFFilterMinterm__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getIdAssignment_4()); }
	(rule__TMTCIFFilterMinterm__IdAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getIdAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__5__Impl
	rule__TMTCIFFilterMinterm__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__6__Impl
	rule__TMTCIFFilterMinterm__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); }
		(rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6)
		{ after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); }
	)
	(
		{ before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); }
		(rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6)*
		{ after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__7__Impl
	rule__TMTCIFFilterMinterm__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMinterm__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterBoolVarRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__0__Impl
	rule__TMTCIFFilterBoolVarRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0()); }
	'TMTCIFFilterBoolVarRef'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__1__Impl
	rule__TMTCIFFilterBoolVarRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__2__Impl
	rule__TMTCIFFilterBoolVarRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2()); }
	'idRef'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__3__Impl
	rule__TMTCIFFilterBoolVarRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); }
	':='
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__4__Impl
	rule__TMTCIFFilterBoolVarRef__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefAssignment_4()); }
	(rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4)
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__5__Impl
	rule__TMTCIFFilterBoolVarRef__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__6__Impl
	rule__TMTCIFFilterBoolVarRef__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterBoolVarRef__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7()); }
	';'
	{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7()); }
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


rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
	}
:
	rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0()); }
					(rule__TMTCIFFilterMaxtermFilter__Group_3_0__0)
					{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1()); }
					(rule__TMTCIFFilterMaxtermFilter__Group_3_1__0)
					{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl
	rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFFilterMintermFilter__UnorderedGroup_3
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
	}
:
	rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0()); }
					(rule__TMTCIFFilterMintermFilter__Group_3_0__0)
					{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1()); }
					(rule__TMTCIFFilterMintermFilter__Group_3_1__0)
					{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl
	rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl
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
		{ before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0()); }
		ruleTMTCIFFilterFilter
		{ after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0()); }
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

rule__TMTCIFFilterMaxtermFilter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
		ruleVersion
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); }
		ruleTMTCIFFilterBoolVar
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
		ruleTMTCIFFilterBoolVarFromArrayItem
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
		ruleTMTCIFFilterBoolVarFromGroupedArrayItem
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
		ruleTMTCIFFilterBoolVarFDIC
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0()); }
		ruleTMTCIFFilterMaxterm
		{ after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
		ruleVersion
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
			ruleVersionedQualifiedName
			{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); }
		ruleTMTCIFFilterBoolVar
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
		ruleTMTCIFFilterBoolVarFromArrayItem
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
		ruleTMTCIFFilterBoolVarFromGroupedArrayItem
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
		ruleTMTCIFFilterBoolVarFDIC
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMintermFilter__MintermAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0()); }
		ruleTMTCIFFilterMinterm
		{ after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
		ruleTMTCIFFilterConstantType
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__FieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__OpAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); }
		ruleTMTCIFFilterFieldOp
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); }
		ruleTMTCIFFilterConstant
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__SelectAssignment_19_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); }
		ruleTMTCIFFilterSelect
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); }
		ruleTMTCIFFilterSelectLine
		{ after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
		ruleTMTCIFFilterConstantType
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); }
		ruleTMTCIFFilterFieldOp
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); }
		ruleTMTCIFFilterConstant
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); }
		ruleTMTCIFFilterSelect
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); }
		ruleTMTCIFFilterSelectLine
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
		ruleTMTCIFFilterConstantType
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0()); }
		ruleTMTCIFFilterFieldOp
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0()); }
		ruleTMTCIFFilterConstant
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0()); }
		ruleTMTCIFFilterSelect
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0()); }
		ruleTMTCIFFilterSelectLine
		{ after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0()); }
		(
			{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); }
			ruleVersionedQualifiedReferenceName
			{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); }
		)
		{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0()); }
		ruleTMTCIFFilterFieldOp
		{ after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterFieldOp__TypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0()); }
		ruleTMTCIFFilterOPType
		{ after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__ValueAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterConstant__MaskAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__FromFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__TypeAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0()); }
		ruleTMTCIFFilterSelectType
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__OffsetAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__SizeAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelect__MaskAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__FromFileAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__LineAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterSelectLine__MaskAssignment_12_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
		RULE_HEXADECIMAL
		{ after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); }
		ruleTMTCIFFilterBoolVarRef
		{ after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__IdAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); }
		ruleTMTCIFFilterBoolVarRef
		{ after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); }
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
