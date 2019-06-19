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
grammar InternalFILTER;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package es.uah.aut.srg.tmtcif.lang.filter.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package es.uah.aut.srg.tmtcif.lang.filter.parser.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.filter.services.FILTERGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private FILTERGrammarAccess grammarAccess;

    public InternalFILTERParser(TokenStream input, FILTERGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TMTCIFModelFile";
   	}

   	@Override
   	protected FILTERGrammarAccess getGrammarAccess() {
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
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFModelFileImport");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0());
				}
				lv_element_1_0=ruleTMTCIFFilterFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
					}
					set(
						$current,
						"element",
						lv_element_1_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFilter");
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

// Entry rule entryRuleTMTCIFFilterFilter
entryRuleTMTCIFFilterFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterFilterRule()); }
	iv_ruleTMTCIFFilterFilter=ruleTMTCIFFilterFilter
	{ $current=$iv_ruleTMTCIFFilterFilter.current; }
	EOF;

// Rule TMTCIFFilterFilter
ruleTMTCIFFilterFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0());
		}
		this_TMTCIFFilterMaxtermFilter_0=ruleTMTCIFFilterMaxtermFilter
		{
			$current = $this_TMTCIFFilterMaxtermFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1());
		}
		this_TMTCIFFilterMintermFilter_1=ruleTMTCIFFilterMintermFilter
		{
			$current = $this_TMTCIFFilterMintermFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTMTCIFFilterMaxtermFilter
entryRuleTMTCIFFilterMaxtermFilter returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); }
	iv_ruleTMTCIFFilterMaxtermFilter=ruleTMTCIFFilterMaxtermFilter
	{ $current=$iv_ruleTMTCIFFilterMaxtermFilter.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule TMTCIFFilterMaxtermFilter
ruleTMTCIFFilterMaxtermFilter returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterMaxtermFilter'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.tmtcif.lang.filter.FILTER.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									otherlv_8='version'
									{
										newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0());
									}
									otherlv_9=':='
									{
										newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
											}
											lv_version_10_0=ruleVersion
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
												}
												set(
													$current,
													"version",
													lv_version_10_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.Version");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_11=';'
									{
										newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3());
									}
								)
								otherlv_12='formatFile'
								{
									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1());
								}
								otherlv_13=':='
								{
									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2());
								}
								(
									(
										{
											/* */
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0());
										}
										ruleVersionedQualifiedName
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_15=';'
								{
									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4());
								}
								(
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
											}
											lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
												}
												add(
													$current,
													"BoolVar",
													lv_BoolVar_16_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVar");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
											}
											lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
												}
												add(
													$current,
													"BoolVarFromArrayItem",
													lv_BoolVarFromArrayItem_17_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromArrayItem");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
											}
											lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
												}
												add(
													$current,
													"BoolVarFromGroupedArrayItem",
													lv_BoolVarFromGroupedArrayItem_18_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromGroupedArrayItem");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
											}
											lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
												}
												add(
													$current,
													"BoolVarFDIC",
													lv_BoolVarFDIC_19_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFDIC");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)+
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0());
				}
				lv_Maxterm_20_0=ruleTMTCIFFilterMaxterm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
					}
					add(
						$current,
						"Maxterm",
						lv_Maxterm_20_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMaxterm");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_22=';'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleTMTCIFFilterMintermFilter
entryRuleTMTCIFFilterMintermFilter returns [EObject current=null]@init {
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()
	);
}:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterRule()); }
	iv_ruleTMTCIFFilterMintermFilter=ruleTMTCIFFilterMintermFilter
	{ $current=$iv_ruleTMTCIFFilterMintermFilter.current; }
	EOF;
finally {
	myUnorderedGroupState.restore();
}

