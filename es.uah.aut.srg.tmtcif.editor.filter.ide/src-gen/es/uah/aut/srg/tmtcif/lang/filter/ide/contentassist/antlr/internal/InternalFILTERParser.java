package es.uah.aut.srg.tmtcif.lang.filter.ide.contentassist.antlr.internal;

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
public class InternalFILTERParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'decimal'", "'hex'", "'binary'", "'char'", "'string'", "'equal'", "'different'", "'bigger_than'", "'smaller_than'", "'bigger_or_equal'", "'smaller_or_equal'", "'data'", "'size'", "'crc'", "'import'", "':='", "';'", "'TMTCIFFilterMaxtermFilter'", "'{'", "'}'", "'uri'", "'formatFile'", "'version'", "'TMTCIFFilterMintermFilter'", "'TMTCIFFilterBoolVar'", "'id'", "'name'", "'constantType'", "'FieldRef'", "'TMTCIFFilterBoolVarFromArrayItem'", "'AIFieldRef'", "'TMTCIFFilterBoolVarFromGroupedArrayItem'", "'group'", "'AIFieldRefs'", "'TMTCIFFilterBoolVarFDIC'", "'TMTCIFFilterFieldOp'", "'type'", "'TMTCIFFilterConstant'", "'value'", "'mask'", "'TMTCIFFilterSelect'", "'fromFile'", "'offset'", "'TMTCIFFilterSelectLine'", "'line'", "'leftTrim'", "'rightTrim'", "'TMTCIFFilterMaxterm'", "'TMTCIFFilterMinterm'", "'TMTCIFFilterBoolVarRef'", "'idRef'", "'.'", "'('", "')'", "'::'", "'-'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
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


    	private FILTERGrammarAccess grammarAccess;

    	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTMTCIFModelFile"
    // InternalFILTER.g:61:1: entryRuleTMTCIFModelFile : ruleTMTCIFModelFile EOF ;
    public final void entryRuleTMTCIFModelFile() throws RecognitionException {
        try {
            // InternalFILTER.g:62:1: ( ruleTMTCIFModelFile EOF )
            // InternalFILTER.g:63:1: ruleTMTCIFModelFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFModelFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileRule()); 
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
    // $ANTLR end "entryRuleTMTCIFModelFile"


    // $ANTLR start "ruleTMTCIFModelFile"
    // InternalFILTER.g:70:1: ruleTMTCIFModelFile : ( ( rule__TMTCIFModelFile__Group__0 ) ) ;
    public final void ruleTMTCIFModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:74:2: ( ( ( rule__TMTCIFModelFile__Group__0 ) ) )
            // InternalFILTER.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            {
            // InternalFILTER.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            // InternalFILTER.g:76:3: ( rule__TMTCIFModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getGroup()); 
            }
            // InternalFILTER.g:77:3: ( rule__TMTCIFModelFile__Group__0 )
            // InternalFILTER.g:77:4: rule__TMTCIFModelFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFModelFile"


    // $ANTLR start "entryRuleTMTCIFModelFileImport"
    // InternalFILTER.g:86:1: entryRuleTMTCIFModelFileImport : ruleTMTCIFModelFileImport EOF ;
    public final void entryRuleTMTCIFModelFileImport() throws RecognitionException {
        try {
            // InternalFILTER.g:87:1: ( ruleTMTCIFModelFileImport EOF )
            // InternalFILTER.g:88:1: ruleTMTCIFModelFileImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFModelFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportRule()); 
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
    // $ANTLR end "entryRuleTMTCIFModelFileImport"


    // $ANTLR start "ruleTMTCIFModelFileImport"
    // InternalFILTER.g:95:1: ruleTMTCIFModelFileImport : ( ( rule__TMTCIFModelFileImport__Group__0 ) ) ;
    public final void ruleTMTCIFModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:99:2: ( ( ( rule__TMTCIFModelFileImport__Group__0 ) ) )
            // InternalFILTER.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            {
            // InternalFILTER.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            // InternalFILTER.g:101:3: ( rule__TMTCIFModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); 
            }
            // InternalFILTER.g:102:3: ( rule__TMTCIFModelFileImport__Group__0 )
            // InternalFILTER.g:102:4: rule__TMTCIFModelFileImport__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFModelFileImport"


    // $ANTLR start "entryRuleTMTCIFFilterFilter"
    // InternalFILTER.g:111:1: entryRuleTMTCIFFilterFilter : ruleTMTCIFFilterFilter EOF ;
    public final void entryRuleTMTCIFFilterFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:112:1: ( ruleTMTCIFFilterFilter EOF )
            // InternalFILTER.g:113:1: ruleTMTCIFFilterFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFilterRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterFilter"


    // $ANTLR start "ruleTMTCIFFilterFilter"
    // InternalFILTER.g:120:1: ruleTMTCIFFilterFilter : ( ( rule__TMTCIFFilterFilter__Alternatives ) ) ;
    public final void ruleTMTCIFFilterFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:124:2: ( ( ( rule__TMTCIFFilterFilter__Alternatives ) ) )
            // InternalFILTER.g:125:2: ( ( rule__TMTCIFFilterFilter__Alternatives ) )
            {
            // InternalFILTER.g:125:2: ( ( rule__TMTCIFFilterFilter__Alternatives ) )
            // InternalFILTER.g:126:3: ( rule__TMTCIFFilterFilter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFilterAccess().getAlternatives()); 
            }
            // InternalFILTER.g:127:3: ( rule__TMTCIFFilterFilter__Alternatives )
            // InternalFILTER.g:127:4: rule__TMTCIFFilterFilter__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFilter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFilterAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTMTCIFFilterFilter"


    // $ANTLR start "entryRuleTMTCIFFilterMaxtermFilter"
    // InternalFILTER.g:136:1: entryRuleTMTCIFFilterMaxtermFilter : ruleTMTCIFFilterMaxtermFilter EOF ;
    public final void entryRuleTMTCIFFilterMaxtermFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:137:1: ( ruleTMTCIFFilterMaxtermFilter EOF )
            // InternalFILTER.g:138:1: ruleTMTCIFFilterMaxtermFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterMaxtermFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterMaxtermFilter"


    // $ANTLR start "ruleTMTCIFFilterMaxtermFilter"
    // InternalFILTER.g:145:1: ruleTMTCIFFilterMaxtermFilter : ( ( rule__TMTCIFFilterMaxtermFilter__Group__0 ) ) ;
    public final void ruleTMTCIFFilterMaxtermFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:149:2: ( ( ( rule__TMTCIFFilterMaxtermFilter__Group__0 ) ) )
            // InternalFILTER.g:150:2: ( ( rule__TMTCIFFilterMaxtermFilter__Group__0 ) )
            {
            // InternalFILTER.g:150:2: ( ( rule__TMTCIFFilterMaxtermFilter__Group__0 ) )
            // InternalFILTER.g:151:3: ( rule__TMTCIFFilterMaxtermFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup()); 
            }
            // InternalFILTER.g:152:3: ( rule__TMTCIFFilterMaxtermFilter__Group__0 )
            // InternalFILTER.g:152:4: rule__TMTCIFFilterMaxtermFilter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterMaxtermFilter"


    // $ANTLR start "entryRuleTMTCIFFilterMintermFilter"
    // InternalFILTER.g:161:1: entryRuleTMTCIFFilterMintermFilter : ruleTMTCIFFilterMintermFilter EOF ;
    public final void entryRuleTMTCIFFilterMintermFilter() throws RecognitionException {
        try {
            // InternalFILTER.g:162:1: ( ruleTMTCIFFilterMintermFilter EOF )
            // InternalFILTER.g:163:1: ruleTMTCIFFilterMintermFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterMintermFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterMintermFilter"


    // $ANTLR start "ruleTMTCIFFilterMintermFilter"
    // InternalFILTER.g:170:1: ruleTMTCIFFilterMintermFilter : ( ( rule__TMTCIFFilterMintermFilter__Group__0 ) ) ;
    public final void ruleTMTCIFFilterMintermFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:174:2: ( ( ( rule__TMTCIFFilterMintermFilter__Group__0 ) ) )
            // InternalFILTER.g:175:2: ( ( rule__TMTCIFFilterMintermFilter__Group__0 ) )
            {
            // InternalFILTER.g:175:2: ( ( rule__TMTCIFFilterMintermFilter__Group__0 ) )
            // InternalFILTER.g:176:3: ( rule__TMTCIFFilterMintermFilter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup()); 
            }
            // InternalFILTER.g:177:3: ( rule__TMTCIFFilterMintermFilter__Group__0 )
            // InternalFILTER.g:177:4: rule__TMTCIFFilterMintermFilter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterMintermFilter"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVar"
    // InternalFILTER.g:186:1: entryRuleTMTCIFFilterBoolVar : ruleTMTCIFFilterBoolVar EOF ;
    public final void entryRuleTMTCIFFilterBoolVar() throws RecognitionException {
        try {
            // InternalFILTER.g:187:1: ( ruleTMTCIFFilterBoolVar EOF )
            // InternalFILTER.g:188:1: ruleTMTCIFFilterBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVar"


    // $ANTLR start "ruleTMTCIFFilterBoolVar"
    // InternalFILTER.g:195:1: ruleTMTCIFFilterBoolVar : ( ( rule__TMTCIFFilterBoolVar__Group__0 ) ) ;
    public final void ruleTMTCIFFilterBoolVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:199:2: ( ( ( rule__TMTCIFFilterBoolVar__Group__0 ) ) )
            // InternalFILTER.g:200:2: ( ( rule__TMTCIFFilterBoolVar__Group__0 ) )
            {
            // InternalFILTER.g:200:2: ( ( rule__TMTCIFFilterBoolVar__Group__0 ) )
            // InternalFILTER.g:201:3: ( rule__TMTCIFFilterBoolVar__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getGroup()); 
            }
            // InternalFILTER.g:202:3: ( rule__TMTCIFFilterBoolVar__Group__0 )
            // InternalFILTER.g:202:4: rule__TMTCIFFilterBoolVar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterBoolVar"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFromArrayItem"
    // InternalFILTER.g:211:1: entryRuleTMTCIFFilterBoolVarFromArrayItem : ruleTMTCIFFilterBoolVarFromArrayItem EOF ;
    public final void entryRuleTMTCIFFilterBoolVarFromArrayItem() throws RecognitionException {
        try {
            // InternalFILTER.g:212:1: ( ruleTMTCIFFilterBoolVarFromArrayItem EOF )
            // InternalFILTER.g:213:1: ruleTMTCIFFilterBoolVarFromArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFromArrayItem"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFromArrayItem"
    // InternalFILTER.g:220:1: ruleTMTCIFFilterBoolVarFromArrayItem : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 ) ) ;
    public final void ruleTMTCIFFilterBoolVarFromArrayItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:224:2: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 ) ) )
            // InternalFILTER.g:225:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 ) )
            {
            // InternalFILTER.g:225:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 ) )
            // InternalFILTER.g:226:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getGroup()); 
            }
            // InternalFILTER.g:227:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 )
            // InternalFILTER.g:227:4: rule__TMTCIFFilterBoolVarFromArrayItem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFromArrayItem"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:236:1: entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem : ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF ;
    public final void entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        try {
            // InternalFILTER.g:237:1: ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTER.g:238:1: ruleTMTCIFFilterBoolVarFromGroupedArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFromGroupedArrayItem"
    // InternalFILTER.g:245:1: ruleTMTCIFFilterBoolVarFromGroupedArrayItem : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 ) ) ;
    public final void ruleTMTCIFFilterBoolVarFromGroupedArrayItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:249:2: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 ) ) )
            // InternalFILTER.g:250:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 ) )
            {
            // InternalFILTER.g:250:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 ) )
            // InternalFILTER.g:251:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroup()); 
            }
            // InternalFILTER.g:252:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 )
            // InternalFILTER.g:252:4: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarFDIC"
    // InternalFILTER.g:261:1: entryRuleTMTCIFFilterBoolVarFDIC : ruleTMTCIFFilterBoolVarFDIC EOF ;
    public final void entryRuleTMTCIFFilterBoolVarFDIC() throws RecognitionException {
        try {
            // InternalFILTER.g:262:1: ( ruleTMTCIFFilterBoolVarFDIC EOF )
            // InternalFILTER.g:263:1: ruleTMTCIFFilterBoolVarFDIC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarFDIC"


    // $ANTLR start "ruleTMTCIFFilterBoolVarFDIC"
    // InternalFILTER.g:270:1: ruleTMTCIFFilterBoolVarFDIC : ( ( rule__TMTCIFFilterBoolVarFDIC__Group__0 ) ) ;
    public final void ruleTMTCIFFilterBoolVarFDIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:274:2: ( ( ( rule__TMTCIFFilterBoolVarFDIC__Group__0 ) ) )
            // InternalFILTER.g:275:2: ( ( rule__TMTCIFFilterBoolVarFDIC__Group__0 ) )
            {
            // InternalFILTER.g:275:2: ( ( rule__TMTCIFFilterBoolVarFDIC__Group__0 ) )
            // InternalFILTER.g:276:3: ( rule__TMTCIFFilterBoolVarFDIC__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getGroup()); 
            }
            // InternalFILTER.g:277:3: ( rule__TMTCIFFilterBoolVarFDIC__Group__0 )
            // InternalFILTER.g:277:4: rule__TMTCIFFilterBoolVarFDIC__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarFDIC"


    // $ANTLR start "entryRuleTMTCIFFilterFieldOp"
    // InternalFILTER.g:286:1: entryRuleTMTCIFFilterFieldOp : ruleTMTCIFFilterFieldOp EOF ;
    public final void entryRuleTMTCIFFilterFieldOp() throws RecognitionException {
        try {
            // InternalFILTER.g:287:1: ( ruleTMTCIFFilterFieldOp EOF )
            // InternalFILTER.g:288:1: ruleTMTCIFFilterFieldOp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterFieldOp"


    // $ANTLR start "ruleTMTCIFFilterFieldOp"
    // InternalFILTER.g:295:1: ruleTMTCIFFilterFieldOp : ( ( rule__TMTCIFFilterFieldOp__Group__0 ) ) ;
    public final void ruleTMTCIFFilterFieldOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:299:2: ( ( ( rule__TMTCIFFilterFieldOp__Group__0 ) ) )
            // InternalFILTER.g:300:2: ( ( rule__TMTCIFFilterFieldOp__Group__0 ) )
            {
            // InternalFILTER.g:300:2: ( ( rule__TMTCIFFilterFieldOp__Group__0 ) )
            // InternalFILTER.g:301:3: ( rule__TMTCIFFilterFieldOp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getGroup()); 
            }
            // InternalFILTER.g:302:3: ( rule__TMTCIFFilterFieldOp__Group__0 )
            // InternalFILTER.g:302:4: rule__TMTCIFFilterFieldOp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterFieldOp"


    // $ANTLR start "entryRuleTMTCIFFilterConstant"
    // InternalFILTER.g:311:1: entryRuleTMTCIFFilterConstant : ruleTMTCIFFilterConstant EOF ;
    public final void entryRuleTMTCIFFilterConstant() throws RecognitionException {
        try {
            // InternalFILTER.g:312:1: ( ruleTMTCIFFilterConstant EOF )
            // InternalFILTER.g:313:1: ruleTMTCIFFilterConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterConstant"


    // $ANTLR start "ruleTMTCIFFilterConstant"
    // InternalFILTER.g:320:1: ruleTMTCIFFilterConstant : ( ( rule__TMTCIFFilterConstant__Group__0 ) ) ;
    public final void ruleTMTCIFFilterConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:324:2: ( ( ( rule__TMTCIFFilterConstant__Group__0 ) ) )
            // InternalFILTER.g:325:2: ( ( rule__TMTCIFFilterConstant__Group__0 ) )
            {
            // InternalFILTER.g:325:2: ( ( rule__TMTCIFFilterConstant__Group__0 ) )
            // InternalFILTER.g:326:3: ( rule__TMTCIFFilterConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getGroup()); 
            }
            // InternalFILTER.g:327:3: ( rule__TMTCIFFilterConstant__Group__0 )
            // InternalFILTER.g:327:4: rule__TMTCIFFilterConstant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterConstant"


    // $ANTLR start "entryRuleTMTCIFFilterSelect"
    // InternalFILTER.g:336:1: entryRuleTMTCIFFilterSelect : ruleTMTCIFFilterSelect EOF ;
    public final void entryRuleTMTCIFFilterSelect() throws RecognitionException {
        try {
            // InternalFILTER.g:337:1: ( ruleTMTCIFFilterSelect EOF )
            // InternalFILTER.g:338:1: ruleTMTCIFFilterSelect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterSelect"


    // $ANTLR start "ruleTMTCIFFilterSelect"
    // InternalFILTER.g:345:1: ruleTMTCIFFilterSelect : ( ( rule__TMTCIFFilterSelect__Group__0 ) ) ;
    public final void ruleTMTCIFFilterSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:349:2: ( ( ( rule__TMTCIFFilterSelect__Group__0 ) ) )
            // InternalFILTER.g:350:2: ( ( rule__TMTCIFFilterSelect__Group__0 ) )
            {
            // InternalFILTER.g:350:2: ( ( rule__TMTCIFFilterSelect__Group__0 ) )
            // InternalFILTER.g:351:3: ( rule__TMTCIFFilterSelect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup()); 
            }
            // InternalFILTER.g:352:3: ( rule__TMTCIFFilterSelect__Group__0 )
            // InternalFILTER.g:352:4: rule__TMTCIFFilterSelect__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterSelect"


    // $ANTLR start "entryRuleTMTCIFFilterSelectLine"
    // InternalFILTER.g:361:1: entryRuleTMTCIFFilterSelectLine : ruleTMTCIFFilterSelectLine EOF ;
    public final void entryRuleTMTCIFFilterSelectLine() throws RecognitionException {
        try {
            // InternalFILTER.g:362:1: ( ruleTMTCIFFilterSelectLine EOF )
            // InternalFILTER.g:363:1: ruleTMTCIFFilterSelectLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterSelectLine"


    // $ANTLR start "ruleTMTCIFFilterSelectLine"
    // InternalFILTER.g:370:1: ruleTMTCIFFilterSelectLine : ( ( rule__TMTCIFFilterSelectLine__Group__0 ) ) ;
    public final void ruleTMTCIFFilterSelectLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:374:2: ( ( ( rule__TMTCIFFilterSelectLine__Group__0 ) ) )
            // InternalFILTER.g:375:2: ( ( rule__TMTCIFFilterSelectLine__Group__0 ) )
            {
            // InternalFILTER.g:375:2: ( ( rule__TMTCIFFilterSelectLine__Group__0 ) )
            // InternalFILTER.g:376:3: ( rule__TMTCIFFilterSelectLine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup()); 
            }
            // InternalFILTER.g:377:3: ( rule__TMTCIFFilterSelectLine__Group__0 )
            // InternalFILTER.g:377:4: rule__TMTCIFFilterSelectLine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterSelectLine"


    // $ANTLR start "entryRuleTMTCIFFilterMaxterm"
    // InternalFILTER.g:386:1: entryRuleTMTCIFFilterMaxterm : ruleTMTCIFFilterMaxterm EOF ;
    public final void entryRuleTMTCIFFilterMaxterm() throws RecognitionException {
        try {
            // InternalFILTER.g:387:1: ( ruleTMTCIFFilterMaxterm EOF )
            // InternalFILTER.g:388:1: ruleTMTCIFFilterMaxterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterMaxterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterMaxterm"


    // $ANTLR start "ruleTMTCIFFilterMaxterm"
    // InternalFILTER.g:395:1: ruleTMTCIFFilterMaxterm : ( ( rule__TMTCIFFilterMaxterm__Group__0 ) ) ;
    public final void ruleTMTCIFFilterMaxterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:399:2: ( ( ( rule__TMTCIFFilterMaxterm__Group__0 ) ) )
            // InternalFILTER.g:400:2: ( ( rule__TMTCIFFilterMaxterm__Group__0 ) )
            {
            // InternalFILTER.g:400:2: ( ( rule__TMTCIFFilterMaxterm__Group__0 ) )
            // InternalFILTER.g:401:3: ( rule__TMTCIFFilterMaxterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getGroup()); 
            }
            // InternalFILTER.g:402:3: ( rule__TMTCIFFilterMaxterm__Group__0 )
            // InternalFILTER.g:402:4: rule__TMTCIFFilterMaxterm__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterMaxterm"


    // $ANTLR start "entryRuleTMTCIFFilterMinterm"
    // InternalFILTER.g:411:1: entryRuleTMTCIFFilterMinterm : ruleTMTCIFFilterMinterm EOF ;
    public final void entryRuleTMTCIFFilterMinterm() throws RecognitionException {
        try {
            // InternalFILTER.g:412:1: ( ruleTMTCIFFilterMinterm EOF )
            // InternalFILTER.g:413:1: ruleTMTCIFFilterMinterm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterMinterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterMinterm"


    // $ANTLR start "ruleTMTCIFFilterMinterm"
    // InternalFILTER.g:420:1: ruleTMTCIFFilterMinterm : ( ( rule__TMTCIFFilterMinterm__Group__0 ) ) ;
    public final void ruleTMTCIFFilterMinterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:424:2: ( ( ( rule__TMTCIFFilterMinterm__Group__0 ) ) )
            // InternalFILTER.g:425:2: ( ( rule__TMTCIFFilterMinterm__Group__0 ) )
            {
            // InternalFILTER.g:425:2: ( ( rule__TMTCIFFilterMinterm__Group__0 ) )
            // InternalFILTER.g:426:3: ( rule__TMTCIFFilterMinterm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getGroup()); 
            }
            // InternalFILTER.g:427:3: ( rule__TMTCIFFilterMinterm__Group__0 )
            // InternalFILTER.g:427:4: rule__TMTCIFFilterMinterm__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterMinterm"


    // $ANTLR start "entryRuleTMTCIFFilterBoolVarRef"
    // InternalFILTER.g:436:1: entryRuleTMTCIFFilterBoolVarRef : ruleTMTCIFFilterBoolVarRef EOF ;
    public final void entryRuleTMTCIFFilterBoolVarRef() throws RecognitionException {
        try {
            // InternalFILTER.g:437:1: ( ruleTMTCIFFilterBoolVarRef EOF )
            // InternalFILTER.g:438:1: ruleTMTCIFFilterBoolVarRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefRule()); 
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
    // $ANTLR end "entryRuleTMTCIFFilterBoolVarRef"


    // $ANTLR start "ruleTMTCIFFilterBoolVarRef"
    // InternalFILTER.g:445:1: ruleTMTCIFFilterBoolVarRef : ( ( rule__TMTCIFFilterBoolVarRef__Group__0 ) ) ;
    public final void ruleTMTCIFFilterBoolVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:449:2: ( ( ( rule__TMTCIFFilterBoolVarRef__Group__0 ) ) )
            // InternalFILTER.g:450:2: ( ( rule__TMTCIFFilterBoolVarRef__Group__0 ) )
            {
            // InternalFILTER.g:450:2: ( ( rule__TMTCIFFilterBoolVarRef__Group__0 ) )
            // InternalFILTER.g:451:3: ( rule__TMTCIFFilterBoolVarRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getGroup()); 
            }
            // InternalFILTER.g:452:3: ( rule__TMTCIFFilterBoolVarRef__Group__0 )
            // InternalFILTER.g:452:4: rule__TMTCIFFilterBoolVarRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getGroup()); 
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
    // $ANTLR end "ruleTMTCIFFilterBoolVarRef"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFILTER.g:461:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalFILTER.g:462:1: ( ruleQualifiedName EOF )
            // InternalFILTER.g:463:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalFILTER.g:470:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:474:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalFILTER.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalFILTER.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalFILTER.g:476:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalFILTER.g:477:3: ( rule__QualifiedName__Group__0 )
            // InternalFILTER.g:477:4: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalFILTER.g:486:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalFILTER.g:487:1: ( ruleVersion EOF )
            // InternalFILTER.g:488:1: ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalFILTER.g:495:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:499:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalFILTER.g:500:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalFILTER.g:500:2: ( ( rule__Version__Group__0 ) )
            // InternalFILTER.g:501:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalFILTER.g:502:3: ( rule__Version__Group__0 )
            // InternalFILTER.g:502:4: rule__Version__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup()); 
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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalFILTER.g:511:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalFILTER.g:512:1: ( ruleVersionedQualifiedName EOF )
            // InternalFILTER.g:513:1: ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleVersionedQualifiedName"


    // $ANTLR start "ruleVersionedQualifiedName"
    // InternalFILTER.g:520:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:524:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalFILTER.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalFILTER.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalFILTER.g:526:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalFILTER.g:527:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalFILTER.g:527:4: rule__VersionedQualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleVersionedQualifiedName"


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // InternalFILTER.g:536:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalFILTER.g:537:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalFILTER.g:538:1: ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
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
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"


    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // InternalFILTER.g:545:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:549:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalFILTER.g:550:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalFILTER.g:550:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalFILTER.g:551:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalFILTER.g:552:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalFILTER.g:552:4: rule__VersionedQualifiedReferenceName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
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
    // $ANTLR end "ruleVersionedQualifiedReferenceName"


    // $ANTLR start "entryRuleINTEGER"
    // InternalFILTER.g:561:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalFILTER.g:562:1: ( ruleINTEGER EOF )
            // InternalFILTER.g:563:1: ruleINTEGER EOF
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
    // InternalFILTER.g:570:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:574:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalFILTER.g:575:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalFILTER.g:575:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalFILTER.g:576:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalFILTER.g:577:3: ( rule__INTEGER__Alternatives )
            // InternalFILTER.g:577:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleTMTCIFFilterConstantType"
    // InternalFILTER.g:586:1: ruleTMTCIFFilterConstantType : ( ( rule__TMTCIFFilterConstantType__Alternatives ) ) ;
    public final void ruleTMTCIFFilterConstantType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:590:1: ( ( ( rule__TMTCIFFilterConstantType__Alternatives ) ) )
            // InternalFILTER.g:591:2: ( ( rule__TMTCIFFilterConstantType__Alternatives ) )
            {
            // InternalFILTER.g:591:2: ( ( rule__TMTCIFFilterConstantType__Alternatives ) )
            // InternalFILTER.g:592:3: ( rule__TMTCIFFilterConstantType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:593:3: ( rule__TMTCIFFilterConstantType__Alternatives )
            // InternalFILTER.g:593:4: rule__TMTCIFFilterConstantType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstantType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTMTCIFFilterConstantType"


    // $ANTLR start "ruleTMTCIFFilterOPType"
    // InternalFILTER.g:602:1: ruleTMTCIFFilterOPType : ( ( rule__TMTCIFFilterOPType__Alternatives ) ) ;
    public final void ruleTMTCIFFilterOPType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:606:1: ( ( ( rule__TMTCIFFilterOPType__Alternatives ) ) )
            // InternalFILTER.g:607:2: ( ( rule__TMTCIFFilterOPType__Alternatives ) )
            {
            // InternalFILTER.g:607:2: ( ( rule__TMTCIFFilterOPType__Alternatives ) )
            // InternalFILTER.g:608:3: ( rule__TMTCIFFilterOPType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterOPTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:609:3: ( rule__TMTCIFFilterOPType__Alternatives )
            // InternalFILTER.g:609:4: rule__TMTCIFFilterOPType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterOPType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterOPTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTMTCIFFilterOPType"


    // $ANTLR start "ruleTMTCIFFilterSelectType"
    // InternalFILTER.g:618:1: ruleTMTCIFFilterSelectType : ( ( rule__TMTCIFFilterSelectType__Alternatives ) ) ;
    public final void ruleTMTCIFFilterSelectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:622:1: ( ( ( rule__TMTCIFFilterSelectType__Alternatives ) ) )
            // InternalFILTER.g:623:2: ( ( rule__TMTCIFFilterSelectType__Alternatives ) )
            {
            // InternalFILTER.g:623:2: ( ( rule__TMTCIFFilterSelectType__Alternatives ) )
            // InternalFILTER.g:624:3: ( rule__TMTCIFFilterSelectType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getAlternatives()); 
            }
            // InternalFILTER.g:625:3: ( rule__TMTCIFFilterSelectType__Alternatives )
            // InternalFILTER.g:625:4: rule__TMTCIFFilterSelectType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTMTCIFFilterSelectType"


    // $ANTLR start "rule__TMTCIFFilterFilter__Alternatives"
    // InternalFILTER.g:633:1: rule__TMTCIFFilterFilter__Alternatives : ( ( ruleTMTCIFFilterMaxtermFilter ) | ( ruleTMTCIFFilterMintermFilter ) );
    public final void rule__TMTCIFFilterFilter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:637:1: ( ( ruleTMTCIFFilterMaxtermFilter ) | ( ruleTMTCIFFilterMintermFilter ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
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
                    // InternalFILTER.g:638:2: ( ruleTMTCIFFilterMaxtermFilter )
                    {
                    // InternalFILTER.g:638:2: ( ruleTMTCIFFilterMaxtermFilter )
                    // InternalFILTER.g:639:3: ruleTMTCIFFilterMaxtermFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTMTCIFFilterMaxtermFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMaxtermFilterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:644:2: ( ruleTMTCIFFilterMintermFilter )
                    {
                    // InternalFILTER.g:644:2: ( ruleTMTCIFFilterMintermFilter )
                    // InternalFILTER.g:645:3: ruleTMTCIFFilterMintermFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTMTCIFFilterMintermFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterFilterAccess().getTMTCIFFilterMintermFilterParserRuleCall_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterFilter__Alternatives"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5"
    // InternalFILTER.g:654:1: rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 : ( ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 ) ) );
    public final void rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:658:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) ) | ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFILTER.g:659:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 ) )
                    {
                    // InternalFILTER.g:659:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 ) )
                    // InternalFILTER.g:660:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); 
                    }
                    // InternalFILTER.g:661:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 )
                    // InternalFILTER.g:661:4: rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:665:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) )
                    {
                    // InternalFILTER.g:665:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) )
                    // InternalFILTER.g:666:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); 
                    }
                    // InternalFILTER.g:667:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 )
                    // InternalFILTER.g:667:4: rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:671:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) )
                    {
                    // InternalFILTER.g:671:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) )
                    // InternalFILTER.g:672:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); 
                    }
                    // InternalFILTER.g:673:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 )
                    // InternalFILTER.g:673:4: rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:677:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 ) )
                    {
                    // InternalFILTER.g:677:2: ( ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 ) )
                    // InternalFILTER.g:678:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); 
                    }
                    // InternalFILTER.g:679:3: ( rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 )
                    // InternalFILTER.g:679:4: rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5"
    // InternalFILTER.g:687:1: rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 : ( ( ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 ) ) );
    public final void rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:691:1: ( ( ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) ) | ( ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 43:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFILTER.g:692:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 ) )
                    {
                    // InternalFILTER.g:692:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 ) )
                    // InternalFILTER.g:693:3: ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); 
                    }
                    // InternalFILTER.g:694:3: ( rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 )
                    // InternalFILTER.g:694:4: rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:698:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) )
                    {
                    // InternalFILTER.g:698:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 ) )
                    // InternalFILTER.g:699:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); 
                    }
                    // InternalFILTER.g:700:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 )
                    // InternalFILTER.g:700:4: rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:704:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) )
                    {
                    // InternalFILTER.g:704:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 ) )
                    // InternalFILTER.g:705:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); 
                    }
                    // InternalFILTER.g:706:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 )
                    // InternalFILTER.g:706:4: rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:710:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 ) )
                    {
                    // InternalFILTER.g:710:2: ( ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 ) )
                    // InternalFILTER.g:711:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); 
                    }
                    // InternalFILTER.g:712:3: ( rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 )
                    // InternalFILTER.g:712:4: rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Alternatives_19"
    // InternalFILTER.g:720:1: rule__TMTCIFFilterBoolVar__Alternatives_19 : ( ( ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 ) ) | ( ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 ) ) | ( ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 ) ) );
    public final void rule__TMTCIFFilterBoolVar__Alternatives_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:724:1: ( ( ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 ) ) | ( ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 ) ) | ( ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFILTER.g:725:2: ( ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 ) )
                    {
                    // InternalFILTER.g:725:2: ( ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 ) )
                    // InternalFILTER.g:726:3: ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantAssignment_19_0()); 
                    }
                    // InternalFILTER.g:727:3: ( rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 )
                    // InternalFILTER.g:727:4: rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantAssignment_19_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:731:2: ( ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 ) )
                    {
                    // InternalFILTER.g:731:2: ( ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 ) )
                    // InternalFILTER.g:732:3: ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectAssignment_19_1()); 
                    }
                    // InternalFILTER.g:733:3: ( rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 )
                    // InternalFILTER.g:733:4: rule__TMTCIFFilterBoolVar__SelectAssignment_19_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVar__SelectAssignment_19_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectAssignment_19_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:737:2: ( ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 ) )
                    {
                    // InternalFILTER.g:737:2: ( ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 ) )
                    // InternalFILTER.g:738:3: ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineAssignment_19_2()); 
                    }
                    // InternalFILTER.g:739:3: ( rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 )
                    // InternalFILTER.g:739:4: rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineAssignment_19_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Alternatives_19"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19"
    // InternalFILTER.g:747:1: rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 : ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) ) | ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) ) | ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) ) );
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:751:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) ) | ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) ) | ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt5=1;
                }
                break;
            case 52:
                {
                alt5=2;
                }
                break;
            case 55:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFILTER.g:752:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) )
                    {
                    // InternalFILTER.g:752:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 ) )
                    // InternalFILTER.g:753:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); 
                    }
                    // InternalFILTER.g:754:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 )
                    // InternalFILTER.g:754:4: rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:758:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) )
                    {
                    // InternalFILTER.g:758:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 ) )
                    // InternalFILTER.g:759:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); 
                    }
                    // InternalFILTER.g:760:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 )
                    // InternalFILTER.g:760:4: rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:764:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) )
                    {
                    // InternalFILTER.g:764:2: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 ) )
                    // InternalFILTER.g:765:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); 
                    }
                    // InternalFILTER.g:766:3: ( rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 )
                    // InternalFILTER.g:766:4: rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23"
    // InternalFILTER.g:774:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 : ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) ) | ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) ) | ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) ) );
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:778:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) ) | ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) ) | ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt6=1;
                }
                break;
            case 52:
                {
                alt6=2;
                }
                break;
            case 55:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFILTER.g:779:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) )
                    {
                    // InternalFILTER.g:779:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 ) )
                    // InternalFILTER.g:780:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); 
                    }
                    // InternalFILTER.g:781:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 )
                    // InternalFILTER.g:781:4: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:785:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) )
                    {
                    // InternalFILTER.g:785:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 ) )
                    // InternalFILTER.g:786:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); 
                    }
                    // InternalFILTER.g:787:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 )
                    // InternalFILTER.g:787:4: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:791:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) )
                    {
                    // InternalFILTER.g:791:2: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 ) )
                    // InternalFILTER.g:792:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); 
                    }
                    // InternalFILTER.g:793:3: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 )
                    // InternalFILTER.g:793:4: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalFILTER.g:801:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:805:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||LA7_1==28||LA7_1==63||LA7_1==65) ) {
                    alt7=1;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFILTER.g:806:2: ( RULE_INT )
                    {
                    // InternalFILTER.g:806:2: ( RULE_INT )
                    // InternalFILTER.g:807:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:812:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalFILTER.g:812:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalFILTER.g:813:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalFILTER.g:814:3: ( rule__Version__Group_0_1__0 )
                    // InternalFILTER.g:814:4: rule__Version__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Version__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__Version__Alternatives_0"


    // $ANTLR start "rule__Version__Alternatives_1_1"
    // InternalFILTER.g:822:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:826:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==28||LA8_1==63||LA8_1==65) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFILTER.g:827:2: ( RULE_INT )
                    {
                    // InternalFILTER.g:827:2: ( RULE_INT )
                    // InternalFILTER.g:828:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:833:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalFILTER.g:833:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalFILTER.g:834:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalFILTER.g:835:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalFILTER.g:835:4: rule__Version__Group_1_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Version__Group_1_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__Version__Alternatives_1_1"


    // $ANTLR start "rule__INTEGER__Alternatives"
    // InternalFILTER.g:843:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:847:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==67) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_HEXADECIMAL) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFILTER.g:848:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalFILTER.g:848:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalFILTER.g:849:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalFILTER.g:850:3: ( rule__INTEGER__Group_0__0 )
                    // InternalFILTER.g:850:4: rule__INTEGER__Group_0__0
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
                    // InternalFILTER.g:854:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:854:2: ( RULE_HEXADECIMAL )
                    // InternalFILTER.g:855:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__TMTCIFFilterConstantType__Alternatives"
    // InternalFILTER.g:864:1: rule__TMTCIFFilterConstantType__Alternatives : ( ( ( 'decimal' ) ) | ( ( 'hex' ) ) | ( ( 'binary' ) ) | ( ( 'char' ) ) | ( ( 'string' ) ) );
    public final void rule__TMTCIFFilterConstantType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:868:1: ( ( ( 'decimal' ) ) | ( ( 'hex' ) ) | ( ( 'binary' ) ) | ( ( 'char' ) ) | ( ( 'string' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt10=1;
                }
                break;
            case 13:
                {
                alt10=2;
                }
                break;
            case 14:
                {
                alt10=3;
                }
                break;
            case 15:
                {
                alt10=4;
                }
                break;
            case 16:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFILTER.g:869:2: ( ( 'decimal' ) )
                    {
                    // InternalFILTER.g:869:2: ( ( 'decimal' ) )
                    // InternalFILTER.g:870:3: ( 'decimal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:871:3: ( 'decimal' )
                    // InternalFILTER.g:871:4: 'decimal'
                    {
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:875:2: ( ( 'hex' ) )
                    {
                    // InternalFILTER.g:875:2: ( ( 'hex' ) )
                    // InternalFILTER.g:876:3: ( 'hex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:877:3: ( 'hex' )
                    // InternalFILTER.g:877:4: 'hex'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:881:2: ( ( 'binary' ) )
                    {
                    // InternalFILTER.g:881:2: ( ( 'binary' ) )
                    // InternalFILTER.g:882:3: ( 'binary' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:883:3: ( 'binary' )
                    // InternalFILTER.g:883:4: 'binary'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:887:2: ( ( 'char' ) )
                    {
                    // InternalFILTER.g:887:2: ( ( 'char' ) )
                    // InternalFILTER.g:888:3: ( 'char' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); 
                    }
                    // InternalFILTER.g:889:3: ( 'char' )
                    // InternalFILTER.g:889:4: 'char'
                    {
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:893:2: ( ( 'string' ) )
                    {
                    // InternalFILTER.g:893:2: ( ( 'string' ) )
                    // InternalFILTER.g:894:3: ( 'string' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); 
                    }
                    // InternalFILTER.g:895:3: ( 'string' )
                    // InternalFILTER.g:895:4: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstantType__Alternatives"


    // $ANTLR start "rule__TMTCIFFilterOPType__Alternatives"
    // InternalFILTER.g:903:1: rule__TMTCIFFilterOPType__Alternatives : ( ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'bigger_than' ) ) | ( ( 'smaller_than' ) ) | ( ( 'bigger_or_equal' ) ) | ( ( 'smaller_or_equal' ) ) );
    public final void rule__TMTCIFFilterOPType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:907:1: ( ( ( 'equal' ) ) | ( ( 'different' ) ) | ( ( 'bigger_than' ) ) | ( ( 'smaller_than' ) ) | ( ( 'bigger_or_equal' ) ) | ( ( 'smaller_or_equal' ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            case 22:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFILTER.g:908:2: ( ( 'equal' ) )
                    {
                    // InternalFILTER.g:908:2: ( ( 'equal' ) )
                    // InternalFILTER.g:909:3: ( 'equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:910:3: ( 'equal' )
                    // InternalFILTER.g:910:4: 'equal'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:914:2: ( ( 'different' ) )
                    {
                    // InternalFILTER.g:914:2: ( ( 'different' ) )
                    // InternalFILTER.g:915:3: ( 'different' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:916:3: ( 'different' )
                    // InternalFILTER.g:916:4: 'different'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:920:2: ( ( 'bigger_than' ) )
                    {
                    // InternalFILTER.g:920:2: ( ( 'bigger_than' ) )
                    // InternalFILTER.g:921:3: ( 'bigger_than' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:922:3: ( 'bigger_than' )
                    // InternalFILTER.g:922:4: 'bigger_than'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTER.g:926:2: ( ( 'smaller_than' ) )
                    {
                    // InternalFILTER.g:926:2: ( ( 'smaller_than' ) )
                    // InternalFILTER.g:927:3: ( 'smaller_than' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); 
                    }
                    // InternalFILTER.g:928:3: ( 'smaller_than' )
                    // InternalFILTER.g:928:4: 'smaller_than'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTER.g:932:2: ( ( 'bigger_or_equal' ) )
                    {
                    // InternalFILTER.g:932:2: ( ( 'bigger_or_equal' ) )
                    // InternalFILTER.g:933:3: ( 'bigger_or_equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); 
                    }
                    // InternalFILTER.g:934:3: ( 'bigger_or_equal' )
                    // InternalFILTER.g:934:4: 'bigger_or_equal'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFILTER.g:938:2: ( ( 'smaller_or_equal' ) )
                    {
                    // InternalFILTER.g:938:2: ( ( 'smaller_or_equal' ) )
                    // InternalFILTER.g:939:3: ( 'smaller_or_equal' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); 
                    }
                    // InternalFILTER.g:940:3: ( 'smaller_or_equal' )
                    // InternalFILTER.g:940:4: 'smaller_or_equal'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterOPType__Alternatives"


    // $ANTLR start "rule__TMTCIFFilterSelectType__Alternatives"
    // InternalFILTER.g:948:1: rule__TMTCIFFilterSelectType__Alternatives : ( ( ( 'data' ) ) | ( ( 'size' ) ) | ( ( 'crc' ) ) );
    public final void rule__TMTCIFFilterSelectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:952:1: ( ( ( 'data' ) ) | ( ( 'size' ) ) | ( ( 'crc' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFILTER.g:953:2: ( ( 'data' ) )
                    {
                    // InternalFILTER.g:953:2: ( ( 'data' ) )
                    // InternalFILTER.g:954:3: ( 'data' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); 
                    }
                    // InternalFILTER.g:955:3: ( 'data' )
                    // InternalFILTER.g:955:4: 'data'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:959:2: ( ( 'size' ) )
                    {
                    // InternalFILTER.g:959:2: ( ( 'size' ) )
                    // InternalFILTER.g:960:3: ( 'size' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); 
                    }
                    // InternalFILTER.g:961:3: ( 'size' )
                    // InternalFILTER.g:961:4: 'size'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:965:2: ( ( 'crc' ) )
                    {
                    // InternalFILTER.g:965:2: ( ( 'crc' ) )
                    // InternalFILTER.g:966:3: ( 'crc' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); 
                    }
                    // InternalFILTER.g:967:3: ( 'crc' )
                    // InternalFILTER.g:967:4: 'crc'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectType__Alternatives"


    // $ANTLR start "rule__TMTCIFModelFile__Group__0"
    // InternalFILTER.g:975:1: rule__TMTCIFModelFile__Group__0 : rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 ;
    public final void rule__TMTCIFModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:979:1: ( rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 )
            // InternalFILTER.g:980:2: rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__TMTCIFModelFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFile__Group__1();

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
    // $ANTLR end "rule__TMTCIFModelFile__Group__0"


    // $ANTLR start "rule__TMTCIFModelFile__Group__0__Impl"
    // InternalFILTER.g:987:1: rule__TMTCIFModelFile__Group__0__Impl : ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__TMTCIFModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:991:1: ( ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) )
            // InternalFILTER.g:992:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            {
            // InternalFILTER.g:992:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            // InternalFILTER.g:993:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalFILTER.g:994:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFILTER.g:994:3: rule__TMTCIFModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__TMTCIFModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__TMTCIFModelFile__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFModelFile__Group__1"
    // InternalFILTER.g:1002:1: rule__TMTCIFModelFile__Group__1 : rule__TMTCIFModelFile__Group__1__Impl ;
    public final void rule__TMTCIFModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1006:1: ( rule__TMTCIFModelFile__Group__1__Impl )
            // InternalFILTER.g:1007:2: rule__TMTCIFModelFile__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFile__Group__1__Impl();

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
    // $ANTLR end "rule__TMTCIFModelFile__Group__1"


    // $ANTLR start "rule__TMTCIFModelFile__Group__1__Impl"
    // InternalFILTER.g:1013:1: rule__TMTCIFModelFile__Group__1__Impl : ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) ;
    public final void rule__TMTCIFModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1017:1: ( ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) )
            // InternalFILTER.g:1018:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            {
            // InternalFILTER.g:1018:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            // InternalFILTER.g:1019:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); 
            }
            // InternalFILTER.g:1020:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            // InternalFILTER.g:1020:3: rule__TMTCIFModelFile__ElementAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFile__ElementAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); 
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
    // $ANTLR end "rule__TMTCIFModelFile__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__0"
    // InternalFILTER.g:1029:1: rule__TMTCIFModelFileImport__Group__0 : rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 ;
    public final void rule__TMTCIFModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1033:1: ( rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 )
            // InternalFILTER.g:1034:2: rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFModelFileImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__Group__1();

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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__0"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__0__Impl"
    // InternalFILTER.g:1041:1: rule__TMTCIFModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__TMTCIFModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1045:1: ( ( 'import' ) )
            // InternalFILTER.g:1046:1: ( 'import' )
            {
            // InternalFILTER.g:1046:1: ( 'import' )
            // InternalFILTER.g:1047:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__1"
    // InternalFILTER.g:1056:1: rule__TMTCIFModelFileImport__Group__1 : rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 ;
    public final void rule__TMTCIFModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1060:1: ( rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 )
            // InternalFILTER.g:1061:2: rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__TMTCIFModelFileImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__Group__2();

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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__1"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__1__Impl"
    // InternalFILTER.g:1068:1: rule__TMTCIFModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1072:1: ( ( ':=' ) )
            // InternalFILTER.g:1073:1: ( ':=' )
            {
            // InternalFILTER.g:1073:1: ( ':=' )
            // InternalFILTER.g:1074:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__2"
    // InternalFILTER.g:1083:1: rule__TMTCIFModelFileImport__Group__2 : rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 ;
    public final void rule__TMTCIFModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1087:1: ( rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 )
            // InternalFILTER.g:1088:2: rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFModelFileImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__Group__3();

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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__2"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__2__Impl"
    // InternalFILTER.g:1095:1: rule__TMTCIFModelFileImport__Group__2__Impl : ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__TMTCIFModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1099:1: ( ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalFILTER.g:1100:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalFILTER.g:1100:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            // InternalFILTER.g:1101:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalFILTER.g:1102:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            // InternalFILTER.g:1102:3: rule__TMTCIFModelFileImport__ImportURIAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__ImportURIAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); 
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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__3"
    // InternalFILTER.g:1110:1: rule__TMTCIFModelFileImport__Group__3 : rule__TMTCIFModelFileImport__Group__3__Impl ;
    public final void rule__TMTCIFModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1114:1: ( rule__TMTCIFModelFileImport__Group__3__Impl )
            // InternalFILTER.g:1115:2: rule__TMTCIFModelFileImport__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFModelFileImport__Group__3__Impl();

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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__3"


    // $ANTLR start "rule__TMTCIFModelFileImport__Group__3__Impl"
    // InternalFILTER.g:1121:1: rule__TMTCIFModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1125:1: ( ( ';' ) )
            // InternalFILTER.g:1126:1: ( ';' )
            {
            // InternalFILTER.g:1126:1: ( ';' )
            // InternalFILTER.g:1127:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFModelFileImport__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__0"
    // InternalFILTER.g:1137:1: rule__TMTCIFFilterMaxtermFilter__Group__0 : rule__TMTCIFFilterMaxtermFilter__Group__0__Impl rule__TMTCIFFilterMaxtermFilter__Group__1 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1141:1: ( rule__TMTCIFFilterMaxtermFilter__Group__0__Impl rule__TMTCIFFilterMaxtermFilter__Group__1 )
            // InternalFILTER.g:1142:2: rule__TMTCIFFilterMaxtermFilter__Group__0__Impl rule__TMTCIFFilterMaxtermFilter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMaxtermFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__0__Impl"
    // InternalFILTER.g:1149:1: rule__TMTCIFFilterMaxtermFilter__Group__0__Impl : ( 'TMTCIFFilterMaxtermFilter' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1153:1: ( ( 'TMTCIFFilterMaxtermFilter' ) )
            // InternalFILTER.g:1154:1: ( 'TMTCIFFilterMaxtermFilter' )
            {
            // InternalFILTER.g:1154:1: ( 'TMTCIFFilterMaxtermFilter' )
            // InternalFILTER.g:1155:2: 'TMTCIFFilterMaxtermFilter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getTMTCIFFilterMaxtermFilterKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__1"
    // InternalFILTER.g:1164:1: rule__TMTCIFFilterMaxtermFilter__Group__1 : rule__TMTCIFFilterMaxtermFilter__Group__1__Impl rule__TMTCIFFilterMaxtermFilter__Group__2 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1168:1: ( rule__TMTCIFFilterMaxtermFilter__Group__1__Impl rule__TMTCIFFilterMaxtermFilter__Group__2 )
            // InternalFILTER.g:1169:2: rule__TMTCIFFilterMaxtermFilter__Group__1__Impl rule__TMTCIFFilterMaxtermFilter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterMaxtermFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__1__Impl"
    // InternalFILTER.g:1176:1: rule__TMTCIFFilterMaxtermFilter__Group__1__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1180:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 ) ) )
            // InternalFILTER.g:1181:1: ( ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 ) )
            {
            // InternalFILTER.g:1181:1: ( ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 ) )
            // InternalFILTER.g:1182:2: ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameAssignment_1()); 
            }
            // InternalFILTER.g:1183:2: ( rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 )
            // InternalFILTER.g:1183:3: rule__TMTCIFFilterMaxtermFilter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__2"
    // InternalFILTER.g:1191:1: rule__TMTCIFFilterMaxtermFilter__Group__2 : rule__TMTCIFFilterMaxtermFilter__Group__2__Impl rule__TMTCIFFilterMaxtermFilter__Group__3 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1195:1: ( rule__TMTCIFFilterMaxtermFilter__Group__2__Impl rule__TMTCIFFilterMaxtermFilter__Group__3 )
            // InternalFILTER.g:1196:2: rule__TMTCIFFilterMaxtermFilter__Group__2__Impl rule__TMTCIFFilterMaxtermFilter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TMTCIFFilterMaxtermFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__2__Impl"
    // InternalFILTER.g:1203:1: rule__TMTCIFFilterMaxtermFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1207:1: ( ( '{' ) )
            // InternalFILTER.g:1208:1: ( '{' )
            {
            // InternalFILTER.g:1208:1: ( '{' )
            // InternalFILTER.g:1209:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__3"
    // InternalFILTER.g:1218:1: rule__TMTCIFFilterMaxtermFilter__Group__3 : rule__TMTCIFFilterMaxtermFilter__Group__3__Impl rule__TMTCIFFilterMaxtermFilter__Group__4 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1222:1: ( rule__TMTCIFFilterMaxtermFilter__Group__3__Impl rule__TMTCIFFilterMaxtermFilter__Group__4 )
            // InternalFILTER.g:1223:2: rule__TMTCIFFilterMaxtermFilter__Group__3__Impl rule__TMTCIFFilterMaxtermFilter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__TMTCIFFilterMaxtermFilter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__3__Impl"
    // InternalFILTER.g:1230:1: rule__TMTCIFFilterMaxtermFilter__Group__3__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1234:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 ) ) )
            // InternalFILTER.g:1235:1: ( ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 ) )
            {
            // InternalFILTER.g:1235:1: ( ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 ) )
            // InternalFILTER.g:1236:2: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()); 
            }
            // InternalFILTER.g:1237:2: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 )
            // InternalFILTER.g:1237:3: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__4"
    // InternalFILTER.g:1245:1: rule__TMTCIFFilterMaxtermFilter__Group__4 : rule__TMTCIFFilterMaxtermFilter__Group__4__Impl rule__TMTCIFFilterMaxtermFilter__Group__5 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1249:1: ( rule__TMTCIFFilterMaxtermFilter__Group__4__Impl rule__TMTCIFFilterMaxtermFilter__Group__5 )
            // InternalFILTER.g:1250:2: rule__TMTCIFFilterMaxtermFilter__Group__4__Impl rule__TMTCIFFilterMaxtermFilter__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterMaxtermFilter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__4"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__4__Impl"
    // InternalFILTER.g:1257:1: rule__TMTCIFFilterMaxtermFilter__Group__4__Impl : ( ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1261:1: ( ( ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* ) ) )
            // InternalFILTER.g:1262:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* ) )
            {
            // InternalFILTER.g:1262:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* ) )
            // InternalFILTER.g:1263:2: ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* )
            {
            // InternalFILTER.g:1263:2: ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 ) )
            // InternalFILTER.g:1264:3: ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); 
            }
            // InternalFILTER.g:1265:3: ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )
            // InternalFILTER.g:1265:4: rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); 
            }

            }

            // InternalFILTER.g:1268:2: ( ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )* )
            // InternalFILTER.g:1269:3: ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); 
            }
            // InternalFILTER.g:1270:3: ( rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==59) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalFILTER.g:1270:4: rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__5"
    // InternalFILTER.g:1279:1: rule__TMTCIFFilterMaxtermFilter__Group__5 : rule__TMTCIFFilterMaxtermFilter__Group__5__Impl rule__TMTCIFFilterMaxtermFilter__Group__6 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1283:1: ( rule__TMTCIFFilterMaxtermFilter__Group__5__Impl rule__TMTCIFFilterMaxtermFilter__Group__6 )
            // InternalFILTER.g:1284:2: rule__TMTCIFFilterMaxtermFilter__Group__5__Impl rule__TMTCIFFilterMaxtermFilter__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxtermFilter__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__5"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__5__Impl"
    // InternalFILTER.g:1291:1: rule__TMTCIFFilterMaxtermFilter__Group__5__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1295:1: ( ( '}' ) )
            // InternalFILTER.g:1296:1: ( '}' )
            {
            // InternalFILTER.g:1296:1: ( '}' )
            // InternalFILTER.g:1297:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__6"
    // InternalFILTER.g:1306:1: rule__TMTCIFFilterMaxtermFilter__Group__6 : rule__TMTCIFFilterMaxtermFilter__Group__6__Impl ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1310:1: ( rule__TMTCIFFilterMaxtermFilter__Group__6__Impl )
            // InternalFILTER.g:1311:2: rule__TMTCIFFilterMaxtermFilter__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group__6__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__6"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group__6__Impl"
    // InternalFILTER.g:1317:1: rule__TMTCIFFilterMaxtermFilter__Group__6__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1321:1: ( ( ';' ) )
            // InternalFILTER.g:1322:1: ( ';' )
            {
            // InternalFILTER.g:1322:1: ( ';' )
            // InternalFILTER.g:1323:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__0"
    // InternalFILTER.g:1333:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 : rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__1 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1337:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__1 )
            // InternalFILTER.g:1338:2: rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__1();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl"
    // InternalFILTER.g:1345:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1349:1: ( ( 'uri' ) )
            // InternalFILTER.g:1350:1: ( 'uri' )
            {
            // InternalFILTER.g:1350:1: ( 'uri' )
            // InternalFILTER.g:1351:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriKeyword_3_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__1"
    // InternalFILTER.g:1360:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__1 : rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__2 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1364:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__2 )
            // InternalFILTER.g:1365:2: rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__2();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl"
    // InternalFILTER.g:1372:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1376:1: ( ( ':=' ) )
            // InternalFILTER.g:1377:1: ( ':=' )
            {
            // InternalFILTER.g:1377:1: ( ':=' )
            // InternalFILTER.g:1378:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__2"
    // InternalFILTER.g:1387:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__2 : rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__3 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1391:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__3 )
            // InternalFILTER.g:1392:2: rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__3();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl"
    // InternalFILTER.g:1399:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1403:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 ) ) )
            // InternalFILTER.g:1404:1: ( ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 ) )
            {
            // InternalFILTER.g:1404:1: ( ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 ) )
            // InternalFILTER.g:1405:2: ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); 
            }
            // InternalFILTER.g:1406:2: ( rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 )
            // InternalFILTER.g:1406:3: rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriAssignment_3_0_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__3"
    // InternalFILTER.g:1414:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__3 : rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1418:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl )
            // InternalFILTER.g:1419:2: rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl"
    // InternalFILTER.g:1425:1: rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1429:1: ( ( ';' ) )
            // InternalFILTER.g:1430:1: ( ';' )
            {
            // InternalFILTER.g:1430:1: ( ';' )
            // InternalFILTER.g:1431:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_0__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__0"
    // InternalFILTER.g:1441:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__1 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1445:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__1 )
            // InternalFILTER.g:1446:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__1();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl"
    // InternalFILTER.g:1453:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1457:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 ) ) )
            // InternalFILTER.g:1458:1: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 ) )
            {
            // InternalFILTER.g:1458:1: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 ) )
            // InternalFILTER.g:1459:2: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1_0()); 
            }
            // InternalFILTER.g:1460:2: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 )
            // InternalFILTER.g:1460:3: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__1"
    // InternalFILTER.g:1468:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__1 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__2 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1472:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__2 )
            // InternalFILTER.g:1473:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__2();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl"
    // InternalFILTER.g:1480:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl : ( 'formatFile' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1484:1: ( ( 'formatFile' ) )
            // InternalFILTER.g:1485:1: ( 'formatFile' )
            {
            // InternalFILTER.g:1485:1: ( 'formatFile' )
            // InternalFILTER.g:1486:2: 'formatFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__2"
    // InternalFILTER.g:1495:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__2 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__3 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1499:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__3 )
            // InternalFILTER.g:1500:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__3();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl"
    // InternalFILTER.g:1507:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1511:1: ( ( ':=' ) )
            // InternalFILTER.g:1512:1: ( ':=' )
            {
            // InternalFILTER.g:1512:1: ( ':=' )
            // InternalFILTER.g:1513:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__3"
    // InternalFILTER.g:1522:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__3 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__4 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1526:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__4 )
            // InternalFILTER.g:1527:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__4();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl"
    // InternalFILTER.g:1534:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1538:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 ) ) )
            // InternalFILTER.g:1539:1: ( ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 ) )
            {
            // InternalFILTER.g:1539:1: ( ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 ) )
            // InternalFILTER.g:1540:2: ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); 
            }
            // InternalFILTER.g:1541:2: ( rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 )
            // InternalFILTER.g:1541:3: rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__4"
    // InternalFILTER.g:1549:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__4 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__5 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1553:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__5 )
            // InternalFILTER.g:1554:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__5();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__4"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl"
    // InternalFILTER.g:1561:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1565:1: ( ( ';' ) )
            // InternalFILTER.g:1566:1: ( ';' )
            {
            // InternalFILTER.g:1566:1: ( ';' )
            // InternalFILTER.g:1567:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__5"
    // InternalFILTER.g:1576:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__5 : rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1580:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl )
            // InternalFILTER.g:1581:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__5"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl"
    // InternalFILTER.g:1587:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl : ( ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1591:1: ( ( ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* ) ) )
            // InternalFILTER.g:1592:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* ) )
            {
            // InternalFILTER.g:1592:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* ) )
            // InternalFILTER.g:1593:2: ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* )
            {
            // InternalFILTER.g:1593:2: ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 ) )
            // InternalFILTER.g:1594:3: ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); 
            }
            // InternalFILTER.g:1595:3: ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )
            // InternalFILTER.g:1595:4: rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); 
            }

            }

            // InternalFILTER.g:1598:2: ( ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )* )
            // InternalFILTER.g:1599:3: ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); 
            }
            // InternalFILTER.g:1600:3: ( rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36||LA15_0==41||LA15_0==43||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFILTER.g:1600:4: rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0"
    // InternalFILTER.g:1610:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0 : rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1614:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1 )
            // InternalFILTER.g:1615:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl"
    // InternalFILTER.g:1622:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl : ( 'version' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1626:1: ( ( 'version' ) )
            // InternalFILTER.g:1627:1: ( 'version' )
            {
            // InternalFILTER.g:1627:1: ( 'version' )
            // InternalFILTER.g:1628:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1"
    // InternalFILTER.g:1637:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1 : rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1641:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2 )
            // InternalFILTER.g:1642:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl"
    // InternalFILTER.g:1649:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1653:1: ( ( ':=' ) )
            // InternalFILTER.g:1654:1: ( ':=' )
            {
            // InternalFILTER.g:1654:1: ( ':=' )
            // InternalFILTER.g:1655:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2"
    // InternalFILTER.g:1664:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2 : rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3 ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1668:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3 )
            // InternalFILTER.g:1669:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl"
    // InternalFILTER.g:1676:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl : ( ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1680:1: ( ( ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 ) ) )
            // InternalFILTER.g:1681:1: ( ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 ) )
            {
            // InternalFILTER.g:1681:1: ( ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 ) )
            // InternalFILTER.g:1682:2: ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); 
            }
            // InternalFILTER.g:1683:2: ( rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 )
            // InternalFILTER.g:1683:3: rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3"
    // InternalFILTER.g:1691:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3 : rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1695:1: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl )
            // InternalFILTER.g:1696:2: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl"
    // InternalFILTER.g:1702:1: rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1706:1: ( ( ';' ) )
            // InternalFILTER.g:1707:1: ( ';' )
            {
            // InternalFILTER.g:1707:1: ( ';' )
            // InternalFILTER.g:1708:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__0"
    // InternalFILTER.g:1718:1: rule__TMTCIFFilterMintermFilter__Group__0 : rule__TMTCIFFilterMintermFilter__Group__0__Impl rule__TMTCIFFilterMintermFilter__Group__1 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1722:1: ( rule__TMTCIFFilterMintermFilter__Group__0__Impl rule__TMTCIFFilterMintermFilter__Group__1 )
            // InternalFILTER.g:1723:2: rule__TMTCIFFilterMintermFilter__Group__0__Impl rule__TMTCIFFilterMintermFilter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMintermFilter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__0__Impl"
    // InternalFILTER.g:1730:1: rule__TMTCIFFilterMintermFilter__Group__0__Impl : ( 'TMTCIFFilterMintermFilter' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1734:1: ( ( 'TMTCIFFilterMintermFilter' ) )
            // InternalFILTER.g:1735:1: ( 'TMTCIFFilterMintermFilter' )
            {
            // InternalFILTER.g:1735:1: ( 'TMTCIFFilterMintermFilter' )
            // InternalFILTER.g:1736:2: 'TMTCIFFilterMintermFilter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getTMTCIFFilterMintermFilterKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__1"
    // InternalFILTER.g:1745:1: rule__TMTCIFFilterMintermFilter__Group__1 : rule__TMTCIFFilterMintermFilter__Group__1__Impl rule__TMTCIFFilterMintermFilter__Group__2 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1749:1: ( rule__TMTCIFFilterMintermFilter__Group__1__Impl rule__TMTCIFFilterMintermFilter__Group__2 )
            // InternalFILTER.g:1750:2: rule__TMTCIFFilterMintermFilter__Group__1__Impl rule__TMTCIFFilterMintermFilter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterMintermFilter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__1__Impl"
    // InternalFILTER.g:1757:1: rule__TMTCIFFilterMintermFilter__Group__1__Impl : ( ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1761:1: ( ( ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 ) ) )
            // InternalFILTER.g:1762:1: ( ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 ) )
            {
            // InternalFILTER.g:1762:1: ( ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 ) )
            // InternalFILTER.g:1763:2: ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameAssignment_1()); 
            }
            // InternalFILTER.g:1764:2: ( rule__TMTCIFFilterMintermFilter__NameAssignment_1 )
            // InternalFILTER.g:1764:3: rule__TMTCIFFilterMintermFilter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__2"
    // InternalFILTER.g:1772:1: rule__TMTCIFFilterMintermFilter__Group__2 : rule__TMTCIFFilterMintermFilter__Group__2__Impl rule__TMTCIFFilterMintermFilter__Group__3 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1776:1: ( rule__TMTCIFFilterMintermFilter__Group__2__Impl rule__TMTCIFFilterMintermFilter__Group__3 )
            // InternalFILTER.g:1777:2: rule__TMTCIFFilterMintermFilter__Group__2__Impl rule__TMTCIFFilterMintermFilter__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TMTCIFFilterMintermFilter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__2__Impl"
    // InternalFILTER.g:1784:1: rule__TMTCIFFilterMintermFilter__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1788:1: ( ( '{' ) )
            // InternalFILTER.g:1789:1: ( '{' )
            {
            // InternalFILTER.g:1789:1: ( '{' )
            // InternalFILTER.g:1790:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__3"
    // InternalFILTER.g:1799:1: rule__TMTCIFFilterMintermFilter__Group__3 : rule__TMTCIFFilterMintermFilter__Group__3__Impl rule__TMTCIFFilterMintermFilter__Group__4 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1803:1: ( rule__TMTCIFFilterMintermFilter__Group__3__Impl rule__TMTCIFFilterMintermFilter__Group__4 )
            // InternalFILTER.g:1804:2: rule__TMTCIFFilterMintermFilter__Group__3__Impl rule__TMTCIFFilterMintermFilter__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TMTCIFFilterMintermFilter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__3__Impl"
    // InternalFILTER.g:1811:1: rule__TMTCIFFilterMintermFilter__Group__3__Impl : ( ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1815:1: ( ( ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 ) ) )
            // InternalFILTER.g:1816:1: ( ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 ) )
            {
            // InternalFILTER.g:1816:1: ( ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 ) )
            // InternalFILTER.g:1817:2: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()); 
            }
            // InternalFILTER.g:1818:2: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 )
            // InternalFILTER.g:1818:3: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__4"
    // InternalFILTER.g:1826:1: rule__TMTCIFFilterMintermFilter__Group__4 : rule__TMTCIFFilterMintermFilter__Group__4__Impl rule__TMTCIFFilterMintermFilter__Group__5 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1830:1: ( rule__TMTCIFFilterMintermFilter__Group__4__Impl rule__TMTCIFFilterMintermFilter__Group__5 )
            // InternalFILTER.g:1831:2: rule__TMTCIFFilterMintermFilter__Group__4__Impl rule__TMTCIFFilterMintermFilter__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterMintermFilter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__4"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__4__Impl"
    // InternalFILTER.g:1838:1: rule__TMTCIFFilterMintermFilter__Group__4__Impl : ( ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) ) ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1842:1: ( ( ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) ) ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* ) ) )
            // InternalFILTER.g:1843:1: ( ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) ) ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* ) )
            {
            // InternalFILTER.g:1843:1: ( ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) ) ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* ) )
            // InternalFILTER.g:1844:2: ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) ) ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* )
            {
            // InternalFILTER.g:1844:2: ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 ) )
            // InternalFILTER.g:1845:3: ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); 
            }
            // InternalFILTER.g:1846:3: ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )
            // InternalFILTER.g:1846:4: rule__TMTCIFFilterMintermFilter__MintermAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFFilterMintermFilter__MintermAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); 
            }

            }

            // InternalFILTER.g:1849:2: ( ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )* )
            // InternalFILTER.g:1850:3: ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); 
            }
            // InternalFILTER.g:1851:3: ( rule__TMTCIFFilterMintermFilter__MintermAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==60) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFILTER.g:1851:4: rule__TMTCIFFilterMintermFilter__MintermAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__TMTCIFFilterMintermFilter__MintermAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__5"
    // InternalFILTER.g:1860:1: rule__TMTCIFFilterMintermFilter__Group__5 : rule__TMTCIFFilterMintermFilter__Group__5__Impl rule__TMTCIFFilterMintermFilter__Group__6 ;
    public final void rule__TMTCIFFilterMintermFilter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1864:1: ( rule__TMTCIFFilterMintermFilter__Group__5__Impl rule__TMTCIFFilterMintermFilter__Group__6 )
            // InternalFILTER.g:1865:2: rule__TMTCIFFilterMintermFilter__Group__5__Impl rule__TMTCIFFilterMintermFilter__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMintermFilter__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__5"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__5__Impl"
    // InternalFILTER.g:1872:1: rule__TMTCIFFilterMintermFilter__Group__5__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1876:1: ( ( '}' ) )
            // InternalFILTER.g:1877:1: ( '}' )
            {
            // InternalFILTER.g:1877:1: ( '}' )
            // InternalFILTER.g:1878:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__6"
    // InternalFILTER.g:1887:1: rule__TMTCIFFilterMintermFilter__Group__6 : rule__TMTCIFFilterMintermFilter__Group__6__Impl ;
    public final void rule__TMTCIFFilterMintermFilter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1891:1: ( rule__TMTCIFFilterMintermFilter__Group__6__Impl )
            // InternalFILTER.g:1892:2: rule__TMTCIFFilterMintermFilter__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group__6__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__6"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group__6__Impl"
    // InternalFILTER.g:1898:1: rule__TMTCIFFilterMintermFilter__Group__6__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1902:1: ( ( ';' ) )
            // InternalFILTER.g:1903:1: ( ';' )
            {
            // InternalFILTER.g:1903:1: ( ';' )
            // InternalFILTER.g:1904:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__0"
    // InternalFILTER.g:1914:1: rule__TMTCIFFilterMintermFilter__Group_3_0__0 : rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__1 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1918:1: ( rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__1 )
            // InternalFILTER.g:1919:2: rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_0__1();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl"
    // InternalFILTER.g:1926:1: rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1930:1: ( ( 'uri' ) )
            // InternalFILTER.g:1931:1: ( 'uri' )
            {
            // InternalFILTER.g:1931:1: ( 'uri' )
            // InternalFILTER.g:1932:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriKeyword_3_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__1"
    // InternalFILTER.g:1941:1: rule__TMTCIFFilterMintermFilter__Group_3_0__1 : rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__2 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1945:1: ( rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__2 )
            // InternalFILTER.g:1946:2: rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_0__2();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl"
    // InternalFILTER.g:1953:1: rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1957:1: ( ( ':=' ) )
            // InternalFILTER.g:1958:1: ( ':=' )
            {
            // InternalFILTER.g:1958:1: ( ':=' )
            // InternalFILTER.g:1959:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__2"
    // InternalFILTER.g:1968:1: rule__TMTCIFFilterMintermFilter__Group_3_0__2 : rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__3 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1972:1: ( rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__3 )
            // InternalFILTER.g:1973:2: rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_0__3();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl"
    // InternalFILTER.g:1980:1: rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl : ( ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1984:1: ( ( ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 ) ) )
            // InternalFILTER.g:1985:1: ( ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 ) )
            {
            // InternalFILTER.g:1985:1: ( ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 ) )
            // InternalFILTER.g:1986:2: ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriAssignment_3_0_2()); 
            }
            // InternalFILTER.g:1987:2: ( rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 )
            // InternalFILTER.g:1987:3: rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriAssignment_3_0_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__3"
    // InternalFILTER.g:1995:1: rule__TMTCIFFilterMintermFilter__Group_3_0__3 : rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:1999:1: ( rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl )
            // InternalFILTER.g:2000:2: rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl"
    // InternalFILTER.g:2006:1: rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2010:1: ( ( ';' ) )
            // InternalFILTER.g:2011:1: ( ';' )
            {
            // InternalFILTER.g:2011:1: ( ';' )
            // InternalFILTER.g:2012:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_0_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_0__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__0"
    // InternalFILTER.g:2022:1: rule__TMTCIFFilterMintermFilter__Group_3_1__0 : rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__1 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2026:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__1 )
            // InternalFILTER.g:2027:2: rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__1();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl"
    // InternalFILTER.g:2034:1: rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl : ( ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2038:1: ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 ) ) )
            // InternalFILTER.g:2039:1: ( ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 ) )
            {
            // InternalFILTER.g:2039:1: ( ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 ) )
            // InternalFILTER.g:2040:2: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1_0()); 
            }
            // InternalFILTER.g:2041:2: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 )
            // InternalFILTER.g:2041:3: rule__TMTCIFFilterMintermFilter__Group_3_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__1"
    // InternalFILTER.g:2049:1: rule__TMTCIFFilterMintermFilter__Group_3_1__1 : rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__2 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2053:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__2 )
            // InternalFILTER.g:2054:2: rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__2();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl"
    // InternalFILTER.g:2061:1: rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl : ( 'formatFile' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2065:1: ( ( 'formatFile' ) )
            // InternalFILTER.g:2066:1: ( 'formatFile' )
            {
            // InternalFILTER.g:2066:1: ( 'formatFile' )
            // InternalFILTER.g:2067:2: 'formatFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileKeyword_3_1_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__2"
    // InternalFILTER.g:2076:1: rule__TMTCIFFilterMintermFilter__Group_3_1__2 : rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__3 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2080:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__3 )
            // InternalFILTER.g:2081:2: rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__3();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl"
    // InternalFILTER.g:2088:1: rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2092:1: ( ( ':=' ) )
            // InternalFILTER.g:2093:1: ( ':=' )
            {
            // InternalFILTER.g:2093:1: ( ':=' )
            // InternalFILTER.g:2094:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__3"
    // InternalFILTER.g:2103:1: rule__TMTCIFFilterMintermFilter__Group_3_1__3 : rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__4 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2107:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__4 )
            // InternalFILTER.g:2108:2: rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__4();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl"
    // InternalFILTER.g:2115:1: rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl : ( ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2119:1: ( ( ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 ) ) )
            // InternalFILTER.g:2120:1: ( ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 ) )
            {
            // InternalFILTER.g:2120:1: ( ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 ) )
            // InternalFILTER.g:2121:2: ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); 
            }
            // InternalFILTER.g:2122:2: ( rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 )
            // InternalFILTER.g:2122:3: rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileAssignment_3_1_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__4"
    // InternalFILTER.g:2130:1: rule__TMTCIFFilterMintermFilter__Group_3_1__4 : rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__5 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2134:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__5 )
            // InternalFILTER.g:2135:2: rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl rule__TMTCIFFilterMintermFilter__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__5();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__4"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl"
    // InternalFILTER.g:2142:1: rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2146:1: ( ( ';' ) )
            // InternalFILTER.g:2147:1: ( ';' )
            {
            // InternalFILTER.g:2147:1: ( ';' )
            // InternalFILTER.g:2148:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__5"
    // InternalFILTER.g:2157:1: rule__TMTCIFFilterMintermFilter__Group_3_1__5 : rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2161:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl )
            // InternalFILTER.g:2162:2: rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__5"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl"
    // InternalFILTER.g:2168:1: rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl : ( ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2172:1: ( ( ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* ) ) )
            // InternalFILTER.g:2173:1: ( ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* ) )
            {
            // InternalFILTER.g:2173:1: ( ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* ) )
            // InternalFILTER.g:2174:2: ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) ) ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* )
            {
            // InternalFILTER.g:2174:2: ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 ) )
            // InternalFILTER.g:2175:3: ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); 
            }
            // InternalFILTER.g:2176:3: ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )
            // InternalFILTER.g:2176:4: rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); 
            }

            }

            // InternalFILTER.g:2179:2: ( ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )* )
            // InternalFILTER.g:2180:3: ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); 
            }
            // InternalFILTER.g:2181:3: ( rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36||LA17_0==41||LA17_0==43||LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFILTER.g:2181:4: rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__0"
    // InternalFILTER.g:2191:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__0 : rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__1 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2195:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__1 )
            // InternalFILTER.g:2196:2: rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__1();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl"
    // InternalFILTER.g:2203:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl : ( 'version' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2207:1: ( ( 'version' ) )
            // InternalFILTER.g:2208:1: ( 'version' )
            {
            // InternalFILTER.g:2208:1: ( 'version' )
            // InternalFILTER.g:2209:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionKeyword_3_1_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__1"
    // InternalFILTER.g:2218:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__1 : rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__2 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2222:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__2 )
            // InternalFILTER.g:2223:2: rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__2();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl"
    // InternalFILTER.g:2230:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2234:1: ( ( ':=' ) )
            // InternalFILTER.g:2235:1: ( ':=' )
            {
            // InternalFILTER.g:2235:1: ( ':=' )
            // InternalFILTER.g:2236:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__2"
    // InternalFILTER.g:2245:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__2 : rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__3 ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2249:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__3 )
            // InternalFILTER.g:2250:2: rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl rule__TMTCIFFilterMintermFilter__Group_3_1_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__3();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl"
    // InternalFILTER.g:2257:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl : ( ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2261:1: ( ( ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 ) ) )
            // InternalFILTER.g:2262:1: ( ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 ) )
            {
            // InternalFILTER.g:2262:1: ( ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 ) )
            // InternalFILTER.g:2263:2: ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); 
            }
            // InternalFILTER.g:2264:2: ( rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 )
            // InternalFILTER.g:2264:3: rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionAssignment_3_1_0_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__3"
    // InternalFILTER.g:2272:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__3 : rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2276:1: ( rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl )
            // InternalFILTER.g:2277:2: rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl"
    // InternalFILTER.g:2283:1: rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2287:1: ( ( ';' ) )
            // InternalFILTER.g:2288:1: ( ';' )
            {
            // InternalFILTER.g:2288:1: ( ';' )
            // InternalFILTER.g:2289:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__Group_3_1_0__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__0"
    // InternalFILTER.g:2299:1: rule__TMTCIFFilterBoolVar__Group__0 : rule__TMTCIFFilterBoolVar__Group__0__Impl rule__TMTCIFFilterBoolVar__Group__1 ;
    public final void rule__TMTCIFFilterBoolVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2303:1: ( rule__TMTCIFFilterBoolVar__Group__0__Impl rule__TMTCIFFilterBoolVar__Group__1 )
            // InternalFILTER.g:2304:2: rule__TMTCIFFilterBoolVar__Group__0__Impl rule__TMTCIFFilterBoolVar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterBoolVar__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__0"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__0__Impl"
    // InternalFILTER.g:2311:1: rule__TMTCIFFilterBoolVar__Group__0__Impl : ( 'TMTCIFFilterBoolVar' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2315:1: ( ( 'TMTCIFFilterBoolVar' ) )
            // InternalFILTER.g:2316:1: ( 'TMTCIFFilterBoolVar' )
            {
            // InternalFILTER.g:2316:1: ( 'TMTCIFFilterBoolVar' )
            // InternalFILTER.g:2317:2: 'TMTCIFFilterBoolVar'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getTMTCIFFilterBoolVarKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__1"
    // InternalFILTER.g:2326:1: rule__TMTCIFFilterBoolVar__Group__1 : rule__TMTCIFFilterBoolVar__Group__1__Impl rule__TMTCIFFilterBoolVar__Group__2 ;
    public final void rule__TMTCIFFilterBoolVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2330:1: ( rule__TMTCIFFilterBoolVar__Group__1__Impl rule__TMTCIFFilterBoolVar__Group__2 )
            // InternalFILTER.g:2331:2: rule__TMTCIFFilterBoolVar__Group__1__Impl rule__TMTCIFFilterBoolVar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterBoolVar__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__1"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__1__Impl"
    // InternalFILTER.g:2338:1: rule__TMTCIFFilterBoolVar__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2342:1: ( ( '{' ) )
            // InternalFILTER.g:2343:1: ( '{' )
            {
            // InternalFILTER.g:2343:1: ( '{' )
            // InternalFILTER.g:2344:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__2"
    // InternalFILTER.g:2353:1: rule__TMTCIFFilterBoolVar__Group__2 : rule__TMTCIFFilterBoolVar__Group__2__Impl rule__TMTCIFFilterBoolVar__Group__3 ;
    public final void rule__TMTCIFFilterBoolVar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2357:1: ( rule__TMTCIFFilterBoolVar__Group__2__Impl rule__TMTCIFFilterBoolVar__Group__3 )
            // InternalFILTER.g:2358:2: rule__TMTCIFFilterBoolVar__Group__2__Impl rule__TMTCIFFilterBoolVar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVar__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__2"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__2__Impl"
    // InternalFILTER.g:2365:1: rule__TMTCIFFilterBoolVar__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2369:1: ( ( 'id' ) )
            // InternalFILTER.g:2370:1: ( 'id' )
            {
            // InternalFILTER.g:2370:1: ( 'id' )
            // InternalFILTER.g:2371:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__3"
    // InternalFILTER.g:2380:1: rule__TMTCIFFilterBoolVar__Group__3 : rule__TMTCIFFilterBoolVar__Group__3__Impl rule__TMTCIFFilterBoolVar__Group__4 ;
    public final void rule__TMTCIFFilterBoolVar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2384:1: ( rule__TMTCIFFilterBoolVar__Group__3__Impl rule__TMTCIFFilterBoolVar__Group__4 )
            // InternalFILTER.g:2385:2: rule__TMTCIFFilterBoolVar__Group__3__Impl rule__TMTCIFFilterBoolVar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterBoolVar__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__3"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__3__Impl"
    // InternalFILTER.g:2392:1: rule__TMTCIFFilterBoolVar__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2396:1: ( ( ':=' ) )
            // InternalFILTER.g:2397:1: ( ':=' )
            {
            // InternalFILTER.g:2397:1: ( ':=' )
            // InternalFILTER.g:2398:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__4"
    // InternalFILTER.g:2407:1: rule__TMTCIFFilterBoolVar__Group__4 : rule__TMTCIFFilterBoolVar__Group__4__Impl rule__TMTCIFFilterBoolVar__Group__5 ;
    public final void rule__TMTCIFFilterBoolVar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2411:1: ( rule__TMTCIFFilterBoolVar__Group__4__Impl rule__TMTCIFFilterBoolVar__Group__5 )
            // InternalFILTER.g:2412:2: rule__TMTCIFFilterBoolVar__Group__4__Impl rule__TMTCIFFilterBoolVar__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVar__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__4"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__4__Impl"
    // InternalFILTER.g:2419:1: rule__TMTCIFFilterBoolVar__Group__4__Impl : ( ( rule__TMTCIFFilterBoolVar__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2423:1: ( ( ( rule__TMTCIFFilterBoolVar__IdAssignment_4 ) ) )
            // InternalFILTER.g:2424:1: ( ( rule__TMTCIFFilterBoolVar__IdAssignment_4 ) )
            {
            // InternalFILTER.g:2424:1: ( ( rule__TMTCIFFilterBoolVar__IdAssignment_4 ) )
            // InternalFILTER.g:2425:2: ( rule__TMTCIFFilterBoolVar__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:2426:2: ( rule__TMTCIFFilterBoolVar__IdAssignment_4 )
            // InternalFILTER.g:2426:3: rule__TMTCIFFilterBoolVar__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__5"
    // InternalFILTER.g:2434:1: rule__TMTCIFFilterBoolVar__Group__5 : rule__TMTCIFFilterBoolVar__Group__5__Impl rule__TMTCIFFilterBoolVar__Group__6 ;
    public final void rule__TMTCIFFilterBoolVar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2438:1: ( rule__TMTCIFFilterBoolVar__Group__5__Impl rule__TMTCIFFilterBoolVar__Group__6 )
            // InternalFILTER.g:2439:2: rule__TMTCIFFilterBoolVar__Group__5__Impl rule__TMTCIFFilterBoolVar__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFFilterBoolVar__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__5"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__5__Impl"
    // InternalFILTER.g:2446:1: rule__TMTCIFFilterBoolVar__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2450:1: ( ( ';' ) )
            // InternalFILTER.g:2451:1: ( ';' )
            {
            // InternalFILTER.g:2451:1: ( ';' )
            // InternalFILTER.g:2452:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__6"
    // InternalFILTER.g:2461:1: rule__TMTCIFFilterBoolVar__Group__6 : rule__TMTCIFFilterBoolVar__Group__6__Impl rule__TMTCIFFilterBoolVar__Group__7 ;
    public final void rule__TMTCIFFilterBoolVar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2465:1: ( rule__TMTCIFFilterBoolVar__Group__6__Impl rule__TMTCIFFilterBoolVar__Group__7 )
            // InternalFILTER.g:2466:2: rule__TMTCIFFilterBoolVar__Group__6__Impl rule__TMTCIFFilterBoolVar__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVar__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__6"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__6__Impl"
    // InternalFILTER.g:2473:1: rule__TMTCIFFilterBoolVar__Group__6__Impl : ( 'name' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2477:1: ( ( 'name' ) )
            // InternalFILTER.g:2478:1: ( 'name' )
            {
            // InternalFILTER.g:2478:1: ( 'name' )
            // InternalFILTER.g:2479:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__7"
    // InternalFILTER.g:2488:1: rule__TMTCIFFilterBoolVar__Group__7 : rule__TMTCIFFilterBoolVar__Group__7__Impl rule__TMTCIFFilterBoolVar__Group__8 ;
    public final void rule__TMTCIFFilterBoolVar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2492:1: ( rule__TMTCIFFilterBoolVar__Group__7__Impl rule__TMTCIFFilterBoolVar__Group__8 )
            // InternalFILTER.g:2493:2: rule__TMTCIFFilterBoolVar__Group__7__Impl rule__TMTCIFFilterBoolVar__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVar__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__7"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__7__Impl"
    // InternalFILTER.g:2500:1: rule__TMTCIFFilterBoolVar__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2504:1: ( ( ':=' ) )
            // InternalFILTER.g:2505:1: ( ':=' )
            {
            // InternalFILTER.g:2505:1: ( ':=' )
            // InternalFILTER.g:2506:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__8"
    // InternalFILTER.g:2515:1: rule__TMTCIFFilterBoolVar__Group__8 : rule__TMTCIFFilterBoolVar__Group__8__Impl rule__TMTCIFFilterBoolVar__Group__9 ;
    public final void rule__TMTCIFFilterBoolVar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2519:1: ( rule__TMTCIFFilterBoolVar__Group__8__Impl rule__TMTCIFFilterBoolVar__Group__9 )
            // InternalFILTER.g:2520:2: rule__TMTCIFFilterBoolVar__Group__8__Impl rule__TMTCIFFilterBoolVar__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVar__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__8"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__8__Impl"
    // InternalFILTER.g:2527:1: rule__TMTCIFFilterBoolVar__Group__8__Impl : ( ( rule__TMTCIFFilterBoolVar__NameAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2531:1: ( ( ( rule__TMTCIFFilterBoolVar__NameAssignment_8 ) ) )
            // InternalFILTER.g:2532:1: ( ( rule__TMTCIFFilterBoolVar__NameAssignment_8 ) )
            {
            // InternalFILTER.g:2532:1: ( ( rule__TMTCIFFilterBoolVar__NameAssignment_8 ) )
            // InternalFILTER.g:2533:2: ( rule__TMTCIFFilterBoolVar__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:2534:2: ( rule__TMTCIFFilterBoolVar__NameAssignment_8 )
            // InternalFILTER.g:2534:3: rule__TMTCIFFilterBoolVar__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__9"
    // InternalFILTER.g:2542:1: rule__TMTCIFFilterBoolVar__Group__9 : rule__TMTCIFFilterBoolVar__Group__9__Impl rule__TMTCIFFilterBoolVar__Group__10 ;
    public final void rule__TMTCIFFilterBoolVar__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2546:1: ( rule__TMTCIFFilterBoolVar__Group__9__Impl rule__TMTCIFFilterBoolVar__Group__10 )
            // InternalFILTER.g:2547:2: rule__TMTCIFFilterBoolVar__Group__9__Impl rule__TMTCIFFilterBoolVar__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFFilterBoolVar__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__9"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__9__Impl"
    // InternalFILTER.g:2554:1: rule__TMTCIFFilterBoolVar__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2558:1: ( ( ';' ) )
            // InternalFILTER.g:2559:1: ( ';' )
            {
            // InternalFILTER.g:2559:1: ( ';' )
            // InternalFILTER.g:2560:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__10"
    // InternalFILTER.g:2569:1: rule__TMTCIFFilterBoolVar__Group__10 : rule__TMTCIFFilterBoolVar__Group__10__Impl rule__TMTCIFFilterBoolVar__Group__11 ;
    public final void rule__TMTCIFFilterBoolVar__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2573:1: ( rule__TMTCIFFilterBoolVar__Group__10__Impl rule__TMTCIFFilterBoolVar__Group__11 )
            // InternalFILTER.g:2574:2: rule__TMTCIFFilterBoolVar__Group__10__Impl rule__TMTCIFFilterBoolVar__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVar__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__10"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__10__Impl"
    // InternalFILTER.g:2581:1: rule__TMTCIFFilterBoolVar__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2585:1: ( ( 'constantType' ) )
            // InternalFILTER.g:2586:1: ( 'constantType' )
            {
            // InternalFILTER.g:2586:1: ( 'constantType' )
            // InternalFILTER.g:2587:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeKeyword_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__11"
    // InternalFILTER.g:2596:1: rule__TMTCIFFilterBoolVar__Group__11 : rule__TMTCIFFilterBoolVar__Group__11__Impl rule__TMTCIFFilterBoolVar__Group__12 ;
    public final void rule__TMTCIFFilterBoolVar__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2600:1: ( rule__TMTCIFFilterBoolVar__Group__11__Impl rule__TMTCIFFilterBoolVar__Group__12 )
            // InternalFILTER.g:2601:2: rule__TMTCIFFilterBoolVar__Group__11__Impl rule__TMTCIFFilterBoolVar__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFFilterBoolVar__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__11"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__11__Impl"
    // InternalFILTER.g:2608:1: rule__TMTCIFFilterBoolVar__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2612:1: ( ( ':=' ) )
            // InternalFILTER.g:2613:1: ( ':=' )
            {
            // InternalFILTER.g:2613:1: ( ':=' )
            // InternalFILTER.g:2614:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__12"
    // InternalFILTER.g:2623:1: rule__TMTCIFFilterBoolVar__Group__12 : rule__TMTCIFFilterBoolVar__Group__12__Impl rule__TMTCIFFilterBoolVar__Group__13 ;
    public final void rule__TMTCIFFilterBoolVar__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2627:1: ( rule__TMTCIFFilterBoolVar__Group__12__Impl rule__TMTCIFFilterBoolVar__Group__13 )
            // InternalFILTER.g:2628:2: rule__TMTCIFFilterBoolVar__Group__12__Impl rule__TMTCIFFilterBoolVar__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVar__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__12"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__12__Impl"
    // InternalFILTER.g:2635:1: rule__TMTCIFFilterBoolVar__Group__12__Impl : ( ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2639:1: ( ( ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:2640:1: ( ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:2640:1: ( ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:2641:2: ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:2642:2: ( rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 )
            // InternalFILTER.g:2642:3: rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeAssignment_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__13"
    // InternalFILTER.g:2650:1: rule__TMTCIFFilterBoolVar__Group__13 : rule__TMTCIFFilterBoolVar__Group__13__Impl rule__TMTCIFFilterBoolVar__Group__14 ;
    public final void rule__TMTCIFFilterBoolVar__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2654:1: ( rule__TMTCIFFilterBoolVar__Group__13__Impl rule__TMTCIFFilterBoolVar__Group__14 )
            // InternalFILTER.g:2655:2: rule__TMTCIFFilterBoolVar__Group__13__Impl rule__TMTCIFFilterBoolVar__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TMTCIFFilterBoolVar__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__13"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__13__Impl"
    // InternalFILTER.g:2662:1: rule__TMTCIFFilterBoolVar__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2666:1: ( ( ';' ) )
            // InternalFILTER.g:2667:1: ( ';' )
            {
            // InternalFILTER.g:2667:1: ( ';' )
            // InternalFILTER.g:2668:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__14"
    // InternalFILTER.g:2677:1: rule__TMTCIFFilterBoolVar__Group__14 : rule__TMTCIFFilterBoolVar__Group__14__Impl rule__TMTCIFFilterBoolVar__Group__15 ;
    public final void rule__TMTCIFFilterBoolVar__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2681:1: ( rule__TMTCIFFilterBoolVar__Group__14__Impl rule__TMTCIFFilterBoolVar__Group__15 )
            // InternalFILTER.g:2682:2: rule__TMTCIFFilterBoolVar__Group__14__Impl rule__TMTCIFFilterBoolVar__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVar__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__15();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__14"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__14__Impl"
    // InternalFILTER.g:2689:1: rule__TMTCIFFilterBoolVar__Group__14__Impl : ( 'FieldRef' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2693:1: ( ( 'FieldRef' ) )
            // InternalFILTER.g:2694:1: ( 'FieldRef' )
            {
            // InternalFILTER.g:2694:1: ( 'FieldRef' )
            // InternalFILTER.g:2695:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefKeyword_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__15"
    // InternalFILTER.g:2704:1: rule__TMTCIFFilterBoolVar__Group__15 : rule__TMTCIFFilterBoolVar__Group__15__Impl rule__TMTCIFFilterBoolVar__Group__16 ;
    public final void rule__TMTCIFFilterBoolVar__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2708:1: ( rule__TMTCIFFilterBoolVar__Group__15__Impl rule__TMTCIFFilterBoolVar__Group__16 )
            // InternalFILTER.g:2709:2: rule__TMTCIFFilterBoolVar__Group__15__Impl rule__TMTCIFFilterBoolVar__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVar__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__16();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__15"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__15__Impl"
    // InternalFILTER.g:2716:1: rule__TMTCIFFilterBoolVar__Group__15__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2720:1: ( ( ':=' ) )
            // InternalFILTER.g:2721:1: ( ':=' )
            {
            // InternalFILTER.g:2721:1: ( ':=' )
            // InternalFILTER.g:2722:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getColonEqualsSignKeyword_15()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__16"
    // InternalFILTER.g:2731:1: rule__TMTCIFFilterBoolVar__Group__16 : rule__TMTCIFFilterBoolVar__Group__16__Impl rule__TMTCIFFilterBoolVar__Group__17 ;
    public final void rule__TMTCIFFilterBoolVar__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2735:1: ( rule__TMTCIFFilterBoolVar__Group__16__Impl rule__TMTCIFFilterBoolVar__Group__17 )
            // InternalFILTER.g:2736:2: rule__TMTCIFFilterBoolVar__Group__16__Impl rule__TMTCIFFilterBoolVar__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVar__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__17();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__16"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__16__Impl"
    // InternalFILTER.g:2743:1: rule__TMTCIFFilterBoolVar__Group__16__Impl : ( ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2747:1: ( ( ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 ) ) )
            // InternalFILTER.g:2748:1: ( ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 ) )
            {
            // InternalFILTER.g:2748:1: ( ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 ) )
            // InternalFILTER.g:2749:2: ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefAssignment_16()); 
            }
            // InternalFILTER.g:2750:2: ( rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 )
            // InternalFILTER.g:2750:3: rule__TMTCIFFilterBoolVar__FieldRefAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__FieldRefAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefAssignment_16()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__17"
    // InternalFILTER.g:2758:1: rule__TMTCIFFilterBoolVar__Group__17 : rule__TMTCIFFilterBoolVar__Group__17__Impl rule__TMTCIFFilterBoolVar__Group__18 ;
    public final void rule__TMTCIFFilterBoolVar__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2762:1: ( rule__TMTCIFFilterBoolVar__Group__17__Impl rule__TMTCIFFilterBoolVar__Group__18 )
            // InternalFILTER.g:2763:2: rule__TMTCIFFilterBoolVar__Group__17__Impl rule__TMTCIFFilterBoolVar__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TMTCIFFilterBoolVar__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__18();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__17"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__17__Impl"
    // InternalFILTER.g:2770:1: rule__TMTCIFFilterBoolVar__Group__17__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2774:1: ( ( ';' ) )
            // InternalFILTER.g:2775:1: ( ';' )
            {
            // InternalFILTER.g:2775:1: ( ';' )
            // InternalFILTER.g:2776:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_17()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__17__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__18"
    // InternalFILTER.g:2785:1: rule__TMTCIFFilterBoolVar__Group__18 : rule__TMTCIFFilterBoolVar__Group__18__Impl rule__TMTCIFFilterBoolVar__Group__19 ;
    public final void rule__TMTCIFFilterBoolVar__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2789:1: ( rule__TMTCIFFilterBoolVar__Group__18__Impl rule__TMTCIFFilterBoolVar__Group__19 )
            // InternalFILTER.g:2790:2: rule__TMTCIFFilterBoolVar__Group__18__Impl rule__TMTCIFFilterBoolVar__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TMTCIFFilterBoolVar__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__19();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__18"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__18__Impl"
    // InternalFILTER.g:2797:1: rule__TMTCIFFilterBoolVar__Group__18__Impl : ( ( rule__TMTCIFFilterBoolVar__OpAssignment_18 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2801:1: ( ( ( rule__TMTCIFFilterBoolVar__OpAssignment_18 ) ) )
            // InternalFILTER.g:2802:1: ( ( rule__TMTCIFFilterBoolVar__OpAssignment_18 ) )
            {
            // InternalFILTER.g:2802:1: ( ( rule__TMTCIFFilterBoolVar__OpAssignment_18 ) )
            // InternalFILTER.g:2803:2: ( rule__TMTCIFFilterBoolVar__OpAssignment_18 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpAssignment_18()); 
            }
            // InternalFILTER.g:2804:2: ( rule__TMTCIFFilterBoolVar__OpAssignment_18 )
            // InternalFILTER.g:2804:3: rule__TMTCIFFilterBoolVar__OpAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__OpAssignment_18();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpAssignment_18()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__18__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__19"
    // InternalFILTER.g:2812:1: rule__TMTCIFFilterBoolVar__Group__19 : rule__TMTCIFFilterBoolVar__Group__19__Impl rule__TMTCIFFilterBoolVar__Group__20 ;
    public final void rule__TMTCIFFilterBoolVar__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2816:1: ( rule__TMTCIFFilterBoolVar__Group__19__Impl rule__TMTCIFFilterBoolVar__Group__20 )
            // InternalFILTER.g:2817:2: rule__TMTCIFFilterBoolVar__Group__19__Impl rule__TMTCIFFilterBoolVar__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterBoolVar__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__20();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__19"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__19__Impl"
    // InternalFILTER.g:2824:1: rule__TMTCIFFilterBoolVar__Group__19__Impl : ( ( rule__TMTCIFFilterBoolVar__Alternatives_19 ) ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2828:1: ( ( ( rule__TMTCIFFilterBoolVar__Alternatives_19 ) ) )
            // InternalFILTER.g:2829:1: ( ( rule__TMTCIFFilterBoolVar__Alternatives_19 ) )
            {
            // InternalFILTER.g:2829:1: ( ( rule__TMTCIFFilterBoolVar__Alternatives_19 ) )
            // InternalFILTER.g:2830:2: ( rule__TMTCIFFilterBoolVar__Alternatives_19 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getAlternatives_19()); 
            }
            // InternalFILTER.g:2831:2: ( rule__TMTCIFFilterBoolVar__Alternatives_19 )
            // InternalFILTER.g:2831:3: rule__TMTCIFFilterBoolVar__Alternatives_19
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Alternatives_19();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getAlternatives_19()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__19__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__20"
    // InternalFILTER.g:2839:1: rule__TMTCIFFilterBoolVar__Group__20 : rule__TMTCIFFilterBoolVar__Group__20__Impl rule__TMTCIFFilterBoolVar__Group__21 ;
    public final void rule__TMTCIFFilterBoolVar__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2843:1: ( rule__TMTCIFFilterBoolVar__Group__20__Impl rule__TMTCIFFilterBoolVar__Group__21 )
            // InternalFILTER.g:2844:2: rule__TMTCIFFilterBoolVar__Group__20__Impl rule__TMTCIFFilterBoolVar__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVar__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__21();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__20"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__20__Impl"
    // InternalFILTER.g:2851:1: rule__TMTCIFFilterBoolVar__Group__20__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2855:1: ( ( '}' ) )
            // InternalFILTER.g:2856:1: ( '}' )
            {
            // InternalFILTER.g:2856:1: ( '}' )
            // InternalFILTER.g:2857:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getRightCurlyBracketKeyword_20()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__20__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__21"
    // InternalFILTER.g:2866:1: rule__TMTCIFFilterBoolVar__Group__21 : rule__TMTCIFFilterBoolVar__Group__21__Impl ;
    public final void rule__TMTCIFFilterBoolVar__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2870:1: ( rule__TMTCIFFilterBoolVar__Group__21__Impl )
            // InternalFILTER.g:2871:2: rule__TMTCIFFilterBoolVar__Group__21__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVar__Group__21__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__21"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__Group__21__Impl"
    // InternalFILTER.g:2877:1: rule__TMTCIFFilterBoolVar__Group__21__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVar__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2881:1: ( ( ';' ) )
            // InternalFILTER.g:2882:1: ( ';' )
            {
            // InternalFILTER.g:2882:1: ( ';' )
            // InternalFILTER.g:2883:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSemicolonKeyword_21()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__Group__21__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__0"
    // InternalFILTER.g:2893:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__0 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__1 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2897:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__1 )
            // InternalFILTER.g:2898:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl"
    // InternalFILTER.g:2905:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl : ( 'TMTCIFFilterBoolVarFromArrayItem' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2909:1: ( ( 'TMTCIFFilterBoolVarFromArrayItem' ) )
            // InternalFILTER.g:2910:1: ( 'TMTCIFFilterBoolVarFromArrayItem' )
            {
            // InternalFILTER.g:2910:1: ( 'TMTCIFFilterBoolVarFromArrayItem' )
            // InternalFILTER.g:2911:2: 'TMTCIFFilterBoolVarFromArrayItem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getTMTCIFFilterBoolVarFromArrayItemKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__1"
    // InternalFILTER.g:2920:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__1 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__2 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2924:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__2 )
            // InternalFILTER.g:2925:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl"
    // InternalFILTER.g:2932:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2936:1: ( ( '{' ) )
            // InternalFILTER.g:2937:1: ( '{' )
            {
            // InternalFILTER.g:2937:1: ( '{' )
            // InternalFILTER.g:2938:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__2"
    // InternalFILTER.g:2947:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__2 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__3 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2951:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__3 )
            // InternalFILTER.g:2952:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl"
    // InternalFILTER.g:2959:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2963:1: ( ( 'id' ) )
            // InternalFILTER.g:2964:1: ( 'id' )
            {
            // InternalFILTER.g:2964:1: ( 'id' )
            // InternalFILTER.g:2965:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__3"
    // InternalFILTER.g:2974:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__3 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__4 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2978:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__4 )
            // InternalFILTER.g:2979:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__3"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl"
    // InternalFILTER.g:2986:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:2990:1: ( ( ':=' ) )
            // InternalFILTER.g:2991:1: ( ':=' )
            {
            // InternalFILTER.g:2991:1: ( ':=' )
            // InternalFILTER.g:2992:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__4"
    // InternalFILTER.g:3001:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__4 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__5 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3005:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__5 )
            // InternalFILTER.g:3006:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl"
    // InternalFILTER.g:3013:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3017:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 ) ) )
            // InternalFILTER.g:3018:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 ) )
            {
            // InternalFILTER.g:3018:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 ) )
            // InternalFILTER.g:3019:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:3020:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 )
            // InternalFILTER.g:3020:3: rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__5"
    // InternalFILTER.g:3028:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__5 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__6 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3032:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__6 )
            // InternalFILTER.g:3033:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__5"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl"
    // InternalFILTER.g:3040:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3044:1: ( ( ';' ) )
            // InternalFILTER.g:3045:1: ( ';' )
            {
            // InternalFILTER.g:3045:1: ( ';' )
            // InternalFILTER.g:3046:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__6"
    // InternalFILTER.g:3055:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__6 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__7 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3059:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__7 )
            // InternalFILTER.g:3060:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__6"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl"
    // InternalFILTER.g:3067:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl : ( 'name' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3071:1: ( ( 'name' ) )
            // InternalFILTER.g:3072:1: ( 'name' )
            {
            // InternalFILTER.g:3072:1: ( 'name' )
            // InternalFILTER.g:3073:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__7"
    // InternalFILTER.g:3082:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__7 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__8 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3086:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__8 )
            // InternalFILTER.g:3087:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__7"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl"
    // InternalFILTER.g:3094:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3098:1: ( ( ':=' ) )
            // InternalFILTER.g:3099:1: ( ':=' )
            {
            // InternalFILTER.g:3099:1: ( ':=' )
            // InternalFILTER.g:3100:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__8"
    // InternalFILTER.g:3109:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__8 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__9 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3113:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__9 )
            // InternalFILTER.g:3114:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl"
    // InternalFILTER.g:3121:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3125:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 ) ) )
            // InternalFILTER.g:3126:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 ) )
            {
            // InternalFILTER.g:3126:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 ) )
            // InternalFILTER.g:3127:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:3128:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 )
            // InternalFILTER.g:3128:3: rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__9"
    // InternalFILTER.g:3136:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__9 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__10 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3140:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__10 )
            // InternalFILTER.g:3141:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__9"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl"
    // InternalFILTER.g:3148:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3152:1: ( ( ';' ) )
            // InternalFILTER.g:3153:1: ( ';' )
            {
            // InternalFILTER.g:3153:1: ( ';' )
            // InternalFILTER.g:3154:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__10"
    // InternalFILTER.g:3163:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__10 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__11 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3167:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__11 )
            // InternalFILTER.g:3168:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__10"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl"
    // InternalFILTER.g:3175:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3179:1: ( ( 'constantType' ) )
            // InternalFILTER.g:3180:1: ( 'constantType' )
            {
            // InternalFILTER.g:3180:1: ( 'constantType' )
            // InternalFILTER.g:3181:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__11"
    // InternalFILTER.g:3190:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__11 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__12 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3194:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__12 )
            // InternalFILTER.g:3195:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__11"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl"
    // InternalFILTER.g:3202:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3206:1: ( ( ':=' ) )
            // InternalFILTER.g:3207:1: ( ':=' )
            {
            // InternalFILTER.g:3207:1: ( ':=' )
            // InternalFILTER.g:3208:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__12"
    // InternalFILTER.g:3217:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__12 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__13 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3221:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__13 )
            // InternalFILTER.g:3222:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl"
    // InternalFILTER.g:3229:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3233:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:3234:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:3234:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:3235:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:3236:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 )
            // InternalFILTER.g:3236:3: rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__13"
    // InternalFILTER.g:3244:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__13 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__14 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3248:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__14 )
            // InternalFILTER.g:3249:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__13"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl"
    // InternalFILTER.g:3256:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3260:1: ( ( ';' ) )
            // InternalFILTER.g:3261:1: ( ';' )
            {
            // InternalFILTER.g:3261:1: ( ';' )
            // InternalFILTER.g:3262:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__14"
    // InternalFILTER.g:3271:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__14 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__15 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3275:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__15 )
            // InternalFILTER.g:3276:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__15();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__14"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl"
    // InternalFILTER.g:3283:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl : ( 'AIFieldRef' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3287:1: ( ( 'AIFieldRef' ) )
            // InternalFILTER.g:3288:1: ( 'AIFieldRef' )
            {
            // InternalFILTER.g:3288:1: ( 'AIFieldRef' )
            // InternalFILTER.g:3289:2: 'AIFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__15"
    // InternalFILTER.g:3298:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__15 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__16 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3302:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__16 )
            // InternalFILTER.g:3303:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__16();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__15"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl"
    // InternalFILTER.g:3310:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3314:1: ( ( ':=' ) )
            // InternalFILTER.g:3315:1: ( ':=' )
            {
            // InternalFILTER.g:3315:1: ( ':=' )
            // InternalFILTER.g:3316:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__16"
    // InternalFILTER.g:3325:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__16 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__17 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3329:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__17 )
            // InternalFILTER.g:3330:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__17();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__16"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl"
    // InternalFILTER.g:3337:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3341:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) ) )
            // InternalFILTER.g:3342:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) )
            {
            // InternalFILTER.g:3342:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 ) )
            // InternalFILTER.g:3343:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); 
            }
            // InternalFILTER.g:3344:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 )
            // InternalFILTER.g:3344:3: rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__17"
    // InternalFILTER.g:3352:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__17 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__18 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3356:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__18 )
            // InternalFILTER.g:3357:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__18();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__17"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl"
    // InternalFILTER.g:3364:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3368:1: ( ( ';' ) )
            // InternalFILTER.g:3369:1: ( ';' )
            {
            // InternalFILTER.g:3369:1: ( ';' )
            // InternalFILTER.g:3370:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__17__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__18"
    // InternalFILTER.g:3379:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__18 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__19 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3383:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__19 )
            // InternalFILTER.g:3384:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__19();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__18"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl"
    // InternalFILTER.g:3391:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3395:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 ) ) )
            // InternalFILTER.g:3396:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 ) )
            {
            // InternalFILTER.g:3396:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 ) )
            // InternalFILTER.g:3397:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); 
            }
            // InternalFILTER.g:3398:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 )
            // InternalFILTER.g:3398:3: rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpAssignment_18()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__18__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__19"
    // InternalFILTER.g:3406:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__19 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__20 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3410:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__20 )
            // InternalFILTER.g:3411:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__20();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__19"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl"
    // InternalFILTER.g:3418:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl : ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3422:1: ( ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 ) ) )
            // InternalFILTER.g:3423:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 ) )
            {
            // InternalFILTER.g:3423:1: ( ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 ) )
            // InternalFILTER.g:3424:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAlternatives_19()); 
            }
            // InternalFILTER.g:3425:2: ( rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19 )
            // InternalFILTER.g:3425:3: rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAlternatives_19()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__19__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__20"
    // InternalFILTER.g:3433:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__20 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__21 ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3437:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__21 )
            // InternalFILTER.g:3438:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromArrayItem__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__21();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__20"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl"
    // InternalFILTER.g:3445:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3449:1: ( ( '}' ) )
            // InternalFILTER.g:3450:1: ( '}' )
            {
            // InternalFILTER.g:3450:1: ( '}' )
            // InternalFILTER.g:3451:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__20__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__21"
    // InternalFILTER.g:3460:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__21 : rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3464:1: ( rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl )
            // InternalFILTER.g:3465:2: rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__21"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl"
    // InternalFILTER.g:3471:1: rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3475:1: ( ( ';' ) )
            // InternalFILTER.g:3476:1: ( ';' )
            {
            // InternalFILTER.g:3476:1: ( ';' )
            // InternalFILTER.g:3477:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__Group__21__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0"
    // InternalFILTER.g:3487:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3491:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1 )
            // InternalFILTER.g:3492:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl"
    // InternalFILTER.g:3499:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl : ( 'TMTCIFFilterBoolVarFromGroupedArrayItem' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3503:1: ( ( 'TMTCIFFilterBoolVarFromGroupedArrayItem' ) )
            // InternalFILTER.g:3504:1: ( 'TMTCIFFilterBoolVarFromGroupedArrayItem' )
            {
            // InternalFILTER.g:3504:1: ( 'TMTCIFFilterBoolVarFromGroupedArrayItem' )
            // InternalFILTER.g:3505:2: 'TMTCIFFilterBoolVarFromGroupedArrayItem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getTMTCIFFilterBoolVarFromGroupedArrayItemKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1"
    // InternalFILTER.g:3514:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3518:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2 )
            // InternalFILTER.g:3519:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl"
    // InternalFILTER.g:3526:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3530:1: ( ( '{' ) )
            // InternalFILTER.g:3531:1: ( '{' )
            {
            // InternalFILTER.g:3531:1: ( '{' )
            // InternalFILTER.g:3532:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2"
    // InternalFILTER.g:3541:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3545:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3 )
            // InternalFILTER.g:3546:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl"
    // InternalFILTER.g:3553:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3557:1: ( ( 'id' ) )
            // InternalFILTER.g:3558:1: ( 'id' )
            {
            // InternalFILTER.g:3558:1: ( 'id' )
            // InternalFILTER.g:3559:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3"
    // InternalFILTER.g:3568:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3572:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4 )
            // InternalFILTER.g:3573:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl"
    // InternalFILTER.g:3580:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3584:1: ( ( ':=' ) )
            // InternalFILTER.g:3585:1: ( ':=' )
            {
            // InternalFILTER.g:3585:1: ( ':=' )
            // InternalFILTER.g:3586:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4"
    // InternalFILTER.g:3595:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3599:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5 )
            // InternalFILTER.g:3600:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl"
    // InternalFILTER.g:3607:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3611:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) ) )
            // InternalFILTER.g:3612:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) )
            {
            // InternalFILTER.g:3612:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 ) )
            // InternalFILTER.g:3613:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:3614:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 )
            // InternalFILTER.g:3614:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5"
    // InternalFILTER.g:3622:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3626:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6 )
            // InternalFILTER.g:3627:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl"
    // InternalFILTER.g:3634:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3638:1: ( ( ';' ) )
            // InternalFILTER.g:3639:1: ( ';' )
            {
            // InternalFILTER.g:3639:1: ( ';' )
            // InternalFILTER.g:3640:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6"
    // InternalFILTER.g:3649:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3653:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7 )
            // InternalFILTER.g:3654:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl"
    // InternalFILTER.g:3661:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl : ( 'name' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3665:1: ( ( 'name' ) )
            // InternalFILTER.g:3666:1: ( 'name' )
            {
            // InternalFILTER.g:3666:1: ( 'name' )
            // InternalFILTER.g:3667:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7"
    // InternalFILTER.g:3676:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3680:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8 )
            // InternalFILTER.g:3681:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl"
    // InternalFILTER.g:3688:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3692:1: ( ( ':=' ) )
            // InternalFILTER.g:3693:1: ( ':=' )
            {
            // InternalFILTER.g:3693:1: ( ':=' )
            // InternalFILTER.g:3694:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8"
    // InternalFILTER.g:3703:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3707:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9 )
            // InternalFILTER.g:3708:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl"
    // InternalFILTER.g:3715:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3719:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) ) )
            // InternalFILTER.g:3720:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) )
            {
            // InternalFILTER.g:3720:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 ) )
            // InternalFILTER.g:3721:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:3722:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 )
            // InternalFILTER.g:3722:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9"
    // InternalFILTER.g:3730:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3734:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10 )
            // InternalFILTER.g:3735:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl"
    // InternalFILTER.g:3742:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3746:1: ( ( ';' ) )
            // InternalFILTER.g:3747:1: ( ';' )
            {
            // InternalFILTER.g:3747:1: ( ';' )
            // InternalFILTER.g:3748:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10"
    // InternalFILTER.g:3757:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3761:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11 )
            // InternalFILTER.g:3762:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl"
    // InternalFILTER.g:3769:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl : ( 'constantType' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3773:1: ( ( 'constantType' ) )
            // InternalFILTER.g:3774:1: ( 'constantType' )
            {
            // InternalFILTER.g:3774:1: ( 'constantType' )
            // InternalFILTER.g:3775:2: 'constantType'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11"
    // InternalFILTER.g:3784:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3788:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12 )
            // InternalFILTER.g:3789:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl"
    // InternalFILTER.g:3796:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3800:1: ( ( ':=' ) )
            // InternalFILTER.g:3801:1: ( ':=' )
            {
            // InternalFILTER.g:3801:1: ( ':=' )
            // InternalFILTER.g:3802:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12"
    // InternalFILTER.g:3811:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3815:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13 )
            // InternalFILTER.g:3816:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl"
    // InternalFILTER.g:3823:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3827:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) ) )
            // InternalFILTER.g:3828:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) )
            {
            // InternalFILTER.g:3828:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 ) )
            // InternalFILTER.g:3829:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); 
            }
            // InternalFILTER.g:3830:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 )
            // InternalFILTER.g:3830:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13"
    // InternalFILTER.g:3838:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3842:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14 )
            // InternalFILTER.g:3843:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl"
    // InternalFILTER.g:3850:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3854:1: ( ( ';' ) )
            // InternalFILTER.g:3855:1: ( ';' )
            {
            // InternalFILTER.g:3855:1: ( ';' )
            // InternalFILTER.g:3856:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14"
    // InternalFILTER.g:3865:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3869:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15 )
            // InternalFILTER.g:3870:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl"
    // InternalFILTER.g:3877:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl : ( 'group' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3881:1: ( ( 'group' ) )
            // InternalFILTER.g:3882:1: ( 'group' )
            {
            // InternalFILTER.g:3882:1: ( 'group' )
            // InternalFILTER.g:3883:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15"
    // InternalFILTER.g:3892:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3896:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16 )
            // InternalFILTER.g:3897:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl"
    // InternalFILTER.g:3904:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3908:1: ( ( ':=' ) )
            // InternalFILTER.g:3909:1: ( ':=' )
            {
            // InternalFILTER.g:3909:1: ( ':=' )
            // InternalFILTER.g:3910:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16"
    // InternalFILTER.g:3919:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3923:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17 )
            // InternalFILTER.g:3924:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl"
    // InternalFILTER.g:3931:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3935:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) ) )
            // InternalFILTER.g:3936:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) )
            {
            // InternalFILTER.g:3936:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 ) )
            // InternalFILTER.g:3937:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); 
            }
            // InternalFILTER.g:3938:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 )
            // InternalFILTER.g:3938:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17"
    // InternalFILTER.g:3946:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3950:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18 )
            // InternalFILTER.g:3951:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl"
    // InternalFILTER.g:3958:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3962:1: ( ( ';' ) )
            // InternalFILTER.g:3963:1: ( ';' )
            {
            // InternalFILTER.g:3963:1: ( ';' )
            // InternalFILTER.g:3964:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__17__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18"
    // InternalFILTER.g:3973:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3977:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19 )
            // InternalFILTER.g:3978:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl"
    // InternalFILTER.g:3985:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl : ( 'AIFieldRefs' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:3989:1: ( ( 'AIFieldRefs' ) )
            // InternalFILTER.g:3990:1: ( 'AIFieldRefs' )
            {
            // InternalFILTER.g:3990:1: ( 'AIFieldRefs' )
            // InternalFILTER.g:3991:2: 'AIFieldRefs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__18__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19"
    // InternalFILTER.g:4000:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4004:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20 )
            // InternalFILTER.g:4005:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl"
    // InternalFILTER.g:4012:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4016:1: ( ( ':=' ) )
            // InternalFILTER.g:4017:1: ( ':=' )
            {
            // InternalFILTER.g:4017:1: ( ':=' )
            // InternalFILTER.g:4018:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__19__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20"
    // InternalFILTER.g:4027:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4031:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21 )
            // InternalFILTER.g:4032:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl"
    // InternalFILTER.g:4039:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4043:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) ) )
            // InternalFILTER.g:4044:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) )
            {
            // InternalFILTER.g:4044:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 ) )
            // InternalFILTER.g:4045:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); 
            }
            // InternalFILTER.g:4046:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 )
            // InternalFILTER.g:4046:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__20__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21"
    // InternalFILTER.g:4054:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4058:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22 )
            // InternalFILTER.g:4059:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl"
    // InternalFILTER.g:4066:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4070:1: ( ( ';' ) )
            // InternalFILTER.g:4071:1: ( ';' )
            {
            // InternalFILTER.g:4071:1: ( ';' )
            // InternalFILTER.g:4072:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__21__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22"
    // InternalFILTER.g:4081:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4085:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23 )
            // InternalFILTER.g:4086:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl"
    // InternalFILTER.g:4093:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4097:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) ) )
            // InternalFILTER.g:4098:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) )
            {
            // InternalFILTER.g:4098:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 ) )
            // InternalFILTER.g:4099:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); 
            }
            // InternalFILTER.g:4100:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 )
            // InternalFILTER.g:4100:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__22__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23"
    // InternalFILTER.g:4108:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4112:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24 )
            // InternalFILTER.g:4113:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl"
    // InternalFILTER.g:4120:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl : ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4124:1: ( ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) ) )
            // InternalFILTER.g:4125:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) )
            {
            // InternalFILTER.g:4125:1: ( ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 ) )
            // InternalFILTER.g:4126:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); 
            }
            // InternalFILTER.g:4127:2: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23 )
            // InternalFILTER.g:4127:3: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__23__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24"
    // InternalFILTER.g:4135:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25 ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4139:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25 )
            // InternalFILTER.g:4140:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl"
    // InternalFILTER.g:4147:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4151:1: ( ( '}' ) )
            // InternalFILTER.g:4152:1: ( '}' )
            {
            // InternalFILTER.g:4152:1: ( '}' )
            // InternalFILTER.g:4153:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__24__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25"
    // InternalFILTER.g:4162:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25 : rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4166:1: ( rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl )
            // InternalFILTER.g:4167:2: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl"
    // InternalFILTER.g:4173:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4177:1: ( ( ';' ) )
            // InternalFILTER.g:4178:1: ( ';' )
            {
            // InternalFILTER.g:4178:1: ( ';' )
            // InternalFILTER.g:4179:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__25__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__0"
    // InternalFILTER.g:4189:1: rule__TMTCIFFilterBoolVarFDIC__Group__0 : rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl rule__TMTCIFFilterBoolVarFDIC__Group__1 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4193:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl rule__TMTCIFFilterBoolVarFDIC__Group__1 )
            // InternalFILTER.g:4194:2: rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl rule__TMTCIFFilterBoolVarFDIC__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl"
    // InternalFILTER.g:4201:1: rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl : ( 'TMTCIFFilterBoolVarFDIC' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4205:1: ( ( 'TMTCIFFilterBoolVarFDIC' ) )
            // InternalFILTER.g:4206:1: ( 'TMTCIFFilterBoolVarFDIC' )
            {
            // InternalFILTER.g:4206:1: ( 'TMTCIFFilterBoolVarFDIC' )
            // InternalFILTER.g:4207:2: 'TMTCIFFilterBoolVarFDIC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getTMTCIFFilterBoolVarFDICKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__1"
    // InternalFILTER.g:4216:1: rule__TMTCIFFilterBoolVarFDIC__Group__1 : rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl rule__TMTCIFFilterBoolVarFDIC__Group__2 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4220:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl rule__TMTCIFFilterBoolVarFDIC__Group__2 )
            // InternalFILTER.g:4221:2: rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl rule__TMTCIFFilterBoolVarFDIC__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl"
    // InternalFILTER.g:4228:1: rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4232:1: ( ( '{' ) )
            // InternalFILTER.g:4233:1: ( '{' )
            {
            // InternalFILTER.g:4233:1: ( '{' )
            // InternalFILTER.g:4234:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__2"
    // InternalFILTER.g:4243:1: rule__TMTCIFFilterBoolVarFDIC__Group__2 : rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl rule__TMTCIFFilterBoolVarFDIC__Group__3 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4247:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl rule__TMTCIFFilterBoolVarFDIC__Group__3 )
            // InternalFILTER.g:4248:2: rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl rule__TMTCIFFilterBoolVarFDIC__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl"
    // InternalFILTER.g:4255:1: rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4259:1: ( ( 'id' ) )
            // InternalFILTER.g:4260:1: ( 'id' )
            {
            // InternalFILTER.g:4260:1: ( 'id' )
            // InternalFILTER.g:4261:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__3"
    // InternalFILTER.g:4270:1: rule__TMTCIFFilterBoolVarFDIC__Group__3 : rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl rule__TMTCIFFilterBoolVarFDIC__Group__4 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4274:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl rule__TMTCIFFilterBoolVarFDIC__Group__4 )
            // InternalFILTER.g:4275:2: rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl rule__TMTCIFFilterBoolVarFDIC__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__3"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl"
    // InternalFILTER.g:4282:1: rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4286:1: ( ( ':=' ) )
            // InternalFILTER.g:4287:1: ( ':=' )
            {
            // InternalFILTER.g:4287:1: ( ':=' )
            // InternalFILTER.g:4288:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__4"
    // InternalFILTER.g:4297:1: rule__TMTCIFFilterBoolVarFDIC__Group__4 : rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl rule__TMTCIFFilterBoolVarFDIC__Group__5 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4301:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl rule__TMTCIFFilterBoolVarFDIC__Group__5 )
            // InternalFILTER.g:4302:2: rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl rule__TMTCIFFilterBoolVarFDIC__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl"
    // InternalFILTER.g:4309:1: rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl : ( ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4313:1: ( ( ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 ) ) )
            // InternalFILTER.g:4314:1: ( ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 ) )
            {
            // InternalFILTER.g:4314:1: ( ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 ) )
            // InternalFILTER.g:4315:2: ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:4316:2: ( rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 )
            // InternalFILTER.g:4316:3: rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__5"
    // InternalFILTER.g:4324:1: rule__TMTCIFFilterBoolVarFDIC__Group__5 : rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl rule__TMTCIFFilterBoolVarFDIC__Group__6 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4328:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl rule__TMTCIFFilterBoolVarFDIC__Group__6 )
            // InternalFILTER.g:4329:2: rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl rule__TMTCIFFilterBoolVarFDIC__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__5"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl"
    // InternalFILTER.g:4336:1: rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4340:1: ( ( ';' ) )
            // InternalFILTER.g:4341:1: ( ';' )
            {
            // InternalFILTER.g:4341:1: ( ';' )
            // InternalFILTER.g:4342:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__6"
    // InternalFILTER.g:4351:1: rule__TMTCIFFilterBoolVarFDIC__Group__6 : rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl rule__TMTCIFFilterBoolVarFDIC__Group__7 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4355:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl rule__TMTCIFFilterBoolVarFDIC__Group__7 )
            // InternalFILTER.g:4356:2: rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl rule__TMTCIFFilterBoolVarFDIC__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__6"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl"
    // InternalFILTER.g:4363:1: rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl : ( 'name' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4367:1: ( ( 'name' ) )
            // InternalFILTER.g:4368:1: ( 'name' )
            {
            // InternalFILTER.g:4368:1: ( 'name' )
            // InternalFILTER.g:4369:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__7"
    // InternalFILTER.g:4378:1: rule__TMTCIFFilterBoolVarFDIC__Group__7 : rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl rule__TMTCIFFilterBoolVarFDIC__Group__8 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4382:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl rule__TMTCIFFilterBoolVarFDIC__Group__8 )
            // InternalFILTER.g:4383:2: rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl rule__TMTCIFFilterBoolVarFDIC__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__7"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl"
    // InternalFILTER.g:4390:1: rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4394:1: ( ( ':=' ) )
            // InternalFILTER.g:4395:1: ( ':=' )
            {
            // InternalFILTER.g:4395:1: ( ':=' )
            // InternalFILTER.g:4396:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__8"
    // InternalFILTER.g:4405:1: rule__TMTCIFFilterBoolVarFDIC__Group__8 : rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl rule__TMTCIFFilterBoolVarFDIC__Group__9 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4409:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl rule__TMTCIFFilterBoolVarFDIC__Group__9 )
            // InternalFILTER.g:4410:2: rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl rule__TMTCIFFilterBoolVarFDIC__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl"
    // InternalFILTER.g:4417:1: rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl : ( ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4421:1: ( ( ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 ) ) )
            // InternalFILTER.g:4422:1: ( ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 ) )
            {
            // InternalFILTER.g:4422:1: ( ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 ) )
            // InternalFILTER.g:4423:2: ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameAssignment_8()); 
            }
            // InternalFILTER.g:4424:2: ( rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 )
            // InternalFILTER.g:4424:3: rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__9"
    // InternalFILTER.g:4432:1: rule__TMTCIFFilterBoolVarFDIC__Group__9 : rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl rule__TMTCIFFilterBoolVarFDIC__Group__10 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4436:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl rule__TMTCIFFilterBoolVarFDIC__Group__10 )
            // InternalFILTER.g:4437:2: rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl rule__TMTCIFFilterBoolVarFDIC__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__9"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl"
    // InternalFILTER.g:4444:1: rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4448:1: ( ( ';' ) )
            // InternalFILTER.g:4449:1: ( ';' )
            {
            // InternalFILTER.g:4449:1: ( ';' )
            // InternalFILTER.g:4450:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__10"
    // InternalFILTER.g:4459:1: rule__TMTCIFFilterBoolVarFDIC__Group__10 : rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl rule__TMTCIFFilterBoolVarFDIC__Group__11 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4463:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl rule__TMTCIFFilterBoolVarFDIC__Group__11 )
            // InternalFILTER.g:4464:2: rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl rule__TMTCIFFilterBoolVarFDIC__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__10"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl"
    // InternalFILTER.g:4471:1: rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl : ( 'FieldRef' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4475:1: ( ( 'FieldRef' ) )
            // InternalFILTER.g:4476:1: ( 'FieldRef' )
            {
            // InternalFILTER.g:4476:1: ( 'FieldRef' )
            // InternalFILTER.g:4477:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefKeyword_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__11"
    // InternalFILTER.g:4486:1: rule__TMTCIFFilterBoolVarFDIC__Group__11 : rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl rule__TMTCIFFilterBoolVarFDIC__Group__12 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4490:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl rule__TMTCIFFilterBoolVarFDIC__Group__12 )
            // InternalFILTER.g:4491:2: rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl rule__TMTCIFFilterBoolVarFDIC__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__11"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl"
    // InternalFILTER.g:4498:1: rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4502:1: ( ( ':=' ) )
            // InternalFILTER.g:4503:1: ( ':=' )
            {
            // InternalFILTER.g:4503:1: ( ':=' )
            // InternalFILTER.g:4504:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__12"
    // InternalFILTER.g:4513:1: rule__TMTCIFFilterBoolVarFDIC__Group__12 : rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl rule__TMTCIFFilterBoolVarFDIC__Group__13 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4517:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl rule__TMTCIFFilterBoolVarFDIC__Group__13 )
            // InternalFILTER.g:4518:2: rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl rule__TMTCIFFilterBoolVarFDIC__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl"
    // InternalFILTER.g:4525:1: rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl : ( ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4529:1: ( ( ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 ) ) )
            // InternalFILTER.g:4530:1: ( ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 ) )
            {
            // InternalFILTER.g:4530:1: ( ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 ) )
            // InternalFILTER.g:4531:2: ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefAssignment_12()); 
            }
            // InternalFILTER.g:4532:2: ( rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 )
            // InternalFILTER.g:4532:3: rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefAssignment_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__13"
    // InternalFILTER.g:4540:1: rule__TMTCIFFilterBoolVarFDIC__Group__13 : rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl rule__TMTCIFFilterBoolVarFDIC__Group__14 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4544:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl rule__TMTCIFFilterBoolVarFDIC__Group__14 )
            // InternalFILTER.g:4545:2: rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl rule__TMTCIFFilterBoolVarFDIC__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__13"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl"
    // InternalFILTER.g:4552:1: rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4556:1: ( ( ';' ) )
            // InternalFILTER.g:4557:1: ( ';' )
            {
            // InternalFILTER.g:4557:1: ( ';' )
            // InternalFILTER.g:4558:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__14"
    // InternalFILTER.g:4567:1: rule__TMTCIFFilterBoolVarFDIC__Group__14 : rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl rule__TMTCIFFilterBoolVarFDIC__Group__15 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4571:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl rule__TMTCIFFilterBoolVarFDIC__Group__15 )
            // InternalFILTER.g:4572:2: rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl rule__TMTCIFFilterBoolVarFDIC__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__15();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__14"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl"
    // InternalFILTER.g:4579:1: rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl : ( ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 ) ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4583:1: ( ( ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 ) ) )
            // InternalFILTER.g:4584:1: ( ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 ) )
            {
            // InternalFILTER.g:4584:1: ( ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 ) )
            // InternalFILTER.g:4585:2: ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpAssignment_14()); 
            }
            // InternalFILTER.g:4586:2: ( rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 )
            // InternalFILTER.g:4586:3: rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpAssignment_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__15"
    // InternalFILTER.g:4594:1: rule__TMTCIFFilterBoolVarFDIC__Group__15 : rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl rule__TMTCIFFilterBoolVarFDIC__Group__16 ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4598:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl rule__TMTCIFFilterBoolVarFDIC__Group__16 )
            // InternalFILTER.g:4599:2: rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl rule__TMTCIFFilterBoolVarFDIC__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__16();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__15"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl"
    // InternalFILTER.g:4606:1: rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4610:1: ( ( '}' ) )
            // InternalFILTER.g:4611:1: ( '}' )
            {
            // InternalFILTER.g:4611:1: ( '}' )
            // InternalFILTER.g:4612:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__16"
    // InternalFILTER.g:4621:1: rule__TMTCIFFilterBoolVarFDIC__Group__16 : rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4625:1: ( rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl )
            // InternalFILTER.g:4626:2: rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__16"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl"
    // InternalFILTER.g:4632:1: rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4636:1: ( ( ';' ) )
            // InternalFILTER.g:4637:1: ( ';' )
            {
            // InternalFILTER.g:4637:1: ( ';' )
            // InternalFILTER.g:4638:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getSemicolonKeyword_16()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__0"
    // InternalFILTER.g:4648:1: rule__TMTCIFFilterFieldOp__Group__0 : rule__TMTCIFFilterFieldOp__Group__0__Impl rule__TMTCIFFilterFieldOp__Group__1 ;
    public final void rule__TMTCIFFilterFieldOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4652:1: ( rule__TMTCIFFilterFieldOp__Group__0__Impl rule__TMTCIFFilterFieldOp__Group__1 )
            // InternalFILTER.g:4653:2: rule__TMTCIFFilterFieldOp__Group__0__Impl rule__TMTCIFFilterFieldOp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterFieldOp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__0"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__0__Impl"
    // InternalFILTER.g:4660:1: rule__TMTCIFFilterFieldOp__Group__0__Impl : ( 'TMTCIFFilterFieldOp' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4664:1: ( ( 'TMTCIFFilterFieldOp' ) )
            // InternalFILTER.g:4665:1: ( 'TMTCIFFilterFieldOp' )
            {
            // InternalFILTER.g:4665:1: ( 'TMTCIFFilterFieldOp' )
            // InternalFILTER.g:4666:2: 'TMTCIFFilterFieldOp'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTMTCIFFilterFieldOpKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__1"
    // InternalFILTER.g:4675:1: rule__TMTCIFFilterFieldOp__Group__1 : rule__TMTCIFFilterFieldOp__Group__1__Impl rule__TMTCIFFilterFieldOp__Group__2 ;
    public final void rule__TMTCIFFilterFieldOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4679:1: ( rule__TMTCIFFilterFieldOp__Group__1__Impl rule__TMTCIFFilterFieldOp__Group__2 )
            // InternalFILTER.g:4680:2: rule__TMTCIFFilterFieldOp__Group__1__Impl rule__TMTCIFFilterFieldOp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__TMTCIFFilterFieldOp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__1"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__1__Impl"
    // InternalFILTER.g:4687:1: rule__TMTCIFFilterFieldOp__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4691:1: ( ( '{' ) )
            // InternalFILTER.g:4692:1: ( '{' )
            {
            // InternalFILTER.g:4692:1: ( '{' )
            // InternalFILTER.g:4693:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__2"
    // InternalFILTER.g:4702:1: rule__TMTCIFFilterFieldOp__Group__2 : rule__TMTCIFFilterFieldOp__Group__2__Impl rule__TMTCIFFilterFieldOp__Group__3 ;
    public final void rule__TMTCIFFilterFieldOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4706:1: ( rule__TMTCIFFilterFieldOp__Group__2__Impl rule__TMTCIFFilterFieldOp__Group__3 )
            // InternalFILTER.g:4707:2: rule__TMTCIFFilterFieldOp__Group__2__Impl rule__TMTCIFFilterFieldOp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterFieldOp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__2"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__2__Impl"
    // InternalFILTER.g:4714:1: rule__TMTCIFFilterFieldOp__Group__2__Impl : ( 'type' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4718:1: ( ( 'type' ) )
            // InternalFILTER.g:4719:1: ( 'type' )
            {
            // InternalFILTER.g:4719:1: ( 'type' )
            // InternalFILTER.g:4720:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__3"
    // InternalFILTER.g:4729:1: rule__TMTCIFFilterFieldOp__Group__3 : rule__TMTCIFFilterFieldOp__Group__3__Impl rule__TMTCIFFilterFieldOp__Group__4 ;
    public final void rule__TMTCIFFilterFieldOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4733:1: ( rule__TMTCIFFilterFieldOp__Group__3__Impl rule__TMTCIFFilterFieldOp__Group__4 )
            // InternalFILTER.g:4734:2: rule__TMTCIFFilterFieldOp__Group__3__Impl rule__TMTCIFFilterFieldOp__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TMTCIFFilterFieldOp__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__3"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__3__Impl"
    // InternalFILTER.g:4741:1: rule__TMTCIFFilterFieldOp__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4745:1: ( ( ':=' ) )
            // InternalFILTER.g:4746:1: ( ':=' )
            {
            // InternalFILTER.g:4746:1: ( ':=' )
            // InternalFILTER.g:4747:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__4"
    // InternalFILTER.g:4756:1: rule__TMTCIFFilterFieldOp__Group__4 : rule__TMTCIFFilterFieldOp__Group__4__Impl rule__TMTCIFFilterFieldOp__Group__5 ;
    public final void rule__TMTCIFFilterFieldOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4760:1: ( rule__TMTCIFFilterFieldOp__Group__4__Impl rule__TMTCIFFilterFieldOp__Group__5 )
            // InternalFILTER.g:4761:2: rule__TMTCIFFilterFieldOp__Group__4__Impl rule__TMTCIFFilterFieldOp__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterFieldOp__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__4"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__4__Impl"
    // InternalFILTER.g:4768:1: rule__TMTCIFFilterFieldOp__Group__4__Impl : ( ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4772:1: ( ( ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 ) ) )
            // InternalFILTER.g:4773:1: ( ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 ) )
            {
            // InternalFILTER.g:4773:1: ( ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 ) )
            // InternalFILTER.g:4774:2: ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeAssignment_4()); 
            }
            // InternalFILTER.g:4775:2: ( rule__TMTCIFFilterFieldOp__TypeAssignment_4 )
            // InternalFILTER.g:4775:3: rule__TMTCIFFilterFieldOp__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__5"
    // InternalFILTER.g:4783:1: rule__TMTCIFFilterFieldOp__Group__5 : rule__TMTCIFFilterFieldOp__Group__5__Impl rule__TMTCIFFilterFieldOp__Group__6 ;
    public final void rule__TMTCIFFilterFieldOp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4787:1: ( rule__TMTCIFFilterFieldOp__Group__5__Impl rule__TMTCIFFilterFieldOp__Group__6 )
            // InternalFILTER.g:4788:2: rule__TMTCIFFilterFieldOp__Group__5__Impl rule__TMTCIFFilterFieldOp__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterFieldOp__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__5"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__5__Impl"
    // InternalFILTER.g:4795:1: rule__TMTCIFFilterFieldOp__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4799:1: ( ( ';' ) )
            // InternalFILTER.g:4800:1: ( ';' )
            {
            // InternalFILTER.g:4800:1: ( ';' )
            // InternalFILTER.g:4801:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__6"
    // InternalFILTER.g:4810:1: rule__TMTCIFFilterFieldOp__Group__6 : rule__TMTCIFFilterFieldOp__Group__6__Impl rule__TMTCIFFilterFieldOp__Group__7 ;
    public final void rule__TMTCIFFilterFieldOp__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4814:1: ( rule__TMTCIFFilterFieldOp__Group__6__Impl rule__TMTCIFFilterFieldOp__Group__7 )
            // InternalFILTER.g:4815:2: rule__TMTCIFFilterFieldOp__Group__6__Impl rule__TMTCIFFilterFieldOp__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterFieldOp__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__6"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__6__Impl"
    // InternalFILTER.g:4822:1: rule__TMTCIFFilterFieldOp__Group__6__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4826:1: ( ( '}' ) )
            // InternalFILTER.g:4827:1: ( '}' )
            {
            // InternalFILTER.g:4827:1: ( '}' )
            // InternalFILTER.g:4828:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__7"
    // InternalFILTER.g:4837:1: rule__TMTCIFFilterFieldOp__Group__7 : rule__TMTCIFFilterFieldOp__Group__7__Impl ;
    public final void rule__TMTCIFFilterFieldOp__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4841:1: ( rule__TMTCIFFilterFieldOp__Group__7__Impl )
            // InternalFILTER.g:4842:2: rule__TMTCIFFilterFieldOp__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterFieldOp__Group__7__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__7"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__Group__7__Impl"
    // InternalFILTER.g:4848:1: rule__TMTCIFFilterFieldOp__Group__7__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterFieldOp__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4852:1: ( ( ';' ) )
            // InternalFILTER.g:4853:1: ( ';' )
            {
            // InternalFILTER.g:4853:1: ( ';' )
            // InternalFILTER.g:4854:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getSemicolonKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__0"
    // InternalFILTER.g:4864:1: rule__TMTCIFFilterConstant__Group__0 : rule__TMTCIFFilterConstant__Group__0__Impl rule__TMTCIFFilterConstant__Group__1 ;
    public final void rule__TMTCIFFilterConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4868:1: ( rule__TMTCIFFilterConstant__Group__0__Impl rule__TMTCIFFilterConstant__Group__1 )
            // InternalFILTER.g:4869:2: rule__TMTCIFFilterConstant__Group__0__Impl rule__TMTCIFFilterConstant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__0"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__0__Impl"
    // InternalFILTER.g:4876:1: rule__TMTCIFFilterConstant__Group__0__Impl : ( 'TMTCIFFilterConstant' ) ;
    public final void rule__TMTCIFFilterConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4880:1: ( ( 'TMTCIFFilterConstant' ) )
            // InternalFILTER.g:4881:1: ( 'TMTCIFFilterConstant' )
            {
            // InternalFILTER.g:4881:1: ( 'TMTCIFFilterConstant' )
            // InternalFILTER.g:4882:2: 'TMTCIFFilterConstant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getTMTCIFFilterConstantKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__1"
    // InternalFILTER.g:4891:1: rule__TMTCIFFilterConstant__Group__1 : rule__TMTCIFFilterConstant__Group__1__Impl rule__TMTCIFFilterConstant__Group__2 ;
    public final void rule__TMTCIFFilterConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4895:1: ( rule__TMTCIFFilterConstant__Group__1__Impl rule__TMTCIFFilterConstant__Group__2 )
            // InternalFILTER.g:4896:2: rule__TMTCIFFilterConstant__Group__1__Impl rule__TMTCIFFilterConstant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFFilterConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__1"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__1__Impl"
    // InternalFILTER.g:4903:1: rule__TMTCIFFilterConstant__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4907:1: ( ( '{' ) )
            // InternalFILTER.g:4908:1: ( '{' )
            {
            // InternalFILTER.g:4908:1: ( '{' )
            // InternalFILTER.g:4909:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__2"
    // InternalFILTER.g:4918:1: rule__TMTCIFFilterConstant__Group__2 : rule__TMTCIFFilterConstant__Group__2__Impl rule__TMTCIFFilterConstant__Group__3 ;
    public final void rule__TMTCIFFilterConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4922:1: ( rule__TMTCIFFilterConstant__Group__2__Impl rule__TMTCIFFilterConstant__Group__3 )
            // InternalFILTER.g:4923:2: rule__TMTCIFFilterConstant__Group__2__Impl rule__TMTCIFFilterConstant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterConstant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__2"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__2__Impl"
    // InternalFILTER.g:4930:1: rule__TMTCIFFilterConstant__Group__2__Impl : ( 'value' ) ;
    public final void rule__TMTCIFFilterConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4934:1: ( ( 'value' ) )
            // InternalFILTER.g:4935:1: ( 'value' )
            {
            // InternalFILTER.g:4935:1: ( 'value' )
            // InternalFILTER.g:4936:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getValueKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__3"
    // InternalFILTER.g:4945:1: rule__TMTCIFFilterConstant__Group__3 : rule__TMTCIFFilterConstant__Group__3__Impl rule__TMTCIFFilterConstant__Group__4 ;
    public final void rule__TMTCIFFilterConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4949:1: ( rule__TMTCIFFilterConstant__Group__3__Impl rule__TMTCIFFilterConstant__Group__4 )
            // InternalFILTER.g:4950:2: rule__TMTCIFFilterConstant__Group__3__Impl rule__TMTCIFFilterConstant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterConstant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__3"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__3__Impl"
    // InternalFILTER.g:4957:1: rule__TMTCIFFilterConstant__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4961:1: ( ( ':=' ) )
            // InternalFILTER.g:4962:1: ( ':=' )
            {
            // InternalFILTER.g:4962:1: ( ':=' )
            // InternalFILTER.g:4963:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__4"
    // InternalFILTER.g:4972:1: rule__TMTCIFFilterConstant__Group__4 : rule__TMTCIFFilterConstant__Group__4__Impl rule__TMTCIFFilterConstant__Group__5 ;
    public final void rule__TMTCIFFilterConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4976:1: ( rule__TMTCIFFilterConstant__Group__4__Impl rule__TMTCIFFilterConstant__Group__5 )
            // InternalFILTER.g:4977:2: rule__TMTCIFFilterConstant__Group__4__Impl rule__TMTCIFFilterConstant__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterConstant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__4"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__4__Impl"
    // InternalFILTER.g:4984:1: rule__TMTCIFFilterConstant__Group__4__Impl : ( ( rule__TMTCIFFilterConstant__ValueAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:4988:1: ( ( ( rule__TMTCIFFilterConstant__ValueAssignment_4 ) ) )
            // InternalFILTER.g:4989:1: ( ( rule__TMTCIFFilterConstant__ValueAssignment_4 ) )
            {
            // InternalFILTER.g:4989:1: ( ( rule__TMTCIFFilterConstant__ValueAssignment_4 ) )
            // InternalFILTER.g:4990:2: ( rule__TMTCIFFilterConstant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getValueAssignment_4()); 
            }
            // InternalFILTER.g:4991:2: ( rule__TMTCIFFilterConstant__ValueAssignment_4 )
            // InternalFILTER.g:4991:3: rule__TMTCIFFilterConstant__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getValueAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__5"
    // InternalFILTER.g:4999:1: rule__TMTCIFFilterConstant__Group__5 : rule__TMTCIFFilterConstant__Group__5__Impl rule__TMTCIFFilterConstant__Group__6 ;
    public final void rule__TMTCIFFilterConstant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5003:1: ( rule__TMTCIFFilterConstant__Group__5__Impl rule__TMTCIFFilterConstant__Group__6 )
            // InternalFILTER.g:5004:2: rule__TMTCIFFilterConstant__Group__5__Impl rule__TMTCIFFilterConstant__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__TMTCIFFilterConstant__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__5"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__5__Impl"
    // InternalFILTER.g:5011:1: rule__TMTCIFFilterConstant__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterConstant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5015:1: ( ( ';' ) )
            // InternalFILTER.g:5016:1: ( ';' )
            {
            // InternalFILTER.g:5016:1: ( ';' )
            // InternalFILTER.g:5017:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__6"
    // InternalFILTER.g:5026:1: rule__TMTCIFFilterConstant__Group__6 : rule__TMTCIFFilterConstant__Group__6__Impl rule__TMTCIFFilterConstant__Group__7 ;
    public final void rule__TMTCIFFilterConstant__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5030:1: ( rule__TMTCIFFilterConstant__Group__6__Impl rule__TMTCIFFilterConstant__Group__7 )
            // InternalFILTER.g:5031:2: rule__TMTCIFFilterConstant__Group__6__Impl rule__TMTCIFFilterConstant__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__TMTCIFFilterConstant__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__6"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__6__Impl"
    // InternalFILTER.g:5038:1: rule__TMTCIFFilterConstant__Group__6__Impl : ( ( rule__TMTCIFFilterConstant__Group_6__0 )? ) ;
    public final void rule__TMTCIFFilterConstant__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5042:1: ( ( ( rule__TMTCIFFilterConstant__Group_6__0 )? ) )
            // InternalFILTER.g:5043:1: ( ( rule__TMTCIFFilterConstant__Group_6__0 )? )
            {
            // InternalFILTER.g:5043:1: ( ( rule__TMTCIFFilterConstant__Group_6__0 )? )
            // InternalFILTER.g:5044:2: ( rule__TMTCIFFilterConstant__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getGroup_6()); 
            }
            // InternalFILTER.g:5045:2: ( rule__TMTCIFFilterConstant__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFILTER.g:5045:3: rule__TMTCIFFilterConstant__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterConstant__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getGroup_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__7"
    // InternalFILTER.g:5053:1: rule__TMTCIFFilterConstant__Group__7 : rule__TMTCIFFilterConstant__Group__7__Impl rule__TMTCIFFilterConstant__Group__8 ;
    public final void rule__TMTCIFFilterConstant__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5057:1: ( rule__TMTCIFFilterConstant__Group__7__Impl rule__TMTCIFFilterConstant__Group__8 )
            // InternalFILTER.g:5058:2: rule__TMTCIFFilterConstant__Group__7__Impl rule__TMTCIFFilterConstant__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterConstant__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__7"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__7__Impl"
    // InternalFILTER.g:5065:1: rule__TMTCIFFilterConstant__Group__7__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterConstant__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5069:1: ( ( '}' ) )
            // InternalFILTER.g:5070:1: ( '}' )
            {
            // InternalFILTER.g:5070:1: ( '}' )
            // InternalFILTER.g:5071:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__8"
    // InternalFILTER.g:5080:1: rule__TMTCIFFilterConstant__Group__8 : rule__TMTCIFFilterConstant__Group__8__Impl ;
    public final void rule__TMTCIFFilterConstant__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5084:1: ( rule__TMTCIFFilterConstant__Group__8__Impl )
            // InternalFILTER.g:5085:2: rule__TMTCIFFilterConstant__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group__8__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__8"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group__8__Impl"
    // InternalFILTER.g:5091:1: rule__TMTCIFFilterConstant__Group__8__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterConstant__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5095:1: ( ( ';' ) )
            // InternalFILTER.g:5096:1: ( ';' )
            {
            // InternalFILTER.g:5096:1: ( ';' )
            // InternalFILTER.g:5097:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__0"
    // InternalFILTER.g:5107:1: rule__TMTCIFFilterConstant__Group_6__0 : rule__TMTCIFFilterConstant__Group_6__0__Impl rule__TMTCIFFilterConstant__Group_6__1 ;
    public final void rule__TMTCIFFilterConstant__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5111:1: ( rule__TMTCIFFilterConstant__Group_6__0__Impl rule__TMTCIFFilterConstant__Group_6__1 )
            // InternalFILTER.g:5112:2: rule__TMTCIFFilterConstant__Group_6__0__Impl rule__TMTCIFFilterConstant__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterConstant__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group_6__1();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__0"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__0__Impl"
    // InternalFILTER.g:5119:1: rule__TMTCIFFilterConstant__Group_6__0__Impl : ( 'mask' ) ;
    public final void rule__TMTCIFFilterConstant__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5123:1: ( ( 'mask' ) )
            // InternalFILTER.g:5124:1: ( 'mask' )
            {
            // InternalFILTER.g:5124:1: ( 'mask' )
            // InternalFILTER.g:5125:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskKeyword_6_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__1"
    // InternalFILTER.g:5134:1: rule__TMTCIFFilterConstant__Group_6__1 : rule__TMTCIFFilterConstant__Group_6__1__Impl rule__TMTCIFFilterConstant__Group_6__2 ;
    public final void rule__TMTCIFFilterConstant__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5138:1: ( rule__TMTCIFFilterConstant__Group_6__1__Impl rule__TMTCIFFilterConstant__Group_6__2 )
            // InternalFILTER.g:5139:2: rule__TMTCIFFilterConstant__Group_6__1__Impl rule__TMTCIFFilterConstant__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TMTCIFFilterConstant__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group_6__2();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__1"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__1__Impl"
    // InternalFILTER.g:5146:1: rule__TMTCIFFilterConstant__Group_6__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterConstant__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5150:1: ( ( ':=' ) )
            // InternalFILTER.g:5151:1: ( ':=' )
            {
            // InternalFILTER.g:5151:1: ( ':=' )
            // InternalFILTER.g:5152:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getColonEqualsSignKeyword_6_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__2"
    // InternalFILTER.g:5161:1: rule__TMTCIFFilterConstant__Group_6__2 : rule__TMTCIFFilterConstant__Group_6__2__Impl rule__TMTCIFFilterConstant__Group_6__3 ;
    public final void rule__TMTCIFFilterConstant__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5165:1: ( rule__TMTCIFFilterConstant__Group_6__2__Impl rule__TMTCIFFilterConstant__Group_6__3 )
            // InternalFILTER.g:5166:2: rule__TMTCIFFilterConstant__Group_6__2__Impl rule__TMTCIFFilterConstant__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterConstant__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group_6__3();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__2"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__2__Impl"
    // InternalFILTER.g:5173:1: rule__TMTCIFFilterConstant__Group_6__2__Impl : ( ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 ) ) ;
    public final void rule__TMTCIFFilterConstant__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5177:1: ( ( ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 ) ) )
            // InternalFILTER.g:5178:1: ( ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 ) )
            {
            // InternalFILTER.g:5178:1: ( ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 ) )
            // InternalFILTER.g:5179:2: ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskAssignment_6_2()); 
            }
            // InternalFILTER.g:5180:2: ( rule__TMTCIFFilterConstant__MaskAssignment_6_2 )
            // InternalFILTER.g:5180:3: rule__TMTCIFFilterConstant__MaskAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__MaskAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskAssignment_6_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__3"
    // InternalFILTER.g:5188:1: rule__TMTCIFFilterConstant__Group_6__3 : rule__TMTCIFFilterConstant__Group_6__3__Impl ;
    public final void rule__TMTCIFFilterConstant__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5192:1: ( rule__TMTCIFFilterConstant__Group_6__3__Impl )
            // InternalFILTER.g:5193:2: rule__TMTCIFFilterConstant__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterConstant__Group_6__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__3"


    // $ANTLR start "rule__TMTCIFFilterConstant__Group_6__3__Impl"
    // InternalFILTER.g:5199:1: rule__TMTCIFFilterConstant__Group_6__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterConstant__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5203:1: ( ( ';' ) )
            // InternalFILTER.g:5204:1: ( ';' )
            {
            // InternalFILTER.g:5204:1: ( ';' )
            // InternalFILTER.g:5205:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getSemicolonKeyword_6_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__Group_6__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__0"
    // InternalFILTER.g:5215:1: rule__TMTCIFFilterSelect__Group__0 : rule__TMTCIFFilterSelect__Group__0__Impl rule__TMTCIFFilterSelect__Group__1 ;
    public final void rule__TMTCIFFilterSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5219:1: ( rule__TMTCIFFilterSelect__Group__0__Impl rule__TMTCIFFilterSelect__Group__1 )
            // InternalFILTER.g:5220:2: rule__TMTCIFFilterSelect__Group__0__Impl rule__TMTCIFFilterSelect__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterSelect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__0"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__0__Impl"
    // InternalFILTER.g:5227:1: rule__TMTCIFFilterSelect__Group__0__Impl : ( 'TMTCIFFilterSelect' ) ;
    public final void rule__TMTCIFFilterSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5231:1: ( ( 'TMTCIFFilterSelect' ) )
            // InternalFILTER.g:5232:1: ( 'TMTCIFFilterSelect' )
            {
            // InternalFILTER.g:5232:1: ( 'TMTCIFFilterSelect' )
            // InternalFILTER.g:5233:2: 'TMTCIFFilterSelect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getTMTCIFFilterSelectKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__1"
    // InternalFILTER.g:5242:1: rule__TMTCIFFilterSelect__Group__1 : rule__TMTCIFFilterSelect__Group__1__Impl rule__TMTCIFFilterSelect__Group__2 ;
    public final void rule__TMTCIFFilterSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5246:1: ( rule__TMTCIFFilterSelect__Group__1__Impl rule__TMTCIFFilterSelect__Group__2 )
            // InternalFILTER.g:5247:2: rule__TMTCIFFilterSelect__Group__1__Impl rule__TMTCIFFilterSelect__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__TMTCIFFilterSelect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__1"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__1__Impl"
    // InternalFILTER.g:5254:1: rule__TMTCIFFilterSelect__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5258:1: ( ( '{' ) )
            // InternalFILTER.g:5259:1: ( '{' )
            {
            // InternalFILTER.g:5259:1: ( '{' )
            // InternalFILTER.g:5260:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__2"
    // InternalFILTER.g:5269:1: rule__TMTCIFFilterSelect__Group__2 : rule__TMTCIFFilterSelect__Group__2__Impl rule__TMTCIFFilterSelect__Group__3 ;
    public final void rule__TMTCIFFilterSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5273:1: ( rule__TMTCIFFilterSelect__Group__2__Impl rule__TMTCIFFilterSelect__Group__3 )
            // InternalFILTER.g:5274:2: rule__TMTCIFFilterSelect__Group__2__Impl rule__TMTCIFFilterSelect__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__2"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__2__Impl"
    // InternalFILTER.g:5281:1: rule__TMTCIFFilterSelect__Group__2__Impl : ( 'fromFile' ) ;
    public final void rule__TMTCIFFilterSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5285:1: ( ( 'fromFile' ) )
            // InternalFILTER.g:5286:1: ( 'fromFile' )
            {
            // InternalFILTER.g:5286:1: ( 'fromFile' )
            // InternalFILTER.g:5287:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__3"
    // InternalFILTER.g:5296:1: rule__TMTCIFFilterSelect__Group__3 : rule__TMTCIFFilterSelect__Group__3__Impl rule__TMTCIFFilterSelect__Group__4 ;
    public final void rule__TMTCIFFilterSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5300:1: ( rule__TMTCIFFilterSelect__Group__3__Impl rule__TMTCIFFilterSelect__Group__4 )
            // InternalFILTER.g:5301:2: rule__TMTCIFFilterSelect__Group__3__Impl rule__TMTCIFFilterSelect__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterSelect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__3"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__3__Impl"
    // InternalFILTER.g:5308:1: rule__TMTCIFFilterSelect__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5312:1: ( ( ':=' ) )
            // InternalFILTER.g:5313:1: ( ':=' )
            {
            // InternalFILTER.g:5313:1: ( ':=' )
            // InternalFILTER.g:5314:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__4"
    // InternalFILTER.g:5323:1: rule__TMTCIFFilterSelect__Group__4 : rule__TMTCIFFilterSelect__Group__4__Impl rule__TMTCIFFilterSelect__Group__5 ;
    public final void rule__TMTCIFFilterSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5327:1: ( rule__TMTCIFFilterSelect__Group__4__Impl rule__TMTCIFFilterSelect__Group__5 )
            // InternalFILTER.g:5328:2: rule__TMTCIFFilterSelect__Group__4__Impl rule__TMTCIFFilterSelect__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__4"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__4__Impl"
    // InternalFILTER.g:5335:1: rule__TMTCIFFilterSelect__Group__4__Impl : ( ( rule__TMTCIFFilterSelect__FromFileAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5339:1: ( ( ( rule__TMTCIFFilterSelect__FromFileAssignment_4 ) ) )
            // InternalFILTER.g:5340:1: ( ( rule__TMTCIFFilterSelect__FromFileAssignment_4 ) )
            {
            // InternalFILTER.g:5340:1: ( ( rule__TMTCIFFilterSelect__FromFileAssignment_4 ) )
            // InternalFILTER.g:5341:2: ( rule__TMTCIFFilterSelect__FromFileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileAssignment_4()); 
            }
            // InternalFILTER.g:5342:2: ( rule__TMTCIFFilterSelect__FromFileAssignment_4 )
            // InternalFILTER.g:5342:3: rule__TMTCIFFilterSelect__FromFileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__FromFileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__5"
    // InternalFILTER.g:5350:1: rule__TMTCIFFilterSelect__Group__5 : rule__TMTCIFFilterSelect__Group__5__Impl rule__TMTCIFFilterSelect__Group__6 ;
    public final void rule__TMTCIFFilterSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5354:1: ( rule__TMTCIFFilterSelect__Group__5__Impl rule__TMTCIFFilterSelect__Group__6 )
            // InternalFILTER.g:5355:2: rule__TMTCIFFilterSelect__Group__5__Impl rule__TMTCIFFilterSelect__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__TMTCIFFilterSelect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__5"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__5__Impl"
    // InternalFILTER.g:5362:1: rule__TMTCIFFilterSelect__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5366:1: ( ( ';' ) )
            // InternalFILTER.g:5367:1: ( ';' )
            {
            // InternalFILTER.g:5367:1: ( ';' )
            // InternalFILTER.g:5368:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__6"
    // InternalFILTER.g:5377:1: rule__TMTCIFFilterSelect__Group__6 : rule__TMTCIFFilterSelect__Group__6__Impl rule__TMTCIFFilterSelect__Group__7 ;
    public final void rule__TMTCIFFilterSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5381:1: ( rule__TMTCIFFilterSelect__Group__6__Impl rule__TMTCIFFilterSelect__Group__7 )
            // InternalFILTER.g:5382:2: rule__TMTCIFFilterSelect__Group__6__Impl rule__TMTCIFFilterSelect__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelect__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__6"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__6__Impl"
    // InternalFILTER.g:5389:1: rule__TMTCIFFilterSelect__Group__6__Impl : ( 'type' ) ;
    public final void rule__TMTCIFFilterSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5393:1: ( ( 'type' ) )
            // InternalFILTER.g:5394:1: ( 'type' )
            {
            // InternalFILTER.g:5394:1: ( 'type' )
            // InternalFILTER.g:5395:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__7"
    // InternalFILTER.g:5404:1: rule__TMTCIFFilterSelect__Group__7 : rule__TMTCIFFilterSelect__Group__7__Impl rule__TMTCIFFilterSelect__Group__8 ;
    public final void rule__TMTCIFFilterSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5408:1: ( rule__TMTCIFFilterSelect__Group__7__Impl rule__TMTCIFFilterSelect__Group__8 )
            // InternalFILTER.g:5409:2: rule__TMTCIFFilterSelect__Group__7__Impl rule__TMTCIFFilterSelect__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__TMTCIFFilterSelect__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__7"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__7__Impl"
    // InternalFILTER.g:5416:1: rule__TMTCIFFilterSelect__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5420:1: ( ( ':=' ) )
            // InternalFILTER.g:5421:1: ( ':=' )
            {
            // InternalFILTER.g:5421:1: ( ':=' )
            // InternalFILTER.g:5422:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__8"
    // InternalFILTER.g:5431:1: rule__TMTCIFFilterSelect__Group__8 : rule__TMTCIFFilterSelect__Group__8__Impl rule__TMTCIFFilterSelect__Group__9 ;
    public final void rule__TMTCIFFilterSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5435:1: ( rule__TMTCIFFilterSelect__Group__8__Impl rule__TMTCIFFilterSelect__Group__9 )
            // InternalFILTER.g:5436:2: rule__TMTCIFFilterSelect__Group__8__Impl rule__TMTCIFFilterSelect__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__8"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__8__Impl"
    // InternalFILTER.g:5443:1: rule__TMTCIFFilterSelect__Group__8__Impl : ( ( rule__TMTCIFFilterSelect__TypeAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5447:1: ( ( ( rule__TMTCIFFilterSelect__TypeAssignment_8 ) ) )
            // InternalFILTER.g:5448:1: ( ( rule__TMTCIFFilterSelect__TypeAssignment_8 ) )
            {
            // InternalFILTER.g:5448:1: ( ( rule__TMTCIFFilterSelect__TypeAssignment_8 ) )
            // InternalFILTER.g:5449:2: ( rule__TMTCIFFilterSelect__TypeAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeAssignment_8()); 
            }
            // InternalFILTER.g:5450:2: ( rule__TMTCIFFilterSelect__TypeAssignment_8 )
            // InternalFILTER.g:5450:3: rule__TMTCIFFilterSelect__TypeAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__TypeAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__9"
    // InternalFILTER.g:5458:1: rule__TMTCIFFilterSelect__Group__9 : rule__TMTCIFFilterSelect__Group__9__Impl rule__TMTCIFFilterSelect__Group__10 ;
    public final void rule__TMTCIFFilterSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5462:1: ( rule__TMTCIFFilterSelect__Group__9__Impl rule__TMTCIFFilterSelect__Group__10 )
            // InternalFILTER.g:5463:2: rule__TMTCIFFilterSelect__Group__9__Impl rule__TMTCIFFilterSelect__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TMTCIFFilterSelect__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__9"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__9__Impl"
    // InternalFILTER.g:5470:1: rule__TMTCIFFilterSelect__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5474:1: ( ( ';' ) )
            // InternalFILTER.g:5475:1: ( ';' )
            {
            // InternalFILTER.g:5475:1: ( ';' )
            // InternalFILTER.g:5476:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__10"
    // InternalFILTER.g:5485:1: rule__TMTCIFFilterSelect__Group__10 : rule__TMTCIFFilterSelect__Group__10__Impl rule__TMTCIFFilterSelect__Group__11 ;
    public final void rule__TMTCIFFilterSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5489:1: ( rule__TMTCIFFilterSelect__Group__10__Impl rule__TMTCIFFilterSelect__Group__11 )
            // InternalFILTER.g:5490:2: rule__TMTCIFFilterSelect__Group__10__Impl rule__TMTCIFFilterSelect__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TMTCIFFilterSelect__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__10"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__10__Impl"
    // InternalFILTER.g:5497:1: rule__TMTCIFFilterSelect__Group__10__Impl : ( ( rule__TMTCIFFilterSelect__Group_10__0 )? ) ;
    public final void rule__TMTCIFFilterSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5501:1: ( ( ( rule__TMTCIFFilterSelect__Group_10__0 )? ) )
            // InternalFILTER.g:5502:1: ( ( rule__TMTCIFFilterSelect__Group_10__0 )? )
            {
            // InternalFILTER.g:5502:1: ( ( rule__TMTCIFFilterSelect__Group_10__0 )? )
            // InternalFILTER.g:5503:2: ( rule__TMTCIFFilterSelect__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_10()); 
            }
            // InternalFILTER.g:5504:2: ( rule__TMTCIFFilterSelect__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFILTER.g:5504:3: rule__TMTCIFFilterSelect__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelect__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__11"
    // InternalFILTER.g:5512:1: rule__TMTCIFFilterSelect__Group__11 : rule__TMTCIFFilterSelect__Group__11__Impl rule__TMTCIFFilterSelect__Group__12 ;
    public final void rule__TMTCIFFilterSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5516:1: ( rule__TMTCIFFilterSelect__Group__11__Impl rule__TMTCIFFilterSelect__Group__12 )
            // InternalFILTER.g:5517:2: rule__TMTCIFFilterSelect__Group__11__Impl rule__TMTCIFFilterSelect__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TMTCIFFilterSelect__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__11"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__11__Impl"
    // InternalFILTER.g:5524:1: rule__TMTCIFFilterSelect__Group__11__Impl : ( ( rule__TMTCIFFilterSelect__Group_11__0 )? ) ;
    public final void rule__TMTCIFFilterSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5528:1: ( ( ( rule__TMTCIFFilterSelect__Group_11__0 )? ) )
            // InternalFILTER.g:5529:1: ( ( rule__TMTCIFFilterSelect__Group_11__0 )? )
            {
            // InternalFILTER.g:5529:1: ( ( rule__TMTCIFFilterSelect__Group_11__0 )? )
            // InternalFILTER.g:5530:2: ( rule__TMTCIFFilterSelect__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_11()); 
            }
            // InternalFILTER.g:5531:2: ( rule__TMTCIFFilterSelect__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFILTER.g:5531:3: rule__TMTCIFFilterSelect__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelect__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__12"
    // InternalFILTER.g:5539:1: rule__TMTCIFFilterSelect__Group__12 : rule__TMTCIFFilterSelect__Group__12__Impl rule__TMTCIFFilterSelect__Group__13 ;
    public final void rule__TMTCIFFilterSelect__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5543:1: ( rule__TMTCIFFilterSelect__Group__12__Impl rule__TMTCIFFilterSelect__Group__13 )
            // InternalFILTER.g:5544:2: rule__TMTCIFFilterSelect__Group__12__Impl rule__TMTCIFFilterSelect__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TMTCIFFilterSelect__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__12"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__12__Impl"
    // InternalFILTER.g:5551:1: rule__TMTCIFFilterSelect__Group__12__Impl : ( ( rule__TMTCIFFilterSelect__Group_12__0 )? ) ;
    public final void rule__TMTCIFFilterSelect__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5555:1: ( ( ( rule__TMTCIFFilterSelect__Group_12__0 )? ) )
            // InternalFILTER.g:5556:1: ( ( rule__TMTCIFFilterSelect__Group_12__0 )? )
            {
            // InternalFILTER.g:5556:1: ( ( rule__TMTCIFFilterSelect__Group_12__0 )? )
            // InternalFILTER.g:5557:2: ( rule__TMTCIFFilterSelect__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_12()); 
            }
            // InternalFILTER.g:5558:2: ( rule__TMTCIFFilterSelect__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFILTER.g:5558:3: rule__TMTCIFFilterSelect__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelect__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__13"
    // InternalFILTER.g:5566:1: rule__TMTCIFFilterSelect__Group__13 : rule__TMTCIFFilterSelect__Group__13__Impl rule__TMTCIFFilterSelect__Group__14 ;
    public final void rule__TMTCIFFilterSelect__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5570:1: ( rule__TMTCIFFilterSelect__Group__13__Impl rule__TMTCIFFilterSelect__Group__14 )
            // InternalFILTER.g:5571:2: rule__TMTCIFFilterSelect__Group__13__Impl rule__TMTCIFFilterSelect__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__13"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__13__Impl"
    // InternalFILTER.g:5578:1: rule__TMTCIFFilterSelect__Group__13__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterSelect__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5582:1: ( ( '}' ) )
            // InternalFILTER.g:5583:1: ( '}' )
            {
            // InternalFILTER.g:5583:1: ( '}' )
            // InternalFILTER.g:5584:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getRightCurlyBracketKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__14"
    // InternalFILTER.g:5593:1: rule__TMTCIFFilterSelect__Group__14 : rule__TMTCIFFilterSelect__Group__14__Impl ;
    public final void rule__TMTCIFFilterSelect__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5597:1: ( rule__TMTCIFFilterSelect__Group__14__Impl )
            // InternalFILTER.g:5598:2: rule__TMTCIFFilterSelect__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group__14__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__14"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group__14__Impl"
    // InternalFILTER.g:5604:1: rule__TMTCIFFilterSelect__Group__14__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5608:1: ( ( ';' ) )
            // InternalFILTER.g:5609:1: ( ';' )
            {
            // InternalFILTER.g:5609:1: ( ';' )
            // InternalFILTER.g:5610:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__0"
    // InternalFILTER.g:5620:1: rule__TMTCIFFilterSelect__Group_10__0 : rule__TMTCIFFilterSelect__Group_10__0__Impl rule__TMTCIFFilterSelect__Group_10__1 ;
    public final void rule__TMTCIFFilterSelect__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5624:1: ( rule__TMTCIFFilterSelect__Group_10__0__Impl rule__TMTCIFFilterSelect__Group_10__1 )
            // InternalFILTER.g:5625:2: rule__TMTCIFFilterSelect__Group_10__0__Impl rule__TMTCIFFilterSelect__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelect__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_10__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__0"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__0__Impl"
    // InternalFILTER.g:5632:1: rule__TMTCIFFilterSelect__Group_10__0__Impl : ( 'offset' ) ;
    public final void rule__TMTCIFFilterSelect__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5636:1: ( ( 'offset' ) )
            // InternalFILTER.g:5637:1: ( 'offset' )
            {
            // InternalFILTER.g:5637:1: ( 'offset' )
            // InternalFILTER.g:5638:2: 'offset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetKeyword_10_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__1"
    // InternalFILTER.g:5647:1: rule__TMTCIFFilterSelect__Group_10__1 : rule__TMTCIFFilterSelect__Group_10__1__Impl rule__TMTCIFFilterSelect__Group_10__2 ;
    public final void rule__TMTCIFFilterSelect__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5651:1: ( rule__TMTCIFFilterSelect__Group_10__1__Impl rule__TMTCIFFilterSelect__Group_10__2 )
            // InternalFILTER.g:5652:2: rule__TMTCIFFilterSelect__Group_10__1__Impl rule__TMTCIFFilterSelect__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterSelect__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_10__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__1"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__1__Impl"
    // InternalFILTER.g:5659:1: rule__TMTCIFFilterSelect__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelect__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5663:1: ( ( ':=' ) )
            // InternalFILTER.g:5664:1: ( ':=' )
            {
            // InternalFILTER.g:5664:1: ( ':=' )
            // InternalFILTER.g:5665:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_10_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__2"
    // InternalFILTER.g:5674:1: rule__TMTCIFFilterSelect__Group_10__2 : rule__TMTCIFFilterSelect__Group_10__2__Impl rule__TMTCIFFilterSelect__Group_10__3 ;
    public final void rule__TMTCIFFilterSelect__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5678:1: ( rule__TMTCIFFilterSelect__Group_10__2__Impl rule__TMTCIFFilterSelect__Group_10__3 )
            // InternalFILTER.g:5679:2: rule__TMTCIFFilterSelect__Group_10__2__Impl rule__TMTCIFFilterSelect__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_10__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__2"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__2__Impl"
    // InternalFILTER.g:5686:1: rule__TMTCIFFilterSelect__Group_10__2__Impl : ( ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 ) ) ;
    public final void rule__TMTCIFFilterSelect__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5690:1: ( ( ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 ) ) )
            // InternalFILTER.g:5691:1: ( ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 ) )
            {
            // InternalFILTER.g:5691:1: ( ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 ) )
            // InternalFILTER.g:5692:2: ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetAssignment_10_2()); 
            }
            // InternalFILTER.g:5693:2: ( rule__TMTCIFFilterSelect__OffsetAssignment_10_2 )
            // InternalFILTER.g:5693:3: rule__TMTCIFFilterSelect__OffsetAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__OffsetAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetAssignment_10_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__3"
    // InternalFILTER.g:5701:1: rule__TMTCIFFilterSelect__Group_10__3 : rule__TMTCIFFilterSelect__Group_10__3__Impl ;
    public final void rule__TMTCIFFilterSelect__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5705:1: ( rule__TMTCIFFilterSelect__Group_10__3__Impl )
            // InternalFILTER.g:5706:2: rule__TMTCIFFilterSelect__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_10__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__3"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_10__3__Impl"
    // InternalFILTER.g:5712:1: rule__TMTCIFFilterSelect__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5716:1: ( ( ';' ) )
            // InternalFILTER.g:5717:1: ( ';' )
            {
            // InternalFILTER.g:5717:1: ( ';' )
            // InternalFILTER.g:5718:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_10_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__0"
    // InternalFILTER.g:5728:1: rule__TMTCIFFilterSelect__Group_11__0 : rule__TMTCIFFilterSelect__Group_11__0__Impl rule__TMTCIFFilterSelect__Group_11__1 ;
    public final void rule__TMTCIFFilterSelect__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5732:1: ( rule__TMTCIFFilterSelect__Group_11__0__Impl rule__TMTCIFFilterSelect__Group_11__1 )
            // InternalFILTER.g:5733:2: rule__TMTCIFFilterSelect__Group_11__0__Impl rule__TMTCIFFilterSelect__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelect__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_11__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__0"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__0__Impl"
    // InternalFILTER.g:5740:1: rule__TMTCIFFilterSelect__Group_11__0__Impl : ( 'size' ) ;
    public final void rule__TMTCIFFilterSelect__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5744:1: ( ( 'size' ) )
            // InternalFILTER.g:5745:1: ( 'size' )
            {
            // InternalFILTER.g:5745:1: ( 'size' )
            // InternalFILTER.g:5746:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeKeyword_11_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__1"
    // InternalFILTER.g:5755:1: rule__TMTCIFFilterSelect__Group_11__1 : rule__TMTCIFFilterSelect__Group_11__1__Impl rule__TMTCIFFilterSelect__Group_11__2 ;
    public final void rule__TMTCIFFilterSelect__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5759:1: ( rule__TMTCIFFilterSelect__Group_11__1__Impl rule__TMTCIFFilterSelect__Group_11__2 )
            // InternalFILTER.g:5760:2: rule__TMTCIFFilterSelect__Group_11__1__Impl rule__TMTCIFFilterSelect__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterSelect__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_11__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__1"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__1__Impl"
    // InternalFILTER.g:5767:1: rule__TMTCIFFilterSelect__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelect__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5771:1: ( ( ':=' ) )
            // InternalFILTER.g:5772:1: ( ':=' )
            {
            // InternalFILTER.g:5772:1: ( ':=' )
            // InternalFILTER.g:5773:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_11_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__2"
    // InternalFILTER.g:5782:1: rule__TMTCIFFilterSelect__Group_11__2 : rule__TMTCIFFilterSelect__Group_11__2__Impl rule__TMTCIFFilterSelect__Group_11__3 ;
    public final void rule__TMTCIFFilterSelect__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5786:1: ( rule__TMTCIFFilterSelect__Group_11__2__Impl rule__TMTCIFFilterSelect__Group_11__3 )
            // InternalFILTER.g:5787:2: rule__TMTCIFFilterSelect__Group_11__2__Impl rule__TMTCIFFilterSelect__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_11__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__2"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__2__Impl"
    // InternalFILTER.g:5794:1: rule__TMTCIFFilterSelect__Group_11__2__Impl : ( ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 ) ) ;
    public final void rule__TMTCIFFilterSelect__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5798:1: ( ( ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 ) ) )
            // InternalFILTER.g:5799:1: ( ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 ) )
            {
            // InternalFILTER.g:5799:1: ( ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 ) )
            // InternalFILTER.g:5800:2: ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeAssignment_11_2()); 
            }
            // InternalFILTER.g:5801:2: ( rule__TMTCIFFilterSelect__SizeAssignment_11_2 )
            // InternalFILTER.g:5801:3: rule__TMTCIFFilterSelect__SizeAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__SizeAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeAssignment_11_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__3"
    // InternalFILTER.g:5809:1: rule__TMTCIFFilterSelect__Group_11__3 : rule__TMTCIFFilterSelect__Group_11__3__Impl ;
    public final void rule__TMTCIFFilterSelect__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5813:1: ( rule__TMTCIFFilterSelect__Group_11__3__Impl )
            // InternalFILTER.g:5814:2: rule__TMTCIFFilterSelect__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_11__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__3"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_11__3__Impl"
    // InternalFILTER.g:5820:1: rule__TMTCIFFilterSelect__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5824:1: ( ( ';' ) )
            // InternalFILTER.g:5825:1: ( ';' )
            {
            // InternalFILTER.g:5825:1: ( ';' )
            // InternalFILTER.g:5826:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_11_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_11__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__0"
    // InternalFILTER.g:5836:1: rule__TMTCIFFilterSelect__Group_12__0 : rule__TMTCIFFilterSelect__Group_12__0__Impl rule__TMTCIFFilterSelect__Group_12__1 ;
    public final void rule__TMTCIFFilterSelect__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5840:1: ( rule__TMTCIFFilterSelect__Group_12__0__Impl rule__TMTCIFFilterSelect__Group_12__1 )
            // InternalFILTER.g:5841:2: rule__TMTCIFFilterSelect__Group_12__0__Impl rule__TMTCIFFilterSelect__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelect__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_12__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__0"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__0__Impl"
    // InternalFILTER.g:5848:1: rule__TMTCIFFilterSelect__Group_12__0__Impl : ( 'mask' ) ;
    public final void rule__TMTCIFFilterSelect__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5852:1: ( ( 'mask' ) )
            // InternalFILTER.g:5853:1: ( 'mask' )
            {
            // InternalFILTER.g:5853:1: ( 'mask' )
            // InternalFILTER.g:5854:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskKeyword_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__1"
    // InternalFILTER.g:5863:1: rule__TMTCIFFilterSelect__Group_12__1 : rule__TMTCIFFilterSelect__Group_12__1__Impl rule__TMTCIFFilterSelect__Group_12__2 ;
    public final void rule__TMTCIFFilterSelect__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5867:1: ( rule__TMTCIFFilterSelect__Group_12__1__Impl rule__TMTCIFFilterSelect__Group_12__2 )
            // InternalFILTER.g:5868:2: rule__TMTCIFFilterSelect__Group_12__1__Impl rule__TMTCIFFilterSelect__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TMTCIFFilterSelect__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_12__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__1"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__1__Impl"
    // InternalFILTER.g:5875:1: rule__TMTCIFFilterSelect__Group_12__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelect__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5879:1: ( ( ':=' ) )
            // InternalFILTER.g:5880:1: ( ':=' )
            {
            // InternalFILTER.g:5880:1: ( ':=' )
            // InternalFILTER.g:5881:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getColonEqualsSignKeyword_12_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__2"
    // InternalFILTER.g:5890:1: rule__TMTCIFFilterSelect__Group_12__2 : rule__TMTCIFFilterSelect__Group_12__2__Impl rule__TMTCIFFilterSelect__Group_12__3 ;
    public final void rule__TMTCIFFilterSelect__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5894:1: ( rule__TMTCIFFilterSelect__Group_12__2__Impl rule__TMTCIFFilterSelect__Group_12__3 )
            // InternalFILTER.g:5895:2: rule__TMTCIFFilterSelect__Group_12__2__Impl rule__TMTCIFFilterSelect__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelect__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_12__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__2"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__2__Impl"
    // InternalFILTER.g:5902:1: rule__TMTCIFFilterSelect__Group_12__2__Impl : ( ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 ) ) ;
    public final void rule__TMTCIFFilterSelect__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5906:1: ( ( ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 ) ) )
            // InternalFILTER.g:5907:1: ( ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 ) )
            {
            // InternalFILTER.g:5907:1: ( ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 ) )
            // InternalFILTER.g:5908:2: ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskAssignment_12_2()); 
            }
            // InternalFILTER.g:5909:2: ( rule__TMTCIFFilterSelect__MaskAssignment_12_2 )
            // InternalFILTER.g:5909:3: rule__TMTCIFFilterSelect__MaskAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__MaskAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskAssignment_12_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__3"
    // InternalFILTER.g:5917:1: rule__TMTCIFFilterSelect__Group_12__3 : rule__TMTCIFFilterSelect__Group_12__3__Impl ;
    public final void rule__TMTCIFFilterSelect__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5921:1: ( rule__TMTCIFFilterSelect__Group_12__3__Impl )
            // InternalFILTER.g:5922:2: rule__TMTCIFFilterSelect__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelect__Group_12__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__3"


    // $ANTLR start "rule__TMTCIFFilterSelect__Group_12__3__Impl"
    // InternalFILTER.g:5928:1: rule__TMTCIFFilterSelect__Group_12__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelect__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5932:1: ( ( ';' ) )
            // InternalFILTER.g:5933:1: ( ';' )
            {
            // InternalFILTER.g:5933:1: ( ';' )
            // InternalFILTER.g:5934:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSemicolonKeyword_12_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__Group_12__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__0"
    // InternalFILTER.g:5944:1: rule__TMTCIFFilterSelectLine__Group__0 : rule__TMTCIFFilterSelectLine__Group__0__Impl rule__TMTCIFFilterSelectLine__Group__1 ;
    public final void rule__TMTCIFFilterSelectLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5948:1: ( rule__TMTCIFFilterSelectLine__Group__0__Impl rule__TMTCIFFilterSelectLine__Group__1 )
            // InternalFILTER.g:5949:2: rule__TMTCIFFilterSelectLine__Group__0__Impl rule__TMTCIFFilterSelectLine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterSelectLine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__0"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__0__Impl"
    // InternalFILTER.g:5956:1: rule__TMTCIFFilterSelectLine__Group__0__Impl : ( 'TMTCIFFilterSelectLine' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5960:1: ( ( 'TMTCIFFilterSelectLine' ) )
            // InternalFILTER.g:5961:1: ( 'TMTCIFFilterSelectLine' )
            {
            // InternalFILTER.g:5961:1: ( 'TMTCIFFilterSelectLine' )
            // InternalFILTER.g:5962:2: 'TMTCIFFilterSelectLine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getTMTCIFFilterSelectLineKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__1"
    // InternalFILTER.g:5971:1: rule__TMTCIFFilterSelectLine__Group__1 : rule__TMTCIFFilterSelectLine__Group__1__Impl rule__TMTCIFFilterSelectLine__Group__2 ;
    public final void rule__TMTCIFFilterSelectLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5975:1: ( rule__TMTCIFFilterSelectLine__Group__1__Impl rule__TMTCIFFilterSelectLine__Group__2 )
            // InternalFILTER.g:5976:2: rule__TMTCIFFilterSelectLine__Group__1__Impl rule__TMTCIFFilterSelectLine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__TMTCIFFilterSelectLine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__1"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__1__Impl"
    // InternalFILTER.g:5983:1: rule__TMTCIFFilterSelectLine__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:5987:1: ( ( '{' ) )
            // InternalFILTER.g:5988:1: ( '{' )
            {
            // InternalFILTER.g:5988:1: ( '{' )
            // InternalFILTER.g:5989:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__2"
    // InternalFILTER.g:5998:1: rule__TMTCIFFilterSelectLine__Group__2 : rule__TMTCIFFilterSelectLine__Group__2__Impl rule__TMTCIFFilterSelectLine__Group__3 ;
    public final void rule__TMTCIFFilterSelectLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6002:1: ( rule__TMTCIFFilterSelectLine__Group__2__Impl rule__TMTCIFFilterSelectLine__Group__3 )
            // InternalFILTER.g:6003:2: rule__TMTCIFFilterSelectLine__Group__2__Impl rule__TMTCIFFilterSelectLine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelectLine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__2__Impl"
    // InternalFILTER.g:6010:1: rule__TMTCIFFilterSelectLine__Group__2__Impl : ( 'fromFile' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6014:1: ( ( 'fromFile' ) )
            // InternalFILTER.g:6015:1: ( 'fromFile' )
            {
            // InternalFILTER.g:6015:1: ( 'fromFile' )
            // InternalFILTER.g:6016:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__3"
    // InternalFILTER.g:6025:1: rule__TMTCIFFilterSelectLine__Group__3 : rule__TMTCIFFilterSelectLine__Group__3__Impl rule__TMTCIFFilterSelectLine__Group__4 ;
    public final void rule__TMTCIFFilterSelectLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6029:1: ( rule__TMTCIFFilterSelectLine__Group__3__Impl rule__TMTCIFFilterSelectLine__Group__4 )
            // InternalFILTER.g:6030:2: rule__TMTCIFFilterSelectLine__Group__3__Impl rule__TMTCIFFilterSelectLine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFFilterSelectLine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__3"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__3__Impl"
    // InternalFILTER.g:6037:1: rule__TMTCIFFilterSelectLine__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6041:1: ( ( ':=' ) )
            // InternalFILTER.g:6042:1: ( ':=' )
            {
            // InternalFILTER.g:6042:1: ( ':=' )
            // InternalFILTER.g:6043:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__4"
    // InternalFILTER.g:6052:1: rule__TMTCIFFilterSelectLine__Group__4 : rule__TMTCIFFilterSelectLine__Group__4__Impl rule__TMTCIFFilterSelectLine__Group__5 ;
    public final void rule__TMTCIFFilterSelectLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6056:1: ( rule__TMTCIFFilterSelectLine__Group__4__Impl rule__TMTCIFFilterSelectLine__Group__5 )
            // InternalFILTER.g:6057:2: rule__TMTCIFFilterSelectLine__Group__4__Impl rule__TMTCIFFilterSelectLine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__4"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__4__Impl"
    // InternalFILTER.g:6064:1: rule__TMTCIFFilterSelectLine__Group__4__Impl : ( ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6068:1: ( ( ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 ) ) )
            // InternalFILTER.g:6069:1: ( ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 ) )
            {
            // InternalFILTER.g:6069:1: ( ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 ) )
            // InternalFILTER.g:6070:2: ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileAssignment_4()); 
            }
            // InternalFILTER.g:6071:2: ( rule__TMTCIFFilterSelectLine__FromFileAssignment_4 )
            // InternalFILTER.g:6071:3: rule__TMTCIFFilterSelectLine__FromFileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__FromFileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__5"
    // InternalFILTER.g:6079:1: rule__TMTCIFFilterSelectLine__Group__5 : rule__TMTCIFFilterSelectLine__Group__5__Impl rule__TMTCIFFilterSelectLine__Group__6 ;
    public final void rule__TMTCIFFilterSelectLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6083:1: ( rule__TMTCIFFilterSelectLine__Group__5__Impl rule__TMTCIFFilterSelectLine__Group__6 )
            // InternalFILTER.g:6084:2: rule__TMTCIFFilterSelectLine__Group__5__Impl rule__TMTCIFFilterSelectLine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__TMTCIFFilterSelectLine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__5"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__5__Impl"
    // InternalFILTER.g:6091:1: rule__TMTCIFFilterSelectLine__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6095:1: ( ( ';' ) )
            // InternalFILTER.g:6096:1: ( ';' )
            {
            // InternalFILTER.g:6096:1: ( ';' )
            // InternalFILTER.g:6097:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__6"
    // InternalFILTER.g:6106:1: rule__TMTCIFFilterSelectLine__Group__6 : rule__TMTCIFFilterSelectLine__Group__6__Impl rule__TMTCIFFilterSelectLine__Group__7 ;
    public final void rule__TMTCIFFilterSelectLine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6110:1: ( rule__TMTCIFFilterSelectLine__Group__6__Impl rule__TMTCIFFilterSelectLine__Group__7 )
            // InternalFILTER.g:6111:2: rule__TMTCIFFilterSelectLine__Group__6__Impl rule__TMTCIFFilterSelectLine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelectLine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__6"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__6__Impl"
    // InternalFILTER.g:6118:1: rule__TMTCIFFilterSelectLine__Group__6__Impl : ( 'line' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6122:1: ( ( 'line' ) )
            // InternalFILTER.g:6123:1: ( 'line' )
            {
            // InternalFILTER.g:6123:1: ( 'line' )
            // InternalFILTER.g:6124:2: 'line'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__7"
    // InternalFILTER.g:6133:1: rule__TMTCIFFilterSelectLine__Group__7 : rule__TMTCIFFilterSelectLine__Group__7__Impl rule__TMTCIFFilterSelectLine__Group__8 ;
    public final void rule__TMTCIFFilterSelectLine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6137:1: ( rule__TMTCIFFilterSelectLine__Group__7__Impl rule__TMTCIFFilterSelectLine__Group__8 )
            // InternalFILTER.g:6138:2: rule__TMTCIFFilterSelectLine__Group__7__Impl rule__TMTCIFFilterSelectLine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterSelectLine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__7"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__7__Impl"
    // InternalFILTER.g:6145:1: rule__TMTCIFFilterSelectLine__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6149:1: ( ( ':=' ) )
            // InternalFILTER.g:6150:1: ( ':=' )
            {
            // InternalFILTER.g:6150:1: ( ':=' )
            // InternalFILTER.g:6151:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__8"
    // InternalFILTER.g:6160:1: rule__TMTCIFFilterSelectLine__Group__8 : rule__TMTCIFFilterSelectLine__Group__8__Impl rule__TMTCIFFilterSelectLine__Group__9 ;
    public final void rule__TMTCIFFilterSelectLine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6164:1: ( rule__TMTCIFFilterSelectLine__Group__8__Impl rule__TMTCIFFilterSelectLine__Group__9 )
            // InternalFILTER.g:6165:2: rule__TMTCIFFilterSelectLine__Group__8__Impl rule__TMTCIFFilterSelectLine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__9();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__8"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__8__Impl"
    // InternalFILTER.g:6172:1: rule__TMTCIFFilterSelectLine__Group__8__Impl : ( ( rule__TMTCIFFilterSelectLine__LineAssignment_8 ) ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6176:1: ( ( ( rule__TMTCIFFilterSelectLine__LineAssignment_8 ) ) )
            // InternalFILTER.g:6177:1: ( ( rule__TMTCIFFilterSelectLine__LineAssignment_8 ) )
            {
            // InternalFILTER.g:6177:1: ( ( rule__TMTCIFFilterSelectLine__LineAssignment_8 ) )
            // InternalFILTER.g:6178:2: ( rule__TMTCIFFilterSelectLine__LineAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineAssignment_8()); 
            }
            // InternalFILTER.g:6179:2: ( rule__TMTCIFFilterSelectLine__LineAssignment_8 )
            // InternalFILTER.g:6179:3: rule__TMTCIFFilterSelectLine__LineAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__LineAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineAssignment_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__9"
    // InternalFILTER.g:6187:1: rule__TMTCIFFilterSelectLine__Group__9 : rule__TMTCIFFilterSelectLine__Group__9__Impl rule__TMTCIFFilterSelectLine__Group__10 ;
    public final void rule__TMTCIFFilterSelectLine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6191:1: ( rule__TMTCIFFilterSelectLine__Group__9__Impl rule__TMTCIFFilterSelectLine__Group__10 )
            // InternalFILTER.g:6192:2: rule__TMTCIFFilterSelectLine__Group__9__Impl rule__TMTCIFFilterSelectLine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TMTCIFFilterSelectLine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__10();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__9"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__9__Impl"
    // InternalFILTER.g:6199:1: rule__TMTCIFFilterSelectLine__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6203:1: ( ( ';' ) )
            // InternalFILTER.g:6204:1: ( ';' )
            {
            // InternalFILTER.g:6204:1: ( ';' )
            // InternalFILTER.g:6205:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_9()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__10"
    // InternalFILTER.g:6214:1: rule__TMTCIFFilterSelectLine__Group__10 : rule__TMTCIFFilterSelectLine__Group__10__Impl rule__TMTCIFFilterSelectLine__Group__11 ;
    public final void rule__TMTCIFFilterSelectLine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6218:1: ( rule__TMTCIFFilterSelectLine__Group__10__Impl rule__TMTCIFFilterSelectLine__Group__11 )
            // InternalFILTER.g:6219:2: rule__TMTCIFFilterSelectLine__Group__10__Impl rule__TMTCIFFilterSelectLine__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TMTCIFFilterSelectLine__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__11();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__10"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__10__Impl"
    // InternalFILTER.g:6226:1: rule__TMTCIFFilterSelectLine__Group__10__Impl : ( ( rule__TMTCIFFilterSelectLine__Group_10__0 )? ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6230:1: ( ( ( rule__TMTCIFFilterSelectLine__Group_10__0 )? ) )
            // InternalFILTER.g:6231:1: ( ( rule__TMTCIFFilterSelectLine__Group_10__0 )? )
            {
            // InternalFILTER.g:6231:1: ( ( rule__TMTCIFFilterSelectLine__Group_10__0 )? )
            // InternalFILTER.g:6232:2: ( rule__TMTCIFFilterSelectLine__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_10()); 
            }
            // InternalFILTER.g:6233:2: ( rule__TMTCIFFilterSelectLine__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==57) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFILTER.g:6233:3: rule__TMTCIFFilterSelectLine__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelectLine__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_10()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__11"
    // InternalFILTER.g:6241:1: rule__TMTCIFFilterSelectLine__Group__11 : rule__TMTCIFFilterSelectLine__Group__11__Impl rule__TMTCIFFilterSelectLine__Group__12 ;
    public final void rule__TMTCIFFilterSelectLine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6245:1: ( rule__TMTCIFFilterSelectLine__Group__11__Impl rule__TMTCIFFilterSelectLine__Group__12 )
            // InternalFILTER.g:6246:2: rule__TMTCIFFilterSelectLine__Group__11__Impl rule__TMTCIFFilterSelectLine__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TMTCIFFilterSelectLine__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__12();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__11"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__11__Impl"
    // InternalFILTER.g:6253:1: rule__TMTCIFFilterSelectLine__Group__11__Impl : ( ( rule__TMTCIFFilterSelectLine__Group_11__0 )? ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6257:1: ( ( ( rule__TMTCIFFilterSelectLine__Group_11__0 )? ) )
            // InternalFILTER.g:6258:1: ( ( rule__TMTCIFFilterSelectLine__Group_11__0 )? )
            {
            // InternalFILTER.g:6258:1: ( ( rule__TMTCIFFilterSelectLine__Group_11__0 )? )
            // InternalFILTER.g:6259:2: ( rule__TMTCIFFilterSelectLine__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_11()); 
            }
            // InternalFILTER.g:6260:2: ( rule__TMTCIFFilterSelectLine__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==58) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFILTER.g:6260:3: rule__TMTCIFFilterSelectLine__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelectLine__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_11()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__12"
    // InternalFILTER.g:6268:1: rule__TMTCIFFilterSelectLine__Group__12 : rule__TMTCIFFilterSelectLine__Group__12__Impl rule__TMTCIFFilterSelectLine__Group__13 ;
    public final void rule__TMTCIFFilterSelectLine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6272:1: ( rule__TMTCIFFilterSelectLine__Group__12__Impl rule__TMTCIFFilterSelectLine__Group__13 )
            // InternalFILTER.g:6273:2: rule__TMTCIFFilterSelectLine__Group__12__Impl rule__TMTCIFFilterSelectLine__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TMTCIFFilterSelectLine__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__13();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__12"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__12__Impl"
    // InternalFILTER.g:6280:1: rule__TMTCIFFilterSelectLine__Group__12__Impl : ( ( rule__TMTCIFFilterSelectLine__Group_12__0 )? ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6284:1: ( ( ( rule__TMTCIFFilterSelectLine__Group_12__0 )? ) )
            // InternalFILTER.g:6285:1: ( ( rule__TMTCIFFilterSelectLine__Group_12__0 )? )
            {
            // InternalFILTER.g:6285:1: ( ( rule__TMTCIFFilterSelectLine__Group_12__0 )? )
            // InternalFILTER.g:6286:2: ( rule__TMTCIFFilterSelectLine__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_12()); 
            }
            // InternalFILTER.g:6287:2: ( rule__TMTCIFFilterSelectLine__Group_12__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFILTER.g:6287:3: rule__TMTCIFFilterSelectLine__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterSelectLine__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_12()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__13"
    // InternalFILTER.g:6295:1: rule__TMTCIFFilterSelectLine__Group__13 : rule__TMTCIFFilterSelectLine__Group__13__Impl rule__TMTCIFFilterSelectLine__Group__14 ;
    public final void rule__TMTCIFFilterSelectLine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6299:1: ( rule__TMTCIFFilterSelectLine__Group__13__Impl rule__TMTCIFFilterSelectLine__Group__14 )
            // InternalFILTER.g:6300:2: rule__TMTCIFFilterSelectLine__Group__13__Impl rule__TMTCIFFilterSelectLine__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__14();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__13"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__13__Impl"
    // InternalFILTER.g:6307:1: rule__TMTCIFFilterSelectLine__Group__13__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6311:1: ( ( '}' ) )
            // InternalFILTER.g:6312:1: ( '}' )
            {
            // InternalFILTER.g:6312:1: ( '}' )
            // InternalFILTER.g:6313:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightCurlyBracketKeyword_13()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__14"
    // InternalFILTER.g:6322:1: rule__TMTCIFFilterSelectLine__Group__14 : rule__TMTCIFFilterSelectLine__Group__14__Impl ;
    public final void rule__TMTCIFFilterSelectLine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6326:1: ( rule__TMTCIFFilterSelectLine__Group__14__Impl )
            // InternalFILTER.g:6327:2: rule__TMTCIFFilterSelectLine__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group__14__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__14"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group__14__Impl"
    // InternalFILTER.g:6333:1: rule__TMTCIFFilterSelectLine__Group__14__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6337:1: ( ( ';' ) )
            // InternalFILTER.g:6338:1: ( ';' )
            {
            // InternalFILTER.g:6338:1: ( ';' )
            // InternalFILTER.g:6339:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_14()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__0"
    // InternalFILTER.g:6349:1: rule__TMTCIFFilterSelectLine__Group_10__0 : rule__TMTCIFFilterSelectLine__Group_10__0__Impl rule__TMTCIFFilterSelectLine__Group_10__1 ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6353:1: ( rule__TMTCIFFilterSelectLine__Group_10__0__Impl rule__TMTCIFFilterSelectLine__Group_10__1 )
            // InternalFILTER.g:6354:2: rule__TMTCIFFilterSelectLine__Group_10__0__Impl rule__TMTCIFFilterSelectLine__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelectLine__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_10__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__0"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__0__Impl"
    // InternalFILTER.g:6361:1: rule__TMTCIFFilterSelectLine__Group_10__0__Impl : ( 'leftTrim' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6365:1: ( ( 'leftTrim' ) )
            // InternalFILTER.g:6366:1: ( 'leftTrim' )
            {
            // InternalFILTER.g:6366:1: ( 'leftTrim' )
            // InternalFILTER.g:6367:2: 'leftTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimKeyword_10_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__1"
    // InternalFILTER.g:6376:1: rule__TMTCIFFilterSelectLine__Group_10__1 : rule__TMTCIFFilterSelectLine__Group_10__1__Impl rule__TMTCIFFilterSelectLine__Group_10__2 ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6380:1: ( rule__TMTCIFFilterSelectLine__Group_10__1__Impl rule__TMTCIFFilterSelectLine__Group_10__2 )
            // InternalFILTER.g:6381:2: rule__TMTCIFFilterSelectLine__Group_10__1__Impl rule__TMTCIFFilterSelectLine__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterSelectLine__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_10__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__1"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__1__Impl"
    // InternalFILTER.g:6388:1: rule__TMTCIFFilterSelectLine__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6392:1: ( ( ':=' ) )
            // InternalFILTER.g:6393:1: ( ':=' )
            {
            // InternalFILTER.g:6393:1: ( ':=' )
            // InternalFILTER.g:6394:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_10_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__2"
    // InternalFILTER.g:6403:1: rule__TMTCIFFilterSelectLine__Group_10__2 : rule__TMTCIFFilterSelectLine__Group_10__2__Impl rule__TMTCIFFilterSelectLine__Group_10__3 ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6407:1: ( rule__TMTCIFFilterSelectLine__Group_10__2__Impl rule__TMTCIFFilterSelectLine__Group_10__3 )
            // InternalFILTER.g:6408:2: rule__TMTCIFFilterSelectLine__Group_10__2__Impl rule__TMTCIFFilterSelectLine__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_10__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__2__Impl"
    // InternalFILTER.g:6415:1: rule__TMTCIFFilterSelectLine__Group_10__2__Impl : ( ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 ) ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6419:1: ( ( ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 ) ) )
            // InternalFILTER.g:6420:1: ( ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 ) )
            {
            // InternalFILTER.g:6420:1: ( ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 ) )
            // InternalFILTER.g:6421:2: ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimAssignment_10_2()); 
            }
            // InternalFILTER.g:6422:2: ( rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 )
            // InternalFILTER.g:6422:3: rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimAssignment_10_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__3"
    // InternalFILTER.g:6430:1: rule__TMTCIFFilterSelectLine__Group_10__3 : rule__TMTCIFFilterSelectLine__Group_10__3__Impl ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6434:1: ( rule__TMTCIFFilterSelectLine__Group_10__3__Impl )
            // InternalFILTER.g:6435:2: rule__TMTCIFFilterSelectLine__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_10__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__3"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_10__3__Impl"
    // InternalFILTER.g:6441:1: rule__TMTCIFFilterSelectLine__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6445:1: ( ( ';' ) )
            // InternalFILTER.g:6446:1: ( ';' )
            {
            // InternalFILTER.g:6446:1: ( ';' )
            // InternalFILTER.g:6447:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_10_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__0"
    // InternalFILTER.g:6457:1: rule__TMTCIFFilterSelectLine__Group_11__0 : rule__TMTCIFFilterSelectLine__Group_11__0__Impl rule__TMTCIFFilterSelectLine__Group_11__1 ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6461:1: ( rule__TMTCIFFilterSelectLine__Group_11__0__Impl rule__TMTCIFFilterSelectLine__Group_11__1 )
            // InternalFILTER.g:6462:2: rule__TMTCIFFilterSelectLine__Group_11__0__Impl rule__TMTCIFFilterSelectLine__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelectLine__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_11__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__0"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__0__Impl"
    // InternalFILTER.g:6469:1: rule__TMTCIFFilterSelectLine__Group_11__0__Impl : ( 'rightTrim' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6473:1: ( ( 'rightTrim' ) )
            // InternalFILTER.g:6474:1: ( 'rightTrim' )
            {
            // InternalFILTER.g:6474:1: ( 'rightTrim' )
            // InternalFILTER.g:6475:2: 'rightTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimKeyword_11_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__1"
    // InternalFILTER.g:6484:1: rule__TMTCIFFilterSelectLine__Group_11__1 : rule__TMTCIFFilterSelectLine__Group_11__1__Impl rule__TMTCIFFilterSelectLine__Group_11__2 ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6488:1: ( rule__TMTCIFFilterSelectLine__Group_11__1__Impl rule__TMTCIFFilterSelectLine__Group_11__2 )
            // InternalFILTER.g:6489:2: rule__TMTCIFFilterSelectLine__Group_11__1__Impl rule__TMTCIFFilterSelectLine__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterSelectLine__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_11__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__1"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__1__Impl"
    // InternalFILTER.g:6496:1: rule__TMTCIFFilterSelectLine__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6500:1: ( ( ':=' ) )
            // InternalFILTER.g:6501:1: ( ':=' )
            {
            // InternalFILTER.g:6501:1: ( ':=' )
            // InternalFILTER.g:6502:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_11_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__2"
    // InternalFILTER.g:6511:1: rule__TMTCIFFilterSelectLine__Group_11__2 : rule__TMTCIFFilterSelectLine__Group_11__2__Impl rule__TMTCIFFilterSelectLine__Group_11__3 ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6515:1: ( rule__TMTCIFFilterSelectLine__Group_11__2__Impl rule__TMTCIFFilterSelectLine__Group_11__3 )
            // InternalFILTER.g:6516:2: rule__TMTCIFFilterSelectLine__Group_11__2__Impl rule__TMTCIFFilterSelectLine__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_11__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__2__Impl"
    // InternalFILTER.g:6523:1: rule__TMTCIFFilterSelectLine__Group_11__2__Impl : ( ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 ) ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6527:1: ( ( ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 ) ) )
            // InternalFILTER.g:6528:1: ( ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 ) )
            {
            // InternalFILTER.g:6528:1: ( ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 ) )
            // InternalFILTER.g:6529:2: ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimAssignment_11_2()); 
            }
            // InternalFILTER.g:6530:2: ( rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 )
            // InternalFILTER.g:6530:3: rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimAssignment_11_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__3"
    // InternalFILTER.g:6538:1: rule__TMTCIFFilterSelectLine__Group_11__3 : rule__TMTCIFFilterSelectLine__Group_11__3__Impl ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6542:1: ( rule__TMTCIFFilterSelectLine__Group_11__3__Impl )
            // InternalFILTER.g:6543:2: rule__TMTCIFFilterSelectLine__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_11__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__3"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_11__3__Impl"
    // InternalFILTER.g:6549:1: rule__TMTCIFFilterSelectLine__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6553:1: ( ( ';' ) )
            // InternalFILTER.g:6554:1: ( ';' )
            {
            // InternalFILTER.g:6554:1: ( ';' )
            // InternalFILTER.g:6555:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_11_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_11__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__0"
    // InternalFILTER.g:6565:1: rule__TMTCIFFilterSelectLine__Group_12__0 : rule__TMTCIFFilterSelectLine__Group_12__0__Impl rule__TMTCIFFilterSelectLine__Group_12__1 ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6569:1: ( rule__TMTCIFFilterSelectLine__Group_12__0__Impl rule__TMTCIFFilterSelectLine__Group_12__1 )
            // InternalFILTER.g:6570:2: rule__TMTCIFFilterSelectLine__Group_12__0__Impl rule__TMTCIFFilterSelectLine__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterSelectLine__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_12__1();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__0"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__0__Impl"
    // InternalFILTER.g:6577:1: rule__TMTCIFFilterSelectLine__Group_12__0__Impl : ( 'mask' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6581:1: ( ( 'mask' ) )
            // InternalFILTER.g:6582:1: ( 'mask' )
            {
            // InternalFILTER.g:6582:1: ( 'mask' )
            // InternalFILTER.g:6583:2: 'mask'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskKeyword_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__1"
    // InternalFILTER.g:6592:1: rule__TMTCIFFilterSelectLine__Group_12__1 : rule__TMTCIFFilterSelectLine__Group_12__1__Impl rule__TMTCIFFilterSelectLine__Group_12__2 ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6596:1: ( rule__TMTCIFFilterSelectLine__Group_12__1__Impl rule__TMTCIFFilterSelectLine__Group_12__2 )
            // InternalFILTER.g:6597:2: rule__TMTCIFFilterSelectLine__Group_12__1__Impl rule__TMTCIFFilterSelectLine__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TMTCIFFilterSelectLine__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_12__2();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__1"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__1__Impl"
    // InternalFILTER.g:6604:1: rule__TMTCIFFilterSelectLine__Group_12__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6608:1: ( ( ':=' ) )
            // InternalFILTER.g:6609:1: ( ':=' )
            {
            // InternalFILTER.g:6609:1: ( ':=' )
            // InternalFILTER.g:6610:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getColonEqualsSignKeyword_12_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__2"
    // InternalFILTER.g:6619:1: rule__TMTCIFFilterSelectLine__Group_12__2 : rule__TMTCIFFilterSelectLine__Group_12__2__Impl rule__TMTCIFFilterSelectLine__Group_12__3 ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6623:1: ( rule__TMTCIFFilterSelectLine__Group_12__2__Impl rule__TMTCIFFilterSelectLine__Group_12__3 )
            // InternalFILTER.g:6624:2: rule__TMTCIFFilterSelectLine__Group_12__2__Impl rule__TMTCIFFilterSelectLine__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterSelectLine__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_12__3();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__2__Impl"
    // InternalFILTER.g:6631:1: rule__TMTCIFFilterSelectLine__Group_12__2__Impl : ( ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 ) ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6635:1: ( ( ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 ) ) )
            // InternalFILTER.g:6636:1: ( ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 ) )
            {
            // InternalFILTER.g:6636:1: ( ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 ) )
            // InternalFILTER.g:6637:2: ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskAssignment_12_2()); 
            }
            // InternalFILTER.g:6638:2: ( rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 )
            // InternalFILTER.g:6638:3: rule__TMTCIFFilterSelectLine__MaskAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__MaskAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskAssignment_12_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__3"
    // InternalFILTER.g:6646:1: rule__TMTCIFFilterSelectLine__Group_12__3 : rule__TMTCIFFilterSelectLine__Group_12__3__Impl ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6650:1: ( rule__TMTCIFFilterSelectLine__Group_12__3__Impl )
            // InternalFILTER.g:6651:2: rule__TMTCIFFilterSelectLine__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterSelectLine__Group_12__3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__3"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__Group_12__3__Impl"
    // InternalFILTER.g:6657:1: rule__TMTCIFFilterSelectLine__Group_12__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterSelectLine__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6661:1: ( ( ';' ) )
            // InternalFILTER.g:6662:1: ( ';' )
            {
            // InternalFILTER.g:6662:1: ( ';' )
            // InternalFILTER.g:6663:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getSemicolonKeyword_12_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__Group_12__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__0"
    // InternalFILTER.g:6673:1: rule__TMTCIFFilterMaxterm__Group__0 : rule__TMTCIFFilterMaxterm__Group__0__Impl rule__TMTCIFFilterMaxterm__Group__1 ;
    public final void rule__TMTCIFFilterMaxterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6677:1: ( rule__TMTCIFFilterMaxterm__Group__0__Impl rule__TMTCIFFilterMaxterm__Group__1 )
            // InternalFILTER.g:6678:2: rule__TMTCIFFilterMaxterm__Group__0__Impl rule__TMTCIFFilterMaxterm__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterMaxterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__0"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__0__Impl"
    // InternalFILTER.g:6685:1: rule__TMTCIFFilterMaxterm__Group__0__Impl : ( 'TMTCIFFilterMaxterm' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6689:1: ( ( 'TMTCIFFilterMaxterm' ) )
            // InternalFILTER.g:6690:1: ( 'TMTCIFFilterMaxterm' )
            {
            // InternalFILTER.g:6690:1: ( 'TMTCIFFilterMaxterm' )
            // InternalFILTER.g:6691:2: 'TMTCIFFilterMaxterm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getTMTCIFFilterMaxtermKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__1"
    // InternalFILTER.g:6700:1: rule__TMTCIFFilterMaxterm__Group__1 : rule__TMTCIFFilterMaxterm__Group__1__Impl rule__TMTCIFFilterMaxterm__Group__2 ;
    public final void rule__TMTCIFFilterMaxterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6704:1: ( rule__TMTCIFFilterMaxterm__Group__1__Impl rule__TMTCIFFilterMaxterm__Group__2 )
            // InternalFILTER.g:6705:2: rule__TMTCIFFilterMaxterm__Group__1__Impl rule__TMTCIFFilterMaxterm__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterMaxterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__1"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__1__Impl"
    // InternalFILTER.g:6712:1: rule__TMTCIFFilterMaxterm__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6716:1: ( ( '{' ) )
            // InternalFILTER.g:6717:1: ( '{' )
            {
            // InternalFILTER.g:6717:1: ( '{' )
            // InternalFILTER.g:6718:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__2"
    // InternalFILTER.g:6727:1: rule__TMTCIFFilterMaxterm__Group__2 : rule__TMTCIFFilterMaxterm__Group__2__Impl rule__TMTCIFFilterMaxterm__Group__3 ;
    public final void rule__TMTCIFFilterMaxterm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6731:1: ( rule__TMTCIFFilterMaxterm__Group__2__Impl rule__TMTCIFFilterMaxterm__Group__3 )
            // InternalFILTER.g:6732:2: rule__TMTCIFFilterMaxterm__Group__2__Impl rule__TMTCIFFilterMaxterm__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMaxterm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__2"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__2__Impl"
    // InternalFILTER.g:6739:1: rule__TMTCIFFilterMaxterm__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6743:1: ( ( 'id' ) )
            // InternalFILTER.g:6744:1: ( 'id' )
            {
            // InternalFILTER.g:6744:1: ( 'id' )
            // InternalFILTER.g:6745:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__3"
    // InternalFILTER.g:6754:1: rule__TMTCIFFilterMaxterm__Group__3 : rule__TMTCIFFilterMaxterm__Group__3__Impl rule__TMTCIFFilterMaxterm__Group__4 ;
    public final void rule__TMTCIFFilterMaxterm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6758:1: ( rule__TMTCIFFilterMaxterm__Group__3__Impl rule__TMTCIFFilterMaxterm__Group__4 )
            // InternalFILTER.g:6759:2: rule__TMTCIFFilterMaxterm__Group__3__Impl rule__TMTCIFFilterMaxterm__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterMaxterm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__3"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__3__Impl"
    // InternalFILTER.g:6766:1: rule__TMTCIFFilterMaxterm__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6770:1: ( ( ':=' ) )
            // InternalFILTER.g:6771:1: ( ':=' )
            {
            // InternalFILTER.g:6771:1: ( ':=' )
            // InternalFILTER.g:6772:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__4"
    // InternalFILTER.g:6781:1: rule__TMTCIFFilterMaxterm__Group__4 : rule__TMTCIFFilterMaxterm__Group__4__Impl rule__TMTCIFFilterMaxterm__Group__5 ;
    public final void rule__TMTCIFFilterMaxterm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6785:1: ( rule__TMTCIFFilterMaxterm__Group__4__Impl rule__TMTCIFFilterMaxterm__Group__5 )
            // InternalFILTER.g:6786:2: rule__TMTCIFFilterMaxterm__Group__4__Impl rule__TMTCIFFilterMaxterm__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxterm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__4"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__4__Impl"
    // InternalFILTER.g:6793:1: rule__TMTCIFFilterMaxterm__Group__4__Impl : ( ( rule__TMTCIFFilterMaxterm__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6797:1: ( ( ( rule__TMTCIFFilterMaxterm__IdAssignment_4 ) ) )
            // InternalFILTER.g:6798:1: ( ( rule__TMTCIFFilterMaxterm__IdAssignment_4 ) )
            {
            // InternalFILTER.g:6798:1: ( ( rule__TMTCIFFilterMaxterm__IdAssignment_4 ) )
            // InternalFILTER.g:6799:2: ( rule__TMTCIFFilterMaxterm__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:6800:2: ( rule__TMTCIFFilterMaxterm__IdAssignment_4 )
            // InternalFILTER.g:6800:3: rule__TMTCIFFilterMaxterm__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__5"
    // InternalFILTER.g:6808:1: rule__TMTCIFFilterMaxterm__Group__5 : rule__TMTCIFFilterMaxterm__Group__5__Impl rule__TMTCIFFilterMaxterm__Group__6 ;
    public final void rule__TMTCIFFilterMaxterm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6812:1: ( rule__TMTCIFFilterMaxterm__Group__5__Impl rule__TMTCIFFilterMaxterm__Group__6 )
            // InternalFILTER.g:6813:2: rule__TMTCIFFilterMaxterm__Group__5__Impl rule__TMTCIFFilterMaxterm__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__TMTCIFFilterMaxterm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__5"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__5__Impl"
    // InternalFILTER.g:6820:1: rule__TMTCIFFilterMaxterm__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6824:1: ( ( ';' ) )
            // InternalFILTER.g:6825:1: ( ';' )
            {
            // InternalFILTER.g:6825:1: ( ';' )
            // InternalFILTER.g:6826:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__6"
    // InternalFILTER.g:6835:1: rule__TMTCIFFilterMaxterm__Group__6 : rule__TMTCIFFilterMaxterm__Group__6__Impl rule__TMTCIFFilterMaxterm__Group__7 ;
    public final void rule__TMTCIFFilterMaxterm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6839:1: ( rule__TMTCIFFilterMaxterm__Group__6__Impl rule__TMTCIFFilterMaxterm__Group__7 )
            // InternalFILTER.g:6840:2: rule__TMTCIFFilterMaxterm__Group__6__Impl rule__TMTCIFFilterMaxterm__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterMaxterm__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__6"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__6__Impl"
    // InternalFILTER.g:6847:1: rule__TMTCIFFilterMaxterm__Group__6__Impl : ( ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* ) ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6851:1: ( ( ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* ) ) )
            // InternalFILTER.g:6852:1: ( ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* ) )
            {
            // InternalFILTER.g:6852:1: ( ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* ) )
            // InternalFILTER.g:6853:2: ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* )
            {
            // InternalFILTER.g:6853:2: ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 ) )
            // InternalFILTER.g:6854:3: ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:6855:3: ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )
            // InternalFILTER.g:6855:4: rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }

            }

            // InternalFILTER.g:6858:2: ( ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )* )
            // InternalFILTER.g:6859:3: ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:6860:3: ( rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==61) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFILTER.g:6860:4: rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__7"
    // InternalFILTER.g:6869:1: rule__TMTCIFFilterMaxterm__Group__7 : rule__TMTCIFFilterMaxterm__Group__7__Impl rule__TMTCIFFilterMaxterm__Group__8 ;
    public final void rule__TMTCIFFilterMaxterm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6873:1: ( rule__TMTCIFFilterMaxterm__Group__7__Impl rule__TMTCIFFilterMaxterm__Group__8 )
            // InternalFILTER.g:6874:2: rule__TMTCIFFilterMaxterm__Group__7__Impl rule__TMTCIFFilterMaxterm__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMaxterm__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__7"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__7__Impl"
    // InternalFILTER.g:6881:1: rule__TMTCIFFilterMaxterm__Group__7__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6885:1: ( ( '}' ) )
            // InternalFILTER.g:6886:1: ( '}' )
            {
            // InternalFILTER.g:6886:1: ( '}' )
            // InternalFILTER.g:6887:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__8"
    // InternalFILTER.g:6896:1: rule__TMTCIFFilterMaxterm__Group__8 : rule__TMTCIFFilterMaxterm__Group__8__Impl ;
    public final void rule__TMTCIFFilterMaxterm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6900:1: ( rule__TMTCIFFilterMaxterm__Group__8__Impl )
            // InternalFILTER.g:6901:2: rule__TMTCIFFilterMaxterm__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxterm__Group__8__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__8"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__Group__8__Impl"
    // InternalFILTER.g:6907:1: rule__TMTCIFFilterMaxterm__Group__8__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMaxterm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6911:1: ( ( ';' ) )
            // InternalFILTER.g:6912:1: ( ';' )
            {
            // InternalFILTER.g:6912:1: ( ';' )
            // InternalFILTER.g:6913:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getSemicolonKeyword_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__0"
    // InternalFILTER.g:6923:1: rule__TMTCIFFilterMinterm__Group__0 : rule__TMTCIFFilterMinterm__Group__0__Impl rule__TMTCIFFilterMinterm__Group__1 ;
    public final void rule__TMTCIFFilterMinterm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6927:1: ( rule__TMTCIFFilterMinterm__Group__0__Impl rule__TMTCIFFilterMinterm__Group__1 )
            // InternalFILTER.g:6928:2: rule__TMTCIFFilterMinterm__Group__0__Impl rule__TMTCIFFilterMinterm__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterMinterm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__0"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__0__Impl"
    // InternalFILTER.g:6935:1: rule__TMTCIFFilterMinterm__Group__0__Impl : ( 'TMTCIFFilterMinterm' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6939:1: ( ( 'TMTCIFFilterMinterm' ) )
            // InternalFILTER.g:6940:1: ( 'TMTCIFFilterMinterm' )
            {
            // InternalFILTER.g:6940:1: ( 'TMTCIFFilterMinterm' )
            // InternalFILTER.g:6941:2: 'TMTCIFFilterMinterm'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getTMTCIFFilterMintermKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__1"
    // InternalFILTER.g:6950:1: rule__TMTCIFFilterMinterm__Group__1 : rule__TMTCIFFilterMinterm__Group__1__Impl rule__TMTCIFFilterMinterm__Group__2 ;
    public final void rule__TMTCIFFilterMinterm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6954:1: ( rule__TMTCIFFilterMinterm__Group__1__Impl rule__TMTCIFFilterMinterm__Group__2 )
            // InternalFILTER.g:6955:2: rule__TMTCIFFilterMinterm__Group__1__Impl rule__TMTCIFFilterMinterm__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFFilterMinterm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__1"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__1__Impl"
    // InternalFILTER.g:6962:1: rule__TMTCIFFilterMinterm__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6966:1: ( ( '{' ) )
            // InternalFILTER.g:6967:1: ( '{' )
            {
            // InternalFILTER.g:6967:1: ( '{' )
            // InternalFILTER.g:6968:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__2"
    // InternalFILTER.g:6977:1: rule__TMTCIFFilterMinterm__Group__2 : rule__TMTCIFFilterMinterm__Group__2__Impl rule__TMTCIFFilterMinterm__Group__3 ;
    public final void rule__TMTCIFFilterMinterm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6981:1: ( rule__TMTCIFFilterMinterm__Group__2__Impl rule__TMTCIFFilterMinterm__Group__3 )
            // InternalFILTER.g:6982:2: rule__TMTCIFFilterMinterm__Group__2__Impl rule__TMTCIFFilterMinterm__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterMinterm__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__2"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__2__Impl"
    // InternalFILTER.g:6989:1: rule__TMTCIFFilterMinterm__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:6993:1: ( ( 'id' ) )
            // InternalFILTER.g:6994:1: ( 'id' )
            {
            // InternalFILTER.g:6994:1: ( 'id' )
            // InternalFILTER.g:6995:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getIdKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__3"
    // InternalFILTER.g:7004:1: rule__TMTCIFFilterMinterm__Group__3 : rule__TMTCIFFilterMinterm__Group__3__Impl rule__TMTCIFFilterMinterm__Group__4 ;
    public final void rule__TMTCIFFilterMinterm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7008:1: ( rule__TMTCIFFilterMinterm__Group__3__Impl rule__TMTCIFFilterMinterm__Group__4 )
            // InternalFILTER.g:7009:2: rule__TMTCIFFilterMinterm__Group__3__Impl rule__TMTCIFFilterMinterm__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterMinterm__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__3"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__3__Impl"
    // InternalFILTER.g:7016:1: rule__TMTCIFFilterMinterm__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7020:1: ( ( ':=' ) )
            // InternalFILTER.g:7021:1: ( ':=' )
            {
            // InternalFILTER.g:7021:1: ( ':=' )
            // InternalFILTER.g:7022:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__4"
    // InternalFILTER.g:7031:1: rule__TMTCIFFilterMinterm__Group__4 : rule__TMTCIFFilterMinterm__Group__4__Impl rule__TMTCIFFilterMinterm__Group__5 ;
    public final void rule__TMTCIFFilterMinterm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7035:1: ( rule__TMTCIFFilterMinterm__Group__4__Impl rule__TMTCIFFilterMinterm__Group__5 )
            // InternalFILTER.g:7036:2: rule__TMTCIFFilterMinterm__Group__4__Impl rule__TMTCIFFilterMinterm__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMinterm__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__4"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__4__Impl"
    // InternalFILTER.g:7043:1: rule__TMTCIFFilterMinterm__Group__4__Impl : ( ( rule__TMTCIFFilterMinterm__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterMinterm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7047:1: ( ( ( rule__TMTCIFFilterMinterm__IdAssignment_4 ) ) )
            // InternalFILTER.g:7048:1: ( ( rule__TMTCIFFilterMinterm__IdAssignment_4 ) )
            {
            // InternalFILTER.g:7048:1: ( ( rule__TMTCIFFilterMinterm__IdAssignment_4 ) )
            // InternalFILTER.g:7049:2: ( rule__TMTCIFFilterMinterm__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getIdAssignment_4()); 
            }
            // InternalFILTER.g:7050:2: ( rule__TMTCIFFilterMinterm__IdAssignment_4 )
            // InternalFILTER.g:7050:3: rule__TMTCIFFilterMinterm__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getIdAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__5"
    // InternalFILTER.g:7058:1: rule__TMTCIFFilterMinterm__Group__5 : rule__TMTCIFFilterMinterm__Group__5__Impl rule__TMTCIFFilterMinterm__Group__6 ;
    public final void rule__TMTCIFFilterMinterm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7062:1: ( rule__TMTCIFFilterMinterm__Group__5__Impl rule__TMTCIFFilterMinterm__Group__6 )
            // InternalFILTER.g:7063:2: rule__TMTCIFFilterMinterm__Group__5__Impl rule__TMTCIFFilterMinterm__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__TMTCIFFilterMinterm__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__5"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__5__Impl"
    // InternalFILTER.g:7070:1: rule__TMTCIFFilterMinterm__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7074:1: ( ( ';' ) )
            // InternalFILTER.g:7075:1: ( ';' )
            {
            // InternalFILTER.g:7075:1: ( ';' )
            // InternalFILTER.g:7076:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__6"
    // InternalFILTER.g:7085:1: rule__TMTCIFFilterMinterm__Group__6 : rule__TMTCIFFilterMinterm__Group__6__Impl rule__TMTCIFFilterMinterm__Group__7 ;
    public final void rule__TMTCIFFilterMinterm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7089:1: ( rule__TMTCIFFilterMinterm__Group__6__Impl rule__TMTCIFFilterMinterm__Group__7 )
            // InternalFILTER.g:7090:2: rule__TMTCIFFilterMinterm__Group__6__Impl rule__TMTCIFFilterMinterm__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterMinterm__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__6"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__6__Impl"
    // InternalFILTER.g:7097:1: rule__TMTCIFFilterMinterm__Group__6__Impl : ( ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* ) ) ;
    public final void rule__TMTCIFFilterMinterm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7101:1: ( ( ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* ) ) )
            // InternalFILTER.g:7102:1: ( ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* ) )
            {
            // InternalFILTER.g:7102:1: ( ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* ) )
            // InternalFILTER.g:7103:2: ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) ) ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* )
            {
            // InternalFILTER.g:7103:2: ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 ) )
            // InternalFILTER.g:7104:3: ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:7105:3: ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )
            // InternalFILTER.g:7105:4: rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }

            }

            // InternalFILTER.g:7108:2: ( ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )* )
            // InternalFILTER.g:7109:3: ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); 
            }
            // InternalFILTER.g:7110:3: ( rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFILTER.g:7110:4: rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__7"
    // InternalFILTER.g:7119:1: rule__TMTCIFFilterMinterm__Group__7 : rule__TMTCIFFilterMinterm__Group__7__Impl rule__TMTCIFFilterMinterm__Group__8 ;
    public final void rule__TMTCIFFilterMinterm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7123:1: ( rule__TMTCIFFilterMinterm__Group__7__Impl rule__TMTCIFFilterMinterm__Group__8 )
            // InternalFILTER.g:7124:2: rule__TMTCIFFilterMinterm__Group__7__Impl rule__TMTCIFFilterMinterm__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterMinterm__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__8();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__7"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__7__Impl"
    // InternalFILTER.g:7131:1: rule__TMTCIFFilterMinterm__Group__7__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7135:1: ( ( '}' ) )
            // InternalFILTER.g:7136:1: ( '}' )
            {
            // InternalFILTER.g:7136:1: ( '}' )
            // InternalFILTER.g:7137:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__8"
    // InternalFILTER.g:7146:1: rule__TMTCIFFilterMinterm__Group__8 : rule__TMTCIFFilterMinterm__Group__8__Impl ;
    public final void rule__TMTCIFFilterMinterm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7150:1: ( rule__TMTCIFFilterMinterm__Group__8__Impl )
            // InternalFILTER.g:7151:2: rule__TMTCIFFilterMinterm__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMinterm__Group__8__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__8"


    // $ANTLR start "rule__TMTCIFFilterMinterm__Group__8__Impl"
    // InternalFILTER.g:7157:1: rule__TMTCIFFilterMinterm__Group__8__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterMinterm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7161:1: ( ( ';' ) )
            // InternalFILTER.g:7162:1: ( ';' )
            {
            // InternalFILTER.g:7162:1: ( ';' )
            // InternalFILTER.g:7163:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getSemicolonKeyword_8()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__0"
    // InternalFILTER.g:7173:1: rule__TMTCIFFilterBoolVarRef__Group__0 : rule__TMTCIFFilterBoolVarRef__Group__0__Impl rule__TMTCIFFilterBoolVarRef__Group__1 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7177:1: ( rule__TMTCIFFilterBoolVarRef__Group__0__Impl rule__TMTCIFFilterBoolVarRef__Group__1 )
            // InternalFILTER.g:7178:2: rule__TMTCIFFilterBoolVarRef__Group__0__Impl rule__TMTCIFFilterBoolVarRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFFilterBoolVarRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__1();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__0__Impl"
    // InternalFILTER.g:7185:1: rule__TMTCIFFilterBoolVarRef__Group__0__Impl : ( 'TMTCIFFilterBoolVarRef' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7189:1: ( ( 'TMTCIFFilterBoolVarRef' ) )
            // InternalFILTER.g:7190:1: ( 'TMTCIFFilterBoolVarRef' )
            {
            // InternalFILTER.g:7190:1: ( 'TMTCIFFilterBoolVarRef' )
            // InternalFILTER.g:7191:2: 'TMTCIFFilterBoolVarRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getTMTCIFFilterBoolVarRefKeyword_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__1"
    // InternalFILTER.g:7200:1: rule__TMTCIFFilterBoolVarRef__Group__1 : rule__TMTCIFFilterBoolVarRef__Group__1__Impl rule__TMTCIFFilterBoolVarRef__Group__2 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7204:1: ( rule__TMTCIFFilterBoolVarRef__Group__1__Impl rule__TMTCIFFilterBoolVarRef__Group__2 )
            // InternalFILTER.g:7205:2: rule__TMTCIFFilterBoolVarRef__Group__1__Impl rule__TMTCIFFilterBoolVarRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__TMTCIFFilterBoolVarRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__2();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__1__Impl"
    // InternalFILTER.g:7212:1: rule__TMTCIFFilterBoolVarRef__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7216:1: ( ( '{' ) )
            // InternalFILTER.g:7217:1: ( '{' )
            {
            // InternalFILTER.g:7217:1: ( '{' )
            // InternalFILTER.g:7218:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__2"
    // InternalFILTER.g:7227:1: rule__TMTCIFFilterBoolVarRef__Group__2 : rule__TMTCIFFilterBoolVarRef__Group__2__Impl rule__TMTCIFFilterBoolVarRef__Group__3 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7231:1: ( rule__TMTCIFFilterBoolVarRef__Group__2__Impl rule__TMTCIFFilterBoolVarRef__Group__3 )
            // InternalFILTER.g:7232:2: rule__TMTCIFFilterBoolVarRef__Group__2__Impl rule__TMTCIFFilterBoolVarRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFFilterBoolVarRef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__3();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__2__Impl"
    // InternalFILTER.g:7239:1: rule__TMTCIFFilterBoolVarRef__Group__2__Impl : ( 'idRef' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7243:1: ( ( 'idRef' ) )
            // InternalFILTER.g:7244:1: ( 'idRef' )
            {
            // InternalFILTER.g:7244:1: ( 'idRef' )
            // InternalFILTER.g:7245:2: 'idRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefKeyword_2()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__3"
    // InternalFILTER.g:7254:1: rule__TMTCIFFilterBoolVarRef__Group__3 : rule__TMTCIFFilterBoolVarRef__Group__3__Impl rule__TMTCIFFilterBoolVarRef__Group__4 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7258:1: ( rule__TMTCIFFilterBoolVarRef__Group__3__Impl rule__TMTCIFFilterBoolVarRef__Group__4 )
            // InternalFILTER.g:7259:2: rule__TMTCIFFilterBoolVarRef__Group__3__Impl rule__TMTCIFFilterBoolVarRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFFilterBoolVarRef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__4();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__3"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__3__Impl"
    // InternalFILTER.g:7266:1: rule__TMTCIFFilterBoolVarRef__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7270:1: ( ( ':=' ) )
            // InternalFILTER.g:7271:1: ( ':=' )
            {
            // InternalFILTER.g:7271:1: ( ':=' )
            // InternalFILTER.g:7272:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getColonEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__4"
    // InternalFILTER.g:7281:1: rule__TMTCIFFilterBoolVarRef__Group__4 : rule__TMTCIFFilterBoolVarRef__Group__4__Impl rule__TMTCIFFilterBoolVarRef__Group__5 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7285:1: ( rule__TMTCIFFilterBoolVarRef__Group__4__Impl rule__TMTCIFFilterBoolVarRef__Group__5 )
            // InternalFILTER.g:7286:2: rule__TMTCIFFilterBoolVarRef__Group__4__Impl rule__TMTCIFFilterBoolVarRef__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarRef__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__5();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__4__Impl"
    // InternalFILTER.g:7293:1: rule__TMTCIFFilterBoolVarRef__Group__4__Impl : ( ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 ) ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7297:1: ( ( ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 ) ) )
            // InternalFILTER.g:7298:1: ( ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 ) )
            {
            // InternalFILTER.g:7298:1: ( ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 ) )
            // InternalFILTER.g:7299:2: ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefAssignment_4()); 
            }
            // InternalFILTER.g:7300:2: ( rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 )
            // InternalFILTER.g:7300:3: rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefAssignment_4()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__5"
    // InternalFILTER.g:7308:1: rule__TMTCIFFilterBoolVarRef__Group__5 : rule__TMTCIFFilterBoolVarRef__Group__5__Impl rule__TMTCIFFilterBoolVarRef__Group__6 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7312:1: ( rule__TMTCIFFilterBoolVarRef__Group__5__Impl rule__TMTCIFFilterBoolVarRef__Group__6 )
            // InternalFILTER.g:7313:2: rule__TMTCIFFilterBoolVarRef__Group__5__Impl rule__TMTCIFFilterBoolVarRef__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFFilterBoolVarRef__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__6();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__5"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__5__Impl"
    // InternalFILTER.g:7320:1: rule__TMTCIFFilterBoolVarRef__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7324:1: ( ( ';' ) )
            // InternalFILTER.g:7325:1: ( ';' )
            {
            // InternalFILTER.g:7325:1: ( ';' )
            // InternalFILTER.g:7326:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__6"
    // InternalFILTER.g:7335:1: rule__TMTCIFFilterBoolVarRef__Group__6 : rule__TMTCIFFilterBoolVarRef__Group__6__Impl rule__TMTCIFFilterBoolVarRef__Group__7 ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7339:1: ( rule__TMTCIFFilterBoolVarRef__Group__6__Impl rule__TMTCIFFilterBoolVarRef__Group__7 )
            // InternalFILTER.g:7340:2: rule__TMTCIFFilterBoolVarRef__Group__6__Impl rule__TMTCIFFilterBoolVarRef__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFFilterBoolVarRef__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__7();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__6"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__6__Impl"
    // InternalFILTER.g:7347:1: rule__TMTCIFFilterBoolVarRef__Group__6__Impl : ( '}' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7351:1: ( ( '}' ) )
            // InternalFILTER.g:7352:1: ( '}' )
            {
            // InternalFILTER.g:7352:1: ( '}' )
            // InternalFILTER.g:7353:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__7"
    // InternalFILTER.g:7362:1: rule__TMTCIFFilterBoolVarRef__Group__7 : rule__TMTCIFFilterBoolVarRef__Group__7__Impl ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7366:1: ( rule__TMTCIFFilterBoolVarRef__Group__7__Impl )
            // InternalFILTER.g:7367:2: rule__TMTCIFFilterBoolVarRef__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterBoolVarRef__Group__7__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__7"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__Group__7__Impl"
    // InternalFILTER.g:7373:1: rule__TMTCIFFilterBoolVarRef__Group__7__Impl : ( ';' ) ;
    public final void rule__TMTCIFFilterBoolVarRef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7377:1: ( ( ';' ) )
            // InternalFILTER.g:7378:1: ( ';' )
            {
            // InternalFILTER.g:7378:1: ( ';' )
            // InternalFILTER.g:7379:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getSemicolonKeyword_7()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__Group__7__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalFILTER.g:7389:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7393:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalFILTER.g:7394:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalFILTER.g:7401:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7405:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7406:1: ( RULE_ID )
            {
            // InternalFILTER.g:7406:1: ( RULE_ID )
            // InternalFILTER.g:7407:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalFILTER.g:7416:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7420:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalFILTER.g:7421:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalFILTER.g:7427:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7431:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalFILTER.g:7432:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalFILTER.g:7432:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalFILTER.g:7433:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalFILTER.g:7434:2: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==63) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFILTER.g:7434:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalFILTER.g:7443:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7447:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalFILTER.g:7448:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalFILTER.g:7455:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7459:1: ( ( '.' ) )
            // InternalFILTER.g:7460:1: ( '.' )
            {
            // InternalFILTER.g:7460:1: ( '.' )
            // InternalFILTER.g:7461:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalFILTER.g:7470:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7474:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalFILTER.g:7475:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalFILTER.g:7481:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7485:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7486:1: ( RULE_ID )
            {
            // InternalFILTER.g:7486:1: ( RULE_ID )
            // InternalFILTER.g:7487:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalFILTER.g:7497:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7501:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalFILTER.g:7502:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__Version__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalFILTER.g:7509:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7513:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalFILTER.g:7514:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalFILTER.g:7514:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalFILTER.g:7515:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalFILTER.g:7516:2: ( rule__Version__Alternatives_0 )
            // InternalFILTER.g:7516:3: rule__Version__Alternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalFILTER.g:7524:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7528:1: ( rule__Version__Group__1__Impl )
            // InternalFILTER.g:7529:2: rule__Version__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group__1__Impl();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalFILTER.g:7535:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7539:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalFILTER.g:7540:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalFILTER.g:7540:1: ( ( rule__Version__Group_1__0 )* )
            // InternalFILTER.g:7541:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalFILTER.g:7542:2: ( rule__Version__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==63) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFILTER.g:7542:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group_0_1__0"
    // InternalFILTER.g:7551:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7555:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalFILTER.g:7556:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Version__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_0_1__1();

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
    // $ANTLR end "rule__Version__Group_0_1__0"


    // $ANTLR start "rule__Version__Group_0_1__0__Impl"
    // InternalFILTER.g:7563:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7567:1: ( ( ( RULE_INT )? ) )
            // InternalFILTER.g:7568:1: ( ( RULE_INT )? )
            {
            // InternalFILTER.g:7568:1: ( ( RULE_INT )? )
            // InternalFILTER.g:7569:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalFILTER.g:7570:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFILTER.g:7570:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Version__Group_0_1__0__Impl"


    // $ANTLR start "rule__Version__Group_0_1__1"
    // InternalFILTER.g:7578:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7582:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalFILTER.g:7583:2: rule__Version__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__Version__Group_0_1__1"


    // $ANTLR start "rule__Version__Group_0_1__1__Impl"
    // InternalFILTER.g:7589:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7593:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7594:1: ( RULE_ID )
            {
            // InternalFILTER.g:7594:1: ( RULE_ID )
            // InternalFILTER.g:7595:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1()); 
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
    // $ANTLR end "rule__Version__Group_0_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1__0"
    // InternalFILTER.g:7605:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7609:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalFILTER.g:7610:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Version__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1__1();

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
    // $ANTLR end "rule__Version__Group_1__0"


    // $ANTLR start "rule__Version__Group_1__0__Impl"
    // InternalFILTER.g:7617:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7621:1: ( ( '.' ) )
            // InternalFILTER.g:7622:1: ( '.' )
            {
            // InternalFILTER.g:7622:1: ( '.' )
            // InternalFILTER.g:7623:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__Version__Group_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1__1"
    // InternalFILTER.g:7632:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7636:1: ( rule__Version__Group_1__1__Impl )
            // InternalFILTER.g:7637:2: rule__Version__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1__1"


    // $ANTLR start "rule__Version__Group_1__1__Impl"
    // InternalFILTER.g:7643:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7647:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalFILTER.g:7648:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalFILTER.g:7648:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalFILTER.g:7649:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalFILTER.g:7650:2: ( rule__Version__Alternatives_1_1 )
            // InternalFILTER.g:7650:3: rule__Version__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
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
    // $ANTLR end "rule__Version__Group_1__1__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__0"
    // InternalFILTER.g:7659:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7663:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalFILTER.g:7664:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Version__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1_1_1__1();

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
    // $ANTLR end "rule__Version__Group_1_1_1__0"


    // $ANTLR start "rule__Version__Group_1_1_1__0__Impl"
    // InternalFILTER.g:7671:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7675:1: ( ( ( RULE_INT )? ) )
            // InternalFILTER.g:7676:1: ( ( RULE_INT )? )
            {
            // InternalFILTER.g:7676:1: ( ( RULE_INT )? )
            // InternalFILTER.g:7677:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalFILTER.g:7678:2: ( RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFILTER.g:7678:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Version__Group_1_1_1__1"
    // InternalFILTER.g:7686:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7690:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalFILTER.g:7691:2: rule__Version__Group_1_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Version__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Version__Group_1_1_1__1"


    // $ANTLR start "rule__Version__Group_1_1_1__1__Impl"
    // InternalFILTER.g:7697:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7701:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7702:1: ( RULE_ID )
            {
            // InternalFILTER.g:7702:1: ( RULE_ID )
            // InternalFILTER.g:7703:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1()); 
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
    // $ANTLR end "rule__Version__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__0"
    // InternalFILTER.g:7713:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7717:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalFILTER.g:7718:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__VersionedQualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__1();

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
    // $ANTLR end "rule__VersionedQualifiedName__Group__0"


    // $ANTLR start "rule__VersionedQualifiedName__Group__0__Impl"
    // InternalFILTER.g:7725:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7729:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:7730:1: ( ruleQualifiedName )
            {
            // InternalFILTER.g:7730:1: ( ruleQualifiedName )
            // InternalFILTER.g:7731:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__VersionedQualifiedName__Group__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__1"
    // InternalFILTER.g:7740:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7744:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalFILTER.g:7745:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__VersionedQualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__2();

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
    // $ANTLR end "rule__VersionedQualifiedName__Group__1"


    // $ANTLR start "rule__VersionedQualifiedName__Group__1__Impl"
    // InternalFILTER.g:7752:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7756:1: ( ( '(' ) )
            // InternalFILTER.g:7757:1: ( '(' )
            {
            // InternalFILTER.g:7757:1: ( '(' )
            // InternalFILTER.g:7758:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__VersionedQualifiedName__Group__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__2"
    // InternalFILTER.g:7767:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7771:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalFILTER.g:7772:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__VersionedQualifiedName__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__3();

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
    // $ANTLR end "rule__VersionedQualifiedName__Group__2"


    // $ANTLR start "rule__VersionedQualifiedName__Group__2__Impl"
    // InternalFILTER.g:7779:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7783:1: ( ( ruleVersion ) )
            // InternalFILTER.g:7784:1: ( ruleVersion )
            {
            // InternalFILTER.g:7784:1: ( ruleVersion )
            // InternalFILTER.g:7785:2: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2()); 
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
    // $ANTLR end "rule__VersionedQualifiedName__Group__2__Impl"


    // $ANTLR start "rule__VersionedQualifiedName__Group__3"
    // InternalFILTER.g:7794:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7798:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalFILTER.g:7799:2: rule__VersionedQualifiedName__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedName__Group__3__Impl();

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
    // $ANTLR end "rule__VersionedQualifiedName__Group__3"


    // $ANTLR start "rule__VersionedQualifiedName__Group__3__Impl"
    // InternalFILTER.g:7805:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7809:1: ( ( ')' ) )
            // InternalFILTER.g:7810:1: ( ')' )
            {
            // InternalFILTER.g:7810:1: ( ')' )
            // InternalFILTER.g:7811:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__VersionedQualifiedName__Group__3__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0"
    // InternalFILTER.g:7821:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7825:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalFILTER.g:7826:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VersionedQualifiedReferenceName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__1();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__0__Impl"
    // InternalFILTER.g:7833:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7837:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalFILTER.g:7838:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalFILTER.g:7838:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalFILTER.g:7839:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalFILTER.g:7840:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( ((LA31_1>=63 && LA31_1<=64)) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalFILTER.g:7840:3: rule__VersionedQualifiedReferenceName__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__VersionedQualifiedReferenceName__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1"
    // InternalFILTER.g:7848:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7852:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalFILTER.g:7853:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__VersionedQualifiedReferenceName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__2();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__1__Impl"
    // InternalFILTER.g:7860:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7864:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7865:1: ( RULE_ID )
            {
            // InternalFILTER.g:7865:1: ( RULE_ID )
            // InternalFILTER.g:7866:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2"
    // InternalFILTER.g:7875:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7879:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalFILTER.g:7880:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group__2__Impl();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group__2__Impl"
    // InternalFILTER.g:7886:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7890:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalFILTER.g:7891:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalFILTER.g:7891:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalFILTER.g:7892:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalFILTER.g:7893:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalFILTER.g:7893:3: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group__2__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0"
    // InternalFILTER.g:7902:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7906:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalFILTER.g:7907:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__VersionedQualifiedReferenceName__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_0__1();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"
    // InternalFILTER.g:7914:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7918:1: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:7919:1: ( ruleVersionedQualifiedName )
            {
            // InternalFILTER.g:7919:1: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:7920:2: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1"
    // InternalFILTER.g:7929:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7933:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalFILTER.g:7934:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_0__1__Impl();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"
    // InternalFILTER.g:7940:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7944:1: ( ( '::' ) )
            // InternalFILTER.g:7945:1: ( '::' )
            {
            // InternalFILTER.g:7945:1: ( '::' )
            // InternalFILTER.g:7946:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_0__1__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0"
    // InternalFILTER.g:7956:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7960:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalFILTER.g:7961:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__VersionedQualifiedReferenceName__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_2__1();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"
    // InternalFILTER.g:7968:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7972:1: ( ( '::' ) )
            // InternalFILTER.g:7973:1: ( '::' )
            {
            // InternalFILTER.g:7973:1: ( '::' )
            // InternalFILTER.g:7974:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__0__Impl"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1"
    // InternalFILTER.g:7983:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7987:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalFILTER.g:7988:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VersionedQualifiedReferenceName__Group_2__1__Impl();

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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1"


    // $ANTLR start "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"
    // InternalFILTER.g:7994:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:7998:1: ( ( RULE_ID ) )
            // InternalFILTER.g:7999:1: ( RULE_ID )
            {
            // InternalFILTER.g:7999:1: ( RULE_ID )
            // InternalFILTER.g:8000:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__VersionedQualifiedReferenceName__Group_2__1__Impl"


    // $ANTLR start "rule__INTEGER__Group_0__0"
    // InternalFILTER.g:8010:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8014:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalFILTER.g:8015:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalFILTER.g:8022:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8026:1: ( ( ( '-' )? ) )
            // InternalFILTER.g:8027:1: ( ( '-' )? )
            {
            // InternalFILTER.g:8027:1: ( ( '-' )? )
            // InternalFILTER.g:8028:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalFILTER.g:8029:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==67) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFILTER.g:8029:3: '-'
                    {
                    match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalFILTER.g:8037:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8041:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalFILTER.g:8042:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalFILTER.g:8048:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8052:1: ( ( RULE_INT ) )
            // InternalFILTER.g:8053:1: ( RULE_INT )
            {
            // InternalFILTER.g:8053:1: ( RULE_INT )
            // InternalFILTER.g:8054:2: RULE_INT
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


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3"
    // InternalFILTER.g:8064:1: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3 : rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0 {...}?;
    public final void rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
        	
        try {
            // InternalFILTER.g:8069:1: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0 {...}?)
            // InternalFILTER.g:8070:2: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl"
    // InternalFILTER.g:8078:1: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalFILTER.g:8083:1: ( ( ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) ) ) )
            // InternalFILTER.g:8084:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) ) )
            {
            // InternalFILTER.g:8084:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalFILTER.g:8085:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) )
                    {
                    // InternalFILTER.g:8085:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) )
                    // InternalFILTER.g:8086:4: {...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalFILTER.g:8086:121: ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) )
                    // InternalFILTER.g:8087:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalFILTER.g:8093:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) )
                    // InternalFILTER.g:8094:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0()); 
                    }
                    // InternalFILTER.g:8095:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 )
                    // InternalFILTER.g:8095:7: rule__TMTCIFFilterMaxtermFilter__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:8100:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) )
                    {
                    // InternalFILTER.g:8100:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) ) )
                    // InternalFILTER.g:8101:4: {...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalFILTER.g:8101:121: ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) ) )
                    // InternalFILTER.g:8102:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalFILTER.g:8108:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 ) )
                    // InternalFILTER.g:8109:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1()); 
                    }
                    // InternalFILTER.g:8110:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_1__0 )
                    // InternalFILTER.g:8110:7: rule__TMTCIFFilterMaxtermFilter__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0"
    // InternalFILTER.g:8123:1: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0 : rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 )? ;
    public final void rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8127:1: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 )? )
            // InternalFILTER.g:8128:2: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalFILTER.g:8129:2: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFILTER.g:0:0: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1"
    // InternalFILTER.g:8135:1: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 : rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl ;
    public final void rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8139:1: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl )
            // InternalFILTER.g:8140:2: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3"
    // InternalFILTER.g:8147:1: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3 : rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0 {...}?;
    public final void rule__TMTCIFFilterMintermFilter__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
        	
        try {
            // InternalFILTER.g:8152:1: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0 {...}?)
            // InternalFILTER.g:8153:2: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl"
    // InternalFILTER.g:8161:1: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalFILTER.g:8166:1: ( ( ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) ) ) )
            // InternalFILTER.g:8167:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) ) )
            {
            // InternalFILTER.g:8167:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalFILTER.g:8168:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) )
                    {
                    // InternalFILTER.g:8168:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) )
                    // InternalFILTER.g:8169:4: {...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalFILTER.g:8169:121: ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) )
                    // InternalFILTER.g:8170:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalFILTER.g:8176:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) )
                    // InternalFILTER.g:8177:6: ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0()); 
                    }
                    // InternalFILTER.g:8178:6: ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 )
                    // InternalFILTER.g:8178:7: rule__TMTCIFFilterMintermFilter__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:8183:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) )
                    {
                    // InternalFILTER.g:8183:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) ) )
                    // InternalFILTER.g:8184:4: {...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalFILTER.g:8184:121: ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) ) )
                    // InternalFILTER.g:8185:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalFILTER.g:8191:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 ) )
                    // InternalFILTER.g:8192:6: ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1()); 
                    }
                    // InternalFILTER.g:8193:6: ( rule__TMTCIFFilterMintermFilter__Group_3_1__0 )
                    // InternalFILTER.g:8193:7: rule__TMTCIFFilterMintermFilter__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0"
    // InternalFILTER.g:8206:1: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0 : rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 )? ;
    public final void rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8210:1: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 )? )
            // InternalFILTER.g:8211:2: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalFILTER.g:8212:2: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFILTER.g:0:0: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1"
    // InternalFILTER.g:8218:1: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 : rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl ;
    public final void rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8222:1: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl )
            // InternalFILTER.g:8223:2: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1"


    // $ANTLR start "rule__TMTCIFModelFile__ImportsAssignment_0"
    // InternalFILTER.g:8230:1: rule__TMTCIFModelFile__ImportsAssignment_0 : ( ruleTMTCIFModelFileImport ) ;
    public final void rule__TMTCIFModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8234:1: ( ( ruleTMTCIFModelFileImport ) )
            // InternalFILTER.g:8235:2: ( ruleTMTCIFModelFileImport )
            {
            // InternalFILTER.g:8235:2: ( ruleTMTCIFModelFileImport )
            // InternalFILTER.g:8236:3: ruleTMTCIFModelFileImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFModelFileImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getImportsTMTCIFModelFileImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TMTCIFModelFile__ImportsAssignment_0"


    // $ANTLR start "rule__TMTCIFModelFile__ElementAssignment_1"
    // InternalFILTER.g:8245:1: rule__TMTCIFModelFile__ElementAssignment_1 : ( ruleTMTCIFFilterFilter ) ;
    public final void rule__TMTCIFModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8249:1: ( ( ruleTMTCIFFilterFilter ) )
            // InternalFILTER.g:8250:2: ( ruleTMTCIFFilterFilter )
            {
            // InternalFILTER.g:8250:2: ( ruleTMTCIFFilterFilter )
            // InternalFILTER.g:8251:3: ruleTMTCIFFilterFilter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFFilterFilterParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__TMTCIFModelFile__ElementAssignment_1"


    // $ANTLR start "rule__TMTCIFModelFileImport__ImportURIAssignment_2"
    // InternalFILTER.g:8260:1: rule__TMTCIFModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8264:1: ( ( RULE_STRING ) )
            // InternalFILTER.g:8265:2: ( RULE_STRING )
            {
            // InternalFILTER.g:8265:2: ( RULE_STRING )
            // InternalFILTER.g:8266:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__TMTCIFModelFileImport__ImportURIAssignment_2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__NameAssignment_1"
    // InternalFILTER.g:8275:1: rule__TMTCIFFilterMaxtermFilter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8279:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8280:2: ( RULE_ID )
            {
            // InternalFILTER.g:8280:2: ( RULE_ID )
            // InternalFILTER.g:8281:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__NameAssignment_1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2"
    // InternalFILTER.g:8290:1: rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8294:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:8295:2: ( ruleQualifiedName )
            {
            // InternalFILTER.g:8295:2: ( ruleQualifiedName )
            // InternalFILTER.g:8296:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2"
    // InternalFILTER.g:8305:1: rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2 : ( ruleVersion ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8309:1: ( ( ruleVersion ) )
            // InternalFILTER.g:8310:2: ( ruleVersion )
            {
            // InternalFILTER.g:8310:2: ( ruleVersion )
            // InternalFILTER.g:8311:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3"
    // InternalFILTER.g:8320:1: rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8324:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalFILTER.g:8325:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalFILTER.g:8325:2: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:8326:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); 
            }
            // InternalFILTER.g:8327:3: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:8328:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0"
    // InternalFILTER.g:8339:1: rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0 : ( ruleTMTCIFFilterBoolVar ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8343:1: ( ( ruleTMTCIFFilterBoolVar ) )
            // InternalFILTER.g:8344:2: ( ruleTMTCIFFilterBoolVar )
            {
            // InternalFILTER.g:8344:2: ( ruleTMTCIFFilterBoolVar )
            // InternalFILTER.g:8345:3: ruleTMTCIFFilterBoolVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1"
    // InternalFILTER.g:8354:1: rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 : ( ruleTMTCIFFilterBoolVarFromArrayItem ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8358:1: ( ( ruleTMTCIFFilterBoolVarFromArrayItem ) )
            // InternalFILTER.g:8359:2: ( ruleTMTCIFFilterBoolVarFromArrayItem )
            {
            // InternalFILTER.g:8359:2: ( ruleTMTCIFFilterBoolVarFromArrayItem )
            // InternalFILTER.g:8360:3: ruleTMTCIFFilterBoolVarFromArrayItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2"
    // InternalFILTER.g:8369:1: rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 : ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8373:1: ( ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            // InternalFILTER.g:8374:2: ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            {
            // InternalFILTER.g:8374:2: ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            // InternalFILTER.g:8375:3: ruleTMTCIFFilterBoolVarFromGroupedArrayItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3"
    // InternalFILTER.g:8384:1: rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3 : ( ruleTMTCIFFilterBoolVarFDIC ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8388:1: ( ( ruleTMTCIFFilterBoolVarFDIC ) )
            // InternalFILTER.g:8389:2: ( ruleTMTCIFFilterBoolVarFDIC )
            {
            // InternalFILTER.g:8389:2: ( ruleTMTCIFFilterBoolVarFDIC )
            // InternalFILTER.g:8390:3: ruleTMTCIFFilterBoolVarFDIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3"


    // $ANTLR start "rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4"
    // InternalFILTER.g:8399:1: rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4 : ( ruleTMTCIFFilterMaxterm ) ;
    public final void rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8403:1: ( ( ruleTMTCIFFilterMaxterm ) )
            // InternalFILTER.g:8404:2: ( ruleTMTCIFFilterMaxterm )
            {
            // InternalFILTER.g:8404:2: ( ruleTMTCIFFilterMaxterm )
            // InternalFILTER.g:8405:3: ruleTMTCIFFilterMaxterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterMaxterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermTMTCIFFilterMaxtermParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__NameAssignment_1"
    // InternalFILTER.g:8414:1: rule__TMTCIFFilterMintermFilter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterMintermFilter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8418:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8419:2: ( RULE_ID )
            {
            // InternalFILTER.g:8419:2: ( RULE_ID )
            // InternalFILTER.g:8420:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__NameAssignment_1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2"
    // InternalFILTER.g:8429:1: rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8433:1: ( ( ruleQualifiedName ) )
            // InternalFILTER.g:8434:2: ( ruleQualifiedName )
            {
            // InternalFILTER.g:8434:2: ( ruleQualifiedName )
            // InternalFILTER.g:8435:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2"
    // InternalFILTER.g:8444:1: rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2 : ( ruleVersion ) ;
    public final void rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8448:1: ( ( ruleVersion ) )
            // InternalFILTER.g:8449:2: ( ruleVersion )
            {
            // InternalFILTER.g:8449:2: ( ruleVersion )
            // InternalFILTER.g:8450:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3"
    // InternalFILTER.g:8459:1: rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8463:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalFILTER.g:8464:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalFILTER.g:8464:2: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:8465:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); 
            }
            // InternalFILTER.g:8466:3: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:8467:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_3_1_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileTMTCIFFormatFormatCrossReference_3_1_3_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0"
    // InternalFILTER.g:8478:1: rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0 : ( ruleTMTCIFFilterBoolVar ) ;
    public final void rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8482:1: ( ( ruleTMTCIFFilterBoolVar ) )
            // InternalFILTER.g:8483:2: ( ruleTMTCIFFilterBoolVar )
            {
            // InternalFILTER.g:8483:2: ( ruleTMTCIFFilterBoolVar )
            // InternalFILTER.g:8484:3: ruleTMTCIFFilterBoolVar
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarTMTCIFFilterBoolVarParserRuleCall_3_1_5_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1"
    // InternalFILTER.g:8493:1: rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1 : ( ruleTMTCIFFilterBoolVarFromArrayItem ) ;
    public final void rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8497:1: ( ( ruleTMTCIFFilterBoolVarFromArrayItem ) )
            // InternalFILTER.g:8498:2: ( ruleTMTCIFFilterBoolVarFromArrayItem )
            {
            // InternalFILTER.g:8498:2: ( ruleTMTCIFFilterBoolVarFromArrayItem )
            // InternalFILTER.g:8499:3: ruleTMTCIFFilterBoolVarFromArrayItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemTMTCIFFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2"
    // InternalFILTER.g:8508:1: rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2 : ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) ;
    public final void rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8512:1: ( ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem ) )
            // InternalFILTER.g:8513:2: ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            {
            // InternalFILTER.g:8513:2: ( ruleTMTCIFFilterBoolVarFromGroupedArrayItem )
            // InternalFILTER.g:8514:3: ruleTMTCIFFilterBoolVarFromGroupedArrayItem
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemTMTCIFFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3"
    // InternalFILTER.g:8523:1: rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3 : ( ruleTMTCIFFilterBoolVarFDIC ) ;
    public final void rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8527:1: ( ( ruleTMTCIFFilterBoolVarFDIC ) )
            // InternalFILTER.g:8528:2: ( ruleTMTCIFFilterBoolVarFDIC )
            {
            // InternalFILTER.g:8528:2: ( ruleTMTCIFFilterBoolVarFDIC )
            // InternalFILTER.g:8529:3: ruleTMTCIFFilterBoolVarFDIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICTMTCIFFilterBoolVarFDICParserRuleCall_3_1_5_3_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3"


    // $ANTLR start "rule__TMTCIFFilterMintermFilter__MintermAssignment_4"
    // InternalFILTER.g:8538:1: rule__TMTCIFFilterMintermFilter__MintermAssignment_4 : ( ruleTMTCIFFilterMinterm ) ;
    public final void rule__TMTCIFFilterMintermFilter__MintermAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8542:1: ( ( ruleTMTCIFFilterMinterm ) )
            // InternalFILTER.g:8543:2: ( ruleTMTCIFFilterMinterm )
            {
            // InternalFILTER.g:8543:2: ( ruleTMTCIFFilterMinterm )
            // InternalFILTER.g:8544:3: ruleTMTCIFFilterMinterm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterMinterm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermTMTCIFFilterMintermParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMintermFilter__MintermAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__IdAssignment_4"
    // InternalFILTER.g:8553:1: rule__TMTCIFFilterBoolVar__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterBoolVar__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8557:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8558:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8558:2: ( ruleINTEGER )
            // InternalFILTER.g:8559:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__NameAssignment_8"
    // InternalFILTER.g:8568:1: rule__TMTCIFFilterBoolVar__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterBoolVar__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8572:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8573:2: ( RULE_ID )
            {
            // InternalFILTER.g:8573:2: ( RULE_ID )
            // InternalFILTER.g:8574:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__NameAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12"
    // InternalFILTER.g:8583:1: rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12 : ( ruleTMTCIFFilterConstantType ) ;
    public final void rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8587:1: ( ( ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:8588:2: ( ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:8588:2: ( ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:8589:3: ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__FieldRefAssignment_16"
    // InternalFILTER.g:8598:1: rule__TMTCIFFilterBoolVar__FieldRefAssignment_16 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFFilterBoolVar__FieldRefAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8602:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8603:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8603:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8604:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0()); 
            }
            // InternalFILTER.g:8605:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8606:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefTMTCIFFormatFieldCrossReference_16_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__FieldRefAssignment_16"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__OpAssignment_18"
    // InternalFILTER.g:8617:1: rule__TMTCIFFilterBoolVar__OpAssignment_18 : ( ruleTMTCIFFilterFieldOp ) ;
    public final void rule__TMTCIFFilterBoolVar__OpAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8621:1: ( ( ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:8622:2: ( ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:8622:2: ( ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:8623:3: ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__OpAssignment_18"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0"
    // InternalFILTER.g:8632:1: rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0 : ( ruleTMTCIFFilterConstant ) ;
    public final void rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8636:1: ( ( ruleTMTCIFFilterConstant ) )
            // InternalFILTER.g:8637:2: ( ruleTMTCIFFilterConstant )
            {
            // InternalFILTER.g:8637:2: ( ruleTMTCIFFilterConstant )
            // InternalFILTER.g:8638:3: ruleTMTCIFFilterConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__SelectAssignment_19_1"
    // InternalFILTER.g:8647:1: rule__TMTCIFFilterBoolVar__SelectAssignment_19_1 : ( ruleTMTCIFFilterSelect ) ;
    public final void rule__TMTCIFFilterBoolVar__SelectAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8651:1: ( ( ruleTMTCIFFilterSelect ) )
            // InternalFILTER.g:8652:2: ( ruleTMTCIFFilterSelect )
            {
            // InternalFILTER.g:8652:2: ( ruleTMTCIFFilterSelect )
            // InternalFILTER.g:8653:3: ruleTMTCIFFilterSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__SelectAssignment_19_1"


    // $ANTLR start "rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2"
    // InternalFILTER.g:8662:1: rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2 : ( ruleTMTCIFFilterSelectLine ) ;
    public final void rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8666:1: ( ( ruleTMTCIFFilterSelectLine ) )
            // InternalFILTER.g:8667:2: ( ruleTMTCIFFilterSelectLine )
            {
            // InternalFILTER.g:8667:2: ( ruleTMTCIFFilterSelectLine )
            // InternalFILTER.g:8668:3: ruleTMTCIFFilterSelectLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4"
    // InternalFILTER.g:8677:1: rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8681:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8682:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8682:2: ( ruleINTEGER )
            // InternalFILTER.g:8683:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8"
    // InternalFILTER.g:8692:1: rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8696:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8697:2: ( RULE_ID )
            {
            // InternalFILTER.g:8697:2: ( RULE_ID )
            // InternalFILTER.g:8698:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12"
    // InternalFILTER.g:8707:1: rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12 : ( ruleTMTCIFFilterConstantType ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8711:1: ( ( ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:8712:2: ( ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:8712:2: ( ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:8713:3: ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16"
    // InternalFILTER.g:8722:1: rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8726:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8727:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8727:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8728:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0()); 
            }
            // InternalFILTER.g:8729:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8730:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_16_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefTMTCIFFormatAIFieldCrossReference_16_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18"
    // InternalFILTER.g:8741:1: rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18 : ( ruleTMTCIFFilterFieldOp ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8745:1: ( ( ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:8746:2: ( ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:8746:2: ( ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:8747:3: ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_18_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0"
    // InternalFILTER.g:8756:1: rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0 : ( ruleTMTCIFFilterConstant ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8760:1: ( ( ruleTMTCIFFilterConstant ) )
            // InternalFILTER.g:8761:2: ( ruleTMTCIFFilterConstant )
            {
            // InternalFILTER.g:8761:2: ( ruleTMTCIFFilterConstant )
            // InternalFILTER.g:8762:3: ruleTMTCIFFilterConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_19_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1"
    // InternalFILTER.g:8771:1: rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1 : ( ruleTMTCIFFilterSelect ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8775:1: ( ( ruleTMTCIFFilterSelect ) )
            // InternalFILTER.g:8776:2: ( ruleTMTCIFFilterSelect )
            {
            // InternalFILTER.g:8776:2: ( ruleTMTCIFFilterSelect )
            // InternalFILTER.g:8777:3: ruleTMTCIFFilterSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_19_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2"
    // InternalFILTER.g:8786:1: rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2 : ( ruleTMTCIFFilterSelectLine ) ;
    public final void rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8790:1: ( ( ruleTMTCIFFilterSelectLine ) )
            // InternalFILTER.g:8791:2: ( ruleTMTCIFFilterSelectLine )
            {
            // InternalFILTER.g:8791:2: ( ruleTMTCIFFilterSelectLine )
            // InternalFILTER.g:8792:3: ruleTMTCIFFilterSelectLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_19_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4"
    // InternalFILTER.g:8801:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8805:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8806:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8806:2: ( ruleINTEGER )
            // InternalFILTER.g:8807:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8"
    // InternalFILTER.g:8816:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8820:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8821:2: ( RULE_ID )
            {
            // InternalFILTER.g:8821:2: ( RULE_ID )
            // InternalFILTER.g:8822:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12"
    // InternalFILTER.g:8831:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12 : ( ruleTMTCIFFilterConstantType ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8835:1: ( ( ruleTMTCIFFilterConstantType ) )
            // InternalFILTER.g:8836:2: ( ruleTMTCIFFilterConstantType )
            {
            // InternalFILTER.g:8836:2: ( ruleTMTCIFFilterConstantType )
            // InternalFILTER.g:8837:3: ruleTMTCIFFilterConstantType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstantType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeTMTCIFFilterConstantTypeEnumRuleCall_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16"
    // InternalFILTER.g:8846:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8850:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8851:2: ( RULE_ID )
            {
            // InternalFILTER.g:8851:2: ( RULE_ID )
            // InternalFILTER.g:8852:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20"
    // InternalFILTER.g:8861:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8865:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8866:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8866:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8867:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0()); 
            }
            // InternalFILTER.g:8868:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8869:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldVersionedQualifiedReferenceNameParserRuleCall_20_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsTMTCIFFormatAFieldCrossReference_20_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22"
    // InternalFILTER.g:8880:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22 : ( ruleTMTCIFFilterFieldOp ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8884:1: ( ( ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:8885:2: ( ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:8885:2: ( ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:8886:3: ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpTMTCIFFilterFieldOpParserRuleCall_22_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0"
    // InternalFILTER.g:8895:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0 : ( ruleTMTCIFFilterConstant ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8899:1: ( ( ruleTMTCIFFilterConstant ) )
            // InternalFILTER.g:8900:2: ( ruleTMTCIFFilterConstant )
            {
            // InternalFILTER.g:8900:2: ( ruleTMTCIFFilterConstant )
            // InternalFILTER.g:8901:3: ruleTMTCIFFilterConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTMTCIFFilterConstantParserRuleCall_23_0_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1"
    // InternalFILTER.g:8910:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1 : ( ruleTMTCIFFilterSelect ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8914:1: ( ( ruleTMTCIFFilterSelect ) )
            // InternalFILTER.g:8915:2: ( ruleTMTCIFFilterSelect )
            {
            // InternalFILTER.g:8915:2: ( ruleTMTCIFFilterSelect )
            // InternalFILTER.g:8916:3: ruleTMTCIFFilterSelect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectTMTCIFFilterSelectParserRuleCall_23_1_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2"
    // InternalFILTER.g:8925:1: rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2 : ( ruleTMTCIFFilterSelectLine ) ;
    public final void rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8929:1: ( ( ruleTMTCIFFilterSelectLine ) )
            // InternalFILTER.g:8930:2: ( ruleTMTCIFFilterSelectLine )
            {
            // InternalFILTER.g:8930:2: ( ruleTMTCIFFilterSelectLine )
            // InternalFILTER.g:8931:3: ruleTMTCIFFilterSelectLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelectLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineTMTCIFFilterSelectLineParserRuleCall_23_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4"
    // InternalFILTER.g:8940:1: rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8944:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:8945:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:8945:2: ( ruleINTEGER )
            // InternalFILTER.g:8946:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8"
    // InternalFILTER.g:8955:1: rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8959:1: ( ( RULE_ID ) )
            // InternalFILTER.g:8960:2: ( RULE_ID )
            {
            // InternalFILTER.g:8960:2: ( RULE_ID )
            // InternalFILTER.g:8961:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12"
    // InternalFILTER.g:8970:1: rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8974:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalFILTER.g:8975:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalFILTER.g:8975:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:8976:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0()); 
            }
            // InternalFILTER.g:8977:3: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:8978:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldVersionedQualifiedReferenceNameParserRuleCall_12_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefTMTCIFFormatFDICFieldCrossReference_12_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12"


    // $ANTLR start "rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14"
    // InternalFILTER.g:8989:1: rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14 : ( ruleTMTCIFFilterFieldOp ) ;
    public final void rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:8993:1: ( ( ruleTMTCIFFilterFieldOp ) )
            // InternalFILTER.g:8994:2: ( ruleTMTCIFFilterFieldOp )
            {
            // InternalFILTER.g:8994:2: ( ruleTMTCIFFilterFieldOp )
            // InternalFILTER.g:8995:3: ruleTMTCIFFilterFieldOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterFieldOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpTMTCIFFilterFieldOpParserRuleCall_14_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14"


    // $ANTLR start "rule__TMTCIFFilterFieldOp__TypeAssignment_4"
    // InternalFILTER.g:9004:1: rule__TMTCIFFilterFieldOp__TypeAssignment_4 : ( ruleTMTCIFFilterOPType ) ;
    public final void rule__TMTCIFFilterFieldOp__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9008:1: ( ( ruleTMTCIFFilterOPType ) )
            // InternalFILTER.g:9009:2: ( ruleTMTCIFFilterOPType )
            {
            // InternalFILTER.g:9009:2: ( ruleTMTCIFFilterOPType )
            // InternalFILTER.g:9010:3: ruleTMTCIFFilterOPType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterOPType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeTMTCIFFilterOPTypeEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterFieldOp__TypeAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterConstant__ValueAssignment_4"
    // InternalFILTER.g:9019:1: rule__TMTCIFFilterConstant__ValueAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterConstant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9023:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9024:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9024:2: ( ruleINTEGER )
            // InternalFILTER.g:9025:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getValueINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__ValueAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterConstant__MaskAssignment_6_2"
    // InternalFILTER.g:9034:1: rule__TMTCIFFilterConstant__MaskAssignment_6_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__TMTCIFFilterConstant__MaskAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9038:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:9039:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:9039:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:9040:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterConstant__MaskAssignment_6_2"


    // $ANTLR start "rule__TMTCIFFilterSelect__FromFileAssignment_4"
    // InternalFILTER.g:9049:1: rule__TMTCIFFilterSelect__FromFileAssignment_4 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterSelect__FromFileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9053:1: ( ( RULE_ID ) )
            // InternalFILTER.g:9054:2: ( RULE_ID )
            {
            // InternalFILTER.g:9054:2: ( RULE_ID )
            // InternalFILTER.g:9055:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__FromFileAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterSelect__TypeAssignment_8"
    // InternalFILTER.g:9064:1: rule__TMTCIFFilterSelect__TypeAssignment_8 : ( ruleTMTCIFFilterSelectType ) ;
    public final void rule__TMTCIFFilterSelect__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9068:1: ( ( ruleTMTCIFFilterSelectType ) )
            // InternalFILTER.g:9069:2: ( ruleTMTCIFFilterSelectType )
            {
            // InternalFILTER.g:9069:2: ( ruleTMTCIFFilterSelectType )
            // InternalFILTER.g:9070:3: ruleTMTCIFFilterSelectType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterSelectType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getTypeTMTCIFFilterSelectTypeEnumRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__TypeAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterSelect__OffsetAssignment_10_2"
    // InternalFILTER.g:9079:1: rule__TMTCIFFilterSelect__OffsetAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterSelect__OffsetAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9083:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9084:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9084:2: ( ruleINTEGER )
            // InternalFILTER.g:9085:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__OffsetAssignment_10_2"


    // $ANTLR start "rule__TMTCIFFilterSelect__SizeAssignment_11_2"
    // InternalFILTER.g:9094:1: rule__TMTCIFFilterSelect__SizeAssignment_11_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterSelect__SizeAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9098:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9099:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9099:2: ( ruleINTEGER )
            // InternalFILTER.g:9100:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__SizeAssignment_11_2"


    // $ANTLR start "rule__TMTCIFFilterSelect__MaskAssignment_12_2"
    // InternalFILTER.g:9109:1: rule__TMTCIFFilterSelect__MaskAssignment_12_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__TMTCIFFilterSelect__MaskAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9113:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:9114:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:9114:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:9115:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelect__MaskAssignment_12_2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__FromFileAssignment_4"
    // InternalFILTER.g:9124:1: rule__TMTCIFFilterSelectLine__FromFileAssignment_4 : ( RULE_ID ) ;
    public final void rule__TMTCIFFilterSelectLine__FromFileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9128:1: ( ( RULE_ID ) )
            // InternalFILTER.g:9129:2: ( RULE_ID )
            {
            // InternalFILTER.g:9129:2: ( RULE_ID )
            // InternalFILTER.g:9130:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__FromFileAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__LineAssignment_8"
    // InternalFILTER.g:9139:1: rule__TMTCIFFilterSelectLine__LineAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterSelectLine__LineAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9143:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9144:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9144:2: ( ruleINTEGER )
            // InternalFILTER.g:9145:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__LineAssignment_8"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2"
    // InternalFILTER.g:9154:1: rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9158:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9159:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9159:2: ( ruleINTEGER )
            // InternalFILTER.g:9160:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2"
    // InternalFILTER.g:9169:1: rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9173:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9174:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9174:2: ( ruleINTEGER )
            // InternalFILTER.g:9175:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2"


    // $ANTLR start "rule__TMTCIFFilterSelectLine__MaskAssignment_12_2"
    // InternalFILTER.g:9184:1: rule__TMTCIFFilterSelectLine__MaskAssignment_12_2 : ( RULE_HEXADECIMAL ) ;
    public final void rule__TMTCIFFilterSelectLine__MaskAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9188:1: ( ( RULE_HEXADECIMAL ) )
            // InternalFILTER.g:9189:2: ( RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:9189:2: ( RULE_HEXADECIMAL )
            // InternalFILTER.g:9190:3: RULE_HEXADECIMAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
            }
            match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterSelectLine__MaskAssignment_12_2"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__IdAssignment_4"
    // InternalFILTER.g:9199:1: rule__TMTCIFFilterMaxterm__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterMaxterm__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9203:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9204:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9204:2: ( ruleINTEGER )
            // InternalFILTER.g:9205:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6"
    // InternalFILTER.g:9214:1: rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6 : ( ruleTMTCIFFilterBoolVarRef ) ;
    public final void rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9218:1: ( ( ruleTMTCIFFilterBoolVarRef ) )
            // InternalFILTER.g:9219:2: ( ruleTMTCIFFilterBoolVarRef )
            {
            // InternalFILTER.g:9219:2: ( ruleTMTCIFFilterBoolVarRef )
            // InternalFILTER.g:9220:3: ruleTMTCIFFilterBoolVarRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6"


    // $ANTLR start "rule__TMTCIFFilterMinterm__IdAssignment_4"
    // InternalFILTER.g:9229:1: rule__TMTCIFFilterMinterm__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterMinterm__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9233:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9234:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9234:2: ( ruleINTEGER )
            // InternalFILTER.g:9235:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getIdINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6"
    // InternalFILTER.g:9244:1: rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6 : ( ruleTMTCIFFilterBoolVarRef ) ;
    public final void rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9248:1: ( ( ruleTMTCIFFilterBoolVarRef ) )
            // InternalFILTER.g:9249:2: ( ruleTMTCIFFilterBoolVarRef )
            {
            // InternalFILTER.g:9249:2: ( ruleTMTCIFFilterBoolVarRef )
            // InternalFILTER.g:9250:3: ruleTMTCIFFilterBoolVarRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefTMTCIFFilterBoolVarRefParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6"


    // $ANTLR start "rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4"
    // InternalFILTER.g:9259:1: rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFILTER.g:9263:1: ( ( ruleINTEGER ) )
            // InternalFILTER.g:9264:2: ( ruleINTEGER )
            {
            // InternalFILTER.g:9264:2: ( ruleINTEGER )
            // InternalFILTER.g:9265:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4"

    // $ANTLR start synpred49_InternalFILTER
    public final void synpred49_InternalFILTER_fragment() throws RecognitionException {   
        // InternalFILTER.g:8085:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) ) )
        // InternalFILTER.g:8085:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) )
        {
        // InternalFILTER.g:8085:3: ({...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) ) )
        // InternalFILTER.g:8086:4: {...}? => ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred49_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:8086:121: ( ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) ) )
        // InternalFILTER.g:8087:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:8093:5: ( ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 ) )
        // InternalFILTER.g:8094:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0()); 
        }
        // InternalFILTER.g:8095:6: ( rule__TMTCIFFilterMaxtermFilter__Group_3_0__0 )
        // InternalFILTER.g:8095:7: rule__TMTCIFFilterMaxtermFilter__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFFilterMaxtermFilter__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred49_InternalFILTER

    // $ANTLR start synpred50_InternalFILTER
    public final void synpred50_InternalFILTER_fragment() throws RecognitionException {   
        // InternalFILTER.g:8129:2: ( rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1 )
        // InternalFILTER.g:8129:2: rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalFILTER

    // $ANTLR start synpred51_InternalFILTER
    public final void synpred51_InternalFILTER_fragment() throws RecognitionException {   
        // InternalFILTER.g:8168:3: ( ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) ) )
        // InternalFILTER.g:8168:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) )
        {
        // InternalFILTER.g:8168:3: ({...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) ) )
        // InternalFILTER.g:8169:4: {...}? => ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred51_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:8169:121: ( ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) ) )
        // InternalFILTER.g:8170:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:8176:5: ( ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 ) )
        // InternalFILTER.g:8177:6: ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0()); 
        }
        // InternalFILTER.g:8178:6: ( rule__TMTCIFFilterMintermFilter__Group_3_0__0 )
        // InternalFILTER.g:8178:7: rule__TMTCIFFilterMintermFilter__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFFilterMintermFilter__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalFILTER

    // $ANTLR start synpred52_InternalFILTER
    public final void synpred52_InternalFILTER_fragment() throws RecognitionException {   
        // InternalFILTER.g:8212:2: ( rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1 )
        // InternalFILTER.g:8212:2: rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFFilterMintermFilter__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalFILTER

    // Delegated rules

    public final boolean synpred51_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalFILTER_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000820000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00004A1000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00004A1000000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000008L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000001F000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0092000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000007E0000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000080000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000003800000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0048000081000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0608000080000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000008L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000500000002L});
    }


}