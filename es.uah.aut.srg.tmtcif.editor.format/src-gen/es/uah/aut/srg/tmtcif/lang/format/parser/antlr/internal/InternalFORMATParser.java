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
public class InternalFORMATParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'TMTCIFFormatFormat'", "'{'", "'uri'", "'version'", "'protocol'", "'type'", "'}'", "'TMTCIFFormatCSField'", "'fid'", "'pfid'", "'name'", "'description'", "'byteOrder'", "'firstBit'", "'TMTCIFFormatCSFormulaField'", "'TMTCIFFormatVSField'", "'TMTCIFFormatVRFieldSize'", "'TMTCIFFormatFDICField'", "'checkType'", "'TMTCIFFormatAField'", "'TMTCIFFormatAIField'", "'TMTCIFFormatSize'", "'bytes'", "'bits'", "'TMTCIFFormatGlobalOffset'", "'TMTCIFFormatFormula'", "'slope'", "'intercept'", "'TMTCIFFormatConstSize'", "'TMTCIFFormatMaxSize'", "'TMTCIFFormatVariableSize'", "'fidRef'", "'unit'", "'power'", "'TMTCIFFormatFloatingOffset'", "'TMTCIFFormatSortedFieldsToCheck'", "'TMTCIFFormatFieldToCheck'", "'TMTCIFFormatArrayDimension'", "'maxItems'", "'TMTCIFFormatLocalOffset'", "'TMTCIFFormatArrayRef'", "'.'", "'-'", "'TM'", "'TC'", "'structured'", "'uint'", "'flag'", "'enumerated'", "'bit_vector'", "'byte_vector'", "'float'", "'deduced'", "'big_endian'", "'little_endian'", "'na'", "'MSB'", "'LSB'", "'halfword'", "'string10'", "'string17'", "'string69'", "'2bits'", "'2bits_with_0'", "'crc16'", "'checksum16'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
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


        public InternalFORMATParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFORMATParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFORMATParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFORMAT.g"; }



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




    // $ANTLR start "entryRuleTMTCIFModelFile"
    // InternalFORMAT.g:79:1: entryRuleTMTCIFModelFile returns [EObject current=null] : iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF ;
    public final EObject entryRuleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFile = null;


        try {
            // InternalFORMAT.g:79:56: (iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF )
            // InternalFORMAT.g:80:2: iv_ruleTMTCIFModelFile= ruleTMTCIFModelFile EOF
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
    // InternalFORMAT.g:86:1: ruleTMTCIFModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFormatFormat ) ) ) ;
    public final EObject ruleTMTCIFModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:92:2: ( ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFormatFormat ) ) ) )
            // InternalFORMAT.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFormatFormat ) ) )
            {
            // InternalFORMAT.g:93:2: ( ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFormatFormat ) ) )
            // InternalFORMAT.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )* ( (lv_element_1_0= ruleTMTCIFFormatFormat ) )
            {
            // InternalFORMAT.g:94:3: ( (lv_imports_0_0= ruleTMTCIFModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFORMAT.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    {
            	    // InternalFORMAT.g:95:4: (lv_imports_0_0= ruleTMTCIFModelFileImport )
            	    // InternalFORMAT.g:96:5: lv_imports_0_0= ruleTMTCIFModelFileImport
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
            	      						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFORMAT.g:113:3: ( (lv_element_1_0= ruleTMTCIFFormatFormat ) )
            // InternalFORMAT.g:114:4: (lv_element_1_0= ruleTMTCIFFormatFormat )
            {
            // InternalFORMAT.g:114:4: (lv_element_1_0= ruleTMTCIFFormatFormat )
            // InternalFORMAT.g:115:5: lv_element_1_0= ruleTMTCIFFormatFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFormatFormatParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleTMTCIFFormatFormat();

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
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormat");
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
    // InternalFORMAT.g:136:1: entryRuleTMTCIFModelFileImport returns [EObject current=null] : iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF ;
    public final EObject entryRuleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFModelFileImport = null;


        try {
            // InternalFORMAT.g:136:62: (iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF )
            // InternalFORMAT.g:137:2: iv_ruleTMTCIFModelFileImport= ruleTMTCIFModelFileImport EOF
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
    // InternalFORMAT.g:143:1: ruleTMTCIFModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleTMTCIFModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFORMAT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalFORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalFORMAT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalFORMAT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFORMAT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalFORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalFORMAT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalFORMAT.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleTMTCIFFormatFormat"
    // InternalFORMAT.g:185:1: entryRuleTMTCIFFormatFormat returns [EObject current=null] : iv_ruleTMTCIFFormatFormat= ruleTMTCIFFormatFormat EOF ;
    public final EObject entryRuleTMTCIFFormatFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatFormat = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFORMAT.g:189:2: (iv_ruleTMTCIFFormatFormat= ruleTMTCIFFormatFormat EOF )
            // InternalFORMAT.g:190:2: iv_ruleTMTCIFFormatFormat= ruleTMTCIFFormatFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatFormat=ruleTMTCIFFormatFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatFormat; 
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
    // $ANTLR end "entryRuleTMTCIFFormatFormat"


    // $ANTLR start "ruleTMTCIFFormatFormat"
    // InternalFORMAT.g:199:1: ruleTMTCIFFormatFormat returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) ;
    public final EObject ruleTMTCIFFormatFormat() throws RecognitionException {
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
        Token lv_protocol_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        Enumerator lv_type_18_0 = null;

        EObject lv_CSField_20_0 = null;

        EObject lv_CSFormulaField_21_0 = null;

        EObject lv_VSField_22_0 = null;

        EObject lv_FDICField_23_0 = null;

        EObject lv_VRFieldSize_24_0 = null;

        EObject lv_AField_25_0 = null;

        EObject lv_AIField_26_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFORMAT.g:208:2: ( (otherlv_0= 'TMTCIFFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' ) )
            // InternalFORMAT.g:209:2: (otherlv_0= 'TMTCIFFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalFORMAT.g:209:2: (otherlv_0= 'TMTCIFFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';' )
            // InternalFORMAT.g:210:3: otherlv_0= 'TMTCIFFormatFormat' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFormatAccess().getTMTCIFFormatFormatKeyword_0());
              		
            }
            // InternalFORMAT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFORMAT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalFORMAT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTMTCIFFormatFormatAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatFormatRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFormatAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFORMAT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalFORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalFORMAT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?) )
            // InternalFORMAT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());
            // InternalFORMAT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?)
            // InternalFORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalFORMAT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFORMAT.g:244:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0);
            	    // InternalFORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getTMTCIFFormatFormatAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.tmtcif.lang.format.FORMAT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalFORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFORMAT.g:286:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalFORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1);
            	    // InternalFORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalFORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getTMTCIFFormatFormatAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalFORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalFORMAT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.tmtcif.lang.format.FORMAT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
            	    // InternalFORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalFORMAT.g:328:115: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            	    // InternalFORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2);
            	    // InternalFORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            	    // InternalFORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
            	    // InternalFORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getTMTCIFFormatFormatAccess().getProtocolKeyword_3_2_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_2_1());
            	      								
            	    }
            	    // InternalFORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
            	    // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    {
            	    // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
            	    // InternalFORMAT.g:342:11: lv_protocol_14_0= RULE_ID
            	    {
            	    lv_protocol_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_protocol_14_0, grammarAccess.getTMTCIFFormatFormatAccess().getProtocolIDTerminalRuleCall_3_2_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getTMTCIFFormatFormatRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"protocol",
            	      												lv_protocol_14_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) )
            	    {
            	    // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) )
            	    // InternalFORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalFORMAT.g:369:115: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) )
            	    // InternalFORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3);
            	    // InternalFORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) )
            	    // InternalFORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "true");
            	    }
            	    // InternalFORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* )
            	    // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )*
            	    {
            	    // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' )
            	    // InternalFORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_16, grammarAccess.getTMTCIFFormatFormatAccess().getTypeKeyword_3_3_0_0());
            	      									
            	    }
            	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatFormatAccess().getColonEqualsSignKeyword_3_3_0_1());
            	      									
            	    }
            	    // InternalFORMAT.g:382:10: ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) )
            	    // InternalFORMAT.g:383:11: (lv_type_18_0= ruleTMTCIFFormatFormatType )
            	    {
            	    // InternalFORMAT.g:383:11: (lv_type_18_0= ruleTMTCIFFormatFormatType )
            	    // InternalFORMAT.g:384:12: lv_type_18_0= ruleTMTCIFFormatFormatType
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_type_18_0=ruleTMTCIFFormatFormatType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	      												}
            	      												set(
            	      													current,
            	      													"type",
            	      													lv_type_18_0,
            	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormatType");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_3_3_0_3());
            	      									
            	    }

            	    }

            	    // InternalFORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )*
            	    loop2:
            	    do {
            	        int alt2=8;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            alt2=1;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt2=2;
            	            }
            	            break;
            	        case 30:
            	            {
            	            alt2=3;
            	            }
            	            break;
            	        case 32:
            	            {
            	            alt2=4;
            	            }
            	            break;
            	        case 31:
            	            {
            	            alt2=5;
            	            }
            	            break;
            	        case 34:
            	            {
            	            alt2=6;
            	            }
            	            break;
            	        case 35:
            	            {
            	            alt2=7;
            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) )
            	    	    {
            	    	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) )
            	    	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleTMTCIFFormatCSField )
            	    	    {
            	    	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleTMTCIFFormatCSField )
            	    	    // InternalFORMAT.g:409:12: lv_CSField_20_0= ruleTMTCIFFormatCSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSField_20_0=ruleTMTCIFFormatCSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSField",
            	    	      													lv_CSField_20_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) )
            	    	    {
            	    	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) )
            	    	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField )
            	    	    {
            	    	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField )
            	    	    // InternalFORMAT.g:429:12: lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_CSFormulaField_21_0=ruleTMTCIFFormatCSFormulaField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"CSFormulaField",
            	    	      													lv_CSFormulaField_21_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCSFormulaField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) )
            	    	    {
            	    	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) )
            	    	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleTMTCIFFormatVSField )
            	    	    {
            	    	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleTMTCIFFormatVSField )
            	    	    // InternalFORMAT.g:449:12: lv_VSField_22_0= ruleTMTCIFFormatVSField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VSField_22_0=ruleTMTCIFFormatVSField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VSField",
            	    	      													lv_VSField_22_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVSField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) )
            	    	    {
            	    	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) )
            	    	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleTMTCIFFormatFDICField )
            	    	    {
            	    	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleTMTCIFFormatFDICField )
            	    	    // InternalFORMAT.g:469:12: lv_FDICField_23_0= ruleTMTCIFFormatFDICField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_FDICField_23_0=ruleTMTCIFFormatFDICField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"FDICField",
            	    	      													lv_FDICField_23_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFDICField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) )
            	    	    {
            	    	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) )
            	    	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize )
            	    	    {
            	    	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize )
            	    	    // InternalFORMAT.g:489:12: lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_VRFieldSize_24_0=ruleTMTCIFFormatVRFieldSize();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"VRFieldSize",
            	    	      													lv_VRFieldSize_24_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVRFieldSize");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleTMTCIFFormatAField ) )
            	    	    {
            	    	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleTMTCIFFormatAField ) )
            	    	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleTMTCIFFormatAField )
            	    	    {
            	    	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleTMTCIFFormatAField )
            	    	    // InternalFORMAT.g:509:12: lv_AField_25_0= ruleTMTCIFFormatAField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AField_25_0=ruleTMTCIFFormatAField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AField",
            	    	      													lv_AField_25_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) )
            	    	    {
            	    	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) )
            	    	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleTMTCIFFormatAIField )
            	    	    {
            	    	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleTMTCIFFormatAIField )
            	    	    // InternalFORMAT.g:529:12: lv_AIField_26_0= ruleTMTCIFFormatAIField
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_AIField_26_0=ruleTMTCIFFormatAIField();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getTMTCIFFormatFormatRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"AIField",
            	    	      													lv_AIField_26_0,
            	    	      													"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatAIField");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleTMTCIFFormatFormat", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3());

            }

            otherlv_27=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatFormatAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getTMTCIFFormatFormatAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleTMTCIFFormatFormat"


    // $ANTLR start "entryRuleTMTCIFFormatCSField"
    // InternalFORMAT.g:576:1: entryRuleTMTCIFFormatCSField returns [EObject current=null] : iv_ruleTMTCIFFormatCSField= ruleTMTCIFFormatCSField EOF ;
    public final EObject entryRuleTMTCIFFormatCSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatCSField = null;


        try {
            // InternalFORMAT.g:576:60: (iv_ruleTMTCIFFormatCSField= ruleTMTCIFFormatCSField EOF )
            // InternalFORMAT.g:577:2: iv_ruleTMTCIFFormatCSField= ruleTMTCIFFormatCSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatCSField=ruleTMTCIFFormatCSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatCSField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatCSField"


    // $ANTLR start "ruleTMTCIFFormatCSField"
    // InternalFORMAT.g:583:1: ruleTMTCIFFormatCSField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) ;
    public final EObject ruleTMTCIFFormatCSField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_globalOffset_31_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:589:2: ( (otherlv_0= 'TMTCIFFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' ) )
            // InternalFORMAT.g:590:2: (otherlv_0= 'TMTCIFFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            {
            // InternalFORMAT.g:590:2: (otherlv_0= 'TMTCIFFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';' )
            // InternalFORMAT.g:591:3: otherlv_0= 'TMTCIFFormatCSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_32= '}' otherlv_33= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getTMTCIFFormatCSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatCSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatCSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:607:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:608:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:609:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:638:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:639:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:640:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatCSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:669:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:670:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:671:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:691:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFORMAT.g:692:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:700:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:701:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:702:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatCSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:731:3: ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) )
            // InternalFORMAT.g:732:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            {
            // InternalFORMAT.g:732:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            // InternalFORMAT.g:733:5: lv_type_20_0= ruleTMTCIFFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleTMTCIFFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:762:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:763:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:763:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:764:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatCSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:793:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:794:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:794:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:795:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:816:3: ( (lv_size_30_0= ruleTMTCIFFormatSize ) )
            // InternalFORMAT.g:817:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            {
            // InternalFORMAT.g:817:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            // InternalFORMAT.g:818:5: lv_size_30_0= ruleTMTCIFFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_30_0=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:835:3: ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) )
            // InternalFORMAT.g:836:4: (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset )
            {
            // InternalFORMAT.g:836:4: (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset )
            // InternalFORMAT.g:837:5: lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_31_0=ruleTMTCIFFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_32=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getTMTCIFFormatCSFieldAccess().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatCSFieldAccess().getSemicolonKeyword_30());
              		
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
    // $ANTLR end "ruleTMTCIFFormatCSField"


    // $ANTLR start "entryRuleTMTCIFFormatCSFormulaField"
    // InternalFORMAT.g:866:1: entryRuleTMTCIFFormatCSFormulaField returns [EObject current=null] : iv_ruleTMTCIFFormatCSFormulaField= ruleTMTCIFFormatCSFormulaField EOF ;
    public final EObject entryRuleTMTCIFFormatCSFormulaField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatCSFormulaField = null;


        try {
            // InternalFORMAT.g:866:67: (iv_ruleTMTCIFFormatCSFormulaField= ruleTMTCIFFormatCSFormulaField EOF )
            // InternalFORMAT.g:867:2: iv_ruleTMTCIFFormatCSFormulaField= ruleTMTCIFFormatCSFormulaField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatCSFormulaField=ruleTMTCIFFormatCSFormulaField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatCSFormulaField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatCSFormulaField"


    // $ANTLR start "ruleTMTCIFFormatCSFormulaField"
    // InternalFORMAT.g:873:1: ruleTMTCIFFormatCSFormulaField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleTMTCIFFormatCSFormulaField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_globalOffset_31_0 = null;

        EObject lv_formula_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:879:2: ( (otherlv_0= 'TMTCIFFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:880:2: (otherlv_0= 'TMTCIFFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:880:2: (otherlv_0= 'TMTCIFFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:881:3: otherlv_0= 'TMTCIFFormatCSFormulaField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) ) ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTMTCIFFormatCSFormulaFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:897:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:898:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:899:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:928:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:929:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:930:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:959:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:960:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:961:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:981:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFORMAT.g:982:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:990:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:991:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:992:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1021:3: ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) )
            // InternalFORMAT.g:1022:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            {
            // InternalFORMAT.g:1022:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            // InternalFORMAT.g:1023:5: lv_type_20_0= ruleTMTCIFFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleTMTCIFFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1052:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:1053:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1053:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:1054:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1083:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1084:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1084:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:1085:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1106:3: ( (lv_size_30_0= ruleTMTCIFFormatSize ) )
            // InternalFORMAT.g:1107:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            {
            // InternalFORMAT.g:1107:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            // InternalFORMAT.g:1108:5: lv_size_30_0= ruleTMTCIFFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_30_0=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1125:3: ( (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset ) )
            // InternalFORMAT.g:1126:4: (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset )
            {
            // InternalFORMAT.g:1126:4: (lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset )
            // InternalFORMAT.g:1127:5: lv_globalOffset_31_0= ruleTMTCIFFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_globalOffset_31_0=ruleTMTCIFFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1144:3: ( (lv_formula_32_0= ruleTMTCIFFormatFormula ) )
            // InternalFORMAT.g:1145:4: (lv_formula_32_0= ruleTMTCIFFormatFormula )
            {
            // InternalFORMAT.g:1145:4: (lv_formula_32_0= ruleTMTCIFFormatFormula )
            // InternalFORMAT.g:1146:5: lv_formula_32_0= ruleTMTCIFFormatFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaTMTCIFFormatFormulaParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_formula_32_0=ruleTMTCIFFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatCSFormulaFieldRule());
              					}
              					set(
              						current,
              						"formula",
              						lv_formula_32_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFormula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleTMTCIFFormatCSFormulaField"


    // $ANTLR start "entryRuleTMTCIFFormatVSField"
    // InternalFORMAT.g:1175:1: entryRuleTMTCIFFormatVSField returns [EObject current=null] : iv_ruleTMTCIFFormatVSField= ruleTMTCIFFormatVSField EOF ;
    public final EObject entryRuleTMTCIFFormatVSField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatVSField = null;


        try {
            // InternalFORMAT.g:1175:60: (iv_ruleTMTCIFFormatVSField= ruleTMTCIFFormatVSField EOF )
            // InternalFORMAT.g:1176:2: iv_ruleTMTCIFFormatVSField= ruleTMTCIFFormatVSField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatVSField=ruleTMTCIFFormatVSField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatVSField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatVSField"


    // $ANTLR start "ruleTMTCIFFormatVSField"
    // InternalFORMAT.g:1182:1: ruleTMTCIFFormatVSField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) ) ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleTMTCIFFormatVSField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_constSize_30_0 = null;

        EObject lv_variableSize_31_0 = null;

        EObject lv_maxSize_32_0 = null;

        EObject lv_globalOffset_33_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1188:2: ( (otherlv_0= 'TMTCIFFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) ) ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' ) )
            // InternalFORMAT.g:1189:2: (otherlv_0= 'TMTCIFFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) ) ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalFORMAT.g:1189:2: (otherlv_0= 'TMTCIFFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) ) ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';' )
            // InternalFORMAT.g:1190:3: otherlv_0= 'TMTCIFFormatVSField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) ) ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) ) ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) ) ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getTMTCIFFormatVSFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVSFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVSFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1206:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1207:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1208:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1237:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1238:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1239:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVSFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1268:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1269:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1270:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:1290:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFORMAT.g:1291:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:1299:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:1300:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:1301:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatVSFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1330:3: ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) )
            // InternalFORMAT.g:1331:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            {
            // InternalFORMAT.g:1331:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            // InternalFORMAT.g:1332:5: lv_type_20_0= ruleTMTCIFFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleTMTCIFFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1361:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:1362:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1362:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:1363:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatVSFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1392:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1393:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1393:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:1394:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1415:3: ( (lv_constSize_30_0= ruleTMTCIFFormatConstSize ) )
            // InternalFORMAT.g:1416:4: (lv_constSize_30_0= ruleTMTCIFFormatConstSize )
            {
            // InternalFORMAT.g:1416:4: (lv_constSize_30_0= ruleTMTCIFFormatConstSize )
            // InternalFORMAT.g:1417:5: lv_constSize_30_0= ruleTMTCIFFormatConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeTMTCIFFormatConstSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_constSize_30_0=ruleTMTCIFFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"constSize",
              						lv_constSize_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatConstSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1434:3: ( (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize ) )
            // InternalFORMAT.g:1435:4: (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize )
            {
            // InternalFORMAT.g:1435:4: (lv_variableSize_31_0= ruleTMTCIFFormatVariableSize )
            // InternalFORMAT.g:1436:5: lv_variableSize_31_0= ruleTMTCIFFormatVariableSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeTMTCIFFormatVariableSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_variableSize_31_0=ruleTMTCIFFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"variableSize",
              						lv_variableSize_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatVariableSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1453:3: ( (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize ) )
            // InternalFORMAT.g:1454:4: (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize )
            {
            // InternalFORMAT.g:1454:4: (lv_maxSize_32_0= ruleTMTCIFFormatMaxSize )
            // InternalFORMAT.g:1455:5: lv_maxSize_32_0= ruleTMTCIFFormatMaxSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeTMTCIFFormatMaxSizeParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_maxSize_32_0=ruleTMTCIFFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"maxSize",
              						lv_maxSize_32_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatMaxSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1472:3: ( (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset ) )
            // InternalFORMAT.g:1473:4: (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset )
            {
            // InternalFORMAT.g:1473:4: (lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset )
            // InternalFORMAT.g:1474:5: lv_globalOffset_33_0= ruleTMTCIFFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_30_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_33_0=ruleTMTCIFFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVSFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_33_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_34=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatVSFieldAccess().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getTMTCIFFormatVSFieldAccess().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleTMTCIFFormatVSField"


    // $ANTLR start "entryRuleTMTCIFFormatVRFieldSize"
    // InternalFORMAT.g:1503:1: entryRuleTMTCIFFormatVRFieldSize returns [EObject current=null] : iv_ruleTMTCIFFormatVRFieldSize= ruleTMTCIFFormatVRFieldSize EOF ;
    public final EObject entryRuleTMTCIFFormatVRFieldSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatVRFieldSize = null;


        try {
            // InternalFORMAT.g:1503:64: (iv_ruleTMTCIFFormatVRFieldSize= ruleTMTCIFFormatVRFieldSize EOF )
            // InternalFORMAT.g:1504:2: iv_ruleTMTCIFFormatVRFieldSize= ruleTMTCIFFormatVRFieldSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatVRFieldSize=ruleTMTCIFFormatVRFieldSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatVRFieldSize; 
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
    // $ANTLR end "entryRuleTMTCIFFormatVRFieldSize"


    // $ANTLR start "ruleTMTCIFFormatVRFieldSize"
    // InternalFORMAT.g:1510:1: ruleTMTCIFFormatVRFieldSize returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleTMTCIFFormatVRFieldSize() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1516:2: ( (otherlv_0= 'TMTCIFFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalFORMAT.g:1517:2: (otherlv_0= 'TMTCIFFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalFORMAT.g:1517:2: (otherlv_0= 'TMTCIFFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalFORMAT.g:1518:3: otherlv_0= 'TMTCIFFormatVRFieldSize' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getTMTCIFFormatVRFieldSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1534:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1535:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1536:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1565:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1566:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1567:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1596:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1597:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1598:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatVRFieldSizeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleTMTCIFFormatVRFieldSize"


    // $ANTLR start "entryRuleTMTCIFFormatFDICField"
    // InternalFORMAT.g:1630:1: entryRuleTMTCIFFormatFDICField returns [EObject current=null] : iv_ruleTMTCIFFormatFDICField= ruleTMTCIFFormatFDICField EOF ;
    public final EObject entryRuleTMTCIFFormatFDICField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatFDICField = null;


        try {
            // InternalFORMAT.g:1630:62: (iv_ruleTMTCIFFormatFDICField= ruleTMTCIFFormatFDICField EOF )
            // InternalFORMAT.g:1631:2: iv_ruleTMTCIFFormatFDICField= ruleTMTCIFFormatFDICField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatFDICField=ruleTMTCIFFormatFDICField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatFDICField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatFDICField"


    // $ANTLR start "ruleTMTCIFFormatFDICField"
    // InternalFORMAT.g:1637:1: ruleTMTCIFFormatFDICField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleTMTCIFFormatFDICField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_checkType_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_size_30_0 = null;

        EObject lv_floatingOffset_31_0 = null;

        EObject lv_sortedFieldsToCheck_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1643:2: ( (otherlv_0= 'TMTCIFFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:1644:2: (otherlv_0= 'TMTCIFFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:1644:2: (otherlv_0= 'TMTCIFFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:1645:3: otherlv_0= 'TMTCIFFormatFDICField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'checkType' otherlv_19= ':=' ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_size_30_0= ruleTMTCIFFormatSize ) ) ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) ) ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getTMTCIFFormatFDICFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFDICFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1661:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1662:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1663:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:1692:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1693:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:1694:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:1723:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:1724:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:1725:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:1745:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFORMAT.g:1746:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:1754:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:1755:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:1756:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatFDICFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:1785:3: ( (lv_checkType_20_0= ruleTMTCIFFormatCheckType ) )
            // InternalFORMAT.g:1786:4: (lv_checkType_20_0= ruleTMTCIFFormatCheckType )
            {
            // InternalFORMAT.g:1786:4: (lv_checkType_20_0= ruleTMTCIFFormatCheckType )
            // InternalFORMAT.g:1787:5: lv_checkType_20_0= ruleTMTCIFFormatCheckType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeTMTCIFFormatCheckTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_checkType_20_0=ruleTMTCIFFormatCheckType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"checkType",
              						lv_checkType_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatCheckType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:1816:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:1817:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:1817:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:1818:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatFDICFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:1847:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:1848:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:1848:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:1849:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:1870:3: ( (lv_size_30_0= ruleTMTCIFFormatSize ) )
            // InternalFORMAT.g:1871:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            {
            // InternalFORMAT.g:1871:4: (lv_size_30_0= ruleTMTCIFFormatSize )
            // InternalFORMAT.g:1872:5: lv_size_30_0= ruleTMTCIFFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_size_30_0=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1889:3: ( (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset ) )
            // InternalFORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset )
            {
            // InternalFORMAT.g:1890:4: (lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset )
            // InternalFORMAT.g:1891:5: lv_floatingOffset_31_0= ruleTMTCIFFormatFloatingOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetTMTCIFFormatFloatingOffsetParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_floatingOffset_31_0=ruleTMTCIFFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"floatingOffset",
              						lv_floatingOffset_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFloatingOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:1908:3: ( (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck ) )
            // InternalFORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck )
            {
            // InternalFORMAT.g:1909:4: (lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck )
            // InternalFORMAT.g:1910:5: lv_sortedFieldsToCheck_32_0= ruleTMTCIFFormatSortedFieldsToCheck
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckTMTCIFFormatSortedFieldsToCheckParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_sortedFieldsToCheck_32_0=ruleTMTCIFFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFDICFieldRule());
              					}
              					set(
              						current,
              						"sortedFieldsToCheck",
              						lv_sortedFieldsToCheck_32_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSortedFieldsToCheck");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatFDICFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatFDICFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleTMTCIFFormatFDICField"


    // $ANTLR start "entryRuleTMTCIFFormatAField"
    // InternalFORMAT.g:1939:1: entryRuleTMTCIFFormatAField returns [EObject current=null] : iv_ruleTMTCIFFormatAField= ruleTMTCIFFormatAField EOF ;
    public final EObject entryRuleTMTCIFFormatAField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatAField = null;


        try {
            // InternalFORMAT.g:1939:59: (iv_ruleTMTCIFFormatAField= ruleTMTCIFFormatAField EOF )
            // InternalFORMAT.g:1940:2: iv_ruleTMTCIFFormatAField= ruleTMTCIFFormatAField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatAFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatAField=ruleTMTCIFFormatAField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatAField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatAField"


    // $ANTLR start "ruleTMTCIFFormatAField"
    // InternalFORMAT.g:1946:1: ruleTMTCIFFormatAField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleTMTCIFFormatAField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_arrayDimension_30_0 = null;

        EObject lv_size_31_0 = null;

        EObject lv_globalOffset_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:1952:2: ( (otherlv_0= 'TMTCIFFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:1953:2: (otherlv_0= 'TMTCIFFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:1953:2: (otherlv_0= 'TMTCIFFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:1954:3: otherlv_0= 'TMTCIFFormatAField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatAFieldAccess().getTMTCIFFormatAFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatAFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatAFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:1970:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:1971:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:1972:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatAFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2001:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2002:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:2003:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatAFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:2032:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:2033:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:2034:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatAFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:2054:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFORMAT.g:2055:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:2063:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:2064:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:2065:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatAFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatAFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:2094:3: ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) )
            // InternalFORMAT.g:2095:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            {
            // InternalFORMAT.g:2095:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            // InternalFORMAT.g:2096:5: lv_type_20_0= ruleTMTCIFFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleTMTCIFFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:2125:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:2126:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:2126:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:2127:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatAFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:2156:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:2157:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:2157:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:2158:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:2179:3: ( (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension ) )
            // InternalFORMAT.g:2180:4: (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension )
            {
            // InternalFORMAT.g:2180:4: (lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension )
            // InternalFORMAT.g:2181:5: lv_arrayDimension_30_0= ruleTMTCIFFormatArrayDimension
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionTMTCIFFormatArrayDimensionParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_arrayDimension_30_0=ruleTMTCIFFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"arrayDimension",
              						lv_arrayDimension_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayDimension");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2198:3: ( (lv_size_31_0= ruleTMTCIFFormatSize ) )
            // InternalFORMAT.g:2199:4: (lv_size_31_0= ruleTMTCIFFormatSize )
            {
            // InternalFORMAT.g:2199:4: (lv_size_31_0= ruleTMTCIFFormatSize )
            // InternalFORMAT.g:2200:5: lv_size_31_0= ruleTMTCIFFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_size_31_0=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2217:3: ( (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset ) )
            // InternalFORMAT.g:2218:4: (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset )
            {
            // InternalFORMAT.g:2218:4: (lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset )
            // InternalFORMAT.g:2219:5: lv_globalOffset_32_0= ruleTMTCIFFormatGlobalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetTMTCIFFormatGlobalOffsetParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_globalOffset_32_0=ruleTMTCIFFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAFieldRule());
              					}
              					set(
              						current,
              						"globalOffset",
              						lv_globalOffset_32_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatGlobalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatAFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatAFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleTMTCIFFormatAField"


    // $ANTLR start "entryRuleTMTCIFFormatAIField"
    // InternalFORMAT.g:2248:1: entryRuleTMTCIFFormatAIField returns [EObject current=null] : iv_ruleTMTCIFFormatAIField= ruleTMTCIFFormatAIField EOF ;
    public final EObject entryRuleTMTCIFFormatAIField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatAIField = null;


        try {
            // InternalFORMAT.g:2248:60: (iv_ruleTMTCIFFormatAIField= ruleTMTCIFFormatAIField EOF )
            // InternalFORMAT.g:2249:2: iv_ruleTMTCIFFormatAIField= ruleTMTCIFFormatAIField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatAIField=ruleTMTCIFFormatAIField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatAIField; 
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
    // $ANTLR end "entryRuleTMTCIFFormatAIField"


    // $ANTLR start "ruleTMTCIFFormatAIField"
    // InternalFORMAT.g:2255:1: ruleTMTCIFFormatAIField returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) ;
    public final EObject ruleTMTCIFFormatAIField() throws RecognitionException {
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
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_fid_4_0 = null;

        AntlrDatatypeRuleToken lv_pfid_8_0 = null;

        Enumerator lv_type_20_0 = null;

        Enumerator lv_byteOrder_24_0 = null;

        Enumerator lv_firstBit_28_0 = null;

        EObject lv_arrayRef_30_0 = null;

        EObject lv_size_31_0 = null;

        EObject lv_localOffset_32_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2261:2: ( (otherlv_0= 'TMTCIFFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' ) )
            // InternalFORMAT.g:2262:2: (otherlv_0= 'TMTCIFFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            {
            // InternalFORMAT.g:2262:2: (otherlv_0= 'TMTCIFFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';' )
            // InternalFORMAT.g:2263:3: otherlv_0= 'TMTCIFFormatAIField' otherlv_1= '{' otherlv_2= 'fid' otherlv_3= ':=' ( (lv_fid_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'pfid' otherlv_7= ':=' ( (lv_pfid_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'name' otherlv_11= ':=' ( (lv_name_12_0= RULE_STRING ) ) otherlv_13= ';' (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )? otherlv_18= 'type' otherlv_19= ':=' ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) ) otherlv_21= ';' otherlv_22= 'byteOrder' otherlv_23= ':=' ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) ) otherlv_25= ';' otherlv_26= 'firstBit' otherlv_27= ':=' ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) ) otherlv_29= ';' ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) ) ( (lv_size_31_0= ruleTMTCIFFormatSize ) ) ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) ) otherlv_33= '}' otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getTMTCIFFormatAIFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatAIFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatAIFieldAccess().getFidKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2279:3: ( (lv_fid_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2280:4: (lv_fid_4_0= ruleINTEGER )
            // InternalFORMAT.g:2281:5: lv_fid_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fid_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"fid",
              						lv_fid_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2310:3: ( (lv_pfid_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2311:4: (lv_pfid_8_0= ruleINTEGER )
            // InternalFORMAT.g:2312:5: lv_pfid_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_pfid_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"pfid",
              						lv_pfid_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatAIFieldAccess().getNameKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFORMAT.g:2341:3: ( (lv_name_12_0= RULE_STRING ) )
            // InternalFORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            {
            // InternalFORMAT.g:2342:4: (lv_name_12_0= RULE_STRING )
            // InternalFORMAT.g:2343:5: lv_name_12_0= RULE_STRING
            {
            lv_name_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_12_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getNameSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFORMAT.g:2363:3: (otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFORMAT.g:2364:4: otherlv_14= 'description' otherlv_15= ':=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalFORMAT.g:2372:4: ( (lv_description_16_0= RULE_STRING ) )
                    // InternalFORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    {
                    // InternalFORMAT.g:2373:5: (lv_description_16_0= RULE_STRING )
                    // InternalFORMAT.g:2374:6: lv_description_16_0= RULE_STRING
                    {
                    lv_description_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_description_16_0, grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionSTRINGTerminalRuleCall_14_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTMTCIFFormatAIFieldRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"description",
                      							lv_description_16_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_16());
              		
            }
            // InternalFORMAT.g:2403:3: ( (lv_type_20_0= ruleTMTCIFFormatFieldType ) )
            // InternalFORMAT.g:2404:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            {
            // InternalFORMAT.g:2404:4: (lv_type_20_0= ruleTMTCIFFormatFieldType )
            // InternalFORMAT.g:2405:5: lv_type_20_0= ruleTMTCIFFormatFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeTMTCIFFormatFieldTypeEnumRuleCall_17_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_20_0=ruleTMTCIFFormatFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_20_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_18());
              		
            }
            otherlv_22=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_20());
              		
            }
            // InternalFORMAT.g:2434:3: ( (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder ) )
            // InternalFORMAT.g:2435:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            {
            // InternalFORMAT.g:2435:4: (lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder )
            // InternalFORMAT.g:2436:5: lv_byteOrder_24_0= ruleTMTCIFFormatFieldByteOrder
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderTMTCIFFormatFieldByteOrderEnumRuleCall_21_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_byteOrder_24_0=ruleTMTCIFFormatFieldByteOrder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"byteOrder",
              						lv_byteOrder_24_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldByteOrder");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_22());
              		
            }
            otherlv_26=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitKeyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getTMTCIFFormatAIFieldAccess().getColonEqualsSignKeyword_24());
              		
            }
            // InternalFORMAT.g:2465:3: ( (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit ) )
            // InternalFORMAT.g:2466:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            {
            // InternalFORMAT.g:2466:4: (lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit )
            // InternalFORMAT.g:2467:5: lv_firstBit_28_0= ruleTMTCIFFormatSFieldFirstBit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitTMTCIFFormatSFieldFirstBitEnumRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstBit_28_0=ruleTMTCIFFormatSFieldFirstBit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"firstBit",
              						lv_firstBit_28_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSFieldFirstBit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_26());
              		
            }
            // InternalFORMAT.g:2488:3: ( (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef ) )
            // InternalFORMAT.g:2489:4: (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef )
            {
            // InternalFORMAT.g:2489:4: (lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef )
            // InternalFORMAT.g:2490:5: lv_arrayRef_30_0= ruleTMTCIFFormatArrayRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefTMTCIFFormatArrayRefParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_arrayRef_30_0=ruleTMTCIFFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"arrayRef",
              						lv_arrayRef_30_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatArrayRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2507:3: ( (lv_size_31_0= ruleTMTCIFFormatSize ) )
            // InternalFORMAT.g:2508:4: (lv_size_31_0= ruleTMTCIFFormatSize )
            {
            // InternalFORMAT.g:2508:4: (lv_size_31_0= ruleTMTCIFFormatSize )
            // InternalFORMAT.g:2509:5: lv_size_31_0= ruleTMTCIFFormatSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeTMTCIFFormatSizeParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_size_31_0=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_31_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFORMAT.g:2526:3: ( (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset ) )
            // InternalFORMAT.g:2527:4: (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset )
            {
            // InternalFORMAT.g:2527:4: (lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset )
            // InternalFORMAT.g:2528:5: lv_localOffset_32_0= ruleTMTCIFFormatLocalOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetTMTCIFFormatLocalOffsetParserRuleCall_29_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_localOffset_32_0=ruleTMTCIFFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatAIFieldRule());
              					}
              					set(
              						current,
              						"localOffset",
              						lv_localOffset_32_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatLocalOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_33=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getTMTCIFFormatAIFieldAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_34=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getTMTCIFFormatAIFieldAccess().getSemicolonKeyword_31());
              		
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
    // $ANTLR end "ruleTMTCIFFormatAIField"


    // $ANTLR start "entryRuleTMTCIFFormatSize"
    // InternalFORMAT.g:2557:1: entryRuleTMTCIFFormatSize returns [EObject current=null] : iv_ruleTMTCIFFormatSize= ruleTMTCIFFormatSize EOF ;
    public final EObject entryRuleTMTCIFFormatSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatSize = null;


        try {
            // InternalFORMAT.g:2557:57: (iv_ruleTMTCIFFormatSize= ruleTMTCIFFormatSize EOF )
            // InternalFORMAT.g:2558:2: iv_ruleTMTCIFFormatSize= ruleTMTCIFFormatSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatSize=ruleTMTCIFFormatSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatSize; 
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
    // $ANTLR end "entryRuleTMTCIFFormatSize"


    // $ANTLR start "ruleTMTCIFFormatSize"
    // InternalFORMAT.g:2564:1: ruleTMTCIFFormatSize returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2570:2: ( (otherlv_0= 'TMTCIFFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2571:2: (otherlv_0= 'TMTCIFFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2571:2: (otherlv_0= 'TMTCIFFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2572:3: otherlv_0= 'TMTCIFFormatSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatSizeAccess().getTMTCIFFormatSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2588:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2589:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2590:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2619:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2620:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2621:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatSize"


    // $ANTLR start "entryRuleTMTCIFFormatGlobalOffset"
    // InternalFORMAT.g:2654:1: entryRuleTMTCIFFormatGlobalOffset returns [EObject current=null] : iv_ruleTMTCIFFormatGlobalOffset= ruleTMTCIFFormatGlobalOffset EOF ;
    public final EObject entryRuleTMTCIFFormatGlobalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatGlobalOffset = null;


        try {
            // InternalFORMAT.g:2654:65: (iv_ruleTMTCIFFormatGlobalOffset= ruleTMTCIFFormatGlobalOffset EOF )
            // InternalFORMAT.g:2655:2: iv_ruleTMTCIFFormatGlobalOffset= ruleTMTCIFFormatGlobalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatGlobalOffset=ruleTMTCIFFormatGlobalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatGlobalOffset; 
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
    // $ANTLR end "entryRuleTMTCIFFormatGlobalOffset"


    // $ANTLR start "ruleTMTCIFFormatGlobalOffset"
    // InternalFORMAT.g:2661:1: ruleTMTCIFFormatGlobalOffset returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatGlobalOffset() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2667:2: ( (otherlv_0= 'TMTCIFFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2668:2: (otherlv_0= 'TMTCIFFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2668:2: (otherlv_0= 'TMTCIFFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2669:3: otherlv_0= 'TMTCIFFormatGlobalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getTMTCIFFormatGlobalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2685:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2686:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2687:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2716:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2717:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2718:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatGlobalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatGlobalOffset"


    // $ANTLR start "entryRuleTMTCIFFormatFormula"
    // InternalFORMAT.g:2751:1: entryRuleTMTCIFFormatFormula returns [EObject current=null] : iv_ruleTMTCIFFormatFormula= ruleTMTCIFFormatFormula EOF ;
    public final EObject entryRuleTMTCIFFormatFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatFormula = null;


        try {
            // InternalFORMAT.g:2751:60: (iv_ruleTMTCIFFormatFormula= ruleTMTCIFFormatFormula EOF )
            // InternalFORMAT.g:2752:2: iv_ruleTMTCIFFormatFormula= ruleTMTCIFFormatFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatFormula=ruleTMTCIFFormatFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatFormula; 
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
    // $ANTLR end "entryRuleTMTCIFFormatFormula"


    // $ANTLR start "ruleTMTCIFFormatFormula"
    // InternalFORMAT.g:2758:1: ruleTMTCIFFormatFormula returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_slope_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_intercept_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalFORMAT.g:2764:2: ( (otherlv_0= 'TMTCIFFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2765:2: (otherlv_0= 'TMTCIFFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2765:2: (otherlv_0= 'TMTCIFFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2766:3: otherlv_0= 'TMTCIFFormatFormula' otherlv_1= '{' otherlv_2= 'slope' otherlv_3= ':=' ( (lv_slope_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'intercept' otherlv_7= ':=' ( (lv_intercept_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFormulaAccess().getTMTCIFFormatFormulaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFormulaAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2782:3: ( (lv_slope_4_0= RULE_STRING ) )
            // InternalFORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            {
            // InternalFORMAT.g:2783:4: (lv_slope_4_0= RULE_STRING )
            // InternalFORMAT.g:2784:5: lv_slope_4_0= RULE_STRING
            {
            lv_slope_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_slope_4_0, grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatFormulaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"slope",
              						lv_slope_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFormulaAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2812:3: ( (lv_intercept_8_0= RULE_STRING ) )
            // InternalFORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            {
            // InternalFORMAT.g:2813:4: (lv_intercept_8_0= RULE_STRING )
            // InternalFORMAT.g:2814:5: lv_intercept_8_0= RULE_STRING
            {
            lv_intercept_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_intercept_8_0, grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFFormatFormulaRule());
              					}
              					setWithLastConsumed(
              						current,
              						"intercept",
              						lv_intercept_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatFormulaAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatFormulaAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatFormula"


    // $ANTLR start "entryRuleTMTCIFFormatConstSize"
    // InternalFORMAT.g:2846:1: entryRuleTMTCIFFormatConstSize returns [EObject current=null] : iv_ruleTMTCIFFormatConstSize= ruleTMTCIFFormatConstSize EOF ;
    public final EObject entryRuleTMTCIFFormatConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatConstSize = null;


        try {
            // InternalFORMAT.g:2846:62: (iv_ruleTMTCIFFormatConstSize= ruleTMTCIFFormatConstSize EOF )
            // InternalFORMAT.g:2847:2: iv_ruleTMTCIFFormatConstSize= ruleTMTCIFFormatConstSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatConstSize=ruleTMTCIFFormatConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatConstSize; 
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
    // $ANTLR end "entryRuleTMTCIFFormatConstSize"


    // $ANTLR start "ruleTMTCIFFormatConstSize"
    // InternalFORMAT.g:2853:1: ruleTMTCIFFormatConstSize returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatConstSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2859:2: ( (otherlv_0= 'TMTCIFFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2860:2: (otherlv_0= 'TMTCIFFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2860:2: (otherlv_0= 'TMTCIFFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2861:3: otherlv_0= 'TMTCIFFormatConstSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatConstSizeAccess().getTMTCIFFormatConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2877:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2878:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2879:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:2908:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2909:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:2910:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatConstSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatConstSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatConstSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatConstSize"


    // $ANTLR start "entryRuleTMTCIFFormatMaxSize"
    // InternalFORMAT.g:2943:1: entryRuleTMTCIFFormatMaxSize returns [EObject current=null] : iv_ruleTMTCIFFormatMaxSize= ruleTMTCIFFormatMaxSize EOF ;
    public final EObject entryRuleTMTCIFFormatMaxSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatMaxSize = null;


        try {
            // InternalFORMAT.g:2943:60: (iv_ruleTMTCIFFormatMaxSize= ruleTMTCIFFormatMaxSize EOF )
            // InternalFORMAT.g:2944:2: iv_ruleTMTCIFFormatMaxSize= ruleTMTCIFFormatMaxSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatMaxSize=ruleTMTCIFFormatMaxSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatMaxSize; 
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
    // $ANTLR end "entryRuleTMTCIFFormatMaxSize"


    // $ANTLR start "ruleTMTCIFFormatMaxSize"
    // InternalFORMAT.g:2950:1: ruleTMTCIFFormatMaxSize returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatMaxSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:2956:2: ( (otherlv_0= 'TMTCIFFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:2957:2: (otherlv_0= 'TMTCIFFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:2957:2: (otherlv_0= 'TMTCIFFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:2958:3: otherlv_0= 'TMTCIFFormatMaxSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatMaxSizeAccess().getTMTCIFFormatMaxSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatMaxSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:2974:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:2975:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:2976:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatMaxSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3005:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3006:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:3007:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatMaxSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatMaxSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatMaxSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatMaxSize"


    // $ANTLR start "entryRuleTMTCIFFormatVariableSize"
    // InternalFORMAT.g:3040:1: entryRuleTMTCIFFormatVariableSize returns [EObject current=null] : iv_ruleTMTCIFFormatVariableSize= ruleTMTCIFFormatVariableSize EOF ;
    public final EObject entryRuleTMTCIFFormatVariableSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatVariableSize = null;


        try {
            // InternalFORMAT.g:3040:65: (iv_ruleTMTCIFFormatVariableSize= ruleTMTCIFFormatVariableSize EOF )
            // InternalFORMAT.g:3041:2: iv_ruleTMTCIFFormatVariableSize= ruleTMTCIFFormatVariableSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatVariableSize=ruleTMTCIFFormatVariableSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatVariableSize; 
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
    // $ANTLR end "entryRuleTMTCIFFormatVariableSize"


    // $ANTLR start "ruleTMTCIFFormatVariableSize"
    // InternalFORMAT.g:3047:1: ruleTMTCIFFormatVariableSize returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleTMTCIFFormatVariableSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;

        Enumerator lv_unit_8_0 = null;

        Enumerator lv_power_12_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3053:2: ( (otherlv_0= 'TMTCIFFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalFORMAT.g:3054:2: (otherlv_0= 'TMTCIFFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalFORMAT.g:3054:2: (otherlv_0= 'TMTCIFFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            // InternalFORMAT.g:3055:3: otherlv_0= 'TMTCIFFormatVariableSize' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'unit' otherlv_7= ':=' ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) ) otherlv_9= ';' (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatVariableSizeAccess().getTMTCIFFormatVariableSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatVariableSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3071:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3072:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3073:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3102:3: ( (lv_unit_8_0= ruleTMTCIFFormatUnit ) )
            // InternalFORMAT.g:3103:4: (lv_unit_8_0= ruleTMTCIFFormatUnit )
            {
            // InternalFORMAT.g:3103:4: (lv_unit_8_0= ruleTMTCIFFormatUnit )
            // InternalFORMAT.g:3104:5: lv_unit_8_0= ruleTMTCIFFormatUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitTMTCIFFormatUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_unit_8_0=ruleTMTCIFFormatUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFORMAT.g:3125:3: (otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFORMAT.g:3126:4: otherlv_10= 'power' otherlv_11= ':=' ( (lv_power_12_0= ruleTMTCIFFormatPower ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatVariableSizeAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFORMAT.g:3134:4: ( (lv_power_12_0= ruleTMTCIFFormatPower ) )
                    // InternalFORMAT.g:3135:5: (lv_power_12_0= ruleTMTCIFFormatPower )
                    {
                    // InternalFORMAT.g:3135:5: (lv_power_12_0= ruleTMTCIFFormatPower )
                    // InternalFORMAT.g:3136:6: lv_power_12_0= ruleTMTCIFFormatPower
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerTMTCIFFormatPowerEnumRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_power_12_0=ruleTMTCIFFormatPower();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTMTCIFFormatVariableSizeRule());
                      						}
                      						set(
                      							current,
                      							"power",
                      							lv_power_12_0,
                      							"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatPower");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getTMTCIFFormatVariableSizeAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getTMTCIFFormatVariableSizeAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleTMTCIFFormatVariableSize"


    // $ANTLR start "entryRuleTMTCIFFormatFloatingOffset"
    // InternalFORMAT.g:3170:1: entryRuleTMTCIFFormatFloatingOffset returns [EObject current=null] : iv_ruleTMTCIFFormatFloatingOffset= ruleTMTCIFFormatFloatingOffset EOF ;
    public final EObject entryRuleTMTCIFFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatFloatingOffset = null;


        try {
            // InternalFORMAT.g:3170:67: (iv_ruleTMTCIFFormatFloatingOffset= ruleTMTCIFFormatFloatingOffset EOF )
            // InternalFORMAT.g:3171:2: iv_ruleTMTCIFFormatFloatingOffset= ruleTMTCIFFormatFloatingOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatFloatingOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatFloatingOffset=ruleTMTCIFFormatFloatingOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatFloatingOffset; 
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
    // $ANTLR end "entryRuleTMTCIFFormatFloatingOffset"


    // $ANTLR start "ruleTMTCIFFormatFloatingOffset"
    // InternalFORMAT.g:3177:1: ruleTMTCIFFormatFloatingOffset returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFFormatFloatingOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3183:2: ( (otherlv_0= 'TMTCIFFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3184:2: (otherlv_0= 'TMTCIFFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3184:2: (otherlv_0= 'TMTCIFFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3185:3: otherlv_0= 'TMTCIFFormatFloatingOffset' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getTMTCIFFormatFloatingOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3201:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3202:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3203:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFloatingOffsetRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleTMTCIFFormatFloatingOffset"


    // $ANTLR start "entryRuleTMTCIFFormatSortedFieldsToCheck"
    // InternalFORMAT.g:3236:1: entryRuleTMTCIFFormatSortedFieldsToCheck returns [EObject current=null] : iv_ruleTMTCIFFormatSortedFieldsToCheck= ruleTMTCIFFormatSortedFieldsToCheck EOF ;
    public final EObject entryRuleTMTCIFFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatSortedFieldsToCheck = null;


        try {
            // InternalFORMAT.g:3236:72: (iv_ruleTMTCIFFormatSortedFieldsToCheck= ruleTMTCIFFormatSortedFieldsToCheck EOF )
            // InternalFORMAT.g:3237:2: iv_ruleTMTCIFFormatSortedFieldsToCheck= ruleTMTCIFFormatSortedFieldsToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatSortedFieldsToCheck=ruleTMTCIFFormatSortedFieldsToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatSortedFieldsToCheck; 
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
    // $ANTLR end "entryRuleTMTCIFFormatSortedFieldsToCheck"


    // $ANTLR start "ruleTMTCIFFormatSortedFieldsToCheck"
    // InternalFORMAT.g:3243:1: ruleTMTCIFFormatSortedFieldsToCheck returns [EObject current=null] : ( () otherlv_1= 'TMTCIFFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleTMTCIFFormatSortedFieldsToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fieldToCheck_3_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3249:2: ( ( () otherlv_1= 'TMTCIFFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalFORMAT.g:3250:2: ( () otherlv_1= 'TMTCIFFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalFORMAT.g:3250:2: ( () otherlv_1= 'TMTCIFFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalFORMAT.g:3251:3: () otherlv_1= 'TMTCIFFormatSortedFieldsToCheck' otherlv_2= '{' ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalFORMAT.g:3251:3: ()
            // InternalFORMAT.g:3252:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getTMTCIFFormatSortedFieldsToCheckKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFORMAT.g:3269:3: ( (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==51) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck )
            	    {
            	    // InternalFORMAT.g:3270:4: (lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck )
            	    // InternalFORMAT.g:3271:5: lv_fieldToCheck_3_0= ruleTMTCIFFormatFieldToCheck
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckTMTCIFFormatFieldToCheckParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_fieldToCheck_3_0=ruleTMTCIFFormatFieldToCheck();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFFormatSortedFieldsToCheckRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fieldToCheck",
            	      						lv_fieldToCheck_3_0,
            	      						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.TMTCIFFormatFieldToCheck");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleTMTCIFFormatSortedFieldsToCheck"


    // $ANTLR start "entryRuleTMTCIFFormatFieldToCheck"
    // InternalFORMAT.g:3300:1: entryRuleTMTCIFFormatFieldToCheck returns [EObject current=null] : iv_ruleTMTCIFFormatFieldToCheck= ruleTMTCIFFormatFieldToCheck EOF ;
    public final EObject entryRuleTMTCIFFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatFieldToCheck = null;


        try {
            // InternalFORMAT.g:3300:65: (iv_ruleTMTCIFFormatFieldToCheck= ruleTMTCIFFormatFieldToCheck EOF )
            // InternalFORMAT.g:3301:2: iv_ruleTMTCIFFormatFieldToCheck= ruleTMTCIFFormatFieldToCheck EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatFieldToCheckRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatFieldToCheck=ruleTMTCIFFormatFieldToCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatFieldToCheck; 
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
    // $ANTLR end "entryRuleTMTCIFFormatFieldToCheck"


    // $ANTLR start "ruleTMTCIFFormatFieldToCheck"
    // InternalFORMAT.g:3307:1: ruleTMTCIFFormatFieldToCheck returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFFormatFieldToCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3313:2: ( (otherlv_0= 'TMTCIFFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3314:2: (otherlv_0= 'TMTCIFFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3314:2: (otherlv_0= 'TMTCIFFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3315:3: otherlv_0= 'TMTCIFFormatFieldToCheck' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getTMTCIFFormatFieldToCheckKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3331:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3332:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3333:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatFieldToCheckRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatFieldToCheckAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleTMTCIFFormatFieldToCheck"


    // $ANTLR start "entryRuleTMTCIFFormatArrayDimension"
    // InternalFORMAT.g:3366:1: entryRuleTMTCIFFormatArrayDimension returns [EObject current=null] : iv_ruleTMTCIFFormatArrayDimension= ruleTMTCIFFormatArrayDimension EOF ;
    public final EObject entryRuleTMTCIFFormatArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatArrayDimension = null;


        try {
            // InternalFORMAT.g:3366:67: (iv_ruleTMTCIFFormatArrayDimension= ruleTMTCIFFormatArrayDimension EOF )
            // InternalFORMAT.g:3367:2: iv_ruleTMTCIFFormatArrayDimension= ruleTMTCIFFormatArrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatArrayDimension=ruleTMTCIFFormatArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatArrayDimension; 
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
    // $ANTLR end "entryRuleTMTCIFFormatArrayDimension"


    // $ANTLR start "ruleTMTCIFFormatArrayDimension"
    // InternalFORMAT.g:3373:1: ruleTMTCIFFormatArrayDimension returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatArrayDimension() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;

        AntlrDatatypeRuleToken lv_maxItems_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3379:2: ( (otherlv_0= 'TMTCIFFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:3380:2: (otherlv_0= 'TMTCIFFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:3380:2: (otherlv_0= 'TMTCIFFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:3381:3: otherlv_0= 'TMTCIFFormatArrayDimension' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'maxItems' otherlv_7= ':=' ( (lv_maxItems_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getTMTCIFFormatArrayDimensionKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3397:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3398:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3399:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3428:3: ( (lv_maxItems_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3429:4: (lv_maxItems_8_0= ruleINTEGER )
            // InternalFORMAT.g:3430:5: lv_maxItems_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_maxItems_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayDimensionRule());
              					}
              					set(
              						current,
              						"maxItems",
              						lv_maxItems_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatArrayDimensionAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatArrayDimension"


    // $ANTLR start "entryRuleTMTCIFFormatLocalOffset"
    // InternalFORMAT.g:3463:1: entryRuleTMTCIFFormatLocalOffset returns [EObject current=null] : iv_ruleTMTCIFFormatLocalOffset= ruleTMTCIFFormatLocalOffset EOF ;
    public final EObject entryRuleTMTCIFFormatLocalOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatLocalOffset = null;


        try {
            // InternalFORMAT.g:3463:64: (iv_ruleTMTCIFFormatLocalOffset= ruleTMTCIFFormatLocalOffset EOF )
            // InternalFORMAT.g:3464:2: iv_ruleTMTCIFFormatLocalOffset= ruleTMTCIFFormatLocalOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatLocalOffset=ruleTMTCIFFormatLocalOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatLocalOffset; 
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
    // $ANTLR end "entryRuleTMTCIFFormatLocalOffset"


    // $ANTLR start "ruleTMTCIFFormatLocalOffset"
    // InternalFORMAT.g:3470:1: ruleTMTCIFFormatLocalOffset returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleTMTCIFFormatLocalOffset() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3476:2: ( (otherlv_0= 'TMTCIFFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFORMAT.g:3477:2: (otherlv_0= 'TMTCIFFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFORMAT.g:3477:2: (otherlv_0= 'TMTCIFFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalFORMAT.g:3478:3: otherlv_0= 'TMTCIFFormatLocalOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getTMTCIFFormatLocalOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3494:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3495:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalFORMAT.g:3496:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFORMAT.g:3525:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalFORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3526:4: (lv_bits_8_0= ruleINTEGER )
            // InternalFORMAT.g:3527:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatLocalOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTMTCIFFormatLocalOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleTMTCIFFormatLocalOffset"


    // $ANTLR start "entryRuleTMTCIFFormatArrayRef"
    // InternalFORMAT.g:3560:1: entryRuleTMTCIFFormatArrayRef returns [EObject current=null] : iv_ruleTMTCIFFormatArrayRef= ruleTMTCIFFormatArrayRef EOF ;
    public final EObject entryRuleTMTCIFFormatArrayRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFFormatArrayRef = null;


        try {
            // InternalFORMAT.g:3560:61: (iv_ruleTMTCIFFormatArrayRef= ruleTMTCIFFormatArrayRef EOF )
            // InternalFORMAT.g:3561:2: iv_ruleTMTCIFFormatArrayRef= ruleTMTCIFFormatArrayRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFFormatArrayRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFFormatArrayRef=ruleTMTCIFFormatArrayRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFFormatArrayRef; 
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
    // $ANTLR end "entryRuleTMTCIFFormatArrayRef"


    // $ANTLR start "ruleTMTCIFFormatArrayRef"
    // InternalFORMAT.g:3567:1: ruleTMTCIFFormatArrayRef returns [EObject current=null] : (otherlv_0= 'TMTCIFFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleTMTCIFFormatArrayRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fidRef_4_0 = null;



        	enterRule();

        try {
            // InternalFORMAT.g:3573:2: ( (otherlv_0= 'TMTCIFFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFORMAT.g:3574:2: (otherlv_0= 'TMTCIFFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFORMAT.g:3574:2: (otherlv_0= 'TMTCIFFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFORMAT.g:3575:3: otherlv_0= 'TMTCIFFormatArrayRef' otherlv_1= '{' otherlv_2= 'fidRef' otherlv_3= ':=' ( (lv_fidRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFFormatArrayRefAccess().getTMTCIFFormatArrayRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFFormatArrayRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFFormatArrayRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFORMAT.g:3591:3: ( (lv_fidRef_4_0= ruleINTEGER ) )
            // InternalFORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            {
            // InternalFORMAT.g:3592:4: (lv_fidRef_4_0= ruleINTEGER )
            // InternalFORMAT.g:3593:5: lv_fidRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fidRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFFormatArrayRefRule());
              					}
              					set(
              						current,
              						"fidRef",
              						lv_fidRef_4_0,
              						"es.uah.aut.srg.tmtcif.lang.format.FORMAT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTMTCIFFormatArrayRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getTMTCIFFormatArrayRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleTMTCIFFormatArrayRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFORMAT.g:3626:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFORMAT.g:3626:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFORMAT.g:3627:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFORMAT.g:3633:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3639:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFORMAT.g:3640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFORMAT.g:3641:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFORMAT.g:3648:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==56) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFORMAT.g:3649:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalFORMAT.g:3666:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFORMAT.g:3666:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFORMAT.g:3667:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFORMAT.g:3673:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFORMAT.g:3679:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFORMAT.g:3680:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFORMAT.g:3681:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==EOF||LA14_1==14||LA14_1==56) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalFORMAT.g:3682:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFORMAT.g:3690:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFORMAT.g:3691:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFORMAT.g:3691:5: (this_INT_1= RULE_INT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalFORMAT.g:3692:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
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

            // InternalFORMAT.g:3709:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFORMAT.g:3710:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,56,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFORMAT.g:3715:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_INT) ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1==RULE_ID) ) {
            	            alt16=2;
            	        }
            	        else if ( (LA16_1==EOF||LA16_1==14||LA16_1==56) ) {
            	            alt16=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA16_0==RULE_ID) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalFORMAT.g:3716:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFORMAT.g:3724:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFORMAT.g:3725:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFORMAT.g:3725:6: (this_INT_5= RULE_INT )?
            	            int alt15=2;
            	            int LA15_0 = input.LA(1);

            	            if ( (LA15_0==RULE_INT) ) {
            	                alt15=1;
            	            }
            	            switch (alt15) {
            	                case 1 :
            	                    // InternalFORMAT.g:3726:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_52); if (state.failed) return current;
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
            	    break loop17;
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalFORMAT.g:3748:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFORMAT.g:3748:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFORMAT.g:3749:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFORMAT.g:3755:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3761:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFORMAT.g:3762:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFORMAT.g:3762:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT||LA19_0==57) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_HEXADECIMAL) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFORMAT.g:3763:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFORMAT.g:3763:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFORMAT.g:3764:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFORMAT.g:3764:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==57) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFORMAT.g:3765:5: kw= '-'
                            {
                            kw=(Token)match(input,57,FollowSets000.FOLLOW_53); if (state.failed) return current;
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
                    // InternalFORMAT.g:3780:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleTMTCIFFormatFormatType"
    // InternalFORMAT.g:3791:1: ruleTMTCIFFormatFormatType returns [Enumerator current=null] : ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) ;
    public final Enumerator ruleTMTCIFFormatFormatType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3797:2: ( ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) ) )
            // InternalFORMAT.g:3798:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            {
            // InternalFORMAT.g:3798:2: ( (enumLiteral_0= 'TM' ) | (enumLiteral_1= 'TC' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            else if ( (LA20_0==59) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFORMAT.g:3799:3: (enumLiteral_0= 'TM' )
                    {
                    // InternalFORMAT.g:3799:3: (enumLiteral_0= 'TM' )
                    // InternalFORMAT.g:3800:4: enumLiteral_0= 'TM'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFormatTypeAccess().getTMEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3807:3: (enumLiteral_1= 'TC' )
                    {
                    // InternalFORMAT.g:3807:3: (enumLiteral_1= 'TC' )
                    // InternalFORMAT.g:3808:4: enumLiteral_1= 'TC'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFormatTypeAccess().getTCEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatFormatType"


    // $ANTLR start "ruleTMTCIFFormatFieldType"
    // InternalFORMAT.g:3818:1: ruleTMTCIFFormatFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) ;
    public final Enumerator ruleTMTCIFFormatFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3824:2: ( ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) ) )
            // InternalFORMAT.g:3825:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            {
            // InternalFORMAT.g:3825:2: ( (enumLiteral_0= 'structured' ) | (enumLiteral_1= 'uint' ) | (enumLiteral_2= 'flag' ) | (enumLiteral_3= 'enumerated' ) | (enumLiteral_4= 'bit_vector' ) | (enumLiteral_5= 'byte_vector' ) | (enumLiteral_6= 'float' ) | (enumLiteral_7= 'deduced' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt21=1;
                }
                break;
            case 61:
                {
                alt21=2;
                }
                break;
            case 62:
                {
                alt21=3;
                }
                break;
            case 63:
                {
                alt21=4;
                }
                break;
            case 64:
                {
                alt21=5;
                }
                break;
            case 65:
                {
                alt21=6;
                }
                break;
            case 66:
                {
                alt21=7;
                }
                break;
            case 67:
                {
                alt21=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalFORMAT.g:3826:3: (enumLiteral_0= 'structured' )
                    {
                    // InternalFORMAT.g:3826:3: (enumLiteral_0= 'structured' )
                    // InternalFORMAT.g:3827:4: enumLiteral_0= 'structured'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFieldTypeAccess().getStructuredEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3834:3: (enumLiteral_1= 'uint' )
                    {
                    // InternalFORMAT.g:3834:3: (enumLiteral_1= 'uint' )
                    // InternalFORMAT.g:3835:4: enumLiteral_1= 'uint'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFieldTypeAccess().getUintEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3842:3: (enumLiteral_2= 'flag' )
                    {
                    // InternalFORMAT.g:3842:3: (enumLiteral_2= 'flag' )
                    // InternalFORMAT.g:3843:4: enumLiteral_2= 'flag'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatFieldTypeAccess().getFlagEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFORMAT.g:3850:3: (enumLiteral_3= 'enumerated' )
                    {
                    // InternalFORMAT.g:3850:3: (enumLiteral_3= 'enumerated' )
                    // InternalFORMAT.g:3851:4: enumLiteral_3= 'enumerated'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFormatFieldTypeAccess().getEnumeratedEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFORMAT.g:3858:3: (enumLiteral_4= 'bit_vector' )
                    {
                    // InternalFORMAT.g:3858:3: (enumLiteral_4= 'bit_vector' )
                    // InternalFORMAT.g:3859:4: enumLiteral_4= 'bit_vector'
                    {
                    enumLiteral_4=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFormatFieldTypeAccess().getBit_vectorEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFORMAT.g:3866:3: (enumLiteral_5= 'byte_vector' )
                    {
                    // InternalFORMAT.g:3866:3: (enumLiteral_5= 'byte_vector' )
                    // InternalFORMAT.g:3867:4: enumLiteral_5= 'byte_vector'
                    {
                    enumLiteral_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFormatFieldTypeAccess().getByte_vectorEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalFORMAT.g:3874:3: (enumLiteral_6= 'float' )
                    {
                    // InternalFORMAT.g:3874:3: (enumLiteral_6= 'float' )
                    // InternalFORMAT.g:3875:4: enumLiteral_6= 'float'
                    {
                    enumLiteral_6=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getTMTCIFFormatFieldTypeAccess().getFloatEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalFORMAT.g:3882:3: (enumLiteral_7= 'deduced' )
                    {
                    // InternalFORMAT.g:3882:3: (enumLiteral_7= 'deduced' )
                    // InternalFORMAT.g:3883:4: enumLiteral_7= 'deduced'
                    {
                    enumLiteral_7=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getTMTCIFFormatFieldTypeAccess().getDeducedEnumLiteralDeclaration_7());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatFieldType"


    // $ANTLR start "ruleTMTCIFFormatFieldByteOrder"
    // InternalFORMAT.g:3893:1: ruleTMTCIFFormatFieldByteOrder returns [Enumerator current=null] : ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) ;
    public final Enumerator ruleTMTCIFFormatFieldByteOrder() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3899:2: ( ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) ) )
            // InternalFORMAT.g:3900:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            {
            // InternalFORMAT.g:3900:2: ( (enumLiteral_0= 'big_endian' ) | (enumLiteral_1= 'little_endian' ) | (enumLiteral_2= 'na' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt22=1;
                }
                break;
            case 69:
                {
                alt22=2;
                }
                break;
            case 70:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalFORMAT.g:3901:3: (enumLiteral_0= 'big_endian' )
                    {
                    // InternalFORMAT.g:3901:3: (enumLiteral_0= 'big_endian' )
                    // InternalFORMAT.g:3902:4: enumLiteral_0= 'big_endian'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getBig_endianEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3909:3: (enumLiteral_1= 'little_endian' )
                    {
                    // InternalFORMAT.g:3909:3: (enumLiteral_1= 'little_endian' )
                    // InternalFORMAT.g:3910:4: enumLiteral_1= 'little_endian'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getLittle_endianEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3917:3: (enumLiteral_2= 'na' )
                    {
                    // InternalFORMAT.g:3917:3: (enumLiteral_2= 'na' )
                    // InternalFORMAT.g:3918:4: enumLiteral_2= 'na'
                    {
                    enumLiteral_2=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getNaEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatFieldByteOrder"


    // $ANTLR start "ruleTMTCIFFormatSFieldFirstBit"
    // InternalFORMAT.g:3928:1: ruleTMTCIFFormatSFieldFirstBit returns [Enumerator current=null] : ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) ;
    public final Enumerator ruleTMTCIFFormatSFieldFirstBit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3934:2: ( ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) ) )
            // InternalFORMAT.g:3935:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            {
            // InternalFORMAT.g:3935:2: ( (enumLiteral_0= 'MSB' ) | (enumLiteral_1= 'LSB' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==71) ) {
                alt23=1;
            }
            else if ( (LA23_0==72) ) {
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
                    // InternalFORMAT.g:3936:3: (enumLiteral_0= 'MSB' )
                    {
                    // InternalFORMAT.g:3936:3: (enumLiteral_0= 'MSB' )
                    // InternalFORMAT.g:3937:4: enumLiteral_0= 'MSB'
                    {
                    enumLiteral_0=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getMSBEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3944:3: (enumLiteral_1= 'LSB' )
                    {
                    // InternalFORMAT.g:3944:3: (enumLiteral_1= 'LSB' )
                    // InternalFORMAT.g:3945:4: enumLiteral_1= 'LSB'
                    {
                    enumLiteral_1=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getLSBEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatSFieldFirstBit"


    // $ANTLR start "ruleTMTCIFFormatUnit"
    // InternalFORMAT.g:3955:1: ruleTMTCIFFormatUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) ;
    public final Enumerator ruleTMTCIFFormatUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFORMAT.g:3961:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) ) )
            // InternalFORMAT.g:3962:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            {
            // InternalFORMAT.g:3962:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) | (enumLiteral_2= 'halfword' ) | (enumLiteral_3= 'string10' ) | (enumLiteral_4= 'string17' ) | (enumLiteral_5= 'string69' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 73:
                {
                alt24=3;
                }
                break;
            case 74:
                {
                alt24=4;
                }
                break;
            case 75:
                {
                alt24=5;
                }
                break;
            case 76:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalFORMAT.g:3963:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalFORMAT.g:3963:3: (enumLiteral_0= 'bytes' )
                    // InternalFORMAT.g:3964:4: enumLiteral_0= 'bytes'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatUnitAccess().getBytesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:3971:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalFORMAT.g:3971:3: (enumLiteral_1= 'bits' )
                    // InternalFORMAT.g:3972:4: enumLiteral_1= 'bits'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatUnitAccess().getBitsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFORMAT.g:3979:3: (enumLiteral_2= 'halfword' )
                    {
                    // InternalFORMAT.g:3979:3: (enumLiteral_2= 'halfword' )
                    // InternalFORMAT.g:3980:4: enumLiteral_2= 'halfword'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTMTCIFFormatUnitAccess().getHalfwordEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFORMAT.g:3987:3: (enumLiteral_3= 'string10' )
                    {
                    // InternalFORMAT.g:3987:3: (enumLiteral_3= 'string10' )
                    // InternalFORMAT.g:3988:4: enumLiteral_3= 'string10'
                    {
                    enumLiteral_3=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTMTCIFFormatUnitAccess().getString10EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFORMAT.g:3995:3: (enumLiteral_4= 'string17' )
                    {
                    // InternalFORMAT.g:3995:3: (enumLiteral_4= 'string17' )
                    // InternalFORMAT.g:3996:4: enumLiteral_4= 'string17'
                    {
                    enumLiteral_4=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTMTCIFFormatUnitAccess().getString17EnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFORMAT.g:4003:3: (enumLiteral_5= 'string69' )
                    {
                    // InternalFORMAT.g:4003:3: (enumLiteral_5= 'string69' )
                    // InternalFORMAT.g:4004:4: enumLiteral_5= 'string69'
                    {
                    enumLiteral_5=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTMTCIFFormatUnitAccess().getString69EnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatUnit"


    // $ANTLR start "ruleTMTCIFFormatPower"
    // InternalFORMAT.g:4014:1: ruleTMTCIFFormatPower returns [Enumerator current=null] : ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) ;
    public final Enumerator ruleTMTCIFFormatPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:4020:2: ( ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) ) )
            // InternalFORMAT.g:4021:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            {
            // InternalFORMAT.g:4021:2: ( (enumLiteral_0= '2bits' ) | (enumLiteral_1= '2bits_with_0' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==77) ) {
                alt25=1;
            }
            else if ( (LA25_0==78) ) {
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
                    // InternalFORMAT.g:4022:3: (enumLiteral_0= '2bits' )
                    {
                    // InternalFORMAT.g:4022:3: (enumLiteral_0= '2bits' )
                    // InternalFORMAT.g:4023:4: enumLiteral_0= '2bits'
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatPowerAccess().get_2EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:4030:3: (enumLiteral_1= '2bits_with_0' )
                    {
                    // InternalFORMAT.g:4030:3: (enumLiteral_1= '2bits_with_0' )
                    // InternalFORMAT.g:4031:4: enumLiteral_1= '2bits_with_0'
                    {
                    enumLiteral_1=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatPowerAccess().get_2_with_0EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatPower"


    // $ANTLR start "ruleTMTCIFFormatCheckType"
    // InternalFORMAT.g:4041:1: ruleTMTCIFFormatCheckType returns [Enumerator current=null] : ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) ;
    public final Enumerator ruleTMTCIFFormatCheckType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFORMAT.g:4047:2: ( ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) ) )
            // InternalFORMAT.g:4048:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            {
            // InternalFORMAT.g:4048:2: ( (enumLiteral_0= 'crc16' ) | (enumLiteral_1= 'checksum16' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==79) ) {
                alt26=1;
            }
            else if ( (LA26_0==80) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalFORMAT.g:4049:3: (enumLiteral_0= 'crc16' )
                    {
                    // InternalFORMAT.g:4049:3: (enumLiteral_0= 'crc16' )
                    // InternalFORMAT.g:4050:4: enumLiteral_0= 'crc16'
                    {
                    enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTMTCIFFormatCheckTypeAccess().getCrc16EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFORMAT.g:4057:3: (enumLiteral_1= 'checksum16' )
                    {
                    // InternalFORMAT.g:4057:3: (enumLiteral_1= 'checksum16' )
                    // InternalFORMAT.g:4058:4: enumLiteral_1= 'checksum16'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTMTCIFFormatCheckTypeAccess().getChecksum16EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleTMTCIFFormatCheckType"

    // $ANTLR start synpred2_InternalFORMAT
    public final void synpred2_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFORMAT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFORMAT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFORMAT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFORMAT.g:244:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFORMAT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 0);
        // InternalFORMAT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFORMAT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFORMAT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFORMAT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFORMAT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFORMAT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalFORMAT

    // $ANTLR start synpred3_InternalFORMAT
    public final void synpred3_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalFORMAT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalFORMAT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalFORMAT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFORMAT.g:286:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalFORMAT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 1);
        // InternalFORMAT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalFORMAT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFORMAT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFORMAT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalFORMAT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalFORMAT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalFORMAT

    // $ANTLR start synpred4_InternalFORMAT
    public final void synpred4_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_protocol_14_0=null;
        Token otherlv_15=null;

        // InternalFORMAT.g:327:4: ( ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) ) )
        // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        {
        // InternalFORMAT.g:327:4: ({...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ) )
        // InternalFORMAT.g:328:5: {...}? => ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalFORMAT.g:328:115: ( ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
        // InternalFORMAT.g:329:6: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 2);
        // InternalFORMAT.g:332:9: ({...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' ) )
        // InternalFORMAT.g:332:10: {...}? => (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:332:19: (otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';' )
        // InternalFORMAT.g:332:20: otherlv_12= 'protocol' otherlv_13= ':=' ( (lv_protocol_14_0= RULE_ID ) ) otherlv_15= ';'
        {
        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFORMAT.g:340:9: ( (lv_protocol_14_0= RULE_ID ) )
        // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        {
        // InternalFORMAT.g:341:10: (lv_protocol_14_0= RULE_ID )
        // InternalFORMAT.g:342:11: lv_protocol_14_0= RULE_ID
        {
        lv_protocol_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalFORMAT

    // $ANTLR start synpred12_InternalFORMAT
    public final void synpred12_InternalFORMAT_fragment() throws RecognitionException {   
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_type_18_0 = null;

        EObject lv_CSField_20_0 = null;

        EObject lv_CSFormulaField_21_0 = null;

        EObject lv_VSField_22_0 = null;

        EObject lv_FDICField_23_0 = null;

        EObject lv_VRFieldSize_24_0 = null;

        EObject lv_AField_25_0 = null;

        EObject lv_AIField_26_0 = null;


        // InternalFORMAT.g:368:4: ( ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) ) )
        // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) )
        {
        // InternalFORMAT.g:368:4: ({...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) ) )
        // InternalFORMAT.g:369:5: {...}? => ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalFORMAT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalFORMAT.g:369:115: ( ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) ) )
        // InternalFORMAT.g:370:6: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), 3);
        // InternalFORMAT.g:373:9: ({...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* ) )
        // InternalFORMAT.g:373:10: {...}? => ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalFORMAT", "true");
        }
        // InternalFORMAT.g:373:19: ( (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )* )
        // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' ) ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )*
        {
        // InternalFORMAT.g:373:20: (otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';' )
        // InternalFORMAT.g:374:10: otherlv_16= 'type' otherlv_17= ':=' ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) ) otherlv_19= ';'
        {
        otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalFORMAT.g:382:10: ( (lv_type_18_0= ruleTMTCIFFormatFormatType ) )
        // InternalFORMAT.g:383:11: (lv_type_18_0= ruleTMTCIFFormatFormatType )
        {
        // InternalFORMAT.g:383:11: (lv_type_18_0= ruleTMTCIFFormatFormatType )
        // InternalFORMAT.g:384:12: lv_type_18_0= ruleTMTCIFFormatFormatType
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getTypeTMTCIFFormatFormatTypeEnumRuleCall_3_3_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_type_18_0=ruleTMTCIFFormatFormatType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return ;

        }

        // InternalFORMAT.g:406:9: ( ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) ) | ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) ) | ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) ) | ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) ) | ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) ) | ( (lv_AField_25_0= ruleTMTCIFFormatAField ) ) | ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) ) )*
        loop27:
        do {
            int alt27=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt27=1;
                }
                break;
            case 29:
                {
                alt27=2;
                }
                break;
            case 30:
                {
                alt27=3;
                }
                break;
            case 32:
                {
                alt27=4;
                }
                break;
            case 31:
                {
                alt27=5;
                }
                break;
            case 34:
                {
                alt27=6;
                }
                break;
            case 35:
                {
                alt27=7;
                }
                break;

            }

            switch (alt27) {
        	case 1 :
        	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) )
        	    {
        	    // InternalFORMAT.g:407:10: ( (lv_CSField_20_0= ruleTMTCIFFormatCSField ) )
        	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleTMTCIFFormatCSField )
        	    {
        	    // InternalFORMAT.g:408:11: (lv_CSField_20_0= ruleTMTCIFFormatCSField )
        	    // InternalFORMAT.g:409:12: lv_CSField_20_0= ruleTMTCIFFormatCSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldTMTCIFFormatCSFieldParserRuleCall_3_3_1_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_CSField_20_0=ruleTMTCIFFormatCSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) )
        	    {
        	    // InternalFORMAT.g:427:10: ( (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField ) )
        	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField )
        	    {
        	    // InternalFORMAT.g:428:11: (lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField )
        	    // InternalFORMAT.g:429:12: lv_CSFormulaField_21_0= ruleTMTCIFFormatCSFormulaField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldTMTCIFFormatCSFormulaFieldParserRuleCall_3_3_1_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_CSFormulaField_21_0=ruleTMTCIFFormatCSFormulaField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) )
        	    {
        	    // InternalFORMAT.g:447:10: ( (lv_VSField_22_0= ruleTMTCIFFormatVSField ) )
        	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleTMTCIFFormatVSField )
        	    {
        	    // InternalFORMAT.g:448:11: (lv_VSField_22_0= ruleTMTCIFFormatVSField )
        	    // InternalFORMAT.g:449:12: lv_VSField_22_0= ruleTMTCIFFormatVSField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldTMTCIFFormatVSFieldParserRuleCall_3_3_1_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_VSField_22_0=ruleTMTCIFFormatVSField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) )
        	    {
        	    // InternalFORMAT.g:467:10: ( (lv_FDICField_23_0= ruleTMTCIFFormatFDICField ) )
        	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleTMTCIFFormatFDICField )
        	    {
        	    // InternalFORMAT.g:468:11: (lv_FDICField_23_0= ruleTMTCIFFormatFDICField )
        	    // InternalFORMAT.g:469:12: lv_FDICField_23_0= ruleTMTCIFFormatFDICField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldTMTCIFFormatFDICFieldParserRuleCall_3_3_1_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_FDICField_23_0=ruleTMTCIFFormatFDICField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 5 :
        	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) )
        	    {
        	    // InternalFORMAT.g:487:10: ( (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize ) )
        	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize )
        	    {
        	    // InternalFORMAT.g:488:11: (lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize )
        	    // InternalFORMAT.g:489:12: lv_VRFieldSize_24_0= ruleTMTCIFFormatVRFieldSize
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeTMTCIFFormatVRFieldSizeParserRuleCall_3_3_1_4_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_VRFieldSize_24_0=ruleTMTCIFFormatVRFieldSize();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 6 :
        	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleTMTCIFFormatAField ) )
        	    {
        	    // InternalFORMAT.g:507:10: ( (lv_AField_25_0= ruleTMTCIFFormatAField ) )
        	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleTMTCIFFormatAField )
        	    {
        	    // InternalFORMAT.g:508:11: (lv_AField_25_0= ruleTMTCIFFormatAField )
        	    // InternalFORMAT.g:509:12: lv_AField_25_0= ruleTMTCIFFormatAField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldTMTCIFFormatAFieldParserRuleCall_3_3_1_5_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_AField_25_0=ruleTMTCIFFormatAField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 7 :
        	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) )
        	    {
        	    // InternalFORMAT.g:527:10: ( (lv_AIField_26_0= ruleTMTCIFFormatAIField ) )
        	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleTMTCIFFormatAIField )
        	    {
        	    // InternalFORMAT.g:528:11: (lv_AIField_26_0= ruleTMTCIFFormatAIField )
        	    // InternalFORMAT.g:529:12: lv_AIField_26_0= ruleTMTCIFFormatAIField
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldTMTCIFFormatAIFieldParserRuleCall_3_3_1_6_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_54);
        	    lv_AIField_26_0=ruleTMTCIFFormatAIField();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop27;
            }
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalFORMAT

    // Delegated rules

    public final boolean synpred3_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalFORMAT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFORMAT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFORMAT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000DE07E0000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x02000000000000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xF000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000204000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000006000000000L,0x0000000000001E00L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000200000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000200000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000DE0400002L});
    }


}