// Rule TMTCIFFilterMintermFilter
ruleTMTCIFFilterMintermFilter returns [EObject current=null]
@init {
	enterRule();
	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
	grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()
	);
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterMintermFilter'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterMintermFilterRule());
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
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>(otherlv_4='uri'
								{
									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0());
								}
								otherlv_5=':='
								{
									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
										}
										lv_uri_6_0=ruleQualifiedName
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
											}
											set(
												$current,
												"uri",
												lv_uri_6_0,
												"es.uah.aut.srg.tmtcif.lang.filter.FILTER.QualifiedName");
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_7=';'
								{
									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3());
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>((
									otherlv_8='version'
									{
										newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0());
									}
									otherlv_9=':='
									{
										newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
											}
											lv_version_10_0=ruleVersion
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
												}
												set(
													$current,
													"version",
													lv_version_10_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.Version");
												afterParserOrEnumRuleCall();
											}
										)
									)
									otherlv_11=';'
									{
										newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3());
									}
								)
								otherlv_12='formatFile'
								{
									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1());
								}
								otherlv_13=':='
								{
									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2());
								}
								(
									(
										{
											/* */
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getTMTCIFFilterMintermFilterRule());
											}
										}
										{
											newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0());
										}
										ruleVersionedQualifiedName
										{
											afterParserOrEnumRuleCall();
										}
									)
								)
								otherlv_15=';'
								{
									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4());
								}
								(
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
											}
											lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
												}
												add(
													$current,
													"BoolVar",
													lv_BoolVar_16_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVar");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
											}
											lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
												}
												add(
													$current,
													"BoolVarFromArrayItem",
													lv_BoolVarFromArrayItem_17_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromArrayItem");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
											}
											lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
												}
												add(
													$current,
													"BoolVarFromGroupedArrayItem",
													lv_BoolVarFromGroupedArrayItem_18_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromGroupedArrayItem");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
											}
											lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
												}
												add(
													$current,
													"BoolVarFDIC",
													lv_BoolVarFDIC_19_0,
													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFDIC");
												afterParserOrEnumRuleCall();
											}
										)
									)
								)+
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
				}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0());
				}
				lv_Minterm_20_0=ruleTMTCIFFilterMinterm
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
					}
					add(
						$current,
						"Minterm",
						lv_Minterm_20_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMinterm");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5());
		}
		otherlv_22=';'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6());
		}
	)
;
finally {
	myUnorderedGroupState.restore();
}

// Entry rule entryRuleTMTCIFFilterBoolVar
entryRuleTMTCIFFilterBoolVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRule()); }
	iv_ruleTMTCIFFilterBoolVar=ruleTMTCIFFilterBoolVar
	{ $current=$iv_ruleTMTCIFFilterBoolVar.current; }
	EOF;

// Rule TMTCIFFilterBoolVar
ruleTMTCIFFilterBoolVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterBoolVar'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleTMTCIFFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13());
		}
		otherlv_14='FieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0());
				}
				lv_Op_18_0=ruleTMTCIFFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
					}
					set(
						$current,
						"Op",
						lv_Op_18_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0());
					}
					lv_Constant_19_0=ruleTMTCIFFilterConstant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
						}
						set(
							$current,
							"Constant",
							lv_Constant_19_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0());
					}
					lv_Select_20_0=ruleTMTCIFFilterSelect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
						}
						set(
							$current,
							"Select",
							lv_Select_20_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0());
					}
					lv_SelectLine_21_0=ruleTMTCIFFilterSelectLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
						}
						set(
							$current,
							"SelectLine",
							lv_SelectLine_21_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterBoolVarFromArrayItem
entryRuleTMTCIFFilterBoolVarFromArrayItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); }
	iv_ruleTMTCIFFilterBoolVarFromArrayItem=ruleTMTCIFFilterBoolVarFromArrayItem
	{ $current=$iv_ruleTMTCIFFilterBoolVarFromArrayItem.current; }
	EOF;

// Rule TMTCIFFilterBoolVarFromArrayItem
ruleTMTCIFFilterBoolVarFromArrayItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterBoolVarFromArrayItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleTMTCIFFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13());
		}
		otherlv_14='AIFieldRef'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0());
				}
				lv_Op_18_0=ruleTMTCIFFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
					}
					set(
						$current,
						"Op",
						lv_Op_18_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0());
					}
					lv_Constant_19_0=ruleTMTCIFFilterConstant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
						}
						set(
							$current,
							"Constant",
							lv_Constant_19_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0());
					}
					lv_Select_20_0=ruleTMTCIFFilterSelect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
						}
						set(
							$current,
							"Select",
							lv_Select_20_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0());
					}
					lv_SelectLine_21_0=ruleTMTCIFFilterSelectLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
						}
						set(
							$current,
							"SelectLine",
							lv_SelectLine_21_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem
entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); }
	iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem=ruleTMTCIFFilterBoolVarFromGroupedArrayItem
	{ $current=$iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem.current; }
	EOF;

