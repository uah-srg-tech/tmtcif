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
grammar InternalFORMAT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.format.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.format.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.tmtcif.lang.format.services.FORMATGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private FORMATGrammarAccess grammarAccess;

    public InternalFORMATParser(TokenStream input, FORMATGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TMTCIFModelFile";
   	}

   	@Override
   	protected FORMATGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTMTCIFModelFile
entryRuleTMTCIFModelFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFModelFileRule()); }
	iv_ruleTMTCIFModelFile=ruleTMTCIFModelFile
	{ $current=$iv_ruleTMTCIFModelFile.current; }
	EOF;

// Rule TMTCIFModelFile
ruleTMTCIFModelFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0());
				}
				lv_imports_0_0=ruleTMTCIFModelFileImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
					}
					add(
						$current,
						"imports",
						lv_imports_0_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFormatFormatParserRuleCall_1_0());
				}
				lv_element_1_0=ruleTMTCIFFormatFormat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormat");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTMTCIFModelFileImport
entryRuleTMTCIFModelFileImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFModelFileImportRule()); }
	iv_ruleTMTCIFModelFileImport=ruleTMTCIFModelFileImport
	{ $current=$iv_ruleTMTCIFModelFileImport.current; }
	EOF;

// Rule TMTCIFModelFileImport
ruleTMTCIFModelFileImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0());
		}
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				lv_importURI_2_0=RULE_STRING
				{
					newLeafNode(lv_importURI_2_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFModelFileImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatFormat
entryRuleTMTCIFFormatFormat returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatFormatRule()); }
	iv_ruleTMTCIFFormatFormat=ruleTMTCIFFormatFormat
	{ $current=$iv_ruleTMTCIFFormatFormat.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule TMTCIFFormatFormat
ruleTMTCIFFormatFormat returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatFormat'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFormatAccess().getTMTCIFFormatFormatKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFormatFormatAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatFormatRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFormatAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFormatFormatAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.tmtcif.lang.format.FORMAT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getTMTCIFFormatFormatAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.tmtcif.lang.format.FORMAT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>(otherlv_12='protocol'
								{
									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFormatFormatAccess().getProtocolKeyword_3_2_0());
								}
								otherlv_13=':='
								{
									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_2_1());
								}
								(
									(
										lv_protocol_14_0=RULE_ID
										{
											newLeafNode(lv_protocol_14_0, grammarAccess.getTMTCIFFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getTMTCIFFormatFormatRule());
											}
											setWithLastConsumed(
												$current,
												"protocol",
												lv_protocol_14_0,
												"org.eclipse.xtext.common.Terminals.ID");
										}
									)
								)
								otherlv_15=';'
								{
									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_2_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>((
									otherlv_16='type'
									{
										newLeafNode(otherlv_16, grammarAccess.getTMTCIFFormatFormatAccess().getTypeKeyword_3_3_0_0());
									}
									otherlv_17=':='
									{
										newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0());
											}
											lv_type_18_0=ruleTMTCIFFormatFormatType
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												set(
													$current,
													"type",
													lv_type_18_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormatType");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_19=';'
									{
										newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_3_0_3());
									}
								)
								(
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0());
											}
											lv_CSField_20_0=ruleTMTCIFFormatCSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"CSField",
													lv_CSField_20_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
											}
											lv_CSFormulaField_21_0=ruleTMTCIFFormatCSFormulaField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"CSFormulaField",
													lv_CSFormulaField_21_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSFormulaField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0());
											}
											lv_VSField_22_0=ruleTMTCIFFormatVSField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"VSField",
													lv_VSField_22_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVSField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0());
											}
											lv_FDICField_23_0=ruleTMTCIFFormatFDICField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"FDICField",
													lv_FDICField_23_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFDICField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
											}
											lv_VRFieldSize_24_0=ruleTMTCIFFormatVRFieldSize
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"VRFieldSize",
													lv_VRFieldSize_24_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVRFieldSize");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0());
											}
											lv_AField_25_0=ruleTMTCIFFormatAField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"AField",
													lv_AField_25_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAField");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0());
											}
											lv_AIField_26_0=ruleTMTCIFFormatAIField
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
												}
												add(
													$current,
													"AIField",
													lv_AIField_26_0,
													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAIField");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)*
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
				}
		)
		otherlv_27='}'
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatFormatAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_28=';'
		{
			newLeafNode(otherlv_28, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_5());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleTMTCIFFormatCSField
entryRuleTMTCIFFormatCSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldRule()); }
	iv_ruleTMTCIFFormatCSField=ruleTMTCIFFormatCSField
	{ $current=$iv_ruleTMTCIFFormatCSField.current; }
	EOF;

