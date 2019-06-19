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
grammar InternalEXPORT;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.export.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.export.parser.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.export.services.EXPORTGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private EXPORTGrammarAccess grammarAccess;

    public InternalEXPORTParser(TokenStream input, EXPORTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TMTCIFModelFile";
   	}

   	@Override
   	protected EXPORTGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0());
				}
				lv_element_1_0=ruleTMTCIFExportExport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportExport");
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

// Entry rule entryRuleTMTCIFExportExport
entryRuleTMTCIFExportExport returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getTMTCIFExportExportRule()); }
	iv_ruleTMTCIFExportExport=ruleTMTCIFExportExport
	{ $current=$iv_ruleTMTCIFExportExport.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule TMTCIFExportExport
ruleTMTCIFExportExport returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportExport'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.tmtcif.lang.export.EXPORT.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>(otherlv_8='version'
								{
									newLeafNode(otherlv_8, grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0());
								}
								otherlv_9=':='
								{
									newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
										}
										lv_version_10_0=ruleVersion
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
											}
											set(
												$current,
												"version",
												lv_version_10_0,
												"es.uah.aut.srg.tmtcif.lang.export.EXPORT.Version");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_11=';'
								{
									newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
				}
		)
		otherlv_12='from'
		{
			newLeafNode(otherlv_12, grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4());
		}
		otherlv_13=':='
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5());
		}
		(
			otherlv_14='NULL'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0());
			}
			    |
			(
				(
					{
						/* */
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0());
					}
					ruleVersionedQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7());
		}
		otherlv_17='to'
		{
			newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8());
		}
		otherlv_18=':='
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0());
				}
				ruleVersionedQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20=';'
		{
			newLeafNode(otherlv_20, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0());
				}
				lv_Sizes_21_0=ruleTMTCIFExportSizes
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
					}
					set(
						$current,
						"Sizes",
						lv_Sizes_21_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizes");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0());
				}
				lv_settings_22_0=ruleTMTCIFExportSettings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
					}
					set(
						$current,
						"settings",
						lv_settings_22_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettings");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0());
				}
				lv_activateDICs_23_0=ruleTMTCIFExportActivateDICs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
					}
					set(
						$current,
						"activateDICs",
						lv_activateDICs_23_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportActivateDICs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_25=';'
		{
			newLeafNode(otherlv_25, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleTMTCIFExportSizes
entryRuleTMTCIFExportSizes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSizesRule()); }
	iv_ruleTMTCIFExportSizes=ruleTMTCIFExportSizes
	{ $current=$iv_ruleTMTCIFExportSizes.current; }
	EOF;

// Rule TMTCIFExportSizes
ruleTMTCIFExportSizes returns [EObject current=null]
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
					grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0(),
					$current);
			}
		)
		otherlv_1='TMTCIFExportSizes'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0());
					}
					lv_sizeFromFileLength_3_0=ruleTMTCIFExportSizeFromFileLength
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
						}
						add(
							$current,
							"sizeFromFileLength",
							lv_sizeFromFileLength_3_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLength");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0());
					}
					lv_sizeFromFileLine_4_0=ruleTMTCIFExportSizeFromFileLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
						}
						add(
							$current,
							"sizeFromFileLine",
							lv_sizeFromFileLine_4_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLine");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0());
					}
					lv_sizeInBits_5_0=ruleTMTCIFExportSizeInBits
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
						}
						add(
							$current,
							"sizeInBits",
							lv_sizeInBits_5_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeInBits");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSizeFromFileLength
entryRuleTMTCIFExportSizeFromFileLength returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); }
	iv_ruleTMTCIFExportSizeFromFileLength=ruleTMTCIFExportSizeFromFileLength
	{ $current=$iv_ruleTMTCIFExportSizeFromFileLength.current; }
	EOF;

// Rule TMTCIFExportSizeFromFileLength
ruleTMTCIFExportSizeFromFileLength returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSizeFromFileLength'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5());
		}
		otherlv_6='fromFile'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_fromFile_8_0=RULE_ID
				{
					newLeafNode(lv_fromFile_8_0, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleTMTCIFExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSizeFromFileLine
entryRuleTMTCIFExportSizeFromFileLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); }
	iv_ruleTMTCIFExportSizeFromFileLine=ruleTMTCIFExportSizeFromFileLine
	{ $current=$iv_ruleTMTCIFExportSizeFromFileLine.current; }
	EOF;