// Rule TMTCIFFilterBoolVarFromGroupedArrayItem
ruleTMTCIFFilterBoolVarFromGroupedArrayItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterBoolVarFromGroupedArrayItem'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9());
		}
		otherlv_10='constantType'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
				}
				lv_constantType_12_0=ruleTMTCIFFilterConstantType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"constantType",
						lv_constantType_12_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13());
		}
		otherlv_14='group'
		{
			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14());
		}
		otherlv_15=':='
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15());
		}
		(
			(
				lv_group_16_0=RULE_ID
				{
					newLeafNode(lv_group_16_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
					setWithLastConsumed(
						$current,
						"group",
						lv_group_16_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_17=';'
		{
			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17());
		}
		otherlv_18='AIFieldRefs'
		{
			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18());
		}
		otherlv_19=':='
		{
			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21=';'
		{
			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0());
				}
				lv_Op_22_0=ruleTMTCIFFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
					}
					set(
						$current,
						"Op",
						lv_Op_22_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0());
					}
					lv_Constant_23_0=ruleTMTCIFFilterConstant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
						}
						set(
							$current,
							"Constant",
							lv_Constant_23_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0());
					}
					lv_Select_24_0=ruleTMTCIFFilterSelect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
						}
						set(
							$current,
							"Select",
							lv_Select_24_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0());
					}
					lv_SelectLine_25_0=ruleTMTCIFFilterSelectLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
						}
						set(
							$current,
							"SelectLine",
							lv_SelectLine_25_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24());
		}
		otherlv_27=';'
		{
			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterBoolVarFDIC
entryRuleTMTCIFFilterBoolVarFDIC returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); }
	iv_ruleTMTCIFFilterBoolVarFDIC=ruleTMTCIFFilterBoolVarFDIC
	{ $current=$iv_ruleTMTCIFFilterBoolVarFDIC.current; }
	EOF;

// Rule TMTCIFFilterBoolVarFDIC
ruleTMTCIFFilterBoolVarFDIC returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterBoolVarFDIC'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5());
		}
		otherlv_6='name'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				lv_name_8_0=RULE_ID
				{
					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_8_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9());
		}
		otherlv_10='FieldRef'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10());
		}
		otherlv_11=':='
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11());
		}
		(
			(
				{
					/* */
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0());
				}
				ruleVersionedQualifiedReferenceName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13=';'
		{
			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0());
				}
				lv_Op_14_0=ruleTMTCIFFilterFieldOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
					}
					set(
						$current,
						"Op",
						lv_Op_14_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15());
		}
		otherlv_16=';'
		{
			newLeafNode(otherlv_16, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterFieldOp
entryRuleTMTCIFFilterFieldOp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterFieldOpRule()); }
	iv_ruleTMTCIFFilterFieldOp=ruleTMTCIFFilterFieldOp
	{ $current=$iv_ruleTMTCIFFilterFieldOp.current; }
	EOF;

// Rule TMTCIFFilterFieldOp
ruleTMTCIFFilterFieldOp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterFieldOp'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0());
				}
				lv_type_4_0=ruleTMTCIFFilterOPType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterFieldOpRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterOPType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterConstant
entryRuleTMTCIFFilterConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterConstantRule()); }
	iv_ruleTMTCIFFilterConstant=ruleTMTCIFFilterConstant
	{ $current=$iv_ruleTMTCIFFilterConstant.current; }
	EOF;

// Rule TMTCIFFilterConstant
ruleTMTCIFFilterConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterConstant'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='value'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0());
				}
				lv_value_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterConstantRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5());
		}
		(
			otherlv_6='mask'
			{
				newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0());
			}
			otherlv_7=':='
			{
				newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1());
			}
			(
				(
					lv_mask_8_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_8_0, grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFilterConstantRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_8_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_9=';'
			{
				newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterSelect
entryRuleTMTCIFFilterSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterSelectRule()); }
	iv_ruleTMTCIFFilterSelect=ruleTMTCIFFilterSelect
	{ $current=$iv_ruleTMTCIFFilterSelect.current; }
	EOF;

// Rule TMTCIFFilterSelect
ruleTMTCIFFilterSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterSelect'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fromFile'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_fromFile_4_0=RULE_ID
				{
					newLeafNode(lv_fromFile_4_0, grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterSelectRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5());
		}
		otherlv_6='type'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0());
				}
				lv_type_8_0=ruleTMTCIFFilterSelectType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
					}
					set(
						$current,
						"type",
						lv_type_8_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='offset'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0());
					}
					lv_offset_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
						}
						set(
							$current,
							"offset",
							lv_offset_12_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='size'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0());
					}
					lv_size_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
						}
						set(
							$current,
							"size",
							lv_size_16_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='mask'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					lv_mask_20_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_20_0, grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFilterSelectRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_20_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterSelectLine
entryRuleTMTCIFFilterSelectLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineRule()); }
	iv_ruleTMTCIFFilterSelectLine=ruleTMTCIFFilterSelectLine
	{ $current=$iv_ruleTMTCIFFilterSelectLine.current; }
	EOF;

