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
package es.uah.aut.srg.tmtcif.lang.export.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class EXPORTGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TMTCIFModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsTMTCIFModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementTMTCIFExportExportParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//TMTCIFModelFile common::TMTCIFModelFile:
		//	imports+=TMTCIFModelFileImport*
		//	element=TMTCIFExportExport
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=TMTCIFModelFileImport* element=TMTCIFExportExport
		public Group getGroup() { return cGroup; }
		
		//imports+=TMTCIFModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//TMTCIFModelFileImport
		public RuleCall getImportsTMTCIFModelFileImportParserRuleCall_0_0() { return cImportsTMTCIFModelFileImportParserRuleCall_0_0; }
		
		//element=TMTCIFExportExport
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//TMTCIFExportExport
		public RuleCall getElementTMTCIFExportExportParserRuleCall_1_0() { return cElementTMTCIFExportExportParserRuleCall_1_0; }
	}
	public class TMTCIFModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFModelFileImport");
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
	public class TMTCIFExportExportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportExport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportExportKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Keyword cNULLKeyword_6_0 = (Keyword)cAlternatives_6.eContents().get(0);
		private final Assignment cFromAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final CrossReference cFromTMTCIFFormatFormatCrossReference_6_1_0 = (CrossReference)cFromAssignment_6_1.eContents().get(0);
		private final RuleCall cFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1 = (RuleCall)cFromTMTCIFFormatFormatCrossReference_6_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cToKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cColonEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cToAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cToTMTCIFFormatFormatCrossReference_10_0 = (CrossReference)cToAssignment_10.eContents().get(0);
		private final RuleCall cToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1 = (RuleCall)cToTMTCIFFormatFormatCrossReference_10_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cSizesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cSizesTMTCIFExportSizesParserRuleCall_12_0 = (RuleCall)cSizesAssignment_12.eContents().get(0);
		private final Assignment cSettingsAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cSettingsTMTCIFExportSettingsParserRuleCall_13_0 = (RuleCall)cSettingsAssignment_13.eContents().get(0);
		private final Assignment cActivateDICsAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0 = (RuleCall)cActivateDICsAssignment_14.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cSemicolonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//TMTCIFExportExport:
		//	'TMTCIFExportExport'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
		//	'from' ':=' ('NULL' | from=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';'
		//	'to' ':=' to=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
		//	Sizes=TMTCIFExportSizes?
		//	settings=TMTCIFExportSettings
		//	activateDICs=TMTCIFExportActivateDICs?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportExport' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';') 'from' ':='
		//('NULL' | from=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';' 'to' ':='
		//to=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';' Sizes=TMTCIFExportSizes? settings=TMTCIFExportSettings
		//activateDICs=TMTCIFExportActivateDICs? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportExport'
		public Keyword getTMTCIFExportExportKeyword_0() { return cTMTCIFExportExportKeyword_0; }
		
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
		
		//('NULL' | from=[format::TMTCIFFormatFormat|VersionedQualifiedName])
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//'NULL'
		public Keyword getNULLKeyword_6_0() { return cNULLKeyword_6_0; }
		
		//from=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getFromAssignment_6_1() { return cFromAssignment_6_1; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getFromTMTCIFFormatFormatCrossReference_6_1_0() { return cFromTMTCIFFormatFormatCrossReference_6_1_0; }
		
		//VersionedQualifiedName
		public RuleCall getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1() { return cFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
		
		//'to'
		public Keyword getToKeyword_8() { return cToKeyword_8; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_9() { return cColonEqualsSignKeyword_9; }
		
		//to=[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public Assignment getToAssignment_10() { return cToAssignment_10; }
		
		//[format::TMTCIFFormatFormat|VersionedQualifiedName]
		public CrossReference getToTMTCIFFormatFormatCrossReference_10_0() { return cToTMTCIFFormatFormatCrossReference_10_0; }
		
		//VersionedQualifiedName
		public RuleCall getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1() { return cToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
		
		//Sizes=TMTCIFExportSizes?
		public Assignment getSizesAssignment_12() { return cSizesAssignment_12; }
		
		//TMTCIFExportSizes
		public RuleCall getSizesTMTCIFExportSizesParserRuleCall_12_0() { return cSizesTMTCIFExportSizesParserRuleCall_12_0; }
		
		//settings=TMTCIFExportSettings
		public Assignment getSettingsAssignment_13() { return cSettingsAssignment_13; }
		
		//TMTCIFExportSettings
		public RuleCall getSettingsTMTCIFExportSettingsParserRuleCall_13_0() { return cSettingsTMTCIFExportSettingsParserRuleCall_13_0; }
		
		//activateDICs=TMTCIFExportActivateDICs?
		public Assignment getActivateDICsAssignment_14() { return cActivateDICsAssignment_14; }
		
		//TMTCIFExportActivateDICs
		public RuleCall getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0() { return cActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//';'
		public Keyword getSemicolonKeyword_16() { return cSemicolonKeyword_16; }
	}
	public class TMTCIFExportSizesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTMTCIFExportSizesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTMTCIFExportSizesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cSizeFromFileLengthAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0 = (RuleCall)cSizeFromFileLengthAssignment_3_0.eContents().get(0);
		private final Assignment cSizeFromFileLineAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0 = (RuleCall)cSizeFromFileLineAssignment_3_1.eContents().get(0);
		private final Assignment cSizeInBitsAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0 = (RuleCall)cSizeInBitsAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFExportSizes:
		//	{TMTCIFExportSizes}
		//	'TMTCIFExportSizes' '{' (sizeFromFileLength+=TMTCIFExportSizeFromFileLength |
		//	sizeFromFileLine+=TMTCIFExportSizeFromFileLine | sizeInBits+=TMTCIFExportSizeInBits)+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{TMTCIFExportSizes} 'TMTCIFExportSizes' '{' (sizeFromFileLength+=TMTCIFExportSizeFromFileLength |
		//sizeFromFileLine+=TMTCIFExportSizeFromFileLine | sizeInBits+=TMTCIFExportSizeInBits)+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{TMTCIFExportSizes}
		public Action getTMTCIFExportSizesAction_0() { return cTMTCIFExportSizesAction_0; }
		
		//'TMTCIFExportSizes'
		public Keyword getTMTCIFExportSizesKeyword_1() { return cTMTCIFExportSizesKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(sizeFromFileLength+=TMTCIFExportSizeFromFileLength | sizeFromFileLine+=TMTCIFExportSizeFromFileLine |
		//sizeInBits+=TMTCIFExportSizeInBits)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//sizeFromFileLength+=TMTCIFExportSizeFromFileLength
		public Assignment getSizeFromFileLengthAssignment_3_0() { return cSizeFromFileLengthAssignment_3_0; }
		
		//TMTCIFExportSizeFromFileLength
		public RuleCall getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0() { return cSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0; }
		
		//sizeFromFileLine+=TMTCIFExportSizeFromFileLine
		public Assignment getSizeFromFileLineAssignment_3_1() { return cSizeFromFileLineAssignment_3_1; }
		
		//TMTCIFExportSizeFromFileLine
		public RuleCall getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0() { return cSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0; }
		
		//sizeInBits+=TMTCIFExportSizeInBits
		public Assignment getSizeInBitsAssignment_3_2() { return cSizeInBitsAssignment_3_2; }
		
		//TMTCIFExportSizeInBits
		public RuleCall getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0() { return cSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TMTCIFExportSizeFromFileLengthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLength");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSizeFromFileLengthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromFileKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromFileAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromFileIDTerminalRuleCall_8_0 = (RuleCall)cFromFileAssignment_8.eContents().get(0);
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
		private final RuleCall cUnitTMTCIFExportUnitEnumRuleCall_11_2_0 = (RuleCall)cUnitAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//TMTCIFExportSizeFromFileLength:
		//	'TMTCIFExportSizeFromFileLength' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'fromFile' ':=' fromFile=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSizeFromFileLength' '{' 'id' ':=' id=INTEGER ';' 'fromFile' ':=' fromFile=ID ';' ('addSize' ':='
		//addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSizeFromFileLength'
		public Keyword getTMTCIFExportSizeFromFileLengthKeyword_0() { return cTMTCIFExportSizeFromFileLengthKeyword_0; }
		
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
		
		//'fromFile'
		public Keyword getFromFileKeyword_6() { return cFromFileKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_8() { return cFromFileAssignment_8; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_8_0() { return cFromFileIDTerminalRuleCall_8_0; }
		
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
		
		//('unit' ':=' unit=TMTCIFExportUnit ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'unit'
		public Keyword getUnitKeyword_11_0() { return cUnitKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//unit=TMTCIFExportUnit
		public Assignment getUnitAssignment_11_2() { return cUnitAssignment_11_2; }
		
		//TMTCIFExportUnit
		public RuleCall getUnitTMTCIFExportUnitEnumRuleCall_11_2_0() { return cUnitTMTCIFExportUnitEnumRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class TMTCIFExportSizeFromFileLineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSizeFromFileLineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromFileKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromFileAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromFileIDTerminalRuleCall_8_0 = (RuleCall)cFromFileAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cLineKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cLineAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cLineINTEGERParserRuleCall_12_0 = (RuleCall)cLineAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cAddSizeKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cAddSizeAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cAddSizeINTEGERParserRuleCall_14_2_0 = (RuleCall)cAddSizeAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cUnitKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cUnitAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cUnitTMTCIFExportUnitEnumRuleCall_15_2_0 = (RuleCall)cUnitAssignment_15_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cSemicolonKeyword_17 = (Keyword)cGroup.eContents().get(17);
		
		//TMTCIFExportSizeFromFileLine:
		//	'TMTCIFExportSizeFromFileLine' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'fromFile' ':=' fromFile=ID ';'
		//	'line' ':=' line=INTEGER ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSizeFromFileLine' '{' 'id' ':=' id=INTEGER ';' 'fromFile' ':=' fromFile=ID ';' 'line' ':=' line=INTEGER ';'
		//('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSizeFromFileLine'
		public Keyword getTMTCIFExportSizeFromFileLineKeyword_0() { return cTMTCIFExportSizeFromFileLineKeyword_0; }
		
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
		
		//'fromFile'
		public Keyword getFromFileKeyword_6() { return cFromFileKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//fromFile=ID
		public Assignment getFromFileAssignment_8() { return cFromFileAssignment_8; }
		
		//ID
		public RuleCall getFromFileIDTerminalRuleCall_8_0() { return cFromFileIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'line'
		public Keyword getLineKeyword_10() { return cLineKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//line=INTEGER
		public Assignment getLineAssignment_12() { return cLineAssignment_12; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_12_0() { return cLineINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('addSize' ':=' addSize=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'addSize'
		public Keyword getAddSizeKeyword_14_0() { return cAddSizeKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//addSize=INTEGER
		public Assignment getAddSizeAssignment_14_2() { return cAddSizeAssignment_14_2; }
		
		//INTEGER
		public RuleCall getAddSizeINTEGERParserRuleCall_14_2_0() { return cAddSizeINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('unit' ':=' unit=TMTCIFExportUnit ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'unit'
		public Keyword getUnitKeyword_15_0() { return cUnitKeyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//unit=TMTCIFExportUnit
		public Assignment getUnitAssignment_15_2() { return cUnitAssignment_15_2; }
		
		//TMTCIFExportUnit
		public RuleCall getUnitTMTCIFExportUnitEnumRuleCall_15_2_0() { return cUnitTMTCIFExportUnitEnumRuleCall_15_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
		
		//';'
		public Keyword getSemicolonKeyword_17() { return cSemicolonKeyword_17; }
	}
	public class TMTCIFExportSizeInBitsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeInBits");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSizeInBitsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cFromKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cFromAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cFromIDTerminalRuleCall_8_0 = (RuleCall)cFromAssignment_8.eContents().get(0);
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
		private final RuleCall cUnitTMTCIFExportUnitEnumRuleCall_11_2_0 = (RuleCall)cUnitAssignment_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_11_3 = (Keyword)cGroup_11.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//TMTCIFExportSizeInBits:
		//	'TMTCIFExportSizeInBits' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSizeInBits' '{' 'id' ':=' id=INTEGER ';' 'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')?
		//('unit' ':=' unit=TMTCIFExportUnit ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSizeInBits'
		public Keyword getTMTCIFExportSizeInBitsKeyword_0() { return cTMTCIFExportSizeInBitsKeyword_0; }
		
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
		
		//'from'
		public Keyword getFromKeyword_6() { return cFromKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//from=ID
		public Assignment getFromAssignment_8() { return cFromAssignment_8; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_8_0() { return cFromIDTerminalRuleCall_8_0; }
		
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
		
		//('unit' ':=' unit=TMTCIFExportUnit ';')?
		public Group getGroup_11() { return cGroup_11; }
		
		//'unit'
		public Keyword getUnitKeyword_11_0() { return cUnitKeyword_11_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11_1() { return cColonEqualsSignKeyword_11_1; }
		
		//unit=TMTCIFExportUnit
		public Assignment getUnitAssignment_11_2() { return cUnitAssignment_11_2; }
		
		//TMTCIFExportUnit
		public RuleCall getUnitTMTCIFExportUnitEnumRuleCall_11_2_0() { return cUnitTMTCIFExportUnitEnumRuleCall_11_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_11_3() { return cSemicolonKeyword_11_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
	}
	public class TMTCIFExportSettingsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettings");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTMTCIFExportSettingsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTMTCIFExportSettingsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cSettingFromConstAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0 = (RuleCall)cSettingFromConstAssignment_3_0.eContents().get(0);
		private final Assignment cSettingFromSizeAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0 = (RuleCall)cSettingFromSizeAssignment_3_1.eContents().get(0);
		private final Assignment cSettingFromFileAssignment_3_2 = (Assignment)cAlternatives_3.eContents().get(2);
		private final RuleCall cSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0 = (RuleCall)cSettingFromFileAssignment_3_2.eContents().get(0);
		private final Assignment cSettingFromFieldAssignment_3_3 = (Assignment)cAlternatives_3.eContents().get(3);
		private final RuleCall cSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0 = (RuleCall)cSettingFromFieldAssignment_3_3.eContents().get(0);
		private final Assignment cSettingAIFromConstAssignment_3_4 = (Assignment)cAlternatives_3.eContents().get(4);
		private final RuleCall cSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0 = (RuleCall)cSettingAIFromConstAssignment_3_4.eContents().get(0);
		private final Assignment cSettingAIFromFileAssignment_3_5 = (Assignment)cAlternatives_3.eContents().get(5);
		private final RuleCall cSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0 = (RuleCall)cSettingAIFromFileAssignment_3_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFExportSettings:
		//	{TMTCIFExportSettings}
		//	'TMTCIFExportSettings' '{' (settingFromConst+=TMTCIFExportSettingFromConst |
		//	settingFromSize+=TMTCIFExportSettingFromSize | settingFromFile+=TMTCIFExportSettingFromFile |
		//	settingFromField+=TMTCIFExportSettingFromField | settingAIFromConst+=TMTCIFExportSettingAIFromConst |
		//	settingAIFromFile+=TMTCIFExportSettingAIFromFile)*
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{TMTCIFExportSettings} 'TMTCIFExportSettings' '{' (settingFromConst+=TMTCIFExportSettingFromConst |
		//settingFromSize+=TMTCIFExportSettingFromSize | settingFromFile+=TMTCIFExportSettingFromFile |
		//settingFromField+=TMTCIFExportSettingFromField | settingAIFromConst+=TMTCIFExportSettingAIFromConst |
		//settingAIFromFile+=TMTCIFExportSettingAIFromFile)* '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{TMTCIFExportSettings}
		public Action getTMTCIFExportSettingsAction_0() { return cTMTCIFExportSettingsAction_0; }
		
		//'TMTCIFExportSettings'
		public Keyword getTMTCIFExportSettingsKeyword_1() { return cTMTCIFExportSettingsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(settingFromConst+=TMTCIFExportSettingFromConst | settingFromSize+=TMTCIFExportSettingFromSize |
		//settingFromFile+=TMTCIFExportSettingFromFile | settingFromField+=TMTCIFExportSettingFromField |
		//settingAIFromConst+=TMTCIFExportSettingAIFromConst | settingAIFromFile+=TMTCIFExportSettingAIFromFile)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//settingFromConst+=TMTCIFExportSettingFromConst
		public Assignment getSettingFromConstAssignment_3_0() { return cSettingFromConstAssignment_3_0; }
		
		//TMTCIFExportSettingFromConst
		public RuleCall getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0() { return cSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0; }
		
		//settingFromSize+=TMTCIFExportSettingFromSize
		public Assignment getSettingFromSizeAssignment_3_1() { return cSettingFromSizeAssignment_3_1; }
		
		//TMTCIFExportSettingFromSize
		public RuleCall getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0() { return cSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0; }
		
		//settingFromFile+=TMTCIFExportSettingFromFile
		public Assignment getSettingFromFileAssignment_3_2() { return cSettingFromFileAssignment_3_2; }
		
		//TMTCIFExportSettingFromFile
		public RuleCall getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0() { return cSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0; }
		
		//settingFromField+=TMTCIFExportSettingFromField
		public Assignment getSettingFromFieldAssignment_3_3() { return cSettingFromFieldAssignment_3_3; }
		
		//TMTCIFExportSettingFromField
		public RuleCall getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0() { return cSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0; }
		
		//settingAIFromConst+=TMTCIFExportSettingAIFromConst
		public Assignment getSettingAIFromConstAssignment_3_4() { return cSettingAIFromConstAssignment_3_4; }
		
		//TMTCIFExportSettingAIFromConst
		public RuleCall getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0() { return cSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0; }
		
		//settingAIFromFile+=TMTCIFExportSettingAIFromFile
		public Assignment getSettingAIFromFileAssignment_3_5() { return cSettingAIFromFileAssignment_3_5; }
		
		//TMTCIFExportSettingAIFromFile
		public RuleCall getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0() { return cSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TMTCIFExportSettingFromConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromConst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingFromConstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFExportSettingFromConst:
		//	'TMTCIFExportSettingFromConst' '{'
		//	'value' ':=' value=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingFromConst' '{' 'value' ':=' value=INTEGER ';' 'toFieldRef' ':='
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingFromConst'
		public Keyword getTMTCIFExportSettingFromConstKeyword_0() { return cTMTCIFExportSettingFromConstKeyword_0; }
		
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
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFExportSettingFromSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingFromSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSizeRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSizeRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSizeRefINTEGERParserRuleCall_4_0 = (RuleCall)cSizeRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFExportSettingFromSize:
		//	'TMTCIFExportSettingFromSize' '{'
		//	'sizeRef' ':=' sizeRef=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingFromSize' '{' 'sizeRef' ':=' sizeRef=INTEGER ';' 'toFieldRef' ':='
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingFromSize'
		public Keyword getTMTCIFExportSettingFromSizeKeyword_0() { return cTMTCIFExportSettingFromSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'sizeRef'
		public Keyword getSizeRefKeyword_2() { return cSizeRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//sizeRef=INTEGER
		public Assignment getSizeRefAssignment_4() { return cSizeRefAssignment_4; }
		
		//INTEGER
		public RuleCall getSizeRefINTEGERParserRuleCall_4_0() { return cSizeRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFExportSettingFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFileIDTerminalRuleCall_4_0 = (RuleCall)cFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatFieldCrossReference_8_0.eContents().get(1);
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
		private final Keyword cLineKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_12_1 = (Keyword)cGroup_12.eContents().get(1);
		private final Assignment cLineAssignment_12_2 = (Assignment)cGroup_12.eContents().get(2);
		private final RuleCall cLineINTEGERParserRuleCall_12_2_0 = (RuleCall)cLineAssignment_12_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//TMTCIFExportSettingFromFile:
		//	'TMTCIFExportSettingFromFile' '{'
		//	'file' ':=' file=ID ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('offset' ':='
		//	offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':=' line=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingFromFile' '{' 'file' ':=' file=ID ';' 'toFieldRef' ':='
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('offset' ':=' offset=INTEGER ';')? ('size'
		//':=' size=INTEGER ';')? ('line' ':=' line=INTEGER ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingFromFile'
		public Keyword getTMTCIFExportSettingFromFileKeyword_0() { return cTMTCIFExportSettingFromFileKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'file'
		public Keyword getFileKeyword_2() { return cFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//file=ID
		public Assignment getFileAssignment_4() { return cFileAssignment_4; }
		
		//ID
		public RuleCall getFileIDTerminalRuleCall_4_0() { return cFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
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
		
		//('line' ':=' line=INTEGER ';')?
		public Group getGroup_12() { return cGroup_12; }
		
		//'line'
		public Keyword getLineKeyword_12_0() { return cLineKeyword_12_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_12_1() { return cColonEqualsSignKeyword_12_1; }
		
		//line=INTEGER
		public Assignment getLineAssignment_12_2() { return cLineAssignment_12_2; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_12_2_0() { return cLineINTEGERParserRuleCall_12_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_12_3() { return cSemicolonKeyword_12_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
	}
	public class TMTCIFExportSettingFromFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingFromFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFieldRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cFieldRefTMTCIFFormatFieldCrossReference_4_0 = (CrossReference)cFieldRefAssignment_4.eContents().get(0);
		private final RuleCall cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1 = (RuleCall)cFieldRefTMTCIFFormatFieldCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFExportSettingFromField:
		//	'TMTCIFExportSettingFromField' '{'
		//	'fieldRef' ':=' fieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingFromField' '{' 'fieldRef' ':=' fieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		//';' 'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingFromField'
		public Keyword getTMTCIFExportSettingFromFieldKeyword_0() { return cTMTCIFExportSettingFromFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fieldRef'
		public Keyword getFieldRefKeyword_2() { return cFieldRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getFieldRefAssignment_4() { return cFieldRefAssignment_4; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getFieldRefTMTCIFFormatFieldCrossReference_4_0() { return cFieldRefTMTCIFFormatFieldCrossReference_4_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1() { return cFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFExportSettingAIFromConstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromConst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingAIFromConstKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cValueKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cValueINTEGERParserRuleCall_4_0 = (RuleCall)cValueAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cToArrayIndexKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cToArrayIndexAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cToArrayIndexINTEGERParserRuleCall_12_0 = (RuleCall)cToArrayIndexAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//TMTCIFExportSettingAIFromConst:
		//	'TMTCIFExportSettingAIFromConst' '{'
		//	'value' ':=' value=INTEGER ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
		//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingAIFromConst' '{' 'value' ':=' value=INTEGER ';' 'toFieldRef' ':='
		//toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';' 'toArrayIndex' ':=' toArrayIndex=INTEGER
		//';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingAIFromConst'
		public Keyword getTMTCIFExportSettingAIFromConstKeyword_0() { return cTMTCIFExportSettingAIFromConstKeyword_0; }
		
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
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'toArrayIndex'
		public Keyword getToArrayIndexKeyword_10() { return cToArrayIndexKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//toArrayIndex=INTEGER
		public Assignment getToArrayIndexAssignment_12() { return cToArrayIndexAssignment_12; }
		
		//INTEGER
		public RuleCall getToArrayIndexINTEGERParserRuleCall_12_0() { return cToArrayIndexINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class TMTCIFExportSettingAIFromFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportSettingAIFromFileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFileKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFileAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFileIDTerminalRuleCall_4_0 = (RuleCall)cFileAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cToFieldRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToFieldRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0 = (CrossReference)cToFieldRefAssignment_8.eContents().get(0);
		private final RuleCall cToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1 = (RuleCall)cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cToArrayIndexKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cToArrayIndexAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cToArrayIndexINTEGERParserRuleCall_12_0 = (RuleCall)cToArrayIndexAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cOffsetKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cOffsetAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cOffsetINTEGERParserRuleCall_14_2_0 = (RuleCall)cOffsetAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Group cGroup_15 = (Group)cGroup.eContents().get(15);
		private final Keyword cSizeKeyword_15_0 = (Keyword)cGroup_15.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_15_1 = (Keyword)cGroup_15.eContents().get(1);
		private final Assignment cSizeAssignment_15_2 = (Assignment)cGroup_15.eContents().get(2);
		private final RuleCall cSizeINTEGERParserRuleCall_15_2_0 = (RuleCall)cSizeAssignment_15_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_15_3 = (Keyword)cGroup_15.eContents().get(3);
		private final Group cGroup_16 = (Group)cGroup.eContents().get(16);
		private final Keyword cLineKeyword_16_0 = (Keyword)cGroup_16.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_16_1 = (Keyword)cGroup_16.eContents().get(1);
		private final Assignment cLineAssignment_16_2 = (Assignment)cGroup_16.eContents().get(2);
		private final RuleCall cLineINTEGERParserRuleCall_16_2_0 = (RuleCall)cLineAssignment_16_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_16_3 = (Keyword)cGroup_16.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//TMTCIFExportSettingAIFromFile:
		//	'TMTCIFExportSettingAIFromFile' '{'
		//	'file' ':=' file=ID ';'
		//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
		//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
		//	('line' ':=' line=INTEGER ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportSettingAIFromFile' '{' 'file' ':=' file=ID ';' 'toFieldRef' ':='
		//toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';' 'toArrayIndex' ':=' toArrayIndex=INTEGER
		//';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':=' line=INTEGER ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportSettingAIFromFile'
		public Keyword getTMTCIFExportSettingAIFromFileKeyword_0() { return cTMTCIFExportSettingAIFromFileKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'file'
		public Keyword getFileKeyword_2() { return cFileKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//file=ID
		public Assignment getFileAssignment_4() { return cFileAssignment_4; }
		
		//ID
		public RuleCall getFileIDTerminalRuleCall_4_0() { return cFileIDTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'toFieldRef'
		public Keyword getToFieldRefKeyword_6() { return cToFieldRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public Assignment getToFieldRefAssignment_8() { return cToFieldRefAssignment_8; }
		
		//[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName]
		public CrossReference getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0() { return cToFieldRefTMTCIFFormatAIFieldCrossReference_8_0; }
		
		//VersionedQualifiedReferenceName
		public RuleCall getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1() { return cToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'toArrayIndex'
		public Keyword getToArrayIndexKeyword_10() { return cToArrayIndexKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//toArrayIndex=INTEGER
		public Assignment getToArrayIndexAssignment_12() { return cToArrayIndexAssignment_12; }
		
		//INTEGER
		public RuleCall getToArrayIndexINTEGERParserRuleCall_12_0() { return cToArrayIndexINTEGERParserRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('offset' ':=' offset=INTEGER ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'offset'
		public Keyword getOffsetKeyword_14_0() { return cOffsetKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//offset=INTEGER
		public Assignment getOffsetAssignment_14_2() { return cOffsetAssignment_14_2; }
		
		//INTEGER
		public RuleCall getOffsetINTEGERParserRuleCall_14_2_0() { return cOffsetINTEGERParserRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//('size' ':=' size=INTEGER ';')?
		public Group getGroup_15() { return cGroup_15; }
		
		//'size'
		public Keyword getSizeKeyword_15_0() { return cSizeKeyword_15_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_15_1() { return cColonEqualsSignKeyword_15_1; }
		
		//size=INTEGER
		public Assignment getSizeAssignment_15_2() { return cSizeAssignment_15_2; }
		
		//INTEGER
		public RuleCall getSizeINTEGERParserRuleCall_15_2_0() { return cSizeINTEGERParserRuleCall_15_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_15_3() { return cSemicolonKeyword_15_3; }
		
		//('line' ':=' line=INTEGER ';')?
		public Group getGroup_16() { return cGroup_16; }
		
		//'line'
		public Keyword getLineKeyword_16_0() { return cLineKeyword_16_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16_1() { return cColonEqualsSignKeyword_16_1; }
		
		//line=INTEGER
		public Assignment getLineAssignment_16_2() { return cLineAssignment_16_2; }
		
		//INTEGER
		public RuleCall getLineINTEGERParserRuleCall_16_2_0() { return cLineINTEGERParserRuleCall_16_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_16_3() { return cSemicolonKeyword_16_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_17() { return cRightCurlyBracketKeyword_17; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
	}
	public class TMTCIFExportActivateDICsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportActivateDICs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTMTCIFExportActivateDICsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTMTCIFExportActivateDICsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDICAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDICTMTCIFExportDICParserRuleCall_3_0 = (RuleCall)cDICAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFExportActivateDICs:
		//	{TMTCIFExportActivateDICs}
		//	'TMTCIFExportActivateDICs' '{'
		//	DIC+=TMTCIFExportDIC+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{TMTCIFExportActivateDICs} 'TMTCIFExportActivateDICs' '{' DIC+=TMTCIFExportDIC+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{TMTCIFExportActivateDICs}
		public Action getTMTCIFExportActivateDICsAction_0() { return cTMTCIFExportActivateDICsAction_0; }
		
		//'TMTCIFExportActivateDICs'
		public Keyword getTMTCIFExportActivateDICsKeyword_1() { return cTMTCIFExportActivateDICsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//DIC+=TMTCIFExportDIC+
		public Assignment getDICAssignment_3() { return cDICAssignment_3; }
		
		//TMTCIFExportDIC
		public RuleCall getDICTMTCIFExportDICParserRuleCall_3_0() { return cDICTMTCIFExportDICParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TMTCIFExportDICElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportDIC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFExportDICKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cIdKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIdAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdINTEGERParserRuleCall_4_0 = (RuleCall)cIdAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cDICRefKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cDICRefAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDICRefIDTerminalRuleCall_8_0 = (RuleCall)cDICRefAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFExportDIC:
		//	'TMTCIFExportDIC' '{'
		//	'id' ':=' id=INTEGER ';'
		//	'DICRef' ':=' DICRef=ID ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFExportDIC' '{' 'id' ':=' id=INTEGER ';' 'DICRef' ':=' DICRef=ID ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFExportDIC'
		public Keyword getTMTCIFExportDICKeyword_0() { return cTMTCIFExportDICKeyword_0; }
		
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
		
		//'DICRef'
		public Keyword getDICRefKeyword_6() { return cDICRefKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//DICRef=ID
		public Assignment getDICRefAssignment_8() { return cDICRefAssignment_8; }
		
		//ID
		public RuleCall getDICRefIDTerminalRuleCall_8_0() { return cDICRefIDTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.Version");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.VersionedQualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.VersionedQualifiedReferenceName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
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
	
	public class TMTCIFExportUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBitsBitsKeyword_0_0 = (Keyword)cBitsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBytesBytesKeyword_1_0 = (Keyword)cBytesEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFExportUnit:
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
	private final TMTCIFExportExportElements pTMTCIFExportExport;
	private final TMTCIFExportSizesElements pTMTCIFExportSizes;
	private final TMTCIFExportUnitElements eTMTCIFExportUnit;
	private final TMTCIFExportSizeFromFileLengthElements pTMTCIFExportSizeFromFileLength;
	private final TMTCIFExportSizeFromFileLineElements pTMTCIFExportSizeFromFileLine;
	private final TMTCIFExportSizeInBitsElements pTMTCIFExportSizeInBits;
	private final TMTCIFExportSettingsElements pTMTCIFExportSettings;
	private final TMTCIFExportSettingFromConstElements pTMTCIFExportSettingFromConst;
	private final TMTCIFExportSettingFromSizeElements pTMTCIFExportSettingFromSize;
	private final TMTCIFExportSettingFromFileElements pTMTCIFExportSettingFromFile;
	private final TMTCIFExportSettingFromFieldElements pTMTCIFExportSettingFromField;
	private final TMTCIFExportSettingAIFromConstElements pTMTCIFExportSettingAIFromConst;
	private final TMTCIFExportSettingAIFromFileElements pTMTCIFExportSettingAIFromFile;
	private final TMTCIFExportActivateDICsElements pTMTCIFExportActivateDICs;
	private final TMTCIFExportDICElements pTMTCIFExportDIC;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final VersionedQualifiedNameElements pVersionedQualifiedName;
	private final VersionedQualifiedReferenceNameElements pVersionedQualifiedReferenceName;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EXPORTGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTMTCIFModelFile = new TMTCIFModelFileElements();
		this.pTMTCIFModelFileImport = new TMTCIFModelFileImportElements();
		this.pTMTCIFExportExport = new TMTCIFExportExportElements();
		this.pTMTCIFExportSizes = new TMTCIFExportSizesElements();
		this.eTMTCIFExportUnit = new TMTCIFExportUnitElements();
		this.pTMTCIFExportSizeFromFileLength = new TMTCIFExportSizeFromFileLengthElements();
		this.pTMTCIFExportSizeFromFileLine = new TMTCIFExportSizeFromFileLineElements();
		this.pTMTCIFExportSizeInBits = new TMTCIFExportSizeInBitsElements();
		this.pTMTCIFExportSettings = new TMTCIFExportSettingsElements();
		this.pTMTCIFExportSettingFromConst = new TMTCIFExportSettingFromConstElements();
		this.pTMTCIFExportSettingFromSize = new TMTCIFExportSettingFromSizeElements();
		this.pTMTCIFExportSettingFromFile = new TMTCIFExportSettingFromFileElements();
		this.pTMTCIFExportSettingFromField = new TMTCIFExportSettingFromFieldElements();
		this.pTMTCIFExportSettingAIFromConst = new TMTCIFExportSettingAIFromConstElements();
		this.pTMTCIFExportSettingAIFromFile = new TMTCIFExportSettingAIFromFileElements();
		this.pTMTCIFExportActivateDICs = new TMTCIFExportActivateDICsElements();
		this.pTMTCIFExportDIC = new TMTCIFExportDICElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.pVersionedQualifiedName = new VersionedQualifiedNameElements();
		this.pVersionedQualifiedReferenceName = new VersionedQualifiedReferenceNameElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.export.EXPORT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.tmtcif.lang.export.EXPORT".equals(grammar.getName())) {
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
	//	element=TMTCIFExportExport
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
	
	//TMTCIFExportExport:
	//	'TMTCIFExportExport'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';')
	//	'from' ':=' ('NULL' | from=[format::TMTCIFFormatFormat|VersionedQualifiedName]) ';'
	//	'to' ':=' to=[format::TMTCIFFormatFormat|VersionedQualifiedName] ';'
	//	Sizes=TMTCIFExportSizes?
	//	settings=TMTCIFExportSettings
	//	activateDICs=TMTCIFExportActivateDICs?
	//	'}' ';';
	public TMTCIFExportExportElements getTMTCIFExportExportAccess() {
		return pTMTCIFExportExport;
	}
	
	public ParserRule getTMTCIFExportExportRule() {
		return getTMTCIFExportExportAccess().getRule();
	}
	
	//TMTCIFExportSizes:
	//	{TMTCIFExportSizes}
	//	'TMTCIFExportSizes' '{' (sizeFromFileLength+=TMTCIFExportSizeFromFileLength |
	//	sizeFromFileLine+=TMTCIFExportSizeFromFileLine | sizeInBits+=TMTCIFExportSizeInBits)+
	//	'}' ';';
	public TMTCIFExportSizesElements getTMTCIFExportSizesAccess() {
		return pTMTCIFExportSizes;
	}
	
	public ParserRule getTMTCIFExportSizesRule() {
		return getTMTCIFExportSizesAccess().getRule();
	}
	
	//enum TMTCIFExportUnit:
	//	bits | bytes;
	public TMTCIFExportUnitElements getTMTCIFExportUnitAccess() {
		return eTMTCIFExportUnit;
	}
	
	public EnumRule getTMTCIFExportUnitRule() {
		return getTMTCIFExportUnitAccess().getRule();
	}
	
	//TMTCIFExportSizeFromFileLength:
	//	'TMTCIFExportSizeFromFileLength' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'fromFile' ':=' fromFile=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
	//	'}' ';';
	public TMTCIFExportSizeFromFileLengthElements getTMTCIFExportSizeFromFileLengthAccess() {
		return pTMTCIFExportSizeFromFileLength;
	}
	
	public ParserRule getTMTCIFExportSizeFromFileLengthRule() {
		return getTMTCIFExportSizeFromFileLengthAccess().getRule();
	}
	
	//TMTCIFExportSizeFromFileLine:
	//	'TMTCIFExportSizeFromFileLine' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'fromFile' ':=' fromFile=ID ';'
	//	'line' ':=' line=INTEGER ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
	//	'}' ';';
	public TMTCIFExportSizeFromFileLineElements getTMTCIFExportSizeFromFileLineAccess() {
		return pTMTCIFExportSizeFromFileLine;
	}
	
	public ParserRule getTMTCIFExportSizeFromFileLineRule() {
		return getTMTCIFExportSizeFromFileLineAccess().getRule();
	}
	
	//TMTCIFExportSizeInBits:
	//	'TMTCIFExportSizeInBits' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'from' ':=' from=ID ';' ('addSize' ':=' addSize=INTEGER ';')? ('unit' ':=' unit=TMTCIFExportUnit ';')?
	//	'}' ';';
	public TMTCIFExportSizeInBitsElements getTMTCIFExportSizeInBitsAccess() {
		return pTMTCIFExportSizeInBits;
	}
	
	public ParserRule getTMTCIFExportSizeInBitsRule() {
		return getTMTCIFExportSizeInBitsAccess().getRule();
	}
	
	//TMTCIFExportSettings:
	//	{TMTCIFExportSettings}
	//	'TMTCIFExportSettings' '{' (settingFromConst+=TMTCIFExportSettingFromConst |
	//	settingFromSize+=TMTCIFExportSettingFromSize | settingFromFile+=TMTCIFExportSettingFromFile |
	//	settingFromField+=TMTCIFExportSettingFromField | settingAIFromConst+=TMTCIFExportSettingAIFromConst |
	//	settingAIFromFile+=TMTCIFExportSettingAIFromFile)*
	//	'}' ';';
	public TMTCIFExportSettingsElements getTMTCIFExportSettingsAccess() {
		return pTMTCIFExportSettings;
	}
	
	public ParserRule getTMTCIFExportSettingsRule() {
		return getTMTCIFExportSettingsAccess().getRule();
	}
	
	//TMTCIFExportSettingFromConst:
	//	'TMTCIFExportSettingFromConst' '{'
	//	'value' ':=' value=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'}' ';';
	public TMTCIFExportSettingFromConstElements getTMTCIFExportSettingFromConstAccess() {
		return pTMTCIFExportSettingFromConst;
	}
	
	public ParserRule getTMTCIFExportSettingFromConstRule() {
		return getTMTCIFExportSettingFromConstAccess().getRule();
	}
	
	//TMTCIFExportSettingFromSize:
	//	'TMTCIFExportSettingFromSize' '{'
	//	'sizeRef' ':=' sizeRef=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'}' ';';
	public TMTCIFExportSettingFromSizeElements getTMTCIFExportSettingFromSizeAccess() {
		return pTMTCIFExportSettingFromSize;
	}
	
	public ParserRule getTMTCIFExportSettingFromSizeRule() {
		return getTMTCIFExportSettingFromSizeAccess().getRule();
	}
	
	//TMTCIFExportSettingFromFile:
	//	'TMTCIFExportSettingFromFile' '{'
	//	'file' ':=' file=ID ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';' ('offset' ':='
	//	offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')? ('line' ':=' line=INTEGER ';')?
	//	'}' ';';
	public TMTCIFExportSettingFromFileElements getTMTCIFExportSettingFromFileAccess() {
		return pTMTCIFExportSettingFromFile;
	}
	
	public ParserRule getTMTCIFExportSettingFromFileRule() {
		return getTMTCIFExportSettingFromFileAccess().getRule();
	}
	
	//TMTCIFExportSettingFromField:
	//	'TMTCIFExportSettingFromField' '{'
	//	'fieldRef' ':=' fieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatField|VersionedQualifiedReferenceName] ';'
	//	'}' ';';
	public TMTCIFExportSettingFromFieldElements getTMTCIFExportSettingFromFieldAccess() {
		return pTMTCIFExportSettingFromField;
	}
	
	public ParserRule getTMTCIFExportSettingFromFieldRule() {
		return getTMTCIFExportSettingFromFieldAccess().getRule();
	}
	
	//TMTCIFExportSettingAIFromConst:
	//	'TMTCIFExportSettingAIFromConst' '{'
	//	'value' ':=' value=INTEGER ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
	//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';'
	//	'}' ';';
	public TMTCIFExportSettingAIFromConstElements getTMTCIFExportSettingAIFromConstAccess() {
		return pTMTCIFExportSettingAIFromConst;
	}
	
	public ParserRule getTMTCIFExportSettingAIFromConstRule() {
		return getTMTCIFExportSettingAIFromConstAccess().getRule();
	}
	
	//TMTCIFExportSettingAIFromFile:
	//	'TMTCIFExportSettingAIFromFile' '{'
	//	'file' ':=' file=ID ';'
	//	'toFieldRef' ':=' toFieldRef=[format::TMTCIFFormatAIField|VersionedQualifiedReferenceName] ';'
	//	'toArrayIndex' ':=' toArrayIndex=INTEGER ';' ('offset' ':=' offset=INTEGER ';')? ('size' ':=' size=INTEGER ';')?
	//	('line' ':=' line=INTEGER ';')?
	//	'}' ';';
	public TMTCIFExportSettingAIFromFileElements getTMTCIFExportSettingAIFromFileAccess() {
		return pTMTCIFExportSettingAIFromFile;
	}
	
	public ParserRule getTMTCIFExportSettingAIFromFileRule() {
		return getTMTCIFExportSettingAIFromFileAccess().getRule();
	}
	
	//TMTCIFExportActivateDICs:
	//	{TMTCIFExportActivateDICs}
	//	'TMTCIFExportActivateDICs' '{'
	//	DIC+=TMTCIFExportDIC+
	//	'}' ';';
	public TMTCIFExportActivateDICsElements getTMTCIFExportActivateDICsAccess() {
		return pTMTCIFExportActivateDICs;
	}
	
	public ParserRule getTMTCIFExportActivateDICsRule() {
		return getTMTCIFExportActivateDICsAccess().getRule();
	}
	
	//TMTCIFExportDIC:
	//	'TMTCIFExportDIC' '{'
	//	'id' ':=' id=INTEGER ';'
	//	'DICRef' ':=' DICRef=ID ';'
	//	'}' ';';
	public TMTCIFExportDICElements getTMTCIFExportDICAccess() {
		return pTMTCIFExportDIC;
	}
	
	public ParserRule getTMTCIFExportDICRule() {
		return getTMTCIFExportDICAccess().getRule();
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
