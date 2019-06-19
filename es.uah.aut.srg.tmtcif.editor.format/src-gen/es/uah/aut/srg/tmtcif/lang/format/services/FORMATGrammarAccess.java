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
package es.uah.aut.srg.tmtcif.lang.format.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class FORMATGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TMTCIFModelFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFModelFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsTMTCIFModelFileImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementTMTCIFFormatFormatParserRuleCall_1_0 = (RuleCall)cElementAssignment_1.eContents().get(0);
		
		//TMTCIFModelFile common::TMTCIFModelFile:
		//	imports+=TMTCIFModelFileImport*
		//	element=TMTCIFFormatFormat
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=TMTCIFModelFileImport* element=TMTCIFFormatFormat
		public Group getGroup() { return cGroup; }
		
		//imports+=TMTCIFModelFileImport*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//TMTCIFModelFileImport
		public RuleCall getImportsTMTCIFModelFileImportParserRuleCall_0_0() { return cImportsTMTCIFModelFileImportParserRuleCall_0_0; }
		
		//element=TMTCIFFormatFormat
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//TMTCIFFormatFormat
		public RuleCall getElementTMTCIFFormatFormatParserRuleCall_1_0() { return cElementTMTCIFFormatFormatParserRuleCall_1_0; }
	}
	public class TMTCIFModelFileImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFModelFileImport");
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
	public class TMTCIFFormatFormatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatFormatKeyword_0 = (Keyword)cGroup.eContents().get(0);
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
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cProtocolKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Assignment cProtocolAssignment_3_2_2 = (Assignment)cGroup_3_2.eContents().get(2);
		private final RuleCall cProtocolIDTerminalRuleCall_3_2_2_0 = (RuleCall)cProtocolAssignment_3_2_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2_3 = (Keyword)cGroup_3_2.eContents().get(3);
		private final Group cGroup_3_3 = (Group)cUnorderedGroup_3.eContents().get(3);
		private final Group cGroup_3_3_0 = (Group)cGroup_3_3.eContents().get(0);
		private final Keyword cTypeKeyword_3_3_0_0 = (Keyword)cGroup_3_3_0.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_3_3_0_1 = (Keyword)cGroup_3_3_0.eContents().get(1);
		private final Assignment cTypeAssignment_3_3_0_2 = (Assignment)cGroup_3_3_0.eContents().get(2);
		private final RuleCall cTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0 = (RuleCall)cTypeAssignment_3_3_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_3_0_3 = (Keyword)cGroup_3_3_0.eContents().get(3);
		private final Alternatives cAlternatives_3_3_1 = (Alternatives)cGroup_3_3.eContents().get(1);
		private final Assignment cCSFieldAssignment_3_3_1_0 = (Assignment)cAlternatives_3_3_1.eContents().get(0);
		private final RuleCall cCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0 = (RuleCall)cCSFieldAssignment_3_3_1_0.eContents().get(0);
		private final Assignment cCSFormulaFieldAssignment_3_3_1_1 = (Assignment)cAlternatives_3_3_1.eContents().get(1);
		private final RuleCall cCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0 = (RuleCall)cCSFormulaFieldAssignment_3_3_1_1.eContents().get(0);
		private final Assignment cVSFieldAssignment_3_3_1_2 = (Assignment)cAlternatives_3_3_1.eContents().get(2);
		private final RuleCall cVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0 = (RuleCall)cVSFieldAssignment_3_3_1_2.eContents().get(0);
		private final Assignment cFDICFieldAssignment_3_3_1_3 = (Assignment)cAlternatives_3_3_1.eContents().get(3);
		private final RuleCall cFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0 = (RuleCall)cFDICFieldAssignment_3_3_1_3.eContents().get(0);
		private final Assignment cVRFieldSizeAssignment_3_3_1_4 = (Assignment)cAlternatives_3_3_1.eContents().get(4);
		private final RuleCall cVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0 = (RuleCall)cVRFieldSizeAssignment_3_3_1_4.eContents().get(0);
		private final Assignment cAFieldAssignment_3_3_1_5 = (Assignment)cAlternatives_3_3_1.eContents().get(5);
		private final RuleCall cAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0 = (RuleCall)cAFieldAssignment_3_3_1_5.eContents().get(0);
		private final Assignment cAIFieldAssignment_3_3_1_6 = (Assignment)cAlternatives_3_3_1.eContents().get(6);
		private final RuleCall cAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0 = (RuleCall)cAIFieldAssignment_3_3_1_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFFormatFormat:
		//	'TMTCIFFormatFormat'
		//	name=ID
		//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' &
		//	('type' ':=' type=TMTCIFFormatFormatType ';') (CSField+=TMTCIFFormatCSField |
		//	CSFormulaField+=TMTCIFFormatCSFormulaField | VSField+=TMTCIFFormatVSField | FDICField+=TMTCIFFormatFDICField |
		//	VRFieldSize+=TMTCIFFormatVRFieldSize | AField+=TMTCIFFormatAField | AIField+=TMTCIFFormatAIField)*)
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatFormat' name=ID '{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol'
		//':=' protocol=ID ';' & ('type' ':=' type=TMTCIFFormatFormatType ';') (CSField+=TMTCIFFormatCSField |
		//CSFormulaField+=TMTCIFFormatCSFormulaField | VSField+=TMTCIFFormatVSField | FDICField+=TMTCIFFormatFDICField |
		//VRFieldSize+=TMTCIFFormatVRFieldSize | AField+=TMTCIFFormatAField | AIField+=TMTCIFFormatAIField)*) '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatFormat'
		public Keyword getTMTCIFFormatFormatKeyword_0() { return cTMTCIFFormatFormatKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' & ('type' ':='
		//type=TMTCIFFormatFormatType ';') (CSField+=TMTCIFFormatCSField | CSFormulaField+=TMTCIFFormatCSFormulaField |
		//VSField+=TMTCIFFormatVSField | FDICField+=TMTCIFFormatFDICField | VRFieldSize+=TMTCIFFormatVRFieldSize |
		//AField+=TMTCIFFormatAField | AIField+=TMTCIFFormatAIField)*)
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
		
		//'protocol' ':=' protocol=ID ';'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'protocol'
		public Keyword getProtocolKeyword_3_2_0() { return cProtocolKeyword_3_2_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_2_1() { return cColonEqualsSignKeyword_3_2_1; }
		
		//protocol=ID
		public Assignment getProtocolAssignment_3_2_2() { return cProtocolAssignment_3_2_2; }
		
		//ID
		public RuleCall getProtocolIDTerminalRuleCall_3_2_2_0() { return cProtocolIDTerminalRuleCall_3_2_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_2_3() { return cSemicolonKeyword_3_2_3; }
		
		//('type' ':=' type=TMTCIFFormatFormatType ';') (CSField+=TMTCIFFormatCSField | CSFormulaField+=TMTCIFFormatCSFormulaField
		//| VSField+=TMTCIFFormatVSField | FDICField+=TMTCIFFormatFDICField | VRFieldSize+=TMTCIFFormatVRFieldSize |
		//AField+=TMTCIFFormatAField | AIField+=TMTCIFFormatAIField)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//('type' ':=' type=TMTCIFFormatFormatType ';')
		public Group getGroup_3_3_0() { return cGroup_3_3_0; }
		
		//'type'
		public Keyword getTypeKeyword_3_3_0_0() { return cTypeKeyword_3_3_0_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3_3_0_1() { return cColonEqualsSignKeyword_3_3_0_1; }
		
		//type=TMTCIFFormatFormatType
		public Assignment getTypeAssignment_3_3_0_2() { return cTypeAssignment_3_3_0_2; }
		
		//TMTCIFFormatFormatType
		public RuleCall getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0() { return cTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3_3_0_3() { return cSemicolonKeyword_3_3_0_3; }
		
		//(CSField+=TMTCIFFormatCSField | CSFormulaField+=TMTCIFFormatCSFormulaField | VSField+=TMTCIFFormatVSField |
		//FDICField+=TMTCIFFormatFDICField | VRFieldSize+=TMTCIFFormatVRFieldSize | AField+=TMTCIFFormatAField |
		//AIField+=TMTCIFFormatAIField)*
		public Alternatives getAlternatives_3_3_1() { return cAlternatives_3_3_1; }
		
		//CSField+=TMTCIFFormatCSField
		public Assignment getCSFieldAssignment_3_3_1_0() { return cCSFieldAssignment_3_3_1_0; }
		
		//TMTCIFFormatCSField
		public RuleCall getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0() { return cCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0; }
		
		//CSFormulaField+=TMTCIFFormatCSFormulaField
		public Assignment getCSFormulaFieldAssignment_3_3_1_1() { return cCSFormulaFieldAssignment_3_3_1_1; }
		
		//TMTCIFFormatCSFormulaField
		public RuleCall getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0() { return cCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0; }
		
		//VSField+=TMTCIFFormatVSField
		public Assignment getVSFieldAssignment_3_3_1_2() { return cVSFieldAssignment_3_3_1_2; }
		
		//TMTCIFFormatVSField
		public RuleCall getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0() { return cVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0; }
		
		//FDICField+=TMTCIFFormatFDICField
		public Assignment getFDICFieldAssignment_3_3_1_3() { return cFDICFieldAssignment_3_3_1_3; }
		
		//TMTCIFFormatFDICField
		public RuleCall getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0() { return cFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0; }
		
		//VRFieldSize+=TMTCIFFormatVRFieldSize
		public Assignment getVRFieldSizeAssignment_3_3_1_4() { return cVRFieldSizeAssignment_3_3_1_4; }
		
		//TMTCIFFormatVRFieldSize
		public RuleCall getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0() { return cVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0; }
		
		//AField+=TMTCIFFormatAField
		public Assignment getAFieldAssignment_3_3_1_5() { return cAFieldAssignment_3_3_1_5; }
		
		//TMTCIFFormatAField
		public RuleCall getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0() { return cAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0; }
		
		//AIField+=TMTCIFFormatAIField
		public Assignment getAIFieldAssignment_3_3_1_6() { return cAIFieldAssignment_3_3_1_6; }
		
		//TMTCIFFormatAIField
		public RuleCall getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0() { return cAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TMTCIFFormatFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatField");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTMTCIFFormatCSFieldParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTMTCIFFormatCSFormulaFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTMTCIFFormatVSFieldParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTMTCIFFormatVRFieldSizeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cTMTCIFFormatFDICFieldParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//TMTCIFFormatField:
		//	TMTCIFFormatCSField | TMTCIFFormatCSFormulaField | TMTCIFFormatVSField | TMTCIFFormatVRFieldSize |
		//	TMTCIFFormatFDICField;
		@Override public ParserRule getRule() { return rule; }
		
		//TMTCIFFormatCSField | TMTCIFFormatCSFormulaField | TMTCIFFormatVSField | TMTCIFFormatVRFieldSize | TMTCIFFormatFDICField
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TMTCIFFormatCSField
		public RuleCall getTMTCIFFormatCSFieldParserRuleCall_0() { return cTMTCIFFormatCSFieldParserRuleCall_0; }
		
		//TMTCIFFormatCSFormulaField
		public RuleCall getTMTCIFFormatCSFormulaFieldParserRuleCall_1() { return cTMTCIFFormatCSFormulaFieldParserRuleCall_1; }
		
		//TMTCIFFormatVSField
		public RuleCall getTMTCIFFormatVSFieldParserRuleCall_2() { return cTMTCIFFormatVSFieldParserRuleCall_2; }
		
		//TMTCIFFormatVRFieldSize
		public RuleCall getTMTCIFFormatVRFieldSizeParserRuleCall_3() { return cTMTCIFFormatVRFieldSizeParserRuleCall_3; }
		
		//TMTCIFFormatFDICField
		public RuleCall getTMTCIFFormatFDICFieldParserRuleCall_4() { return cTMTCIFFormatFDICFieldParserRuleCall_4; }
	}
	public class TMTCIFFormatCSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatCSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeTMTCIFFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_29 = (Keyword)cGroup.eContents().get(29);
		private final Keyword cSemicolonKeyword_30 = (Keyword)cGroup.eContents().get(30);
		
		//TMTCIFFormatCSField:
		//	'TMTCIFFormatCSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=TMTCIFFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	size=TMTCIFFormatSize
		//	globalOffset=TMTCIFFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatCSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=TMTCIFFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';' size=TMTCIFFormatSize
		//globalOffset=TMTCIFFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatCSField'
		public Keyword getTMTCIFFormatCSFieldKeyword_0() { return cTMTCIFFormatCSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=TMTCIFFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//TMTCIFFormatFieldType
		public RuleCall getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0() { return cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=TMTCIFFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//TMTCIFFormatSize
		public RuleCall getSizeTMTCIFFormatSizeParserRuleCall_27_0() { return cSizeTMTCIFFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=TMTCIFFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//TMTCIFFormatGlobalOffset
		public RuleCall getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_29() { return cRightCurlyBracketKeyword_29; }
		
		//';'
		public Keyword getSemicolonKeyword_30() { return cSemicolonKeyword_30; }
	}
	public class TMTCIFFormatCSFormulaFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSFormulaField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatCSFormulaFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeTMTCIFFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0 = (RuleCall)cGlobalOffsetAssignment_28.eContents().get(0);
		private final Assignment cFormulaAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cFormulaTMTCIFFormatFormulaParserRuleCall_29_0 = (RuleCall)cFormulaAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//TMTCIFFormatCSFormulaField:
		//	'TMTCIFFormatCSFormulaField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=TMTCIFFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	size=TMTCIFFormatSize
		//	globalOffset=TMTCIFFormatGlobalOffset
		//	formula=TMTCIFFormatFormula
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatCSFormulaField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=TMTCIFFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';' size=TMTCIFFormatSize
		//globalOffset=TMTCIFFormatGlobalOffset formula=TMTCIFFormatFormula '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatCSFormulaField'
		public Keyword getTMTCIFFormatCSFormulaFieldKeyword_0() { return cTMTCIFFormatCSFormulaFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=TMTCIFFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//TMTCIFFormatFieldType
		public RuleCall getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0() { return cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=TMTCIFFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//TMTCIFFormatSize
		public RuleCall getSizeTMTCIFFormatSizeParserRuleCall_27_0() { return cSizeTMTCIFFormatSizeParserRuleCall_27_0; }
		
		//globalOffset=TMTCIFFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_28() { return cGlobalOffsetAssignment_28; }
		
		//TMTCIFFormatGlobalOffset
		public RuleCall getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0() { return cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0; }
		
		//formula=TMTCIFFormatFormula
		public Assignment getFormulaAssignment_29() { return cFormulaAssignment_29; }
		
		//TMTCIFFormatFormula
		public RuleCall getFormulaTMTCIFFormatFormulaParserRuleCall_29_0() { return cFormulaTMTCIFFormatFormulaParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class TMTCIFFormatVSFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVSField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatVSFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cConstSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0 = (RuleCall)cConstSizeAssignment_27.eContents().get(0);
		private final Assignment cVariableSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0 = (RuleCall)cVariableSizeAssignment_28.eContents().get(0);
		private final Assignment cMaxSizeAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0 = (RuleCall)cMaxSizeAssignment_29.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_30 = (Assignment)cGroup.eContents().get(30);
		private final RuleCall cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0 = (RuleCall)cGlobalOffsetAssignment_30.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_31 = (Keyword)cGroup.eContents().get(31);
		private final Keyword cSemicolonKeyword_32 = (Keyword)cGroup.eContents().get(32);
		
		//TMTCIFFormatVSField:
		//	'TMTCIFFormatVSField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=TMTCIFFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	constSize=TMTCIFFormatConstSize
		//	variableSize=TMTCIFFormatVariableSize
		//	maxSize=TMTCIFFormatMaxSize
		//	globalOffset=TMTCIFFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatVSField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=TMTCIFFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//constSize=TMTCIFFormatConstSize variableSize=TMTCIFFormatVariableSize maxSize=TMTCIFFormatMaxSize
		//globalOffset=TMTCIFFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatVSField'
		public Keyword getTMTCIFFormatVSFieldKeyword_0() { return cTMTCIFFormatVSFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=TMTCIFFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//TMTCIFFormatFieldType
		public RuleCall getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0() { return cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//constSize=TMTCIFFormatConstSize
		public Assignment getConstSizeAssignment_27() { return cConstSizeAssignment_27; }
		
		//TMTCIFFormatConstSize
		public RuleCall getConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0() { return cConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0; }
		
		//variableSize=TMTCIFFormatVariableSize
		public Assignment getVariableSizeAssignment_28() { return cVariableSizeAssignment_28; }
		
		//TMTCIFFormatVariableSize
		public RuleCall getVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0() { return cVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0; }
		
		//maxSize=TMTCIFFormatMaxSize
		public Assignment getMaxSizeAssignment_29() { return cMaxSizeAssignment_29; }
		
		//TMTCIFFormatMaxSize
		public RuleCall getMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0() { return cMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0; }
		
		//globalOffset=TMTCIFFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_30() { return cGlobalOffsetAssignment_30; }
		
		//TMTCIFFormatGlobalOffset
		public RuleCall getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0() { return cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_31() { return cRightCurlyBracketKeyword_31; }
		
		//';'
		public Keyword getSemicolonKeyword_32() { return cSemicolonKeyword_32; }
	}
	public class TMTCIFFormatVRFieldSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVRFieldSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatVRFieldSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cRightCurlyBracketKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cSemicolonKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//TMTCIFFormatVRFieldSize:
		//	'TMTCIFFormatVRFieldSize' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatVRFieldSize' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';' '}'
		//';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatVRFieldSize'
		public Keyword getTMTCIFFormatVRFieldSizeKeyword_0() { return cTMTCIFFormatVRFieldSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_14() { return cRightCurlyBracketKeyword_14; }
		
		//';'
		public Keyword getSemicolonKeyword_15() { return cSemicolonKeyword_15; }
	}
	public class TMTCIFFormatFDICFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFDICField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatFDICFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cCheckTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cCheckTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0 = (RuleCall)cCheckTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cSizeAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cSizeTMTCIFFormatSizeParserRuleCall_27_0 = (RuleCall)cSizeAssignment_27.eContents().get(0);
		private final Assignment cFloatingOffsetAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0 = (RuleCall)cFloatingOffsetAssignment_28.eContents().get(0);
		private final Assignment cSortedFieldsToCheckAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0 = (RuleCall)cSortedFieldsToCheckAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//TMTCIFFormatFDICField:
		//	'TMTCIFFormatFDICField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'checkType' ':=' checkType=TMTCIFFormatCheckType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	size=TMTCIFFormatSize
		//	floatingOffset=TMTCIFFormatFloatingOffset
		//	sortedFieldsToCheck=TMTCIFFormatSortedFieldsToCheck
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatFDICField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'checkType' ':=' checkType=TMTCIFFormatCheckType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';' size=TMTCIFFormatSize
		//floatingOffset=TMTCIFFormatFloatingOffset sortedFieldsToCheck=TMTCIFFormatSortedFieldsToCheck '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatFDICField'
		public Keyword getTMTCIFFormatFDICFieldKeyword_0() { return cTMTCIFFormatFDICFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'checkType'
		public Keyword getCheckTypeKeyword_15() { return cCheckTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//checkType=TMTCIFFormatCheckType
		public Assignment getCheckTypeAssignment_17() { return cCheckTypeAssignment_17; }
		
		//TMTCIFFormatCheckType
		public RuleCall getCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0() { return cCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//size=TMTCIFFormatSize
		public Assignment getSizeAssignment_27() { return cSizeAssignment_27; }
		
		//TMTCIFFormatSize
		public RuleCall getSizeTMTCIFFormatSizeParserRuleCall_27_0() { return cSizeTMTCIFFormatSizeParserRuleCall_27_0; }
		
		//floatingOffset=TMTCIFFormatFloatingOffset
		public Assignment getFloatingOffsetAssignment_28() { return cFloatingOffsetAssignment_28; }
		
		//TMTCIFFormatFloatingOffset
		public RuleCall getFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0() { return cFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0; }
		
		//sortedFieldsToCheck=TMTCIFFormatSortedFieldsToCheck
		public Assignment getSortedFieldsToCheckAssignment_29() { return cSortedFieldsToCheckAssignment_29; }
		
		//TMTCIFFormatSortedFieldsToCheck
		public RuleCall getSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0() { return cSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class TMTCIFFormatAFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatAFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cArrayDimensionAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0 = (RuleCall)cArrayDimensionAssignment_27.eContents().get(0);
		private final Assignment cSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cSizeTMTCIFFormatSizeParserRuleCall_28_0 = (RuleCall)cSizeAssignment_28.eContents().get(0);
		private final Assignment cGlobalOffsetAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0 = (RuleCall)cGlobalOffsetAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//TMTCIFFormatAField:
		//	'TMTCIFFormatAField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=TMTCIFFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	arrayDimension=TMTCIFFormatArrayDimension
		//	size=TMTCIFFormatSize
		//	globalOffset=TMTCIFFormatGlobalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatAField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=TMTCIFFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//arrayDimension=TMTCIFFormatArrayDimension size=TMTCIFFormatSize globalOffset=TMTCIFFormatGlobalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatAField'
		public Keyword getTMTCIFFormatAFieldKeyword_0() { return cTMTCIFFormatAFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=TMTCIFFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//TMTCIFFormatFieldType
		public RuleCall getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0() { return cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//arrayDimension=TMTCIFFormatArrayDimension
		public Assignment getArrayDimensionAssignment_27() { return cArrayDimensionAssignment_27; }
		
		//TMTCIFFormatArrayDimension
		public RuleCall getArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0() { return cArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0; }
		
		//size=TMTCIFFormatSize
		public Assignment getSizeAssignment_28() { return cSizeAssignment_28; }
		
		//TMTCIFFormatSize
		public RuleCall getSizeTMTCIFFormatSizeParserRuleCall_28_0() { return cSizeTMTCIFFormatSizeParserRuleCall_28_0; }
		
		//globalOffset=TMTCIFFormatGlobalOffset
		public Assignment getGlobalOffsetAssignment_29() { return cGlobalOffsetAssignment_29; }
		
		//TMTCIFFormatGlobalOffset
		public RuleCall getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0() { return cGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class TMTCIFFormatAIFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAIField");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatAIFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidINTEGERParserRuleCall_4_0 = (RuleCall)cFidAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPfidKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPfidAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPfidINTEGERParserRuleCall_8_0 = (RuleCall)cPfidAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cNameKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cColonEqualsSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cNameAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cNameSTRINGTerminalRuleCall_12_0 = (RuleCall)cNameAssignment_12.eContents().get(0);
		private final Keyword cSemicolonKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cDescriptionKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_14_1 = (Keyword)cGroup_14.eContents().get(1);
		private final Assignment cDescriptionAssignment_14_2 = (Assignment)cGroup_14.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_14_2_0 = (RuleCall)cDescriptionAssignment_14_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_14_3 = (Keyword)cGroup_14.eContents().get(3);
		private final Keyword cTypeKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cTypeAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0 = (RuleCall)cTypeAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cByteOrderKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cColonEqualsSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cByteOrderAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0 = (RuleCall)cByteOrderAssignment_21.eContents().get(0);
		private final Keyword cSemicolonKeyword_22 = (Keyword)cGroup.eContents().get(22);
		private final Keyword cFirstBitKeyword_23 = (Keyword)cGroup.eContents().get(23);
		private final Keyword cColonEqualsSignKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final Assignment cFirstBitAssignment_25 = (Assignment)cGroup.eContents().get(25);
		private final RuleCall cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0 = (RuleCall)cFirstBitAssignment_25.eContents().get(0);
		private final Keyword cSemicolonKeyword_26 = (Keyword)cGroup.eContents().get(26);
		private final Assignment cArrayRefAssignment_27 = (Assignment)cGroup.eContents().get(27);
		private final RuleCall cArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0 = (RuleCall)cArrayRefAssignment_27.eContents().get(0);
		private final Assignment cSizeAssignment_28 = (Assignment)cGroup.eContents().get(28);
		private final RuleCall cSizeTMTCIFFormatSizeParserRuleCall_28_0 = (RuleCall)cSizeAssignment_28.eContents().get(0);
		private final Assignment cLocalOffsetAssignment_29 = (Assignment)cGroup.eContents().get(29);
		private final RuleCall cLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0 = (RuleCall)cLocalOffsetAssignment_29.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_30 = (Keyword)cGroup.eContents().get(30);
		private final Keyword cSemicolonKeyword_31 = (Keyword)cGroup.eContents().get(31);
		
		//TMTCIFFormatAIField:
		//	'TMTCIFFormatAIField' '{'
		//	'fid' ':=' fid=INTEGER ';'
		//	'pfid' ':=' pfid=INTEGER ';'
		//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
		//	'type' ':=' type=TMTCIFFormatFieldType ';'
		//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
		//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//	arrayRef=TMTCIFFormatArrayRef
		//	size=TMTCIFFormatSize
		//	localOffset=TMTCIFFormatLocalOffset
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatAIField' '{' 'fid' ':=' fid=INTEGER ';' 'pfid' ':=' pfid=INTEGER ';' 'name' ':=' name=STRING ';'
		//('description' ':=' description=STRING ';')? 'type' ':=' type=TMTCIFFormatFieldType ';' 'byteOrder' ':='
		//byteOrder=TMTCIFFormatFieldByteOrder ';' 'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
		//arrayRef=TMTCIFFormatArrayRef size=TMTCIFFormatSize localOffset=TMTCIFFormatLocalOffset '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatAIField'
		public Keyword getTMTCIFFormatAIFieldKeyword_0() { return cTMTCIFFormatAIFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fid'
		public Keyword getFidKeyword_2() { return cFidKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fid=INTEGER
		public Assignment getFidAssignment_4() { return cFidAssignment_4; }
		
		//INTEGER
		public RuleCall getFidINTEGERParserRuleCall_4_0() { return cFidINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'pfid'
		public Keyword getPfidKeyword_6() { return cPfidKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//pfid=INTEGER
		public Assignment getPfidAssignment_8() { return cPfidAssignment_8; }
		
		//INTEGER
		public RuleCall getPfidINTEGERParserRuleCall_8_0() { return cPfidINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'name'
		public Keyword getNameKeyword_10() { return cNameKeyword_10; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_11() { return cColonEqualsSignKeyword_11; }
		
		//name=STRING
		public Assignment getNameAssignment_12() { return cNameAssignment_12; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_12_0() { return cNameSTRINGTerminalRuleCall_12_0; }
		
		//';'
		public Keyword getSemicolonKeyword_13() { return cSemicolonKeyword_13; }
		
		//('description' ':=' description=STRING ';')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'description'
		public Keyword getDescriptionKeyword_14_0() { return cDescriptionKeyword_14_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_14_1() { return cColonEqualsSignKeyword_14_1; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_14_2() { return cDescriptionAssignment_14_2; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_14_2_0() { return cDescriptionSTRINGTerminalRuleCall_14_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14_3() { return cSemicolonKeyword_14_3; }
		
		//'type'
		public Keyword getTypeKeyword_15() { return cTypeKeyword_15; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_16() { return cColonEqualsSignKeyword_16; }
		
		//type=TMTCIFFormatFieldType
		public Assignment getTypeAssignment_17() { return cTypeAssignment_17; }
		
		//TMTCIFFormatFieldType
		public RuleCall getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0() { return cTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'byteOrder'
		public Keyword getByteOrderKeyword_19() { return cByteOrderKeyword_19; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_20() { return cColonEqualsSignKeyword_20; }
		
		//byteOrder=TMTCIFFormatFieldByteOrder
		public Assignment getByteOrderAssignment_21() { return cByteOrderAssignment_21; }
		
		//TMTCIFFormatFieldByteOrder
		public RuleCall getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0() { return cByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0; }
		
		//';'
		public Keyword getSemicolonKeyword_22() { return cSemicolonKeyword_22; }
		
		//'firstBit'
		public Keyword getFirstBitKeyword_23() { return cFirstBitKeyword_23; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_24() { return cColonEqualsSignKeyword_24; }
		
		//firstBit=TMTCIFFormatSFieldFirstBit
		public Assignment getFirstBitAssignment_25() { return cFirstBitAssignment_25; }
		
		//TMTCIFFormatSFieldFirstBit
		public RuleCall getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0() { return cFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0; }
		
		//';'
		public Keyword getSemicolonKeyword_26() { return cSemicolonKeyword_26; }
		
		//arrayRef=TMTCIFFormatArrayRef
		public Assignment getArrayRefAssignment_27() { return cArrayRefAssignment_27; }
		
		//TMTCIFFormatArrayRef
		public RuleCall getArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0() { return cArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0; }
		
		//size=TMTCIFFormatSize
		public Assignment getSizeAssignment_28() { return cSizeAssignment_28; }
		
		//TMTCIFFormatSize
		public RuleCall getSizeTMTCIFFormatSizeParserRuleCall_28_0() { return cSizeTMTCIFFormatSizeParserRuleCall_28_0; }
		
		//localOffset=TMTCIFFormatLocalOffset
		public Assignment getLocalOffsetAssignment_29() { return cLocalOffsetAssignment_29; }
		
		//TMTCIFFormatLocalOffset
		public RuleCall getLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0() { return cLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_30() { return cRightCurlyBracketKeyword_30; }
		
		//';'
		public Keyword getSemicolonKeyword_31() { return cSemicolonKeyword_31; }
	}
	public class TMTCIFFormatSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatSize TMTCIFFormatBytesBits:
		//	'TMTCIFFormatSize'
		//	'{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatSize'
		public Keyword getTMTCIFFormatSizeKeyword_0() { return cTMTCIFFormatSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatGlobalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatGlobalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatGlobalOffset TMTCIFFormatBytesBits:
		//	'TMTCIFFormatGlobalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatGlobalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatGlobalOffset'
		public Keyword getTMTCIFFormatGlobalOffsetKeyword_0() { return cTMTCIFFormatGlobalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatFormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatFormulaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSlopeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSlopeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSlopeSTRINGTerminalRuleCall_4_0 = (RuleCall)cSlopeAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cInterceptKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInterceptAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInterceptSTRINGTerminalRuleCall_8_0 = (RuleCall)cInterceptAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatFormula:
		//	'TMTCIFFormatFormula' '{'
		//	'slope' ':=' slope=STRING ';'
		//	'intercept' ':=' intercept=STRING ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatFormula' '{' 'slope' ':=' slope=STRING ';' 'intercept' ':=' intercept=STRING ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatFormula'
		public Keyword getTMTCIFFormatFormulaKeyword_0() { return cTMTCIFFormatFormulaKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'slope'
		public Keyword getSlopeKeyword_2() { return cSlopeKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//slope=STRING
		public Assignment getSlopeAssignment_4() { return cSlopeAssignment_4; }
		
		//STRING
		public RuleCall getSlopeSTRINGTerminalRuleCall_4_0() { return cSlopeSTRINGTerminalRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'intercept'
		public Keyword getInterceptKeyword_6() { return cInterceptKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//intercept=STRING
		public Assignment getInterceptAssignment_8() { return cInterceptAssignment_8; }
		
		//STRING
		public RuleCall getInterceptSTRINGTerminalRuleCall_8_0() { return cInterceptSTRINGTerminalRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatConstSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatConstSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatConstSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatConstSize TMTCIFFormatBytesBits:
		//	'TMTCIFFormatConstSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatConstSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatConstSize'
		public Keyword getTMTCIFFormatConstSizeKeyword_0() { return cTMTCIFFormatConstSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatMaxSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatMaxSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatMaxSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatMaxSize TMTCIFFormatBytesBits:
		//	'TMTCIFFormatMaxSize' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatMaxSize' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatMaxSize'
		public Keyword getTMTCIFFormatMaxSizeKeyword_0() { return cTMTCIFFormatMaxSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatVariableSizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVariableSize");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatVariableSizeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cUnitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cUnitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cUnitTMTCIFFormatUnitEnumRuleCall_8_0 = (RuleCall)cUnitAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cPowerKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Keyword cColonEqualsSignKeyword_10_1 = (Keyword)cGroup_10.eContents().get(1);
		private final Assignment cPowerAssignment_10_2 = (Assignment)cGroup_10.eContents().get(2);
		private final RuleCall cPowerTMTCIFFormatPowerEnumRuleCall_10_2_0 = (RuleCall)cPowerAssignment_10_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_10_3 = (Keyword)cGroup_10.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//TMTCIFFormatVariableSize:
		//	'TMTCIFFormatVariableSize' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'unit' ':=' unit=TMTCIFFormatUnit ';' ('power' ':=' power=TMTCIFFormatPower ';')?
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatVariableSize' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'unit' ':=' unit=TMTCIFFormatUnit ';' ('power' ':='
		//power=TMTCIFFormatPower ';')? '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatVariableSize'
		public Keyword getTMTCIFFormatVariableSizeKeyword_0() { return cTMTCIFFormatVariableSizeKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'unit'
		public Keyword getUnitKeyword_6() { return cUnitKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//unit=TMTCIFFormatUnit
		public Assignment getUnitAssignment_8() { return cUnitAssignment_8; }
		
		//TMTCIFFormatUnit
		public RuleCall getUnitTMTCIFFormatUnitEnumRuleCall_8_0() { return cUnitTMTCIFFormatUnitEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//('power' ':=' power=TMTCIFFormatPower ';')?
		public Group getGroup_10() { return cGroup_10; }
		
		//'power'
		public Keyword getPowerKeyword_10_0() { return cPowerKeyword_10_0; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_10_1() { return cColonEqualsSignKeyword_10_1; }
		
		//power=TMTCIFFormatPower
		public Assignment getPowerAssignment_10_2() { return cPowerAssignment_10_2; }
		
		//TMTCIFFormatPower
		public RuleCall getPowerTMTCIFFormatPowerEnumRuleCall_10_2_0() { return cPowerTMTCIFFormatPowerEnumRuleCall_10_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10_3() { return cSemicolonKeyword_10_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
	}
	public class TMTCIFFormatFloatingOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFloatingOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatFloatingOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TMTCIFFormatFloatingOffset:
		//	'TMTCIFFormatFloatingOffset' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatFloatingOffset' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatFloatingOffset'
		public Keyword getTMTCIFFormatFloatingOffsetKeyword_0() { return cTMTCIFFormatFloatingOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class TMTCIFFormatSortedFieldsToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSortedFieldsToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTMTCIFFormatSortedFieldsToCheckAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTMTCIFFormatSortedFieldsToCheckKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldToCheckAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0 = (RuleCall)cFieldToCheckAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TMTCIFFormatSortedFieldsToCheck:
		//	{TMTCIFFormatSortedFieldsToCheck}
		//	'TMTCIFFormatSortedFieldsToCheck' '{'
		//	fieldToCheck+=TMTCIFFormatFieldToCheck+
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//{TMTCIFFormatSortedFieldsToCheck} 'TMTCIFFormatSortedFieldsToCheck' '{' fieldToCheck+=TMTCIFFormatFieldToCheck+ '}' ';'
		public Group getGroup() { return cGroup; }
		
		//{TMTCIFFormatSortedFieldsToCheck}
		public Action getTMTCIFFormatSortedFieldsToCheckAction_0() { return cTMTCIFFormatSortedFieldsToCheckAction_0; }
		
		//'TMTCIFFormatSortedFieldsToCheck'
		public Keyword getTMTCIFFormatSortedFieldsToCheckKeyword_1() { return cTMTCIFFormatSortedFieldsToCheckKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//fieldToCheck+=TMTCIFFormatFieldToCheck+
		public Assignment getFieldToCheckAssignment_3() { return cFieldToCheckAssignment_3; }
		
		//TMTCIFFormatFieldToCheck
		public RuleCall getFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0() { return cFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TMTCIFFormatFieldToCheckElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldToCheck");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatFieldToCheckKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TMTCIFFormatFieldToCheck:
		//	'TMTCIFFormatFieldToCheck' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatFieldToCheck' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatFieldToCheck'
		public Keyword getTMTCIFFormatFieldToCheckKeyword_0() { return cTMTCIFFormatFieldToCheckKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class TMTCIFFormatArrayDimensionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayDimension");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatArrayDimensionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMaxItemsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cMaxItemsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cMaxItemsINTEGERParserRuleCall_8_0 = (RuleCall)cMaxItemsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatArrayDimension:
		//	'TMTCIFFormatArrayDimension' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'maxItems' ':=' maxItems=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatArrayDimension' '{' 'fidRef' ':=' fidRef=INTEGER ';' 'maxItems' ':=' maxItems=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatArrayDimension'
		public Keyword getTMTCIFFormatArrayDimensionKeyword_0() { return cTMTCIFFormatArrayDimensionKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'maxItems'
		public Keyword getMaxItemsKeyword_6() { return cMaxItemsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//maxItems=INTEGER
		public Assignment getMaxItemsAssignment_8() { return cMaxItemsAssignment_8; }
		
		//INTEGER
		public RuleCall getMaxItemsINTEGERParserRuleCall_8_0() { return cMaxItemsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatLocalOffsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatLocalOffset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatLocalOffsetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBytesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBytesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBytesINTEGERParserRuleCall_4_0 = (RuleCall)cBytesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cBitsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cBitsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cBitsINTEGERParserRuleCall_8_0 = (RuleCall)cBitsAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cSemicolonKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//TMTCIFFormatLocalOffset TMTCIFFormatBytesBits:
		//	'TMTCIFFormatLocalOffset' '{'
		//	'bytes' ':=' bytes=INTEGER ';'
		//	'bits' ':=' bits=INTEGER ';'
		//	'}' ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatLocalOffset' '{' 'bytes' ':=' bytes=INTEGER ';' 'bits' ':=' bits=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatLocalOffset'
		public Keyword getTMTCIFFormatLocalOffsetKeyword_0() { return cTMTCIFFormatLocalOffsetKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'bytes'
		public Keyword getBytesKeyword_2() { return cBytesKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//bytes=INTEGER
		public Assignment getBytesAssignment_4() { return cBytesAssignment_4; }
		
		//INTEGER
		public RuleCall getBytesINTEGERParserRuleCall_4_0() { return cBytesINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'bits'
		public Keyword getBitsKeyword_6() { return cBitsKeyword_6; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_7() { return cColonEqualsSignKeyword_7; }
		
		//bits=INTEGER
		public Assignment getBitsAssignment_8() { return cBitsAssignment_8; }
		
		//INTEGER
		public RuleCall getBitsINTEGERParserRuleCall_8_0() { return cBitsINTEGERParserRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//';'
		public Keyword getSemicolonKeyword_11() { return cSemicolonKeyword_11; }
	}
	public class TMTCIFFormatArrayRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTMTCIFFormatArrayRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cFidRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cColonEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFidRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFidRefINTEGERParserRuleCall_4_0 = (RuleCall)cFidRefAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//TMTCIFFormatArrayRef:
		//	'TMTCIFFormatArrayRef' '{'
		//	'fidRef' ':=' fidRef=INTEGER ';'
		//	'}' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'TMTCIFFormatArrayRef' '{' 'fidRef' ':=' fidRef=INTEGER ';' '}' ';'
		public Group getGroup() { return cGroup; }
		
		//'TMTCIFFormatArrayRef'
		public Keyword getTMTCIFFormatArrayRefKeyword_0() { return cTMTCIFFormatArrayRefKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'fidRef'
		public Keyword getFidRefKeyword_2() { return cFidRefKeyword_2; }
		
		//':='
		public Keyword getColonEqualsSignKeyword_3() { return cColonEqualsSignKeyword_3; }
		
		//fidRef=INTEGER
		public Assignment getFidRefAssignment_4() { return cFidRefAssignment_4; }
		
		//INTEGER
		public RuleCall getFidRefINTEGERParserRuleCall_4_0() { return cFidRefINTEGERParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//';'
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.QualifiedName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.Version");
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
	public class INTEGERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
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
	
	public class TMTCIFFormatFormatTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormatType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTMEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTMTMKeyword_0_0 = (Keyword)cTMEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTCTCKeyword_1_0 = (Keyword)cTCEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFFormatFormatType:
		//	TM | TC;
		public EnumRule getRule() { return rule; }
		
		//TM | TC
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TM
		public EnumLiteralDeclaration getTMEnumLiteralDeclaration_0() { return cTMEnumLiteralDeclaration_0; }
		
		//'TM'
		public Keyword getTMTMKeyword_0_0() { return cTMTMKeyword_0_0; }
		
		//TC
		public EnumLiteralDeclaration getTCEnumLiteralDeclaration_1() { return cTCEnumLiteralDeclaration_1; }
		
		//'TC'
		public Keyword getTCTCKeyword_1_0() { return cTCTCKeyword_1_0; }
	}
	public class TMTCIFFormatFieldTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStructuredEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStructuredStructuredKeyword_0_0 = (Keyword)cStructuredEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cUintEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cUintUintKeyword_1_0 = (Keyword)cUintEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFlagEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFlagFlagKeyword_2_0 = (Keyword)cFlagEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cEnumeratedEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cEnumeratedEnumeratedKeyword_3_0 = (Keyword)cEnumeratedEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBit_vectorEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBit_vectorBit_vectorKeyword_4_0 = (Keyword)cBit_vectorEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cByte_vectorEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cByte_vectorByte_vectorKeyword_5_0 = (Keyword)cByte_vectorEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cFloatFloatKeyword_6_0 = (Keyword)cFloatEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cDeducedEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cDeducedDeducedKeyword_7_0 = (Keyword)cDeducedEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum TMTCIFFormatFieldType:
		//	structured | uint | flag |
		//	enumerated | bit_vector |
		//	byte_vector | float | deduced;
		public EnumRule getRule() { return rule; }
		
		//structured | uint | flag | enumerated | bit_vector | byte_vector | float | deduced
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//structured
		public EnumLiteralDeclaration getStructuredEnumLiteralDeclaration_0() { return cStructuredEnumLiteralDeclaration_0; }
		
		//'structured'
		public Keyword getStructuredStructuredKeyword_0_0() { return cStructuredStructuredKeyword_0_0; }
		
		//uint
		public EnumLiteralDeclaration getUintEnumLiteralDeclaration_1() { return cUintEnumLiteralDeclaration_1; }
		
		//'uint'
		public Keyword getUintUintKeyword_1_0() { return cUintUintKeyword_1_0; }
		
		//flag
		public EnumLiteralDeclaration getFlagEnumLiteralDeclaration_2() { return cFlagEnumLiteralDeclaration_2; }
		
		//'flag'
		public Keyword getFlagFlagKeyword_2_0() { return cFlagFlagKeyword_2_0; }
		
		//enumerated
		public EnumLiteralDeclaration getEnumeratedEnumLiteralDeclaration_3() { return cEnumeratedEnumLiteralDeclaration_3; }
		
		//'enumerated'
		public Keyword getEnumeratedEnumeratedKeyword_3_0() { return cEnumeratedEnumeratedKeyword_3_0; }
		
		//bit_vector
		public EnumLiteralDeclaration getBit_vectorEnumLiteralDeclaration_4() { return cBit_vectorEnumLiteralDeclaration_4; }
		
		//'bit_vector'
		public Keyword getBit_vectorBit_vectorKeyword_4_0() { return cBit_vectorBit_vectorKeyword_4_0; }
		
		//byte_vector
		public EnumLiteralDeclaration getByte_vectorEnumLiteralDeclaration_5() { return cByte_vectorEnumLiteralDeclaration_5; }
		
		//'byte_vector'
		public Keyword getByte_vectorByte_vectorKeyword_5_0() { return cByte_vectorByte_vectorKeyword_5_0; }
		
		//float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_6() { return cFloatEnumLiteralDeclaration_6; }
		
		//'float'
		public Keyword getFloatFloatKeyword_6_0() { return cFloatFloatKeyword_6_0; }
		
		//deduced
		public EnumLiteralDeclaration getDeducedEnumLiteralDeclaration_7() { return cDeducedEnumLiteralDeclaration_7; }
		
		//'deduced'
		public Keyword getDeducedDeducedKeyword_7_0() { return cDeducedDeducedKeyword_7_0; }
	}
	public class TMTCIFFormatFieldByteOrderElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBig_endianEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBig_endianBig_endianKeyword_0_0 = (Keyword)cBig_endianEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLittle_endianEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLittle_endianLittle_endianKeyword_1_0 = (Keyword)cLittle_endianEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNaEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNaNaKeyword_2_0 = (Keyword)cNaEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TMTCIFFormatFieldByteOrder:
		//	big_endian | little_endian | na;
		public EnumRule getRule() { return rule; }
		
		//big_endian | little_endian | na
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//big_endian
		public EnumLiteralDeclaration getBig_endianEnumLiteralDeclaration_0() { return cBig_endianEnumLiteralDeclaration_0; }
		
		//'big_endian'
		public Keyword getBig_endianBig_endianKeyword_0_0() { return cBig_endianBig_endianKeyword_0_0; }
		
		//little_endian
		public EnumLiteralDeclaration getLittle_endianEnumLiteralDeclaration_1() { return cLittle_endianEnumLiteralDeclaration_1; }
		
		//'little_endian'
		public Keyword getLittle_endianLittle_endianKeyword_1_0() { return cLittle_endianLittle_endianKeyword_1_0; }
		
		//na
		public EnumLiteralDeclaration getNaEnumLiteralDeclaration_2() { return cNaEnumLiteralDeclaration_2; }
		
		//'na'
		public Keyword getNaNaKeyword_2_0() { return cNaNaKeyword_2_0; }
	}
	public class TMTCIFFormatSFieldFirstBitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMSBEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMSBMSBKeyword_0_0 = (Keyword)cMSBEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLSBEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLSBLSBKeyword_1_0 = (Keyword)cLSBEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFFormatSFieldFirstBit:
		//	MSB | LSB;
		public EnumRule getRule() { return rule; }
		
		//MSB | LSB
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MSB
		public EnumLiteralDeclaration getMSBEnumLiteralDeclaration_0() { return cMSBEnumLiteralDeclaration_0; }
		
		//'MSB'
		public Keyword getMSBMSBKeyword_0_0() { return cMSBMSBKeyword_0_0; }
		
		//LSB
		public EnumLiteralDeclaration getLSBEnumLiteralDeclaration_1() { return cLSBEnumLiteralDeclaration_1; }
		
		//'LSB'
		public Keyword getLSBLSBKeyword_1_0() { return cLSBLSBKeyword_1_0; }
	}
	public class TMTCIFFormatUnitElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatUnit");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBytesEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBytesBytesKeyword_0_0 = (Keyword)cBytesEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBitsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBitsBitsKeyword_1_0 = (Keyword)cBitsEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cHalfwordEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cHalfwordHalfwordKeyword_2_0 = (Keyword)cHalfwordEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cString10EnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cString10String10Keyword_3_0 = (Keyword)cString10EnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cString17EnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cString17String17Keyword_4_0 = (Keyword)cString17EnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cString69EnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cString69String69Keyword_5_0 = (Keyword)cString69EnumLiteralDeclaration_5.eContents().get(0);
		
		//enum TMTCIFFormatUnit:
		//	bytes | bits |
		//	halfword | string10 |
		//	string17 | string69;
		public EnumRule getRule() { return rule; }
		
		//bytes | bits | halfword | string10 | string17 | string69
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//bytes
		public EnumLiteralDeclaration getBytesEnumLiteralDeclaration_0() { return cBytesEnumLiteralDeclaration_0; }
		
		//'bytes'
		public Keyword getBytesBytesKeyword_0_0() { return cBytesBytesKeyword_0_0; }
		
		//bits
		public EnumLiteralDeclaration getBitsEnumLiteralDeclaration_1() { return cBitsEnumLiteralDeclaration_1; }
		
		//'bits'
		public Keyword getBitsBitsKeyword_1_0() { return cBitsBitsKeyword_1_0; }
		
		//halfword
		public EnumLiteralDeclaration getHalfwordEnumLiteralDeclaration_2() { return cHalfwordEnumLiteralDeclaration_2; }
		
		//'halfword'
		public Keyword getHalfwordHalfwordKeyword_2_0() { return cHalfwordHalfwordKeyword_2_0; }
		
		//string10
		public EnumLiteralDeclaration getString10EnumLiteralDeclaration_3() { return cString10EnumLiteralDeclaration_3; }
		
		//'string10'
		public Keyword getString10String10Keyword_3_0() { return cString10String10Keyword_3_0; }
		
		//string17
		public EnumLiteralDeclaration getString17EnumLiteralDeclaration_4() { return cString17EnumLiteralDeclaration_4; }
		
		//'string17'
		public Keyword getString17String17Keyword_4_0() { return cString17String17Keyword_4_0; }
		
		//string69
		public EnumLiteralDeclaration getString69EnumLiteralDeclaration_5() { return cString69EnumLiteralDeclaration_5; }
		
		//'string69'
		public Keyword getString69String69Keyword_5_0() { return cString69String69Keyword_5_0; }
	}
	public class TMTCIFFormatPowerElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatPower");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration c_2EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword c_22bitsKeyword_0_0 = (Keyword)c_2EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration c_2_with_0EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword c_2_with_02bits_with_0Keyword_1_0 = (Keyword)c_2_with_0EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFFormatPower:
		//	_2='2bits' | _2_with_0='2bits_with_0';
		public EnumRule getRule() { return rule; }
		
		//_2='2bits' | _2_with_0='2bits_with_0'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//_2='2bits'
		public EnumLiteralDeclaration get_2EnumLiteralDeclaration_0() { return c_2EnumLiteralDeclaration_0; }
		
		//'2bits'
		public Keyword get_22bitsKeyword_0_0() { return c_22bitsKeyword_0_0; }
		
		//_2_with_0='2bits_with_0'
		public EnumLiteralDeclaration get_2_with_0EnumLiteralDeclaration_1() { return c_2_with_0EnumLiteralDeclaration_1; }
		
		//'2bits_with_0'
		public Keyword get_2_with_02bits_with_0Keyword_1_0() { return c_2_with_02bits_with_0Keyword_1_0; }
	}
	public class TMTCIFFormatCheckTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCheckType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCrc16EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCrc16Crc16Keyword_0_0 = (Keyword)cCrc16EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cChecksum16EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cChecksum16Checksum16Keyword_1_0 = (Keyword)cChecksum16EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TMTCIFFormatCheckType:
		//	crc16 | checksum16;
		public EnumRule getRule() { return rule; }
		
		//crc16 | checksum16
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//crc16
		public EnumLiteralDeclaration getCrc16EnumLiteralDeclaration_0() { return cCrc16EnumLiteralDeclaration_0; }
		
		//'crc16'
		public Keyword getCrc16Crc16Keyword_0_0() { return cCrc16Crc16Keyword_0_0; }
		
		//checksum16
		public EnumLiteralDeclaration getChecksum16EnumLiteralDeclaration_1() { return cChecksum16EnumLiteralDeclaration_1; }
		
		//'checksum16'
		public Keyword getChecksum16Checksum16Keyword_1_0() { return cChecksum16Checksum16Keyword_1_0; }
	}
	
	private final TMTCIFModelFileElements pTMTCIFModelFile;
	private final TMTCIFModelFileImportElements pTMTCIFModelFileImport;
	private final TMTCIFFormatFormatElements pTMTCIFFormatFormat;
	private final TMTCIFFormatFormatTypeElements eTMTCIFFormatFormatType;
	private final TMTCIFFormatFieldElements pTMTCIFFormatField;
	private final TMTCIFFormatCSFieldElements pTMTCIFFormatCSField;
	private final TMTCIFFormatCSFormulaFieldElements pTMTCIFFormatCSFormulaField;
	private final TMTCIFFormatVSFieldElements pTMTCIFFormatVSField;
	private final TMTCIFFormatVRFieldSizeElements pTMTCIFFormatVRFieldSize;
	private final TMTCIFFormatFDICFieldElements pTMTCIFFormatFDICField;
	private final TMTCIFFormatAFieldElements pTMTCIFFormatAField;
	private final TMTCIFFormatAIFieldElements pTMTCIFFormatAIField;
	private final TMTCIFFormatFieldTypeElements eTMTCIFFormatFieldType;
	private final TMTCIFFormatFieldByteOrderElements eTMTCIFFormatFieldByteOrder;
	private final TMTCIFFormatSFieldFirstBitElements eTMTCIFFormatSFieldFirstBit;
	private final TMTCIFFormatSizeElements pTMTCIFFormatSize;
	private final TMTCIFFormatGlobalOffsetElements pTMTCIFFormatGlobalOffset;
	private final TMTCIFFormatFormulaElements pTMTCIFFormatFormula;
	private final TMTCIFFormatConstSizeElements pTMTCIFFormatConstSize;
	private final TMTCIFFormatMaxSizeElements pTMTCIFFormatMaxSize;
	private final TMTCIFFormatVariableSizeElements pTMTCIFFormatVariableSize;
	private final TMTCIFFormatUnitElements eTMTCIFFormatUnit;
	private final TMTCIFFormatPowerElements eTMTCIFFormatPower;
	private final TMTCIFFormatCheckTypeElements eTMTCIFFormatCheckType;
	private final TMTCIFFormatFloatingOffsetElements pTMTCIFFormatFloatingOffset;
	private final TMTCIFFormatSortedFieldsToCheckElements pTMTCIFFormatSortedFieldsToCheck;
	private final TMTCIFFormatFieldToCheckElements pTMTCIFFormatFieldToCheck;
	private final TMTCIFFormatArrayDimensionElements pTMTCIFFormatArrayDimension;
	private final TMTCIFFormatLocalOffsetElements pTMTCIFFormatLocalOffset;
	private final TMTCIFFormatArrayRefElements pTMTCIFFormatArrayRef;
	private final QualifiedNameElements pQualifiedName;
	private final VersionElements pVersion;
	private final TerminalRule tHEXADECIMAL;
	private final INTEGERElements pINTEGER;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FORMATGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTMTCIFModelFile = new TMTCIFModelFileElements();
		this.pTMTCIFModelFileImport = new TMTCIFModelFileImportElements();
		this.pTMTCIFFormatFormat = new TMTCIFFormatFormatElements();
		this.eTMTCIFFormatFormatType = new TMTCIFFormatFormatTypeElements();
		this.pTMTCIFFormatField = new TMTCIFFormatFieldElements();
		this.pTMTCIFFormatCSField = new TMTCIFFormatCSFieldElements();
		this.pTMTCIFFormatCSFormulaField = new TMTCIFFormatCSFormulaFieldElements();
		this.pTMTCIFFormatVSField = new TMTCIFFormatVSFieldElements();
		this.pTMTCIFFormatVRFieldSize = new TMTCIFFormatVRFieldSizeElements();
		this.pTMTCIFFormatFDICField = new TMTCIFFormatFDICFieldElements();
		this.pTMTCIFFormatAField = new TMTCIFFormatAFieldElements();
		this.pTMTCIFFormatAIField = new TMTCIFFormatAIFieldElements();
		this.eTMTCIFFormatFieldType = new TMTCIFFormatFieldTypeElements();
		this.eTMTCIFFormatFieldByteOrder = new TMTCIFFormatFieldByteOrderElements();
		this.eTMTCIFFormatSFieldFirstBit = new TMTCIFFormatSFieldFirstBitElements();
		this.pTMTCIFFormatSize = new TMTCIFFormatSizeElements();
		this.pTMTCIFFormatGlobalOffset = new TMTCIFFormatGlobalOffsetElements();
		this.pTMTCIFFormatFormula = new TMTCIFFormatFormulaElements();
		this.pTMTCIFFormatConstSize = new TMTCIFFormatConstSizeElements();
		this.pTMTCIFFormatMaxSize = new TMTCIFFormatMaxSizeElements();
		this.pTMTCIFFormatVariableSize = new TMTCIFFormatVariableSizeElements();
		this.eTMTCIFFormatUnit = new TMTCIFFormatUnitElements();
		this.eTMTCIFFormatPower = new TMTCIFFormatPowerElements();
		this.eTMTCIFFormatCheckType = new TMTCIFFormatCheckTypeElements();
		this.pTMTCIFFormatFloatingOffset = new TMTCIFFormatFloatingOffsetElements();
		this.pTMTCIFFormatSortedFieldsToCheck = new TMTCIFFormatSortedFieldsToCheckElements();
		this.pTMTCIFFormatFieldToCheck = new TMTCIFFormatFieldToCheckElements();
		this.pTMTCIFFormatArrayDimension = new TMTCIFFormatArrayDimensionElements();
		this.pTMTCIFFormatLocalOffset = new TMTCIFFormatLocalOffsetElements();
		this.pTMTCIFFormatArrayRef = new TMTCIFFormatArrayRefElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pVersion = new VersionElements();
		this.tHEXADECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "es.uah.aut.srg.tmtcif.lang.format.FORMAT.HEXADECIMAL");
		this.pINTEGER = new INTEGERElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("es.uah.aut.srg.tmtcif.lang.format.FORMAT".equals(grammar.getName())) {
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
	//	element=TMTCIFFormatFormat
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
	
	//TMTCIFFormatFormat:
	//	'TMTCIFFormatFormat'
	//	name=ID
	//	'{' ('uri' ':=' uri=QualifiedName ';' & 'version' ':=' version=Version ';' & 'protocol' ':=' protocol=ID ';' &
	//	('type' ':=' type=TMTCIFFormatFormatType ';') (CSField+=TMTCIFFormatCSField |
	//	CSFormulaField+=TMTCIFFormatCSFormulaField | VSField+=TMTCIFFormatVSField | FDICField+=TMTCIFFormatFDICField |
	//	VRFieldSize+=TMTCIFFormatVRFieldSize | AField+=TMTCIFFormatAField | AIField+=TMTCIFFormatAIField)*)
	//	'}' ';';
	public TMTCIFFormatFormatElements getTMTCIFFormatFormatAccess() {
		return pTMTCIFFormatFormat;
	}
	
	public ParserRule getTMTCIFFormatFormatRule() {
		return getTMTCIFFormatFormatAccess().getRule();
	}
	
	//enum TMTCIFFormatFormatType:
	//	TM | TC;
	public TMTCIFFormatFormatTypeElements getTMTCIFFormatFormatTypeAccess() {
		return eTMTCIFFormatFormatType;
	}
	
	public EnumRule getTMTCIFFormatFormatTypeRule() {
		return getTMTCIFFormatFormatTypeAccess().getRule();
	}
	
	//TMTCIFFormatField:
	//	TMTCIFFormatCSField | TMTCIFFormatCSFormulaField | TMTCIFFormatVSField | TMTCIFFormatVRFieldSize |
	//	TMTCIFFormatFDICField;
	public TMTCIFFormatFieldElements getTMTCIFFormatFieldAccess() {
		return pTMTCIFFormatField;
	}
	
	public ParserRule getTMTCIFFormatFieldRule() {
		return getTMTCIFFormatFieldAccess().getRule();
	}
	
	//TMTCIFFormatCSField:
	//	'TMTCIFFormatCSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=TMTCIFFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	size=TMTCIFFormatSize
	//	globalOffset=TMTCIFFormatGlobalOffset
	//	'}' ';';
	public TMTCIFFormatCSFieldElements getTMTCIFFormatCSFieldAccess() {
		return pTMTCIFFormatCSField;
	}
	
	public ParserRule getTMTCIFFormatCSFieldRule() {
		return getTMTCIFFormatCSFieldAccess().getRule();
	}
	
	//TMTCIFFormatCSFormulaField:
	//	'TMTCIFFormatCSFormulaField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=TMTCIFFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	size=TMTCIFFormatSize
	//	globalOffset=TMTCIFFormatGlobalOffset
	//	formula=TMTCIFFormatFormula
	//	'}' ';';
	public TMTCIFFormatCSFormulaFieldElements getTMTCIFFormatCSFormulaFieldAccess() {
		return pTMTCIFFormatCSFormulaField;
	}
	
	public ParserRule getTMTCIFFormatCSFormulaFieldRule() {
		return getTMTCIFFormatCSFormulaFieldAccess().getRule();
	}
	
	//TMTCIFFormatVSField:
	//	'TMTCIFFormatVSField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=TMTCIFFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	constSize=TMTCIFFormatConstSize
	//	variableSize=TMTCIFFormatVariableSize
	//	maxSize=TMTCIFFormatMaxSize
	//	globalOffset=TMTCIFFormatGlobalOffset
	//	'}' ';';
	public TMTCIFFormatVSFieldElements getTMTCIFFormatVSFieldAccess() {
		return pTMTCIFFormatVSField;
	}
	
	public ParserRule getTMTCIFFormatVSFieldRule() {
		return getTMTCIFFormatVSFieldAccess().getRule();
	}
	
	//TMTCIFFormatVRFieldSize:
	//	'TMTCIFFormatVRFieldSize' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';'
	//	'}' ';';
	public TMTCIFFormatVRFieldSizeElements getTMTCIFFormatVRFieldSizeAccess() {
		return pTMTCIFFormatVRFieldSize;
	}
	
	public ParserRule getTMTCIFFormatVRFieldSizeRule() {
		return getTMTCIFFormatVRFieldSizeAccess().getRule();
	}
	
	//TMTCIFFormatFDICField:
	//	'TMTCIFFormatFDICField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'checkType' ':=' checkType=TMTCIFFormatCheckType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	size=TMTCIFFormatSize
	//	floatingOffset=TMTCIFFormatFloatingOffset
	//	sortedFieldsToCheck=TMTCIFFormatSortedFieldsToCheck
	//	'}' ';';
	public TMTCIFFormatFDICFieldElements getTMTCIFFormatFDICFieldAccess() {
		return pTMTCIFFormatFDICField;
	}
	
	public ParserRule getTMTCIFFormatFDICFieldRule() {
		return getTMTCIFFormatFDICFieldAccess().getRule();
	}
	
	//TMTCIFFormatAField:
	//	'TMTCIFFormatAField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=TMTCIFFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	arrayDimension=TMTCIFFormatArrayDimension
	//	size=TMTCIFFormatSize
	//	globalOffset=TMTCIFFormatGlobalOffset
	//	'}' ';';
	public TMTCIFFormatAFieldElements getTMTCIFFormatAFieldAccess() {
		return pTMTCIFFormatAField;
	}
	
	public ParserRule getTMTCIFFormatAFieldRule() {
		return getTMTCIFFormatAFieldAccess().getRule();
	}
	
	//TMTCIFFormatAIField:
	//	'TMTCIFFormatAIField' '{'
	//	'fid' ':=' fid=INTEGER ';'
	//	'pfid' ':=' pfid=INTEGER ';'
	//	'name' ':=' name=STRING ';' ('description' ':=' description=STRING ';')?
	//	'type' ':=' type=TMTCIFFormatFieldType ';'
	//	'byteOrder' ':=' byteOrder=TMTCIFFormatFieldByteOrder ';'
	//	'firstBit' ':=' firstBit=TMTCIFFormatSFieldFirstBit ';'
	//	arrayRef=TMTCIFFormatArrayRef
	//	size=TMTCIFFormatSize
	//	localOffset=TMTCIFFormatLocalOffset
	//	'}' ';';
	public TMTCIFFormatAIFieldElements getTMTCIFFormatAIFieldAccess() {
		return pTMTCIFFormatAIField;
	}
	
	public ParserRule getTMTCIFFormatAIFieldRule() {
		return getTMTCIFFormatAIFieldAccess().getRule();
	}
	
	//enum TMTCIFFormatFieldType:
	//	structured | uint | flag |
	//	enumerated | bit_vector |
	//	byte_vector | float | deduced;
	public TMTCIFFormatFieldTypeElements getTMTCIFFormatFieldTypeAccess() {
		return eTMTCIFFormatFieldType;
	}
	
	public EnumRule getTMTCIFFormatFieldTypeRule() {
		return getTMTCIFFormatFieldTypeAccess().getRule();
	}
	
	//enum TMTCIFFormatFieldByteOrder:
	//	big_endian | little_endian | na;
	public TMTCIFFormatFieldByteOrderElements getTMTCIFFormatFieldByteOrderAccess() {
		return eTMTCIFFormatFieldByteOrder;
	}
	
	public EnumRule getTMTCIFFormatFieldByteOrderRule() {
		return getTMTCIFFormatFieldByteOrderAccess().getRule();
	}
	
	//enum TMTCIFFormatSFieldFirstBit:
	//	MSB | LSB;
	public TMTCIFFormatSFieldFirstBitElements getTMTCIFFormatSFieldFirstBitAccess() {
		return eTMTCIFFormatSFieldFirstBit;
	}
	
	public EnumRule getTMTCIFFormatSFieldFirstBitRule() {
		return getTMTCIFFormatSFieldFirstBitAccess().getRule();
	}
	
	//TMTCIFFormatSize TMTCIFFormatBytesBits:
	//	'TMTCIFFormatSize'
	//	'{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public TMTCIFFormatSizeElements getTMTCIFFormatSizeAccess() {
		return pTMTCIFFormatSize;
	}
	
	public ParserRule getTMTCIFFormatSizeRule() {
		return getTMTCIFFormatSizeAccess().getRule();
	}
	
	//TMTCIFFormatGlobalOffset TMTCIFFormatBytesBits:
	//	'TMTCIFFormatGlobalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public TMTCIFFormatGlobalOffsetElements getTMTCIFFormatGlobalOffsetAccess() {
		return pTMTCIFFormatGlobalOffset;
	}
	
	public ParserRule getTMTCIFFormatGlobalOffsetRule() {
		return getTMTCIFFormatGlobalOffsetAccess().getRule();
	}
	
	//TMTCIFFormatFormula:
	//	'TMTCIFFormatFormula' '{'
	//	'slope' ':=' slope=STRING ';'
	//	'intercept' ':=' intercept=STRING ';'
	//	'}' ';';
	public TMTCIFFormatFormulaElements getTMTCIFFormatFormulaAccess() {
		return pTMTCIFFormatFormula;
	}
	
	public ParserRule getTMTCIFFormatFormulaRule() {
		return getTMTCIFFormatFormulaAccess().getRule();
	}
	
	//TMTCIFFormatConstSize TMTCIFFormatBytesBits:
	//	'TMTCIFFormatConstSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public TMTCIFFormatConstSizeElements getTMTCIFFormatConstSizeAccess() {
		return pTMTCIFFormatConstSize;
	}
	
	public ParserRule getTMTCIFFormatConstSizeRule() {
		return getTMTCIFFormatConstSizeAccess().getRule();
	}
	
	//TMTCIFFormatMaxSize TMTCIFFormatBytesBits:
	//	'TMTCIFFormatMaxSize' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public TMTCIFFormatMaxSizeElements getTMTCIFFormatMaxSizeAccess() {
		return pTMTCIFFormatMaxSize;
	}
	
	public ParserRule getTMTCIFFormatMaxSizeRule() {
		return getTMTCIFFormatMaxSizeAccess().getRule();
	}
	
	//TMTCIFFormatVariableSize:
	//	'TMTCIFFormatVariableSize' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'unit' ':=' unit=TMTCIFFormatUnit ';' ('power' ':=' power=TMTCIFFormatPower ';')?
	//	'}' ';';
	public TMTCIFFormatVariableSizeElements getTMTCIFFormatVariableSizeAccess() {
		return pTMTCIFFormatVariableSize;
	}
	
	public ParserRule getTMTCIFFormatVariableSizeRule() {
		return getTMTCIFFormatVariableSizeAccess().getRule();
	}
	
	//enum TMTCIFFormatUnit:
	//	bytes | bits |
	//	halfword | string10 |
	//	string17 | string69;
	public TMTCIFFormatUnitElements getTMTCIFFormatUnitAccess() {
		return eTMTCIFFormatUnit;
	}
	
	public EnumRule getTMTCIFFormatUnitRule() {
		return getTMTCIFFormatUnitAccess().getRule();
	}
	
	//enum TMTCIFFormatPower:
	//	_2='2bits' | _2_with_0='2bits_with_0';
	public TMTCIFFormatPowerElements getTMTCIFFormatPowerAccess() {
		return eTMTCIFFormatPower;
	}
	
	public EnumRule getTMTCIFFormatPowerRule() {
		return getTMTCIFFormatPowerAccess().getRule();
	}
	
	//enum TMTCIFFormatCheckType:
	//	crc16 | checksum16;
	public TMTCIFFormatCheckTypeElements getTMTCIFFormatCheckTypeAccess() {
		return eTMTCIFFormatCheckType;
	}
	
	public EnumRule getTMTCIFFormatCheckTypeRule() {
		return getTMTCIFFormatCheckTypeAccess().getRule();
	}
	
	//TMTCIFFormatFloatingOffset:
	//	'TMTCIFFormatFloatingOffset' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public TMTCIFFormatFloatingOffsetElements getTMTCIFFormatFloatingOffsetAccess() {
		return pTMTCIFFormatFloatingOffset;
	}
	
	public ParserRule getTMTCIFFormatFloatingOffsetRule() {
		return getTMTCIFFormatFloatingOffsetAccess().getRule();
	}
	
	//TMTCIFFormatSortedFieldsToCheck:
	//	{TMTCIFFormatSortedFieldsToCheck}
	//	'TMTCIFFormatSortedFieldsToCheck' '{'
	//	fieldToCheck+=TMTCIFFormatFieldToCheck+
	//	'}' ';';
	public TMTCIFFormatSortedFieldsToCheckElements getTMTCIFFormatSortedFieldsToCheckAccess() {
		return pTMTCIFFormatSortedFieldsToCheck;
	}
	
	public ParserRule getTMTCIFFormatSortedFieldsToCheckRule() {
		return getTMTCIFFormatSortedFieldsToCheckAccess().getRule();
	}
	
	//TMTCIFFormatFieldToCheck:
	//	'TMTCIFFormatFieldToCheck' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public TMTCIFFormatFieldToCheckElements getTMTCIFFormatFieldToCheckAccess() {
		return pTMTCIFFormatFieldToCheck;
	}
	
	public ParserRule getTMTCIFFormatFieldToCheckRule() {
		return getTMTCIFFormatFieldToCheckAccess().getRule();
	}
	
	//TMTCIFFormatArrayDimension:
	//	'TMTCIFFormatArrayDimension' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'maxItems' ':=' maxItems=INTEGER ';'
	//	'}' ';';
	public TMTCIFFormatArrayDimensionElements getTMTCIFFormatArrayDimensionAccess() {
		return pTMTCIFFormatArrayDimension;
	}
	
	public ParserRule getTMTCIFFormatArrayDimensionRule() {
		return getTMTCIFFormatArrayDimensionAccess().getRule();
	}
	
	//TMTCIFFormatLocalOffset TMTCIFFormatBytesBits:
	//	'TMTCIFFormatLocalOffset' '{'
	//	'bytes' ':=' bytes=INTEGER ';'
	//	'bits' ':=' bits=INTEGER ';'
	//	'}' ';'
	public TMTCIFFormatLocalOffsetElements getTMTCIFFormatLocalOffsetAccess() {
		return pTMTCIFFormatLocalOffset;
	}
	
	public ParserRule getTMTCIFFormatLocalOffsetRule() {
		return getTMTCIFFormatLocalOffsetAccess().getRule();
	}
	
	//TMTCIFFormatArrayRef:
	//	'TMTCIFFormatArrayRef' '{'
	//	'fidRef' ':=' fidRef=INTEGER ';'
	//	'}' ';';
	public TMTCIFFormatArrayRefElements getTMTCIFFormatArrayRefAccess() {
		return pTMTCIFFormatArrayRef;
	}
	
	public ParserRule getTMTCIFFormatArrayRefRule() {
		return getTMTCIFFormatArrayRefAccess().getRule();
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
