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
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.import_.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.import_.parser.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.import_.services.IMPORTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private IMPORTGrammarAccess grammarAccess;

    public InternalIMPORTParser(TokenStream input, IMPORTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TMTCIFModelFile";
   	}

   	@Override
   	protected IMPORTGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFImportImportParserRuleCall_1_0());
				}
				lv_element_1_0=ruleTMTCIFImportImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportImport");
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

// Entry rule entryRuleTMTCIFImportImport
entryRuleTMTCIFImportImport returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getTMTCIFImportImportRule()); }
	iv_ruleTMTCIFImportImport=ruleTMTCIFImportImport
	{ $current=$iv_ruleTMTCIFImportImport.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule TMTCIFImportImport
ruleTMTCIFImportImport returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFImportImport'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFImportImportAccess().getTMTCIFImportImportKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFImportImportAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFImportImportRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFImportImportAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getTMTCIFImportImportAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFImportImportRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getTMTCIFImportImportAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFImportImportRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='from'
		{
			newLeafNode(otherlv_12, grammarAccess.getTMTCIFImportImportAccess().getFromKeyword_4());
		}
		otherlv_13=':='
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_5());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFImportImportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatCrossReference_6_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_7());
		}
		otherlv_16='to'
		{
			newLeafNode(otherlv_16, grammarAccess.getTMTCIFImportImportAccess().getToKeyword_8());
		}
		otherlv_17=':='
		{
			newLeafNode(otherlv_17, grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_9());
		}
		(
			otherlv_18='NULL'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFImportImportAccess().getNULLKeyword_10_0());
			}
			    |
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFImportImportRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatCrossReference_10_1_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_20=';'
		{
			newLeafNode(otherlv_20, grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0());
				}
				lv_dataSource_21_0=ruleTMTCIFImportDataSource
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFImportImportRule());
					}
					add(
						$current,
						"dataSource",
						lv_dataSource_21_0,
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportDataSource");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0());
				}
				lv_virtualSize_22_0=ruleTMTCIFImportVirtualSize
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFImportImportRule());
					}
					set(
						$current,
						"virtualSize",
						lv_virtualSize_22_0,
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportVirtualSize");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFImportImportAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_24=';'
		{
			newLeafNode(otherlv_24, grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_15());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleTMTCIFImportDataSource
entryRuleTMTCIFImportDataSource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFImportDataSourceRule()); }
	iv_ruleTMTCIFImportDataSource=ruleTMTCIFImportDataSource
	{ $current=$iv_ruleTMTCIFImportDataSource.current; }
	EOF;

// Rule TMTCIFImportDataSource
ruleTMTCIFImportDataSource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFImportDataSource'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFImportDataSourceAccess().getTMTCIFImportDataSourceKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFImportDataSourceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='FieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFImportDataSourceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_5());
		}
		otherlv_6='leftTrim'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0());
				}
				lv_leftTrim_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFImportDataSourceRule());
					}
					set(
						$current,
						"leftTrim",
						lv_leftTrim_8_0,
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_9());
		}
		otherlv_10='rightTrim'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0());
				}
				lv_rightTrim_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFImportDataSourceRule());
					}
					set(
						$current,
						"rightTrim",
						lv_rightTrim_12_0,
						"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_13());
		}
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFImportDataSourceAccess().getRightCurlyBracketKeyword_14());
		}
		otherlv_15=';'
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_15());
		}
	)
;

// Entry rule entryRuleTMTCIFImportVirtualSize
entryRuleTMTCIFImportVirtualSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFImportVirtualSizeRule()); }
	iv_ruleTMTCIFImportVirtualSize=ruleTMTCIFImportVirtualSize
	{ $current=$iv_ruleTMTCIFImportVirtualSize.current; }
	EOF;

// Rule TMTCIFImportVirtualSize
ruleTMTCIFImportVirtualSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFImportVirtualSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFImportVirtualSizeAccess().getTMTCIFImportVirtualSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='FieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFImportVirtualSizeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='to'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFImportVirtualSizeAccess().getToKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFImportVirtualSizeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFImportVirtualSizeRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitTMTCIFImportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleTMTCIFImportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFImportVirtualSizeRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.tmtcif.lang.import_.IMPORT.TMTCIFImportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFImportVirtualSizeAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_13());
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

// Entry rule entryRuleVersionedQualifiedName
entryRuleVersionedQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); }
	iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName
	{ $current=$iv_ruleVersionedQualifiedName.current.getText(); }
	EOF;

// Rule VersionedQualifiedName
ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
		}
		this_Version_2=ruleVersion
		{
			$current.merge(this_Version_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleVersionedQualifiedReferenceName
entryRuleVersionedQualifiedReferenceName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); }
	iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName
	{ $current=$iv_ruleVersionedQualifiedReferenceName.current.getText(); }
	EOF;

// Rule VersionedQualifiedReferenceName
ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
			}
			this_VersionedQualifiedName_0=ruleVersionedQualifiedName
			{
				$current.merge(this_VersionedQualifiedName_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
			}
		)?
		this_ID_2=RULE_ID
		{
			$current.merge(this_ID_2);
		}
		{
			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
			}
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
			}
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

// Rule TMTCIFImportUnit
ruleTMTCIFImportUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='bits'
			{
				$current = grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bytes'
			{
				$current = grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1());
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