// Rule TMTCIFExportSizeFromFileLine
ruleTMTCIFExportSizeFromFileLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSizeFromFileLine'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5());
		}
		otherlv_6='fromFile'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_fromFile_8_0=RULE_ID
				{
					newLeafNode(lv_fromFile_8_0, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9());
		}
		otherlv_10='line'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0());
				}
				lv_line_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
					}
					set(
						$current,
						"line",
						lv_line_12_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='addSize'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0());
					}
					lv_addSize_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_16_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='unit'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0());
					}
					lv_unit_20_0=ruleTMTCIFExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
						}
						set(
							$current,
							"unit",
							lv_unit_20_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSizeInBits
entryRuleTMTCIFExportSizeInBits returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsRule()); }
	iv_ruleTMTCIFExportSizeInBits=ruleTMTCIFExportSizeInBits
	{ $current=$iv_ruleTMTCIFExportSizeInBits.current; }
	EOF;

// Rule TMTCIFExportSizeInBits
ruleTMTCIFExportSizeInBits returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSizeInBits'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5());
		}
		otherlv_6='from'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_from_8_0=RULE_ID
				{
					newLeafNode(lv_from_8_0, grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSizeInBitsRule());
					}
					setWithLastConsumed(
						$current,
						"from",
						lv_from_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='addSize'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
					}
					lv_addSize_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
						}
						set(
							$current,
							"addSize",
							lv_addSize_12_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='unit'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0());
					}
					lv_unit_16_0=ruleTMTCIFExportUnit
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
						}
						set(
							$current,
							"unit",
							lv_unit_16_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_19=';'
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettings
entryRuleTMTCIFExportSettings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingsRule()); }
	iv_ruleTMTCIFExportSettings=ruleTMTCIFExportSettings
	{ $current=$iv_ruleTMTCIFExportSettings.current; }
	EOF;

// Rule TMTCIFExportSettings
ruleTMTCIFExportSettings returns [EObject current=null]
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
					grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0(),
					$current);
			}
		)
		otherlv_1='TMTCIFExportSettings'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0());
					}
					lv_settingFromConst_3_0=ruleTMTCIFExportSettingFromConst
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingFromConst",
							lv_settingFromConst_3_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromConst");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0());
					}
					lv_settingFromSize_4_0=ruleTMTCIFExportSettingFromSize
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingFromSize",
							lv_settingFromSize_4_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromSize");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0());
					}
					lv_settingFromFile_5_0=ruleTMTCIFExportSettingFromFile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingFromFile",
							lv_settingFromFile_5_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromFile");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0());
					}
					lv_settingFromField_6_0=ruleTMTCIFExportSettingFromField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingFromField",
							lv_settingFromField_6_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromField");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0());
					}
					lv_settingAIFromConst_7_0=ruleTMTCIFExportSettingAIFromConst
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingAIFromConst",
							lv_settingAIFromConst_7_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromConst");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0());
					}
					lv_settingAIFromFile_8_0=ruleTMTCIFExportSettingAIFromFile
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
						}
						add(
							$current,
							"settingAIFromFile",
							lv_settingAIFromFile_8_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromFile");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingFromConst
entryRuleTMTCIFExportSettingFromConst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstRule()); }
	iv_ruleTMTCIFExportSettingFromConst=ruleTMTCIFExportSettingFromConst
	{ $current=$iv_ruleTMTCIFExportSettingFromConst.current; }
	EOF;

// Rule TMTCIFExportSettingFromConst
ruleTMTCIFExportSettingFromConst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingFromConst'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromConstRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromConstRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingFromSize
entryRuleTMTCIFExportSettingFromSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeRule()); }
	iv_ruleTMTCIFExportSettingFromSize=ruleTMTCIFExportSettingFromSize
	{ $current=$iv_ruleTMTCIFExportSettingFromSize.current; }
	EOF;

// Rule TMTCIFExportSettingFromSize
ruleTMTCIFExportSettingFromSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingFromSize'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='sizeRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0());
				}
				lv_sizeRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromSizeRule());
					}
					set(
						$current,
						"sizeRef",
						lv_sizeRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromSizeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingFromFile
entryRuleTMTCIFExportSettingFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileRule()); }
	iv_ruleTMTCIFExportSettingFromFile=ruleTMTCIFExportSettingFromFile
	{ $current=$iv_ruleTMTCIFExportSettingFromFile.current; }
	EOF;

