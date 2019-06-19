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
package es.uah.aut.srg.tmtcif.lang.filter.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FILTERGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TMTCIFModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsTMTCIFModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementTMTCIFFilterFilterParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//TMTCIFModelFile common::TMTCIFModelFile:
		//	imports+=TMTCIFModelFileImport*
		//	element=TMTCIFFilterFilter
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=TMTCIFModelFileImport* element=TMTCIFFilterFilter
		public Group getGroup() { return cGroup; }
		
		//imports+=TMTCIFModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//TMTCIFModelFileImport
		public RuleCall getImportsTMTCIFModelFileImportParserRuleCall_0_0() { return cImportsTMTCIFModelFileImportParserRuleCall_0_0; }
		
		//element=TMTCIFFilterFilter
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//TMTCIFFilterFilter
		public RuleCall getElementTMTCIFFilterFilterParserRuleCall_1_0() { return cElementTMTCIFFilterFilterParserRuleCall_1_0; }
	}
	public class TMTCIFModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFModelFileImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImportURIAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportURISTRINGTerminalRuleCall_2_0 = (RuleCall)cImportURIAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TMTCIFModelFileImport common::TMTCIFModelFileImport:
		//	'import' ':=' importURI=STRING ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ':=' importURI=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_1() { return cColonEqualsSignKeyword_1; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_2() { return cImportURIAssignment_2; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_2_0() { return cImportURISTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class TMTCIFFilterFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFilterMaxtermFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFilterMintermFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TMTCIFFilterFilter:
		//	TMTCIFFilterMaxtermFilter | TMTCIFFilterMintermFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFilterMaxtermFilter | TMTCIFFilterMintermFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFilterMaxtermFilter
		public RuleCall getTMTCIFFilterMaxtermFilterParserRuleCall_0() { return cTMTCIFFilterMaxtermFilterParserRuleCall_0; }
		
		//TMTCIFFilterMintermFilter
		public RuleCall getTMTCIFFilterMintermFilterParserRuleCall_1() { return cTMTCIFFilterMintermFilterParserRuleCall_1; }
	}
	public class TMTCIFFilterMaxtermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMaxtermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterMaxtermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cUriKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cUriAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_0_2_0 = (RuleCall)cUriAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cGroup_3_1.eContents().get(0);
		private final Keyword cVersionKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_0_2_0 = (RuleCall)cVersionAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Keyword cFormatFileKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cFormatFileAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final CrossReference cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0 = (CrossReference)cFormatFileAssignment_3_1_3.eContents().get(0);
		private final RuleCall cFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1 = (RuleCall)cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Alternatives cAlternatives_3_1_5 = (Alternatives)cGroup_3_1.eContents().get(5);
		private final Assignment cBoolVarAssignment_3_1_5_0 = (Assignment)cAlternatives_3_1_5.eContents().get(0);
		private final RuleCall cBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0 = (RuleCall)cBoolVarAssignment_3_1_5_0.eContents().get(0);
		private final Assignment cBoolVarFromArrayItemAssignment_3_1_5_1 = (Assignment)cAlternatives_3_1_5.eContents().get(1);
		private final RuleCall cBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0 = (RuleCall)cBoolVarFromArrayItemAssignment_3_1_5_1.eContents().get(0);
		private final Assignment cBoolVarFromGroupedArrayItemAssignment_3_1_5_2 = (Assignment)cAlternatives_3_1_5.eContents().get(2);
		private final RuleCall cBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0 = (RuleCall)cBoolVarFromGroupedArrayItemAssignment_3_1_5_2.eContents().get(0);
		private final Assignment cBoolVarFDICAssignment_3_1_5_3 = (Assignment)cAlternatives_3_1_5.eContents().get(3);
		private final RuleCall cBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0 = (RuleCall)cBoolVarFDICAssignment_3_1_5_3.eContents().get(0);
		private final Assignment cMaxtermAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0 = (RuleCall)cMaxtermAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TMTCIFFilterMaxtermFilter:
		//	'TMTCIFFilterMaxtermFilter'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//	'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//	BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//	BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		//	Maxterm+=TMTCIFFilterMaxterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterMaxtermFilter' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		//Maxterm+=TMTCIFFilterMaxterm+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterMaxtermFilter'
		public Keyword getTMTCIFFilterMaxtermFilterKeyword_0() { return cTMTCIFFilterMaxtermFilterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';') 'formatFile' ':='
		//formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'uri' ':=' uri=QualifiedName ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'uri'
		public Keyword getUriKeyword_3_0_0() { return cUriKeyword_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_0_2() { return cUriAssignment_3_0_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_0_2_0() { return cUriQualifiedNameParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';' (BoolVar+=TMTCIFFilterBoolVar | BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//('version' ':=' version=Version ';')
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0_0() { return cVersionKeyword_3_1_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_0_1() { return cColonEqualsSignKeyword_3_1_0_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_0_2() { return cVersionAssignment_3_1_0_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_0_2_0() { return cVersionVersionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//'formatFile'
		public Keyword getFormatFileKeyword_3_1_1() { return cFormatFileKeyword_3_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_2() { return cColonEqualsSignKeyword_3_1_2; }
		
		//formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getFormatFileAssignment_3_1_3() { return cFormatFileAssignment_3_1_3; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0() { return cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0; }
		
		//VersionedQualifiedName
		public RuleCall getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1() { return cFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }
		
		//(BoolVar+=TMTCIFFilterBoolVar | BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+
		public Alternatives getAlternatives_3_1_5() { return cAlternatives_3_1_5; }
		
		//BoolVar+=TMTCIFFilterBoolVar
		public Assignment getBoolVarAssignment_3_1_5_0() { return cBoolVarAssignment_3_1_5_0; }
		
		//TMTCIFFilterBoolVar
		public RuleCall getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0() { return cBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0; }
		
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem
		public Assignment getBoolVarFromArrayItemAssignment_3_1_5_1() { return cBoolVarFromArrayItemAssignment_3_1_5_1; }
		
		//TMTCIFFilterBoolVarFromArrayItem
		public RuleCall getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0() { return cBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0; }
		
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem
		public Assignment getBoolVarFromGroupedArrayItemAssignment_3_1_5_2() { return cBoolVarFromGroupedArrayItemAssignment_3_1_5_2; }
		
		//TMTCIFFilterBoolVarFromGroupedArrayItem
		public RuleCall getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0() { return cBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0; }
		
		//BoolVarFDIC+=TMTCIFFilterBoolVarFDIC
		public Assignment getBoolVarFDICAssignment_3_1_5_3() { return cBoolVarFDICAssignment_3_1_5_3; }
		
		//TMTCIFFilterBoolVarFDIC
		public RuleCall getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0() { return cBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0; }
		
		//Maxterm+=TMTCIFFilterMaxterm+
		public Assignment getMaxtermAssignment_4() { return cMaxtermAssignment_4; }
		
		//TMTCIFFilterMaxterm
		public RuleCall getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0() { return cMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class TMTCIFFilterMintermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMintermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterMintermFilterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Keyword cUriKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cUriAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cUriQualifiedNameParserRuleCall_3_0_2_0 = (RuleCall)cUriAssignment_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_3 = (Keyword)cGroup_3_0.eContents().get(3);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Group cGroup_3_1_0 = (Group)cGroup_3_1.eContents().get(0);
		private final Keyword cVersionKeyword_3_1_0_0 = (Keyword)cGroup_3_1_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_0_1 = (Keyword)cGroup_3_1_0.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_0_2 = (Assignment)cGroup_3_1_0.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_0_2_0 = (RuleCall)cVersionAssignment_3_1_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_0_3 = (Keyword)cGroup_3_1_0.eContents().get(3);
		private final Keyword cFormatFileKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Keyword cColonEqualsSignKeyword_3_1_2 = (Keyword)cGroup_3_1.eContents().get(2);
		private final Assignment cFormatFileAssignment_3_1_3 = (Assignment)cGroup_3_1.eContents().get(3);
		private final CrossReference cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0 = (CrossReference)cFormatFileAssignment_3_1_3.eContents().get(0);
		private final RuleCall cFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1 = (RuleCall)cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3_1_4 = (Keyword)cGroup_3_1.eContents().get(4);
		private final Alternatives cAlternatives_3_1_5 = (Alternatives)cGroup_3_1.eContents().get(5);
		private final Assignment cBoolVarAssignment_3_1_5_0 = (Assignment)cAlternatives_3_1_5.eContents().get(0);
		private final RuleCall cBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0 = (RuleCall)cBoolVarAssignment_3_1_5_0.eContents().get(0);
		private final Assignment cBoolVarFromArrayItemAssignment_3_1_5_1 = (Assignment)cAlternatives_3_1_5.eContents().get(1);
		private final RuleCall cBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0 = (RuleCall)cBoolVarFromArrayItemAssignment_3_1_5_1.eContents().get(0);
		private final Assignment cBoolVarFromGroupedArrayItemAssignment_3_1_5_2 = (Assignment)cAlternatives_3_1_5.eContents().get(2);
		private final RuleCall cBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0 = (RuleCall)cBoolVarFromGroupedArrayItemAssignment_3_1_5_2.eContents().get(0);
		private final Assignment cBoolVarFDICAssignment_3_1_5_3 = (Assignment)cAlternatives_3_1_5.eContents().get(3);
		private final RuleCall cBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0 = (RuleCall)cBoolVarFDICAssignment_3_1_5_3.eContents().get(0);
		private final Assignment cMintermAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMintermTMTCIFFilterMintermParserRuleCall_4_0 = (RuleCall)cMintermAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TMTCIFFilterMintermFilter:
		//	'TMTCIFFilterMintermFilter'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//	'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//	BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//	BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		//	Minterm+=TMTCIFFilterMinterm+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterMintermFilter' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
		//'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		//Minterm+=TMTCIFFilterMinterm+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterMintermFilter'
		public Keyword getTMTCIFFilterMintermFilterKeyword_0() { return cTMTCIFFilterMintermFilterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';') 'formatFile' ':='
		//formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }
		
		//'uri' ':=' uri=QualifiedName ';'
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'uri'
		public Keyword getUriKeyword_3_0_0() { return cUriKeyword_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_0_1() { return cColonEqualsSignKeyword_3_0_1; }
		
		//uri=QualifiedName
		public Assignment getUriAssignment_3_0_2() { return cUriAssignment_3_0_2; }
		
		//QualifiedName
		public RuleCall getUriQualifiedNameParserRuleCall_3_0_2_0() { return cUriQualifiedNameParserRuleCall_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_0_3() { return cSemicolonKeyword_3_0_3; }
		
		//('version' ':=' version=Version ';') 'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		//';' (BoolVar+=TMTCIFFilterBoolVar | BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//('version' ':=' version=Version ';')
		public Group getGroup_3_1_0() { return cGroup_3_1_0; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0_0() { return cVersionKeyword_3_1_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_0_1() { return cColonEqualsSignKeyword_3_1_0_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_0_2() { return cVersionAssignment_3_1_0_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_0_2_0() { return cVersionVersionParserRuleCall_3_1_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_0_3() { return cSemicolonKeyword_3_1_0_3; }
		
		//'formatFile'
		public Keyword getFormatFileKeyword_3_1_1() { return cFormatFileKeyword_3_1_1; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_2() { return cColonEqualsSignKeyword_3_1_2; }
		
		//formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getFormatFileAssignment_3_1_3() { return cFormatFileAssignment_3_1_3; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0() { return cFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0; }
		
		//VersionedQualifiedName
		public RuleCall getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1() { return cFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_4() { return cSemicolonKeyword_3_1_4; }
		
		//(BoolVar+=TMTCIFFilterBoolVar | BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+
		public Alternatives getAlternatives_3_1_5() { return cAlternatives_3_1_5; }
		
		//BoolVar+=TMTCIFFilterBoolVar
		public Assignment getBoolVarAssignment_3_1_5_0() { return cBoolVarAssignment_3_1_5_0; }
		
		//TMTCIFFilterBoolVar
		public RuleCall getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0() { return cBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0; }
		
		//BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem
		public Assignment getBoolVarFromArrayItemAssignment_3_1_5_1() { return cBoolVarFromArrayItemAssignment_3_1_5_1; }
		
		//TMTCIFFilterBoolVarFromArrayItem
		public RuleCall getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0() { return cBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0; }
		
		//BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem
		public Assignment getBoolVarFromGroupedArrayItemAssignment_3_1_5_2() { return cBoolVarFromGroupedArrayItemAssignment_3_1_5_2; }
		
		//TMTCIFFilterBoolVarFromGroupedArrayItem
		public RuleCall getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0() { return cBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0; }
		
		//BoolVarFDIC+=TMTCIFFilterBoolVarFDIC
		public Assignment getBoolVarFDICAssignment_3_1_5_3() { return cBoolVarFDICAssignment_3_1_5_3; }
		
		//TMTCIFFilterBoolVarFDIC
		public RuleCall getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0() { return cBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0; }
		
		//Minterm+=TMTCIFFilterMinterm+
		public Assignment getMintermAssignment_4() { return cMintermAssignment_4; }
		
		//TMTCIFFilterMinterm
		public RuleCall getMintermTMTCIFFilterMintermParserRuleCall_4_0() { return cMintermTMTCIFFilterMintermParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class TMTCIFFilterBoolVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterBoolVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cFieldRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cFieldRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cFieldRefTMTCIFFormatFieldCrossReference_16_0 = (CrossReference)cFieldRefAssignment_16.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1 = (RuleCall)cFieldRefTMTCIFFormatFieldCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cOpAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cOpTMTCIFFilterFieldOpParserRuleCall_18_0 = (RuleCall)cOpAssignment_18.eContents().get(0);
		private final Alternatives cAlternatives_19 = (Alternatives)cGroup.eContents().get(19);
		private final Assignment cConstantAssignment_19_0 = (Assignment)cAlternatives_19.eContents().get(0);
		private final RuleCall cConstantTMTCIFFilterConstantParserRuleCall_19_0_0 = (RuleCall)cConstantAssignment_19_0.eContents().get(0);
		private final Assignment cSelectAssignment_19_1 = (Assignment)cAlternatives_19.eContents().get(1);
		private final RuleCall cSelectTMTCIFFilterSelectParserRuleCall_19_1_0 = (RuleCall)cSelectAssignment_19_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_19_2 = (Assignment)cAlternatives_19.eContents().get(2);
		private final RuleCall cSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0 = (RuleCall)cSelectLineAssignment_19_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//TMTCIFFilterBoolVar:
		//	'TMTCIFFilterBoolVar' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
		//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
		//	SelectLine=TMTCIFFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterBoolVar' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=TMTCIFFilterConstantType ';' 'FieldRef' ':='
		//FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' Op=TMTCIFFilterFieldOp
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterBoolVar'
		public Keyword getTMTCIFFilterBoolVarKeyword_0() { return cTMTCIFFilterBoolVarKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=TMTCIFFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//TMTCIFFilterConstantType
		public RuleCall getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_14() { return cFieldRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_16() { return cFieldRefAssignment_16; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefTMTCIFFormatFieldCrossReference_16_0() { return cFieldRefTMTCIFFormatFieldCrossReference_16_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1() { return cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//Op=TMTCIFFilterFieldOp
		public Assignment getOpAssignment_18() { return cOpAssignment_18; }
		
		//TMTCIFFilterFieldOp
		public RuleCall getOpTMTCIFFilterFieldOpParserRuleCall_18_0() { return cOpTMTCIFFilterFieldOpParserRuleCall_18_0; }
		
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
		public Alternatives getAlternatives_19() { return cAlternatives_19; }
		
		//Constant=TMTCIFFilterConstant
		public Assignment getConstantAssignment_19_0() { return cConstantAssignment_19_0; }
		
		//TMTCIFFilterConstant
		public RuleCall getConstantTMTCIFFilterConstantParserRuleCall_19_0_0() { return cConstantTMTCIFFilterConstantParserRuleCall_19_0_0; }
		
		//Select=TMTCIFFilterSelect
		public Assignment getSelectAssignment_19_1() { return cSelectAssignment_19_1; }
		
		//TMTCIFFilterSelect
		public RuleCall getSelectTMTCIFFilterSelectParserRuleCall_19_1_0() { return cSelectTMTCIFFilterSelectParserRuleCall_19_1_0; }
		
		//SelectLine=TMTCIFFilterSelectLine
		public Assignment getSelectLineAssignment_19_2() { return cSelectLineAssignment_19_2; }
		
		//TMTCIFFilterSelectLine
		public RuleCall getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0() { return cSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class TMTCIFFilterBoolVarFromArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromArrayItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterBoolVarFromArrayItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cAIFieldRefKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cAIFieldRefAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final CrossReference cAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0 = (CrossReference)cAIFieldRefAssignment_16.eContents().get(0);
		private final RuleCall cAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1 = (RuleCall)cAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cOpAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final RuleCall cOpTMTCIFFilterFieldOpParserRuleCall_18_0 = (RuleCall)cOpAssignment_18.eContents().get(0);
		private final Alternatives cAlternatives_19 = (Alternatives)cGroup.eContents().get(19);
		private final Assignment cConstantAssignment_19_0 = (Assignment)cAlternatives_19.eContents().get(0);
		private final RuleCall cConstantTMTCIFFilterConstantParserRuleCall_19_0_0 = (RuleCall)cConstantAssignment_19_0.eContents().get(0);
		private final Assignment cSelectAssignment_19_1 = (Assignment)cAlternatives_19.eContents().get(1);
		private final RuleCall cSelectTMTCIFFilterSelectParserRuleCall_19_1_0 = (RuleCall)cSelectAssignment_19_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_19_2 = (Assignment)cAlternatives_19.eContents().get(2);
		private final RuleCall cSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0 = (RuleCall)cSelectLineAssignment_19_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		
		//TMTCIFFilterBoolVarFromArrayItem:
		//	'TMTCIFFilterBoolVarFromArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
		//	'AIFieldRef' ':=' AIFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
		//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
		//	SelectLine=TMTCIFFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterBoolVarFromArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=TMTCIFFilterConstantType ';' 'AIFieldRef' ':='
		//AIFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';' Op=TMTCIFFilterFieldOp
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterBoolVarFromArrayItem'
		public Keyword getTMTCIFFilterBoolVarFromArrayItemKeyword_0() { return cTMTCIFFilterBoolVarFromArrayItemKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=TMTCIFFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//TMTCIFFilterConstantType
		public RuleCall getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'AIFieldRef'
		public Keyword getAIFieldRefKeyword_14() { return cAIFieldRefKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//AIFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public Assignment getAIFieldRefAssignment_16() { return cAIFieldRefAssignment_16; }
		
		//[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public CrossReference getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0() { return cAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1() { return cAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//Op=TMTCIFFilterFieldOp
		public Assignment getOpAssignment_18() { return cOpAssignment_18; }
		
		//TMTCIFFilterFieldOp
		public RuleCall getOpTMTCIFFilterFieldOpParserRuleCall_18_0() { return cOpTMTCIFFilterFieldOpParserRuleCall_18_0; }
		
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
		public Alternatives getAlternatives_19() { return cAlternatives_19; }
		
		//Constant=TMTCIFFilterConstant
		public Assignment getConstantAssignment_19_0() { return cConstantAssignment_19_0; }
		
		//TMTCIFFilterConstant
		public RuleCall getConstantTMTCIFFilterConstantParserRuleCall_19_0_0() { return cConstantTMTCIFFilterConstantParserRuleCall_19_0_0; }
		
		//Select=TMTCIFFilterSelect
		public Assignment getSelectAssignment_19_1() { return cSelectAssignment_19_1; }
		
		//TMTCIFFilterSelect
		public RuleCall getSelectTMTCIFFilterSelectParserRuleCall_19_1_0() { return cSelectTMTCIFFilterSelectParserRuleCall_19_1_0; }
		
		//SelectLine=TMTCIFFilterSelectLine
		public Assignment getSelectLineAssignment_19_2() { return cSelectLineAssignment_19_2; }
		
		//TMTCIFFilterSelectLine
		public RuleCall getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0() { return cSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
	}
	public class TMTCIFFilterBoolVarFromGroupedArrayItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromGroupedArrayItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cConstantTypeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cConstantTypeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0 = (RuleCall)cConstantTypeAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cGroupKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cColonEqualsSignKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cGroupAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cGroupIDTerminalRuleCall_16_0 = (RuleCall)cGroupAssignment_16.eContents().get(0);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cAIFieldRefsKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cColonEqualsSignKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Assignment cAIFieldRefsAssignment_20 = (Assignment)cGroup.eContents().get(20);
		private final CrossReference cAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0 = (CrossReference)cAIFieldRefsAssignment_20.eContents().get(0);
		private final RuleCall cAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1 = (RuleCall)cAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_21 = (Keyword)cGroup.eContents().get(21);
		private final Assignment cOpAssignment_22 = (Assignment)cGroup.eContents().get(22);
		private final RuleCall cOpTMTCIFFilterFieldOpParserRuleCall_22_0 = (RuleCall)cOpAssignment_22.eContents().get(0);
		private final Alternatives cAlternatives_23 = (Alternatives)cGroup.eContents().get(23);
		private final Assignment cConstantAssignment_23_0 = (Assignment)cAlternatives_23.eContents().get(0);
		private final RuleCall cConstantTMTCIFFilterConstantParserRuleCall_23_0_0 = (RuleCall)cConstantAssignment_23_0.eContents().get(0);
		private final Assignment cSelectAssignment_23_1 = (Assignment)cAlternatives_23.eContents().get(1);
		private final RuleCall cSelectTMTCIFFilterSelectParserRuleCall_23_1_0 = (RuleCall)cSelectAssignment_23_1.eContents().get(0);
		private final Assignment cSelectLineAssignment_23_2 = (Assignment)cAlternatives_23.eContents().get(2);
		private final RuleCall cSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0 = (RuleCall)cSelectLineAssignment_23_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Keyword cSemicolonKeyword_25 = (Keyword)cGroup.eContents().get(25);
		
		//TMTCIFFilterBoolVarFromGroupedArrayItem:
		//	'TMTCIFFilterBoolVarFromGroupedArrayItem' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
		//	'group' ':=' group=ID ';'
		//	'AIFieldRefs' ':=' AIFieldRefs=[format::TMTCIFFormatAField|VersionedQualifiedReferenceName] ';'
		//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
		//	SelectLine=TMTCIFFilterSelectLine)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterBoolVarFromGroupedArrayItem' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'constantType' ':='
		//constantType=TMTCIFFilterConstantType ';' 'group' ':=' group=ID ';' 'AIFieldRefs' ':='
		//AIFieldRefs=[format::TMTCIFFormatAField|VersionedQualifiedReferenceName] ';' Op=TMTCIFFilterFieldOp
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterBoolVarFromGroupedArrayItem'
		public Keyword getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0() { return cTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'constantType'
		public Keyword getConstantTypeKeyword_10() { return cConstantTypeKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//constantType=TMTCIFFilterConstantType
		public Assignment getConstantTypeAssignment_12() { return cConstantTypeAssignment_12; }
		
		//TMTCIFFilterConstantType
		public RuleCall getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0() { return cConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'group'
		public Keyword getGroupKeyword_14() { return cGroupKeyword_14; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15() { return cColonEqualsSignKeyword_15; }
		
		//group=ID
		public Assignment getGroupAssignment_16() { return cGroupAssignment_16; }
		
		//ID
		public RuleCall getGroupIDTerminalRuleCall_16_0() { return cGroupIDTerminalRuleCall_16_0; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
		
		//'AIFieldRefs'
		public Keyword getAIFieldRefsKeyword_18() { return cAIFieldRefsKeyword_18; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_19() { return cColonEqualsSignKeyword_19; }
		
		//AIFieldRefs=[format::TMTCIFFormatAField|VersionedQualifiedReferenceName]
		public Assignment getAIFieldRefsAssignment_20() { return cAIFieldRefsAssignment_20; }
		
		//[format::TMTCIFFormatAField|VersionedQualifiedReferenceName]
		public CrossReference getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0() { return cAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1() { return cAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_21() { return cSemicolonKeyword_21; }
		
		//Op=TMTCIFFilterFieldOp
		public Assignment getOpAssignment_22() { return cOpAssignment_22; }
		
		//TMTCIFFilterFieldOp
		public RuleCall getOpTMTCIFFilterFieldOpParserRuleCall_22_0() { return cOpTMTCIFFilterFieldOpParserRuleCall_22_0; }
		
		//(Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect | SelectLine=TMTCIFFilterSelectLine)
		public Alternatives getAlternatives_23() { return cAlternatives_23; }
		
		//Constant=TMTCIFFilterConstant
		public Assignment getConstantAssignment_23_0() { return cConstantAssignment_23_0; }
		
		//TMTCIFFilterConstant
		public RuleCall getConstantTMTCIFFilterConstantParserRuleCall_23_0_0() { return cConstantTMTCIFFilterConstantParserRuleCall_23_0_0; }
		
		//Select=TMTCIFFilterSelect
		public Assignment getSelectAssignment_23_1() { return cSelectAssignment_23_1; }
		
		//TMTCIFFilterSelect
		public RuleCall getSelectTMTCIFFilterSelectParserRuleCall_23_1_0() { return cSelectTMTCIFFilterSelectParserRuleCall_23_1_0; }
		
		//SelectLine=TMTCIFFilterSelectLine
		public Assignment getSelectLineAssignment_23_2() { return cSelectLineAssignment_23_2; }
		
		//TMTCIFFilterSelectLine
		public RuleCall getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0() { return cSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_24() { return cRightCurlyBracketKeyword_24; }
		
		//';'
		public Keyword getSemicolonKeyword_25() { return cSemicolonKeyword_25; }
	}
	public class TMTCIFFilterBoolVarFDICElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFDIC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterBoolVarFDICKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cNameKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cNameAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cNameIDTerminalRuleCall_8_0 = (RuleCall)cNameAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cFieldRefKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cFieldRefAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final CrossReference cFieldRefTMTCIFFormatFDICFieldCrossReference_12_0 = (CrossReference)cFieldRefAssignment_12.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1 = (RuleCall)cFieldRefTMTCIFFormatFDICFieldCrossReference_12_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Assignment cOpAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cOpTMTCIFFilterFieldOpParserRuleCall_14_0 = (RuleCall)cOpAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//TMTCIFFilterBoolVarFDIC:
		//	'TMTCIFFilterBoolVarFDIC' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'name' ':=' name=ID ';'
		//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatFDICField|VersionedQualifiedReferenceName] ';'
		//	Op=TMTCIFFilterFieldOp
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterBoolVarFDIC' '{' 'id' ':=' id=INTEGER ';' 'name' ':=' name=ID ';' 'FieldRef' ':='
		//FieldRef=[format::TMTCIFFormatFDICField|VersionedQualifiedReferenceName] ';' Op=TMTCIFFilterFieldOp '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterBoolVarFDIC'
		public Keyword getTMTCIFFilterBoolVarFDICKeyword_0() { return cTMTCIFFilterBoolVarFDICKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'name'
		public Keyword getNameKeyword_6() { return cNameKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//name=ID
		public Assignment getNameAssignment_8() { return cNameAssignment_8; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_8_0() { return cNameIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_10() { return cFieldRefKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//FieldRef=[format::TMTCIFFormatFDICField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_12() { return cFieldRefAssignment_12; }
		
		//[format::TMTCIFFormatFDICField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0() { return cFieldRefTMTCIFFormatFDICFieldCrossReference_12_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1() { return cFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//Op=TMTCIFFilterFieldOp
		public Assignment getOpAssignment_14() { return cOpAssignment_14; }
		
		//TMTCIFFilterFieldOp
		public RuleCall getOpTMTCIFFilterFieldOpParserRuleCall_14_0() { return cOpTMTCIFFilterFieldOpParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class TMTCIFFilterFieldOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterFieldOpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeTMTCIFFilterOPTypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TMTCIFFilterFieldOp:
		//	'TMTCIFFilterFieldOp' '{'
		//	'type' ':=' type=TMTCIFFilterOPType ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterFieldOp' '{' 'type' ':=' type=TMTCIFFilterOPType ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterFieldOp'
		public Keyword getTMTCIFFilterFieldOpKeyword_0() { return cTMTCIFFilterFieldOpKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//type=TMTCIFFilterOPType
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//TMTCIFFilterOPType
		public RuleCall getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0() { return cTypeTMTCIFFilterOPTypeEnumRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class TMTCIFFilterConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterConstantKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMaskKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cMaskAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_6_2_0 = (RuleCall)cMaskAssignment_6_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//TMTCIFFilterConstant:
		//	'TMTCIFFilterConstant' '{'
		//	'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterConstant' '{' 'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterConstant'
		public Keyword getTMTCIFFilterConstantKeyword_0() { return cTMTCIFFilterConstantKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'value'
		public Keyword getValueKeyword_2() { return cValueKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//value=INTEGER
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//INTEGER
		public RuleCall getValueINTEGERParserRuleCall_4_0() { return cValueINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'mask'
		public Keyword getMaskKeyword_6_0() { return cMaskKeyword_6_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_6_1() { return cColonEqualsSignKeyword_6_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_6_2() { return cMaskAssignment_6_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_6_2_0() { return cMaskHEXADECIMALTerminalRuleCall_6_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class TMTCIFFilterSelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFromFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFromFileIDTerminalRuleCall_4_0 = (RuleCall)cFromFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cOffsetKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cOffsetAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cOffsetINTEGERParserRuleCall_10_2_0 = (RuleCall)cOffsetAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cSizeKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cSizeAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cSizeINTEGERParserRuleCall_11_2_0 = (RuleCall)cSizeAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cMaskKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cMaskAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_12_2_0 = (RuleCall)cMaskAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//TMTCIFFilterSelect:
		//	'TMTCIFFilterSelect' '{'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'type' ':=' type=TMTCIFFilterSelectType ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
		//	('mask' ':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterSelect' '{' 'fromFile' ':=' fromFile=ID ';' 'type' ':=' type=TMTCIFFilterSelectType ';' ('offset' ':='
		//offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterSelect'
		public Keyword getTMTCIFFilterSelectKeyword_0() { return cTMTCIFFilterSelectKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fromFile'
		public Keyword getFromFileKeyword_2() { return cFromFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_4() { return cFromFileAssignment_4; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_4_0() { return cFromFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'type'
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//type=TMTCIFFilterSelectType
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }
		
		//TMTCIFFilterSelectType
		public RuleCall getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0() { return cTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('offset' ':=' offset=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'offset'
		public Keyword getOffsetKeyword_10_0() { return cOffsetKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_10_2() { return cOffsetAssignment_10_2; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_10_2_0() { return cOffsetINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('size' ':=' size=INTEGER ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'size'
		public Keyword getSizeKeyword_11_0() { return cSizeKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_11_2() { return cSizeAssignment_11_2; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_11_2_0() { return cSizeINTEGERParserRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'mask'
		public Keyword getMaskKeyword_12_0() { return cMaskKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_12_2() { return cMaskAssignment_12_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_12_2_0() { return cMaskHEXADECIMALTerminalRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class TMTCIFFilterSelectLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterSelectLineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFromFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFromFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFromFileIDTerminalRuleCall_4_0 = (RuleCall)cFromFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLineKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLineAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLineINTEGERParserRuleCall_8_0 = (RuleCall)cLineAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cLeftTrimKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cLeftTrimAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cLeftTrimINTEGERParserRuleCall_10_2_0 = (RuleCall)cLeftTrimAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cRightTrimKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cRightTrimAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cRightTrimINTEGERParserRuleCall_11_2_0 = (RuleCall)cRightTrimAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cMaskKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cMaskAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cMaskHEXADECIMALTerminalRuleCall_12_2_0 = (RuleCall)cMaskAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//TMTCIFFilterSelectLine:
		//	'TMTCIFFilterSelectLine'
		//	'{'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'line' ':=' line=INTEGER ';' ('leftTrim' ':=' leftTrim=INTEGER ';')? ('rightTrim' ':=' rightTrim=INTEGER ';')?
		//	('mask' ':=' mask=HEXADECIMAL ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterSelectLine' '{' 'fromFile' ':=' fromFile=ID ';' 'line' ':=' line=INTEGER ';' ('leftTrim' ':='
		//leftTrim=INTEGER ';')? ('rightTrim' ':=' rightTrim=INTEGER ';')? ('mask' ':=' mask=HEXADECIMAL ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterSelectLine'
		public Keyword getTMTCIFFilterSelectLineKeyword_0() { return cTMTCIFFilterSelectLineKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fromFile'
		public Keyword getFromFileKeyword_2() { return cFromFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_4() { return cFromFileAssignment_4; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_4_0() { return cFromFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'line'
		public Keyword getLineKeyword_6() { return cLineKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//line=INTEGER
		public Assignment getLineAssignment_8() { return cLineAssignment_8; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_8_0() { return cLineINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('leftTrim' ':=' leftTrim=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'leftTrim'
		public Keyword getLeftTrimKeyword_10_0() { return cLeftTrimKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//leftTrim=INTEGER
		public Assignment getLeftTrimAssignment_10_2() { return cLeftTrimAssignment_10_2; }
		
		//INTEGER
		public RuleCall getLeftTrimINTEGERParserRuleCall_10_2_0() { return cLeftTrimINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('rightTrim' ':=' rightTrim=INTEGER ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'rightTrim'
		public Keyword getRightTrimKeyword_11_0() { return cRightTrimKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//rightTrim=INTEGER
		public Assignment getRightTrimAssignment_11_2() { return cRightTrimAssignment_11_2; }
		
		//INTEGER
		public RuleCall getRightTrimINTEGERParserRuleCall_11_2_0() { return cRightTrimINTEGERParserRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//('mask' ':=' mask=HEXADECIMAL ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'mask'
		public Keyword getMaskKeyword_12_0() { return cMaskKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//mask=HEXADECIMAL
		public Assignment getMaskAssignment_12_2() { return cMaskAssignment_12_2; }
		
		//HEXADECIMAL
		public RuleCall getMaskHEXADECIMALTerminalRuleCall_12_2_0() { return cMaskHEXADECIMALTerminalRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class TMTCIFFilterMaxtermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMaxterm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterMaxtermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBoolVarRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0 = (RuleCall)cBoolVarRefAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//TMTCIFFilterMaxterm:
		//	'TMTCIFFilterMaxterm' '{'
		//	'id' ':=' id=INTEGER ';'
		//	BoolVarRef+=TMTCIFFilterBoolVarRef+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterMaxterm' '{' 'id' ':=' id=INTEGER ';' BoolVarRef+=TMTCIFFilterBoolVarRef+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterMaxterm'
		public Keyword getTMTCIFFilterMaxtermKeyword_0() { return cTMTCIFFilterMaxtermKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//BoolVarRef+=TMTCIFFilterBoolVarRef+
		public Assignment getBoolVarRefAssignment_6() { return cBoolVarRefAssignment_6; }
		
		//TMTCIFFilterBoolVarRef
		public RuleCall getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0() { return cBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class TMTCIFFilterMintermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMinterm");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterMintermKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBoolVarRefAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0 = (RuleCall)cBoolVarRefAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//TMTCIFFilterMinterm:
		//	'TMTCIFFilterMinterm' '{'
		//	'id' ':=' id=INTEGER ';'
		//	BoolVarRef+=TMTCIFFilterBoolVarRef+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterMinterm' '{' 'id' ':=' id=INTEGER ';' BoolVarRef+=TMTCIFFilterBoolVarRef+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterMinterm'
		public Keyword getTMTCIFFilterMintermKeyword_0() { return cTMTCIFFilterMintermKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'id'
		public Keyword getIdKeyword_2() { return cIdKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//id=INTEGER
		public Assignment getIdAssignment_4() { return cIdAssignment_4; }
		
		//INTEGER
		public RuleCall getIdINTEGERParserRuleCall_4_0() { return cIdINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//BoolVarRef+=TMTCIFFilterBoolVarRef+
		public Assignment getBoolVarRefAssignment_6() { return cBoolVarRefAssignment_6; }
		
		//TMTCIFFilterBoolVarRef
		public RuleCall getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0() { return cBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
	}
	public class TMTCIFFilterBoolVarRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFilterBoolVarRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdRefINTEGERParserRuleCall_4_0 = (RuleCall)cIdRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TMTCIFFilterBoolVarRef:
		//	'TMTCIFFilterBoolVarRef' '{'
		//	'idRef' ':=' idRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFilterBoolVarRef' '{' 'idRef' ':=' idRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFilterBoolVarRef'
		public Keyword getTMTCIFFilterBoolVarRefKeyword_0() { return cTMTCIFFilterBoolVarRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'idRef'
		public Keyword getIdRefKeyword_2() { return cIdRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//idRef=INTEGER
		public Assignment getIdRefAssignment_4() { return cIdRefAssignment_4; }
		
		//INTEGER
		public RuleCall getIdRefINTEGERParserRuleCall_4_0() { return cIdRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1_1_1 = (RuleCall)cGroup_1_1_1.eContents().get(1);
		
		//Version:
		//	(INT | INT? ID) ('.' (INT | INT? ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//(INT | INT? ID) ('.' (INT | INT? ID))*
		public Group getGroup() { return cGroup; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0_0() { return cINTTerminalRuleCall_0_0; }
		
		//INT? ID
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0_1_0() { return cINTTerminalRuleCall_0_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }
		
		//('.' (INT | INT? ID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//(INT | INT? ID)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1_0() { return cINTTerminalRuleCall_1_1_0; }
		
		//INT? ID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1_1_1_0() { return cINTTerminalRuleCall_1_1_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1_1_1() { return cIDTerminalRuleCall_1_1_1_1; }
	}
	public class VersionedQualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.VersionedQualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VersionedQualifiedName:
		//	QualifiedName '(' Version ')';
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '(' Version ')'
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//Version
		public RuleCall getVersionParserRuleCall_2() { return cVersionParserRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class VersionedQualifiedReferenceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.VersionedQualifiedReferenceName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cVersionedQualifiedNameParserRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//VersionedQualifiedReferenceName:
		//	(VersionedQualifiedName '::')? ID ('::' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(VersionedQualifiedName '::')? ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//(VersionedQualifiedName '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//VersionedQualifiedName
		public RuleCall getVersionedQualifiedNameParserRuleCall_0_0() { return cVersionedQualifiedNameParserRuleCall_0_0; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
		
		//('::' ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'::'
		public Keyword getColonColonKeyword_2_0() { return cColonColonKeyword_2_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_1() { return cIDTerminalRuleCall_2_1; }
	}
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
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
	
	public class TMTCIFFilterConstantTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDecimalEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDecimalDecimalKeyword_0_0 = (Keyword)cDecimalEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cHexEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cHexHexKeyword_1_0 = (Keyword)cHexEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBinaryEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBinaryBinaryKeyword_2_0 = (Keyword)cBinaryEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCharEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCharCharKeyword_3_0 = (Keyword)cCharEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cStringStringKeyword_4_0 = (Keyword)cStringEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum TMTCIFFilterConstantType:
		//	decimal | hex |
		//	binary | char | string;
		public EnumRule getRule() { return rule; }
		
		//decimal | hex | binary | char | string
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//decimal
		public EnumLiteralDeclaration getDecimalEnumLiteralDeclaration_0() { return cDecimalEnumLiteralDeclaration_0; }
		
		//'decimal'
		public Keyword getDecimalDecimalKeyword_0_0() { return cDecimalDecimalKeyword_0_0; }
		
		//hex
		public EnumLiteralDeclaration getHexEnumLiteralDeclaration_1() { return cHexEnumLiteralDeclaration_1; }
		
		//'hex'
		public Keyword getHexHexKeyword_1_0() { return cHexHexKeyword_1_0; }
		
		//binary
		public EnumLiteralDeclaration getBinaryEnumLiteralDeclaration_2() { return cBinaryEnumLiteralDeclaration_2; }
		
		//'binary'
		public Keyword getBinaryBinaryKeyword_2_0() { return cBinaryBinaryKeyword_2_0; }
		
		//char
		public EnumLiteralDeclaration getCharEnumLiteralDeclaration_3() { return cCharEnumLiteralDeclaration_3; }
		
		//'char'
		public Keyword getCharCharKeyword_3_0() { return cCharCharKeyword_3_0; }
		
		//string
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_4() { return cStringEnumLiteralDeclaration_4; }
		
		//'string'
		public Keyword getStringStringKeyword_4_0() { return cStringStringKeyword_4_0; }
	}
	public class TMTCIFFilterOPTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterOPType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cEqualEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cEqualEqualKeyword_0_0 = (Keyword)cEqualEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDifferentEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDifferentDifferentKeyword_1_0 = (Keyword)cDifferentEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBigger_thanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBigger_thanBigger_thanKeyword_2_0 = (Keyword)cBigger_thanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSmaller_thanEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSmaller_thanSmaller_thanKeyword_3_0 = (Keyword)cSmaller_thanEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBigger_or_equalEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBigger_or_equalBigger_or_equalKeyword_4_0 = (Keyword)cBigger_or_equalEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSmaller_or_equalEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSmaller_or_equalSmaller_or_equalKeyword_5_0 = (Keyword)cSmaller_or_equalEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum TMTCIFFilterOPType:
		//	equal | different |
		//	bigger_than |
		//	smaller_than |
		//	bigger_or_equal |
		//	smaller_or_equal;
		public EnumRule getRule() { return rule; }
		
		//equal | different | bigger_than | smaller_than | bigger_or_equal | smaller_or_equal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//equal
		public EnumLiteralDeclaration getEqualEnumLiteralDeclaration_0() { return cEqualEnumLiteralDeclaration_0; }
		
		//'equal'
		public Keyword getEqualEqualKeyword_0_0() { return cEqualEqualKeyword_0_0; }
		
		//different
		public EnumLiteralDeclaration getDifferentEnumLiteralDeclaration_1() { return cDifferentEnumLiteralDeclaration_1; }
		
		//'different'
		public Keyword getDifferentDifferentKeyword_1_0() { return cDifferentDifferentKeyword_1_0; }
		
		//bigger_than
		public EnumLiteralDeclaration getBigger_thanEnumLiteralDeclaration_2() { return cBigger_thanEnumLiteralDeclaration_2; }
		
		//'bigger_than'
		public Keyword getBigger_thanBigger_thanKeyword_2_0() { return cBigger_thanBigger_thanKeyword_2_0; }
		
		//smaller_than
		public EnumLiteralDeclaration getSmaller_thanEnumLiteralDeclaration_3() { return cSmaller_thanEnumLiteralDeclaration_3; }
		
		//'smaller_than'
		public Keyword getSmaller_thanSmaller_thanKeyword_3_0() { return cSmaller_thanSmaller_thanKeyword_3_0; }
		
		//bigger_or_equal
		public EnumLiteralDeclaration getBigger_or_equalEnumLiteralDeclaration_4() { return cBigger_or_equalEnumLiteralDeclaration_4; }
		
		//'bigger_or_equal'
		public Keyword getBigger_or_equalBigger_or_equalKeyword_4_0() { return cBigger_or_equalBigger_or_equalKeyword_4_0; }
		
		//smaller_or_equal
		public EnumLiteralDeclaration getSmaller_or_equalEnumLiteralDeclaration_5() { return cSmaller_or_equalEnumLiteralDeclaration_5; }
		
		//'smaller_or_equal'
		public Keyword getSmaller_or_equalSmaller_or_equalKeyword_5_0() { return cSmaller_or_equalSmaller_or_equalKeyword_5_0; }
	}
	public class TMTCIFFilterSelectTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDataEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDataDataKeyword_0_0 = (Keyword)cDataEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSizeEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSizeSizeKeyword_1_0 = (Keyword)cSizeEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCrcEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCrcCrcKeyword_2_0 = (Keyword)cCrcEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TMTCIFFilterSelectType:
		//	data | size | crc;
		public EnumRule getRule() { return rule; }
		
		//data | size | crc
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//data
		public EnumLiteralDeclaration getDataEnumLiteralDeclaration_0() { return cDataEnumLiteralDeclaration_0; }
		
		//'data'
		public Keyword getDataDataKeyword_0_0() { return cDataDataKeyword_0_0; }
		
		//size
		public EnumLiteralDeclaration getSizeEnumLiteralDeclaration_1() { return cSizeEnumLiteralDeclaration_1; }
		
		//'size'
		public Keyword getSizeSizeKeyword_1_0() { return cSizeSizeKeyword_1_0; }
		
		//crc
		public EnumLiteralDeclaration getCrcEnumLiteralDeclaration_2() { return cCrcEnumLiteralDeclaration_2; }
		
		//'crc'
		public Keyword getCrcCrcKeyword_2_0() { return cCrcCrcKeyword_2_0; }
	}
	
	private final TMTCIFModelFileElements pTMTCIFModelFile;
	private final TMTCIFModelFileImportElements pTMTCIFModelFileImport;
	private final TMTCIFFilterFilterElements pTMTCIFFilterFilter;
	private final TMTCIFFilterMaxtermFilterElements pTMTCIFFilterMaxtermFilter;
	private final TMTCIFFilterMintermFilterElements pTMTCIFFilterMintermFilter;
	private final TMTCIFFilterBoolVarElements pTMTCIFFilterBoolVar;
	private final TMTCIFFilterBoolVarFromArrayItemElements pTMTCIFFilterBoolVarFromArrayItem;
	private final TMTCIFFilterBoolVarFromGroupedArrayItemElements pTMTCIFFilterBoolVarFromGroupedArrayItem;
	private final TMTCIFFilterBoolVarFDICElements pTMTCIFFilterBoolVarFDIC;
	private final TMTCIFFilterConstantTypeElements eTMTCIFFilterConstantType;
	private final TMTCIFFilterFieldOpElements pTMTCIFFilterFieldOp;
	private final TMTCIFFilterConstantElements pTMTCIFFilterConstant;
	private final TMTCIFFilterSelectElements pTMTCIFFilterSelect;
	private final TMTCIFFilterSelectLineElements pTMTCIFFilterSelectLine;
	private final TMTCIFFilterOPTypeElements eTMTCIFFilterOPType;
	private final TMTCIFFilterSelectTypeElements eTMTCIFFilterSelectType;
	private final TMTCIFFilterMaxtermElements pTMTCIFFilterMaxterm;
	private final TMTCIFFilterMintermElements pTMTCIFFilterMinterm;
	private final TMTCIFFilterBoolVarRefElements pTMTCIFFilterBoolVarRef;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FILTERGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTMTCIFModelFile = new TMTCIFModelFileElements();
		this.pTMTCIFModelFileImport = new TMTCIFModelFileImportElements();
		this.pTMTCIFFilterFilter = new TMTCIFFilterFilterElements();
		this.pTMTCIFFilterMaxtermFilter = new TMTCIFFilterMaxtermFilterElements();
		this.pTMTCIFFilterMintermFilter = new TMTCIFFilterMintermFilterElements();
		this.pTMTCIFFilterBoolVar = new TMTCIFFilterBoolVarElements();
		this.pTMTCIFFilterBoolVarFromArrayItem = new TMTCIFFilterBoolVarFromArrayItemElements();
		this.pTMTCIFFilterBoolVarFromGroupedArrayItem = new TMTCIFFilterBoolVarFromGroupedArrayItemElements();
		this.pTMTCIFFilterBoolVarFDIC = new TMTCIFFilterBoolVarFDICElements();
		this.eTMTCIFFilterConstantType = new TMTCIFFilterConstantTypeElements();
		this.pTMTCIFFilterFieldOp = new TMTCIFFilterFieldOpElements();
		this.pTMTCIFFilterConstant = new TMTCIFFilterConstantElements();
		this.pTMTCIFFilterSelect = new TMTCIFFilterSelectElements();
		this.pTMTCIFFilterSelectLine = new TMTCIFFilterSelectLineElements();
		this.eTMTCIFFilterOPType = new TMTCIFFilterOPTypeElements();
		this.eTMTCIFFilterSelectType = new TMTCIFFilterSelectTypeElements();
		this.pTMTCIFFilterMaxterm = new TMTCIFFilterMaxtermElements();
		this.pTMTCIFFilterMinterm = new TMTCIFFilterMintermElements();
		this.pTMTCIFFilterBoolVarRef = new TMTCIFFilterBoolVarRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.tmtcif.lang.filter.FILTER".equals(grammar.getName())) {
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

	
	//TMTCIFModelFile common::TMTCIFModelFile:
	//	imports+=TMTCIFModelFileImport*
	//	element=TMTCIFFilterFilter
	public TMTCIFModelFileElements getTMTCIFModelFileAccess() {
		return pTMTCIFModelFile;
	}
	
	public ParserRule getTMTCIFModelFileRule() {
		return getTMTCIFModelFileAccess().getRule();
	}
	
	//TMTCIFModelFileImport common::TMTCIFModelFileImport:
	//	'import' ':=' importURI=STRING ';'
	public TMTCIFModelFileImportElements getTMTCIFModelFileImportAccess() {
		return pTMTCIFModelFileImport;
	}
	
	public ParserRule getTMTCIFModelFileImportRule() {
		return getTMTCIFModelFileImportAccess().getRule();
	}
	
	//TMTCIFFilterFilter:
	//	TMTCIFFilterMaxtermFilter | TMTCIFFilterMintermFilter;
	public TMTCIFFilterFilterElements getTMTCIFFilterFilterAccess() {
		return pTMTCIFFilterFilter;
	}
	
	public ParserRule getTMTCIFFilterFilterRule() {
		return getTMTCIFFilterFilterAccess().getRule();
	}
	
	//TMTCIFFilterMaxtermFilter:
	//	'TMTCIFFilterMaxtermFilter'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
	//	'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
	//	BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
	//	BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
	//	Maxterm+=TMTCIFFilterMaxterm+
	//	'}' ';';
	public TMTCIFFilterMaxtermFilterElements getTMTCIFFilterMaxtermFilterAccess() {
		return pTMTCIFFilterMaxtermFilter;
	}
	
	public ParserRule getTMTCIFFilterMaxtermFilterRule() {
		return getTMTCIFFilterMaxtermFilterAccess().getRule();
	}
	
	//TMTCIFFilterMintermFilter:
	//	'TMTCIFFilterMintermFilter'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & ('version' ':=' version=Version ';')
	//	'formatFile' ':=' formatFile=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' (BoolVar+=TMTCIFFilterBoolVar |
	//	BoolVarFromArrayItem+=TMTCIFFilterBoolVarFromArrayItem |
	//	BoolVarFromGroupedArrayItem+=TMTCIFFilterBoolVarFromGroupedArrayItem | BoolVarFDIC+=TMTCIFFilterBoolVarFDIC)+)
	//	Minterm+=TMTCIFFilterMinterm+
	//	'}' ';';
	public TMTCIFFilterMintermFilterElements getTMTCIFFilterMintermFilterAccess() {
		return pTMTCIFFilterMintermFilter;
	}
	
	public ParserRule getTMTCIFFilterMintermFilterRule() {
		return getTMTCIFFilterMintermFilterAccess().getRule();
	}
	
	//TMTCIFFilterBoolVar:
	//	'TMTCIFFilterBoolVar' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
	//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
	//	SelectLine=TMTCIFFilterSelectLine)
	//	'}' ';';
	public TMTCIFFilterBoolVarElements getTMTCIFFilterBoolVarAccess() {
		return pTMTCIFFilterBoolVar;
	}
	
	public ParserRule getTMTCIFFilterBoolVarRule() {
		return getTMTCIFFilterBoolVarAccess().getRule();
	}
	
	//TMTCIFFilterBoolVarFromArrayItem:
	//	'TMTCIFFilterBoolVarFromArrayItem' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
	//	'AIFieldRef' ':=' AIFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
	//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
	//	SelectLine=TMTCIFFilterSelectLine)
	//	'}' ';';
	public TMTCIFFilterBoolVarFromArrayItemElements getTMTCIFFilterBoolVarFromArrayItemAccess() {
		return pTMTCIFFilterBoolVarFromArrayItem;
	}
	
	public ParserRule getTMTCIFFilterBoolVarFromArrayItemRule() {
		return getTMTCIFFilterBoolVarFromArrayItemAccess().getRule();
	}
	
	//TMTCIFFilterBoolVarFromGroupedArrayItem:
	//	'TMTCIFFilterBoolVarFromGroupedArrayItem' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'constantType' ':=' constantType=TMTCIFFilterConstantType ';'
	//	'group' ':=' group=ID ';'
	//	'AIFieldRefs' ':=' AIFieldRefs=[format::TMTCIFFormatAField|VersionedQualifiedReferenceName] ';'
	//	Op=TMTCIFFilterFieldOp (Constant=TMTCIFFilterConstant | Select=TMTCIFFilterSelect |
	//	SelectLine=TMTCIFFilterSelectLine)
	//	'}' ';';
	public TMTCIFFilterBoolVarFromGroupedArrayItemElements getTMTCIFFilterBoolVarFromGroupedArrayItemAccess() {
		return pTMTCIFFilterBoolVarFromGroupedArrayItem;
	}
	
	public ParserRule getTMTCIFFilterBoolVarFromGroupedArrayItemRule() {
		return getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRule();
	}
	
	//TMTCIFFilterBoolVarFDIC:
	//	'TMTCIFFilterBoolVarFDIC' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'name' ':=' name=ID ';'
	//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatFDICField|VersionedQualifiedReferenceName] ';'
	//	Op=TMTCIFFilterFieldOp
	//	'}' ';';
	public TMTCIFFilterBoolVarFDICElements getTMTCIFFilterBoolVarFDICAccess() {
		return pTMTCIFFilterBoolVarFDIC;
	}
	
	public ParserRule getTMTCIFFilterBoolVarFDICRule() {
		return getTMTCIFFilterBoolVarFDICAccess().getRule();
	}
	
	//enum TMTCIFFilterConstantType:
	//	decimal | hex |
	//	binary | char | string;
	public TMTCIFFilterConstantTypeElements getTMTCIFFilterConstantTypeAccess() {
		return eTMTCIFFilterConstantType;
	}
	
	public EnumRule getTMTCIFFilterConstantTypeRule() {
		return getTMTCIFFilterConstantTypeAccess().getRule();
	}
	
	//TMTCIFFilterFieldOp:
	//	'TMTCIFFilterFieldOp' '{'
	//	'type' ':=' type=TMTCIFFilterOPType ';'
	//	'}' ';';
	public TMTCIFFilterFieldOpElements getTMTCIFFilterFieldOpAccess() {
		return pTMTCIFFilterFieldOp;
	}
	
	public ParserRule getTMTCIFFilterFieldOpRule() {
		return getTMTCIFFilterFieldOpAccess().getRule();
	}
	
	//TMTCIFFilterConstant:
	//	'TMTCIFFilterConstant' '{'
	//	'value' ':=' value=INTEGER ';' ('mask' ':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public TMTCIFFilterConstantElements getTMTCIFFilterConstantAccess() {
		return pTMTCIFFilterConstant;
	}
	
	public ParserRule getTMTCIFFilterConstantRule() {
		return getTMTCIFFilterConstantAccess().getRule();
	}
	
	//TMTCIFFilterSelect:
	//	'TMTCIFFilterSelect' '{'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'type' ':=' type=TMTCIFFilterSelectType ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
	//	('mask' ':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public TMTCIFFilterSelectElements getTMTCIFFilterSelectAccess() {
		return pTMTCIFFilterSelect;
	}
	
	public ParserRule getTMTCIFFilterSelectRule() {
		return getTMTCIFFilterSelectAccess().getRule();
	}
	
	//TMTCIFFilterSelectLine:
	//	'TMTCIFFilterSelectLine'
	//	'{'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'line' ':=' line=INTEGER ';' ('leftTrim' ':=' leftTrim=INTEGER ';')? ('rightTrim' ':=' rightTrim=INTEGER ';')?
	//	('mask' ':=' mask=HEXADECIMAL ';')?
	//	'}' ';';
	public TMTCIFFilterSelectLineElements getTMTCIFFilterSelectLineAccess() {
		return pTMTCIFFilterSelectLine;
	}
	
	public ParserRule getTMTCIFFilterSelectLineRule() {
		return getTMTCIFFilterSelectLineAccess().getRule();
	}
	
	//enum TMTCIFFilterOPType:
	//	equal | different |
	//	bigger_than |
	//	smaller_than |
	//	bigger_or_equal |
	//	smaller_or_equal;
	public TMTCIFFilterOPTypeElements getTMTCIFFilterOPTypeAccess() {
		return eTMTCIFFilterOPType;
	}
	
	public EnumRule getTMTCIFFilterOPTypeRule() {
		return getTMTCIFFilterOPTypeAccess().getRule();
	}
	
	//enum TMTCIFFilterSelectType:
	//	data | size | crc;
	public TMTCIFFilterSelectTypeElements getTMTCIFFilterSelectTypeAccess() {
		return eTMTCIFFilterSelectType;
	}
	
	public EnumRule getTMTCIFFilterSelectTypeRule() {
		return getTMTCIFFilterSelectTypeAccess().getRule();
	}
	
	//TMTCIFFilterMaxterm:
	//	'TMTCIFFilterMaxterm' '{'
	//	'id' ':=' id=INTEGER ';'
	//	BoolVarRef+=TMTCIFFilterBoolVarRef+
	//	'}' ';';
	public TMTCIFFilterMaxtermElements getTMTCIFFilterMaxtermAccess() {
		return pTMTCIFFilterMaxterm;
	}
	
	public ParserRule getTMTCIFFilterMaxtermRule() {
		return getTMTCIFFilterMaxtermAccess().getRule();
	}
	
	//TMTCIFFilterMinterm:
	//	'TMTCIFFilterMinterm' '{'
	//	'id' ':=' id=INTEGER ';'
	//	BoolVarRef+=TMTCIFFilterBoolVarRef+
	//	'}' ';';
	public TMTCIFFilterMintermElements getTMTCIFFilterMintermAccess() {
		return pTMTCIFFilterMinterm;
	}
	
	public ParserRule getTMTCIFFilterMintermRule() {
		return getTMTCIFFilterMintermAccess().getRule();
	}
	
	//TMTCIFFilterBoolVarRef:
	//	'TMTCIFFilterBoolVarRef' '{'
	//	'idRef' ':=' idRef=INTEGER ';'
	//	'}' ';';
	public TMTCIFFilterBoolVarRefElements getTMTCIFFilterBoolVarRefAccess() {
		return pTMTCIFFilterBoolVarRef;
	}
	
	public ParserRule getTMTCIFFilterBoolVarRefRule() {
		return getTMTCIFFilterBoolVarRefAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Version:
	//	(INT | INT? ID) ('.' (INT | INT? ID))*;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//VersionedQualifiedName:
	//	QualifiedName '(' Version ')';
	public VersionedQualifiedNameElements getVersionedQualifiedNameAccess() {
		return pVersionedQualifiedName;
	}
	
	public ParserRule getVersionedQualifiedNameRule() {
		return getVersionedQualifiedNameAccess().getRule();
	}
	
	//VersionedQualifiedReferenceName:
	//	(VersionedQualifiedName '::')? ID ('::' ID)*;
	public VersionedQualifiedReferenceNameElements getVersionedQualifiedReferenceNameAccess() {
		return pVersionedQualifiedReferenceName;
	}
	
	public ParserRule getVersionedQualifiedReferenceNameRule() {
		return getVersionedQualifiedReferenceNameAccess().getRule();
	}
	
	//terminal HEXADECIMAL:
	//	'0x' ('0'..'9' | 'a'..'f' | 'A'..'F')+;
	public TerminalRule getHEXADECIMALRule() {
		return tHEXADECIMAL;
	}
	
	//INTEGER:
	//	'-'? INT | HEXADECIMAL;
	public INTEGERElements getINTEGERAccess() {
		return pINTEGER;
	}
	
	public ParserRule getINTEGERRule() {
		return getINTEGERAccess().getRule();
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
