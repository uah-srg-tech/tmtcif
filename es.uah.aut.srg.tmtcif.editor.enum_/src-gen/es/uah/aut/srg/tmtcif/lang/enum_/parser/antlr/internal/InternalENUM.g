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
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.enum_.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.enum_.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private ENUMGrammarAccess grammarAccess;

    public InternalENUMParser(TokenStream input, ENUMGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TMTCIFEnum";
   	}

   	@Override
   	protected ENUMGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTMTCIFEnum
entryRuleTMTCIFEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFEnumRule()); }
	iv_ruleTMTCIFEnum=ruleTMTCIFEnum
	{ $current=$iv_ruleTMTCIFEnum.current; }
	EOF;

// Rule TMTCIFEnum
ruleTMTCIFEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFEnumRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0());
				}
				lv_values_4_0=ruleTMTCIFEnumValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFEnumRule());
					}
					add(
						$current,
						"values",
						lv_values_4_0,
						"es.uah.aut.srg.tmtcif.lang.enum_.ENUM.TMTCIFEnumValue");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='</Enum>'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFEnumValue
entryRuleTMTCIFEnumValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFEnumValueRule()); }
	iv_ruleTMTCIFEnumValue=ruleTMTCIFEnumValue
	{ $current=$iv_ruleTMTCIFEnumValue.current; }
	EOF;

// Rule TMTCIFEnumValue
ruleTMTCIFEnumValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<Value'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0());
		}
		otherlv_1='name='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFEnumValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0());
				}
				lv_raw_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFEnumValueRule());
					}
					set(
						$current,
						"raw",
						lv_raw_4_0,
						"es.uah.aut.srg.tmtcif.lang.enum_.ENUM.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='</Value>'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5());
		}
	)
;

// Entry rule entryRuleINTEGER
entryRuleINTEGER returns [String current=null]:
	{ newCompositeNode(grammarAccess.getINTEGERRule()); }
	iv_ruleINTEGER=ruleINTEGER
	{ $current=$iv_ruleINTEGER.current.getText(); }
	EOF;

// Rule INTEGER
ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0());
				}
			)?
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1());
			}
		)
		    |
		this_HEXADECIMAL_2=RULE_HEXADECIMAL
		{
			$current.merge(this_HEXADECIMAL_2);
		}
		{
			newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1());
		}
	)
;

RULE_HEXADECIMAL : '0x' ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