// Rule TMTCIFFormatCSField
ruleTMTCIFFormatCSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatCSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getTMTCIFFormatCSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatCSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatCSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatCSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleTMTCIFFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleTMTCIFFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleTMTCIFFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_32='}'
		{
			newLeafNode(otherlv_32, grammarAccess.getTMTCIFFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
		}
		otherlv_33=';'
		{
			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_30());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatCSFormulaField
entryRuleTMTCIFFormatCSFormulaField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldRule()); }
	iv_ruleTMTCIFFormatCSFormulaField=ruleTMTCIFFormatCSFormulaField
	{ $current=$iv_ruleTMTCIFFormatCSFormulaField.current; }
	EOF;

// Rule TMTCIFFormatCSFormulaField
ruleTMTCIFFormatCSFormulaField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatCSFormulaField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTMTCIFFormatCSFormulaFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleTMTCIFFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleTMTCIFFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0());
				}
				lv_globalOffset_31_0=ruleTMTCIFFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaTMTCIFFormatFormulaParserRuleCall_29_0());
				}
				lv_formula_32_0=ruleTMTCIFFormatFormula
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
					}
					set(
						$current,
						"formula",
						lv_formula_32_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormula");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatVSField
entryRuleTMTCIFFormatVSField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldRule()); }
	iv_ruleTMTCIFFormatVSField=ruleTMTCIFFormatVSField
	{ $current=$iv_ruleTMTCIFFormatVSField.current; }
	EOF;

// Rule TMTCIFFormatVSField
ruleTMTCIFFormatVSField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatVSField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getTMTCIFFormatVSFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVSFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVSFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatVSFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleTMTCIFFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0());
				}
				lv_constSize_30_0=ruleTMTCIFFormatConstSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"constSize",
						lv_constSize_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatConstSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0());
				}
				lv_variableSize_31_0=ruleTMTCIFFormatVariableSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"variableSize",
						lv_variableSize_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVariableSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0());
				}
				lv_maxSize_32_0=ruleTMTCIFFormatMaxSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"maxSize",
						lv_maxSize_32_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatMaxSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0());
				}
				lv_globalOffset_33_0=ruleTMTCIFFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_33_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_34='}'
		{
			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
		}
		otherlv_35=';'
		{
			newLeafNode(otherlv_35, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_32());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatVRFieldSize
entryRuleTMTCIFFormatVRFieldSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeRule()); }
	iv_ruleTMTCIFFormatVRFieldSize=ruleTMTCIFFormatVRFieldSize
	{ $current=$iv_ruleTMTCIFFormatVRFieldSize.current; }
	EOF;

// Rule TMTCIFFormatVRFieldSize
ruleTMTCIFFormatVRFieldSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatVRFieldSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getTMTCIFFormatVRFieldSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatFDICField
entryRuleTMTCIFFormatFDICField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldRule()); }
	iv_ruleTMTCIFFormatFDICField=ruleTMTCIFFormatFDICField
	{ $current=$iv_ruleTMTCIFFormatFDICField.current; }
	EOF;

// Rule TMTCIFFormatFDICField
ruleTMTCIFFormatFDICField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatFDICField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getTMTCIFFormatFDICFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatFDICFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='checkType'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0());
				}
				lv_checkType_20_0=ruleTMTCIFFormatCheckType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"checkType",
						lv_checkType_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCheckType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
				}
				lv_size_30_0=ruleTMTCIFFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0());
				}
				lv_floatingOffset_31_0=ruleTMTCIFFormatFloatingOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"floatingOffset",
						lv_floatingOffset_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFloatingOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0());
				}
				lv_sortedFieldsToCheck_32_0=ruleTMTCIFFormatSortedFieldsToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
					}
					set(
						$current,
						"sortedFieldsToCheck",
						lv_sortedFieldsToCheck_32_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSortedFieldsToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatAField
entryRuleTMTCIFFormatAField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatAFieldRule()); }
	iv_ruleTMTCIFFormatAField=ruleTMTCIFFormatAField
	{ $current=$iv_ruleTMTCIFFormatAField.current; }
	EOF;

