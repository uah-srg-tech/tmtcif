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
package es.uah.aut.srg.tmtcif.lang.enum_.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ENUMGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TMTCIFEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.enum_.ENUM.TMTCIFEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValuesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValuesTMTCIFEnumValueParserRuleCall_4_0 = (RuleCall)cValuesAssignment_4.eContents().get(0);
		private final Keyword cEnumKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFEnum:
		//	'<Enum'
		//	'name=' name=STRING
		//	'>'
		//	values+=TMTCIFEnumValue+
		//	'</Enum>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Enum' 'name=' name=STRING '>' values+=TMTCIFEnumValue+ '</Enum>'
		public Group getGroup() { return cGroup; }
		
		//'<Enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//values+=TMTCIFEnumValue+
		public Assignment getValuesAssignment_4() { return cValuesAssignment_4; }
		
		//TMTCIFEnumValue
		public RuleCall getValuesTMTCIFEnumValueParserRuleCall_4_0() { return cValuesTMTCIFEnumValueParserRuleCall_4_0; }
		
		//'</Enum>'
		public Keyword getEnumKeyword_5() { return cEnumKeyword_5; }
	}
	public class TMTCIFEnumValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.enum_.ENUM.TMTCIFEnumValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cValueKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRawAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRawINTEGERParserRuleCall_4_0 = (RuleCall)cRawAssignment_4.eContents().get(0);
		private final Keyword cValueKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFEnumValue:
		//	'<Value'
		//	'name=' name=STRING
		//	'>'
		//	raw=INTEGER
		//	'</Value>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Value' 'name=' name=STRING '>' raw=INTEGER '</Value>'
		public Group getGroup() { return cGroup; }
		
		//'<Value'
		public Keyword getValueKeyword_0() { return cValueKeyword_0; }
		
		//'name='
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
		
		//raw=INTEGER
		public Assignment getRawAssignment_4() { return cRawAssignment_4; }
		
		//INTEGER
		public RuleCall getRawINTEGERParserRuleCall_4_0() { return cRawINTEGERParserRuleCall_4_0; }
		
		//'</Value>'
		public Keyword getValueKeyword_5() { return cValueKeyword_5; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.enum_.ENUM.INTEGER");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cHEXADECIMALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//INTEGER:
		//	'-'? INT | HEXADECIMAL;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT | HEXADECIMAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'? INT
		public Group getGroup_0() { return cGroup_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0_0() { return cHyphenMinusKeyword_0_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_1() { return cINTTerminalRuleCall_0_1; }
		
		//HEXADECIMAL
		public RuleCall getHEXADECIMALTerminalRuleCall_1() { return cHEXADECIMALTerminalRuleCall_1; }
	}
	
	
	private final TMTCIFEnumElements pTMTCIFEnum;
	private final TMTCIFEnumValueElements pTMTCIFEnumValue;
	private final INTEGERElements pINTEGER;
	private final TerminalRule tHEXADECIMAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ENUMGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTMTCIFEnum = new TMTCIFEnumElements();
		this.pTMTCIFEnumValue = new TMTCIFEnumValueElements();
		this.pINTEGER = new INTEGERElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.enum_.ENUM.HEXADECIMAL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.tmtcif.lang.enum_.ENUM".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//TMTCIFEnum:
	//	'<Enum'
	//	'name=' name=STRING
	//	'>'
	//	values+=TMTCIFEnumValue+
	//	'</Enum>';
	public TMTCIFEnumElements getTMTCIFEnumAccess() {
		return pTMTCIFEnum;
	}
	
	public ParserRule getTMTCIFEnumRule() {
		return getTMTCIFEnumAccess().getRule();
	}
	
	//TMTCIFEnumValue:
	//	'<Value'
	//	'name=' name=STRING
	//	'>'
	//	raw=INTEGER
	//	'</Value>';
	public TMTCIFEnumValueElements getTMTCIFEnumValueAccess() {
		return pTMTCIFEnumValue;
	}
	
	public ParserRule getTMTCIFEnumValueRule() {
		return getTMTCIFEnumValueAccess().getRule();
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
