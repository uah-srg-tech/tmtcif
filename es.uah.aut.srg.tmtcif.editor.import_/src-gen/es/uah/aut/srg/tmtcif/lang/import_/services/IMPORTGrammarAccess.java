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
package es.uah.aut.srg.tmtcif.lang.import_.services;

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
public class IMPORTGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TMTCIFModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsTMTCIFModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementTMTCIFImportImportParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//TMTCIFModelFile common::TMTCIFModelFile:
		//	imports+=TMTCIFModelFileImport*
		//	element=TMTCIFImportImport
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=TMTCIFModelFileImport* element=TMTCIFImportImport
		public Group getGroup() { return cGroup; }
		
		//imports+=TMTCIFModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//TMTCIFModelFileImport
		public RuleCall getImportsTMTCIFModelFileImportParserRuleCall_0_0() { return cImportsTMTCIFModelFileImportParserRuleCall_0_0; }
		
		//element=TMTCIFImportImport
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//TMTCIFImportImport
		public RuleCall getElementTMTCIFImportImportParserRuleCall_1_0() { return cElementTMTCIFImportImportParserRuleCall_1_0; }
	}
	public class TMTCIFModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFModelFileImport");
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
	public class TMTCIFImportImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFImportImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Keyword cVersionKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cVersionAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cVersionVersionParserRuleCall_3_1_2_0 = (RuleCall)cVersionAssignment_3_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1_3 = (Keyword)cGroup_3_1.eContents().get(3);
		private final Keyword cFromKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFromAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cFromTMTCIFFormatFormatCrossReference_6_0 = (CrossReference)cFromAssignment_6.eContents().get(0);
		private final RuleCall cFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1 = (RuleCall)cFromTMTCIFFormatFormatCrossReference_6_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cToKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cColonEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Alternatives cAlternatives_10 = (Alternatives)cGroup.eContents().get(10);
		private final Keyword cNULLKeyword_10_0 = (Keyword)cAlternatives_10.eContents().get(0);
		private final Assignment cToAssignment_10_1 = (Assignment)cAlternatives_10.eContents().get(1);
		private final CrossReference cToTMTCIFFormatFormatCrossReference_10_1_0 = (CrossReference)cToAssignment_10_1.eContents().get(0);
		private final RuleCall cToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1 = (RuleCall)cToTMTCIFFormatFormatCrossReference_10_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cDataSourceAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cDataSourceTMTCIFImportDataSourceParserRuleCall_12_0 = (RuleCall)cDataSourceAssignment_12.eContents().get(0);
		private final Assignment cVirtualSizeAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0 = (RuleCall)cVirtualSizeAssignment_13.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//TMTCIFImportImport:
		//	'TMTCIFImportImport'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		//	'from' ':=' from=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
		//	'to' ':=' ('NULL' | to=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';'
		//	dataSource+=TMTCIFImportDataSource+
		//	virtualSize=TMTCIFImportVirtualSize?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFImportImport' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') 'from' ':='
		//from=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' 'to' ':=' ('NULL' |
		//to=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';' dataSource+=TMTCIFImportDataSource+
		//virtualSize=TMTCIFImportVirtualSize? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFImportImport'
		public Keyword getTMTCIFImportImportKeyword_0() { return cTMTCIFImportImportKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
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
		
		//'version' ':=' version=Version ';'
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'version'
		public Keyword getVersionKeyword_3_1_0() { return cVersionKeyword_3_1_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_1_1() { return cColonEqualsSignKeyword_3_1_1; }
		
		//version=Version
		public Assignment getVersionAssignment_3_1_2() { return cVersionAssignment_3_1_2; }
		
		//Version
		public RuleCall getVersionVersionParserRuleCall_3_1_2_0() { return cVersionVersionParserRuleCall_3_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_1_3() { return cSemicolonKeyword_3_1_3; }
		
		//'from'
		public Keyword getFromKeyword_4() { return cFromKeyword_4; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_5() { return cColonEqualsSignKeyword_5; }
		
		//from=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getFromAssignment_6() { return cFromAssignment_6; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getFromTMTCIFFormatFormatCrossReference_6_0() { return cFromTMTCIFFormatFormatCrossReference_6_0; }
		
		//VersionedQualifiedName
		public RuleCall getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1() { return cFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
		
		//'to'
		public Keyword getToKeyword_8() { return cToKeyword_8; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9() { return cColonEqualsSignKeyword_9; }
		
		//('NULL' | to=[format::TMTCIFFormatFormat|VersionedQualifiedName])
		public Alternatives getAlternatives_10() { return cAlternatives_10; }
		
		//'NULL'
		public Keyword getNULLKeyword_10_0() { return cNULLKeyword_10_0; }
		
		//to=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getToAssignment_10_1() { return cToAssignment_10_1; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getToTMTCIFFormatFormatCrossReference_10_1_0() { return cToTMTCIFFormatFormatCrossReference_10_1_0; }
		
		//VersionedQualifiedName
		public RuleCall getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1() { return cToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
		
		//dataSource+=TMTCIFImportDataSource+
		public Assignment getDataSourceAssignment_12() { return cDataSourceAssignment_12; }
		
		//TMTCIFImportDataSource
		public RuleCall getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0() { return cDataSourceTMTCIFImportDataSourceParserRuleCall_12_0; }
		
		//virtualSize=TMTCIFImportVirtualSize?
		public Assignment getVirtualSizeAssignment_13() { return cVirtualSizeAssignment_13; }
		
		//TMTCIFImportVirtualSize
		public RuleCall getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0() { return cVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class TMTCIFImportDataSourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportDataSource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFImportDataSourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFieldRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cFieldRefTMTCIFFormatFieldCrossReference_4_0 = (CrossReference)cFieldRefAssignment_4.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1 = (RuleCall)cFieldRefTMTCIFFormatFieldCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftTrimKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLeftTrimAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLeftTrimINTEGERParserRuleCall_8_0 = (RuleCall)cLeftTrimAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightTrimKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRightTrimAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRightTrimINTEGERParserRuleCall_12_0 = (RuleCall)cRightTrimAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//TMTCIFImportDataSource:
		//	'TMTCIFImportDataSource' '{'
		//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'leftTrim' ':=' leftTrim=INTEGER ';'
		//	'rightTrim' ':=' rightTrim=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFImportDataSource' '{' 'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//'leftTrim' ':=' leftTrim=INTEGER ';' 'rightTrim' ':=' rightTrim=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFImportDataSource'
		public Keyword getTMTCIFImportDataSourceKeyword_0() { return cTMTCIFImportDataSourceKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_2() { return cFieldRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_4() { return cFieldRefAssignment_4; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefTMTCIFFormatFieldCrossReference_4_0() { return cFieldRefTMTCIFFormatFieldCrossReference_4_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1() { return cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'leftTrim'
		public Keyword getLeftTrimKeyword_6() { return cLeftTrimKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//leftTrim=INTEGER
		public Assignment getLeftTrimAssignment_8() { return cLeftTrimAssignment_8; }
		
		//INTEGER
		public RuleCall getLeftTrimINTEGERParserRuleCall_8_0() { return cLeftTrimINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'rightTrim'
		public Keyword getRightTrimKeyword_10() { return cRightTrimKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//rightTrim=INTEGER
		public Assignment getRightTrimAssignment_12() { return cRightTrimAssignment_12; }
		
		//INTEGER
		public RuleCall getRightTrimINTEGERParserRuleCall_12_0() { return cRightTrimINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class TMTCIFImportVirtualSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportVirtualSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFImportVirtualSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFieldRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cFieldRefTMTCIFFormatFieldCrossReference_4_0 = (CrossReference)cFieldRefAssignment_4.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1 = (RuleCall)cFieldRefTMTCIFFormatFieldCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToTMTCIFFormatFieldCrossReference_8_0 = (CrossReference)cToAssignment_8.eContents().get(0);
		private final RuleCall cToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToTMTCIFFormatFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cAddSizeKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cAddSizeAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cAddSizeINTEGERParserRuleCall_10_2_0 = (RuleCall)cAddSizeAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cUnitKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_11_1 = (Keyword)cGroup_11.eContents().get(1);
		private final Assignment cUnitAssignment_11_2 = (Assignment)cGroup_11.eContents().get(2);
		private final RuleCall cUnitTMTCIFImportUnitEnumRuleCall_11_2_0 = (RuleCall)cUnitAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//TMTCIFImportVirtualSize:
		//	'TMTCIFImportVirtualSize' '{'
		//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'to' ':=' to=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('addSize' ':=' addSize=INTEGER ';')?
		//	('unit' ':=' unit=TMTCIFImportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFImportVirtualSize' '{' 'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//'to' ':=' to=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('addSize' ':=' addSize=INTEGER ';')?
		//('unit' ':=' unit=TMTCIFImportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFImportVirtualSize'
		public Keyword getTMTCIFImportVirtualSizeKeyword_0() { return cTMTCIFImportVirtualSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'FieldRef'
		public Keyword getFieldRefKeyword_2() { return cFieldRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_4() { return cFieldRefAssignment_4; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefTMTCIFFormatFieldCrossReference_4_0() { return cFieldRefTMTCIFFormatFieldCrossReference_4_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1() { return cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'to'
		public Keyword getToKeyword_6() { return cToKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//to=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getToAssignment_8() { return cToAssignment_8; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getToTMTCIFFormatFieldCrossReference_8_0() { return cToTMTCIFFormatFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('addSize' ':=' addSize=INTEGER ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'addSize'
		public Keyword getAddSizeKeyword_10_0() { return cAddSizeKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//addSize=INTEGER
		public Assignment getAddSizeAssignment_10_2() { return cAddSizeAssignment_10_2; }
		
		//INTEGER
		public RuleCall getAddSizeINTEGERParserRuleCall_10_2_0() { return cAddSizeINTEGERParserRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//('unit' ':=' unit=TMTCIFImportUnit ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'unit'
		public Keyword getUnitKeyword_11_0() { return cUnitKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//unit=TMTCIFImportUnit
		public Assignment getUnitAssignment_11_2() { return cUnitAssignment_11_2; }
		
		//TMTCIFImportUnit
		public RuleCall getUnitTMTCIFImportUnitEnumRuleCall_11_2_0() { return cUnitTMTCIFImportUnitEnumRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.INTEGER");
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
	
	public class TMTCIFImportUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBitsBitsKeyword_0_0 = (Keyword)cBitsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBytesBytesKeyword_1_0 = (Keyword)cBytesEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFImportUnit:
		//	bits | bytes;
		public EnumRule getRule() { return rule; }
		
		//bits | bytes
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_0() { return cBitsEnumLiteralDeclaration_0; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_0_0() { return cBitsBitsKeyword_0_0; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_1() { return cBytesEnumLiteralDeclaration_1; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_1_0() { return cBytesBytesKeyword_1_0; }
	}
	
	private final TMTCIFModelFileElements pTMTCIFModelFile;
	private final TMTCIFModelFileImportElements pTMTCIFModelFileImport;
	private final TMTCIFImportImportElements pTMTCIFImportImport;
	private final TMTCIFImportDataSourceElements pTMTCIFImportDataSource;
	private final TMTCIFImportVirtualSizeElements pTMTCIFImportVirtualSize;
	private final TMTCIFImportUnitElements eTMTCIFImportUnit;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IMPORTGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTMTCIFModelFile = new TMTCIFModelFileElements();
		this.pTMTCIFModelFileImport = new TMTCIFModelFileImportElements();
		this.pTMTCIFImportImport = new TMTCIFImportImportElements();
		this.pTMTCIFImportDataSource = new TMTCIFImportDataSourceElements();
		this.pTMTCIFImportVirtualSize = new TMTCIFImportVirtualSizeElements();
		this.eTMTCIFImportUnit = new TMTCIFImportUnitElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.import_.IMPORT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.tmtcif.lang.import_.IMPORT".equals(grammar.getName())) {
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
	//	element=TMTCIFImportImport
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
	
	//TMTCIFImportImport:
	//	'TMTCIFImportImport'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
	//	'from' ':=' from=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
	//	'to' ':=' ('NULL' | to=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';'
	//	dataSource+=TMTCIFImportDataSource+
	//	virtualSize=TMTCIFImportVirtualSize?
	//	'}' ';';
	public TMTCIFImportImportElements getTMTCIFImportImportAccess() {
		return pTMTCIFImportImport;
	}
	
	public ParserRule getTMTCIFImportImportRule() {
		return getTMTCIFImportImportAccess().getRule();
	}
	
	//TMTCIFImportDataSource:
	//	'TMTCIFImportDataSource' '{'
	//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'leftTrim' ':=' leftTrim=INTEGER ';'
	//	'rightTrim' ':=' rightTrim=INTEGER ';'
	//	'}' ';';
	public TMTCIFImportDataSourceElements getTMTCIFImportDataSourceAccess() {
		return pTMTCIFImportDataSource;
	}
	
	public ParserRule getTMTCIFImportDataSourceRule() {
		return getTMTCIFImportDataSourceAccess().getRule();
	}
	
	//TMTCIFImportVirtualSize:
	//	'TMTCIFImportVirtualSize' '{'
	//	'FieldRef' ':=' FieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'to' ':=' to=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('addSize' ':=' addSize=INTEGER ';')?
	//	('unit' ':=' unit=TMTCIFImportUnit ';')?
	//	'}' ';';
	public TMTCIFImportVirtualSizeElements getTMTCIFImportVirtualSizeAccess() {
		return pTMTCIFImportVirtualSize;
	}
	
	public ParserRule getTMTCIFImportVirtualSizeRule() {
		return getTMTCIFImportVirtualSizeAccess().getRule();
	}
	
	//enum TMTCIFImportUnit:
	//	bits | bytes;
	public TMTCIFImportUnitElements getTMTCIFImportUnitAccess() {
		return eTMTCIFImportUnit;
	}
	
	public EnumRule getTMTCIFImportUnitRule() {
		return getTMTCIFImportUnitAccess().getRule();
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
