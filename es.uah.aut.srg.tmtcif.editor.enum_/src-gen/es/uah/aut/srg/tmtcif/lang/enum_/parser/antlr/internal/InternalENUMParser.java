package es.uah.aut.srg.tmtcif.lang.enum_.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;



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
public class InternalENUMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<Enum'", "'name='", "'>'", "'</Enum>'", "'<Value'", "'</Value>'", "'-'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int RULE_HEXADECIMAL=6;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalENUMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalENUMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalENUMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalENUM.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private ENUMGrammarAccess grammarAccess;

        public InternalENUMParser(TokenStream input, ENUMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TMTCIFEnum";
       	}

       	@Override
       	protected ENUMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTMTCIFEnum"
    // InternalENUM.g:77:1: entryRuleTMTCIFEnum returns [EObject current=null] : iv_ruleTMTCIFEnum= ruleTMTCIFEnum EOF ;
    public final EObject entryRuleTMTCIFEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFEnum = null;


        try {
            // InternalENUM.g:77:51: (iv_ruleTMTCIFEnum= ruleTMTCIFEnum EOF )
            // InternalENUM.g:78:2: iv_ruleTMTCIFEnum= ruleTMTCIFEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFEnumRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFEnum=ruleTMTCIFEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFEnum; 
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
    // $ANTLR end "entryRuleTMTCIFEnum"


    // $ANTLR start "ruleTMTCIFEnum"
    // InternalENUM.g:84:1: ruleTMTCIFEnum returns [EObject current=null] : (otherlv_0= '<Enum' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+ otherlv_5= '</Enum>' ) ;
    public final EObject ruleTMTCIFEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalENUM.g:90:2: ( (otherlv_0= '<Enum' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+ otherlv_5= '</Enum>' ) )
            // InternalENUM.g:91:2: (otherlv_0= '<Enum' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+ otherlv_5= '</Enum>' )
            {
            // InternalENUM.g:91:2: (otherlv_0= '<Enum' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+ otherlv_5= '</Enum>' )
            // InternalENUM.g:92:3: otherlv_0= '<Enum' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+ otherlv_5= '</Enum>'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1());
              		
            }
            // InternalENUM.g:100:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalENUM.g:101:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalENUM.g:101:4: (lv_name_2_0= RULE_STRING )
            // InternalENUM.g:102:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFEnumRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalENUM.g:122:3: ( (lv_values_4_0= ruleTMTCIFEnumValue ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalENUM.g:123:4: (lv_values_4_0= ruleTMTCIFEnumValue )
            	    {
            	    // InternalENUM.g:123:4: (lv_values_4_0= ruleTMTCIFEnumValue )
            	    // InternalENUM.g:124:5: lv_values_4_0= ruleTMTCIFEnumValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_values_4_0=ruleTMTCIFEnumValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTMTCIFEnumRule());
            	      					}
            	      					add(
            	      						current,
            	      						"values",
            	      						lv_values_4_0,
            	      						"es.uah.aut.srg.tmtcif.lang.enum_.ENUM.TMTCIFEnumValue");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5());
              		
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
    // $ANTLR end "ruleTMTCIFEnum"


    // $ANTLR start "entryRuleTMTCIFEnumValue"
    // InternalENUM.g:149:1: entryRuleTMTCIFEnumValue returns [EObject current=null] : iv_ruleTMTCIFEnumValue= ruleTMTCIFEnumValue EOF ;
    public final EObject entryRuleTMTCIFEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMTCIFEnumValue = null;


        try {
            // InternalENUM.g:149:56: (iv_ruleTMTCIFEnumValue= ruleTMTCIFEnumValue EOF )
            // InternalENUM.g:150:2: iv_ruleTMTCIFEnumValue= ruleTMTCIFEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTMTCIFEnumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTMTCIFEnumValue=ruleTMTCIFEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTMTCIFEnumValue; 
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
    // $ANTLR end "entryRuleTMTCIFEnumValue"


    // $ANTLR start "ruleTMTCIFEnumValue"
    // InternalENUM.g:156:1: ruleTMTCIFEnumValue returns [EObject current=null] : (otherlv_0= '<Value' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_raw_4_0= ruleINTEGER ) ) otherlv_5= '</Value>' ) ;
    public final EObject ruleTMTCIFEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_raw_4_0 = null;



        	enterRule();

        try {
            // InternalENUM.g:162:2: ( (otherlv_0= '<Value' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_raw_4_0= ruleINTEGER ) ) otherlv_5= '</Value>' ) )
            // InternalENUM.g:163:2: (otherlv_0= '<Value' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_raw_4_0= ruleINTEGER ) ) otherlv_5= '</Value>' )
            {
            // InternalENUM.g:163:2: (otherlv_0= '<Value' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_raw_4_0= ruleINTEGER ) ) otherlv_5= '</Value>' )
            // InternalENUM.g:164:3: otherlv_0= '<Value' otherlv_1= 'name=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '>' ( (lv_raw_4_0= ruleINTEGER ) ) otherlv_5= '</Value>'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1());
              		
            }
            // InternalENUM.g:172:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalENUM.g:173:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalENUM.g:173:4: (lv_name_2_0= RULE_STRING )
            // InternalENUM.g:174:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTMTCIFEnumValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3());
              		
            }
            // InternalENUM.g:194:3: ( (lv_raw_4_0= ruleINTEGER ) )
            // InternalENUM.g:195:4: (lv_raw_4_0= ruleINTEGER )
            {
            // InternalENUM.g:195:4: (lv_raw_4_0= ruleINTEGER )
            // InternalENUM.g:196:5: lv_raw_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_9);
            lv_raw_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTMTCIFEnumValueRule());
              					}
              					set(
              						current,
              						"raw",
              						lv_raw_4_0,
              						"es.uah.aut.srg.tmtcif.lang.enum_.ENUM.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5());
              		
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
    // $ANTLR end "ruleTMTCIFEnumValue"


    // $ANTLR start "entryRuleINTEGER"
    // InternalENUM.g:221:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalENUM.g:221:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalENUM.g:222:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalENUM.g:228:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalENUM.g:234:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalENUM.g:235:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalENUM.g:235:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_HEXADECIMAL) ) {
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
                    // InternalENUM.g:236:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalENUM.g:236:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalENUM.g:237:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalENUM.g:237:4: (kw= '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==18) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalENUM.g:238:5: kw= '-'
                            {
                            kw=(Token)match(input,18,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
                    // InternalENUM.g:253:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040060L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    }


}