// Rule TMTCIFExportSettingFromFile
ruleTMTCIFExportSettingFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='file'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_file_4_0=RULE_ID
				{
					newLeafNode(lv_file_4_0, grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFileRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='offset'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0());
					}
					lv_offset_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
						}
						set(
							$current,
							"offset",
							lv_offset_12_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='size'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0());
					}
					lv_size_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
						}
						set(
							$current,
							"size",
							lv_size_16_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='line'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0());
					}
					lv_line_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
						}
						set(
							$current,
							"line",
							lv_line_20_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingFromField
entryRuleTMTCIFExportSettingFromField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldRule()); }
	iv_ruleTMTCIFExportSettingFromField=ruleTMTCIFExportSettingFromField
	{ $current=$iv_ruleTMTCIFExportSettingFromField.current; }
	EOF;

// Rule TMTCIFExportSettingFromField
ruleTMTCIFExportSettingFromField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingFromField'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fieldRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFieldRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFieldRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingAIFromConst
entryRuleTMTCIFExportSettingAIFromConst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); }
	iv_ruleTMTCIFExportSettingAIFromConst=ruleTMTCIFExportSettingAIFromConst
	{ $current=$iv_ruleTMTCIFExportSettingAIFromConst.current; }
	EOF;

// Rule TMTCIFExportSettingAIFromConst
ruleTMTCIFExportSettingAIFromConst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingAIFromConst'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromConstRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromConstRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_11());
		}
	)
;

// Entry rule entryRuleTMTCIFExportSettingAIFromFile
entryRuleTMTCIFExportSettingAIFromFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); }
	iv_ruleTMTCIFExportSettingAIFromFile=ruleTMTCIFExportSettingAIFromFile
	{ $current=$iv_ruleTMTCIFExportSettingAIFromFile.current; }
	EOF;

// Rule TMTCIFExportSettingAIFromFile
ruleTMTCIFExportSettingAIFromFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportSettingAIFromFile'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='file'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_file_4_0=RULE_ID
				{
					newLeafNode(lv_file_4_0, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5());
		}
		otherlv_6='toFieldRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9());
		}
		otherlv_10='toArrayIndex'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
				}
				lv_toArrayIndex_12_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
					}
					set(
						$current,
						"toArrayIndex",
						lv_toArrayIndex_12_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13());
		}
		(
			otherlv_14='offset'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0());
					}
					lv_offset_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
						}
						set(
							$current,
							"offset",
							lv_offset_16_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3());
			}
		)?
		(
			otherlv_18='size'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0());
					}
					lv_size_20_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
						}
						set(
							$current,
							"size",
							lv_size_20_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3());
			}
		)?
		(
			otherlv_22='line'
			{
				newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0());
			}
			otherlv_23=':='
			{
				newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0());
					}
					lv_line_24_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
						}
						set(
							$current,
							"line",
							lv_line_24_0,
							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_25=';'
			{
				newLeafNode(otherlv_25, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3());
			}
		)?
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18());
		}
	)
;

// Entry rule entryRuleTMTCIFExportActivateDICs
entryRuleTMTCIFExportActivateDICs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportActivateDICsRule()); }
	iv_ruleTMTCIFExportActivateDICs=ruleTMTCIFExportActivateDICs
	{ $current=$iv_ruleTMTCIFExportActivateDICs.current; }
	EOF;

// Rule TMTCIFExportActivateDICs
ruleTMTCIFExportActivateDICs returns [EObject current=null]
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
					grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0(),
					$current);
			}
		)
		otherlv_1='TMTCIFExportActivateDICs'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0());
				}
				lv_DIC_3_0=ruleTMTCIFExportDIC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportActivateDICsRule());
					}
					add(
						$current,
						"DIC",
						lv_DIC_3_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportDIC");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4());
		}
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleTMTCIFExportDIC
entryRuleTMTCIFExportDIC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFExportDICRule()); }
	iv_ruleTMTCIFExportDIC=ruleTMTCIFExportDIC
	{ $current=$iv_ruleTMTCIFExportDIC.current; }
	EOF;

// Rule TMTCIFExportDIC
ruleTMTCIFExportDIC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFExportDIC'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFExportDICRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5());
		}
		otherlv_6='DICRef'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_DICRef_8_0=RULE_ID
				{
					newLeafNode(lv_DICRef_8_0, grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFExportDICRule());
					}
					setWithLastConsumed(
						$current,
						"DICRef",
						lv_DICRef_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9());
		}
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11());
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

// Rule TMTCIFExportUnit
ruleTMTCIFExportUnit returns [Enumerator current=null]
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
				$current = grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='bytes'
			{
				$current = grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1());
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