// Rule TMTCIFFilterSelectLine
ruleTMTCIFFilterSelectLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterSelectLine'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='fromFile'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				lv_fromFile_4_0=RULE_ID
				{
					newLeafNode(lv_fromFile_4_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTMTCIFFilterSelectLineRule());
					}
					setWithLastConsumed(
						$current,
						"fromFile",
						lv_fromFile_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5());
		}
		otherlv_6='line'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6());
		}
		otherlv_7=':='
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0());
				}
				lv_line_8_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
					}
					set(
						$current,
						"line",
						lv_line_8_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9());
		}
		(
			otherlv_10='leftTrim'
			{
				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0());
			}
			otherlv_11=':='
			{
				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0());
					}
					lv_leftTrim_12_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
						}
						set(
							$current,
							"leftTrim",
							lv_leftTrim_12_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_13=';'
			{
				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3());
			}
		)?
		(
			otherlv_14='rightTrim'
			{
				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0());
			}
			otherlv_15=':='
			{
				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0());
					}
					lv_rightTrim_16_0=ruleINTEGER
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
						}
						set(
							$current,
							"rightTrim",
							lv_rightTrim_16_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_17=';'
			{
				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3());
			}
		)?
		(
			otherlv_18='mask'
			{
				newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0());
			}
			otherlv_19=':='
			{
				newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
			}
			(
				(
					lv_mask_20_0=RULE_HEXADECIMAL
					{
						newLeafNode(lv_mask_20_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTMTCIFFilterSelectLineRule());
						}
						setWithLastConsumed(
							$current,
							"mask",
							lv_mask_20_0,
							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
					}
				)
			)
			otherlv_21=';'
			{
				newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3());
			}
		)?
		otherlv_22='}'
		{
			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_23=';'
		{
			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterMaxterm
entryRuleTMTCIFFilterMaxterm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermRule()); }
	iv_ruleTMTCIFFilterMaxterm=ruleTMTCIFFilterMaxterm
	{ $current=$iv_ruleTMTCIFFilterMaxterm.current; }
	EOF;

// Rule TMTCIFFilterMaxterm
ruleTMTCIFFilterMaxterm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterMaxterm'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0());
				}
				lv_BoolVarRef_6_0=ruleTMTCIFFilterBoolVarRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermRule());
					}
					add(
						$current,
						"BoolVarRef",
						lv_BoolVarRef_6_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarRef");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterMinterm
entryRuleTMTCIFFilterMinterm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterMintermRule()); }
	iv_ruleTMTCIFFilterMinterm=ruleTMTCIFFilterMinterm
	{ $current=$iv_ruleTMTCIFFilterMinterm.current; }
	EOF;

// Rule TMTCIFFilterMinterm
ruleTMTCIFFilterMinterm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterMinterm'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='id'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0());
				}
				lv_id_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermRule());
					}
					set(
						$current,
						"id",
						lv_id_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0());
				}
				lv_BoolVarRef_6_0=ruleTMTCIFFilterBoolVarRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermRule());
					}
					add(
						$current,
						"BoolVarRef",
						lv_BoolVarRef_6_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarRef");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8());
		}
	)
;

// Entry rule entryRuleTMTCIFFilterBoolVarRef
entryRuleTMTCIFFilterBoolVarRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRefRule()); }
	iv_ruleTMTCIFFilterBoolVarRef=ruleTMTCIFFilterBoolVarRef
	{ $current=$iv_ruleTMTCIFFilterBoolVarRef.current; }
	EOF;

// Rule TMTCIFFilterBoolVarRef
ruleTMTCIFFilterBoolVarRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TMTCIFFilterBoolVarRef'
		{
			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='idRef'
		{
			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2());
		}
		otherlv_3=':='
		{
			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0());
				}
				lv_idRef_4_0=ruleINTEGER
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRefRule());
					}
					set(
						$current,
						"idRef",
						lv_idRef_4_0,
						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5());
		}
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7());
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

// Rule TMTCIFFilterConstantType
ruleTMTCIFFilterConstantType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='decimal'
			{
				$current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='hex'
			{
				$current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='binary'
			{
				$current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='char'
			{
				$current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='string'
			{
				$current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule TMTCIFFilterOPType
ruleTMTCIFFilterOPType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='equal'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='different'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='bigger_than'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='smaller_than'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='bigger_or_equal'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='smaller_or_equal'
			{
				$current = grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule TMTCIFFilterSelectType
ruleTMTCIFFilterSelectType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='data'
			{
				$current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='size'
			{
				$current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='crc'
			{
				$current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2());
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