// Rule TMTCIFFormatAField
ruleTMTCIFFormatAField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatAField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatAFieldAccess().getTMTCIFFormatAFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatAFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatAFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatAFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatAFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatAFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleTMTCIFFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0());
				}
				lv_arrayDimension_30_0=ruleTMTCIFFormatArrayDimension
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"arrayDimension",
						lv_arrayDimension_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayDimension");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0());
				}
				lv_size_31_0=ruleTMTCIFFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0());
				}
				lv_globalOffset_32_0=ruleTMTCIFFormatGlobalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
					}
					set(
						$current,
						"globalOffset",
						lv_globalOffset_32_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatAFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatAIField
entryRuleTMTCIFFormatAIField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldRule()); }
	iv_ruleTMTCIFFormatAIField=ruleTMTCIFFormatAIField
	{ $current=$iv_ruleTMTCIFFormatAIField.current; }
	EOF;

// Rule TMTCIFFormatAIField
ruleTMTCIFFormatAIField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatAIField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getTMTCIFFormatAIFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fid'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatAIFieldAccess().getFidKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
				}
				lv_fid_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"fid",
						lv_fid_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='pfid'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
				}
				lv_pfid_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"pfid",
						lv_pfid_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='name'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatAIFieldAccess().getNameKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				lv_name_12_0=RULE_STRING
				{
					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='description'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					lv_description_16_0=RULE_STRING
					{
						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFormatAIFieldRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_14_3());
			}
		)?
		otherlv_18='type'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeKeyword_15());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
				}
				lv_type_20_0=ruleTMTCIFFormatFieldType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"type",
						lv_type_20_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_18());
		}
		otherlv_22='byteOrder'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderKeyword_19());
		}
		otherlv_23=':='
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_20());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
				}
				lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"byteOrder",
						lv_byteOrder_24_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_22());
		}
		otherlv_26='firstBit'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitKeyword_23());
		}
		otherlv_27=':='
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_24());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
				}
				lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"firstBit",
						lv_firstBit_28_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_29=';'
		{
			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0());
				}
				lv_arrayRef_30_0=ruleTMTCIFFormatArrayRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"arrayRef",
						lv_arrayRef_30_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0());
				}
				lv_size_31_0=ruleTMTCIFFormatSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"size",
						lv_size_31_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0());
				}
				lv_localOffset_32_0=ruleTMTCIFFormatLocalOffset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
					}
					set(
						$current,
						"localOffset",
						lv_localOffset_32_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatLocalOffset");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_33='}'
		{
			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
		}
		otherlv_34=';'
		{
			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_31());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatSize
entryRuleTMTCIFFormatSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatSizeRule()); }
	iv_ruleTMTCIFFormatSize=ruleTMTCIFFormatSize
	{ $current=$iv_ruleTMTCIFFormatSize.current; }
	EOF;

// Rule TMTCIFFormatSize
ruleTMTCIFFormatSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatSizeAccess().getTMTCIFFormatSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatGlobalOffset
entryRuleTMTCIFFormatGlobalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetRule()); }
	iv_ruleTMTCIFFormatGlobalOffset=ruleTMTCIFFormatGlobalOffset
	{ $current=$iv_ruleTMTCIFFormatGlobalOffset.current; }
	EOF;

// Rule TMTCIFFormatGlobalOffset
ruleTMTCIFFormatGlobalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatGlobalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getTMTCIFFormatGlobalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatGlobalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatFormula
entryRuleTMTCIFFormatFormula returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatFormulaRule()); }
	iv_ruleTMTCIFFormatFormula=ruleTMTCIFFormatFormula
	{ $current=$iv_ruleTMTCIFFormatFormula.current; }
	EOF;

