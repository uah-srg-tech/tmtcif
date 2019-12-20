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
grammar InternalENUM;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.enum_.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.enum_.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;

}
@parser::members {
	private ENUMGrammarAccess grammarAccess;

	public void setGrammarAccess(ENUMGrammarAccess grammarAccess) {
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

// Entry rule entryRuleTMTCIFEnum
entryRuleTMTCIFEnum
:
{ before(grammarAccess.getTMTCIFEnumRule()); }
	 ruleTMTCIFEnum
{ after(grammarAccess.getTMTCIFEnumRule()); } 
	 EOF 
;

// Rule TMTCIFEnum
ruleTMTCIFEnum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFEnumAccess().getGroup()); }
		(rule__TMTCIFEnum__Group__0)
		{ after(grammarAccess.getTMTCIFEnumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTMTCIFEnumValue
entryRuleTMTCIFEnumValue
:
{ before(grammarAccess.getTMTCIFEnumValueRule()); }
	 ruleTMTCIFEnumValue
{ after(grammarAccess.getTMTCIFEnumValueRule()); } 
	 EOF 
;

// Rule TMTCIFEnumValue
ruleTMTCIFEnumValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTMTCIFEnumValueAccess().getGroup()); }
		(rule__TMTCIFEnumValue__Group__0)
		{ after(grammarAccess.getTMTCIFEnumValueAccess().getGroup()); }
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

rule__TMTCIFEnum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__0__Impl
	rule__TMTCIFEnum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0()); }
	'<Enum'
	{ after(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__1__Impl
	rule__TMTCIFEnum__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__2__Impl
	rule__TMTCIFEnum__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumAccess().getNameAssignment_2()); }
	(rule__TMTCIFEnum__NameAssignment_2)
	{ after(grammarAccess.getTMTCIFEnumAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__3__Impl
	rule__TMTCIFEnum__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__4__Impl
	rule__TMTCIFEnum__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); }
		(rule__TMTCIFEnum__ValuesAssignment_4)
		{ after(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); }
	)
	(
		{ before(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); }
		(rule__TMTCIFEnum__ValuesAssignment_4)*
		{ after(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnum__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5()); }
	'</Enum>'
	{ after(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TMTCIFEnumValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__0__Impl
	rule__TMTCIFEnumValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0()); }
	'<Value'
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__1__Impl
	rule__TMTCIFEnumValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1()); }
	'name='
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__2__Impl
	rule__TMTCIFEnumValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getNameAssignment_2()); }
	(rule__TMTCIFEnumValue__NameAssignment_2)
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__3__Impl
	rule__TMTCIFEnumValue__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__4__Impl
	rule__TMTCIFEnumValue__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getRawAssignment_4()); }
	(rule__TMTCIFEnumValue__RawAssignment_4)
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getRawAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TMTCIFEnumValue__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5()); }
	'</Value>'
	{ after(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5()); }
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


rule__TMTCIFEnum__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnum__ValuesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0()); }
		ruleTMTCIFEnumValue
		{ after(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TMTCIFEnumValue__RawAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0()); }
		ruleINTEGER
		{ after(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0()); }
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
