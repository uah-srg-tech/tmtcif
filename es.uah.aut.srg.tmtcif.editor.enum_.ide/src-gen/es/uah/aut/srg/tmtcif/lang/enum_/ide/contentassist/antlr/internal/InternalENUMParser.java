package es.uah.aut.srg.tmtcif.lang.enum_.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
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
public class InternalENUMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEXADECIMAL", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<Enum'", "'name='", "'>'", "'</Enum>'", "'<Value'", "'</Value>'", "'-'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int RULE_HEXADECIMAL=4;
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


    	private ENUMGrammarAccess grammarAccess;

    	public void setGrammarAccess(ENUMGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTMTCIFEnum"
    // InternalENUM.g:61:1: entryRuleTMTCIFEnum : ruleTMTCIFEnum EOF ;
    public final void entryRuleTMTCIFEnum() throws RecognitionException {
        try {
            // InternalENUM.g:62:1: ( ruleTMTCIFEnum EOF )
            // InternalENUM.g:63:1: ruleTMTCIFEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFEnum"


    // $ANTLR start "ruleTMTCIFEnum"
    // InternalENUM.g:70:1: ruleTMTCIFEnum : ( ( rule__TMTCIFEnum__Group__0 ) ) ;
    public final void ruleTMTCIFEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:74:2: ( ( ( rule__TMTCIFEnum__Group__0 ) ) )
            // InternalENUM.g:75:2: ( ( rule__TMTCIFEnum__Group__0 ) )
            {
            // InternalENUM.g:75:2: ( ( rule__TMTCIFEnum__Group__0 ) )
            // InternalENUM.g:76:3: ( rule__TMTCIFEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getGroup()); 
            }
            // InternalENUM.g:77:3: ( rule__TMTCIFEnum__Group__0 )
            // InternalENUM.g:77:4: rule__TMTCIFEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFEnum"


    // $ANTLR start "entryRuleTMTCIFEnumValue"
    // InternalENUM.g:86:1: entryRuleTMTCIFEnumValue : ruleTMTCIFEnumValue EOF ;
    public final void entryRuleTMTCIFEnumValue() throws RecognitionException {
        try {
            // InternalENUM.g:87:1: ( ruleTMTCIFEnumValue EOF )
            // InternalENUM.g:88:1: ruleTMTCIFEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFEnumValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTMTCIFEnumValue"


    // $ANTLR start "ruleTMTCIFEnumValue"
    // InternalENUM.g:95:1: ruleTMTCIFEnumValue : ( ( rule__TMTCIFEnumValue__Group__0 ) ) ;
    public final void ruleTMTCIFEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:99:2: ( ( ( rule__TMTCIFEnumValue__Group__0 ) ) )
            // InternalENUM.g:100:2: ( ( rule__TMTCIFEnumValue__Group__0 ) )
            {
            // InternalENUM.g:100:2: ( ( rule__TMTCIFEnumValue__Group__0 ) )
            // InternalENUM.g:101:3: ( rule__TMTCIFEnumValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getGroup()); 
            }
            // InternalENUM.g:102:3: ( rule__TMTCIFEnumValue__Group__0 )
            // InternalENUM.g:102:4: rule__TMTCIFEnumValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFEnumValue"


    // $ANTLR start "entryRuleINTEGER"
    // InternalENUM.g:111:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalENUM.g:112:1: ( ruleINTEGER EOF )
            // InternalENUM.g:113:1: ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalENUM.g:120:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:124:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalENUM.g:125:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalENUM.g:125:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalENUM.g:126:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalENUM.g:127:3: ( rule__INTEGER__Alternatives )
            // InternalENUM.g:127:4: rule__INTEGER__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "rule__INTEGER__Alternatives"
    // InternalENUM.g:135:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:139:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_HEXADECIMAL) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalENUM.g:140:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalENUM.g:140:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalENUM.g:141:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalENUM.g:142:3: ( rule__INTEGER__Group_0__0 )
                    // InternalENUM.g:142:4: rule__INTEGER__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__INTEGER__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENUM.g:146:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalENUM.g:146:2: ( RULE_HEXADECIMAL )
                    // InternalENUM.g:147:3: RULE_HEXADECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
                    }
                    match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Alternatives"


    // $ANTLR start "rule__TMTCIFEnum__Group__0"
    // InternalENUM.g:156:1: rule__TMTCIFEnum__Group__0 : rule__TMTCIFEnum__Group__0__Impl rule__TMTCIFEnum__Group__1 ;
    public final void rule__TMTCIFEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:160:1: ( rule__TMTCIFEnum__Group__0__Impl rule__TMTCIFEnum__Group__1 )
            // InternalENUM.g:161:2: rule__TMTCIFEnum__Group__0__Impl rule__TMTCIFEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TMTCIFEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__0"


    // $ANTLR start "rule__TMTCIFEnum__Group__0__Impl"
    // InternalENUM.g:168:1: rule__TMTCIFEnum__Group__0__Impl : ( '<Enum' ) ;
    public final void rule__TMTCIFEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:172:1: ( ( '<Enum' ) )
            // InternalENUM.g:173:1: ( '<Enum' )
            {
            // InternalENUM.g:173:1: ( '<Enum' )
            // InternalENUM.g:174:2: '<Enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFEnum__Group__1"
    // InternalENUM.g:183:1: rule__TMTCIFEnum__Group__1 : rule__TMTCIFEnum__Group__1__Impl rule__TMTCIFEnum__Group__2 ;
    public final void rule__TMTCIFEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:187:1: ( rule__TMTCIFEnum__Group__1__Impl rule__TMTCIFEnum__Group__2 )
            // InternalENUM.g:188:2: rule__TMTCIFEnum__Group__1__Impl rule__TMTCIFEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TMTCIFEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__1"


    // $ANTLR start "rule__TMTCIFEnum__Group__1__Impl"
    // InternalENUM.g:195:1: rule__TMTCIFEnum__Group__1__Impl : ( 'name=' ) ;
    public final void rule__TMTCIFEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:199:1: ( ( 'name=' ) )
            // InternalENUM.g:200:1: ( 'name=' )
            {
            // InternalENUM.g:200:1: ( 'name=' )
            // InternalENUM.g:201:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFEnum__Group__2"
    // InternalENUM.g:210:1: rule__TMTCIFEnum__Group__2 : rule__TMTCIFEnum__Group__2__Impl rule__TMTCIFEnum__Group__3 ;
    public final void rule__TMTCIFEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:214:1: ( rule__TMTCIFEnum__Group__2__Impl rule__TMTCIFEnum__Group__3 )
            // InternalENUM.g:215:2: rule__TMTCIFEnum__Group__2__Impl rule__TMTCIFEnum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__2"


    // $ANTLR start "rule__TMTCIFEnum__Group__2__Impl"
    // InternalENUM.g:222:1: rule__TMTCIFEnum__Group__2__Impl : ( ( rule__TMTCIFEnum__NameAssignment_2 ) ) ;
    public final void rule__TMTCIFEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:226:1: ( ( ( rule__TMTCIFEnum__NameAssignment_2 ) ) )
            // InternalENUM.g:227:1: ( ( rule__TMTCIFEnum__NameAssignment_2 ) )
            {
            // InternalENUM.g:227:1: ( ( rule__TMTCIFEnum__NameAssignment_2 ) )
            // InternalENUM.g:228:2: ( rule__TMTCIFEnum__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getNameAssignment_2()); 
            }
            // InternalENUM.g:229:2: ( rule__TMTCIFEnum__NameAssignment_2 )
            // InternalENUM.g:229:3: rule__TMTCIFEnum__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFEnum__Group__3"
    // InternalENUM.g:237:1: rule__TMTCIFEnum__Group__3 : rule__TMTCIFEnum__Group__3__Impl rule__TMTCIFEnum__Group__4 ;
    public final void rule__TMTCIFEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:241:1: ( rule__TMTCIFEnum__Group__3__Impl rule__TMTCIFEnum__Group__4 )
            // InternalENUM.g:242:2: rule__TMTCIFEnum__Group__3__Impl rule__TMTCIFEnum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__TMTCIFEnum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__3"


    // $ANTLR start "rule__TMTCIFEnum__Group__3__Impl"
    // InternalENUM.g:249:1: rule__TMTCIFEnum__Group__3__Impl : ( '>' ) ;
    public final void rule__TMTCIFEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:253:1: ( ( '>' ) )
            // InternalENUM.g:254:1: ( '>' )
            {
            // InternalENUM.g:254:1: ( '>' )
            // InternalENUM.g:255:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFEnum__Group__4"
    // InternalENUM.g:264:1: rule__TMTCIFEnum__Group__4 : rule__TMTCIFEnum__Group__4__Impl rule__TMTCIFEnum__Group__5 ;
    public final void rule__TMTCIFEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:268:1: ( rule__TMTCIFEnum__Group__4__Impl rule__TMTCIFEnum__Group__5 )
            // InternalENUM.g:269:2: rule__TMTCIFEnum__Group__4__Impl rule__TMTCIFEnum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFEnum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__4"


    // $ANTLR start "rule__TMTCIFEnum__Group__4__Impl"
    // InternalENUM.g:276:1: rule__TMTCIFEnum__Group__4__Impl : ( ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) ) ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* ) ) ;
    public final void rule__TMTCIFEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:280:1: ( ( ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) ) ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* ) ) )
            // InternalENUM.g:281:1: ( ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) ) ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* ) )
            {
            // InternalENUM.g:281:1: ( ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) ) ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* ) )
            // InternalENUM.g:282:2: ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) ) ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* )
            {
            // InternalENUM.g:282:2: ( ( rule__TMTCIFEnum__ValuesAssignment_4 ) )
            // InternalENUM.g:283:3: ( rule__TMTCIFEnum__ValuesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); 
            }
            // InternalENUM.g:284:3: ( rule__TMTCIFEnum__ValuesAssignment_4 )
            // InternalENUM.g:284:4: rule__TMTCIFEnum__ValuesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFEnum__ValuesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); 
            }

            }

            // InternalENUM.g:287:2: ( ( rule__TMTCIFEnum__ValuesAssignment_4 )* )
            // InternalENUM.g:288:3: ( rule__TMTCIFEnum__ValuesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); 
            }
            // InternalENUM.g:289:3: ( rule__TMTCIFEnum__ValuesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalENUM.g:289:4: rule__TMTCIFEnum__ValuesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__TMTCIFEnum__ValuesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFEnum__Group__5"
    // InternalENUM.g:298:1: rule__TMTCIFEnum__Group__5 : rule__TMTCIFEnum__Group__5__Impl ;
    public final void rule__TMTCIFEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:302:1: ( rule__TMTCIFEnum__Group__5__Impl )
            // InternalENUM.g:303:2: rule__TMTCIFEnum__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnum__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__5"


    // $ANTLR start "rule__TMTCIFEnum__Group__5__Impl"
    // InternalENUM.g:309:1: rule__TMTCIFEnum__Group__5__Impl : ( '</Enum>' ) ;
    public final void rule__TMTCIFEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:313:1: ( ( '</Enum>' ) )
            // InternalENUM.g:314:1: ( '</Enum>' )
            {
            // InternalENUM.g:314:1: ( '</Enum>' )
            // InternalENUM.g:315:2: '</Enum>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getEnumKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__0"
    // InternalENUM.g:325:1: rule__TMTCIFEnumValue__Group__0 : rule__TMTCIFEnumValue__Group__0__Impl rule__TMTCIFEnumValue__Group__1 ;
    public final void rule__TMTCIFEnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:329:1: ( rule__TMTCIFEnumValue__Group__0__Impl rule__TMTCIFEnumValue__Group__1 )
            // InternalENUM.g:330:2: rule__TMTCIFEnumValue__Group__0__Impl rule__TMTCIFEnumValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TMTCIFEnumValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__0"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__0__Impl"
    // InternalENUM.g:337:1: rule__TMTCIFEnumValue__Group__0__Impl : ( '<Value' ) ;
    public final void rule__TMTCIFEnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:341:1: ( ( '<Value' ) )
            // InternalENUM.g:342:1: ( '<Value' )
            {
            // InternalENUM.g:342:1: ( '<Value' )
            // InternalENUM.g:343:2: '<Value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__1"
    // InternalENUM.g:352:1: rule__TMTCIFEnumValue__Group__1 : rule__TMTCIFEnumValue__Group__1__Impl rule__TMTCIFEnumValue__Group__2 ;
    public final void rule__TMTCIFEnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:356:1: ( rule__TMTCIFEnumValue__Group__1__Impl rule__TMTCIFEnumValue__Group__2 )
            // InternalENUM.g:357:2: rule__TMTCIFEnumValue__Group__1__Impl rule__TMTCIFEnumValue__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__TMTCIFEnumValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__1"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__1__Impl"
    // InternalENUM.g:364:1: rule__TMTCIFEnumValue__Group__1__Impl : ( 'name=' ) ;
    public final void rule__TMTCIFEnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:368:1: ( ( 'name=' ) )
            // InternalENUM.g:369:1: ( 'name=' )
            {
            // InternalENUM.g:369:1: ( 'name=' )
            // InternalENUM.g:370:2: 'name='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1()); 
            }
            match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getNameKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__2"
    // InternalENUM.g:379:1: rule__TMTCIFEnumValue__Group__2 : rule__TMTCIFEnumValue__Group__2__Impl rule__TMTCIFEnumValue__Group__3 ;
    public final void rule__TMTCIFEnumValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:383:1: ( rule__TMTCIFEnumValue__Group__2__Impl rule__TMTCIFEnumValue__Group__3 )
            // InternalENUM.g:384:2: rule__TMTCIFEnumValue__Group__2__Impl rule__TMTCIFEnumValue__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFEnumValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__2"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__2__Impl"
    // InternalENUM.g:391:1: rule__TMTCIFEnumValue__Group__2__Impl : ( ( rule__TMTCIFEnumValue__NameAssignment_2 ) ) ;
    public final void rule__TMTCIFEnumValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:395:1: ( ( ( rule__TMTCIFEnumValue__NameAssignment_2 ) ) )
            // InternalENUM.g:396:1: ( ( rule__TMTCIFEnumValue__NameAssignment_2 ) )
            {
            // InternalENUM.g:396:1: ( ( rule__TMTCIFEnumValue__NameAssignment_2 ) )
            // InternalENUM.g:397:2: ( rule__TMTCIFEnumValue__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getNameAssignment_2()); 
            }
            // InternalENUM.g:398:2: ( rule__TMTCIFEnumValue__NameAssignment_2 )
            // InternalENUM.g:398:3: rule__TMTCIFEnumValue__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__3"
    // InternalENUM.g:406:1: rule__TMTCIFEnumValue__Group__3 : rule__TMTCIFEnumValue__Group__3__Impl rule__TMTCIFEnumValue__Group__4 ;
    public final void rule__TMTCIFEnumValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:410:1: ( rule__TMTCIFEnumValue__Group__3__Impl rule__TMTCIFEnumValue__Group__4 )
            // InternalENUM.g:411:2: rule__TMTCIFEnumValue__Group__3__Impl rule__TMTCIFEnumValue__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFEnumValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__3"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__3__Impl"
    // InternalENUM.g:418:1: rule__TMTCIFEnumValue__Group__3__Impl : ( '>' ) ;
    public final void rule__TMTCIFEnumValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:422:1: ( ( '>' ) )
            // InternalENUM.g:423:1: ( '>' )
            {
            // InternalENUM.g:423:1: ( '>' )
            // InternalENUM.g:424:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__4"
    // InternalENUM.g:433:1: rule__TMTCIFEnumValue__Group__4 : rule__TMTCIFEnumValue__Group__4__Impl rule__TMTCIFEnumValue__Group__5 ;
    public final void rule__TMTCIFEnumValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:437:1: ( rule__TMTCIFEnumValue__Group__4__Impl rule__TMTCIFEnumValue__Group__5 )
            // InternalENUM.g:438:2: rule__TMTCIFEnumValue__Group__4__Impl rule__TMTCIFEnumValue__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TMTCIFEnumValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__4"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__4__Impl"
    // InternalENUM.g:445:1: rule__TMTCIFEnumValue__Group__4__Impl : ( ( rule__TMTCIFEnumValue__RawAssignment_4 ) ) ;
    public final void rule__TMTCIFEnumValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:449:1: ( ( ( rule__TMTCIFEnumValue__RawAssignment_4 ) ) )
            // InternalENUM.g:450:1: ( ( rule__TMTCIFEnumValue__RawAssignment_4 ) )
            {
            // InternalENUM.g:450:1: ( ( rule__TMTCIFEnumValue__RawAssignment_4 ) )
            // InternalENUM.g:451:2: ( rule__TMTCIFEnumValue__RawAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getRawAssignment_4()); 
            }
            // InternalENUM.g:452:2: ( rule__TMTCIFEnumValue__RawAssignment_4 )
            // InternalENUM.g:452:3: rule__TMTCIFEnumValue__RawAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__RawAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getRawAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__5"
    // InternalENUM.g:460:1: rule__TMTCIFEnumValue__Group__5 : rule__TMTCIFEnumValue__Group__5__Impl ;
    public final void rule__TMTCIFEnumValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:464:1: ( rule__TMTCIFEnumValue__Group__5__Impl )
            // InternalENUM.g:465:2: rule__TMTCIFEnumValue__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFEnumValue__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__5"


    // $ANTLR start "rule__TMTCIFEnumValue__Group__5__Impl"
    // InternalENUM.g:471:1: rule__TMTCIFEnumValue__Group__5__Impl : ( '</Value>' ) ;
    public final void rule__TMTCIFEnumValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:475:1: ( ( '</Value>' ) )
            // InternalENUM.g:476:1: ( '</Value>' )
            {
            // InternalENUM.g:476:1: ( '</Value>' )
            // InternalENUM.g:477:2: '</Value>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getValueKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__Group__5__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalENUM.g:487:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:491:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalENUM.g:492:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__INTEGER__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0"


    // $ANTLR start "rule__INTEGER__Group_0__0__Impl"
    // InternalENUM.g:499:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:503:1: ( ( ( '-' )? ) )
            // InternalENUM.g:504:1: ( ( '-' )? )
            {
            // InternalENUM.g:504:1: ( ( '-' )? )
            // InternalENUM.g:505:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalENUM.g:506:2: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalENUM.g:506:3: '-'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__0__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__1"
    // InternalENUM.g:514:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:518:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalENUM.g:519:2: rule__INTEGER__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTEGER__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1"


    // $ANTLR start "rule__INTEGER__Group_0__1__Impl"
    // InternalENUM.g:525:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:529:1: ( ( RULE_INT ) )
            // InternalENUM.g:530:1: ( RULE_INT )
            {
            // InternalENUM.g:530:1: ( RULE_INT )
            // InternalENUM.g:531:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER__Group_0__1__Impl"


    // $ANTLR start "rule__TMTCIFEnum__NameAssignment_2"
    // InternalENUM.g:541:1: rule__TMTCIFEnum__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFEnum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:545:1: ( ( RULE_STRING ) )
            // InternalENUM.g:546:2: ( RULE_STRING )
            {
            // InternalENUM.g:546:2: ( RULE_STRING )
            // InternalENUM.g:547:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__NameAssignment_2"


    // $ANTLR start "rule__TMTCIFEnum__ValuesAssignment_4"
    // InternalENUM.g:556:1: rule__TMTCIFEnum__ValuesAssignment_4 : ( ruleTMTCIFEnumValue ) ;
    public final void rule__TMTCIFEnum__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:560:1: ( ( ruleTMTCIFEnumValue ) )
            // InternalENUM.g:561:2: ( ruleTMTCIFEnumValue )
            {
            // InternalENUM.g:561:2: ( ruleTMTCIFEnumValue )
            // InternalENUM.g:562:3: ruleTMTCIFEnumValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFEnumValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumAccess().getValuesTMTCIFEnumValueParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnum__ValuesAssignment_4"


    // $ANTLR start "rule__TMTCIFEnumValue__NameAssignment_2"
    // InternalENUM.g:571:1: rule__TMTCIFEnumValue__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFEnumValue__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:575:1: ( ( RULE_STRING ) )
            // InternalENUM.g:576:2: ( RULE_STRING )
            {
            // InternalENUM.g:576:2: ( RULE_STRING )
            // InternalENUM.g:577:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__NameAssignment_2"


    // $ANTLR start "rule__TMTCIFEnumValue__RawAssignment_4"
    // InternalENUM.g:586:1: rule__TMTCIFEnumValue__RawAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFEnumValue__RawAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENUM.g:590:1: ( ( ruleINTEGER ) )
            // InternalENUM.g:591:2: ( ruleINTEGER )
            {
            // InternalENUM.g:591:2: ( ruleINTEGER )
            // InternalENUM.g:592:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFEnumValueAccess().getRawINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFEnumValue__RawAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040030L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040020L});
    }


}