// Rule TMTCIFFormatFormula
ruleTMTCIFFormatFormula returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatFormula'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFormulaAccess().getTMTCIFFormatFormulaKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='slope'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_slope_4_0=RULE_STRING
				{
					newLeafNode(lv_slope_4_0, grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatFormulaRule());
					}
					setWithLastConsumed(
						$current,
						"slope",
						lv_slope_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_5());
		}
		otherlv_6='intercept'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_intercept_8_0=RULE_STRING
				{
					newLeafNode(lv_intercept_8_0, grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFormatFormulaRule());
					}
					setWithLastConsumed(
						$current,
						"intercept",
						lv_intercept_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatFormulaAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatConstSize
entryRuleTMTCIFFormatConstSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeRule()); }
	iv_ruleTMTCIFFormatConstSize=ruleTMTCIFFormatConstSize
	{ $current=$iv_ruleTMTCIFFormatConstSize.current; }
	EOF;

// Rule TMTCIFFormatConstSize
ruleTMTCIFFormatConstSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatConstSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatConstSizeAccess().getTMTCIFFormatConstSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatConstSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatConstSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatMaxSize
entryRuleTMTCIFFormatMaxSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeRule()); }
	iv_ruleTMTCIFFormatMaxSize=ruleTMTCIFFormatMaxSize
	{ $current=$iv_ruleTMTCIFFormatMaxSize.current; }
	EOF;

// Rule TMTCIFFormatMaxSize
ruleTMTCIFFormatMaxSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatMaxSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatMaxSizeAccess().getTMTCIFFormatMaxSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatMaxSizeRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatMaxSizeRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatVariableSize
entryRuleTMTCIFFormatVariableSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeRule()); }
	iv_ruleTMTCIFFormatVariableSize=ruleTMTCIFFormatVariableSize
	{ $current=$iv_ruleTMTCIFFormatVariableSize.current; }
	EOF;

// Rule TMTCIFFormatVariableSize
ruleTMTCIFFormatVariableSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatVariableSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVariableSizeAccess().getTMTCIFFormatVariableSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='unit'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitTMTCIFFormatUnitEnumRuleCall_8_0());
				}
				lv_unit_8_0=ruleTMTCIFFormatUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
					}
					set(
						$current,
						"unit",
						lv_unit_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='power'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerTMTCIFFormatPowerEnumRuleCall_10_2_0());
					}
					lv_power_12_0=ruleTMTCIFFormatPower
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
						}
						set(
							$current,
							"power",
							lv_power_12_0,
							"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatPower");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_10_3());
			}
		)?
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_12());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatFloatingOffset
entryRuleTMTCIFFormatFloatingOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatFloatingOffsetRule()); }
	iv_ruleTMTCIFFormatFloatingOffset=ruleTMTCIFFormatFloatingOffset
	{ $current=$iv_ruleTMTCIFFormatFloatingOffset.current; }
	EOF;

// Rule TMTCIFFormatFloatingOffset
ruleTMTCIFFormatFloatingOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatFloatingOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getTMTCIFFormatFloatingOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFloatingOffsetRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatSortedFieldsToCheck
entryRuleTMTCIFFormatSortedFieldsToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule()); }
	iv_ruleTMTCIFFormatSortedFieldsToCheck=ruleTMTCIFFormatSortedFieldsToCheck
	{ $current=$iv_ruleTMTCIFFormatSortedFieldsToCheck.current; }
	EOF;

// Rule TMTCIFFormatSortedFieldsToCheck
ruleTMTCIFFormatSortedFieldsToCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckAction_0(),
					$current);
			}
		)
		otherlv_1='TMTCIFFormatSortedFieldsToCheck'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0());
				}
				lv_fieldToCheck_3_0=ruleTMTCIFFormatFieldToCheck
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule());
					}
					add(
						$current,
						"fieldToCheck",
						lv_fieldToCheck_3_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldToCheck");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatFieldToCheck
entryRuleTMTCIFFormatFieldToCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatFieldToCheckRule()); }
	iv_ruleTMTCIFFormatFieldToCheck=ruleTMTCIFFormatFieldToCheck
	{ $current=$iv_ruleTMTCIFFormatFieldToCheck.current; }
	EOF;

// Rule TMTCIFFormatFieldToCheck
ruleTMTCIFFormatFieldToCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatFieldToCheck'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getTMTCIFFormatFieldToCheckKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatFieldToCheckRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatArrayDimension
entryRuleTMTCIFFormatArrayDimension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionRule()); }
	iv_ruleTMTCIFFormatArrayDimension=ruleTMTCIFFormatArrayDimension
	{ $current=$iv_ruleTMTCIFFormatArrayDimension.current; }
	EOF;

