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
public class InternalFILTERParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HEXADECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'TMTCIFFilterMaxtermFilter'", "'{'", "'uri'", "'version'", "'formatFile'", "'}'", "'TMTCIFFilterMintermFilter'", "'TMTCIFFilterBoolVar'", "'id'", "'name'", "'constantType'", "'FieldRef'", "'TMTCIFFilterBoolVarFromArrayItem'", "'AIFieldRef'", "'TMTCIFFilterBoolVarFromGroupedArrayItem'", "'group'", "'AIFieldRefs'", "'TMTCIFFilterBoolVarFDIC'", "'TMTCIFFilterFieldOp'", "'type'", "'TMTCIFFilterConstant'", "'value'", "'mask'", "'TMTCIFFilterSelect'", "'fromFile'", "'offset'", "'size'", "'TMTCIFFilterSelectLine'", "'line'", "'leftTrim'", "'rightTrim'", "'TMTCIFFilterMaxterm'", "'TMTCIFFilterMinterm'", "'TMTCIFFilterBoolVarRef'", "'idRef'", "'.'", "'('", "')'", "'::'", "'-'", "'decimal'", "'hex'", "'binary'", "'char'", "'string'", "'equal'", "'different'", "'bigger_than'", "'smaller_than'", "'bigger_or_equal'", "'smaller_or_equal'", "'data'", "'crc'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalFILTERParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFILTERParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFILTERParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFILTER.g"; }



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




    // $ANTLR start "entryRuleTMTCIFModelFile"
    // InternalFILTER.g:79:1: entryRuleTMTCIFModelFile returns [EObject current=null] : iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF ;
    public final EObject entryRuleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFile = null;


        try {
            // InternalFILTER.g:79:56: (iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF )
            // InternalFILTER.g:80:2: iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF
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
    // InternalFILTER.g:86:1: ruleTMTCIFModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFilterFilter ) ) ) ;
    public final EObject ruleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:92:2: ( ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFilterFilter ) ) ) )
            // InternalFILTER.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFilterFilter ) ) )
            {
            // InternalFILTER.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFilterFilter ) ) )
            // InternalFILTER.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFilterFilter ) )
            {
            // InternalFILTER.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFILTER.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    {
            	    // InternalFILTER.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    // InternalFILTER.g:96:5: lv_imports_0_0= ruleTMTCIFModelFileImport
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
            	      						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFILTER.g:113:3: ( (lv_element_1_0= ruleTMTCIFFilterFilter ) )
            // InternalFILTER.g:114:4: (lv_element_1_0= ruleTMTCIFFilterFilter )
            {
            // InternalFILTER.g:114:4: (lv_element_1_0= ruleTMTCIFFilterFilter )
            // InternalFILTER.g:115:5: lv_element_1_0= ruleTMTCIFFilterFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleTMTCIFFilterFilter();

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
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFilter");
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
    // InternalFILTER.g:136:1: entryRuleTMTCIFModelFileImport returns [EObject current=null] : iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF ;
    public final EObject entryRuleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFileImport = null;


        try {
            // InternalFILTER.g:136:62: (iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF )
            // InternalFILTER.g:137:2: iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF
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
    // InternalFILTER.g:143:1: ruleTMTCIFModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFILTER.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalFILTER.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalFILTER.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalFILTER.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFILTER.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalFILTER.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalFILTER.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalFILTER.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleTMTCIFFilterFilter"
    // InternalFILTER.g:185:1: entryRuleTMTCIFFilterFilter returns [EObject current=null] : iv_ruleTMTCIFFilterFilter= ruleTMTCIFFilterFilter EOF ;
    public final EObject entryRuleTMTCIFFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterFilter = null;


        try {
            // InternalFILTER.g:185:59: (iv_ruleTMTCIFFilterFilter= ruleTMTCIFFilterFilter EOF )
            // InternalFILTER.g:186:2: iv_ruleTMTCIFFilterFilter= ruleTMTCIFFilterFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterFilter=ruleTMTCIFFilterFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterFilter; 
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
    // $ANTLR end "entryRuleTMTCIFFilterFilter"


    // $ANTLR start "ruleTMTCIFFilterFilter"
    // InternalFILTER.g:192:1: ruleTMTCIFFilterFilter returns [EObject current=null] : (this_TMTCIFFilterMaxtermFilter_0= ruleTMTCIFFilterMaxtermFilter | this_TMTCIFFilterMintermFilter_1= ruleTMTCIFFilterMintermFilter ) ;
    public final EObject ruleTMTCIFFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TMTCIFFilterMaxtermFilter_0 = null;

        EObject this_TMTCIFFilterMintermFilter_1 = null;



        	enterRule();

        try {
            // InternalFILTER.g:198:2: ( (this_TMTCIFFilterMaxtermFilter_0= ruleTMTCIFFilterMaxtermFilter | this_TMTCIFFilterMintermFilter_1= ruleTMTCIFFilterMintermFilter ) )
            // InternalFILTER.g:199:2: (this_TMTCIFFilterMaxtermFilter_0= ruleTMTCIFFilterMaxtermFilter | this_TMTCIFFilterMintermFilter_1= ruleTMTCIFFilterMintermFilter )
            {
            // InternalFILTER.g:199:2: (this_TMTCIFFilterMaxtermFilter_0= ruleTMTCIFFilterMaxtermFilter | this_TMTCIFFilterMintermFilter_1= ruleTMTCIFFilterMintermFilter )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFILTER.g:200:3: this_TMTCIFFilterMaxtermFilter_0= ruleTMTCIFFilterMaxtermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TMTCIFFilterMaxtermFilter_0=ruleTMTCIFFilterMaxtermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TMTCIFFilterMaxtermFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:212:3: this_TMTCIFFilterMintermFilter_1= ruleTMTCIFFilterMintermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TMTCIFFilterMintermFilter_1=ruleTMTCIFFilterMintermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TMTCIFFilterMintermFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
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
    // $ANTLR end "ruleTMTCIFFilterFilter"


    // $ANTLR start "entryRuleTMTCIFFilterMaxtermFilter"
    // InternalFILTER.g:227:1: entryRuleTMTCIFFilterMaxtermFilter returns [EObject current=null] : iv_ruleTMTCIFFilterMaxtermFilter= ruleTMTCIFFilterMaxtermFilter EOF ;
    public final EObject entryRuleTMTCIFFilterMaxtermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterMaxtermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:231:2: (iv_ruleTMTCIFFilterMaxtermFilter= ruleTMTCIFFilterMaxtermFilter EOF )
            // InternalFILTER.g:232:2: iv_ruleTMTCIFFilterMaxtermFilter= ruleTMTCIFFilterMaxtermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterMaxtermFilter=ruleTMTCIFFilterMaxtermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterMaxtermFilter; 
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
    // $ANTLR end "entryRuleTMTCIFFilterMaxtermFilter"


    // $ANTLR start "ruleTMTCIFFilterMaxtermFilter"
    // InternalFILTER.g:241:1: ruleTMTCIFFilterMaxtermFilter returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleTMTCIFFilterMaxtermFilter() throws RecognitionException {
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
        Token otherlv_15=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;

        EObject lv_Maxterm_20_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:250:2: ( (otherlv_0= 'TMTCIFFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTER.g:251:2: (otherlv_0= 'TMTCIFFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTER.g:251:2: (otherlv_0= 'TMTCIFFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTER.g:252:3: otherlv_0= 'TMTCIFFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFILTER.g:278:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTER.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTER.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTER.g:280:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
            // InternalFILTER.g:283:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTER.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTER.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTER.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTER.g:286:122: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTER.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTER.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTER.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTER.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTER.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTER.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTER.g:300:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.tmtcif.lang.filter.FILTER.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTER.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTER.g:328:122: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTER.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTER.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTER.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTER.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTER.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTER.g:341:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTER.g:343:12: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	      												}
            	      												set(
            	      													current,
            	      													"version",
            	      													lv_version_10_0,
            	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTER.g:373:9: ( ( ruleVersionedQualifiedName ) )
            	    // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
            	    // InternalFILTER.g:375:11: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											/* */
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	      											}
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0());
            	      										
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

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTER.g:396:9: ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=5;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            alt3=1;
            	            }
            	            break;
            	        case 27:
            	            {
            	            alt3=2;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt3=3;
            	            }
            	            break;
            	        case 32:
            	            {
            	            alt3=4;
            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
            	    	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
            	    	    {
            	    	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
            	    	    // InternalFILTER.g:399:12: lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVar",
            	    	      													lv_BoolVar_16_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
            	    	    // InternalFILTER.g:419:12: lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromArrayItem",
            	    	      													lv_BoolVarFromArrayItem_17_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTER.g:439:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromGroupedArrayItem",
            	    	      													lv_BoolVarFromGroupedArrayItem_18_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
            	    	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
            	    	    // InternalFILTER.g:459:12: lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFDIC",
            	    	      													lv_BoolVarFDIC_19_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFDIC");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleTMTCIFFilterMaxtermFilter", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());

            }

            // InternalFILTER.g:491:3: ( (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFILTER.g:492:4: (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm )
            	    {
            	    // InternalFILTER.g:492:4: (lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm )
            	    // InternalFILTER.g:493:5: lv_Maxterm_20_0= ruleTMTCIFFilterMaxterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_Maxterm_20_0=ruleTMTCIFFilterMaxterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Maxterm",
            	      						lv_Maxterm_20_0,
            	      						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMaxterm");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleTMTCIFFilterMaxtermFilter"


    // $ANTLR start "entryRuleTMTCIFFilterMintermFilter"
    // InternalFILTER.g:525:1: entryRuleTMTCIFFilterMintermFilter returns [EObject current=null] : iv_ruleTMTCIFFilterMintermFilter= ruleTMTCIFFilterMintermFilter EOF ;
    public final EObject entryRuleTMTCIFFilterMintermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterMintermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:529:2: (iv_ruleTMTCIFFilterMintermFilter= ruleTMTCIFFilterMintermFilter EOF )
            // InternalFILTER.g:530:2: iv_ruleTMTCIFFilterMintermFilter= ruleTMTCIFFilterMintermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterMintermFilter=ruleTMTCIFFilterMintermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterMintermFilter; 
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
    // $ANTLR end "entryRuleTMTCIFFilterMintermFilter"


    // $ANTLR start "ruleTMTCIFFilterMintermFilter"
    // InternalFILTER.g:539:1: ruleTMTCIFFilterMintermFilter returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleTMTCIFFilterMintermFilter() throws RecognitionException {
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
        Token otherlv_15=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;

        EObject lv_Minterm_20_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:548:2: ( (otherlv_0= 'TMTCIFFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTER.g:549:2: (otherlv_0= 'TMTCIFFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTER.g:549:2: (otherlv_0= 'TMTCIFFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTER.g:550:3: otherlv_0= 'TMTCIFFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:554:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:555:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:555:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:556:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterMintermFilterRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFILTER.g:576:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTER.g:577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTER.g:577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTER.g:578:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
            // InternalFILTER.g:581:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTER.g:582:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTER.g:582:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTER.g:584:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTER.g:584:122: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTER.g:585:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTER.g:588:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTER.g:588:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMintermFilter", "true");
            	    }
            	    // InternalFILTER.g:588:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTER.g:588:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTER.g:596:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTER.g:598:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.tmtcif.lang.filter.FILTER.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTER.g:626:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTER.g:626:122: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTER.g:627:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTER.g:630:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTER.g:630:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFilterMintermFilter", "true");
            	    }
            	    // InternalFILTER.g:630:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTER.g:631:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTER.g:639:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTER.g:641:12: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	      												}
            	      												set(
            	      													current,
            	      													"version",
            	      													lv_version_10_0,
            	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTER.g:671:9: ( ( ruleVersionedQualifiedName ) )
            	    // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
            	    // InternalFILTER.g:673:11: ruleVersionedQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											/* */
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	      											}
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0());
            	      										
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

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTER.g:694:9: ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=5;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            alt6=1;
            	            }
            	            break;
            	        case 27:
            	            {
            	            alt6=2;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt6=3;
            	            }
            	            break;
            	        case 32:
            	            {
            	            alt6=4;
            	            }
            	            break;

            	        }

            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
            	    	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
            	    	    {
            	    	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
            	    	    // InternalFILTER.g:697:12: lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVar",
            	    	      													lv_BoolVar_16_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
            	    	    // InternalFILTER.g:717:12: lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromArrayItem",
            	    	      													lv_BoolVarFromArrayItem_17_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTER.g:737:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromGroupedArrayItem",
            	    	      													lv_BoolVarFromGroupedArrayItem_18_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
            	    	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
            	    	    // InternalFILTER.g:757:12: lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
            	    	    lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFDIC",
            	    	      													lv_BoolVarFDIC_19_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarFDIC");
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


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleTMTCIFFilterMintermFilter", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());

            }

            // InternalFILTER.g:789:3: ( (lv_Minterm_20_0= ruleTMTCIFFilterMinterm ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFILTER.g:790:4: (lv_Minterm_20_0= ruleTMTCIFFilterMinterm )
            	    {
            	    // InternalFILTER.g:790:4: (lv_Minterm_20_0= ruleTMTCIFFilterMinterm )
            	    // InternalFILTER.g:791:5: lv_Minterm_20_0= ruleTMTCIFFilterMinterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_Minterm_20_0=ruleTMTCIFFilterMinterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Minterm",
            	      						lv_Minterm_20_0,
            	      						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterMinterm");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleTMTCIFFilterMintermFilter"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVar"
    // InternalFILTER.g:823:1: entryRuleTMTCIFFilterBoolVar returns [EObject current=null] : iv_ruleTMTCIFFilterBoolVar= ruleTMTCIFFilterBoolVar EOF ;
    public final EObject entryRuleTMTCIFFilterBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterBoolVar = null;


        try {
            // InternalFILTER.g:823:60: (iv_ruleTMTCIFFilterBoolVar= ruleTMTCIFFilterBoolVar EOF )
            // InternalFILTER.g:824:2: iv_ruleTMTCIFFilterBoolVar= ruleTMTCIFFilterBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterBoolVar=ruleTMTCIFFilterBoolVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterBoolVar; 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVar"


    // $ANTLR start "ruleTMTCIFFilterBoolVar"
    // InternalFILTER.g:830:1: ruleTMTCIFFilterBoolVar returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFFilterBoolVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_Constant_19_0 = null;

        EObject lv_Select_20_0 = null;

        EObject lv_SelectLine_21_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:836:2: ( (otherlv_0= 'TMTCIFFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:837:2: (otherlv_0= 'TMTCIFFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:837:2: (otherlv_0= 'TMTCIFFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:838:3: otherlv_0= 'TMTCIFFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:854:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:855:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:855:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:856:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:885:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:886:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:886:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:887:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:915:3: ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:916:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:916:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:917:5: lv_constantType_12_0= ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:946:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:947:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:947:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:948:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:969:3: ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:970:4: (lv_Op_18_0= ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:970:4: (lv_Op_18_0= ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:971:5: lv_Op_18_0= ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_Op_18_0=ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_18_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:988:3: ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFILTER.g:989:4: ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) )
                    {
                    // InternalFILTER.g:989:4: ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) )
                    // InternalFILTER.g:990:5: (lv_Constant_19_0= ruleTMTCIFFilterConstant )
                    {
                    // InternalFILTER.g:990:5: (lv_Constant_19_0= ruleTMTCIFFilterConstant )
                    // InternalFILTER.g:991:6: lv_Constant_19_0= ruleTMTCIFFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_19_0=ruleTMTCIFFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_19_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1009:4: ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) )
                    {
                    // InternalFILTER.g:1009:4: ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) )
                    // InternalFILTER.g:1010:5: (lv_Select_20_0= ruleTMTCIFFilterSelect )
                    {
                    // InternalFILTER.g:1010:5: (lv_Select_20_0= ruleTMTCIFFilterSelect )
                    // InternalFILTER.g:1011:6: lv_Select_20_0= ruleTMTCIFFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_20_0=ruleTMTCIFFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1029:4: ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1029:4: ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) )
                    // InternalFILTER.g:1030:5: (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine )
                    {
                    // InternalFILTER.g:1030:5: (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine )
                    // InternalFILTER.g:1031:6: lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_21_0=ruleTMTCIFFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_21_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21());
              		
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
    // $ANTLR end "ruleTMTCIFFilterBoolVar"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFromArrayItem"
    // InternalFILTER.g:1061:1: entryRuleTMTCIFFilterBoolVarFromArrayItem returns [EObject current=null] : iv_ruleTMTCIFFilterBoolVarFromArrayItem= ruleTMTCIFFilterBoolVarFromArrayItem EOF ;
    public final EObject entryRuleTMTCIFFilterBoolVarFromArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterBoolVarFromArrayItem = null;


        try {
            // InternalFILTER.g:1061:73: (iv_ruleTMTCIFFilterBoolVarFromArrayItem= ruleTMTCIFFilterBoolVarFromArrayItem EOF )
            // InternalFILTER.g:1062:2: iv_ruleTMTCIFFilterBoolVarFromArrayItem= ruleTMTCIFFilterBoolVarFromArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterBoolVarFromArrayItem=ruleTMTCIFFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterBoolVarFromArrayItem; 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFromArrayItem"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFromArrayItem"
    // InternalFILTER.g:1068:1: ruleTMTCIFFilterBoolVarFromArrayItem returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFFilterBoolVarFromArrayItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_Constant_19_0 = null;

        EObject lv_Select_20_0 = null;

        EObject lv_SelectLine_21_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1074:2: ( (otherlv_0= 'TMTCIFFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1075:2: (otherlv_0= 'TMTCIFFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1075:2: (otherlv_0= 'TMTCIFFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1076:3: otherlv_0= 'TMTCIFFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1092:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1093:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1093:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1094:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1123:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1124:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1124:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1125:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1153:3: ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:1154:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:1154:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:1155:5: lv_constantType_12_0= ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:1184:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1185:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1185:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1186:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:1207:3: ( (lv_Op_18_0= ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:1208:4: (lv_Op_18_0= ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:1208:4: (lv_Op_18_0= ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:1209:5: lv_Op_18_0= ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_Op_18_0=ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_18_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:1226:3: ( ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFILTER.g:1227:4: ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) )
                    {
                    // InternalFILTER.g:1227:4: ( (lv_Constant_19_0= ruleTMTCIFFilterConstant ) )
                    // InternalFILTER.g:1228:5: (lv_Constant_19_0= ruleTMTCIFFilterConstant )
                    {
                    // InternalFILTER.g:1228:5: (lv_Constant_19_0= ruleTMTCIFFilterConstant )
                    // InternalFILTER.g:1229:6: lv_Constant_19_0= ruleTMTCIFFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_19_0=ruleTMTCIFFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_19_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1247:4: ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) )
                    {
                    // InternalFILTER.g:1247:4: ( (lv_Select_20_0= ruleTMTCIFFilterSelect ) )
                    // InternalFILTER.g:1248:5: (lv_Select_20_0= ruleTMTCIFFilterSelect )
                    {
                    // InternalFILTER.g:1248:5: (lv_Select_20_0= ruleTMTCIFFilterSelect )
                    // InternalFILTER.g:1249:6: lv_Select_20_0= ruleTMTCIFFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_20_0=ruleTMTCIFFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1267:4: ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1267:4: ( (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine ) )
                    // InternalFILTER.g:1268:5: (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine )
                    {
                    // InternalFILTER.g:1268:5: (lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine )
                    // InternalFILTER.g:1269:6: lv_SelectLine_21_0= ruleTMTCIFFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_21_0=ruleTMTCIFFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_21_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21());
              		
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFromArrayItem"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:1299:1: entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem= ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF ;
    public final EObject entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem = null;


        try {
            // InternalFILTER.g:1299:80: (iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem= ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTER.g:1300:2: iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem= ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem=ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterBoolVarFromGroupedArrayItem; 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:1306:1: ruleTMTCIFFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleTMTCIFFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_group_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_22_0 = null;

        EObject lv_Constant_23_0 = null;

        EObject lv_Select_24_0 = null;

        EObject lv_SelectLine_25_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1312:2: ( (otherlv_0= 'TMTCIFFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' ) )
            // InternalFILTER.g:1313:2: (otherlv_0= 'TMTCIFFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalFILTER.g:1313:2: (otherlv_0= 'TMTCIFFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' )
            // InternalFILTER.g:1314:3: otherlv_0= 'TMTCIFFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1330:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1331:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1331:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1332:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1361:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1362:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1362:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1363:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1391:3: ( (lv_constantType_12_0= ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:1392:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:1392:4: (lv_constantType_12_0= ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:1393:5: lv_constantType_12_0= ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:1422:3: ( (lv_group_16_0= RULE_ID ) )
            // InternalFILTER.g:1423:4: (lv_group_16_0= RULE_ID )
            {
            // InternalFILTER.g:1423:4: (lv_group_16_0= RULE_ID )
            // InternalFILTER.g:1424:5: lv_group_16_0= RULE_ID
            {
            lv_group_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_group_16_0, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"group",
              						lv_group_16_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalFILTER.g:1452:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1453:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1453:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1454:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0());
              				
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21());
              		
            }
            // InternalFILTER.g:1475:3: ( (lv_Op_22_0= ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:1476:4: (lv_Op_22_0= ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:1476:4: (lv_Op_22_0= ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:1477:5: lv_Op_22_0= ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_Op_22_0=ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_22_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:1494:3: ( ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) ) | ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 42:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFILTER.g:1495:4: ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) )
                    {
                    // InternalFILTER.g:1495:4: ( (lv_Constant_23_0= ruleTMTCIFFilterConstant ) )
                    // InternalFILTER.g:1496:5: (lv_Constant_23_0= ruleTMTCIFFilterConstant )
                    {
                    // InternalFILTER.g:1496:5: (lv_Constant_23_0= ruleTMTCIFFilterConstant )
                    // InternalFILTER.g:1497:6: lv_Constant_23_0= ruleTMTCIFFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_23_0=ruleTMTCIFFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_23_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1515:4: ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) )
                    {
                    // InternalFILTER.g:1515:4: ( (lv_Select_24_0= ruleTMTCIFFilterSelect ) )
                    // InternalFILTER.g:1516:5: (lv_Select_24_0= ruleTMTCIFFilterSelect )
                    {
                    // InternalFILTER.g:1516:5: (lv_Select_24_0= ruleTMTCIFFilterSelect )
                    // InternalFILTER.g:1517:6: lv_Select_24_0= ruleTMTCIFFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_24_0=ruleTMTCIFFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_24_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1535:4: ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1535:4: ( (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine ) )
                    // InternalFILTER.g:1536:5: (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine )
                    {
                    // InternalFILTER.g:1536:5: (lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine )
                    // InternalFILTER.g:1537:6: lv_SelectLine_25_0= ruleTMTCIFFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_25_0=ruleTMTCIFFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_25_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFDIC"
    // InternalFILTER.g:1567:1: entryRuleTMTCIFFilterBoolVarFDIC returns [EObject current=null] : iv_ruleTMTCIFFilterBoolVarFDIC= ruleTMTCIFFilterBoolVarFDIC EOF ;
    public final EObject entryRuleTMTCIFFilterBoolVarFDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterBoolVarFDIC = null;


        try {
            // InternalFILTER.g:1567:64: (iv_ruleTMTCIFFilterBoolVarFDIC= ruleTMTCIFFilterBoolVarFDIC EOF )
            // InternalFILTER.g:1568:2: iv_ruleTMTCIFFilterBoolVarFDIC= ruleTMTCIFFilterBoolVarFDIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterBoolVarFDIC=ruleTMTCIFFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterBoolVarFDIC; 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFDIC"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFDIC"
    // InternalFILTER.g:1574:1: ruleTMTCIFFilterBoolVarFDIC returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleTMTCIFFilterBoolVarFDIC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_Op_14_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1580:2: ( (otherlv_0= 'TMTCIFFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalFILTER.g:1581:2: (otherlv_0= 'TMTCIFFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalFILTER.g:1581:2: (otherlv_0= 'TMTCIFFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalFILTER.g:1582:3: otherlv_0= 'TMTCIFFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1598:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1599:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1599:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1600:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1629:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1630:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1630:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1631:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1659:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1660:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1660:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1661:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0());
              				
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFILTER.g:1682:3: ( (lv_Op_14_0= ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:1683:4: (lv_Op_14_0= ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:1683:4: (lv_Op_14_0= ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:1684:5: lv_Op_14_0= ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_Op_14_0=ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_14_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFDIC"


    // $ANTLR start "entryRuleTMTCIFFilterFieldOp"
    // InternalFILTER.g:1713:1: entryRuleTMTCIFFilterFieldOp returns [EObject current=null] : iv_ruleTMTCIFFilterFieldOp= ruleTMTCIFFilterFieldOp EOF ;
    public final EObject entryRuleTMTCIFFilterFieldOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterFieldOp = null;


        try {
            // InternalFILTER.g:1713:60: (iv_ruleTMTCIFFilterFieldOp= ruleTMTCIFFilterFieldOp EOF )
            // InternalFILTER.g:1714:2: iv_ruleTMTCIFFilterFieldOp= ruleTMTCIFFilterFieldOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterFieldOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterFieldOp=ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterFieldOp; 
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
    // $ANTLR end "entryRuleTMTCIFFilterFieldOp"


    // $ANTLR start "ruleTMTCIFFilterFieldOp"
    // InternalFILTER.g:1720:1: ruleTMTCIFFilterFieldOp returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleTMTCIFFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFFilterFieldOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1726:2: ( (otherlv_0= 'TMTCIFFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleTMTCIFFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:1727:2: (otherlv_0= 'TMTCIFFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleTMTCIFFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:1727:2: (otherlv_0= 'TMTCIFFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleTMTCIFFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:1728:3: otherlv_0= 'TMTCIFFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleTMTCIFFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1744:3: ( (lv_type_4_0= ruleTMTCIFFilterOPType ) )
            // InternalFILTER.g:1745:4: (lv_type_4_0= ruleTMTCIFFilterOPType )
            {
            // InternalFILTER.g:1745:4: (lv_type_4_0= ruleTMTCIFFilterOPType )
            // InternalFILTER.g:1746:5: lv_type_4_0= ruleTMTCIFFilterOPType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_4_0=ruleTMTCIFFilterOPType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterFieldOpRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterOPType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleTMTCIFFilterFieldOp"


    // $ANTLR start "entryRuleTMTCIFFilterConstant"
    // InternalFILTER.g:1779:1: entryRuleTMTCIFFilterConstant returns [EObject current=null] : iv_ruleTMTCIFFilterConstant= ruleTMTCIFFilterConstant EOF ;
    public final EObject entryRuleTMTCIFFilterConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterConstant = null;


        try {
            // InternalFILTER.g:1779:61: (iv_ruleTMTCIFFilterConstant= ruleTMTCIFFilterConstant EOF )
            // InternalFILTER.g:1780:2: iv_ruleTMTCIFFilterConstant= ruleTMTCIFFilterConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterConstant=ruleTMTCIFFilterConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterConstant; 
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
    // $ANTLR end "entryRuleTMTCIFFilterConstant"


    // $ANTLR start "ruleTMTCIFFilterConstant"
    // InternalFILTER.g:1786:1: ruleTMTCIFFilterConstant returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFilterConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mask_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1792:2: ( (otherlv_0= 'TMTCIFFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFILTER.g:1793:2: (otherlv_0= 'TMTCIFFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFILTER.g:1793:2: (otherlv_0= 'TMTCIFFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalFILTER.g:1794:3: otherlv_0= 'TMTCIFFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1810:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1811:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1811:4: (lv_value_4_0= ruleINTEGER )
            // InternalFILTER.g:1812:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterConstantRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:1833:3: (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFILTER.g:1834:4: otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalFILTER.g:1842:4: ( (lv_mask_8_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:1843:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:1843:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:1844:6: lv_mask_8_0= RULE_HEXADECIMAL
                    {
                    lv_mask_8_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_8_0, grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFilterConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_8_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleTMTCIFFilterConstant"


    // $ANTLR start "entryRuleTMTCIFFilterSelect"
    // InternalFILTER.g:1877:1: entryRuleTMTCIFFilterSelect returns [EObject current=null] : iv_ruleTMTCIFFilterSelect= ruleTMTCIFFilterSelect EOF ;
    public final EObject entryRuleTMTCIFFilterSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterSelect = null;


        try {
            // InternalFILTER.g:1877:59: (iv_ruleTMTCIFFilterSelect= ruleTMTCIFFilterSelect EOF )
            // InternalFILTER.g:1878:2: iv_ruleTMTCIFFilterSelect= ruleTMTCIFFilterSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterSelectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterSelect=ruleTMTCIFFilterSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterSelect; 
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
    // $ANTLR end "entryRuleTMTCIFFilterSelect"


    // $ANTLR start "ruleTMTCIFFilterSelect"
    // InternalFILTER.g:1884:1: ruleTMTCIFFilterSelect returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFFilterSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fromFile_4_0=null;
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
        Token lv_mask_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_offset_12_0 = null;

        AntlrDatatypeRuleToken lv_size_16_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1890:2: ( (otherlv_0= 'TMTCIFFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1891:2: (otherlv_0= 'TMTCIFFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1891:2: (otherlv_0= 'TMTCIFFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1892:3: otherlv_0= 'TMTCIFFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1908:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:1909:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:1909:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:1910:5: lv_fromFile_4_0= RULE_ID
            {
            lv_fromFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_4_0, grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterSelectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1938:3: ( (lv_type_8_0= ruleTMTCIFFilterSelectType ) )
            // InternalFILTER.g:1939:4: (lv_type_8_0= ruleTMTCIFFilterSelectType )
            {
            // InternalFILTER.g:1939:4: (lv_type_8_0= ruleTMTCIFFilterSelectType )
            // InternalFILTER.g:1940:5: lv_type_8_0= ruleTMTCIFFilterSelectType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleTMTCIFFilterSelectType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterSelectType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:1961:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFILTER.g:1962:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:1970:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:1971:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1971:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalFILTER.g:1972:6: lv_offset_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1994:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFILTER.g:1995:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:2003:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:2004:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2004:5: (lv_size_16_0= ruleINTEGER )
                    // InternalFILTER.g:2005:6: lv_size_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2027:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFILTER.g:2028:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:2036:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:2037:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:2037:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:2038:6: lv_mask_20_0= RULE_HEXADECIMAL
                    {
                    lv_mask_20_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_20_0, grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFilterSelectRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14());
              		
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
    // $ANTLR end "ruleTMTCIFFilterSelect"


    // $ANTLR start "entryRuleTMTCIFFilterSelectLine"
    // InternalFILTER.g:2071:1: entryRuleTMTCIFFilterSelectLine returns [EObject current=null] : iv_ruleTMTCIFFilterSelectLine= ruleTMTCIFFilterSelectLine EOF ;
    public final EObject entryRuleTMTCIFFilterSelectLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterSelectLine = null;


        try {
            // InternalFILTER.g:2071:63: (iv_ruleTMTCIFFilterSelectLine= ruleTMTCIFFilterSelectLine EOF )
            // InternalFILTER.g:2072:2: iv_ruleTMTCIFFilterSelectLine= ruleTMTCIFFilterSelectLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterSelectLine=ruleTMTCIFFilterSelectLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterSelectLine; 
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
    // $ANTLR end "entryRuleTMTCIFFilterSelectLine"


    // $ANTLR start "ruleTMTCIFFilterSelectLine"
    // InternalFILTER.g:2078:1: ruleTMTCIFFilterSelectLine returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleTMTCIFFilterSelectLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fromFile_4_0=null;
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
        Token lv_mask_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_line_8_0 = null;

        AntlrDatatypeRuleToken lv_leftTrim_12_0 = null;

        AntlrDatatypeRuleToken lv_rightTrim_16_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2084:2: ( (otherlv_0= 'TMTCIFFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:2085:2: (otherlv_0= 'TMTCIFFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:2085:2: (otherlv_0= 'TMTCIFFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:2086:3: otherlv_0= 'TMTCIFFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2102:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:2103:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:2103:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:2104:5: lv_fromFile_4_0= RULE_ID
            {
            lv_fromFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_4_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFilterSelectLineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:2132:3: ( (lv_line_8_0= ruleINTEGER ) )
            // InternalFILTER.g:2133:4: (lv_line_8_0= ruleINTEGER )
            {
            // InternalFILTER.g:2133:4: (lv_line_8_0= ruleINTEGER )
            // InternalFILTER.g:2134:5: lv_line_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_line_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
              					}
              					set(
              						current,
              						"line",
              						lv_line_8_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:2155:3: (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFILTER.g:2156:4: otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:2164:4: ( (lv_leftTrim_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:2165:5: (lv_leftTrim_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2165:5: (lv_leftTrim_12_0= ruleINTEGER )
                    // InternalFILTER.g:2166:6: lv_leftTrim_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_leftTrim_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
                      						}
                      						set(
                      							current,
                      							"leftTrim",
                      							lv_leftTrim_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2188:3: (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFILTER.g:2189:4: otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:2197:4: ( (lv_rightTrim_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:2198:5: (lv_rightTrim_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2198:5: (lv_rightTrim_16_0= ruleINTEGER )
                    // InternalFILTER.g:2199:6: lv_rightTrim_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_rightTrim_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFilterSelectLineRule());
                      						}
                      						set(
                      							current,
                      							"rightTrim",
                      							lv_rightTrim_16_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2221:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFILTER.g:2222:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:2230:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:2231:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:2231:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:2232:6: lv_mask_20_0= RULE_HEXADECIMAL
                    {
                    lv_mask_20_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_20_0, grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFilterSelectLineRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_20_0,
                      							"es.uah.aut.srg.tmtcif.lang.filter.FILTER.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14());
              		
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
    // $ANTLR end "ruleTMTCIFFilterSelectLine"


    // $ANTLR start "entryRuleTMTCIFFilterMaxterm"
    // InternalFILTER.g:2265:1: entryRuleTMTCIFFilterMaxterm returns [EObject current=null] : iv_ruleTMTCIFFilterMaxterm= ruleTMTCIFFilterMaxterm EOF ;
    public final EObject entryRuleTMTCIFFilterMaxterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterMaxterm = null;


        try {
            // InternalFILTER.g:2265:60: (iv_ruleTMTCIFFilterMaxterm= ruleTMTCIFFilterMaxterm EOF )
            // InternalFILTER.g:2266:2: iv_ruleTMTCIFFilterMaxterm= ruleTMTCIFFilterMaxterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterMaxterm=ruleTMTCIFFilterMaxterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterMaxterm; 
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
    // $ANTLR end "entryRuleTMTCIFFilterMaxterm"


    // $ANTLR start "ruleTMTCIFFilterMaxterm"
    // InternalFILTER.g:2272:1: ruleTMTCIFFilterMaxterm returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleTMTCIFFilterMaxterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_BoolVarRef_6_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2278:2: ( (otherlv_0= 'TMTCIFFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2279:2: (otherlv_0= 'TMTCIFFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2279:2: (otherlv_0= 'TMTCIFFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2280:3: otherlv_0= 'TMTCIFFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2296:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2297:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2297:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2298:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2319:3: ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFILTER.g:2320:4: (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2320:4: (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef )
            	    // InternalFILTER.g:2321:5: lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_BoolVarRef_6_0=ruleTMTCIFFilterBoolVarRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMaxtermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVarRef",
            	      						lv_BoolVarRef_6_0,
            	      						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarRef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleTMTCIFFilterMaxterm"


    // $ANTLR start "entryRuleTMTCIFFilterMinterm"
    // InternalFILTER.g:2350:1: entryRuleTMTCIFFilterMinterm returns [EObject current=null] : iv_ruleTMTCIFFilterMinterm= ruleTMTCIFFilterMinterm EOF ;
    public final EObject entryRuleTMTCIFFilterMinterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterMinterm = null;


        try {
            // InternalFILTER.g:2350:60: (iv_ruleTMTCIFFilterMinterm= ruleTMTCIFFilterMinterm EOF )
            // InternalFILTER.g:2351:2: iv_ruleTMTCIFFilterMinterm= ruleTMTCIFFilterMinterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterMintermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterMinterm=ruleTMTCIFFilterMinterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterMinterm; 
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
    // $ANTLR end "entryRuleTMTCIFFilterMinterm"


    // $ANTLR start "ruleTMTCIFFilterMinterm"
    // InternalFILTER.g:2357:1: ruleTMTCIFFilterMinterm returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleTMTCIFFilterMinterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_BoolVarRef_6_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2363:2: ( (otherlv_0= 'TMTCIFFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2364:2: (otherlv_0= 'TMTCIFFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2364:2: (otherlv_0= 'TMTCIFFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2365:3: otherlv_0= 'TMTCIFFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2381:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2382:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2382:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2383:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2404:3: ( (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef ) )+
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
            	    // InternalFILTER.g:2405:4: (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2405:4: (lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef )
            	    // InternalFILTER.g:2406:5: lv_BoolVarRef_6_0= ruleTMTCIFFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_BoolVarRef_6_0=ruleTMTCIFFilterBoolVarRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFFilterMintermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVarRef",
            	      						lv_BoolVarRef_6_0,
            	      						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.TMTCIFFilterBoolVarRef");
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

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleTMTCIFFilterMinterm"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarRef"
    // InternalFILTER.g:2435:1: entryRuleTMTCIFFilterBoolVarRef returns [EObject current=null] : iv_ruleTMTCIFFilterBoolVarRef= ruleTMTCIFFilterBoolVarRef EOF ;
    public final EObject entryRuleTMTCIFFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFilterBoolVarRef = null;


        try {
            // InternalFILTER.g:2435:63: (iv_ruleTMTCIFFilterBoolVarRef= ruleTMTCIFFilterBoolVarRef EOF )
            // InternalFILTER.g:2436:2: iv_ruleTMTCIFFilterBoolVarRef= ruleTMTCIFFilterBoolVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFilterBoolVarRef=ruleTMTCIFFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFilterBoolVarRef; 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarRef"


    // $ANTLR start "ruleTMTCIFFilterBoolVarRef"
    // InternalFILTER.g:2442:1: ruleTMTCIFFilterBoolVarRef returns [EObject current=null] : (otherlv_0= 'TMTCIFFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_idRef_4_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2448:2: ( (otherlv_0= 'TMTCIFFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:2449:2: (otherlv_0= 'TMTCIFFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:2449:2: (otherlv_0= 'TMTCIFFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:2450:3: otherlv_0= 'TMTCIFFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2466:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2467:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2467:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalFILTER.g:2468:5: lv_idRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_idRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFilterBoolVarRefRule());
              					}
              					set(
              						current,
              						"idRef",
              						lv_idRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFILTER.g:2501:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFILTER.g:2501:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFILTER.g:2502:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFILTER.g:2508:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2514:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFILTER.g:2515:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFILTER.g:2515:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFILTER.g:2516:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFILTER.g:2523:3: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFILTER.g:2524:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
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
    // InternalFILTER.g:2541:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFILTER.g:2541:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFILTER.g:2542:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFILTER.g:2548:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFILTER.g:2554:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFILTER.g:2555:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFILTER.g:2555:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFILTER.g:2556:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFILTER.g:2556:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ID) ) {
                    alt23=2;
                }
                else if ( (LA23_1==EOF||LA23_1==14||LA23_1==50||LA23_1==52) ) {
                    alt23=1;
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
                    // InternalFILTER.g:2557:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2565:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFILTER.g:2565:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFILTER.g:2566:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFILTER.g:2566:5: (this_INT_1= RULE_INT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalFILTER.g:2567:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
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

            // InternalFILTER.g:2584:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFILTER.g:2585:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFILTER.g:2590:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_INT) ) {
            	        int LA25_1 = input.LA(2);

            	        if ( (LA25_1==RULE_ID) ) {
            	            alt25=2;
            	        }
            	        else if ( (LA25_1==EOF||LA25_1==14||LA25_1==50||LA25_1==52) ) {
            	            alt25=1;
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
            	            // InternalFILTER.g:2591:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFILTER.g:2599:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFILTER.g:2599:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFILTER.g:2600:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFILTER.g:2600:6: (this_INT_5= RULE_INT )?
            	            int alt24=2;
            	            int LA24_0 = input.LA(1);

            	            if ( (LA24_0==RULE_INT) ) {
            	                alt24=1;
            	            }
            	            switch (alt24) {
            	                case 1 :
            	                    // InternalFILTER.g:2601:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
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
    // InternalFILTER.g:2623:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalFILTER.g:2623:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalFILTER.g:2624:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalFILTER.g:2630:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2636:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalFILTER.g:2637:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalFILTER.g:2637:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalFILTER.g:2638:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_47);
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
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalFILTER.g:2672:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalFILTER.g:2672:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalFILTER.g:2673:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalFILTER.g:2679:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2685:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalFILTER.g:2686:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalFILTER.g:2686:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalFILTER.g:2687:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalFILTER.g:2687:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
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
                    // InternalFILTER.g:2688:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalFILTER.g:2711:3: (kw= '::' this_ID_4= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFILTER.g:2712:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_50); if (state.failed) return current;
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
    // InternalFILTER.g:2729:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFILTER.g:2729:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFILTER.g:2730:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFILTER.g:2736:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2742:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFILTER.g:2743:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:2743:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
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
                    // InternalFILTER.g:2744:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFILTER.g:2744:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFILTER.g:2745:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFILTER.g:2745:4: (kw= '-' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==54) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalFILTER.g:2746:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
                    // InternalFILTER.g:2761:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleTMTCIFFilterConstantType"
    // InternalFILTER.g:2772:1: ruleTMTCIFFilterConstantType returns [Enumerator current=null] : ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleTMTCIFFilterConstantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFILTER.g:2778:2: ( ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) )
            // InternalFILTER.g:2779:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalFILTER.g:2779:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt31=1;
                }
                break;
            case 56:
                {
                alt31=2;
                }
                break;
            case 57:
                {
                alt31=3;
                }
                break;
            case 58:
                {
                alt31=4;
                }
                break;
            case 59:
                {
                alt31=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalFILTER.g:2780:3: (enumLiteral_0= 'decimal' )
                    {
                    // InternalFILTER.g:2780:3: (enumLiteral_0= 'decimal' )
                    // InternalFILTER.g:2781:4: enumLiteral_0= 'decimal'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2788:3: (enumLiteral_1= 'hex' )
                    {
                    // InternalFILTER.g:2788:3: (enumLiteral_1= 'hex' )
                    // InternalFILTER.g:2789:4: enumLiteral_1= 'hex'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:2796:3: (enumLiteral_2= 'binary' )
                    {
                    // InternalFILTER.g:2796:3: (enumLiteral_2= 'binary' )
                    // InternalFILTER.g:2797:4: enumLiteral_2= 'binary'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:2804:3: (enumLiteral_3= 'char' )
                    {
                    // InternalFILTER.g:2804:3: (enumLiteral_3= 'char' )
                    // InternalFILTER.g:2805:4: enumLiteral_3= 'char'
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:2812:3: (enumLiteral_4= 'string' )
                    {
                    // InternalFILTER.g:2812:3: (enumLiteral_4= 'string' )
                    // InternalFILTER.g:2813:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleTMTCIFFilterConstantType"


    // $ANTLR start "ruleTMTCIFFilterOPType"
    // InternalFILTER.g:2823:1: ruleTMTCIFFilterOPType returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) ;
    public final Enumerator ruleTMTCIFFilterOPType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFILTER.g:2829:2: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) )
            // InternalFILTER.g:2830:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            {
            // InternalFILTER.g:2830:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt32=1;
                }
                break;
            case 61:
                {
                alt32=2;
                }
                break;
            case 62:
                {
                alt32=3;
                }
                break;
            case 63:
                {
                alt32=4;
                }
                break;
            case 64:
                {
                alt32=5;
                }
                break;
            case 65:
                {
                alt32=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalFILTER.g:2831:3: (enumLiteral_0= 'equal' )
                    {
                    // InternalFILTER.g:2831:3: (enumLiteral_0= 'equal' )
                    // InternalFILTER.g:2832:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2839:3: (enumLiteral_1= 'different' )
                    {
                    // InternalFILTER.g:2839:3: (enumLiteral_1= 'different' )
                    // InternalFILTER.g:2840:4: enumLiteral_1= 'different'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:2847:3: (enumLiteral_2= 'bigger_than' )
                    {
                    // InternalFILTER.g:2847:3: (enumLiteral_2= 'bigger_than' )
                    // InternalFILTER.g:2848:4: enumLiteral_2= 'bigger_than'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:2855:3: (enumLiteral_3= 'smaller_than' )
                    {
                    // InternalFILTER.g:2855:3: (enumLiteral_3= 'smaller_than' )
                    // InternalFILTER.g:2856:4: enumLiteral_3= 'smaller_than'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:2863:3: (enumLiteral_4= 'bigger_or_equal' )
                    {
                    // InternalFILTER.g:2863:3: (enumLiteral_4= 'bigger_or_equal' )
                    // InternalFILTER.g:2864:4: enumLiteral_4= 'bigger_or_equal'
                    {
                    enumLiteral_4=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFILTER.g:2871:3: (enumLiteral_5= 'smaller_or_equal' )
                    {
                    // InternalFILTER.g:2871:3: (enumLiteral_5= 'smaller_or_equal' )
                    // InternalFILTER.g:2872:4: enumLiteral_5= 'smaller_or_equal'
                    {
                    enumLiteral_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleTMTCIFFilterOPType"


    // $ANTLR start "ruleTMTCIFFilterSelectType"
    // InternalFILTER.g:2882:1: ruleTMTCIFFilterSelectType returns [Enumerator current=null] : ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) ;
    public final Enumerator ruleTMTCIFFilterSelectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2888:2: ( ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) )
            // InternalFILTER.g:2889:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            {
            // InternalFILTER.g:2889:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 41:
                {
                alt33=2;
                }
                break;
            case 67:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalFILTER.g:2890:3: (enumLiteral_0= 'data' )
                    {
                    // InternalFILTER.g:2890:3: (enumLiteral_0= 'data' )
                    // InternalFILTER.g:2891:4: enumLiteral_0= 'data'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2898:3: (enumLiteral_1= 'size' )
                    {
                    // InternalFILTER.g:2898:3: (enumLiteral_1= 'size' )
                    // InternalFILTER.g:2899:4: enumLiteral_1= 'size'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:2906:3: (enumLiteral_2= 'crc' )
                    {
                    // InternalFILTER.g:2906:3: (enumLiteral_2= 'crc' )
                    // InternalFILTER.g:2907:4: enumLiteral_2= 'crc'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleTMTCIFFilterSelectType"

    // $ANTLR start synpred3_InternalFILTER
    public final void synpred3_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTER.g:285:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTER.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:286:122: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTER.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTER.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTER", "true");
        }
        // InternalFILTER.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTER.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTER.g:300:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred3_InternalFILTER

    // $ANTLR start synpred8_InternalFILTER
    public final void synpred8_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTER.g:327:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTER.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTER.g:328:122: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTER.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTER.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTER.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTER", "true");
        }
        // InternalFILTER.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
        // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTER.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFILTER.g:341:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
        // InternalFILTER.g:343:12: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:373:9: ( ( ruleVersionedQualifiedName ) )
        // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
        {
        // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
        // InternalFILTER.g:375:11: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {

          											/* */
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalFILTER.g:396:9: ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
        int cnt34=0;
        loop34:
        do {
            int alt34=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt34=1;
                }
                break;
            case 27:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            case 32:
                {
                alt34=4;
                }
                break;

            }

            switch (alt34) {
        	case 1 :
        	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
        	    {
        	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
        	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
        	    {
        	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
        	    // InternalFILTER.g:399:12: lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
        	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
        	    // InternalFILTER.g:419:12: lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTER.g:439:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
        	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
        	    {
        	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
        	    // InternalFILTER.g:459:12: lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt34 >= 1 ) break loop34;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(34, input);
                    throw eee;
            }
            cnt34++;
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFILTER

    // $ANTLR start synpred10_InternalFILTER
    public final void synpred10_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTER.g:583:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTER.g:584:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:584:122: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTER.g:585:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:588:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTER.g:588:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTER", "true");
        }
        // InternalFILTER.g:588:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTER.g:588:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:596:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTER.g:598:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred10_InternalFILTER

    // $ANTLR start synpred15_InternalFILTER
    public final void synpred15_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTER.g:625:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTER.g:626:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTER.g:626:122: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTER.g:627:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTER.g:630:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTER.g:630:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTER", "true");
        }
        // InternalFILTER.g:630:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+ )
        // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTER.g:631:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFILTER.g:639:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
        // InternalFILTER.g:641:12: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:671:9: ( ( ruleVersionedQualifiedName ) )
        // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
        {
        // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
        // InternalFILTER.g:673:11: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {

          											/* */
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalFILTER.g:694:9: ( ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) ) )+
        int cnt35=0;
        loop35:
        do {
            int alt35=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt35=1;
                }
                break;
            case 27:
                {
                alt35=2;
                }
                break;
            case 29:
                {
                alt35=3;
                }
                break;
            case 32:
                {
                alt35=4;
                }
                break;

            }

            switch (alt35) {
        	case 1 :
        	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
        	    {
        	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar ) )
        	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
        	    {
        	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar )
        	    // InternalFILTER.g:697:12: lv_BoolVar_16_0= ruleTMTCIFFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVar_16_0=ruleTMTCIFFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem ) )
        	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem )
        	    // InternalFILTER.g:717:12: lv_BoolVarFromArrayItem_17_0= ruleTMTCIFFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromArrayItem_17_0=ruleTMTCIFFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTER.g:737:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleTMTCIFFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC ) )
        	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
        	    {
        	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC )
        	    // InternalFILTER.g:757:12: lv_BoolVarFDIC_19_0= ruleTMTCIFFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFDIC_19_0=ruleTMTCIFFilterBoolVarFDIC();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt35 >= 1 ) break loop35;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(35, input);
                    throw eee;
            }
            cnt35++;
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalFILTER

    // Delegated rules

    public final boolean synpred8_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFILTER_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000209000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000060000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000128400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400128460000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000060000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800128460000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000100000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00400000000000C0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000044800000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000100000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000032000100000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000022000100000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000302000100000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000202000100000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000100000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000128400002L});
    }


}