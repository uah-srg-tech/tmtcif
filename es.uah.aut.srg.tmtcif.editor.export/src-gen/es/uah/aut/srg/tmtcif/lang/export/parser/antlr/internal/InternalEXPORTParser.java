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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
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
@SuppressWarnings("all")
public class InternalEXPORTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'TMTCIFExportExport'", "'{'", "'uri'", "'version'", "'from'", "'NULL'", "'to'", "'}'", "'TMTCIFExportSizes'", "'TMTCIFExportSizeFromFileLength'", "'id'", "'fromFile'", "'addSize'", "'unit'", "'TMTCIFExportSizeFromFileLine'", "'line'", "'TMTCIFExportSizeInBits'", "'TMTCIFExportSettings'", "'TMTCIFExportSettingFromConst'", "'value'", "'toFieldRef'", "'TMTCIFExportSettingFromSize'", "'sizeRef'", "'TMTCIFExportSettingFromFile'", "'file'", "'offset'", "'size'", "'TMTCIFExportSettingFromField'", "'fieldRef'", "'TMTCIFExportSettingAIFromConst'", "'toArrayIndex'", "'TMTCIFExportSettingAIFromFile'", "'TMTCIFExportActivateDICs'", "'TMTCIFExportDIC'", "'DICRef'", "'.'", "'('", "')'", "'::'", "'-'", "'bits'", "'bytes'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEXPORTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEXPORTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEXPORTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEXPORT.g"; }



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




    // $ANTLR start "entryRuleTMTCIFModelFile"
    // InternalEXPORT.g:79:1: entryRuleTMTCIFModelFile returns [EObject current=null] : iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF ;
    public final EObject entryRuleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFile = null;


        try {
            // InternalEXPORT.g:79:56: (iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF )
            // InternalEXPORT.g:80:2: iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFModelFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFModelFile=ruleTMTCIFModelFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFModelFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFModelFile"


    // $ANTLR start "ruleTMTCIFModelFile"
    // InternalEXPORT.g:86:1: ruleTMTCIFModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFExportExport ) ) ) ;
    public final EObject ruleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:92:2: ( ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFExportExport ) ) ) )
            // InternalEXPORT.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFExportExport ) ) )
            {
            // InternalEXPORT.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFExportExport ) ) )
            // InternalEXPORT.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFExportExport ) )
            {
            // InternalEXPORT.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEXPORT.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    {
            	    // InternalEXPORT.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    // InternalEXPORT.g:96:5: lv_imports_0_0= ruleTMTCIFModelFileImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_imports_0_0=ruleTMTCIFModelFileImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEXPORT.g:113:3: ( (lv_element_1_0= ruleTMTCIFExportExport ) )
            // InternalEXPORT.g:114:4: (lv_element_1_0= ruleTMTCIFExportExport )
            {
            // InternalEXPORT.g:114:4: (lv_element_1_0= ruleTMTCIFExportExport )
            // InternalEXPORT.g:115:5: lv_element_1_0= ruleTMTCIFExportExport
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleTMTCIFExportExport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFModelFileRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_1_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportExport");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFModelFile"


    // $ANTLR start "entryRuleTMTCIFModelFileImport"
    // InternalEXPORT.g:136:1: entryRuleTMTCIFModelFileImport returns [EObject current=null] : iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF ;
    public final EObject entryRuleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFileImport = null;


        try {
            // InternalEXPORT.g:136:62: (iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF )
            // InternalEXPORT.g:137:2: iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFModelFileImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFModelFileImport=ruleTMTCIFModelFileImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFModelFileImport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFModelFileImport"


    // $ANTLR start "ruleTMTCIFModelFileImport"
    // InternalEXPORT.g:143:1: ruleTMTCIFModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEXPORT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalEXPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalEXPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalEXPORT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalEXPORT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalEXPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalEXPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalEXPORT.g:161:5: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_2_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFModelFileImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFModelFileImport"


    // $ANTLR start "entryRuleTMTCIFExportExport"
    // InternalEXPORT.g:185:1: entryRuleTMTCIFExportExport returns [EObject current=null] : iv_ruleTMTCIFExportExport= ruleTMTCIFExportExport EOF ;
    public final EObject entryRuleTMTCIFExportExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportExport = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalEXPORT.g:189:2: (iv_ruleTMTCIFExportExport= ruleTMTCIFExportExport EOF )
            // InternalEXPORT.g:190:2: iv_ruleTMTCIFExportExport= ruleTMTCIFExportExport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportExportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportExport=ruleTMTCIFExportExport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportExport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportExport"


    // $ANTLR start "ruleTMTCIFExportExport"
    // InternalEXPORT.g:199:1: ruleTMTCIFExportExport returns [EObject current=null] : (otherlv_0= 'TMTCIFExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )? ( (lv_settings_22_0= ruleTMTCIFExportSettings ) ) ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' ) ;
    public final EObject ruleTMTCIFExportExport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_Sizes_21_0 = null;

        EObject lv_settings_22_0 = null;

        EObject lv_activateDICs_23_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalEXPORT.g:208:2: ( (otherlv_0= 'TMTCIFExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )? ( (lv_settings_22_0= ruleTMTCIFExportSettings ) ) ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' ) )
            // InternalEXPORT.g:209:2: (otherlv_0= 'TMTCIFExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )? ( (lv_settings_22_0= ruleTMTCIFExportSettings ) ) ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' )
            {
            // InternalEXPORT.g:209:2: (otherlv_0= 'TMTCIFExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )? ( (lv_settings_22_0= ruleTMTCIFExportSettings ) ) ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' )
            // InternalEXPORT.g:210:3: otherlv_0= 'TMTCIFExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )? ( (lv_settings_22_0= ruleTMTCIFExportSettings ) ) ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0());
              		
            }
            // InternalEXPORT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEXPORT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEXPORT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalEXPORT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalEXPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalEXPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalEXPORT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
            // InternalEXPORT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalEXPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalEXPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalEXPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFExportExport", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalEXPORT.g:244:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalEXPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
            	    // InternalEXPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalEXPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFExportExport", "true");
            	    }
            	    // InternalEXPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalEXPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalEXPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalEXPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.tmtcif.lang.export.EXPORT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalEXPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFExportExport", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalEXPORT.g:286:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalEXPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1);
            	    // InternalEXPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalEXPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFExportExport", "true");
            	    }
            	    // InternalEXPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalEXPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalEXPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalEXPORT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.tmtcif.lang.export.EXPORT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleTMTCIFExportExport", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4());
              		
            }
            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalEXPORT.g:343:3: (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEXPORT.g:344:4: otherlv_14= 'NULL'
                    {
                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:349:4: ( ( ruleVersionedQualifiedName ) )
                    {
                    // InternalEXPORT.g:349:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalEXPORT.g:350:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalEXPORT.g:350:5: ( ruleVersionedQualifiedName )
                    // InternalEXPORT.g:351:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7());
              		
            }
            otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8());
              		
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9());
              		
            }
            // InternalEXPORT.g:381:3: ( ( ruleVersionedQualifiedName ) )
            // InternalEXPORT.g:382:4: ( ruleVersionedQualifiedName )
            {
            // InternalEXPORT.g:382:4: ( ruleVersionedQualifiedName )
            // InternalEXPORT.g:383:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportExportRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11());
              		
            }
            // InternalEXPORT.g:404:3: ( (lv_Sizes_21_0= ruleTMTCIFExportSizes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEXPORT.g:405:4: (lv_Sizes_21_0= ruleTMTCIFExportSizes )
                    {
                    // InternalEXPORT.g:405:4: (lv_Sizes_21_0= ruleTMTCIFExportSizes )
                    // InternalEXPORT.g:406:5: lv_Sizes_21_0= ruleTMTCIFExportSizes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_Sizes_21_0=ruleTMTCIFExportSizes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
                      					}
                      					set(
                      						current,
                      						"Sizes",
                      						lv_Sizes_21_0,
                      						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizes");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEXPORT.g:423:3: ( (lv_settings_22_0= ruleTMTCIFExportSettings ) )
            // InternalEXPORT.g:424:4: (lv_settings_22_0= ruleTMTCIFExportSettings )
            {
            // InternalEXPORT.g:424:4: (lv_settings_22_0= ruleTMTCIFExportSettings )
            // InternalEXPORT.g:425:5: lv_settings_22_0= ruleTMTCIFExportSettings
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_settings_22_0=ruleTMTCIFExportSettings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
              					}
              					set(
              						current,
              						"settings",
              						lv_settings_22_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettings");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEXPORT.g:442:3: ( (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEXPORT.g:443:4: (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs )
                    {
                    // InternalEXPORT.g:443:4: (lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs )
                    // InternalEXPORT.g:444:5: lv_activateDICs_23_0= ruleTMTCIFExportActivateDICs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_activateDICs_23_0=ruleTMTCIFExportActivateDICs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTMTCIFExportExportRule());
                      					}
                      					set(
                      						current,
                      						"activateDICs",
                      						lv_activateDICs_23_0,
                      						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportActivateDICs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportExport"


    // $ANTLR start "entryRuleTMTCIFExportSizes"
    // InternalEXPORT.g:476:1: entryRuleTMTCIFExportSizes returns [EObject current=null] : iv_ruleTMTCIFExportSizes= ruleTMTCIFExportSizes EOF ;
    public final EObject entryRuleTMTCIFExportSizes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSizes = null;


        try {
            // InternalEXPORT.g:476:58: (iv_ruleTMTCIFExportSizes= ruleTMTCIFExportSizes EOF )
            // InternalEXPORT.g:477:2: iv_ruleTMTCIFExportSizes= ruleTMTCIFExportSizes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSizesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSizes=ruleTMTCIFExportSizes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSizes; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSizes"


    // $ANTLR start "ruleTMTCIFExportSizes"
    // InternalEXPORT.g:483:1: ruleTMTCIFExportSizes returns [EObject current=null] : ( () otherlv_1= 'TMTCIFExportSizes' otherlv_2= '{' ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+ otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFExportSizes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_sizeFromFileLength_3_0 = null;

        EObject lv_sizeFromFileLine_4_0 = null;

        EObject lv_sizeInBits_5_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:489:2: ( ( () otherlv_1= 'TMTCIFExportSizes' otherlv_2= '{' ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+ otherlv_6= '}' otherlv_7= ';' ) )
            // InternalEXPORT.g:490:2: ( () otherlv_1= 'TMTCIFExportSizes' otherlv_2= '{' ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+ otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalEXPORT.g:490:2: ( () otherlv_1= 'TMTCIFExportSizes' otherlv_2= '{' ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+ otherlv_6= '}' otherlv_7= ';' )
            // InternalEXPORT.g:491:3: () otherlv_1= 'TMTCIFExportSizes' otherlv_2= '{' ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+ otherlv_6= '}' otherlv_7= ';'
            {
            // InternalEXPORT.g:491:3: ()
            // InternalEXPORT.g:492:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:509:3: ( ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) ) | ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) ) | ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt6=1;
                    }
                    break;
                case 29:
                    {
                    alt6=2;
                    }
                    break;
                case 31:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalEXPORT.g:510:4: ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) )
            	    {
            	    // InternalEXPORT.g:510:4: ( (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength ) )
            	    // InternalEXPORT.g:511:5: (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength )
            	    {
            	    // InternalEXPORT.g:511:5: (lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength )
            	    // InternalEXPORT.g:512:6: lv_sizeFromFileLength_3_0= ruleTMTCIFExportSizeFromFileLength
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_sizeFromFileLength_3_0=ruleTMTCIFExportSizeFromFileLength();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sizeFromFileLength",
            	      							lv_sizeFromFileLength_3_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLength");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEXPORT.g:530:4: ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) )
            	    {
            	    // InternalEXPORT.g:530:4: ( (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine ) )
            	    // InternalEXPORT.g:531:5: (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine )
            	    {
            	    // InternalEXPORT.g:531:5: (lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine )
            	    // InternalEXPORT.g:532:6: lv_sizeFromFileLine_4_0= ruleTMTCIFExportSizeFromFileLine
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_sizeFromFileLine_4_0=ruleTMTCIFExportSizeFromFileLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sizeFromFileLine",
            	      							lv_sizeFromFileLine_4_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeFromFileLine");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEXPORT.g:550:4: ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) )
            	    {
            	    // InternalEXPORT.g:550:4: ( (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits ) )
            	    // InternalEXPORT.g:551:5: (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits )
            	    {
            	    // InternalEXPORT.g:551:5: (lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits )
            	    // InternalEXPORT.g:552:6: lv_sizeInBits_5_0= ruleTMTCIFExportSizeInBits
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_sizeInBits_5_0=ruleTMTCIFExportSizeInBits();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sizeInBits",
            	      							lv_sizeInBits_5_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSizeInBits");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSizes"


    // $ANTLR start "entryRuleTMTCIFExportSizeFromFileLength"
    // InternalEXPORT.g:582:1: entryRuleTMTCIFExportSizeFromFileLength returns [EObject current=null] : iv_ruleTMTCIFExportSizeFromFileLength= ruleTMTCIFExportSizeFromFileLength EOF ;
    public final EObject entryRuleTMTCIFExportSizeFromFileLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSizeFromFileLength = null;


        try {
            // InternalEXPORT.g:582:71: (iv_ruleTMTCIFExportSizeFromFileLength= ruleTMTCIFExportSizeFromFileLength EOF )
            // InternalEXPORT.g:583:2: iv_ruleTMTCIFExportSizeFromFileLength= ruleTMTCIFExportSizeFromFileLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSizeFromFileLength=ruleTMTCIFExportSizeFromFileLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSizeFromFileLength; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSizeFromFileLength"


    // $ANTLR start "ruleTMTCIFExportSizeFromFileLength"
    // InternalEXPORT.g:589:1: ruleTMTCIFExportSizeFromFileLength returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleTMTCIFExportSizeFromFileLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fromFile_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_addSize_12_0 = null;

        Enumerator lv_unit_16_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:595:2: ( (otherlv_0= 'TMTCIFExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalEXPORT.g:596:2: (otherlv_0= 'TMTCIFExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalEXPORT.g:596:2: (otherlv_0= 'TMTCIFExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalEXPORT.g:597:3: otherlv_0= 'TMTCIFExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:613:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:614:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:614:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:615:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:644:3: ( (lv_fromFile_8_0= RULE_ID ) )
            // InternalEXPORT.g:645:4: (lv_fromFile_8_0= RULE_ID )
            {
            // InternalEXPORT.g:645:4: (lv_fromFile_8_0= RULE_ID )
            // InternalEXPORT.g:646:5: lv_fromFile_8_0= RULE_ID
            {
            lv_fromFile_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_8_0, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:666:3: (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEXPORT.g:667:4: otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:675:4: ( (lv_addSize_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:676:5: (lv_addSize_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:676:5: (lv_addSize_12_0= ruleINTEGER )
                    // InternalEXPORT.g:677:6: lv_addSize_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:699:3: (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEXPORT.g:700:4: otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:708:4: ( (lv_unit_16_0= ruleTMTCIFExportUnit ) )
                    // InternalEXPORT.g:709:5: (lv_unit_16_0= ruleTMTCIFExportUnit )
                    {
                    // InternalEXPORT.g:709:5: (lv_unit_16_0= ruleTMTCIFExportUnit )
                    // InternalEXPORT.g:710:6: lv_unit_16_0= ruleTMTCIFExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_16_0=ruleTMTCIFExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLengthRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSizeFromFileLength"


    // $ANTLR start "entryRuleTMTCIFExportSizeFromFileLine"
    // InternalEXPORT.g:744:1: entryRuleTMTCIFExportSizeFromFileLine returns [EObject current=null] : iv_ruleTMTCIFExportSizeFromFileLine= ruleTMTCIFExportSizeFromFileLine EOF ;
    public final EObject entryRuleTMTCIFExportSizeFromFileLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSizeFromFileLine = null;


        try {
            // InternalEXPORT.g:744:69: (iv_ruleTMTCIFExportSizeFromFileLine= ruleTMTCIFExportSizeFromFileLine EOF )
            // InternalEXPORT.g:745:2: iv_ruleTMTCIFExportSizeFromFileLine= ruleTMTCIFExportSizeFromFileLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSizeFromFileLine=ruleTMTCIFExportSizeFromFileLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSizeFromFileLine; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSizeFromFileLine"


    // $ANTLR start "ruleTMTCIFExportSizeFromFileLine"
    // InternalEXPORT.g:751:1: ruleTMTCIFExportSizeFromFileLine returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFExportSizeFromFileLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fromFile_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_line_12_0 = null;

        AntlrDatatypeRuleToken lv_addSize_16_0 = null;

        Enumerator lv_unit_20_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:757:2: ( (otherlv_0= 'TMTCIFExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalEXPORT.g:758:2: (otherlv_0= 'TMTCIFExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalEXPORT.g:758:2: (otherlv_0= 'TMTCIFExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalEXPORT.g:759:3: otherlv_0= 'TMTCIFExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:775:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:776:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:776:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:777:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:806:3: ( (lv_fromFile_8_0= RULE_ID ) )
            // InternalEXPORT.g:807:4: (lv_fromFile_8_0= RULE_ID )
            {
            // InternalEXPORT.g:807:4: (lv_fromFile_8_0= RULE_ID )
            // InternalEXPORT.g:808:5: lv_fromFile_8_0= RULE_ID
            {
            lv_fromFile_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_8_0, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:836:3: ( (lv_line_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:837:4: (lv_line_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:837:4: (lv_line_12_0= ruleINTEGER )
            // InternalEXPORT.g:838:5: lv_line_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_line_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
              					}
              					set(
              						current,
              						"line",
              						lv_line_12_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13());
              		
            }
            // InternalEXPORT.g:859:3: (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEXPORT.g:860:4: otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalEXPORT.g:868:4: ( (lv_addSize_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:869:5: (lv_addSize_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:869:5: (lv_addSize_16_0= ruleINTEGER )
                    // InternalEXPORT.g:870:6: lv_addSize_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:892:3: (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEXPORT.g:893:4: otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleTMTCIFExportUnit ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1());
                      			
                    }
                    // InternalEXPORT.g:901:4: ( (lv_unit_20_0= ruleTMTCIFExportUnit ) )
                    // InternalEXPORT.g:902:5: (lv_unit_20_0= ruleTMTCIFExportUnit )
                    {
                    // InternalEXPORT.g:902:5: (lv_unit_20_0= ruleTMTCIFExportUnit )
                    // InternalEXPORT.g:903:6: lv_unit_20_0= ruleTMTCIFExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_20_0=ruleTMTCIFExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeFromFileLineRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSizeFromFileLine"


    // $ANTLR start "entryRuleTMTCIFExportSizeInBits"
    // InternalEXPORT.g:937:1: entryRuleTMTCIFExportSizeInBits returns [EObject current=null] : iv_ruleTMTCIFExportSizeInBits= ruleTMTCIFExportSizeInBits EOF ;
    public final EObject entryRuleTMTCIFExportSizeInBits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSizeInBits = null;


        try {
            // InternalEXPORT.g:937:63: (iv_ruleTMTCIFExportSizeInBits= ruleTMTCIFExportSizeInBits EOF )
            // InternalEXPORT.g:938:2: iv_ruleTMTCIFExportSizeInBits= ruleTMTCIFExportSizeInBits EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSizeInBits=ruleTMTCIFExportSizeInBits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSizeInBits; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSizeInBits"


    // $ANTLR start "ruleTMTCIFExportSizeInBits"
    // InternalEXPORT.g:944:1: ruleTMTCIFExportSizeInBits returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleTMTCIFExportSizeInBits() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_from_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_addSize_12_0 = null;

        Enumerator lv_unit_16_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:950:2: ( (otherlv_0= 'TMTCIFExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalEXPORT.g:951:2: (otherlv_0= 'TMTCIFExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalEXPORT.g:951:2: (otherlv_0= 'TMTCIFExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalEXPORT.g:952:3: otherlv_0= 'TMTCIFExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:968:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:969:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:969:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:970:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:999:3: ( (lv_from_8_0= RULE_ID ) )
            // InternalEXPORT.g:1000:4: (lv_from_8_0= RULE_ID )
            {
            // InternalEXPORT.g:1000:4: (lv_from_8_0= RULE_ID )
            // InternalEXPORT.g:1001:5: lv_from_8_0= RULE_ID
            {
            lv_from_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_from_8_0, grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSizeInBitsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"from",
              						lv_from_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:1021:3: (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEXPORT.g:1022:4: otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:1030:4: ( (lv_addSize_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1031:5: (lv_addSize_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1031:5: (lv_addSize_12_0= ruleINTEGER )
                    // InternalEXPORT.g:1032:6: lv_addSize_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1054:3: (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEXPORT.g:1055:4: otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleTMTCIFExportUnit ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:1063:4: ( (lv_unit_16_0= ruleTMTCIFExportUnit ) )
                    // InternalEXPORT.g:1064:5: (lv_unit_16_0= ruleTMTCIFExportUnit )
                    {
                    // InternalEXPORT.g:1064:5: (lv_unit_16_0= ruleTMTCIFExportUnit )
                    // InternalEXPORT.g:1065:6: lv_unit_16_0= ruleTMTCIFExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_16_0=ruleTMTCIFExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSizeInBitsRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSizeInBits"


    // $ANTLR start "entryRuleTMTCIFExportSettings"
    // InternalEXPORT.g:1099:1: entryRuleTMTCIFExportSettings returns [EObject current=null] : iv_ruleTMTCIFExportSettings= ruleTMTCIFExportSettings EOF ;
    public final EObject entryRuleTMTCIFExportSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettings = null;


        try {
            // InternalEXPORT.g:1099:61: (iv_ruleTMTCIFExportSettings= ruleTMTCIFExportSettings EOF )
            // InternalEXPORT.g:1100:2: iv_ruleTMTCIFExportSettings= ruleTMTCIFExportSettings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettings=ruleTMTCIFExportSettings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettings; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettings"


    // $ANTLR start "ruleTMTCIFExportSettings"
    // InternalEXPORT.g:1106:1: ruleTMTCIFExportSettings returns [EObject current=null] : ( () otherlv_1= 'TMTCIFExportSettings' otherlv_2= '{' ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )* otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleTMTCIFExportSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_settingFromConst_3_0 = null;

        EObject lv_settingFromSize_4_0 = null;

        EObject lv_settingFromFile_5_0 = null;

        EObject lv_settingFromField_6_0 = null;

        EObject lv_settingAIFromConst_7_0 = null;

        EObject lv_settingAIFromFile_8_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1112:2: ( ( () otherlv_1= 'TMTCIFExportSettings' otherlv_2= '{' ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )* otherlv_9= '}' otherlv_10= ';' ) )
            // InternalEXPORT.g:1113:2: ( () otherlv_1= 'TMTCIFExportSettings' otherlv_2= '{' ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )* otherlv_9= '}' otherlv_10= ';' )
            {
            // InternalEXPORT.g:1113:2: ( () otherlv_1= 'TMTCIFExportSettings' otherlv_2= '{' ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )* otherlv_9= '}' otherlv_10= ';' )
            // InternalEXPORT.g:1114:3: () otherlv_1= 'TMTCIFExportSettings' otherlv_2= '{' ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )* otherlv_9= '}' otherlv_10= ';'
            {
            // InternalEXPORT.g:1114:3: ()
            // InternalEXPORT.g:1115:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:1132:3: ( ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) ) | ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) ) | ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) ) | ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) ) | ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) ) | ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) ) )*
            loop13:
            do {
                int alt13=7;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt13=1;
                    }
                    break;
                case 36:
                    {
                    alt13=2;
                    }
                    break;
                case 38:
                    {
                    alt13=3;
                    }
                    break;
                case 42:
                    {
                    alt13=4;
                    }
                    break;
                case 44:
                    {
                    alt13=5;
                    }
                    break;
                case 46:
                    {
                    alt13=6;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalEXPORT.g:1133:4: ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) )
            	    {
            	    // InternalEXPORT.g:1133:4: ( (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst ) )
            	    // InternalEXPORT.g:1134:5: (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst )
            	    {
            	    // InternalEXPORT.g:1134:5: (lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst )
            	    // InternalEXPORT.g:1135:6: lv_settingFromConst_3_0= ruleTMTCIFExportSettingFromConst
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingFromConst_3_0=ruleTMTCIFExportSettingFromConst();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingFromConst",
            	      							lv_settingFromConst_3_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromConst");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEXPORT.g:1153:4: ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) )
            	    {
            	    // InternalEXPORT.g:1153:4: ( (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize ) )
            	    // InternalEXPORT.g:1154:5: (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize )
            	    {
            	    // InternalEXPORT.g:1154:5: (lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize )
            	    // InternalEXPORT.g:1155:6: lv_settingFromSize_4_0= ruleTMTCIFExportSettingFromSize
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingFromSize_4_0=ruleTMTCIFExportSettingFromSize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingFromSize",
            	      							lv_settingFromSize_4_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromSize");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEXPORT.g:1173:4: ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) )
            	    {
            	    // InternalEXPORT.g:1173:4: ( (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile ) )
            	    // InternalEXPORT.g:1174:5: (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile )
            	    {
            	    // InternalEXPORT.g:1174:5: (lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile )
            	    // InternalEXPORT.g:1175:6: lv_settingFromFile_5_0= ruleTMTCIFExportSettingFromFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingFromFile_5_0=ruleTMTCIFExportSettingFromFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingFromFile",
            	      							lv_settingFromFile_5_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromFile");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEXPORT.g:1193:4: ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) )
            	    {
            	    // InternalEXPORT.g:1193:4: ( (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField ) )
            	    // InternalEXPORT.g:1194:5: (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField )
            	    {
            	    // InternalEXPORT.g:1194:5: (lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField )
            	    // InternalEXPORT.g:1195:6: lv_settingFromField_6_0= ruleTMTCIFExportSettingFromField
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingFromField_6_0=ruleTMTCIFExportSettingFromField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingFromField",
            	      							lv_settingFromField_6_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingFromField");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEXPORT.g:1213:4: ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) )
            	    {
            	    // InternalEXPORT.g:1213:4: ( (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst ) )
            	    // InternalEXPORT.g:1214:5: (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst )
            	    {
            	    // InternalEXPORT.g:1214:5: (lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst )
            	    // InternalEXPORT.g:1215:6: lv_settingAIFromConst_7_0= ruleTMTCIFExportSettingAIFromConst
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingAIFromConst_7_0=ruleTMTCIFExportSettingAIFromConst();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingAIFromConst",
            	      							lv_settingAIFromConst_7_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromConst");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEXPORT.g:1233:4: ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) )
            	    {
            	    // InternalEXPORT.g:1233:4: ( (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile ) )
            	    // InternalEXPORT.g:1234:5: (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile )
            	    {
            	    // InternalEXPORT.g:1234:5: (lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile )
            	    // InternalEXPORT.g:1235:6: lv_settingAIFromFile_8_0= ruleTMTCIFExportSettingAIFromFile
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_settingAIFromFile_8_0=ruleTMTCIFExportSettingAIFromFile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"settingAIFromFile",
            	      							lv_settingAIFromFile_8_0,
            	      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportSettingAIFromFile");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettings"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromConst"
    // InternalEXPORT.g:1265:1: entryRuleTMTCIFExportSettingFromConst returns [EObject current=null] : iv_ruleTMTCIFExportSettingFromConst= ruleTMTCIFExportSettingFromConst EOF ;
    public final EObject entryRuleTMTCIFExportSettingFromConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingFromConst = null;


        try {
            // InternalEXPORT.g:1265:69: (iv_ruleTMTCIFExportSettingFromConst= ruleTMTCIFExportSettingFromConst EOF )
            // InternalEXPORT.g:1266:2: iv_ruleTMTCIFExportSettingFromConst= ruleTMTCIFExportSettingFromConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingFromConst=ruleTMTCIFExportSettingFromConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingFromConst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingFromConst"


    // $ANTLR start "ruleTMTCIFExportSettingFromConst"
    // InternalEXPORT.g:1272:1: ruleTMTCIFExportSettingFromConst returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFExportSettingFromConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1278:2: ( (otherlv_0= 'TMTCIFExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1279:2: (otherlv_0= 'TMTCIFExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1279:2: (otherlv_0= 'TMTCIFExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1280:3: otherlv_0= 'TMTCIFExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1296:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1297:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1297:4: (lv_value_4_0= ruleINTEGER )
            // InternalEXPORT.g:1298:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromConstRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1327:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1328:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1328:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1329:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromConstRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromConst"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromSize"
    // InternalEXPORT.g:1362:1: entryRuleTMTCIFExportSettingFromSize returns [EObject current=null] : iv_ruleTMTCIFExportSettingFromSize= ruleTMTCIFExportSettingFromSize EOF ;
    public final EObject entryRuleTMTCIFExportSettingFromSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingFromSize = null;


        try {
            // InternalEXPORT.g:1362:68: (iv_ruleTMTCIFExportSettingFromSize= ruleTMTCIFExportSettingFromSize EOF )
            // InternalEXPORT.g:1363:2: iv_ruleTMTCIFExportSettingFromSize= ruleTMTCIFExportSettingFromSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingFromSize=ruleTMTCIFExportSettingFromSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingFromSize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingFromSize"


    // $ANTLR start "ruleTMTCIFExportSettingFromSize"
    // InternalEXPORT.g:1369:1: ruleTMTCIFExportSettingFromSize returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFExportSettingFromSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_sizeRef_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1375:2: ( (otherlv_0= 'TMTCIFExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1376:2: (otherlv_0= 'TMTCIFExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1376:2: (otherlv_0= 'TMTCIFExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1377:3: otherlv_0= 'TMTCIFExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1393:3: ( (lv_sizeRef_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1394:4: (lv_sizeRef_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1394:4: (lv_sizeRef_4_0= ruleINTEGER )
            // InternalEXPORT.g:1395:5: lv_sizeRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_sizeRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromSizeRule());
              					}
              					set(
              						current,
              						"sizeRef",
              						lv_sizeRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1424:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1425:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1425:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1426:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromSizeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromSize"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromFile"
    // InternalEXPORT.g:1459:1: entryRuleTMTCIFExportSettingFromFile returns [EObject current=null] : iv_ruleTMTCIFExportSettingFromFile= ruleTMTCIFExportSettingFromFile EOF ;
    public final EObject entryRuleTMTCIFExportSettingFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingFromFile = null;


        try {
            // InternalEXPORT.g:1459:68: (iv_ruleTMTCIFExportSettingFromFile= ruleTMTCIFExportSettingFromFile EOF )
            // InternalEXPORT.g:1460:2: iv_ruleTMTCIFExportSettingFromFile= ruleTMTCIFExportSettingFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingFromFile=ruleTMTCIFExportSettingFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingFromFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingFromFile"


    // $ANTLR start "ruleTMTCIFExportSettingFromFile"
    // InternalEXPORT.g:1466:1: ruleTMTCIFExportSettingFromFile returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFExportSettingFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_file_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_offset_12_0 = null;

        AntlrDatatypeRuleToken lv_size_16_0 = null;

        AntlrDatatypeRuleToken lv_line_20_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1472:2: ( (otherlv_0= 'TMTCIFExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalEXPORT.g:1473:2: (otherlv_0= 'TMTCIFExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalEXPORT.g:1473:2: (otherlv_0= 'TMTCIFExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalEXPORT.g:1474:3: otherlv_0= 'TMTCIFExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1490:3: ( (lv_file_4_0= RULE_ID ) )
            // InternalEXPORT.g:1491:4: (lv_file_4_0= RULE_ID )
            {
            // InternalEXPORT.g:1491:4: (lv_file_4_0= RULE_ID )
            // InternalEXPORT.g:1492:5: lv_file_4_0= RULE_ID
            {
            lv_file_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_file_4_0, grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"file",
              						lv_file_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1520:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1521:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1521:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1522:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFileRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:1543:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEXPORT.g:1544:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:1552:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1553:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1553:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalEXPORT.g:1554:6: lv_offset_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1576:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEXPORT.g:1577:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:1585:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1586:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1586:5: (lv_size_16_0= ruleINTEGER )
                    // InternalEXPORT.g:1587:6: lv_size_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1609:3: (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEXPORT.g:1610:4: otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalEXPORT.g:1618:4: ( (lv_line_20_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1619:5: (lv_line_20_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1619:5: (lv_line_20_0= ruleINTEGER )
                    // InternalEXPORT.g:1620:6: lv_line_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_line_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"line",
                      							lv_line_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromFile"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromField"
    // InternalEXPORT.g:1654:1: entryRuleTMTCIFExportSettingFromField returns [EObject current=null] : iv_ruleTMTCIFExportSettingFromField= ruleTMTCIFExportSettingFromField EOF ;
    public final EObject entryRuleTMTCIFExportSettingFromField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingFromField = null;


        try {
            // InternalEXPORT.g:1654:69: (iv_ruleTMTCIFExportSettingFromField= ruleTMTCIFExportSettingFromField EOF )
            // InternalEXPORT.g:1655:2: iv_ruleTMTCIFExportSettingFromField= ruleTMTCIFExportSettingFromField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingFromField=ruleTMTCIFExportSettingFromField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingFromField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingFromField"


    // $ANTLR start "ruleTMTCIFExportSettingFromField"
    // InternalEXPORT.g:1661:1: ruleTMTCIFExportSettingFromField returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFExportSettingFromField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalEXPORT.g:1667:2: ( (otherlv_0= 'TMTCIFExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1668:2: (otherlv_0= 'TMTCIFExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1668:2: (otherlv_0= 'TMTCIFExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1669:3: otherlv_0= 'TMTCIFExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1685:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1686:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1686:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1687:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1716:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1717:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1717:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1718:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromField"


    // $ANTLR start "entryRuleTMTCIFExportSettingAIFromConst"
    // InternalEXPORT.g:1751:1: entryRuleTMTCIFExportSettingAIFromConst returns [EObject current=null] : iv_ruleTMTCIFExportSettingAIFromConst= ruleTMTCIFExportSettingAIFromConst EOF ;
    public final EObject entryRuleTMTCIFExportSettingAIFromConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingAIFromConst = null;


        try {
            // InternalEXPORT.g:1751:71: (iv_ruleTMTCIFExportSettingAIFromConst= ruleTMTCIFExportSettingAIFromConst EOF )
            // InternalEXPORT.g:1752:2: iv_ruleTMTCIFExportSettingAIFromConst= ruleTMTCIFExportSettingAIFromConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingAIFromConst=ruleTMTCIFExportSettingAIFromConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingAIFromConst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingAIFromConst"


    // $ANTLR start "ruleTMTCIFExportSettingAIFromConst"
    // InternalEXPORT.g:1758:1: ruleTMTCIFExportSettingAIFromConst returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleTMTCIFExportSettingAIFromConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_toArrayIndex_12_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1764:2: ( (otherlv_0= 'TMTCIFExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalEXPORT.g:1765:2: (otherlv_0= 'TMTCIFExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalEXPORT.g:1765:2: (otherlv_0= 'TMTCIFExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalEXPORT.g:1766:3: otherlv_0= 'TMTCIFExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1782:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1783:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1783:4: (lv_value_4_0= ruleINTEGER )
            // InternalEXPORT.g:1784:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromConstRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1813:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1814:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1814:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1815:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromConstRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:1844:3: ( (lv_toArrayIndex_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:1845:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1845:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            // InternalEXPORT.g:1846:5: lv_toArrayIndex_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_toArrayIndex_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromConstRule());
              					}
              					set(
              						current,
              						"toArrayIndex",
              						lv_toArrayIndex_12_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingAIFromConst"


    // $ANTLR start "entryRuleTMTCIFExportSettingAIFromFile"
    // InternalEXPORT.g:1879:1: entryRuleTMTCIFExportSettingAIFromFile returns [EObject current=null] : iv_ruleTMTCIFExportSettingAIFromFile= ruleTMTCIFExportSettingAIFromFile EOF ;
    public final EObject entryRuleTMTCIFExportSettingAIFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportSettingAIFromFile = null;


        try {
            // InternalEXPORT.g:1879:70: (iv_ruleTMTCIFExportSettingAIFromFile= ruleTMTCIFExportSettingAIFromFile EOF )
            // InternalEXPORT.g:1880:2: iv_ruleTMTCIFExportSettingAIFromFile= ruleTMTCIFExportSettingAIFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportSettingAIFromFile=ruleTMTCIFExportSettingAIFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportSettingAIFromFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportSettingAIFromFile"


    // $ANTLR start "ruleTMTCIFExportSettingAIFromFile"
    // InternalEXPORT.g:1886:1: ruleTMTCIFExportSettingAIFromFile returns [EObject current=null] : (otherlv_0= 'TMTCIFExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleTMTCIFExportSettingAIFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_file_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_toArrayIndex_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;

        AntlrDatatypeRuleToken lv_line_24_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1892:2: ( (otherlv_0= 'TMTCIFExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' ) )
            // InternalEXPORT.g:1893:2: (otherlv_0= 'TMTCIFExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalEXPORT.g:1893:2: (otherlv_0= 'TMTCIFExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' )
            // InternalEXPORT.g:1894:3: otherlv_0= 'TMTCIFExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1910:3: ( (lv_file_4_0= RULE_ID ) )
            // InternalEXPORT.g:1911:4: (lv_file_4_0= RULE_ID )
            {
            // InternalEXPORT.g:1911:4: (lv_file_4_0= RULE_ID )
            // InternalEXPORT.g:1912:5: lv_file_4_0= RULE_ID
            {
            lv_file_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_file_4_0, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"file",
              						lv_file_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1940:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1941:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1941:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1942:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:1971:3: ( (lv_toArrayIndex_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:1972:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1972:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            // InternalEXPORT.g:1973:5: lv_toArrayIndex_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_toArrayIndex_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
              					}
              					set(
              						current,
              						"toArrayIndex",
              						lv_toArrayIndex_12_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13());
              		
            }
            // InternalEXPORT.g:1994:3: (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEXPORT.g:1995:4: otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalEXPORT.g:2003:4: ( (lv_offset_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2004:5: (lv_offset_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2004:5: (lv_offset_16_0= ruleINTEGER )
                    // InternalEXPORT.g:2005:6: lv_offset_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:2027:3: (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEXPORT.g:2028:4: otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1());
                      			
                    }
                    // InternalEXPORT.g:2036:4: ( (lv_size_20_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2037:5: (lv_size_20_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2037:5: (lv_size_20_0= ruleINTEGER )
                    // InternalEXPORT.g:2038:6: lv_size_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:2060:3: (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEXPORT.g:2061:4: otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1());
                      			
                    }
                    // InternalEXPORT.g:2069:4: ( (lv_line_24_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2070:5: (lv_line_24_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2070:5: (lv_line_24_0= ruleINTEGER )
                    // InternalEXPORT.g:2071:6: lv_line_24_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_line_24_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"line",
                      							lv_line_24_0,
                      							"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportSettingAIFromFile"


    // $ANTLR start "entryRuleTMTCIFExportActivateDICs"
    // InternalEXPORT.g:2105:1: entryRuleTMTCIFExportActivateDICs returns [EObject current=null] : iv_ruleTMTCIFExportActivateDICs= ruleTMTCIFExportActivateDICs EOF ;
    public final EObject entryRuleTMTCIFExportActivateDICs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportActivateDICs = null;


        try {
            // InternalEXPORT.g:2105:65: (iv_ruleTMTCIFExportActivateDICs= ruleTMTCIFExportActivateDICs EOF )
            // InternalEXPORT.g:2106:2: iv_ruleTMTCIFExportActivateDICs= ruleTMTCIFExportActivateDICs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportActivateDICsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportActivateDICs=ruleTMTCIFExportActivateDICs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportActivateDICs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportActivateDICs"


    // $ANTLR start "ruleTMTCIFExportActivateDICs"
    // InternalEXPORT.g:2112:1: ruleTMTCIFExportActivateDICs returns [EObject current=null] : ( () otherlv_1= 'TMTCIFExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleTMTCIFExportActivateDICs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_DIC_3_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2118:2: ( ( () otherlv_1= 'TMTCIFExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalEXPORT.g:2119:2: ( () otherlv_1= 'TMTCIFExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalEXPORT.g:2119:2: ( () otherlv_1= 'TMTCIFExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalEXPORT.g:2120:3: () otherlv_1= 'TMTCIFExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalEXPORT.g:2120:3: ()
            // InternalEXPORT.g:2121:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:2138:3: ( (lv_DIC_3_0= ruleTMTCIFExportDIC ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEXPORT.g:2139:4: (lv_DIC_3_0= ruleTMTCIFExportDIC )
            	    {
            	    // InternalEXPORT.g:2139:4: (lv_DIC_3_0= ruleTMTCIFExportDIC )
            	    // InternalEXPORT.g:2140:5: lv_DIC_3_0= ruleTMTCIFExportDIC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_DIC_3_0=ruleTMTCIFExportDIC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFExportActivateDICsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"DIC",
            	      						lv_DIC_3_0,
            	      						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.TMTCIFExportDIC");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportActivateDICs"


    // $ANTLR start "entryRuleTMTCIFExportDIC"
    // InternalEXPORT.g:2169:1: entryRuleTMTCIFExportDIC returns [EObject current=null] : iv_ruleTMTCIFExportDIC= ruleTMTCIFExportDIC EOF ;
    public final EObject entryRuleTMTCIFExportDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFExportDIC = null;


        try {
            // InternalEXPORT.g:2169:56: (iv_ruleTMTCIFExportDIC= ruleTMTCIFExportDIC EOF )
            // InternalEXPORT.g:2170:2: iv_ruleTMTCIFExportDIC= ruleTMTCIFExportDIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFExportDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFExportDIC=ruleTMTCIFExportDIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFExportDIC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTMTCIFExportDIC"


    // $ANTLR start "ruleTMTCIFExportDIC"
    // InternalEXPORT.g:2176:1: ruleTMTCIFExportDIC returns [EObject current=null] : (otherlv_0= 'TMTCIFExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFExportDIC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_DICRef_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2182:2: ( (otherlv_0= 'TMTCIFExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:2183:2: (otherlv_0= 'TMTCIFExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:2183:2: (otherlv_0= 'TMTCIFExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:2184:3: otherlv_0= 'TMTCIFExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:2200:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:2201:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:2201:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:2202:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFExportDICRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:2231:3: ( (lv_DICRef_8_0= RULE_ID ) )
            // InternalEXPORT.g:2232:4: (lv_DICRef_8_0= RULE_ID )
            {
            // InternalEXPORT.g:2232:4: (lv_DICRef_8_0= RULE_ID )
            // InternalEXPORT.g:2233:5: lv_DICRef_8_0= RULE_ID
            {
            lv_DICRef_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_DICRef_8_0, grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFExportDICRule());
              					}
              					setWithLastConsumed(
              						current,
              						"DICRef",
              						lv_DICRef_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportDIC"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEXPORT.g:2265:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEXPORT.g:2265:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEXPORT.g:2266:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEXPORT.g:2272:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2278:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEXPORT.g:2279:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEXPORT.g:2279:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEXPORT.g:2280:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalEXPORT.g:2287:3: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEXPORT.g:2288:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalEXPORT.g:2305:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalEXPORT.g:2305:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalEXPORT.g:2306:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalEXPORT.g:2312:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_ID_6=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2318:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalEXPORT.g:2319:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalEXPORT.g:2319:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalEXPORT.g:2320:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalEXPORT.g:2320:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||LA23_1==14||LA23_1==50||LA23_1==52) ) {
                    alt23=1;
                }
                else if ( (LA23_1==RULE_ID) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalEXPORT.g:2321:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:2329:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalEXPORT.g:2329:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalEXPORT.g:2330:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalEXPORT.g:2330:5: (this_INT_1= RULE_INT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalEXPORT.g:2331:6: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
                              					
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ID_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEXPORT.g:2348:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEXPORT.g:2349:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalEXPORT.g:2354:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_INT) ) {
            	        int LA25_1 = input.LA(2);

            	        if ( (LA25_1==EOF||LA25_1==14||LA25_1==50||LA25_1==52) ) {
            	            alt25=1;
            	        }
            	        else if ( (LA25_1==RULE_ID) ) {
            	            alt25=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 25, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA25_0==RULE_ID) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalEXPORT.g:2355:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEXPORT.g:2363:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalEXPORT.g:2363:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalEXPORT.g:2364:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalEXPORT.g:2364:6: (this_INT_5= RULE_INT )?
            	            int alt24=2;
            	            int LA24_0 = input.LA(1);

            	            if ( (LA24_0==RULE_INT) ) {
            	                alt24=1;
            	            }
            	            switch (alt24) {
            	                case 1 :
            	                    // InternalEXPORT.g:2365:7: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							current.merge(this_INT_5);
            	                      						
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						current.merge(this_ID_6);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalEXPORT.g:2387:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalEXPORT.g:2387:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalEXPORT.g:2388:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionedQualifiedName"


    // $ANTLR start "ruleVersionedQualifiedName"
    // InternalEXPORT.g:2394:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2400:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalEXPORT.g:2401:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalEXPORT.g:2401:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalEXPORT.g:2402:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,51,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionedQualifiedName"


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // InternalEXPORT.g:2436:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalEXPORT.g:2436:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalEXPORT.g:2437:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"


    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // InternalEXPORT.g:2443:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2449:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalEXPORT.g:2450:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalEXPORT.g:2450:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalEXPORT.g:2451:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalEXPORT.g:2451:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=50 && LA27_1<=51)) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalEXPORT.g:2452:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VersionedQualifiedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalEXPORT.g:2475:3: (kw= '::' this_ID_4= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEXPORT.g:2476:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionedQualifiedReferenceName"


    // $ANTLR start "entryRuleINTEGER"
    // InternalEXPORT.g:2493:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalEXPORT.g:2493:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalEXPORT.g:2494:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalEXPORT.g:2500:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2506:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalEXPORT.g:2507:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalEXPORT.g:2507:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==54) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_HEXADECIMAL) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEXPORT.g:2508:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalEXPORT.g:2508:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalEXPORT.g:2509:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalEXPORT.g:2509:4: (kw= '-' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==54) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalEXPORT.g:2510:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FollowSets000.FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:2525:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
                    {
                    this_HEXADECIMAL_2=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEXADECIMAL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "ruleTMTCIFExportUnit"
    // InternalEXPORT.g:2536:1: ruleTMTCIFExportUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) ;
    public final Enumerator ruleTMTCIFExportUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2542:2: ( ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) )
            // InternalEXPORT.g:2543:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            {
            // InternalEXPORT.g:2543:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            else if ( (LA31_0==56) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEXPORT.g:2544:3: (enumLiteral_0= 'bits' )
                    {
                    // InternalEXPORT.g:2544:3: (enumLiteral_0= 'bits' )
                    // InternalEXPORT.g:2545:4: enumLiteral_0= 'bits'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:2552:3: (enumLiteral_1= 'bytes' )
                    {
                    // InternalEXPORT.g:2552:3: (enumLiteral_1= 'bytes' )
                    // InternalEXPORT.g:2553:4: enumLiteral_1= 'bytes'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTMTCIFExportUnit"

    // $ANTLR start synpred2_InternalEXPORT
    public final void synpred2_InternalEXPORT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalEXPORT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalEXPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalEXPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalEXPORT.g:244:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalEXPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
        // InternalEXPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalEXPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalEXPORT", "true");
        }
        // InternalEXPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalEXPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalEXPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalEXPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_uri_6_0=ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEXPORT

    // $ANTLR start synpred3_InternalEXPORT
    public final void synpred3_InternalEXPORT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalEXPORT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalEXPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalEXPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalEXPORT.g:286:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalEXPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1);
        // InternalEXPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalEXPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalEXPORT", "true");
        }
        // InternalEXPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalEXPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalEXPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalEXPORT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEXPORT

    // Delegated rules

    public final boolean synpred2_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEXPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEXPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000A1000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A1400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00400000000000C0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0180000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000545200400000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030040400000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020040400000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000400000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    }


}