// Rule TMTCIFFormatArrayDimension
ruleTMTCIFFormatArrayDimension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatArrayDimension'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getTMTCIFFormatArrayDimensionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayDimensionRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_5());
		}
		otherlv_6='maxItems'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
				}
				lv_maxItems_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayDimensionRule());
					}
					set(
						$current,
						"maxItems",
						lv_maxItems_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatLocalOffset
entryRuleTMTCIFFormatLocalOffset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetRule()); }
	iv_ruleTMTCIFFormatLocalOffset=ruleTMTCIFFormatLocalOffset
	{ $current=$iv_ruleTMTCIFFormatLocalOffset.current; }
	EOF;

// Rule TMTCIFFormatLocalOffset
ruleTMTCIFFormatLocalOffset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatLocalOffset'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getTMTCIFFormatLocalOffsetKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='bytes'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
				}
				lv_bytes_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatLocalOffsetRule());
					}
					set(
						$current,
						"bytes",
						lv_bytes_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_5());
		}
		otherlv_6='bits'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
				}
				lv_bits_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatLocalOffsetRule());
					}
					set(
						$current,
						"bits",
						lv_bits_8_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFFormatArrayRef
entryRuleTMTCIFFormatArrayRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFormatArrayRefRule()); }
	iv_ruleTMTCIFFormatArrayRef=ruleTMTCIFFormatArrayRef
	{ $current=$iv_ruleTMTCIFFormatArrayRef.current; }
	EOF;

// Rule TMTCIFFormatArrayRef
ruleTMTCIFFormatArrayRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFormatArrayRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatArrayRefAccess().getTMTCIFFormatArrayRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fidRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatArrayRefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
				}
				lv_fidRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayRefRule());
					}
					set(
						$current,
						"fidRef",
						lv_fidRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleVersion
entryRuleVersion returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionRule()); }
	iv_ruleVersion=ruleVersion
	{ $current=$iv_ruleVersion.current.getText(); }
	EOF;

// Rule Version
ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
			}
			    |
			(
				(
					this_INT_1=RULE_INT
					{
						$current.merge(this_INT_1);
					}
					{
						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
					}
				)?
				this_ID_2=RULE_ID
				{
					$current.merge(this_ID_2);
				}
				{
					newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
				}
			)
		)
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
			}
			(
				this_INT_4=RULE_INT
				{
					$current.merge(this_INT_4);
				}
				{
					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
				}
				    |
				(
					(
						this_INT_5=RULE_INT
						{
							$current.merge(this_INT_5);
						}
						{
							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
						}
					)?
					this_ID_6=RULE_ID
					{
						$current.merge(this_ID_6);
					}
					{
						newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
					}
				)
			)
		)*
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

// Rule TMTCIFFormatFormatType
ruleTMTCIFFormatFormatType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TM'
			{
				$current = grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TC'
			{
				$current = grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TMTCIFFormatFieldType
ruleTMTCIFFormatFieldType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='structured'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='uint'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='flag'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='enumerated'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='bit_vector'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='byte_vector'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='float'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='deduced'
			{
				$current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule TMTCIFFormatFieldByteOrder
ruleTMTCIFFormatFieldByteOrder returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='big_endian'
			{
				$current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='little_endian'
			{
				$current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='na'
			{
				$current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule TMTCIFFormatSFieldFirstBit
ruleTMTCIFFormatSFieldFirstBit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='MSB'
			{
				$current = grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LSB'
			{
				$current = grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TMTCIFFormatUnit
ruleTMTCIFFormatUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='bytes'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bits'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='halfword'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='string10'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='string17'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='string69'
			{
				$current = grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule TMTCIFFormatPower
ruleTMTCIFFormatPower returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='2bits'
			{
				$current = grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='2bits_with_0'
			{
				$current = grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TMTCIFFormatCheckType
ruleTMTCIFFormatCheckType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='crc16'
			{
				$current = grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='checksum16'
			{
				$current = grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
			}
		)
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
