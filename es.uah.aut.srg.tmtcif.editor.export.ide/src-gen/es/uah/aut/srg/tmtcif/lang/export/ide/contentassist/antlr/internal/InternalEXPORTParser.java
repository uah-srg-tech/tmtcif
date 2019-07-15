package es.uah.aut.srg.tmtcif.lang.export.ide.contentassist.antlr.internal;

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
public class InternalEXPORTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NULL'", "'bits'", "'bytes'", "'import'", "':='", "';'", "'TMTCIFExportExport'", "'{'", "'from'", "'to'", "'}'", "'uri'", "'version'", "'TMTCIFExportSizes'", "'TMTCIFExportSizeFromFileLength'", "'id'", "'fromFile'", "'addSize'", "'unit'", "'TMTCIFExportSizeFromFileLine'", "'line'", "'TMTCIFExportSizeInBits'", "'TMTCIFExportSettings'", "'TMTCIFExportSettingFromConst'", "'value'", "'toFieldRef'", "'TMTCIFExportSettingFromSize'", "'sizeRef'", "'TMTCIFExportSettingFromFile'", "'file'", "'offset'", "'size'", "'TMTCIFExportSettingFromField'", "'fieldRef'", "'TMTCIFExportSettingAIFromConst'", "'toArrayIndex'", "'TMTCIFExportSettingAIFromFile'", "'TMTCIFExportActivateDICs'", "'TMTCIFExportDIC'", "'DICRef'", "'.'", "'('", "')'", "'::'", "'-'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


        public InternalEXPORTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEXPORTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEXPORTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEXPORT.g"; }


    	private EXPORTGrammarAccess grammarAccess;

    	public void setGrammarAccess(EXPORTGrammarAccess grammarAccess) {
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
    // InternalEXPORT.g:61:1: entryRuleTMTCIFModelFile : ruleTMTCIFModelFile EOF ;
    public final void entryRuleTMTCIFModelFile() throws RecognitionException {
        try {
            // InternalEXPORT.g:62:1: ( ruleTMTCIFModelFile EOF )
            // InternalEXPORT.g:63:1: ruleTMTCIFModelFile EOF
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
    // InternalEXPORT.g:70:1: ruleTMTCIFModelFile : ( ( rule__TMTCIFModelFile__Group__0 ) ) ;
    public final void ruleTMTCIFModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:74:2: ( ( ( rule__TMTCIFModelFile__Group__0 ) ) )
            // InternalEXPORT.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            {
            // InternalEXPORT.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            // InternalEXPORT.g:76:3: ( rule__TMTCIFModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getGroup()); 
            }
            // InternalEXPORT.g:77:3: ( rule__TMTCIFModelFile__Group__0 )
            // InternalEXPORT.g:77:4: rule__TMTCIFModelFile__Group__0
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
    // InternalEXPORT.g:86:1: entryRuleTMTCIFModelFileImport : ruleTMTCIFModelFileImport EOF ;
    public final void entryRuleTMTCIFModelFileImport() throws RecognitionException {
        try {
            // InternalEXPORT.g:87:1: ( ruleTMTCIFModelFileImport EOF )
            // InternalEXPORT.g:88:1: ruleTMTCIFModelFileImport EOF
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
    // InternalEXPORT.g:95:1: ruleTMTCIFModelFileImport : ( ( rule__TMTCIFModelFileImport__Group__0 ) ) ;
    public final void ruleTMTCIFModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:99:2: ( ( ( rule__TMTCIFModelFileImport__Group__0 ) ) )
            // InternalEXPORT.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            {
            // InternalEXPORT.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            // InternalEXPORT.g:101:3: ( rule__TMTCIFModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); 
            }
            // InternalEXPORT.g:102:3: ( rule__TMTCIFModelFileImport__Group__0 )
            // InternalEXPORT.g:102:4: rule__TMTCIFModelFileImport__Group__0
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


    // $ANTLR start "entryRuleTMTCIFExportExport"
    // InternalEXPORT.g:111:1: entryRuleTMTCIFExportExport : ruleTMTCIFExportExport EOF ;
    public final void entryRuleTMTCIFExportExport() throws RecognitionException {
        try {
            // InternalEXPORT.g:112:1: ( ruleTMTCIFExportExport EOF )
            // InternalEXPORT.g:113:1: ruleTMTCIFExportExport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportExport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportExport"


    // $ANTLR start "ruleTMTCIFExportExport"
    // InternalEXPORT.g:120:1: ruleTMTCIFExportExport : ( ( rule__TMTCIFExportExport__Group__0 ) ) ;
    public final void ruleTMTCIFExportExport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:124:2: ( ( ( rule__TMTCIFExportExport__Group__0 ) ) )
            // InternalEXPORT.g:125:2: ( ( rule__TMTCIFExportExport__Group__0 ) )
            {
            // InternalEXPORT.g:125:2: ( ( rule__TMTCIFExportExport__Group__0 ) )
            // InternalEXPORT.g:126:3: ( rule__TMTCIFExportExport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getGroup()); 
            }
            // InternalEXPORT.g:127:3: ( rule__TMTCIFExportExport__Group__0 )
            // InternalEXPORT.g:127:4: rule__TMTCIFExportExport__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportExport"


    // $ANTLR start "entryRuleTMTCIFExportSizes"
    // InternalEXPORT.g:136:1: entryRuleTMTCIFExportSizes : ruleTMTCIFExportSizes EOF ;
    public final void entryRuleTMTCIFExportSizes() throws RecognitionException {
        try {
            // InternalEXPORT.g:137:1: ( ruleTMTCIFExportSizes EOF )
            // InternalEXPORT.g:138:1: ruleTMTCIFExportSizes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSizes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSizes"


    // $ANTLR start "ruleTMTCIFExportSizes"
    // InternalEXPORT.g:145:1: ruleTMTCIFExportSizes : ( ( rule__TMTCIFExportSizes__Group__0 ) ) ;
    public final void ruleTMTCIFExportSizes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:149:2: ( ( ( rule__TMTCIFExportSizes__Group__0 ) ) )
            // InternalEXPORT.g:150:2: ( ( rule__TMTCIFExportSizes__Group__0 ) )
            {
            // InternalEXPORT.g:150:2: ( ( rule__TMTCIFExportSizes__Group__0 ) )
            // InternalEXPORT.g:151:3: ( rule__TMTCIFExportSizes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getGroup()); 
            }
            // InternalEXPORT.g:152:3: ( rule__TMTCIFExportSizes__Group__0 )
            // InternalEXPORT.g:152:4: rule__TMTCIFExportSizes__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSizes"


    // $ANTLR start "entryRuleTMTCIFExportSizeFromFileLength"
    // InternalEXPORT.g:161:1: entryRuleTMTCIFExportSizeFromFileLength : ruleTMTCIFExportSizeFromFileLength EOF ;
    public final void entryRuleTMTCIFExportSizeFromFileLength() throws RecognitionException {
        try {
            // InternalEXPORT.g:162:1: ( ruleTMTCIFExportSizeFromFileLength EOF )
            // InternalEXPORT.g:163:1: ruleTMTCIFExportSizeFromFileLength EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSizeFromFileLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSizeFromFileLength"


    // $ANTLR start "ruleTMTCIFExportSizeFromFileLength"
    // InternalEXPORT.g:170:1: ruleTMTCIFExportSizeFromFileLength : ( ( rule__TMTCIFExportSizeFromFileLength__Group__0 ) ) ;
    public final void ruleTMTCIFExportSizeFromFileLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:174:2: ( ( ( rule__TMTCIFExportSizeFromFileLength__Group__0 ) ) )
            // InternalEXPORT.g:175:2: ( ( rule__TMTCIFExportSizeFromFileLength__Group__0 ) )
            {
            // InternalEXPORT.g:175:2: ( ( rule__TMTCIFExportSizeFromFileLength__Group__0 ) )
            // InternalEXPORT.g:176:3: ( rule__TMTCIFExportSizeFromFileLength__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup()); 
            }
            // InternalEXPORT.g:177:3: ( rule__TMTCIFExportSizeFromFileLength__Group__0 )
            // InternalEXPORT.g:177:4: rule__TMTCIFExportSizeFromFileLength__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSizeFromFileLength"


    // $ANTLR start "entryRuleTMTCIFExportSizeFromFileLine"
    // InternalEXPORT.g:186:1: entryRuleTMTCIFExportSizeFromFileLine : ruleTMTCIFExportSizeFromFileLine EOF ;
    public final void entryRuleTMTCIFExportSizeFromFileLine() throws RecognitionException {
        try {
            // InternalEXPORT.g:187:1: ( ruleTMTCIFExportSizeFromFileLine EOF )
            // InternalEXPORT.g:188:1: ruleTMTCIFExportSizeFromFileLine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSizeFromFileLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSizeFromFileLine"


    // $ANTLR start "ruleTMTCIFExportSizeFromFileLine"
    // InternalEXPORT.g:195:1: ruleTMTCIFExportSizeFromFileLine : ( ( rule__TMTCIFExportSizeFromFileLine__Group__0 ) ) ;
    public final void ruleTMTCIFExportSizeFromFileLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:199:2: ( ( ( rule__TMTCIFExportSizeFromFileLine__Group__0 ) ) )
            // InternalEXPORT.g:200:2: ( ( rule__TMTCIFExportSizeFromFileLine__Group__0 ) )
            {
            // InternalEXPORT.g:200:2: ( ( rule__TMTCIFExportSizeFromFileLine__Group__0 ) )
            // InternalEXPORT.g:201:3: ( rule__TMTCIFExportSizeFromFileLine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup()); 
            }
            // InternalEXPORT.g:202:3: ( rule__TMTCIFExportSizeFromFileLine__Group__0 )
            // InternalEXPORT.g:202:4: rule__TMTCIFExportSizeFromFileLine__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSizeFromFileLine"


    // $ANTLR start "entryRuleTMTCIFExportSizeInBits"
    // InternalEXPORT.g:211:1: entryRuleTMTCIFExportSizeInBits : ruleTMTCIFExportSizeInBits EOF ;
    public final void entryRuleTMTCIFExportSizeInBits() throws RecognitionException {
        try {
            // InternalEXPORT.g:212:1: ( ruleTMTCIFExportSizeInBits EOF )
            // InternalEXPORT.g:213:1: ruleTMTCIFExportSizeInBits EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSizeInBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSizeInBits"


    // $ANTLR start "ruleTMTCIFExportSizeInBits"
    // InternalEXPORT.g:220:1: ruleTMTCIFExportSizeInBits : ( ( rule__TMTCIFExportSizeInBits__Group__0 ) ) ;
    public final void ruleTMTCIFExportSizeInBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:224:2: ( ( ( rule__TMTCIFExportSizeInBits__Group__0 ) ) )
            // InternalEXPORT.g:225:2: ( ( rule__TMTCIFExportSizeInBits__Group__0 ) )
            {
            // InternalEXPORT.g:225:2: ( ( rule__TMTCIFExportSizeInBits__Group__0 ) )
            // InternalEXPORT.g:226:3: ( rule__TMTCIFExportSizeInBits__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup()); 
            }
            // InternalEXPORT.g:227:3: ( rule__TMTCIFExportSizeInBits__Group__0 )
            // InternalEXPORT.g:227:4: rule__TMTCIFExportSizeInBits__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSizeInBits"


    // $ANTLR start "entryRuleTMTCIFExportSettings"
    // InternalEXPORT.g:236:1: entryRuleTMTCIFExportSettings : ruleTMTCIFExportSettings EOF ;
    public final void entryRuleTMTCIFExportSettings() throws RecognitionException {
        try {
            // InternalEXPORT.g:237:1: ( ruleTMTCIFExportSettings EOF )
            // InternalEXPORT.g:238:1: ruleTMTCIFExportSettings EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettings"


    // $ANTLR start "ruleTMTCIFExportSettings"
    // InternalEXPORT.g:245:1: ruleTMTCIFExportSettings : ( ( rule__TMTCIFExportSettings__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:249:2: ( ( ( rule__TMTCIFExportSettings__Group__0 ) ) )
            // InternalEXPORT.g:250:2: ( ( rule__TMTCIFExportSettings__Group__0 ) )
            {
            // InternalEXPORT.g:250:2: ( ( rule__TMTCIFExportSettings__Group__0 ) )
            // InternalEXPORT.g:251:3: ( rule__TMTCIFExportSettings__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getGroup()); 
            }
            // InternalEXPORT.g:252:3: ( rule__TMTCIFExportSettings__Group__0 )
            // InternalEXPORT.g:252:4: rule__TMTCIFExportSettings__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettings"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromConst"
    // InternalEXPORT.g:261:1: entryRuleTMTCIFExportSettingFromConst : ruleTMTCIFExportSettingFromConst EOF ;
    public final void entryRuleTMTCIFExportSettingFromConst() throws RecognitionException {
        try {
            // InternalEXPORT.g:262:1: ( ruleTMTCIFExportSettingFromConst EOF )
            // InternalEXPORT.g:263:1: ruleTMTCIFExportSettingFromConst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingFromConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingFromConst"


    // $ANTLR start "ruleTMTCIFExportSettingFromConst"
    // InternalEXPORT.g:270:1: ruleTMTCIFExportSettingFromConst : ( ( rule__TMTCIFExportSettingFromConst__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingFromConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:274:2: ( ( ( rule__TMTCIFExportSettingFromConst__Group__0 ) ) )
            // InternalEXPORT.g:275:2: ( ( rule__TMTCIFExportSettingFromConst__Group__0 ) )
            {
            // InternalEXPORT.g:275:2: ( ( rule__TMTCIFExportSettingFromConst__Group__0 ) )
            // InternalEXPORT.g:276:3: ( rule__TMTCIFExportSettingFromConst__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getGroup()); 
            }
            // InternalEXPORT.g:277:3: ( rule__TMTCIFExportSettingFromConst__Group__0 )
            // InternalEXPORT.g:277:4: rule__TMTCIFExportSettingFromConst__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromConst"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromSize"
    // InternalEXPORT.g:286:1: entryRuleTMTCIFExportSettingFromSize : ruleTMTCIFExportSettingFromSize EOF ;
    public final void entryRuleTMTCIFExportSettingFromSize() throws RecognitionException {
        try {
            // InternalEXPORT.g:287:1: ( ruleTMTCIFExportSettingFromSize EOF )
            // InternalEXPORT.g:288:1: ruleTMTCIFExportSettingFromSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingFromSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingFromSize"


    // $ANTLR start "ruleTMTCIFExportSettingFromSize"
    // InternalEXPORT.g:295:1: ruleTMTCIFExportSettingFromSize : ( ( rule__TMTCIFExportSettingFromSize__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingFromSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:299:2: ( ( ( rule__TMTCIFExportSettingFromSize__Group__0 ) ) )
            // InternalEXPORT.g:300:2: ( ( rule__TMTCIFExportSettingFromSize__Group__0 ) )
            {
            // InternalEXPORT.g:300:2: ( ( rule__TMTCIFExportSettingFromSize__Group__0 ) )
            // InternalEXPORT.g:301:3: ( rule__TMTCIFExportSettingFromSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getGroup()); 
            }
            // InternalEXPORT.g:302:3: ( rule__TMTCIFExportSettingFromSize__Group__0 )
            // InternalEXPORT.g:302:4: rule__TMTCIFExportSettingFromSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromSize"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromFile"
    // InternalEXPORT.g:311:1: entryRuleTMTCIFExportSettingFromFile : ruleTMTCIFExportSettingFromFile EOF ;
    public final void entryRuleTMTCIFExportSettingFromFile() throws RecognitionException {
        try {
            // InternalEXPORT.g:312:1: ( ruleTMTCIFExportSettingFromFile EOF )
            // InternalEXPORT.g:313:1: ruleTMTCIFExportSettingFromFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingFromFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingFromFile"


    // $ANTLR start "ruleTMTCIFExportSettingFromFile"
    // InternalEXPORT.g:320:1: ruleTMTCIFExportSettingFromFile : ( ( rule__TMTCIFExportSettingFromFile__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingFromFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:324:2: ( ( ( rule__TMTCIFExportSettingFromFile__Group__0 ) ) )
            // InternalEXPORT.g:325:2: ( ( rule__TMTCIFExportSettingFromFile__Group__0 ) )
            {
            // InternalEXPORT.g:325:2: ( ( rule__TMTCIFExportSettingFromFile__Group__0 ) )
            // InternalEXPORT.g:326:3: ( rule__TMTCIFExportSettingFromFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup()); 
            }
            // InternalEXPORT.g:327:3: ( rule__TMTCIFExportSettingFromFile__Group__0 )
            // InternalEXPORT.g:327:4: rule__TMTCIFExportSettingFromFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromFile"


    // $ANTLR start "entryRuleTMTCIFExportSettingFromField"
    // InternalEXPORT.g:336:1: entryRuleTMTCIFExportSettingFromField : ruleTMTCIFExportSettingFromField EOF ;
    public final void entryRuleTMTCIFExportSettingFromField() throws RecognitionException {
        try {
            // InternalEXPORT.g:337:1: ( ruleTMTCIFExportSettingFromField EOF )
            // InternalEXPORT.g:338:1: ruleTMTCIFExportSettingFromField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingFromField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingFromField"


    // $ANTLR start "ruleTMTCIFExportSettingFromField"
    // InternalEXPORT.g:345:1: ruleTMTCIFExportSettingFromField : ( ( rule__TMTCIFExportSettingFromField__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingFromField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:349:2: ( ( ( rule__TMTCIFExportSettingFromField__Group__0 ) ) )
            // InternalEXPORT.g:350:2: ( ( rule__TMTCIFExportSettingFromField__Group__0 ) )
            {
            // InternalEXPORT.g:350:2: ( ( rule__TMTCIFExportSettingFromField__Group__0 ) )
            // InternalEXPORT.g:351:3: ( rule__TMTCIFExportSettingFromField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getGroup()); 
            }
            // InternalEXPORT.g:352:3: ( rule__TMTCIFExportSettingFromField__Group__0 )
            // InternalEXPORT.g:352:4: rule__TMTCIFExportSettingFromField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingFromField"


    // $ANTLR start "entryRuleTMTCIFExportSettingAIFromConst"
    // InternalEXPORT.g:361:1: entryRuleTMTCIFExportSettingAIFromConst : ruleTMTCIFExportSettingAIFromConst EOF ;
    public final void entryRuleTMTCIFExportSettingAIFromConst() throws RecognitionException {
        try {
            // InternalEXPORT.g:362:1: ( ruleTMTCIFExportSettingAIFromConst EOF )
            // InternalEXPORT.g:363:1: ruleTMTCIFExportSettingAIFromConst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingAIFromConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingAIFromConst"


    // $ANTLR start "ruleTMTCIFExportSettingAIFromConst"
    // InternalEXPORT.g:370:1: ruleTMTCIFExportSettingAIFromConst : ( ( rule__TMTCIFExportSettingAIFromConst__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingAIFromConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:374:2: ( ( ( rule__TMTCIFExportSettingAIFromConst__Group__0 ) ) )
            // InternalEXPORT.g:375:2: ( ( rule__TMTCIFExportSettingAIFromConst__Group__0 ) )
            {
            // InternalEXPORT.g:375:2: ( ( rule__TMTCIFExportSettingAIFromConst__Group__0 ) )
            // InternalEXPORT.g:376:3: ( rule__TMTCIFExportSettingAIFromConst__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getGroup()); 
            }
            // InternalEXPORT.g:377:3: ( rule__TMTCIFExportSettingAIFromConst__Group__0 )
            // InternalEXPORT.g:377:4: rule__TMTCIFExportSettingAIFromConst__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingAIFromConst"


    // $ANTLR start "entryRuleTMTCIFExportSettingAIFromFile"
    // InternalEXPORT.g:386:1: entryRuleTMTCIFExportSettingAIFromFile : ruleTMTCIFExportSettingAIFromFile EOF ;
    public final void entryRuleTMTCIFExportSettingAIFromFile() throws RecognitionException {
        try {
            // InternalEXPORT.g:387:1: ( ruleTMTCIFExportSettingAIFromFile EOF )
            // InternalEXPORT.g:388:1: ruleTMTCIFExportSettingAIFromFile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportSettingAIFromFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportSettingAIFromFile"


    // $ANTLR start "ruleTMTCIFExportSettingAIFromFile"
    // InternalEXPORT.g:395:1: ruleTMTCIFExportSettingAIFromFile : ( ( rule__TMTCIFExportSettingAIFromFile__Group__0 ) ) ;
    public final void ruleTMTCIFExportSettingAIFromFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:399:2: ( ( ( rule__TMTCIFExportSettingAIFromFile__Group__0 ) ) )
            // InternalEXPORT.g:400:2: ( ( rule__TMTCIFExportSettingAIFromFile__Group__0 ) )
            {
            // InternalEXPORT.g:400:2: ( ( rule__TMTCIFExportSettingAIFromFile__Group__0 ) )
            // InternalEXPORT.g:401:3: ( rule__TMTCIFExportSettingAIFromFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup()); 
            }
            // InternalEXPORT.g:402:3: ( rule__TMTCIFExportSettingAIFromFile__Group__0 )
            // InternalEXPORT.g:402:4: rule__TMTCIFExportSettingAIFromFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportSettingAIFromFile"


    // $ANTLR start "entryRuleTMTCIFExportActivateDICs"
    // InternalEXPORT.g:411:1: entryRuleTMTCIFExportActivateDICs : ruleTMTCIFExportActivateDICs EOF ;
    public final void entryRuleTMTCIFExportActivateDICs() throws RecognitionException {
        try {
            // InternalEXPORT.g:412:1: ( ruleTMTCIFExportActivateDICs EOF )
            // InternalEXPORT.g:413:1: ruleTMTCIFExportActivateDICs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportActivateDICs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportActivateDICs"


    // $ANTLR start "ruleTMTCIFExportActivateDICs"
    // InternalEXPORT.g:420:1: ruleTMTCIFExportActivateDICs : ( ( rule__TMTCIFExportActivateDICs__Group__0 ) ) ;
    public final void ruleTMTCIFExportActivateDICs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:424:2: ( ( ( rule__TMTCIFExportActivateDICs__Group__0 ) ) )
            // InternalEXPORT.g:425:2: ( ( rule__TMTCIFExportActivateDICs__Group__0 ) )
            {
            // InternalEXPORT.g:425:2: ( ( rule__TMTCIFExportActivateDICs__Group__0 ) )
            // InternalEXPORT.g:426:3: ( rule__TMTCIFExportActivateDICs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getGroup()); 
            }
            // InternalEXPORT.g:427:3: ( rule__TMTCIFExportActivateDICs__Group__0 )
            // InternalEXPORT.g:427:4: rule__TMTCIFExportActivateDICs__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportActivateDICs"


    // $ANTLR start "entryRuleTMTCIFExportDIC"
    // InternalEXPORT.g:436:1: entryRuleTMTCIFExportDIC : ruleTMTCIFExportDIC EOF ;
    public final void entryRuleTMTCIFExportDIC() throws RecognitionException {
        try {
            // InternalEXPORT.g:437:1: ( ruleTMTCIFExportDIC EOF )
            // InternalEXPORT.g:438:1: ruleTMTCIFExportDIC EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFExportDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICRule()); 
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
    // $ANTLR end "entryRuleTMTCIFExportDIC"


    // $ANTLR start "ruleTMTCIFExportDIC"
    // InternalEXPORT.g:445:1: ruleTMTCIFExportDIC : ( ( rule__TMTCIFExportDIC__Group__0 ) ) ;
    public final void ruleTMTCIFExportDIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:449:2: ( ( ( rule__TMTCIFExportDIC__Group__0 ) ) )
            // InternalEXPORT.g:450:2: ( ( rule__TMTCIFExportDIC__Group__0 ) )
            {
            // InternalEXPORT.g:450:2: ( ( rule__TMTCIFExportDIC__Group__0 ) )
            // InternalEXPORT.g:451:3: ( rule__TMTCIFExportDIC__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getGroup()); 
            }
            // InternalEXPORT.g:452:3: ( rule__TMTCIFExportDIC__Group__0 )
            // InternalEXPORT.g:452:4: rule__TMTCIFExportDIC__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportDIC"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEXPORT.g:461:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEXPORT.g:462:1: ( ruleQualifiedName EOF )
            // InternalEXPORT.g:463:1: ruleQualifiedName EOF
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
    // InternalEXPORT.g:470:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:474:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEXPORT.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEXPORT.g:475:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEXPORT.g:476:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalEXPORT.g:477:3: ( rule__QualifiedName__Group__0 )
            // InternalEXPORT.g:477:4: rule__QualifiedName__Group__0
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
    // InternalEXPORT.g:486:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalEXPORT.g:487:1: ( ruleVersion EOF )
            // InternalEXPORT.g:488:1: ruleVersion EOF
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
    // InternalEXPORT.g:495:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:499:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalEXPORT.g:500:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalEXPORT.g:500:2: ( ( rule__Version__Group__0 ) )
            // InternalEXPORT.g:501:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalEXPORT.g:502:3: ( rule__Version__Group__0 )
            // InternalEXPORT.g:502:4: rule__Version__Group__0
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
    // InternalEXPORT.g:511:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalEXPORT.g:512:1: ( ruleVersionedQualifiedName EOF )
            // InternalEXPORT.g:513:1: ruleVersionedQualifiedName EOF
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
    // InternalEXPORT.g:520:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:524:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalEXPORT.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalEXPORT.g:525:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalEXPORT.g:526:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalEXPORT.g:527:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalEXPORT.g:527:4: rule__VersionedQualifiedName__Group__0
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
    // InternalEXPORT.g:536:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalEXPORT.g:537:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalEXPORT.g:538:1: ruleVersionedQualifiedReferenceName EOF
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
    // InternalEXPORT.g:545:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:549:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalEXPORT.g:550:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalEXPORT.g:550:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalEXPORT.g:551:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalEXPORT.g:552:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalEXPORT.g:552:4: rule__VersionedQualifiedReferenceName__Group__0
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
    // InternalEXPORT.g:561:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalEXPORT.g:562:1: ( ruleINTEGER EOF )
            // InternalEXPORT.g:563:1: ruleINTEGER EOF
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
    // InternalEXPORT.g:570:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:574:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalEXPORT.g:575:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalEXPORT.g:575:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalEXPORT.g:576:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalEXPORT.g:577:3: ( rule__INTEGER__Alternatives )
            // InternalEXPORT.g:577:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleTMTCIFExportUnit"
    // InternalEXPORT.g:586:1: ruleTMTCIFExportUnit : ( ( rule__TMTCIFExportUnit__Alternatives ) ) ;
    public final void ruleTMTCIFExportUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:590:1: ( ( ( rule__TMTCIFExportUnit__Alternatives ) ) )
            // InternalEXPORT.g:591:2: ( ( rule__TMTCIFExportUnit__Alternatives ) )
            {
            // InternalEXPORT.g:591:2: ( ( rule__TMTCIFExportUnit__Alternatives ) )
            // InternalEXPORT.g:592:3: ( rule__TMTCIFExportUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportUnitAccess().getAlternatives()); 
            }
            // InternalEXPORT.g:593:3: ( rule__TMTCIFExportUnit__Alternatives )
            // InternalEXPORT.g:593:4: rule__TMTCIFExportUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFExportUnit"


    // $ANTLR start "rule__TMTCIFExportExport__Alternatives_6"
    // InternalEXPORT.g:601:1: rule__TMTCIFExportExport__Alternatives_6 : ( ( 'NULL' ) | ( ( rule__TMTCIFExportExport__FromAssignment_6_1 ) ) );
    public final void rule__TMTCIFExportExport__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:605:1: ( ( 'NULL' ) | ( ( rule__TMTCIFExportExport__FromAssignment_6_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
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
                    // InternalEXPORT.g:606:2: ( 'NULL' )
                    {
                    // InternalEXPORT.g:606:2: ( 'NULL' )
                    // InternalEXPORT.g:607:3: 'NULL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportExportAccess().getNULLKeyword_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:612:2: ( ( rule__TMTCIFExportExport__FromAssignment_6_1 ) )
                    {
                    // InternalEXPORT.g:612:2: ( ( rule__TMTCIFExportExport__FromAssignment_6_1 ) )
                    // InternalEXPORT.g:613:3: ( rule__TMTCIFExportExport__FromAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportExportAccess().getFromAssignment_6_1()); 
                    }
                    // InternalEXPORT.g:614:3: ( rule__TMTCIFExportExport__FromAssignment_6_1 )
                    // InternalEXPORT.g:614:4: rule__TMTCIFExportExport__FromAssignment_6_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__FromAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportExportAccess().getFromAssignment_6_1()); 
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
    // $ANTLR end "rule__TMTCIFExportExport__Alternatives_6"


    // $ANTLR start "rule__TMTCIFExportSizes__Alternatives_3"
    // InternalEXPORT.g:622:1: rule__TMTCIFExportSizes__Alternatives_3 : ( ( ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 ) ) | ( ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 ) ) | ( ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 ) ) );
    public final void rule__TMTCIFExportSizes__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:626:1: ( ( ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 ) ) | ( ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 ) ) | ( ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
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
                    // InternalEXPORT.g:627:2: ( ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 ) )
                    {
                    // InternalEXPORT.g:627:2: ( ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 ) )
                    // InternalEXPORT.g:628:3: ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); 
                    }
                    // InternalEXPORT.g:629:3: ( rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 )
                    // InternalEXPORT.g:629:4: rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:633:2: ( ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 ) )
                    {
                    // InternalEXPORT.g:633:2: ( ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 ) )
                    // InternalEXPORT.g:634:3: ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineAssignment_3_1()); 
                    }
                    // InternalEXPORT.g:635:3: ( rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 )
                    // InternalEXPORT.g:635:4: rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEXPORT.g:639:2: ( ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 ) )
                    {
                    // InternalEXPORT.g:639:2: ( ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 ) )
                    // InternalEXPORT.g:640:3: ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsAssignment_3_2()); 
                    }
                    // InternalEXPORT.g:641:3: ( rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 )
                    // InternalEXPORT.g:641:4: rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsAssignment_3_2()); 
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
    // $ANTLR end "rule__TMTCIFExportSizes__Alternatives_3"


    // $ANTLR start "rule__TMTCIFExportSettings__Alternatives_3"
    // InternalEXPORT.g:649:1: rule__TMTCIFExportSettings__Alternatives_3 : ( ( ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 ) ) | ( ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 ) ) | ( ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 ) ) );
    public final void rule__TMTCIFExportSettings__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:653:1: ( ( ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 ) ) | ( ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 ) ) | ( ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 ) ) | ( ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 44:
                {
                alt3=4;
                }
                break;
            case 46:
                {
                alt3=5;
                }
                break;
            case 48:
                {
                alt3=6;
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
                    // InternalEXPORT.g:654:2: ( ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 ) )
                    {
                    // InternalEXPORT.g:654:2: ( ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 ) )
                    // InternalEXPORT.g:655:3: ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstAssignment_3_0()); 
                    }
                    // InternalEXPORT.g:656:3: ( rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 )
                    // InternalEXPORT.g:656:4: rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:660:2: ( ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 ) )
                    {
                    // InternalEXPORT.g:660:2: ( ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 ) )
                    // InternalEXPORT.g:661:3: ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeAssignment_3_1()); 
                    }
                    // InternalEXPORT.g:662:3: ( rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 )
                    // InternalEXPORT.g:662:4: rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEXPORT.g:666:2: ( ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 ) )
                    {
                    // InternalEXPORT.g:666:2: ( ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 ) )
                    // InternalEXPORT.g:667:3: ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileAssignment_3_2()); 
                    }
                    // InternalEXPORT.g:668:3: ( rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 )
                    // InternalEXPORT.g:668:4: rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileAssignment_3_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEXPORT.g:672:2: ( ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 ) )
                    {
                    // InternalEXPORT.g:672:2: ( ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 ) )
                    // InternalEXPORT.g:673:3: ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldAssignment_3_3()); 
                    }
                    // InternalEXPORT.g:674:3: ( rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 )
                    // InternalEXPORT.g:674:4: rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldAssignment_3_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEXPORT.g:678:2: ( ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 ) )
                    {
                    // InternalEXPORT.g:678:2: ( ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 ) )
                    // InternalEXPORT.g:679:3: ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); 
                    }
                    // InternalEXPORT.g:680:3: ( rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 )
                    // InternalEXPORT.g:680:4: rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstAssignment_3_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEXPORT.g:684:2: ( ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 ) )
                    {
                    // InternalEXPORT.g:684:2: ( ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 ) )
                    // InternalEXPORT.g:685:3: ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); 
                    }
                    // InternalEXPORT.g:686:3: ( rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 )
                    // InternalEXPORT.g:686:4: rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileAssignment_3_5()); 
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
    // $ANTLR end "rule__TMTCIFExportSettings__Alternatives_3"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalEXPORT.g:694:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:698:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==17||LA4_1==52||LA4_1==54) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEXPORT.g:699:2: ( RULE_INT )
                    {
                    // InternalEXPORT.g:699:2: ( RULE_INT )
                    // InternalEXPORT.g:700:3: RULE_INT
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
                    // InternalEXPORT.g:705:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalEXPORT.g:705:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalEXPORT.g:706:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalEXPORT.g:707:3: ( rule__Version__Group_0_1__0 )
                    // InternalEXPORT.g:707:4: rule__Version__Group_0_1__0
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
    // InternalEXPORT.g:715:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:719:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==17||LA5_1==52||LA5_1==54) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEXPORT.g:720:2: ( RULE_INT )
                    {
                    // InternalEXPORT.g:720:2: ( RULE_INT )
                    // InternalEXPORT.g:721:3: RULE_INT
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
                    // InternalEXPORT.g:726:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalEXPORT.g:726:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalEXPORT.g:727:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalEXPORT.g:728:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalEXPORT.g:728:4: rule__Version__Group_1_1_1__0
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
    // InternalEXPORT.g:736:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:740:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==56) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_HEXADECIMAL) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEXPORT.g:741:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalEXPORT.g:741:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalEXPORT.g:742:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalEXPORT.g:743:3: ( rule__INTEGER__Group_0__0 )
                    // InternalEXPORT.g:743:4: rule__INTEGER__Group_0__0
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
                    // InternalEXPORT.g:747:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalEXPORT.g:747:2: ( RULE_HEXADECIMAL )
                    // InternalEXPORT.g:748:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__TMTCIFExportUnit__Alternatives"
    // InternalEXPORT.g:757:1: rule__TMTCIFExportUnit__Alternatives : ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) );
    public final void rule__TMTCIFExportUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:761:1: ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
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
                    // InternalEXPORT.g:762:2: ( ( 'bits' ) )
                    {
                    // InternalEXPORT.g:762:2: ( ( 'bits' ) )
                    // InternalEXPORT.g:763:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }
                    // InternalEXPORT.g:764:3: ( 'bits' )
                    // InternalEXPORT.g:764:4: 'bits'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:768:2: ( ( 'bytes' ) )
                    {
                    // InternalEXPORT.g:768:2: ( ( 'bytes' ) )
                    // InternalEXPORT.g:769:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
                    }
                    // InternalEXPORT.g:770:3: ( 'bytes' )
                    // InternalEXPORT.g:770:4: 'bytes'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__TMTCIFExportUnit__Alternatives"


    // $ANTLR start "rule__TMTCIFModelFile__Group__0"
    // InternalEXPORT.g:778:1: rule__TMTCIFModelFile__Group__0 : rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 ;
    public final void rule__TMTCIFModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:782:1: ( rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 )
            // InternalEXPORT.g:783:2: rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1
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
    // InternalEXPORT.g:790:1: rule__TMTCIFModelFile__Group__0__Impl : ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__TMTCIFModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:794:1: ( ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) )
            // InternalEXPORT.g:795:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            {
            // InternalEXPORT.g:795:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            // InternalEXPORT.g:796:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalEXPORT.g:797:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEXPORT.g:797:3: rule__TMTCIFModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__TMTCIFModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalEXPORT.g:805:1: rule__TMTCIFModelFile__Group__1 : rule__TMTCIFModelFile__Group__1__Impl ;
    public final void rule__TMTCIFModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:809:1: ( rule__TMTCIFModelFile__Group__1__Impl )
            // InternalEXPORT.g:810:2: rule__TMTCIFModelFile__Group__1__Impl
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
    // InternalEXPORT.g:816:1: rule__TMTCIFModelFile__Group__1__Impl : ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) ;
    public final void rule__TMTCIFModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:820:1: ( ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) )
            // InternalEXPORT.g:821:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            {
            // InternalEXPORT.g:821:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            // InternalEXPORT.g:822:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); 
            }
            // InternalEXPORT.g:823:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            // InternalEXPORT.g:823:3: rule__TMTCIFModelFile__ElementAssignment_1
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
    // InternalEXPORT.g:832:1: rule__TMTCIFModelFileImport__Group__0 : rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 ;
    public final void rule__TMTCIFModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:836:1: ( rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 )
            // InternalEXPORT.g:837:2: rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1
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
    // InternalEXPORT.g:844:1: rule__TMTCIFModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__TMTCIFModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:848:1: ( ( 'import' ) )
            // InternalEXPORT.g:849:1: ( 'import' )
            {
            // InternalEXPORT.g:849:1: ( 'import' )
            // InternalEXPORT.g:850:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:859:1: rule__TMTCIFModelFileImport__Group__1 : rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 ;
    public final void rule__TMTCIFModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:863:1: ( rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 )
            // InternalEXPORT.g:864:2: rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2
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
    // InternalEXPORT.g:871:1: rule__TMTCIFModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:875:1: ( ( ':=' ) )
            // InternalEXPORT.g:876:1: ( ':=' )
            {
            // InternalEXPORT.g:876:1: ( ':=' )
            // InternalEXPORT.g:877:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:886:1: rule__TMTCIFModelFileImport__Group__2 : rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 ;
    public final void rule__TMTCIFModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:890:1: ( rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 )
            // InternalEXPORT.g:891:2: rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3
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
    // InternalEXPORT.g:898:1: rule__TMTCIFModelFileImport__Group__2__Impl : ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__TMTCIFModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:902:1: ( ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalEXPORT.g:903:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalEXPORT.g:903:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            // InternalEXPORT.g:904:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalEXPORT.g:905:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            // InternalEXPORT.g:905:3: rule__TMTCIFModelFileImport__ImportURIAssignment_2
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
    // InternalEXPORT.g:913:1: rule__TMTCIFModelFileImport__Group__3 : rule__TMTCIFModelFileImport__Group__3__Impl ;
    public final void rule__TMTCIFModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:917:1: ( rule__TMTCIFModelFileImport__Group__3__Impl )
            // InternalEXPORT.g:918:2: rule__TMTCIFModelFileImport__Group__3__Impl
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
    // InternalEXPORT.g:924:1: rule__TMTCIFModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:928:1: ( ( ';' ) )
            // InternalEXPORT.g:929:1: ( ';' )
            {
            // InternalEXPORT.g:929:1: ( ';' )
            // InternalEXPORT.g:930:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__TMTCIFExportExport__Group__0"
    // InternalEXPORT.g:940:1: rule__TMTCIFExportExport__Group__0 : rule__TMTCIFExportExport__Group__0__Impl rule__TMTCIFExportExport__Group__1 ;
    public final void rule__TMTCIFExportExport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:944:1: ( rule__TMTCIFExportExport__Group__0__Impl rule__TMTCIFExportExport__Group__1 )
            // InternalEXPORT.g:945:2: rule__TMTCIFExportExport__Group__0__Impl rule__TMTCIFExportExport__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportExport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__0"


    // $ANTLR start "rule__TMTCIFExportExport__Group__0__Impl"
    // InternalEXPORT.g:952:1: rule__TMTCIFExportExport__Group__0__Impl : ( 'TMTCIFExportExport' ) ;
    public final void rule__TMTCIFExportExport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:956:1: ( ( 'TMTCIFExportExport' ) )
            // InternalEXPORT.g:957:1: ( 'TMTCIFExportExport' )
            {
            // InternalEXPORT.g:957:1: ( 'TMTCIFExportExport' )
            // InternalEXPORT.g:958:2: 'TMTCIFExportExport'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getTMTCIFExportExportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__1"
    // InternalEXPORT.g:967:1: rule__TMTCIFExportExport__Group__1 : rule__TMTCIFExportExport__Group__1__Impl rule__TMTCIFExportExport__Group__2 ;
    public final void rule__TMTCIFExportExport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:971:1: ( rule__TMTCIFExportExport__Group__1__Impl rule__TMTCIFExportExport__Group__2 )
            // InternalEXPORT.g:972:2: rule__TMTCIFExportExport__Group__1__Impl rule__TMTCIFExportExport__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportExport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__1"


    // $ANTLR start "rule__TMTCIFExportExport__Group__1__Impl"
    // InternalEXPORT.g:979:1: rule__TMTCIFExportExport__Group__1__Impl : ( ( rule__TMTCIFExportExport__NameAssignment_1 ) ) ;
    public final void rule__TMTCIFExportExport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:983:1: ( ( ( rule__TMTCIFExportExport__NameAssignment_1 ) ) )
            // InternalEXPORT.g:984:1: ( ( rule__TMTCIFExportExport__NameAssignment_1 ) )
            {
            // InternalEXPORT.g:984:1: ( ( rule__TMTCIFExportExport__NameAssignment_1 ) )
            // InternalEXPORT.g:985:2: ( rule__TMTCIFExportExport__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getNameAssignment_1()); 
            }
            // InternalEXPORT.g:986:2: ( rule__TMTCIFExportExport__NameAssignment_1 )
            // InternalEXPORT.g:986:3: rule__TMTCIFExportExport__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__2"
    // InternalEXPORT.g:994:1: rule__TMTCIFExportExport__Group__2 : rule__TMTCIFExportExport__Group__2__Impl rule__TMTCIFExportExport__Group__3 ;
    public final void rule__TMTCIFExportExport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:998:1: ( rule__TMTCIFExportExport__Group__2__Impl rule__TMTCIFExportExport__Group__3 )
            // InternalEXPORT.g:999:2: rule__TMTCIFExportExport__Group__2__Impl rule__TMTCIFExportExport__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TMTCIFExportExport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__2"


    // $ANTLR start "rule__TMTCIFExportExport__Group__2__Impl"
    // InternalEXPORT.g:1006:1: rule__TMTCIFExportExport__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportExport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1010:1: ( ( '{' ) )
            // InternalEXPORT.g:1011:1: ( '{' )
            {
            // InternalEXPORT.g:1011:1: ( '{' )
            // InternalEXPORT.g:1012:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__3"
    // InternalEXPORT.g:1021:1: rule__TMTCIFExportExport__Group__3 : rule__TMTCIFExportExport__Group__3__Impl rule__TMTCIFExportExport__Group__4 ;
    public final void rule__TMTCIFExportExport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1025:1: ( rule__TMTCIFExportExport__Group__3__Impl rule__TMTCIFExportExport__Group__4 )
            // InternalEXPORT.g:1026:2: rule__TMTCIFExportExport__Group__3__Impl rule__TMTCIFExportExport__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__TMTCIFExportExport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__3"


    // $ANTLR start "rule__TMTCIFExportExport__Group__3__Impl"
    // InternalEXPORT.g:1033:1: rule__TMTCIFExportExport__Group__3__Impl : ( ( rule__TMTCIFExportExport__UnorderedGroup_3 ) ) ;
    public final void rule__TMTCIFExportExport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1037:1: ( ( ( rule__TMTCIFExportExport__UnorderedGroup_3 ) ) )
            // InternalEXPORT.g:1038:1: ( ( rule__TMTCIFExportExport__UnorderedGroup_3 ) )
            {
            // InternalEXPORT.g:1038:1: ( ( rule__TMTCIFExportExport__UnorderedGroup_3 ) )
            // InternalEXPORT.g:1039:2: ( rule__TMTCIFExportExport__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()); 
            }
            // InternalEXPORT.g:1040:2: ( rule__TMTCIFExportExport__UnorderedGroup_3 )
            // InternalEXPORT.g:1040:3: rule__TMTCIFExportExport__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__4"
    // InternalEXPORT.g:1048:1: rule__TMTCIFExportExport__Group__4 : rule__TMTCIFExportExport__Group__4__Impl rule__TMTCIFExportExport__Group__5 ;
    public final void rule__TMTCIFExportExport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1052:1: ( rule__TMTCIFExportExport__Group__4__Impl rule__TMTCIFExportExport__Group__5 )
            // InternalEXPORT.g:1053:2: rule__TMTCIFExportExport__Group__4__Impl rule__TMTCIFExportExport__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportExport__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__4"


    // $ANTLR start "rule__TMTCIFExportExport__Group__4__Impl"
    // InternalEXPORT.g:1060:1: rule__TMTCIFExportExport__Group__4__Impl : ( 'from' ) ;
    public final void rule__TMTCIFExportExport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1064:1: ( ( 'from' ) )
            // InternalEXPORT.g:1065:1: ( 'from' )
            {
            // InternalEXPORT.g:1065:1: ( 'from' )
            // InternalEXPORT.g:1066:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getFromKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__5"
    // InternalEXPORT.g:1075:1: rule__TMTCIFExportExport__Group__5 : rule__TMTCIFExportExport__Group__5__Impl rule__TMTCIFExportExport__Group__6 ;
    public final void rule__TMTCIFExportExport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1079:1: ( rule__TMTCIFExportExport__Group__5__Impl rule__TMTCIFExportExport__Group__6 )
            // InternalEXPORT.g:1080:2: rule__TMTCIFExportExport__Group__5__Impl rule__TMTCIFExportExport__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportExport__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__5"


    // $ANTLR start "rule__TMTCIFExportExport__Group__5__Impl"
    // InternalEXPORT.g:1087:1: rule__TMTCIFExportExport__Group__5__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportExport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1091:1: ( ( ':=' ) )
            // InternalEXPORT.g:1092:1: ( ':=' )
            {
            // InternalEXPORT.g:1092:1: ( ':=' )
            // InternalEXPORT.g:1093:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__6"
    // InternalEXPORT.g:1102:1: rule__TMTCIFExportExport__Group__6 : rule__TMTCIFExportExport__Group__6__Impl rule__TMTCIFExportExport__Group__7 ;
    public final void rule__TMTCIFExportExport__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1106:1: ( rule__TMTCIFExportExport__Group__6__Impl rule__TMTCIFExportExport__Group__7 )
            // InternalEXPORT.g:1107:2: rule__TMTCIFExportExport__Group__6__Impl rule__TMTCIFExportExport__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportExport__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__6"


    // $ANTLR start "rule__TMTCIFExportExport__Group__6__Impl"
    // InternalEXPORT.g:1114:1: rule__TMTCIFExportExport__Group__6__Impl : ( ( rule__TMTCIFExportExport__Alternatives_6 ) ) ;
    public final void rule__TMTCIFExportExport__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1118:1: ( ( ( rule__TMTCIFExportExport__Alternatives_6 ) ) )
            // InternalEXPORT.g:1119:1: ( ( rule__TMTCIFExportExport__Alternatives_6 ) )
            {
            // InternalEXPORT.g:1119:1: ( ( rule__TMTCIFExportExport__Alternatives_6 ) )
            // InternalEXPORT.g:1120:2: ( rule__TMTCIFExportExport__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getAlternatives_6()); 
            }
            // InternalEXPORT.g:1121:2: ( rule__TMTCIFExportExport__Alternatives_6 )
            // InternalEXPORT.g:1121:3: rule__TMTCIFExportExport__Alternatives_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__7"
    // InternalEXPORT.g:1129:1: rule__TMTCIFExportExport__Group__7 : rule__TMTCIFExportExport__Group__7__Impl rule__TMTCIFExportExport__Group__8 ;
    public final void rule__TMTCIFExportExport__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1133:1: ( rule__TMTCIFExportExport__Group__7__Impl rule__TMTCIFExportExport__Group__8 )
            // InternalEXPORT.g:1134:2: rule__TMTCIFExportExport__Group__7__Impl rule__TMTCIFExportExport__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__TMTCIFExportExport__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__7"


    // $ANTLR start "rule__TMTCIFExportExport__Group__7__Impl"
    // InternalEXPORT.g:1141:1: rule__TMTCIFExportExport__Group__7__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportExport__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1145:1: ( ( ';' ) )
            // InternalEXPORT.g:1146:1: ( ';' )
            {
            // InternalEXPORT.g:1146:1: ( ';' )
            // InternalEXPORT.g:1147:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__8"
    // InternalEXPORT.g:1156:1: rule__TMTCIFExportExport__Group__8 : rule__TMTCIFExportExport__Group__8__Impl rule__TMTCIFExportExport__Group__9 ;
    public final void rule__TMTCIFExportExport__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1160:1: ( rule__TMTCIFExportExport__Group__8__Impl rule__TMTCIFExportExport__Group__9 )
            // InternalEXPORT.g:1161:2: rule__TMTCIFExportExport__Group__8__Impl rule__TMTCIFExportExport__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportExport__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__8"


    // $ANTLR start "rule__TMTCIFExportExport__Group__8__Impl"
    // InternalEXPORT.g:1168:1: rule__TMTCIFExportExport__Group__8__Impl : ( 'to' ) ;
    public final void rule__TMTCIFExportExport__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1172:1: ( ( 'to' ) )
            // InternalEXPORT.g:1173:1: ( 'to' )
            {
            // InternalEXPORT.g:1173:1: ( 'to' )
            // InternalEXPORT.g:1174:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getToKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__9"
    // InternalEXPORT.g:1183:1: rule__TMTCIFExportExport__Group__9 : rule__TMTCIFExportExport__Group__9__Impl rule__TMTCIFExportExport__Group__10 ;
    public final void rule__TMTCIFExportExport__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1187:1: ( rule__TMTCIFExportExport__Group__9__Impl rule__TMTCIFExportExport__Group__10 )
            // InternalEXPORT.g:1188:2: rule__TMTCIFExportExport__Group__9__Impl rule__TMTCIFExportExport__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportExport__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__9"


    // $ANTLR start "rule__TMTCIFExportExport__Group__9__Impl"
    // InternalEXPORT.g:1195:1: rule__TMTCIFExportExport__Group__9__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportExport__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1199:1: ( ( ':=' ) )
            // InternalEXPORT.g:1200:1: ( ':=' )
            {
            // InternalEXPORT.g:1200:1: ( ':=' )
            // InternalEXPORT.g:1201:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__10"
    // InternalEXPORT.g:1210:1: rule__TMTCIFExportExport__Group__10 : rule__TMTCIFExportExport__Group__10__Impl rule__TMTCIFExportExport__Group__11 ;
    public final void rule__TMTCIFExportExport__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1214:1: ( rule__TMTCIFExportExport__Group__10__Impl rule__TMTCIFExportExport__Group__11 )
            // InternalEXPORT.g:1215:2: rule__TMTCIFExportExport__Group__10__Impl rule__TMTCIFExportExport__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportExport__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__10"


    // $ANTLR start "rule__TMTCIFExportExport__Group__10__Impl"
    // InternalEXPORT.g:1222:1: rule__TMTCIFExportExport__Group__10__Impl : ( ( rule__TMTCIFExportExport__ToAssignment_10 ) ) ;
    public final void rule__TMTCIFExportExport__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1226:1: ( ( ( rule__TMTCIFExportExport__ToAssignment_10 ) ) )
            // InternalEXPORT.g:1227:1: ( ( rule__TMTCIFExportExport__ToAssignment_10 ) )
            {
            // InternalEXPORT.g:1227:1: ( ( rule__TMTCIFExportExport__ToAssignment_10 ) )
            // InternalEXPORT.g:1228:2: ( rule__TMTCIFExportExport__ToAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getToAssignment_10()); 
            }
            // InternalEXPORT.g:1229:2: ( rule__TMTCIFExportExport__ToAssignment_10 )
            // InternalEXPORT.g:1229:3: rule__TMTCIFExportExport__ToAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__ToAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getToAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__11"
    // InternalEXPORT.g:1237:1: rule__TMTCIFExportExport__Group__11 : rule__TMTCIFExportExport__Group__11__Impl rule__TMTCIFExportExport__Group__12 ;
    public final void rule__TMTCIFExportExport__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1241:1: ( rule__TMTCIFExportExport__Group__11__Impl rule__TMTCIFExportExport__Group__12 )
            // InternalEXPORT.g:1242:2: rule__TMTCIFExportExport__Group__11__Impl rule__TMTCIFExportExport__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFExportExport__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__11"


    // $ANTLR start "rule__TMTCIFExportExport__Group__11__Impl"
    // InternalEXPORT.g:1249:1: rule__TMTCIFExportExport__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportExport__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1253:1: ( ( ';' ) )
            // InternalEXPORT.g:1254:1: ( ';' )
            {
            // InternalEXPORT.g:1254:1: ( ';' )
            // InternalEXPORT.g:1255:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__12"
    // InternalEXPORT.g:1264:1: rule__TMTCIFExportExport__Group__12 : rule__TMTCIFExportExport__Group__12__Impl rule__TMTCIFExportExport__Group__13 ;
    public final void rule__TMTCIFExportExport__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1268:1: ( rule__TMTCIFExportExport__Group__12__Impl rule__TMTCIFExportExport__Group__13 )
            // InternalEXPORT.g:1269:2: rule__TMTCIFExportExport__Group__12__Impl rule__TMTCIFExportExport__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFExportExport__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__12"


    // $ANTLR start "rule__TMTCIFExportExport__Group__12__Impl"
    // InternalEXPORT.g:1276:1: rule__TMTCIFExportExport__Group__12__Impl : ( ( rule__TMTCIFExportExport__SizesAssignment_12 )? ) ;
    public final void rule__TMTCIFExportExport__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1280:1: ( ( ( rule__TMTCIFExportExport__SizesAssignment_12 )? ) )
            // InternalEXPORT.g:1281:1: ( ( rule__TMTCIFExportExport__SizesAssignment_12 )? )
            {
            // InternalEXPORT.g:1281:1: ( ( rule__TMTCIFExportExport__SizesAssignment_12 )? )
            // InternalEXPORT.g:1282:2: ( rule__TMTCIFExportExport__SizesAssignment_12 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSizesAssignment_12()); 
            }
            // InternalEXPORT.g:1283:2: ( rule__TMTCIFExportExport__SizesAssignment_12 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEXPORT.g:1283:3: rule__TMTCIFExportExport__SizesAssignment_12
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__SizesAssignment_12();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSizesAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__13"
    // InternalEXPORT.g:1291:1: rule__TMTCIFExportExport__Group__13 : rule__TMTCIFExportExport__Group__13__Impl rule__TMTCIFExportExport__Group__14 ;
    public final void rule__TMTCIFExportExport__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1295:1: ( rule__TMTCIFExportExport__Group__13__Impl rule__TMTCIFExportExport__Group__14 )
            // InternalEXPORT.g:1296:2: rule__TMTCIFExportExport__Group__13__Impl rule__TMTCIFExportExport__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFExportExport__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__13"


    // $ANTLR start "rule__TMTCIFExportExport__Group__13__Impl"
    // InternalEXPORT.g:1303:1: rule__TMTCIFExportExport__Group__13__Impl : ( ( rule__TMTCIFExportExport__SettingsAssignment_13 ) ) ;
    public final void rule__TMTCIFExportExport__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1307:1: ( ( ( rule__TMTCIFExportExport__SettingsAssignment_13 ) ) )
            // InternalEXPORT.g:1308:1: ( ( rule__TMTCIFExportExport__SettingsAssignment_13 ) )
            {
            // InternalEXPORT.g:1308:1: ( ( rule__TMTCIFExportExport__SettingsAssignment_13 ) )
            // InternalEXPORT.g:1309:2: ( rule__TMTCIFExportExport__SettingsAssignment_13 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSettingsAssignment_13()); 
            }
            // InternalEXPORT.g:1310:2: ( rule__TMTCIFExportExport__SettingsAssignment_13 )
            // InternalEXPORT.g:1310:3: rule__TMTCIFExportExport__SettingsAssignment_13
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__SettingsAssignment_13();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSettingsAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__14"
    // InternalEXPORT.g:1318:1: rule__TMTCIFExportExport__Group__14 : rule__TMTCIFExportExport__Group__14__Impl rule__TMTCIFExportExport__Group__15 ;
    public final void rule__TMTCIFExportExport__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1322:1: ( rule__TMTCIFExportExport__Group__14__Impl rule__TMTCIFExportExport__Group__15 )
            // InternalEXPORT.g:1323:2: rule__TMTCIFExportExport__Group__14__Impl rule__TMTCIFExportExport__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFExportExport__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__14"


    // $ANTLR start "rule__TMTCIFExportExport__Group__14__Impl"
    // InternalEXPORT.g:1330:1: rule__TMTCIFExportExport__Group__14__Impl : ( ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )? ) ;
    public final void rule__TMTCIFExportExport__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1334:1: ( ( ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )? ) )
            // InternalEXPORT.g:1335:1: ( ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )? )
            {
            // InternalEXPORT.g:1335:1: ( ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )? )
            // InternalEXPORT.g:1336:2: ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsAssignment_14()); 
            }
            // InternalEXPORT.g:1337:2: ( rule__TMTCIFExportExport__ActivateDICsAssignment_14 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==49) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEXPORT.g:1337:3: rule__TMTCIFExportExport__ActivateDICsAssignment_14
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__ActivateDICsAssignment_14();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsAssignment_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__15"
    // InternalEXPORT.g:1345:1: rule__TMTCIFExportExport__Group__15 : rule__TMTCIFExportExport__Group__15__Impl rule__TMTCIFExportExport__Group__16 ;
    public final void rule__TMTCIFExportExport__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1349:1: ( rule__TMTCIFExportExport__Group__15__Impl rule__TMTCIFExportExport__Group__16 )
            // InternalEXPORT.g:1350:2: rule__TMTCIFExportExport__Group__15__Impl rule__TMTCIFExportExport__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportExport__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__15"


    // $ANTLR start "rule__TMTCIFExportExport__Group__15__Impl"
    // InternalEXPORT.g:1357:1: rule__TMTCIFExportExport__Group__15__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportExport__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1361:1: ( ( '}' ) )
            // InternalEXPORT.g:1362:1: ( '}' )
            {
            // InternalEXPORT.g:1362:1: ( '}' )
            // InternalEXPORT.g:1363:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getRightCurlyBracketKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group__16"
    // InternalEXPORT.g:1372:1: rule__TMTCIFExportExport__Group__16 : rule__TMTCIFExportExport__Group__16__Impl ;
    public final void rule__TMTCIFExportExport__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1376:1: ( rule__TMTCIFExportExport__Group__16__Impl )
            // InternalEXPORT.g:1377:2: rule__TMTCIFExportExport__Group__16__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__16"


    // $ANTLR start "rule__TMTCIFExportExport__Group__16__Impl"
    // InternalEXPORT.g:1383:1: rule__TMTCIFExportExport__Group__16__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportExport__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1387:1: ( ( ';' ) )
            // InternalEXPORT.g:1388:1: ( ';' )
            {
            // InternalEXPORT.g:1388:1: ( ';' )
            // InternalEXPORT.g:1389:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__0"
    // InternalEXPORT.g:1399:1: rule__TMTCIFExportExport__Group_3_0__0 : rule__TMTCIFExportExport__Group_3_0__0__Impl rule__TMTCIFExportExport__Group_3_0__1 ;
    public final void rule__TMTCIFExportExport__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1403:1: ( rule__TMTCIFExportExport__Group_3_0__0__Impl rule__TMTCIFExportExport__Group_3_0__1 )
            // InternalEXPORT.g:1404:2: rule__TMTCIFExportExport__Group_3_0__0__Impl rule__TMTCIFExportExport__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportExport__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__0"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__0__Impl"
    // InternalEXPORT.g:1411:1: rule__TMTCIFExportExport__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__TMTCIFExportExport__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1415:1: ( ( 'uri' ) )
            // InternalEXPORT.g:1416:1: ( 'uri' )
            {
            // InternalEXPORT.g:1416:1: ( 'uri' )
            // InternalEXPORT.g:1417:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__0__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__1"
    // InternalEXPORT.g:1426:1: rule__TMTCIFExportExport__Group_3_0__1 : rule__TMTCIFExportExport__Group_3_0__1__Impl rule__TMTCIFExportExport__Group_3_0__2 ;
    public final void rule__TMTCIFExportExport__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1430:1: ( rule__TMTCIFExportExport__Group_3_0__1__Impl rule__TMTCIFExportExport__Group_3_0__2 )
            // InternalEXPORT.g:1431:2: rule__TMTCIFExportExport__Group_3_0__1__Impl rule__TMTCIFExportExport__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportExport__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__1"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__1__Impl"
    // InternalEXPORT.g:1438:1: rule__TMTCIFExportExport__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportExport__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1442:1: ( ( ':=' ) )
            // InternalEXPORT.g:1443:1: ( ':=' )
            {
            // InternalEXPORT.g:1443:1: ( ':=' )
            // InternalEXPORT.g:1444:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__1__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__2"
    // InternalEXPORT.g:1453:1: rule__TMTCIFExportExport__Group_3_0__2 : rule__TMTCIFExportExport__Group_3_0__2__Impl rule__TMTCIFExportExport__Group_3_0__3 ;
    public final void rule__TMTCIFExportExport__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1457:1: ( rule__TMTCIFExportExport__Group_3_0__2__Impl rule__TMTCIFExportExport__Group_3_0__3 )
            // InternalEXPORT.g:1458:2: rule__TMTCIFExportExport__Group_3_0__2__Impl rule__TMTCIFExportExport__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportExport__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__2"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__2__Impl"
    // InternalEXPORT.g:1465:1: rule__TMTCIFExportExport__Group_3_0__2__Impl : ( ( rule__TMTCIFExportExport__UriAssignment_3_0_2 ) ) ;
    public final void rule__TMTCIFExportExport__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1469:1: ( ( ( rule__TMTCIFExportExport__UriAssignment_3_0_2 ) ) )
            // InternalEXPORT.g:1470:1: ( ( rule__TMTCIFExportExport__UriAssignment_3_0_2 ) )
            {
            // InternalEXPORT.g:1470:1: ( ( rule__TMTCIFExportExport__UriAssignment_3_0_2 ) )
            // InternalEXPORT.g:1471:2: ( rule__TMTCIFExportExport__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getUriAssignment_3_0_2()); 
            }
            // InternalEXPORT.g:1472:2: ( rule__TMTCIFExportExport__UriAssignment_3_0_2 )
            // InternalEXPORT.g:1472:3: rule__TMTCIFExportExport__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__2__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__3"
    // InternalEXPORT.g:1480:1: rule__TMTCIFExportExport__Group_3_0__3 : rule__TMTCIFExportExport__Group_3_0__3__Impl ;
    public final void rule__TMTCIFExportExport__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1484:1: ( rule__TMTCIFExportExport__Group_3_0__3__Impl )
            // InternalEXPORT.g:1485:2: rule__TMTCIFExportExport__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__3"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_0__3__Impl"
    // InternalEXPORT.g:1491:1: rule__TMTCIFExportExport__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportExport__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1495:1: ( ( ';' ) )
            // InternalEXPORT.g:1496:1: ( ';' )
            {
            // InternalEXPORT.g:1496:1: ( ';' )
            // InternalEXPORT.g:1497:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_0__3__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__0"
    // InternalEXPORT.g:1507:1: rule__TMTCIFExportExport__Group_3_1__0 : rule__TMTCIFExportExport__Group_3_1__0__Impl rule__TMTCIFExportExport__Group_3_1__1 ;
    public final void rule__TMTCIFExportExport__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1511:1: ( rule__TMTCIFExportExport__Group_3_1__0__Impl rule__TMTCIFExportExport__Group_3_1__1 )
            // InternalEXPORT.g:1512:2: rule__TMTCIFExportExport__Group_3_1__0__Impl rule__TMTCIFExportExport__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportExport__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__0"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__0__Impl"
    // InternalEXPORT.g:1519:1: rule__TMTCIFExportExport__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__TMTCIFExportExport__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1523:1: ( ( 'version' ) )
            // InternalEXPORT.g:1524:1: ( 'version' )
            {
            // InternalEXPORT.g:1524:1: ( 'version' )
            // InternalEXPORT.g:1525:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__0__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__1"
    // InternalEXPORT.g:1534:1: rule__TMTCIFExportExport__Group_3_1__1 : rule__TMTCIFExportExport__Group_3_1__1__Impl rule__TMTCIFExportExport__Group_3_1__2 ;
    public final void rule__TMTCIFExportExport__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1538:1: ( rule__TMTCIFExportExport__Group_3_1__1__Impl rule__TMTCIFExportExport__Group_3_1__2 )
            // InternalEXPORT.g:1539:2: rule__TMTCIFExportExport__Group_3_1__1__Impl rule__TMTCIFExportExport__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__TMTCIFExportExport__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__1"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__1__Impl"
    // InternalEXPORT.g:1546:1: rule__TMTCIFExportExport__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportExport__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1550:1: ( ( ':=' ) )
            // InternalEXPORT.g:1551:1: ( ':=' )
            {
            // InternalEXPORT.g:1551:1: ( ':=' )
            // InternalEXPORT.g:1552:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__1__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__2"
    // InternalEXPORT.g:1561:1: rule__TMTCIFExportExport__Group_3_1__2 : rule__TMTCIFExportExport__Group_3_1__2__Impl rule__TMTCIFExportExport__Group_3_1__3 ;
    public final void rule__TMTCIFExportExport__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1565:1: ( rule__TMTCIFExportExport__Group_3_1__2__Impl rule__TMTCIFExportExport__Group_3_1__3 )
            // InternalEXPORT.g:1566:2: rule__TMTCIFExportExport__Group_3_1__2__Impl rule__TMTCIFExportExport__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportExport__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__2"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__2__Impl"
    // InternalEXPORT.g:1573:1: rule__TMTCIFExportExport__Group_3_1__2__Impl : ( ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 ) ) ;
    public final void rule__TMTCIFExportExport__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1577:1: ( ( ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 ) ) )
            // InternalEXPORT.g:1578:1: ( ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 ) )
            {
            // InternalEXPORT.g:1578:1: ( ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 ) )
            // InternalEXPORT.g:1579:2: ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalEXPORT.g:1580:2: ( rule__TMTCIFExportExport__VersionAssignment_3_1_2 )
            // InternalEXPORT.g:1580:3: rule__TMTCIFExportExport__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__2__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__3"
    // InternalEXPORT.g:1588:1: rule__TMTCIFExportExport__Group_3_1__3 : rule__TMTCIFExportExport__Group_3_1__3__Impl ;
    public final void rule__TMTCIFExportExport__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1592:1: ( rule__TMTCIFExportExport__Group_3_1__3__Impl )
            // InternalEXPORT.g:1593:2: rule__TMTCIFExportExport__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__3"


    // $ANTLR start "rule__TMTCIFExportExport__Group_3_1__3__Impl"
    // InternalEXPORT.g:1599:1: rule__TMTCIFExportExport__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportExport__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1603:1: ( ( ';' ) )
            // InternalEXPORT.g:1604:1: ( ';' )
            {
            // InternalEXPORT.g:1604:1: ( ';' )
            // InternalEXPORT.g:1605:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__Group_3_1__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__0"
    // InternalEXPORT.g:1615:1: rule__TMTCIFExportSizes__Group__0 : rule__TMTCIFExportSizes__Group__0__Impl rule__TMTCIFExportSizes__Group__1 ;
    public final void rule__TMTCIFExportSizes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1619:1: ( rule__TMTCIFExportSizes__Group__0__Impl rule__TMTCIFExportSizes__Group__1 )
            // InternalEXPORT.g:1620:2: rule__TMTCIFExportSizes__Group__0__Impl rule__TMTCIFExportSizes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFExportSizes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__0"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__0__Impl"
    // InternalEXPORT.g:1627:1: rule__TMTCIFExportSizes__Group__0__Impl : ( () ) ;
    public final void rule__TMTCIFExportSizes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1631:1: ( ( () ) )
            // InternalEXPORT.g:1632:1: ( () )
            {
            // InternalEXPORT.g:1632:1: ( () )
            // InternalEXPORT.g:1633:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0()); 
            }
            // InternalEXPORT.g:1634:2: ()
            // InternalEXPORT.g:1634:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__1"
    // InternalEXPORT.g:1642:1: rule__TMTCIFExportSizes__Group__1 : rule__TMTCIFExportSizes__Group__1__Impl rule__TMTCIFExportSizes__Group__2 ;
    public final void rule__TMTCIFExportSizes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1646:1: ( rule__TMTCIFExportSizes__Group__1__Impl rule__TMTCIFExportSizes__Group__2 )
            // InternalEXPORT.g:1647:2: rule__TMTCIFExportSizes__Group__1__Impl rule__TMTCIFExportSizes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSizes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__1"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__1__Impl"
    // InternalEXPORT.g:1654:1: rule__TMTCIFExportSizes__Group__1__Impl : ( 'TMTCIFExportSizes' ) ;
    public final void rule__TMTCIFExportSizes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1658:1: ( ( 'TMTCIFExportSizes' ) )
            // InternalEXPORT.g:1659:1: ( 'TMTCIFExportSizes' )
            {
            // InternalEXPORT.g:1659:1: ( 'TMTCIFExportSizes' )
            // InternalEXPORT.g:1660:2: 'TMTCIFExportSizes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getTMTCIFExportSizesKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__2"
    // InternalEXPORT.g:1669:1: rule__TMTCIFExportSizes__Group__2 : rule__TMTCIFExportSizes__Group__2__Impl rule__TMTCIFExportSizes__Group__3 ;
    public final void rule__TMTCIFExportSizes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1673:1: ( rule__TMTCIFExportSizes__Group__2__Impl rule__TMTCIFExportSizes__Group__3 )
            // InternalEXPORT.g:1674:2: rule__TMTCIFExportSizes__Group__2__Impl rule__TMTCIFExportSizes__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TMTCIFExportSizes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__2"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__2__Impl"
    // InternalEXPORT.g:1681:1: rule__TMTCIFExportSizes__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSizes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1685:1: ( ( '{' ) )
            // InternalEXPORT.g:1686:1: ( '{' )
            {
            // InternalEXPORT.g:1686:1: ( '{' )
            // InternalEXPORT.g:1687:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__3"
    // InternalEXPORT.g:1696:1: rule__TMTCIFExportSizes__Group__3 : rule__TMTCIFExportSizes__Group__3__Impl rule__TMTCIFExportSizes__Group__4 ;
    public final void rule__TMTCIFExportSizes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1700:1: ( rule__TMTCIFExportSizes__Group__3__Impl rule__TMTCIFExportSizes__Group__4 )
            // InternalEXPORT.g:1701:2: rule__TMTCIFExportSizes__Group__3__Impl rule__TMTCIFExportSizes__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportSizes__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__3"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__3__Impl"
    // InternalEXPORT.g:1708:1: rule__TMTCIFExportSizes__Group__3__Impl : ( ( ( rule__TMTCIFExportSizes__Alternatives_3 ) ) ( ( rule__TMTCIFExportSizes__Alternatives_3 )* ) ) ;
    public final void rule__TMTCIFExportSizes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1712:1: ( ( ( ( rule__TMTCIFExportSizes__Alternatives_3 ) ) ( ( rule__TMTCIFExportSizes__Alternatives_3 )* ) ) )
            // InternalEXPORT.g:1713:1: ( ( ( rule__TMTCIFExportSizes__Alternatives_3 ) ) ( ( rule__TMTCIFExportSizes__Alternatives_3 )* ) )
            {
            // InternalEXPORT.g:1713:1: ( ( ( rule__TMTCIFExportSizes__Alternatives_3 ) ) ( ( rule__TMTCIFExportSizes__Alternatives_3 )* ) )
            // InternalEXPORT.g:1714:2: ( ( rule__TMTCIFExportSizes__Alternatives_3 ) ) ( ( rule__TMTCIFExportSizes__Alternatives_3 )* )
            {
            // InternalEXPORT.g:1714:2: ( ( rule__TMTCIFExportSizes__Alternatives_3 ) )
            // InternalEXPORT.g:1715:3: ( rule__TMTCIFExportSizes__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); 
            }
            // InternalEXPORT.g:1716:3: ( rule__TMTCIFExportSizes__Alternatives_3 )
            // InternalEXPORT.g:1716:4: rule__TMTCIFExportSizes__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFExportSizes__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); 
            }

            }

            // InternalEXPORT.g:1719:2: ( ( rule__TMTCIFExportSizes__Alternatives_3 )* )
            // InternalEXPORT.g:1720:3: ( rule__TMTCIFExportSizes__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); 
            }
            // InternalEXPORT.g:1721:3: ( rule__TMTCIFExportSizes__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26||LA11_0==31||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEXPORT.g:1721:4: rule__TMTCIFExportSizes__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    rule__TMTCIFExportSizes__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__TMTCIFExportSizes__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__4"
    // InternalEXPORT.g:1730:1: rule__TMTCIFExportSizes__Group__4 : rule__TMTCIFExportSizes__Group__4__Impl rule__TMTCIFExportSizes__Group__5 ;
    public final void rule__TMTCIFExportSizes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1734:1: ( rule__TMTCIFExportSizes__Group__4__Impl rule__TMTCIFExportSizes__Group__5 )
            // InternalEXPORT.g:1735:2: rule__TMTCIFExportSizes__Group__4__Impl rule__TMTCIFExportSizes__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizes__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__4"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__4__Impl"
    // InternalEXPORT.g:1742:1: rule__TMTCIFExportSizes__Group__4__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSizes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1746:1: ( ( '}' ) )
            // InternalEXPORT.g:1747:1: ( '}' )
            {
            // InternalEXPORT.g:1747:1: ( '}' )
            // InternalEXPORT.g:1748:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__5"
    // InternalEXPORT.g:1757:1: rule__TMTCIFExportSizes__Group__5 : rule__TMTCIFExportSizes__Group__5__Impl ;
    public final void rule__TMTCIFExportSizes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1761:1: ( rule__TMTCIFExportSizes__Group__5__Impl )
            // InternalEXPORT.g:1762:2: rule__TMTCIFExportSizes__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizes__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__5"


    // $ANTLR start "rule__TMTCIFExportSizes__Group__5__Impl"
    // InternalEXPORT.g:1768:1: rule__TMTCIFExportSizes__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1772:1: ( ( ';' ) )
            // InternalEXPORT.g:1773:1: ( ';' )
            {
            // InternalEXPORT.g:1773:1: ( ';' )
            // InternalEXPORT.g:1774:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__0"
    // InternalEXPORT.g:1784:1: rule__TMTCIFExportSizeFromFileLength__Group__0 : rule__TMTCIFExportSizeFromFileLength__Group__0__Impl rule__TMTCIFExportSizeFromFileLength__Group__1 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1788:1: ( rule__TMTCIFExportSizeFromFileLength__Group__0__Impl rule__TMTCIFExportSizeFromFileLength__Group__1 )
            // InternalEXPORT.g:1789:2: rule__TMTCIFExportSizeFromFileLength__Group__0__Impl rule__TMTCIFExportSizeFromFileLength__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSizeFromFileLength__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__0__Impl"
    // InternalEXPORT.g:1796:1: rule__TMTCIFExportSizeFromFileLength__Group__0__Impl : ( 'TMTCIFExportSizeFromFileLength' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1800:1: ( ( 'TMTCIFExportSizeFromFileLength' ) )
            // InternalEXPORT.g:1801:1: ( 'TMTCIFExportSizeFromFileLength' )
            {
            // InternalEXPORT.g:1801:1: ( 'TMTCIFExportSizeFromFileLength' )
            // InternalEXPORT.g:1802:2: 'TMTCIFExportSizeFromFileLength'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getTMTCIFExportSizeFromFileLengthKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__1"
    // InternalEXPORT.g:1811:1: rule__TMTCIFExportSizeFromFileLength__Group__1 : rule__TMTCIFExportSizeFromFileLength__Group__1__Impl rule__TMTCIFExportSizeFromFileLength__Group__2 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1815:1: ( rule__TMTCIFExportSizeFromFileLength__Group__1__Impl rule__TMTCIFExportSizeFromFileLength__Group__2 )
            // InternalEXPORT.g:1816:2: rule__TMTCIFExportSizeFromFileLength__Group__1__Impl rule__TMTCIFExportSizeFromFileLength__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFExportSizeFromFileLength__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__1__Impl"
    // InternalEXPORT.g:1823:1: rule__TMTCIFExportSizeFromFileLength__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1827:1: ( ( '{' ) )
            // InternalEXPORT.g:1828:1: ( '{' )
            {
            // InternalEXPORT.g:1828:1: ( '{' )
            // InternalEXPORT.g:1829:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__2"
    // InternalEXPORT.g:1838:1: rule__TMTCIFExportSizeFromFileLength__Group__2 : rule__TMTCIFExportSizeFromFileLength__Group__2__Impl rule__TMTCIFExportSizeFromFileLength__Group__3 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1842:1: ( rule__TMTCIFExportSizeFromFileLength__Group__2__Impl rule__TMTCIFExportSizeFromFileLength__Group__3 )
            // InternalEXPORT.g:1843:2: rule__TMTCIFExportSizeFromFileLength__Group__2__Impl rule__TMTCIFExportSizeFromFileLength__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLength__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__2__Impl"
    // InternalEXPORT.g:1850:1: rule__TMTCIFExportSizeFromFileLength__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1854:1: ( ( 'id' ) )
            // InternalEXPORT.g:1855:1: ( 'id' )
            {
            // InternalEXPORT.g:1855:1: ( 'id' )
            // InternalEXPORT.g:1856:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__3"
    // InternalEXPORT.g:1865:1: rule__TMTCIFExportSizeFromFileLength__Group__3 : rule__TMTCIFExportSizeFromFileLength__Group__3__Impl rule__TMTCIFExportSizeFromFileLength__Group__4 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1869:1: ( rule__TMTCIFExportSizeFromFileLength__Group__3__Impl rule__TMTCIFExportSizeFromFileLength__Group__4 )
            // InternalEXPORT.g:1870:2: rule__TMTCIFExportSizeFromFileLength__Group__3__Impl rule__TMTCIFExportSizeFromFileLength__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeFromFileLength__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__3__Impl"
    // InternalEXPORT.g:1877:1: rule__TMTCIFExportSizeFromFileLength__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1881:1: ( ( ':=' ) )
            // InternalEXPORT.g:1882:1: ( ':=' )
            {
            // InternalEXPORT.g:1882:1: ( ':=' )
            // InternalEXPORT.g:1883:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__4"
    // InternalEXPORT.g:1892:1: rule__TMTCIFExportSizeFromFileLength__Group__4 : rule__TMTCIFExportSizeFromFileLength__Group__4__Impl rule__TMTCIFExportSizeFromFileLength__Group__5 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1896:1: ( rule__TMTCIFExportSizeFromFileLength__Group__4__Impl rule__TMTCIFExportSizeFromFileLength__Group__5 )
            // InternalEXPORT.g:1897:2: rule__TMTCIFExportSizeFromFileLength__Group__4__Impl rule__TMTCIFExportSizeFromFileLength__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLength__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__4"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__4__Impl"
    // InternalEXPORT.g:1904:1: rule__TMTCIFExportSizeFromFileLength__Group__4__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1908:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 ) ) )
            // InternalEXPORT.g:1909:1: ( ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 ) )
            {
            // InternalEXPORT.g:1909:1: ( ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 ) )
            // InternalEXPORT.g:1910:2: ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdAssignment_4()); 
            }
            // InternalEXPORT.g:1911:2: ( rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 )
            // InternalEXPORT.g:1911:3: rule__TMTCIFExportSizeFromFileLength__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__5"
    // InternalEXPORT.g:1919:1: rule__TMTCIFExportSizeFromFileLength__Group__5 : rule__TMTCIFExportSizeFromFileLength__Group__5__Impl rule__TMTCIFExportSizeFromFileLength__Group__6 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1923:1: ( rule__TMTCIFExportSizeFromFileLength__Group__5__Impl rule__TMTCIFExportSizeFromFileLength__Group__6 )
            // InternalEXPORT.g:1924:2: rule__TMTCIFExportSizeFromFileLength__Group__5__Impl rule__TMTCIFExportSizeFromFileLength__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFExportSizeFromFileLength__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__5"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__5__Impl"
    // InternalEXPORT.g:1931:1: rule__TMTCIFExportSizeFromFileLength__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1935:1: ( ( ';' ) )
            // InternalEXPORT.g:1936:1: ( ';' )
            {
            // InternalEXPORT.g:1936:1: ( ';' )
            // InternalEXPORT.g:1937:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__6"
    // InternalEXPORT.g:1946:1: rule__TMTCIFExportSizeFromFileLength__Group__6 : rule__TMTCIFExportSizeFromFileLength__Group__6__Impl rule__TMTCIFExportSizeFromFileLength__Group__7 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1950:1: ( rule__TMTCIFExportSizeFromFileLength__Group__6__Impl rule__TMTCIFExportSizeFromFileLength__Group__7 )
            // InternalEXPORT.g:1951:2: rule__TMTCIFExportSizeFromFileLength__Group__6__Impl rule__TMTCIFExportSizeFromFileLength__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLength__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__6"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__6__Impl"
    // InternalEXPORT.g:1958:1: rule__TMTCIFExportSizeFromFileLength__Group__6__Impl : ( 'fromFile' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1962:1: ( ( 'fromFile' ) )
            // InternalEXPORT.g:1963:1: ( 'fromFile' )
            {
            // InternalEXPORT.g:1963:1: ( 'fromFile' )
            // InternalEXPORT.g:1964:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__7"
    // InternalEXPORT.g:1973:1: rule__TMTCIFExportSizeFromFileLength__Group__7 : rule__TMTCIFExportSizeFromFileLength__Group__7__Impl rule__TMTCIFExportSizeFromFileLength__Group__8 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1977:1: ( rule__TMTCIFExportSizeFromFileLength__Group__7__Impl rule__TMTCIFExportSizeFromFileLength__Group__8 )
            // InternalEXPORT.g:1978:2: rule__TMTCIFExportSizeFromFileLength__Group__7__Impl rule__TMTCIFExportSizeFromFileLength__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportSizeFromFileLength__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__7"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__7__Impl"
    // InternalEXPORT.g:1985:1: rule__TMTCIFExportSizeFromFileLength__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:1989:1: ( ( ':=' ) )
            // InternalEXPORT.g:1990:1: ( ':=' )
            {
            // InternalEXPORT.g:1990:1: ( ':=' )
            // InternalEXPORT.g:1991:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__8"
    // InternalEXPORT.g:2000:1: rule__TMTCIFExportSizeFromFileLength__Group__8 : rule__TMTCIFExportSizeFromFileLength__Group__8__Impl rule__TMTCIFExportSizeFromFileLength__Group__9 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2004:1: ( rule__TMTCIFExportSizeFromFileLength__Group__8__Impl rule__TMTCIFExportSizeFromFileLength__Group__9 )
            // InternalEXPORT.g:2005:2: rule__TMTCIFExportSizeFromFileLength__Group__8__Impl rule__TMTCIFExportSizeFromFileLength__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLength__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__8"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__8__Impl"
    // InternalEXPORT.g:2012:1: rule__TMTCIFExportSizeFromFileLength__Group__8__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2016:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 ) ) )
            // InternalEXPORT.g:2017:1: ( ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 ) )
            {
            // InternalEXPORT.g:2017:1: ( ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 ) )
            // InternalEXPORT.g:2018:2: ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileAssignment_8()); 
            }
            // InternalEXPORT.g:2019:2: ( rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 )
            // InternalEXPORT.g:2019:3: rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__9"
    // InternalEXPORT.g:2027:1: rule__TMTCIFExportSizeFromFileLength__Group__9 : rule__TMTCIFExportSizeFromFileLength__Group__9__Impl rule__TMTCIFExportSizeFromFileLength__Group__10 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2031:1: ( rule__TMTCIFExportSizeFromFileLength__Group__9__Impl rule__TMTCIFExportSizeFromFileLength__Group__10 )
            // InternalEXPORT.g:2032:2: rule__TMTCIFExportSizeFromFileLength__Group__9__Impl rule__TMTCIFExportSizeFromFileLength__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLength__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__9"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__9__Impl"
    // InternalEXPORT.g:2039:1: rule__TMTCIFExportSizeFromFileLength__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2043:1: ( ( ';' ) )
            // InternalEXPORT.g:2044:1: ( ';' )
            {
            // InternalEXPORT.g:2044:1: ( ';' )
            // InternalEXPORT.g:2045:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__10"
    // InternalEXPORT.g:2054:1: rule__TMTCIFExportSizeFromFileLength__Group__10 : rule__TMTCIFExportSizeFromFileLength__Group__10__Impl rule__TMTCIFExportSizeFromFileLength__Group__11 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2058:1: ( rule__TMTCIFExportSizeFromFileLength__Group__10__Impl rule__TMTCIFExportSizeFromFileLength__Group__11 )
            // InternalEXPORT.g:2059:2: rule__TMTCIFExportSizeFromFileLength__Group__10__Impl rule__TMTCIFExportSizeFromFileLength__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLength__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__10"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__10__Impl"
    // InternalEXPORT.g:2066:1: rule__TMTCIFExportSizeFromFileLength__Group__10__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )? ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2070:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )? ) )
            // InternalEXPORT.g:2071:1: ( ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )? )
            {
            // InternalEXPORT.g:2071:1: ( ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )? )
            // InternalEXPORT.g:2072:2: ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_10()); 
            }
            // InternalEXPORT.g:2073:2: ( rule__TMTCIFExportSizeFromFileLength__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEXPORT.g:2073:3: rule__TMTCIFExportSizeFromFileLength__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeFromFileLength__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__11"
    // InternalEXPORT.g:2081:1: rule__TMTCIFExportSizeFromFileLength__Group__11 : rule__TMTCIFExportSizeFromFileLength__Group__11__Impl rule__TMTCIFExportSizeFromFileLength__Group__12 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2085:1: ( rule__TMTCIFExportSizeFromFileLength__Group__11__Impl rule__TMTCIFExportSizeFromFileLength__Group__12 )
            // InternalEXPORT.g:2086:2: rule__TMTCIFExportSizeFromFileLength__Group__11__Impl rule__TMTCIFExportSizeFromFileLength__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLength__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__11"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__11__Impl"
    // InternalEXPORT.g:2093:1: rule__TMTCIFExportSizeFromFileLength__Group__11__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )? ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2097:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )? ) )
            // InternalEXPORT.g:2098:1: ( ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )? )
            {
            // InternalEXPORT.g:2098:1: ( ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )? )
            // InternalEXPORT.g:2099:2: ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_11()); 
            }
            // InternalEXPORT.g:2100:2: ( rule__TMTCIFExportSizeFromFileLength__Group_11__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEXPORT.g:2100:3: rule__TMTCIFExportSizeFromFileLength__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeFromFileLength__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__12"
    // InternalEXPORT.g:2108:1: rule__TMTCIFExportSizeFromFileLength__Group__12 : rule__TMTCIFExportSizeFromFileLength__Group__12__Impl rule__TMTCIFExportSizeFromFileLength__Group__13 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2112:1: ( rule__TMTCIFExportSizeFromFileLength__Group__12__Impl rule__TMTCIFExportSizeFromFileLength__Group__13 )
            // InternalEXPORT.g:2113:2: rule__TMTCIFExportSizeFromFileLength__Group__12__Impl rule__TMTCIFExportSizeFromFileLength__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLength__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__12"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__12__Impl"
    // InternalEXPORT.g:2120:1: rule__TMTCIFExportSizeFromFileLength__Group__12__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2124:1: ( ( '}' ) )
            // InternalEXPORT.g:2125:1: ( '}' )
            {
            // InternalEXPORT.g:2125:1: ( '}' )
            // InternalEXPORT.g:2126:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__13"
    // InternalEXPORT.g:2135:1: rule__TMTCIFExportSizeFromFileLength__Group__13 : rule__TMTCIFExportSizeFromFileLength__Group__13__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2139:1: ( rule__TMTCIFExportSizeFromFileLength__Group__13__Impl )
            // InternalEXPORT.g:2140:2: rule__TMTCIFExportSizeFromFileLength__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__13"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group__13__Impl"
    // InternalEXPORT.g:2146:1: rule__TMTCIFExportSizeFromFileLength__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2150:1: ( ( ';' ) )
            // InternalEXPORT.g:2151:1: ( ';' )
            {
            // InternalEXPORT.g:2151:1: ( ';' )
            // InternalEXPORT.g:2152:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__0"
    // InternalEXPORT.g:2162:1: rule__TMTCIFExportSizeFromFileLength__Group_10__0 : rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__1 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2166:1: ( rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__1 )
            // InternalEXPORT.g:2167:2: rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl"
    // InternalEXPORT.g:2174:1: rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl : ( 'addSize' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2178:1: ( ( 'addSize' ) )
            // InternalEXPORT.g:2179:1: ( 'addSize' )
            {
            // InternalEXPORT.g:2179:1: ( 'addSize' )
            // InternalEXPORT.g:2180:2: 'addSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__1"
    // InternalEXPORT.g:2189:1: rule__TMTCIFExportSizeFromFileLength__Group_10__1 : rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__2 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2193:1: ( rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__2 )
            // InternalEXPORT.g:2194:2: rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl"
    // InternalEXPORT.g:2201:1: rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2205:1: ( ( ':=' ) )
            // InternalEXPORT.g:2206:1: ( ':=' )
            {
            // InternalEXPORT.g:2206:1: ( ':=' )
            // InternalEXPORT.g:2207:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__2"
    // InternalEXPORT.g:2216:1: rule__TMTCIFExportSizeFromFileLength__Group_10__2 : rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__3 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2220:1: ( rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__3 )
            // InternalEXPORT.g:2221:2: rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl"
    // InternalEXPORT.g:2228:1: rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2232:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 ) ) )
            // InternalEXPORT.g:2233:1: ( ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 ) )
            {
            // InternalEXPORT.g:2233:1: ( ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 ) )
            // InternalEXPORT.g:2234:2: ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); 
            }
            // InternalEXPORT.g:2235:2: ( rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 )
            // InternalEXPORT.g:2235:3: rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__3"
    // InternalEXPORT.g:2243:1: rule__TMTCIFExportSizeFromFileLength__Group_10__3 : rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2247:1: ( rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl )
            // InternalEXPORT.g:2248:2: rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl"
    // InternalEXPORT.g:2254:1: rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2258:1: ( ( ';' ) )
            // InternalEXPORT.g:2259:1: ( ';' )
            {
            // InternalEXPORT.g:2259:1: ( ';' )
            // InternalEXPORT.g:2260:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__0"
    // InternalEXPORT.g:2270:1: rule__TMTCIFExportSizeFromFileLength__Group_11__0 : rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__1 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2274:1: ( rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__1 )
            // InternalEXPORT.g:2275:2: rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl"
    // InternalEXPORT.g:2282:1: rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl : ( 'unit' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2286:1: ( ( 'unit' ) )
            // InternalEXPORT.g:2287:1: ( 'unit' )
            {
            // InternalEXPORT.g:2287:1: ( 'unit' )
            // InternalEXPORT.g:2288:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__1"
    // InternalEXPORT.g:2297:1: rule__TMTCIFExportSizeFromFileLength__Group_11__1 : rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__2 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2301:1: ( rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__2 )
            // InternalEXPORT.g:2302:2: rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl"
    // InternalEXPORT.g:2309:1: rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2313:1: ( ( ':=' ) )
            // InternalEXPORT.g:2314:1: ( ':=' )
            {
            // InternalEXPORT.g:2314:1: ( ':=' )
            // InternalEXPORT.g:2315:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__2"
    // InternalEXPORT.g:2324:1: rule__TMTCIFExportSizeFromFileLength__Group_11__2 : rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__3 ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2328:1: ( rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__3 )
            // InternalEXPORT.g:2329:2: rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl rule__TMTCIFExportSizeFromFileLength__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl"
    // InternalEXPORT.g:2336:1: rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl : ( ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2340:1: ( ( ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 ) ) )
            // InternalEXPORT.g:2341:1: ( ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 ) )
            {
            // InternalEXPORT.g:2341:1: ( ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 ) )
            // InternalEXPORT.g:2342:2: ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); 
            }
            // InternalEXPORT.g:2343:2: ( rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 )
            // InternalEXPORT.g:2343:3: rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__3"
    // InternalEXPORT.g:2351:1: rule__TMTCIFExportSizeFromFileLength__Group_11__3 : rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2355:1: ( rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl )
            // InternalEXPORT.g:2356:2: rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl"
    // InternalEXPORT.g:2362:1: rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2366:1: ( ( ';' ) )
            // InternalEXPORT.g:2367:1: ( ';' )
            {
            // InternalEXPORT.g:2367:1: ( ';' )
            // InternalEXPORT.g:2368:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__Group_11__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__0"
    // InternalEXPORT.g:2378:1: rule__TMTCIFExportSizeFromFileLine__Group__0 : rule__TMTCIFExportSizeFromFileLine__Group__0__Impl rule__TMTCIFExportSizeFromFileLine__Group__1 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2382:1: ( rule__TMTCIFExportSizeFromFileLine__Group__0__Impl rule__TMTCIFExportSizeFromFileLine__Group__1 )
            // InternalEXPORT.g:2383:2: rule__TMTCIFExportSizeFromFileLine__Group__0__Impl rule__TMTCIFExportSizeFromFileLine__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSizeFromFileLine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__0__Impl"
    // InternalEXPORT.g:2390:1: rule__TMTCIFExportSizeFromFileLine__Group__0__Impl : ( 'TMTCIFExportSizeFromFileLine' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2394:1: ( ( 'TMTCIFExportSizeFromFileLine' ) )
            // InternalEXPORT.g:2395:1: ( 'TMTCIFExportSizeFromFileLine' )
            {
            // InternalEXPORT.g:2395:1: ( 'TMTCIFExportSizeFromFileLine' )
            // InternalEXPORT.g:2396:2: 'TMTCIFExportSizeFromFileLine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getTMTCIFExportSizeFromFileLineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__1"
    // InternalEXPORT.g:2405:1: rule__TMTCIFExportSizeFromFileLine__Group__1 : rule__TMTCIFExportSizeFromFileLine__Group__1__Impl rule__TMTCIFExportSizeFromFileLine__Group__2 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2409:1: ( rule__TMTCIFExportSizeFromFileLine__Group__1__Impl rule__TMTCIFExportSizeFromFileLine__Group__2 )
            // InternalEXPORT.g:2410:2: rule__TMTCIFExportSizeFromFileLine__Group__1__Impl rule__TMTCIFExportSizeFromFileLine__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFExportSizeFromFileLine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__1__Impl"
    // InternalEXPORT.g:2417:1: rule__TMTCIFExportSizeFromFileLine__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2421:1: ( ( '{' ) )
            // InternalEXPORT.g:2422:1: ( '{' )
            {
            // InternalEXPORT.g:2422:1: ( '{' )
            // InternalEXPORT.g:2423:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__2"
    // InternalEXPORT.g:2432:1: rule__TMTCIFExportSizeFromFileLine__Group__2 : rule__TMTCIFExportSizeFromFileLine__Group__2__Impl rule__TMTCIFExportSizeFromFileLine__Group__3 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2436:1: ( rule__TMTCIFExportSizeFromFileLine__Group__2__Impl rule__TMTCIFExportSizeFromFileLine__Group__3 )
            // InternalEXPORT.g:2437:2: rule__TMTCIFExportSizeFromFileLine__Group__2__Impl rule__TMTCIFExportSizeFromFileLine__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__2__Impl"
    // InternalEXPORT.g:2444:1: rule__TMTCIFExportSizeFromFileLine__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2448:1: ( ( 'id' ) )
            // InternalEXPORT.g:2449:1: ( 'id' )
            {
            // InternalEXPORT.g:2449:1: ( 'id' )
            // InternalEXPORT.g:2450:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__3"
    // InternalEXPORT.g:2459:1: rule__TMTCIFExportSizeFromFileLine__Group__3 : rule__TMTCIFExportSizeFromFileLine__Group__3__Impl rule__TMTCIFExportSizeFromFileLine__Group__4 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2463:1: ( rule__TMTCIFExportSizeFromFileLine__Group__3__Impl rule__TMTCIFExportSizeFromFileLine__Group__4 )
            // InternalEXPORT.g:2464:2: rule__TMTCIFExportSizeFromFileLine__Group__3__Impl rule__TMTCIFExportSizeFromFileLine__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeFromFileLine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__3__Impl"
    // InternalEXPORT.g:2471:1: rule__TMTCIFExportSizeFromFileLine__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2475:1: ( ( ':=' ) )
            // InternalEXPORT.g:2476:1: ( ':=' )
            {
            // InternalEXPORT.g:2476:1: ( ':=' )
            // InternalEXPORT.g:2477:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__4"
    // InternalEXPORT.g:2486:1: rule__TMTCIFExportSizeFromFileLine__Group__4 : rule__TMTCIFExportSizeFromFileLine__Group__4__Impl rule__TMTCIFExportSizeFromFileLine__Group__5 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2490:1: ( rule__TMTCIFExportSizeFromFileLine__Group__4__Impl rule__TMTCIFExportSizeFromFileLine__Group__5 )
            // InternalEXPORT.g:2491:2: rule__TMTCIFExportSizeFromFileLine__Group__4__Impl rule__TMTCIFExportSizeFromFileLine__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__4"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__4__Impl"
    // InternalEXPORT.g:2498:1: rule__TMTCIFExportSizeFromFileLine__Group__4__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2502:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 ) ) )
            // InternalEXPORT.g:2503:1: ( ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 ) )
            {
            // InternalEXPORT.g:2503:1: ( ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 ) )
            // InternalEXPORT.g:2504:2: ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdAssignment_4()); 
            }
            // InternalEXPORT.g:2505:2: ( rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 )
            // InternalEXPORT.g:2505:3: rule__TMTCIFExportSizeFromFileLine__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__5"
    // InternalEXPORT.g:2513:1: rule__TMTCIFExportSizeFromFileLine__Group__5 : rule__TMTCIFExportSizeFromFileLine__Group__5__Impl rule__TMTCIFExportSizeFromFileLine__Group__6 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2517:1: ( rule__TMTCIFExportSizeFromFileLine__Group__5__Impl rule__TMTCIFExportSizeFromFileLine__Group__6 )
            // InternalEXPORT.g:2518:2: rule__TMTCIFExportSizeFromFileLine__Group__5__Impl rule__TMTCIFExportSizeFromFileLine__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFExportSizeFromFileLine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__5"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__5__Impl"
    // InternalEXPORT.g:2525:1: rule__TMTCIFExportSizeFromFileLine__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2529:1: ( ( ';' ) )
            // InternalEXPORT.g:2530:1: ( ';' )
            {
            // InternalEXPORT.g:2530:1: ( ';' )
            // InternalEXPORT.g:2531:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__6"
    // InternalEXPORT.g:2540:1: rule__TMTCIFExportSizeFromFileLine__Group__6 : rule__TMTCIFExportSizeFromFileLine__Group__6__Impl rule__TMTCIFExportSizeFromFileLine__Group__7 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2544:1: ( rule__TMTCIFExportSizeFromFileLine__Group__6__Impl rule__TMTCIFExportSizeFromFileLine__Group__7 )
            // InternalEXPORT.g:2545:2: rule__TMTCIFExportSizeFromFileLine__Group__6__Impl rule__TMTCIFExportSizeFromFileLine__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLine__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__6"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__6__Impl"
    // InternalEXPORT.g:2552:1: rule__TMTCIFExportSizeFromFileLine__Group__6__Impl : ( 'fromFile' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2556:1: ( ( 'fromFile' ) )
            // InternalEXPORT.g:2557:1: ( 'fromFile' )
            {
            // InternalEXPORT.g:2557:1: ( 'fromFile' )
            // InternalEXPORT.g:2558:2: 'fromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__7"
    // InternalEXPORT.g:2567:1: rule__TMTCIFExportSizeFromFileLine__Group__7 : rule__TMTCIFExportSizeFromFileLine__Group__7__Impl rule__TMTCIFExportSizeFromFileLine__Group__8 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2571:1: ( rule__TMTCIFExportSizeFromFileLine__Group__7__Impl rule__TMTCIFExportSizeFromFileLine__Group__8 )
            // InternalEXPORT.g:2572:2: rule__TMTCIFExportSizeFromFileLine__Group__7__Impl rule__TMTCIFExportSizeFromFileLine__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportSizeFromFileLine__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__7"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__7__Impl"
    // InternalEXPORT.g:2579:1: rule__TMTCIFExportSizeFromFileLine__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2583:1: ( ( ':=' ) )
            // InternalEXPORT.g:2584:1: ( ':=' )
            {
            // InternalEXPORT.g:2584:1: ( ':=' )
            // InternalEXPORT.g:2585:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__8"
    // InternalEXPORT.g:2594:1: rule__TMTCIFExportSizeFromFileLine__Group__8 : rule__TMTCIFExportSizeFromFileLine__Group__8__Impl rule__TMTCIFExportSizeFromFileLine__Group__9 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2598:1: ( rule__TMTCIFExportSizeFromFileLine__Group__8__Impl rule__TMTCIFExportSizeFromFileLine__Group__9 )
            // InternalEXPORT.g:2599:2: rule__TMTCIFExportSizeFromFileLine__Group__8__Impl rule__TMTCIFExportSizeFromFileLine__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__8"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__8__Impl"
    // InternalEXPORT.g:2606:1: rule__TMTCIFExportSizeFromFileLine__Group__8__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2610:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 ) ) )
            // InternalEXPORT.g:2611:1: ( ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 ) )
            {
            // InternalEXPORT.g:2611:1: ( ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 ) )
            // InternalEXPORT.g:2612:2: ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileAssignment_8()); 
            }
            // InternalEXPORT.g:2613:2: ( rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 )
            // InternalEXPORT.g:2613:3: rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__9"
    // InternalEXPORT.g:2621:1: rule__TMTCIFExportSizeFromFileLine__Group__9 : rule__TMTCIFExportSizeFromFileLine__Group__9__Impl rule__TMTCIFExportSizeFromFileLine__Group__10 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2625:1: ( rule__TMTCIFExportSizeFromFileLine__Group__9__Impl rule__TMTCIFExportSizeFromFileLine__Group__10 )
            // InternalEXPORT.g:2626:2: rule__TMTCIFExportSizeFromFileLine__Group__9__Impl rule__TMTCIFExportSizeFromFileLine__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TMTCIFExportSizeFromFileLine__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__9"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__9__Impl"
    // InternalEXPORT.g:2633:1: rule__TMTCIFExportSizeFromFileLine__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2637:1: ( ( ';' ) )
            // InternalEXPORT.g:2638:1: ( ';' )
            {
            // InternalEXPORT.g:2638:1: ( ';' )
            // InternalEXPORT.g:2639:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__10"
    // InternalEXPORT.g:2648:1: rule__TMTCIFExportSizeFromFileLine__Group__10 : rule__TMTCIFExportSizeFromFileLine__Group__10__Impl rule__TMTCIFExportSizeFromFileLine__Group__11 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2652:1: ( rule__TMTCIFExportSizeFromFileLine__Group__10__Impl rule__TMTCIFExportSizeFromFileLine__Group__11 )
            // InternalEXPORT.g:2653:2: rule__TMTCIFExportSizeFromFileLine__Group__10__Impl rule__TMTCIFExportSizeFromFileLine__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLine__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__10"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__10__Impl"
    // InternalEXPORT.g:2660:1: rule__TMTCIFExportSizeFromFileLine__Group__10__Impl : ( 'line' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2664:1: ( ( 'line' ) )
            // InternalEXPORT.g:2665:1: ( 'line' )
            {
            // InternalEXPORT.g:2665:1: ( 'line' )
            // InternalEXPORT.g:2666:2: 'line'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__11"
    // InternalEXPORT.g:2675:1: rule__TMTCIFExportSizeFromFileLine__Group__11 : rule__TMTCIFExportSizeFromFileLine__Group__11__Impl rule__TMTCIFExportSizeFromFileLine__Group__12 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2679:1: ( rule__TMTCIFExportSizeFromFileLine__Group__11__Impl rule__TMTCIFExportSizeFromFileLine__Group__12 )
            // InternalEXPORT.g:2680:2: rule__TMTCIFExportSizeFromFileLine__Group__11__Impl rule__TMTCIFExportSizeFromFileLine__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeFromFileLine__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__11"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__11__Impl"
    // InternalEXPORT.g:2687:1: rule__TMTCIFExportSizeFromFileLine__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2691:1: ( ( ':=' ) )
            // InternalEXPORT.g:2692:1: ( ':=' )
            {
            // InternalEXPORT.g:2692:1: ( ':=' )
            // InternalEXPORT.g:2693:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__12"
    // InternalEXPORT.g:2702:1: rule__TMTCIFExportSizeFromFileLine__Group__12 : rule__TMTCIFExportSizeFromFileLine__Group__12__Impl rule__TMTCIFExportSizeFromFileLine__Group__13 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2706:1: ( rule__TMTCIFExportSizeFromFileLine__Group__12__Impl rule__TMTCIFExportSizeFromFileLine__Group__13 )
            // InternalEXPORT.g:2707:2: rule__TMTCIFExportSizeFromFileLine__Group__12__Impl rule__TMTCIFExportSizeFromFileLine__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__12"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__12__Impl"
    // InternalEXPORT.g:2714:1: rule__TMTCIFExportSizeFromFileLine__Group__12__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2718:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 ) ) )
            // InternalEXPORT.g:2719:1: ( ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 ) )
            {
            // InternalEXPORT.g:2719:1: ( ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 ) )
            // InternalEXPORT.g:2720:2: ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineAssignment_12()); 
            }
            // InternalEXPORT.g:2721:2: ( rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 )
            // InternalEXPORT.g:2721:3: rule__TMTCIFExportSizeFromFileLine__LineAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__LineAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__13"
    // InternalEXPORT.g:2729:1: rule__TMTCIFExportSizeFromFileLine__Group__13 : rule__TMTCIFExportSizeFromFileLine__Group__13__Impl rule__TMTCIFExportSizeFromFileLine__Group__14 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2733:1: ( rule__TMTCIFExportSizeFromFileLine__Group__13__Impl rule__TMTCIFExportSizeFromFileLine__Group__14 )
            // InternalEXPORT.g:2734:2: rule__TMTCIFExportSizeFromFileLine__Group__13__Impl rule__TMTCIFExportSizeFromFileLine__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLine__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__13"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__13__Impl"
    // InternalEXPORT.g:2741:1: rule__TMTCIFExportSizeFromFileLine__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2745:1: ( ( ';' ) )
            // InternalEXPORT.g:2746:1: ( ';' )
            {
            // InternalEXPORT.g:2746:1: ( ';' )
            // InternalEXPORT.g:2747:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__14"
    // InternalEXPORT.g:2756:1: rule__TMTCIFExportSizeFromFileLine__Group__14 : rule__TMTCIFExportSizeFromFileLine__Group__14__Impl rule__TMTCIFExportSizeFromFileLine__Group__15 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2760:1: ( rule__TMTCIFExportSizeFromFileLine__Group__14__Impl rule__TMTCIFExportSizeFromFileLine__Group__15 )
            // InternalEXPORT.g:2761:2: rule__TMTCIFExportSizeFromFileLine__Group__14__Impl rule__TMTCIFExportSizeFromFileLine__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLine__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__14"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__14__Impl"
    // InternalEXPORT.g:2768:1: rule__TMTCIFExportSizeFromFileLine__Group__14__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )? ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2772:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )? ) )
            // InternalEXPORT.g:2773:1: ( ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )? )
            {
            // InternalEXPORT.g:2773:1: ( ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )? )
            // InternalEXPORT.g:2774:2: ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_14()); 
            }
            // InternalEXPORT.g:2775:2: ( rule__TMTCIFExportSizeFromFileLine__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEXPORT.g:2775:3: rule__TMTCIFExportSizeFromFileLine__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeFromFileLine__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__15"
    // InternalEXPORT.g:2783:1: rule__TMTCIFExportSizeFromFileLine__Group__15 : rule__TMTCIFExportSizeFromFileLine__Group__15__Impl rule__TMTCIFExportSizeFromFileLine__Group__16 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2787:1: ( rule__TMTCIFExportSizeFromFileLine__Group__15__Impl rule__TMTCIFExportSizeFromFileLine__Group__16 )
            // InternalEXPORT.g:2788:2: rule__TMTCIFExportSizeFromFileLine__Group__15__Impl rule__TMTCIFExportSizeFromFileLine__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeFromFileLine__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__15"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__15__Impl"
    // InternalEXPORT.g:2795:1: rule__TMTCIFExportSizeFromFileLine__Group__15__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )? ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2799:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )? ) )
            // InternalEXPORT.g:2800:1: ( ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )? )
            {
            // InternalEXPORT.g:2800:1: ( ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )? )
            // InternalEXPORT.g:2801:2: ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_15()); 
            }
            // InternalEXPORT.g:2802:2: ( rule__TMTCIFExportSizeFromFileLine__Group_15__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEXPORT.g:2802:3: rule__TMTCIFExportSizeFromFileLine__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeFromFileLine__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__16"
    // InternalEXPORT.g:2810:1: rule__TMTCIFExportSizeFromFileLine__Group__16 : rule__TMTCIFExportSizeFromFileLine__Group__16__Impl rule__TMTCIFExportSizeFromFileLine__Group__17 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2814:1: ( rule__TMTCIFExportSizeFromFileLine__Group__16__Impl rule__TMTCIFExportSizeFromFileLine__Group__17 )
            // InternalEXPORT.g:2815:2: rule__TMTCIFExportSizeFromFileLine__Group__16__Impl rule__TMTCIFExportSizeFromFileLine__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__16"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__16__Impl"
    // InternalEXPORT.g:2822:1: rule__TMTCIFExportSizeFromFileLine__Group__16__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2826:1: ( ( '}' ) )
            // InternalEXPORT.g:2827:1: ( '}' )
            {
            // InternalEXPORT.g:2827:1: ( '}' )
            // InternalEXPORT.g:2828:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__17"
    // InternalEXPORT.g:2837:1: rule__TMTCIFExportSizeFromFileLine__Group__17 : rule__TMTCIFExportSizeFromFileLine__Group__17__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2841:1: ( rule__TMTCIFExportSizeFromFileLine__Group__17__Impl )
            // InternalEXPORT.g:2842:2: rule__TMTCIFExportSizeFromFileLine__Group__17__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__17"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group__17__Impl"
    // InternalEXPORT.g:2848:1: rule__TMTCIFExportSizeFromFileLine__Group__17__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2852:1: ( ( ';' ) )
            // InternalEXPORT.g:2853:1: ( ';' )
            {
            // InternalEXPORT.g:2853:1: ( ';' )
            // InternalEXPORT.g:2854:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group__17__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__0"
    // InternalEXPORT.g:2864:1: rule__TMTCIFExportSizeFromFileLine__Group_14__0 : rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__1 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2868:1: ( rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__1 )
            // InternalEXPORT.g:2869:2: rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_14__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl"
    // InternalEXPORT.g:2876:1: rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl : ( 'addSize' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2880:1: ( ( 'addSize' ) )
            // InternalEXPORT.g:2881:1: ( 'addSize' )
            {
            // InternalEXPORT.g:2881:1: ( 'addSize' )
            // InternalEXPORT.g:2882:2: 'addSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeKeyword_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__1"
    // InternalEXPORT.g:2891:1: rule__TMTCIFExportSizeFromFileLine__Group_14__1 : rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__2 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2895:1: ( rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__2 )
            // InternalEXPORT.g:2896:2: rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_14__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl"
    // InternalEXPORT.g:2903:1: rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2907:1: ( ( ':=' ) )
            // InternalEXPORT.g:2908:1: ( ':=' )
            {
            // InternalEXPORT.g:2908:1: ( ':=' )
            // InternalEXPORT.g:2909:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__2"
    // InternalEXPORT.g:2918:1: rule__TMTCIFExportSizeFromFileLine__Group_14__2 : rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__3 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2922:1: ( rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__3 )
            // InternalEXPORT.g:2923:2: rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_14__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl"
    // InternalEXPORT.g:2930:1: rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2934:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 ) ) )
            // InternalEXPORT.g:2935:1: ( ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 ) )
            {
            // InternalEXPORT.g:2935:1: ( ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 ) )
            // InternalEXPORT.g:2936:2: ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); 
            }
            // InternalEXPORT.g:2937:2: ( rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 )
            // InternalEXPORT.g:2937:3: rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeAssignment_14_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__3"
    // InternalEXPORT.g:2945:1: rule__TMTCIFExportSizeFromFileLine__Group_14__3 : rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2949:1: ( rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl )
            // InternalEXPORT.g:2950:2: rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl"
    // InternalEXPORT.g:2956:1: rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2960:1: ( ( ';' ) )
            // InternalEXPORT.g:2961:1: ( ';' )
            {
            // InternalEXPORT.g:2961:1: ( ';' )
            // InternalEXPORT.g:2962:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_14_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_14__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__0"
    // InternalEXPORT.g:2972:1: rule__TMTCIFExportSizeFromFileLine__Group_15__0 : rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__1 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2976:1: ( rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__1 )
            // InternalEXPORT.g:2977:2: rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_15__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__0"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl"
    // InternalEXPORT.g:2984:1: rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl : ( 'unit' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:2988:1: ( ( 'unit' ) )
            // InternalEXPORT.g:2989:1: ( 'unit' )
            {
            // InternalEXPORT.g:2989:1: ( 'unit' )
            // InternalEXPORT.g:2990:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitKeyword_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__1"
    // InternalEXPORT.g:2999:1: rule__TMTCIFExportSizeFromFileLine__Group_15__1 : rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__2 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3003:1: ( rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__2 )
            // InternalEXPORT.g:3004:2: rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_15__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__1"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl"
    // InternalEXPORT.g:3011:1: rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3015:1: ( ( ':=' ) )
            // InternalEXPORT.g:3016:1: ( ':=' )
            {
            // InternalEXPORT.g:3016:1: ( ':=' )
            // InternalEXPORT.g:3017:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__2"
    // InternalEXPORT.g:3026:1: rule__TMTCIFExportSizeFromFileLine__Group_15__2 : rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__3 ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3030:1: ( rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__3 )
            // InternalEXPORT.g:3031:2: rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl rule__TMTCIFExportSizeFromFileLine__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_15__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl"
    // InternalEXPORT.g:3038:1: rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl : ( ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 ) ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3042:1: ( ( ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 ) ) )
            // InternalEXPORT.g:3043:1: ( ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 ) )
            {
            // InternalEXPORT.g:3043:1: ( ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 ) )
            // InternalEXPORT.g:3044:2: ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitAssignment_15_2()); 
            }
            // InternalEXPORT.g:3045:2: ( rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 )
            // InternalEXPORT.g:3045:3: rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitAssignment_15_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__3"
    // InternalEXPORT.g:3053:1: rule__TMTCIFExportSizeFromFileLine__Group_15__3 : rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3057:1: ( rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl )
            // InternalEXPORT.g:3058:2: rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__3"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl"
    // InternalEXPORT.g:3064:1: rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3068:1: ( ( ';' ) )
            // InternalEXPORT.g:3069:1: ( ';' )
            {
            // InternalEXPORT.g:3069:1: ( ';' )
            // InternalEXPORT.g:3070:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getSemicolonKeyword_15_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__Group_15__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__0"
    // InternalEXPORT.g:3080:1: rule__TMTCIFExportSizeInBits__Group__0 : rule__TMTCIFExportSizeInBits__Group__0__Impl rule__TMTCIFExportSizeInBits__Group__1 ;
    public final void rule__TMTCIFExportSizeInBits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3084:1: ( rule__TMTCIFExportSizeInBits__Group__0__Impl rule__TMTCIFExportSizeInBits__Group__1 )
            // InternalEXPORT.g:3085:2: rule__TMTCIFExportSizeInBits__Group__0__Impl rule__TMTCIFExportSizeInBits__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSizeInBits__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__0"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__0__Impl"
    // InternalEXPORT.g:3092:1: rule__TMTCIFExportSizeInBits__Group__0__Impl : ( 'TMTCIFExportSizeInBits' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3096:1: ( ( 'TMTCIFExportSizeInBits' ) )
            // InternalEXPORT.g:3097:1: ( 'TMTCIFExportSizeInBits' )
            {
            // InternalEXPORT.g:3097:1: ( 'TMTCIFExportSizeInBits' )
            // InternalEXPORT.g:3098:2: 'TMTCIFExportSizeInBits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getTMTCIFExportSizeInBitsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__1"
    // InternalEXPORT.g:3107:1: rule__TMTCIFExportSizeInBits__Group__1 : rule__TMTCIFExportSizeInBits__Group__1__Impl rule__TMTCIFExportSizeInBits__Group__2 ;
    public final void rule__TMTCIFExportSizeInBits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3111:1: ( rule__TMTCIFExportSizeInBits__Group__1__Impl rule__TMTCIFExportSizeInBits__Group__2 )
            // InternalEXPORT.g:3112:2: rule__TMTCIFExportSizeInBits__Group__1__Impl rule__TMTCIFExportSizeInBits__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFExportSizeInBits__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__1"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__1__Impl"
    // InternalEXPORT.g:3119:1: rule__TMTCIFExportSizeInBits__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3123:1: ( ( '{' ) )
            // InternalEXPORT.g:3124:1: ( '{' )
            {
            // InternalEXPORT.g:3124:1: ( '{' )
            // InternalEXPORT.g:3125:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__2"
    // InternalEXPORT.g:3134:1: rule__TMTCIFExportSizeInBits__Group__2 : rule__TMTCIFExportSizeInBits__Group__2__Impl rule__TMTCIFExportSizeInBits__Group__3 ;
    public final void rule__TMTCIFExportSizeInBits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3138:1: ( rule__TMTCIFExportSizeInBits__Group__2__Impl rule__TMTCIFExportSizeInBits__Group__3 )
            // InternalEXPORT.g:3139:2: rule__TMTCIFExportSizeInBits__Group__2__Impl rule__TMTCIFExportSizeInBits__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeInBits__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__2"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__2__Impl"
    // InternalEXPORT.g:3146:1: rule__TMTCIFExportSizeInBits__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3150:1: ( ( 'id' ) )
            // InternalEXPORT.g:3151:1: ( 'id' )
            {
            // InternalEXPORT.g:3151:1: ( 'id' )
            // InternalEXPORT.g:3152:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__3"
    // InternalEXPORT.g:3161:1: rule__TMTCIFExportSizeInBits__Group__3 : rule__TMTCIFExportSizeInBits__Group__3__Impl rule__TMTCIFExportSizeInBits__Group__4 ;
    public final void rule__TMTCIFExportSizeInBits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3165:1: ( rule__TMTCIFExportSizeInBits__Group__3__Impl rule__TMTCIFExportSizeInBits__Group__4 )
            // InternalEXPORT.g:3166:2: rule__TMTCIFExportSizeInBits__Group__3__Impl rule__TMTCIFExportSizeInBits__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeInBits__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__3"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__3__Impl"
    // InternalEXPORT.g:3173:1: rule__TMTCIFExportSizeInBits__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3177:1: ( ( ':=' ) )
            // InternalEXPORT.g:3178:1: ( ':=' )
            {
            // InternalEXPORT.g:3178:1: ( ':=' )
            // InternalEXPORT.g:3179:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__4"
    // InternalEXPORT.g:3188:1: rule__TMTCIFExportSizeInBits__Group__4 : rule__TMTCIFExportSizeInBits__Group__4__Impl rule__TMTCIFExportSizeInBits__Group__5 ;
    public final void rule__TMTCIFExportSizeInBits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3192:1: ( rule__TMTCIFExportSizeInBits__Group__4__Impl rule__TMTCIFExportSizeInBits__Group__5 )
            // InternalEXPORT.g:3193:2: rule__TMTCIFExportSizeInBits__Group__4__Impl rule__TMTCIFExportSizeInBits__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeInBits__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__4"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__4__Impl"
    // InternalEXPORT.g:3200:1: rule__TMTCIFExportSizeInBits__Group__4__Impl : ( ( rule__TMTCIFExportSizeInBits__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3204:1: ( ( ( rule__TMTCIFExportSizeInBits__IdAssignment_4 ) ) )
            // InternalEXPORT.g:3205:1: ( ( rule__TMTCIFExportSizeInBits__IdAssignment_4 ) )
            {
            // InternalEXPORT.g:3205:1: ( ( rule__TMTCIFExportSizeInBits__IdAssignment_4 ) )
            // InternalEXPORT.g:3206:2: ( rule__TMTCIFExportSizeInBits__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdAssignment_4()); 
            }
            // InternalEXPORT.g:3207:2: ( rule__TMTCIFExportSizeInBits__IdAssignment_4 )
            // InternalEXPORT.g:3207:3: rule__TMTCIFExportSizeInBits__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__5"
    // InternalEXPORT.g:3215:1: rule__TMTCIFExportSizeInBits__Group__5 : rule__TMTCIFExportSizeInBits__Group__5__Impl rule__TMTCIFExportSizeInBits__Group__6 ;
    public final void rule__TMTCIFExportSizeInBits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3219:1: ( rule__TMTCIFExportSizeInBits__Group__5__Impl rule__TMTCIFExportSizeInBits__Group__6 )
            // InternalEXPORT.g:3220:2: rule__TMTCIFExportSizeInBits__Group__5__Impl rule__TMTCIFExportSizeInBits__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__TMTCIFExportSizeInBits__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__5"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__5__Impl"
    // InternalEXPORT.g:3227:1: rule__TMTCIFExportSizeInBits__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3231:1: ( ( ';' ) )
            // InternalEXPORT.g:3232:1: ( ';' )
            {
            // InternalEXPORT.g:3232:1: ( ';' )
            // InternalEXPORT.g:3233:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__6"
    // InternalEXPORT.g:3242:1: rule__TMTCIFExportSizeInBits__Group__6 : rule__TMTCIFExportSizeInBits__Group__6__Impl rule__TMTCIFExportSizeInBits__Group__7 ;
    public final void rule__TMTCIFExportSizeInBits__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3246:1: ( rule__TMTCIFExportSizeInBits__Group__6__Impl rule__TMTCIFExportSizeInBits__Group__7 )
            // InternalEXPORT.g:3247:2: rule__TMTCIFExportSizeInBits__Group__6__Impl rule__TMTCIFExportSizeInBits__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeInBits__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__6"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__6__Impl"
    // InternalEXPORT.g:3254:1: rule__TMTCIFExportSizeInBits__Group__6__Impl : ( 'from' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3258:1: ( ( 'from' ) )
            // InternalEXPORT.g:3259:1: ( 'from' )
            {
            // InternalEXPORT.g:3259:1: ( 'from' )
            // InternalEXPORT.g:3260:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__7"
    // InternalEXPORT.g:3269:1: rule__TMTCIFExportSizeInBits__Group__7 : rule__TMTCIFExportSizeInBits__Group__7__Impl rule__TMTCIFExportSizeInBits__Group__8 ;
    public final void rule__TMTCIFExportSizeInBits__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3273:1: ( rule__TMTCIFExportSizeInBits__Group__7__Impl rule__TMTCIFExportSizeInBits__Group__8 )
            // InternalEXPORT.g:3274:2: rule__TMTCIFExportSizeInBits__Group__7__Impl rule__TMTCIFExportSizeInBits__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportSizeInBits__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__7"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__7__Impl"
    // InternalEXPORT.g:3281:1: rule__TMTCIFExportSizeInBits__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3285:1: ( ( ':=' ) )
            // InternalEXPORT.g:3286:1: ( ':=' )
            {
            // InternalEXPORT.g:3286:1: ( ':=' )
            // InternalEXPORT.g:3287:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__8"
    // InternalEXPORT.g:3296:1: rule__TMTCIFExportSizeInBits__Group__8 : rule__TMTCIFExportSizeInBits__Group__8__Impl rule__TMTCIFExportSizeInBits__Group__9 ;
    public final void rule__TMTCIFExportSizeInBits__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3300:1: ( rule__TMTCIFExportSizeInBits__Group__8__Impl rule__TMTCIFExportSizeInBits__Group__9 )
            // InternalEXPORT.g:3301:2: rule__TMTCIFExportSizeInBits__Group__8__Impl rule__TMTCIFExportSizeInBits__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeInBits__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__8"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__8__Impl"
    // InternalEXPORT.g:3308:1: rule__TMTCIFExportSizeInBits__Group__8__Impl : ( ( rule__TMTCIFExportSizeInBits__FromAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3312:1: ( ( ( rule__TMTCIFExportSizeInBits__FromAssignment_8 ) ) )
            // InternalEXPORT.g:3313:1: ( ( rule__TMTCIFExportSizeInBits__FromAssignment_8 ) )
            {
            // InternalEXPORT.g:3313:1: ( ( rule__TMTCIFExportSizeInBits__FromAssignment_8 ) )
            // InternalEXPORT.g:3314:2: ( rule__TMTCIFExportSizeInBits__FromAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromAssignment_8()); 
            }
            // InternalEXPORT.g:3315:2: ( rule__TMTCIFExportSizeInBits__FromAssignment_8 )
            // InternalEXPORT.g:3315:3: rule__TMTCIFExportSizeInBits__FromAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__FromAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__9"
    // InternalEXPORT.g:3323:1: rule__TMTCIFExportSizeInBits__Group__9 : rule__TMTCIFExportSizeInBits__Group__9__Impl rule__TMTCIFExportSizeInBits__Group__10 ;
    public final void rule__TMTCIFExportSizeInBits__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3327:1: ( rule__TMTCIFExportSizeInBits__Group__9__Impl rule__TMTCIFExportSizeInBits__Group__10 )
            // InternalEXPORT.g:3328:2: rule__TMTCIFExportSizeInBits__Group__9__Impl rule__TMTCIFExportSizeInBits__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeInBits__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__9"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__9__Impl"
    // InternalEXPORT.g:3335:1: rule__TMTCIFExportSizeInBits__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3339:1: ( ( ';' ) )
            // InternalEXPORT.g:3340:1: ( ';' )
            {
            // InternalEXPORT.g:3340:1: ( ';' )
            // InternalEXPORT.g:3341:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__10"
    // InternalEXPORT.g:3350:1: rule__TMTCIFExportSizeInBits__Group__10 : rule__TMTCIFExportSizeInBits__Group__10__Impl rule__TMTCIFExportSizeInBits__Group__11 ;
    public final void rule__TMTCIFExportSizeInBits__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3354:1: ( rule__TMTCIFExportSizeInBits__Group__10__Impl rule__TMTCIFExportSizeInBits__Group__11 )
            // InternalEXPORT.g:3355:2: rule__TMTCIFExportSizeInBits__Group__10__Impl rule__TMTCIFExportSizeInBits__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeInBits__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__10"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__10__Impl"
    // InternalEXPORT.g:3362:1: rule__TMTCIFExportSizeInBits__Group__10__Impl : ( ( rule__TMTCIFExportSizeInBits__Group_10__0 )? ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3366:1: ( ( ( rule__TMTCIFExportSizeInBits__Group_10__0 )? ) )
            // InternalEXPORT.g:3367:1: ( ( rule__TMTCIFExportSizeInBits__Group_10__0 )? )
            {
            // InternalEXPORT.g:3367:1: ( ( rule__TMTCIFExportSizeInBits__Group_10__0 )? )
            // InternalEXPORT.g:3368:2: ( rule__TMTCIFExportSizeInBits__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_10()); 
            }
            // InternalEXPORT.g:3369:2: ( rule__TMTCIFExportSizeInBits__Group_10__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEXPORT.g:3369:3: rule__TMTCIFExportSizeInBits__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeInBits__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__11"
    // InternalEXPORT.g:3377:1: rule__TMTCIFExportSizeInBits__Group__11 : rule__TMTCIFExportSizeInBits__Group__11__Impl rule__TMTCIFExportSizeInBits__Group__12 ;
    public final void rule__TMTCIFExportSizeInBits__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3381:1: ( rule__TMTCIFExportSizeInBits__Group__11__Impl rule__TMTCIFExportSizeInBits__Group__12 )
            // InternalEXPORT.g:3382:2: rule__TMTCIFExportSizeInBits__Group__11__Impl rule__TMTCIFExportSizeInBits__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFExportSizeInBits__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__11"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__11__Impl"
    // InternalEXPORT.g:3389:1: rule__TMTCIFExportSizeInBits__Group__11__Impl : ( ( rule__TMTCIFExportSizeInBits__Group_11__0 )? ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3393:1: ( ( ( rule__TMTCIFExportSizeInBits__Group_11__0 )? ) )
            // InternalEXPORT.g:3394:1: ( ( rule__TMTCIFExportSizeInBits__Group_11__0 )? )
            {
            // InternalEXPORT.g:3394:1: ( ( rule__TMTCIFExportSizeInBits__Group_11__0 )? )
            // InternalEXPORT.g:3395:2: ( rule__TMTCIFExportSizeInBits__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_11()); 
            }
            // InternalEXPORT.g:3396:2: ( rule__TMTCIFExportSizeInBits__Group_11__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEXPORT.g:3396:3: rule__TMTCIFExportSizeInBits__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSizeInBits__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__12"
    // InternalEXPORT.g:3404:1: rule__TMTCIFExportSizeInBits__Group__12 : rule__TMTCIFExportSizeInBits__Group__12__Impl rule__TMTCIFExportSizeInBits__Group__13 ;
    public final void rule__TMTCIFExportSizeInBits__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3408:1: ( rule__TMTCIFExportSizeInBits__Group__12__Impl rule__TMTCIFExportSizeInBits__Group__13 )
            // InternalEXPORT.g:3409:2: rule__TMTCIFExportSizeInBits__Group__12__Impl rule__TMTCIFExportSizeInBits__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeInBits__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__12"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__12__Impl"
    // InternalEXPORT.g:3416:1: rule__TMTCIFExportSizeInBits__Group__12__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3420:1: ( ( '}' ) )
            // InternalEXPORT.g:3421:1: ( '}' )
            {
            // InternalEXPORT.g:3421:1: ( '}' )
            // InternalEXPORT.g:3422:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__13"
    // InternalEXPORT.g:3431:1: rule__TMTCIFExportSizeInBits__Group__13 : rule__TMTCIFExportSizeInBits__Group__13__Impl ;
    public final void rule__TMTCIFExportSizeInBits__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3435:1: ( rule__TMTCIFExportSizeInBits__Group__13__Impl )
            // InternalEXPORT.g:3436:2: rule__TMTCIFExportSizeInBits__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__13"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group__13__Impl"
    // InternalEXPORT.g:3442:1: rule__TMTCIFExportSizeInBits__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3446:1: ( ( ';' ) )
            // InternalEXPORT.g:3447:1: ( ';' )
            {
            // InternalEXPORT.g:3447:1: ( ';' )
            // InternalEXPORT.g:3448:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__0"
    // InternalEXPORT.g:3458:1: rule__TMTCIFExportSizeInBits__Group_10__0 : rule__TMTCIFExportSizeInBits__Group_10__0__Impl rule__TMTCIFExportSizeInBits__Group_10__1 ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3462:1: ( rule__TMTCIFExportSizeInBits__Group_10__0__Impl rule__TMTCIFExportSizeInBits__Group_10__1 )
            // InternalEXPORT.g:3463:2: rule__TMTCIFExportSizeInBits__Group_10__0__Impl rule__TMTCIFExportSizeInBits__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeInBits__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__0"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__0__Impl"
    // InternalEXPORT.g:3470:1: rule__TMTCIFExportSizeInBits__Group_10__0__Impl : ( 'addSize' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3474:1: ( ( 'addSize' ) )
            // InternalEXPORT.g:3475:1: ( 'addSize' )
            {
            // InternalEXPORT.g:3475:1: ( 'addSize' )
            // InternalEXPORT.g:3476:2: 'addSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__1"
    // InternalEXPORT.g:3485:1: rule__TMTCIFExportSizeInBits__Group_10__1 : rule__TMTCIFExportSizeInBits__Group_10__1__Impl rule__TMTCIFExportSizeInBits__Group_10__2 ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3489:1: ( rule__TMTCIFExportSizeInBits__Group_10__1__Impl rule__TMTCIFExportSizeInBits__Group_10__2 )
            // InternalEXPORT.g:3490:2: rule__TMTCIFExportSizeInBits__Group_10__1__Impl rule__TMTCIFExportSizeInBits__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSizeInBits__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__1"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__1__Impl"
    // InternalEXPORT.g:3497:1: rule__TMTCIFExportSizeInBits__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3501:1: ( ( ':=' ) )
            // InternalEXPORT.g:3502:1: ( ':=' )
            {
            // InternalEXPORT.g:3502:1: ( ':=' )
            // InternalEXPORT.g:3503:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__2"
    // InternalEXPORT.g:3512:1: rule__TMTCIFExportSizeInBits__Group_10__2 : rule__TMTCIFExportSizeInBits__Group_10__2__Impl rule__TMTCIFExportSizeInBits__Group_10__3 ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3516:1: ( rule__TMTCIFExportSizeInBits__Group_10__2__Impl rule__TMTCIFExportSizeInBits__Group_10__3 )
            // InternalEXPORT.g:3517:2: rule__TMTCIFExportSizeInBits__Group_10__2__Impl rule__TMTCIFExportSizeInBits__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeInBits__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__2"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__2__Impl"
    // InternalEXPORT.g:3524:1: rule__TMTCIFExportSizeInBits__Group_10__2__Impl : ( ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 ) ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3528:1: ( ( ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 ) ) )
            // InternalEXPORT.g:3529:1: ( ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 ) )
            {
            // InternalEXPORT.g:3529:1: ( ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 ) )
            // InternalEXPORT.g:3530:2: ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeAssignment_10_2()); 
            }
            // InternalEXPORT.g:3531:2: ( rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 )
            // InternalEXPORT.g:3531:3: rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__3"
    // InternalEXPORT.g:3539:1: rule__TMTCIFExportSizeInBits__Group_10__3 : rule__TMTCIFExportSizeInBits__Group_10__3__Impl ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3543:1: ( rule__TMTCIFExportSizeInBits__Group_10__3__Impl )
            // InternalEXPORT.g:3544:2: rule__TMTCIFExportSizeInBits__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__3"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_10__3__Impl"
    // InternalEXPORT.g:3550:1: rule__TMTCIFExportSizeInBits__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3554:1: ( ( ';' ) )
            // InternalEXPORT.g:3555:1: ( ';' )
            {
            // InternalEXPORT.g:3555:1: ( ';' )
            // InternalEXPORT.g:3556:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__0"
    // InternalEXPORT.g:3566:1: rule__TMTCIFExportSizeInBits__Group_11__0 : rule__TMTCIFExportSizeInBits__Group_11__0__Impl rule__TMTCIFExportSizeInBits__Group_11__1 ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3570:1: ( rule__TMTCIFExportSizeInBits__Group_11__0__Impl rule__TMTCIFExportSizeInBits__Group_11__1 )
            // InternalEXPORT.g:3571:2: rule__TMTCIFExportSizeInBits__Group_11__0__Impl rule__TMTCIFExportSizeInBits__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSizeInBits__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__0"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__0__Impl"
    // InternalEXPORT.g:3578:1: rule__TMTCIFExportSizeInBits__Group_11__0__Impl : ( 'unit' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3582:1: ( ( 'unit' ) )
            // InternalEXPORT.g:3583:1: ( 'unit' )
            {
            // InternalEXPORT.g:3583:1: ( 'unit' )
            // InternalEXPORT.g:3584:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__1"
    // InternalEXPORT.g:3593:1: rule__TMTCIFExportSizeInBits__Group_11__1 : rule__TMTCIFExportSizeInBits__Group_11__1__Impl rule__TMTCIFExportSizeInBits__Group_11__2 ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3597:1: ( rule__TMTCIFExportSizeInBits__Group_11__1__Impl rule__TMTCIFExportSizeInBits__Group_11__2 )
            // InternalEXPORT.g:3598:2: rule__TMTCIFExportSizeInBits__Group_11__1__Impl rule__TMTCIFExportSizeInBits__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TMTCIFExportSizeInBits__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__1"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__1__Impl"
    // InternalEXPORT.g:3605:1: rule__TMTCIFExportSizeInBits__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3609:1: ( ( ':=' ) )
            // InternalEXPORT.g:3610:1: ( ':=' )
            {
            // InternalEXPORT.g:3610:1: ( ':=' )
            // InternalEXPORT.g:3611:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__2"
    // InternalEXPORT.g:3620:1: rule__TMTCIFExportSizeInBits__Group_11__2 : rule__TMTCIFExportSizeInBits__Group_11__2__Impl rule__TMTCIFExportSizeInBits__Group_11__3 ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3624:1: ( rule__TMTCIFExportSizeInBits__Group_11__2__Impl rule__TMTCIFExportSizeInBits__Group_11__3 )
            // InternalEXPORT.g:3625:2: rule__TMTCIFExportSizeInBits__Group_11__2__Impl rule__TMTCIFExportSizeInBits__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSizeInBits__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__2"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__2__Impl"
    // InternalEXPORT.g:3632:1: rule__TMTCIFExportSizeInBits__Group_11__2__Impl : ( ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 ) ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3636:1: ( ( ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 ) ) )
            // InternalEXPORT.g:3637:1: ( ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 ) )
            {
            // InternalEXPORT.g:3637:1: ( ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 ) )
            // InternalEXPORT.g:3638:2: ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitAssignment_11_2()); 
            }
            // InternalEXPORT.g:3639:2: ( rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 )
            // InternalEXPORT.g:3639:3: rule__TMTCIFExportSizeInBits__UnitAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__UnitAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__3"
    // InternalEXPORT.g:3647:1: rule__TMTCIFExportSizeInBits__Group_11__3 : rule__TMTCIFExportSizeInBits__Group_11__3__Impl ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3651:1: ( rule__TMTCIFExportSizeInBits__Group_11__3__Impl )
            // InternalEXPORT.g:3652:2: rule__TMTCIFExportSizeInBits__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSizeInBits__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__3"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__Group_11__3__Impl"
    // InternalEXPORT.g:3658:1: rule__TMTCIFExportSizeInBits__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSizeInBits__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3662:1: ( ( ';' ) )
            // InternalEXPORT.g:3663:1: ( ';' )
            {
            // InternalEXPORT.g:3663:1: ( ';' )
            // InternalEXPORT.g:3664:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__Group_11__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__0"
    // InternalEXPORT.g:3674:1: rule__TMTCIFExportSettings__Group__0 : rule__TMTCIFExportSettings__Group__0__Impl rule__TMTCIFExportSettings__Group__1 ;
    public final void rule__TMTCIFExportSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3678:1: ( rule__TMTCIFExportSettings__Group__0__Impl rule__TMTCIFExportSettings__Group__1 )
            // InternalEXPORT.g:3679:2: rule__TMTCIFExportSettings__Group__0__Impl rule__TMTCIFExportSettings__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFExportSettings__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__0__Impl"
    // InternalEXPORT.g:3686:1: rule__TMTCIFExportSettings__Group__0__Impl : ( () ) ;
    public final void rule__TMTCIFExportSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3690:1: ( ( () ) )
            // InternalEXPORT.g:3691:1: ( () )
            {
            // InternalEXPORT.g:3691:1: ( () )
            // InternalEXPORT.g:3692:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0()); 
            }
            // InternalEXPORT.g:3693:2: ()
            // InternalEXPORT.g:3693:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__1"
    // InternalEXPORT.g:3701:1: rule__TMTCIFExportSettings__Group__1 : rule__TMTCIFExportSettings__Group__1__Impl rule__TMTCIFExportSettings__Group__2 ;
    public final void rule__TMTCIFExportSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3705:1: ( rule__TMTCIFExportSettings__Group__1__Impl rule__TMTCIFExportSettings__Group__2 )
            // InternalEXPORT.g:3706:2: rule__TMTCIFExportSettings__Group__1__Impl rule__TMTCIFExportSettings__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettings__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__1__Impl"
    // InternalEXPORT.g:3713:1: rule__TMTCIFExportSettings__Group__1__Impl : ( 'TMTCIFExportSettings' ) ;
    public final void rule__TMTCIFExportSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3717:1: ( ( 'TMTCIFExportSettings' ) )
            // InternalEXPORT.g:3718:1: ( 'TMTCIFExportSettings' )
            {
            // InternalEXPORT.g:3718:1: ( 'TMTCIFExportSettings' )
            // InternalEXPORT.g:3719:2: 'TMTCIFExportSettings'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getTMTCIFExportSettingsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__2"
    // InternalEXPORT.g:3728:1: rule__TMTCIFExportSettings__Group__2 : rule__TMTCIFExportSettings__Group__2__Impl rule__TMTCIFExportSettings__Group__3 ;
    public final void rule__TMTCIFExportSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3732:1: ( rule__TMTCIFExportSettings__Group__2__Impl rule__TMTCIFExportSettings__Group__3 )
            // InternalEXPORT.g:3733:2: rule__TMTCIFExportSettings__Group__2__Impl rule__TMTCIFExportSettings__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TMTCIFExportSettings__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__2__Impl"
    // InternalEXPORT.g:3740:1: rule__TMTCIFExportSettings__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3744:1: ( ( '{' ) )
            // InternalEXPORT.g:3745:1: ( '{' )
            {
            // InternalEXPORT.g:3745:1: ( '{' )
            // InternalEXPORT.g:3746:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__3"
    // InternalEXPORT.g:3755:1: rule__TMTCIFExportSettings__Group__3 : rule__TMTCIFExportSettings__Group__3__Impl rule__TMTCIFExportSettings__Group__4 ;
    public final void rule__TMTCIFExportSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3759:1: ( rule__TMTCIFExportSettings__Group__3__Impl rule__TMTCIFExportSettings__Group__4 )
            // InternalEXPORT.g:3760:2: rule__TMTCIFExportSettings__Group__3__Impl rule__TMTCIFExportSettings__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__TMTCIFExportSettings__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__3__Impl"
    // InternalEXPORT.g:3767:1: rule__TMTCIFExportSettings__Group__3__Impl : ( ( rule__TMTCIFExportSettings__Alternatives_3 )* ) ;
    public final void rule__TMTCIFExportSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3771:1: ( ( ( rule__TMTCIFExportSettings__Alternatives_3 )* ) )
            // InternalEXPORT.g:3772:1: ( ( rule__TMTCIFExportSettings__Alternatives_3 )* )
            {
            // InternalEXPORT.g:3772:1: ( ( rule__TMTCIFExportSettings__Alternatives_3 )* )
            // InternalEXPORT.g:3773:2: ( rule__TMTCIFExportSettings__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getAlternatives_3()); 
            }
            // InternalEXPORT.g:3774:2: ( rule__TMTCIFExportSettings__Alternatives_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35||LA18_0==38||LA18_0==40||LA18_0==44||LA18_0==46||LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEXPORT.g:3774:3: rule__TMTCIFExportSettings__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    rule__TMTCIFExportSettings__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__4"
    // InternalEXPORT.g:3782:1: rule__TMTCIFExportSettings__Group__4 : rule__TMTCIFExportSettings__Group__4__Impl rule__TMTCIFExportSettings__Group__5 ;
    public final void rule__TMTCIFExportSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3786:1: ( rule__TMTCIFExportSettings__Group__4__Impl rule__TMTCIFExportSettings__Group__5 )
            // InternalEXPORT.g:3787:2: rule__TMTCIFExportSettings__Group__4__Impl rule__TMTCIFExportSettings__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettings__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__4__Impl"
    // InternalEXPORT.g:3794:1: rule__TMTCIFExportSettings__Group__4__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3798:1: ( ( '}' ) )
            // InternalEXPORT.g:3799:1: ( '}' )
            {
            // InternalEXPORT.g:3799:1: ( '}' )
            // InternalEXPORT.g:3800:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__5"
    // InternalEXPORT.g:3809:1: rule__TMTCIFExportSettings__Group__5 : rule__TMTCIFExportSettings__Group__5__Impl ;
    public final void rule__TMTCIFExportSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3813:1: ( rule__TMTCIFExportSettings__Group__5__Impl )
            // InternalEXPORT.g:3814:2: rule__TMTCIFExportSettings__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettings__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettings__Group__5__Impl"
    // InternalEXPORT.g:3820:1: rule__TMTCIFExportSettings__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3824:1: ( ( ';' ) )
            // InternalEXPORT.g:3825:1: ( ';' )
            {
            // InternalEXPORT.g:3825:1: ( ';' )
            // InternalEXPORT.g:3826:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__0"
    // InternalEXPORT.g:3836:1: rule__TMTCIFExportSettingFromConst__Group__0 : rule__TMTCIFExportSettingFromConst__Group__0__Impl rule__TMTCIFExportSettingFromConst__Group__1 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3840:1: ( rule__TMTCIFExportSettingFromConst__Group__0__Impl rule__TMTCIFExportSettingFromConst__Group__1 )
            // InternalEXPORT.g:3841:2: rule__TMTCIFExportSettingFromConst__Group__0__Impl rule__TMTCIFExportSettingFromConst__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingFromConst__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__0__Impl"
    // InternalEXPORT.g:3848:1: rule__TMTCIFExportSettingFromConst__Group__0__Impl : ( 'TMTCIFExportSettingFromConst' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3852:1: ( ( 'TMTCIFExportSettingFromConst' ) )
            // InternalEXPORT.g:3853:1: ( 'TMTCIFExportSettingFromConst' )
            {
            // InternalEXPORT.g:3853:1: ( 'TMTCIFExportSettingFromConst' )
            // InternalEXPORT.g:3854:2: 'TMTCIFExportSettingFromConst'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getTMTCIFExportSettingFromConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__1"
    // InternalEXPORT.g:3863:1: rule__TMTCIFExportSettingFromConst__Group__1 : rule__TMTCIFExportSettingFromConst__Group__1__Impl rule__TMTCIFExportSettingFromConst__Group__2 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3867:1: ( rule__TMTCIFExportSettingFromConst__Group__1__Impl rule__TMTCIFExportSettingFromConst__Group__2 )
            // InternalEXPORT.g:3868:2: rule__TMTCIFExportSettingFromConst__Group__1__Impl rule__TMTCIFExportSettingFromConst__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__TMTCIFExportSettingFromConst__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__1__Impl"
    // InternalEXPORT.g:3875:1: rule__TMTCIFExportSettingFromConst__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3879:1: ( ( '{' ) )
            // InternalEXPORT.g:3880:1: ( '{' )
            {
            // InternalEXPORT.g:3880:1: ( '{' )
            // InternalEXPORT.g:3881:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__2"
    // InternalEXPORT.g:3890:1: rule__TMTCIFExportSettingFromConst__Group__2 : rule__TMTCIFExportSettingFromConst__Group__2__Impl rule__TMTCIFExportSettingFromConst__Group__3 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3894:1: ( rule__TMTCIFExportSettingFromConst__Group__2__Impl rule__TMTCIFExportSettingFromConst__Group__3 )
            // InternalEXPORT.g:3895:2: rule__TMTCIFExportSettingFromConst__Group__2__Impl rule__TMTCIFExportSettingFromConst__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromConst__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__2__Impl"
    // InternalEXPORT.g:3902:1: rule__TMTCIFExportSettingFromConst__Group__2__Impl : ( 'value' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3906:1: ( ( 'value' ) )
            // InternalEXPORT.g:3907:1: ( 'value' )
            {
            // InternalEXPORT.g:3907:1: ( 'value' )
            // InternalEXPORT.g:3908:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__3"
    // InternalEXPORT.g:3917:1: rule__TMTCIFExportSettingFromConst__Group__3 : rule__TMTCIFExportSettingFromConst__Group__3__Impl rule__TMTCIFExportSettingFromConst__Group__4 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3921:1: ( rule__TMTCIFExportSettingFromConst__Group__3__Impl rule__TMTCIFExportSettingFromConst__Group__4 )
            // InternalEXPORT.g:3922:2: rule__TMTCIFExportSettingFromConst__Group__3__Impl rule__TMTCIFExportSettingFromConst__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingFromConst__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__3__Impl"
    // InternalEXPORT.g:3929:1: rule__TMTCIFExportSettingFromConst__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3933:1: ( ( ':=' ) )
            // InternalEXPORT.g:3934:1: ( ':=' )
            {
            // InternalEXPORT.g:3934:1: ( ':=' )
            // InternalEXPORT.g:3935:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__4"
    // InternalEXPORT.g:3944:1: rule__TMTCIFExportSettingFromConst__Group__4 : rule__TMTCIFExportSettingFromConst__Group__4__Impl rule__TMTCIFExportSettingFromConst__Group__5 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3948:1: ( rule__TMTCIFExportSettingFromConst__Group__4__Impl rule__TMTCIFExportSettingFromConst__Group__5 )
            // InternalEXPORT.g:3949:2: rule__TMTCIFExportSettingFromConst__Group__4__Impl rule__TMTCIFExportSettingFromConst__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromConst__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__4__Impl"
    // InternalEXPORT.g:3956:1: rule__TMTCIFExportSettingFromConst__Group__4__Impl : ( ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3960:1: ( ( ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 ) ) )
            // InternalEXPORT.g:3961:1: ( ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 ) )
            {
            // InternalEXPORT.g:3961:1: ( ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 ) )
            // InternalEXPORT.g:3962:2: ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueAssignment_4()); 
            }
            // InternalEXPORT.g:3963:2: ( rule__TMTCIFExportSettingFromConst__ValueAssignment_4 )
            // InternalEXPORT.g:3963:3: rule__TMTCIFExportSettingFromConst__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__5"
    // InternalEXPORT.g:3971:1: rule__TMTCIFExportSettingFromConst__Group__5 : rule__TMTCIFExportSettingFromConst__Group__5__Impl rule__TMTCIFExportSettingFromConst__Group__6 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3975:1: ( rule__TMTCIFExportSettingFromConst__Group__5__Impl rule__TMTCIFExportSettingFromConst__Group__6 )
            // InternalEXPORT.g:3976:2: rule__TMTCIFExportSettingFromConst__Group__5__Impl rule__TMTCIFExportSettingFromConst__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingFromConst__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__5__Impl"
    // InternalEXPORT.g:3983:1: rule__TMTCIFExportSettingFromConst__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:3987:1: ( ( ';' ) )
            // InternalEXPORT.g:3988:1: ( ';' )
            {
            // InternalEXPORT.g:3988:1: ( ';' )
            // InternalEXPORT.g:3989:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__6"
    // InternalEXPORT.g:3998:1: rule__TMTCIFExportSettingFromConst__Group__6 : rule__TMTCIFExportSettingFromConst__Group__6__Impl rule__TMTCIFExportSettingFromConst__Group__7 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4002:1: ( rule__TMTCIFExportSettingFromConst__Group__6__Impl rule__TMTCIFExportSettingFromConst__Group__7 )
            // InternalEXPORT.g:4003:2: rule__TMTCIFExportSettingFromConst__Group__6__Impl rule__TMTCIFExportSettingFromConst__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromConst__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__6__Impl"
    // InternalEXPORT.g:4010:1: rule__TMTCIFExportSettingFromConst__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4014:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:4015:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:4015:1: ( 'toFieldRef' )
            // InternalEXPORT.g:4016:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__7"
    // InternalEXPORT.g:4025:1: rule__TMTCIFExportSettingFromConst__Group__7 : rule__TMTCIFExportSettingFromConst__Group__7__Impl rule__TMTCIFExportSettingFromConst__Group__8 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4029:1: ( rule__TMTCIFExportSettingFromConst__Group__7__Impl rule__TMTCIFExportSettingFromConst__Group__8 )
            // InternalEXPORT.g:4030:2: rule__TMTCIFExportSettingFromConst__Group__7__Impl rule__TMTCIFExportSettingFromConst__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingFromConst__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__7__Impl"
    // InternalEXPORT.g:4037:1: rule__TMTCIFExportSettingFromConst__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4041:1: ( ( ':=' ) )
            // InternalEXPORT.g:4042:1: ( ':=' )
            {
            // InternalEXPORT.g:4042:1: ( ':=' )
            // InternalEXPORT.g:4043:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__8"
    // InternalEXPORT.g:4052:1: rule__TMTCIFExportSettingFromConst__Group__8 : rule__TMTCIFExportSettingFromConst__Group__8__Impl rule__TMTCIFExportSettingFromConst__Group__9 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4056:1: ( rule__TMTCIFExportSettingFromConst__Group__8__Impl rule__TMTCIFExportSettingFromConst__Group__9 )
            // InternalEXPORT.g:4057:2: rule__TMTCIFExportSettingFromConst__Group__8__Impl rule__TMTCIFExportSettingFromConst__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromConst__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__8__Impl"
    // InternalEXPORT.g:4064:1: rule__TMTCIFExportSettingFromConst__Group__8__Impl : ( ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4068:1: ( ( ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:4069:1: ( ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:4069:1: ( ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:4070:2: ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:4071:2: ( rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:4071:3: rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__9"
    // InternalEXPORT.g:4079:1: rule__TMTCIFExportSettingFromConst__Group__9 : rule__TMTCIFExportSettingFromConst__Group__9__Impl rule__TMTCIFExportSettingFromConst__Group__10 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4083:1: ( rule__TMTCIFExportSettingFromConst__Group__9__Impl rule__TMTCIFExportSettingFromConst__Group__10 )
            // InternalEXPORT.g:4084:2: rule__TMTCIFExportSettingFromConst__Group__9__Impl rule__TMTCIFExportSettingFromConst__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportSettingFromConst__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__9__Impl"
    // InternalEXPORT.g:4091:1: rule__TMTCIFExportSettingFromConst__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4095:1: ( ( ';' ) )
            // InternalEXPORT.g:4096:1: ( ';' )
            {
            // InternalEXPORT.g:4096:1: ( ';' )
            // InternalEXPORT.g:4097:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__10"
    // InternalEXPORT.g:4106:1: rule__TMTCIFExportSettingFromConst__Group__10 : rule__TMTCIFExportSettingFromConst__Group__10__Impl rule__TMTCIFExportSettingFromConst__Group__11 ;
    public final void rule__TMTCIFExportSettingFromConst__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4110:1: ( rule__TMTCIFExportSettingFromConst__Group__10__Impl rule__TMTCIFExportSettingFromConst__Group__11 )
            // InternalEXPORT.g:4111:2: rule__TMTCIFExportSettingFromConst__Group__10__Impl rule__TMTCIFExportSettingFromConst__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromConst__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__10__Impl"
    // InternalEXPORT.g:4118:1: rule__TMTCIFExportSettingFromConst__Group__10__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4122:1: ( ( '}' ) )
            // InternalEXPORT.g:4123:1: ( '}' )
            {
            // InternalEXPORT.g:4123:1: ( '}' )
            // InternalEXPORT.g:4124:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__11"
    // InternalEXPORT.g:4133:1: rule__TMTCIFExportSettingFromConst__Group__11 : rule__TMTCIFExportSettingFromConst__Group__11__Impl ;
    public final void rule__TMTCIFExportSettingFromConst__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4137:1: ( rule__TMTCIFExportSettingFromConst__Group__11__Impl )
            // InternalEXPORT.g:4138:2: rule__TMTCIFExportSettingFromConst__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromConst__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__Group__11__Impl"
    // InternalEXPORT.g:4144:1: rule__TMTCIFExportSettingFromConst__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromConst__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4148:1: ( ( ';' ) )
            // InternalEXPORT.g:4149:1: ( ';' )
            {
            // InternalEXPORT.g:4149:1: ( ';' )
            // InternalEXPORT.g:4150:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__0"
    // InternalEXPORT.g:4160:1: rule__TMTCIFExportSettingFromSize__Group__0 : rule__TMTCIFExportSettingFromSize__Group__0__Impl rule__TMTCIFExportSettingFromSize__Group__1 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4164:1: ( rule__TMTCIFExportSettingFromSize__Group__0__Impl rule__TMTCIFExportSettingFromSize__Group__1 )
            // InternalEXPORT.g:4165:2: rule__TMTCIFExportSettingFromSize__Group__0__Impl rule__TMTCIFExportSettingFromSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingFromSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__0__Impl"
    // InternalEXPORT.g:4172:1: rule__TMTCIFExportSettingFromSize__Group__0__Impl : ( 'TMTCIFExportSettingFromSize' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4176:1: ( ( 'TMTCIFExportSettingFromSize' ) )
            // InternalEXPORT.g:4177:1: ( 'TMTCIFExportSettingFromSize' )
            {
            // InternalEXPORT.g:4177:1: ( 'TMTCIFExportSettingFromSize' )
            // InternalEXPORT.g:4178:2: 'TMTCIFExportSettingFromSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getTMTCIFExportSettingFromSizeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__1"
    // InternalEXPORT.g:4187:1: rule__TMTCIFExportSettingFromSize__Group__1 : rule__TMTCIFExportSettingFromSize__Group__1__Impl rule__TMTCIFExportSettingFromSize__Group__2 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4191:1: ( rule__TMTCIFExportSettingFromSize__Group__1__Impl rule__TMTCIFExportSettingFromSize__Group__2 )
            // InternalEXPORT.g:4192:2: rule__TMTCIFExportSettingFromSize__Group__1__Impl rule__TMTCIFExportSettingFromSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__TMTCIFExportSettingFromSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__1__Impl"
    // InternalEXPORT.g:4199:1: rule__TMTCIFExportSettingFromSize__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4203:1: ( ( '{' ) )
            // InternalEXPORT.g:4204:1: ( '{' )
            {
            // InternalEXPORT.g:4204:1: ( '{' )
            // InternalEXPORT.g:4205:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__2"
    // InternalEXPORT.g:4214:1: rule__TMTCIFExportSettingFromSize__Group__2 : rule__TMTCIFExportSettingFromSize__Group__2__Impl rule__TMTCIFExportSettingFromSize__Group__3 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4218:1: ( rule__TMTCIFExportSettingFromSize__Group__2__Impl rule__TMTCIFExportSettingFromSize__Group__3 )
            // InternalEXPORT.g:4219:2: rule__TMTCIFExportSettingFromSize__Group__2__Impl rule__TMTCIFExportSettingFromSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__2__Impl"
    // InternalEXPORT.g:4226:1: rule__TMTCIFExportSettingFromSize__Group__2__Impl : ( 'sizeRef' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4230:1: ( ( 'sizeRef' ) )
            // InternalEXPORT.g:4231:1: ( 'sizeRef' )
            {
            // InternalEXPORT.g:4231:1: ( 'sizeRef' )
            // InternalEXPORT.g:4232:2: 'sizeRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__3"
    // InternalEXPORT.g:4241:1: rule__TMTCIFExportSettingFromSize__Group__3 : rule__TMTCIFExportSettingFromSize__Group__3__Impl rule__TMTCIFExportSettingFromSize__Group__4 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4245:1: ( rule__TMTCIFExportSettingFromSize__Group__3__Impl rule__TMTCIFExportSettingFromSize__Group__4 )
            // InternalEXPORT.g:4246:2: rule__TMTCIFExportSettingFromSize__Group__3__Impl rule__TMTCIFExportSettingFromSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingFromSize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__3__Impl"
    // InternalEXPORT.g:4253:1: rule__TMTCIFExportSettingFromSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4257:1: ( ( ':=' ) )
            // InternalEXPORT.g:4258:1: ( ':=' )
            {
            // InternalEXPORT.g:4258:1: ( ':=' )
            // InternalEXPORT.g:4259:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__4"
    // InternalEXPORT.g:4268:1: rule__TMTCIFExportSettingFromSize__Group__4 : rule__TMTCIFExportSettingFromSize__Group__4__Impl rule__TMTCIFExportSettingFromSize__Group__5 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4272:1: ( rule__TMTCIFExportSettingFromSize__Group__4__Impl rule__TMTCIFExportSettingFromSize__Group__5 )
            // InternalEXPORT.g:4273:2: rule__TMTCIFExportSettingFromSize__Group__4__Impl rule__TMTCIFExportSettingFromSize__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromSize__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__4__Impl"
    // InternalEXPORT.g:4280:1: rule__TMTCIFExportSettingFromSize__Group__4__Impl : ( ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4284:1: ( ( ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 ) ) )
            // InternalEXPORT.g:4285:1: ( ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 ) )
            {
            // InternalEXPORT.g:4285:1: ( ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 ) )
            // InternalEXPORT.g:4286:2: ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefAssignment_4()); 
            }
            // InternalEXPORT.g:4287:2: ( rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 )
            // InternalEXPORT.g:4287:3: rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__5"
    // InternalEXPORT.g:4295:1: rule__TMTCIFExportSettingFromSize__Group__5 : rule__TMTCIFExportSettingFromSize__Group__5__Impl rule__TMTCIFExportSettingFromSize__Group__6 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4299:1: ( rule__TMTCIFExportSettingFromSize__Group__5__Impl rule__TMTCIFExportSettingFromSize__Group__6 )
            // InternalEXPORT.g:4300:2: rule__TMTCIFExportSettingFromSize__Group__5__Impl rule__TMTCIFExportSettingFromSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingFromSize__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__5__Impl"
    // InternalEXPORT.g:4307:1: rule__TMTCIFExportSettingFromSize__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4311:1: ( ( ';' ) )
            // InternalEXPORT.g:4312:1: ( ';' )
            {
            // InternalEXPORT.g:4312:1: ( ';' )
            // InternalEXPORT.g:4313:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__6"
    // InternalEXPORT.g:4322:1: rule__TMTCIFExportSettingFromSize__Group__6 : rule__TMTCIFExportSettingFromSize__Group__6__Impl rule__TMTCIFExportSettingFromSize__Group__7 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4326:1: ( rule__TMTCIFExportSettingFromSize__Group__6__Impl rule__TMTCIFExportSettingFromSize__Group__7 )
            // InternalEXPORT.g:4327:2: rule__TMTCIFExportSettingFromSize__Group__6__Impl rule__TMTCIFExportSettingFromSize__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromSize__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__6__Impl"
    // InternalEXPORT.g:4334:1: rule__TMTCIFExportSettingFromSize__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4338:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:4339:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:4339:1: ( 'toFieldRef' )
            // InternalEXPORT.g:4340:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__7"
    // InternalEXPORT.g:4349:1: rule__TMTCIFExportSettingFromSize__Group__7 : rule__TMTCIFExportSettingFromSize__Group__7__Impl rule__TMTCIFExportSettingFromSize__Group__8 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4353:1: ( rule__TMTCIFExportSettingFromSize__Group__7__Impl rule__TMTCIFExportSettingFromSize__Group__8 )
            // InternalEXPORT.g:4354:2: rule__TMTCIFExportSettingFromSize__Group__7__Impl rule__TMTCIFExportSettingFromSize__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingFromSize__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__7__Impl"
    // InternalEXPORT.g:4361:1: rule__TMTCIFExportSettingFromSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4365:1: ( ( ':=' ) )
            // InternalEXPORT.g:4366:1: ( ':=' )
            {
            // InternalEXPORT.g:4366:1: ( ':=' )
            // InternalEXPORT.g:4367:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__8"
    // InternalEXPORT.g:4376:1: rule__TMTCIFExportSettingFromSize__Group__8 : rule__TMTCIFExportSettingFromSize__Group__8__Impl rule__TMTCIFExportSettingFromSize__Group__9 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4380:1: ( rule__TMTCIFExportSettingFromSize__Group__8__Impl rule__TMTCIFExportSettingFromSize__Group__9 )
            // InternalEXPORT.g:4381:2: rule__TMTCIFExportSettingFromSize__Group__8__Impl rule__TMTCIFExportSettingFromSize__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromSize__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__8__Impl"
    // InternalEXPORT.g:4388:1: rule__TMTCIFExportSettingFromSize__Group__8__Impl : ( ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4392:1: ( ( ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:4393:1: ( ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:4393:1: ( ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:4394:2: ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:4395:2: ( rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:4395:3: rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__9"
    // InternalEXPORT.g:4403:1: rule__TMTCIFExportSettingFromSize__Group__9 : rule__TMTCIFExportSettingFromSize__Group__9__Impl rule__TMTCIFExportSettingFromSize__Group__10 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4407:1: ( rule__TMTCIFExportSettingFromSize__Group__9__Impl rule__TMTCIFExportSettingFromSize__Group__10 )
            // InternalEXPORT.g:4408:2: rule__TMTCIFExportSettingFromSize__Group__9__Impl rule__TMTCIFExportSettingFromSize__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportSettingFromSize__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__9__Impl"
    // InternalEXPORT.g:4415:1: rule__TMTCIFExportSettingFromSize__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4419:1: ( ( ';' ) )
            // InternalEXPORT.g:4420:1: ( ';' )
            {
            // InternalEXPORT.g:4420:1: ( ';' )
            // InternalEXPORT.g:4421:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__10"
    // InternalEXPORT.g:4430:1: rule__TMTCIFExportSettingFromSize__Group__10 : rule__TMTCIFExportSettingFromSize__Group__10__Impl rule__TMTCIFExportSettingFromSize__Group__11 ;
    public final void rule__TMTCIFExportSettingFromSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4434:1: ( rule__TMTCIFExportSettingFromSize__Group__10__Impl rule__TMTCIFExportSettingFromSize__Group__11 )
            // InternalEXPORT.g:4435:2: rule__TMTCIFExportSettingFromSize__Group__10__Impl rule__TMTCIFExportSettingFromSize__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromSize__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__10__Impl"
    // InternalEXPORT.g:4442:1: rule__TMTCIFExportSettingFromSize__Group__10__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4446:1: ( ( '}' ) )
            // InternalEXPORT.g:4447:1: ( '}' )
            {
            // InternalEXPORT.g:4447:1: ( '}' )
            // InternalEXPORT.g:4448:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__11"
    // InternalEXPORT.g:4457:1: rule__TMTCIFExportSettingFromSize__Group__11 : rule__TMTCIFExportSettingFromSize__Group__11__Impl ;
    public final void rule__TMTCIFExportSettingFromSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4461:1: ( rule__TMTCIFExportSettingFromSize__Group__11__Impl )
            // InternalEXPORT.g:4462:2: rule__TMTCIFExportSettingFromSize__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromSize__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__Group__11__Impl"
    // InternalEXPORT.g:4468:1: rule__TMTCIFExportSettingFromSize__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4472:1: ( ( ';' ) )
            // InternalEXPORT.g:4473:1: ( ';' )
            {
            // InternalEXPORT.g:4473:1: ( ';' )
            // InternalEXPORT.g:4474:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__0"
    // InternalEXPORT.g:4484:1: rule__TMTCIFExportSettingFromFile__Group__0 : rule__TMTCIFExportSettingFromFile__Group__0__Impl rule__TMTCIFExportSettingFromFile__Group__1 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4488:1: ( rule__TMTCIFExportSettingFromFile__Group__0__Impl rule__TMTCIFExportSettingFromFile__Group__1 )
            // InternalEXPORT.g:4489:2: rule__TMTCIFExportSettingFromFile__Group__0__Impl rule__TMTCIFExportSettingFromFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingFromFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__0__Impl"
    // InternalEXPORT.g:4496:1: rule__TMTCIFExportSettingFromFile__Group__0__Impl : ( 'TMTCIFExportSettingFromFile' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4500:1: ( ( 'TMTCIFExportSettingFromFile' ) )
            // InternalEXPORT.g:4501:1: ( 'TMTCIFExportSettingFromFile' )
            {
            // InternalEXPORT.g:4501:1: ( 'TMTCIFExportSettingFromFile' )
            // InternalEXPORT.g:4502:2: 'TMTCIFExportSettingFromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getTMTCIFExportSettingFromFileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__1"
    // InternalEXPORT.g:4511:1: rule__TMTCIFExportSettingFromFile__Group__1 : rule__TMTCIFExportSettingFromFile__Group__1__Impl rule__TMTCIFExportSettingFromFile__Group__2 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4515:1: ( rule__TMTCIFExportSettingFromFile__Group__1__Impl rule__TMTCIFExportSettingFromFile__Group__2 )
            // InternalEXPORT.g:4516:2: rule__TMTCIFExportSettingFromFile__Group__1__Impl rule__TMTCIFExportSettingFromFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TMTCIFExportSettingFromFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__1__Impl"
    // InternalEXPORT.g:4523:1: rule__TMTCIFExportSettingFromFile__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4527:1: ( ( '{' ) )
            // InternalEXPORT.g:4528:1: ( '{' )
            {
            // InternalEXPORT.g:4528:1: ( '{' )
            // InternalEXPORT.g:4529:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__2"
    // InternalEXPORT.g:4538:1: rule__TMTCIFExportSettingFromFile__Group__2 : rule__TMTCIFExportSettingFromFile__Group__2__Impl rule__TMTCIFExportSettingFromFile__Group__3 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4542:1: ( rule__TMTCIFExportSettingFromFile__Group__2__Impl rule__TMTCIFExportSettingFromFile__Group__3 )
            // InternalEXPORT.g:4543:2: rule__TMTCIFExportSettingFromFile__Group__2__Impl rule__TMTCIFExportSettingFromFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__2__Impl"
    // InternalEXPORT.g:4550:1: rule__TMTCIFExportSettingFromFile__Group__2__Impl : ( 'file' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4554:1: ( ( 'file' ) )
            // InternalEXPORT.g:4555:1: ( 'file' )
            {
            // InternalEXPORT.g:4555:1: ( 'file' )
            // InternalEXPORT.g:4556:2: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__3"
    // InternalEXPORT.g:4565:1: rule__TMTCIFExportSettingFromFile__Group__3 : rule__TMTCIFExportSettingFromFile__Group__3__Impl rule__TMTCIFExportSettingFromFile__Group__4 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4569:1: ( rule__TMTCIFExportSettingFromFile__Group__3__Impl rule__TMTCIFExportSettingFromFile__Group__4 )
            // InternalEXPORT.g:4570:2: rule__TMTCIFExportSettingFromFile__Group__3__Impl rule__TMTCIFExportSettingFromFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportSettingFromFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__3__Impl"
    // InternalEXPORT.g:4577:1: rule__TMTCIFExportSettingFromFile__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4581:1: ( ( ':=' ) )
            // InternalEXPORT.g:4582:1: ( ':=' )
            {
            // InternalEXPORT.g:4582:1: ( ':=' )
            // InternalEXPORT.g:4583:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__4"
    // InternalEXPORT.g:4592:1: rule__TMTCIFExportSettingFromFile__Group__4 : rule__TMTCIFExportSettingFromFile__Group__4__Impl rule__TMTCIFExportSettingFromFile__Group__5 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4596:1: ( rule__TMTCIFExportSettingFromFile__Group__4__Impl rule__TMTCIFExportSettingFromFile__Group__5 )
            // InternalEXPORT.g:4597:2: rule__TMTCIFExportSettingFromFile__Group__4__Impl rule__TMTCIFExportSettingFromFile__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__4__Impl"
    // InternalEXPORT.g:4604:1: rule__TMTCIFExportSettingFromFile__Group__4__Impl : ( ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4608:1: ( ( ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 ) ) )
            // InternalEXPORT.g:4609:1: ( ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 ) )
            {
            // InternalEXPORT.g:4609:1: ( ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 ) )
            // InternalEXPORT.g:4610:2: ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileAssignment_4()); 
            }
            // InternalEXPORT.g:4611:2: ( rule__TMTCIFExportSettingFromFile__FileAssignment_4 )
            // InternalEXPORT.g:4611:3: rule__TMTCIFExportSettingFromFile__FileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__FileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__5"
    // InternalEXPORT.g:4619:1: rule__TMTCIFExportSettingFromFile__Group__5 : rule__TMTCIFExportSettingFromFile__Group__5__Impl rule__TMTCIFExportSettingFromFile__Group__6 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4623:1: ( rule__TMTCIFExportSettingFromFile__Group__5__Impl rule__TMTCIFExportSettingFromFile__Group__6 )
            // InternalEXPORT.g:4624:2: rule__TMTCIFExportSettingFromFile__Group__5__Impl rule__TMTCIFExportSettingFromFile__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingFromFile__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__5__Impl"
    // InternalEXPORT.g:4631:1: rule__TMTCIFExportSettingFromFile__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4635:1: ( ( ';' ) )
            // InternalEXPORT.g:4636:1: ( ';' )
            {
            // InternalEXPORT.g:4636:1: ( ';' )
            // InternalEXPORT.g:4637:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__6"
    // InternalEXPORT.g:4646:1: rule__TMTCIFExportSettingFromFile__Group__6 : rule__TMTCIFExportSettingFromFile__Group__6__Impl rule__TMTCIFExportSettingFromFile__Group__7 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4650:1: ( rule__TMTCIFExportSettingFromFile__Group__6__Impl rule__TMTCIFExportSettingFromFile__Group__7 )
            // InternalEXPORT.g:4651:2: rule__TMTCIFExportSettingFromFile__Group__6__Impl rule__TMTCIFExportSettingFromFile__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromFile__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__6__Impl"
    // InternalEXPORT.g:4658:1: rule__TMTCIFExportSettingFromFile__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4662:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:4663:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:4663:1: ( 'toFieldRef' )
            // InternalEXPORT.g:4664:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__7"
    // InternalEXPORT.g:4673:1: rule__TMTCIFExportSettingFromFile__Group__7 : rule__TMTCIFExportSettingFromFile__Group__7__Impl rule__TMTCIFExportSettingFromFile__Group__8 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4677:1: ( rule__TMTCIFExportSettingFromFile__Group__7__Impl rule__TMTCIFExportSettingFromFile__Group__8 )
            // InternalEXPORT.g:4678:2: rule__TMTCIFExportSettingFromFile__Group__7__Impl rule__TMTCIFExportSettingFromFile__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingFromFile__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__7__Impl"
    // InternalEXPORT.g:4685:1: rule__TMTCIFExportSettingFromFile__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4689:1: ( ( ':=' ) )
            // InternalEXPORT.g:4690:1: ( ':=' )
            {
            // InternalEXPORT.g:4690:1: ( ':=' )
            // InternalEXPORT.g:4691:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__8"
    // InternalEXPORT.g:4700:1: rule__TMTCIFExportSettingFromFile__Group__8 : rule__TMTCIFExportSettingFromFile__Group__8__Impl rule__TMTCIFExportSettingFromFile__Group__9 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4704:1: ( rule__TMTCIFExportSettingFromFile__Group__8__Impl rule__TMTCIFExportSettingFromFile__Group__9 )
            // InternalEXPORT.g:4705:2: rule__TMTCIFExportSettingFromFile__Group__8__Impl rule__TMTCIFExportSettingFromFile__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__8__Impl"
    // InternalEXPORT.g:4712:1: rule__TMTCIFExportSettingFromFile__Group__8__Impl : ( ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4716:1: ( ( ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:4717:1: ( ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:4717:1: ( ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:4718:2: ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:4719:2: ( rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:4719:3: rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__9"
    // InternalEXPORT.g:4727:1: rule__TMTCIFExportSettingFromFile__Group__9 : rule__TMTCIFExportSettingFromFile__Group__9__Impl rule__TMTCIFExportSettingFromFile__Group__10 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4731:1: ( rule__TMTCIFExportSettingFromFile__Group__9__Impl rule__TMTCIFExportSettingFromFile__Group__10 )
            // InternalEXPORT.g:4732:2: rule__TMTCIFExportSettingFromFile__Group__9__Impl rule__TMTCIFExportSettingFromFile__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingFromFile__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__9__Impl"
    // InternalEXPORT.g:4739:1: rule__TMTCIFExportSettingFromFile__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4743:1: ( ( ';' ) )
            // InternalEXPORT.g:4744:1: ( ';' )
            {
            // InternalEXPORT.g:4744:1: ( ';' )
            // InternalEXPORT.g:4745:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__10"
    // InternalEXPORT.g:4754:1: rule__TMTCIFExportSettingFromFile__Group__10 : rule__TMTCIFExportSettingFromFile__Group__10__Impl rule__TMTCIFExportSettingFromFile__Group__11 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4758:1: ( rule__TMTCIFExportSettingFromFile__Group__10__Impl rule__TMTCIFExportSettingFromFile__Group__11 )
            // InternalEXPORT.g:4759:2: rule__TMTCIFExportSettingFromFile__Group__10__Impl rule__TMTCIFExportSettingFromFile__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingFromFile__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__10__Impl"
    // InternalEXPORT.g:4766:1: rule__TMTCIFExportSettingFromFile__Group__10__Impl : ( ( rule__TMTCIFExportSettingFromFile__Group_10__0 )? ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4770:1: ( ( ( rule__TMTCIFExportSettingFromFile__Group_10__0 )? ) )
            // InternalEXPORT.g:4771:1: ( ( rule__TMTCIFExportSettingFromFile__Group_10__0 )? )
            {
            // InternalEXPORT.g:4771:1: ( ( rule__TMTCIFExportSettingFromFile__Group_10__0 )? )
            // InternalEXPORT.g:4772:2: ( rule__TMTCIFExportSettingFromFile__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_10()); 
            }
            // InternalEXPORT.g:4773:2: ( rule__TMTCIFExportSettingFromFile__Group_10__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEXPORT.g:4773:3: rule__TMTCIFExportSettingFromFile__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingFromFile__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__11"
    // InternalEXPORT.g:4781:1: rule__TMTCIFExportSettingFromFile__Group__11 : rule__TMTCIFExportSettingFromFile__Group__11__Impl rule__TMTCIFExportSettingFromFile__Group__12 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4785:1: ( rule__TMTCIFExportSettingFromFile__Group__11__Impl rule__TMTCIFExportSettingFromFile__Group__12 )
            // InternalEXPORT.g:4786:2: rule__TMTCIFExportSettingFromFile__Group__11__Impl rule__TMTCIFExportSettingFromFile__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingFromFile__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__11__Impl"
    // InternalEXPORT.g:4793:1: rule__TMTCIFExportSettingFromFile__Group__11__Impl : ( ( rule__TMTCIFExportSettingFromFile__Group_11__0 )? ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4797:1: ( ( ( rule__TMTCIFExportSettingFromFile__Group_11__0 )? ) )
            // InternalEXPORT.g:4798:1: ( ( rule__TMTCIFExportSettingFromFile__Group_11__0 )? )
            {
            // InternalEXPORT.g:4798:1: ( ( rule__TMTCIFExportSettingFromFile__Group_11__0 )? )
            // InternalEXPORT.g:4799:2: ( rule__TMTCIFExportSettingFromFile__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_11()); 
            }
            // InternalEXPORT.g:4800:2: ( rule__TMTCIFExportSettingFromFile__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEXPORT.g:4800:3: rule__TMTCIFExportSettingFromFile__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingFromFile__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__12"
    // InternalEXPORT.g:4808:1: rule__TMTCIFExportSettingFromFile__Group__12 : rule__TMTCIFExportSettingFromFile__Group__12__Impl rule__TMTCIFExportSettingFromFile__Group__13 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4812:1: ( rule__TMTCIFExportSettingFromFile__Group__12__Impl rule__TMTCIFExportSettingFromFile__Group__13 )
            // InternalEXPORT.g:4813:2: rule__TMTCIFExportSettingFromFile__Group__12__Impl rule__TMTCIFExportSettingFromFile__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingFromFile__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__12"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__12__Impl"
    // InternalEXPORT.g:4820:1: rule__TMTCIFExportSettingFromFile__Group__12__Impl : ( ( rule__TMTCIFExportSettingFromFile__Group_12__0 )? ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4824:1: ( ( ( rule__TMTCIFExportSettingFromFile__Group_12__0 )? ) )
            // InternalEXPORT.g:4825:1: ( ( rule__TMTCIFExportSettingFromFile__Group_12__0 )? )
            {
            // InternalEXPORT.g:4825:1: ( ( rule__TMTCIFExportSettingFromFile__Group_12__0 )? )
            // InternalEXPORT.g:4826:2: ( rule__TMTCIFExportSettingFromFile__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_12()); 
            }
            // InternalEXPORT.g:4827:2: ( rule__TMTCIFExportSettingFromFile__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEXPORT.g:4827:3: rule__TMTCIFExportSettingFromFile__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingFromFile__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__13"
    // InternalEXPORT.g:4835:1: rule__TMTCIFExportSettingFromFile__Group__13 : rule__TMTCIFExportSettingFromFile__Group__13__Impl rule__TMTCIFExportSettingFromFile__Group__14 ;
    public final void rule__TMTCIFExportSettingFromFile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4839:1: ( rule__TMTCIFExportSettingFromFile__Group__13__Impl rule__TMTCIFExportSettingFromFile__Group__14 )
            // InternalEXPORT.g:4840:2: rule__TMTCIFExportSettingFromFile__Group__13__Impl rule__TMTCIFExportSettingFromFile__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__13"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__13__Impl"
    // InternalEXPORT.g:4847:1: rule__TMTCIFExportSettingFromFile__Group__13__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4851:1: ( ( '}' ) )
            // InternalEXPORT.g:4852:1: ( '}' )
            {
            // InternalEXPORT.g:4852:1: ( '}' )
            // InternalEXPORT.g:4853:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__14"
    // InternalEXPORT.g:4862:1: rule__TMTCIFExportSettingFromFile__Group__14 : rule__TMTCIFExportSettingFromFile__Group__14__Impl ;
    public final void rule__TMTCIFExportSettingFromFile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4866:1: ( rule__TMTCIFExportSettingFromFile__Group__14__Impl )
            // InternalEXPORT.g:4867:2: rule__TMTCIFExportSettingFromFile__Group__14__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__14"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group__14__Impl"
    // InternalEXPORT.g:4873:1: rule__TMTCIFExportSettingFromFile__Group__14__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4877:1: ( ( ';' ) )
            // InternalEXPORT.g:4878:1: ( ';' )
            {
            // InternalEXPORT.g:4878:1: ( ';' )
            // InternalEXPORT.g:4879:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__0"
    // InternalEXPORT.g:4889:1: rule__TMTCIFExportSettingFromFile__Group_10__0 : rule__TMTCIFExportSettingFromFile__Group_10__0__Impl rule__TMTCIFExportSettingFromFile__Group_10__1 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4893:1: ( rule__TMTCIFExportSettingFromFile__Group_10__0__Impl rule__TMTCIFExportSettingFromFile__Group_10__1 )
            // InternalEXPORT.g:4894:2: rule__TMTCIFExportSettingFromFile__Group_10__0__Impl rule__TMTCIFExportSettingFromFile__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromFile__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__0__Impl"
    // InternalEXPORT.g:4901:1: rule__TMTCIFExportSettingFromFile__Group_10__0__Impl : ( 'offset' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4905:1: ( ( 'offset' ) )
            // InternalEXPORT.g:4906:1: ( 'offset' )
            {
            // InternalEXPORT.g:4906:1: ( 'offset' )
            // InternalEXPORT.g:4907:2: 'offset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__1"
    // InternalEXPORT.g:4916:1: rule__TMTCIFExportSettingFromFile__Group_10__1 : rule__TMTCIFExportSettingFromFile__Group_10__1__Impl rule__TMTCIFExportSettingFromFile__Group_10__2 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4920:1: ( rule__TMTCIFExportSettingFromFile__Group_10__1__Impl rule__TMTCIFExportSettingFromFile__Group_10__2 )
            // InternalEXPORT.g:4921:2: rule__TMTCIFExportSettingFromFile__Group_10__1__Impl rule__TMTCIFExportSettingFromFile__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingFromFile__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__1__Impl"
    // InternalEXPORT.g:4928:1: rule__TMTCIFExportSettingFromFile__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4932:1: ( ( ':=' ) )
            // InternalEXPORT.g:4933:1: ( ':=' )
            {
            // InternalEXPORT.g:4933:1: ( ':=' )
            // InternalEXPORT.g:4934:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__2"
    // InternalEXPORT.g:4943:1: rule__TMTCIFExportSettingFromFile__Group_10__2 : rule__TMTCIFExportSettingFromFile__Group_10__2__Impl rule__TMTCIFExportSettingFromFile__Group_10__3 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4947:1: ( rule__TMTCIFExportSettingFromFile__Group_10__2__Impl rule__TMTCIFExportSettingFromFile__Group_10__3 )
            // InternalEXPORT.g:4948:2: rule__TMTCIFExportSettingFromFile__Group_10__2__Impl rule__TMTCIFExportSettingFromFile__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__2__Impl"
    // InternalEXPORT.g:4955:1: rule__TMTCIFExportSettingFromFile__Group_10__2__Impl : ( ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4959:1: ( ( ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 ) ) )
            // InternalEXPORT.g:4960:1: ( ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 ) )
            {
            // InternalEXPORT.g:4960:1: ( ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 ) )
            // InternalEXPORT.g:4961:2: ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetAssignment_10_2()); 
            }
            // InternalEXPORT.g:4962:2: ( rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 )
            // InternalEXPORT.g:4962:3: rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__3"
    // InternalEXPORT.g:4970:1: rule__TMTCIFExportSettingFromFile__Group_10__3 : rule__TMTCIFExportSettingFromFile__Group_10__3__Impl ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4974:1: ( rule__TMTCIFExportSettingFromFile__Group_10__3__Impl )
            // InternalEXPORT.g:4975:2: rule__TMTCIFExportSettingFromFile__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_10__3__Impl"
    // InternalEXPORT.g:4981:1: rule__TMTCIFExportSettingFromFile__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:4985:1: ( ( ';' ) )
            // InternalEXPORT.g:4986:1: ( ';' )
            {
            // InternalEXPORT.g:4986:1: ( ';' )
            // InternalEXPORT.g:4987:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__0"
    // InternalEXPORT.g:4997:1: rule__TMTCIFExportSettingFromFile__Group_11__0 : rule__TMTCIFExportSettingFromFile__Group_11__0__Impl rule__TMTCIFExportSettingFromFile__Group_11__1 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5001:1: ( rule__TMTCIFExportSettingFromFile__Group_11__0__Impl rule__TMTCIFExportSettingFromFile__Group_11__1 )
            // InternalEXPORT.g:5002:2: rule__TMTCIFExportSettingFromFile__Group_11__0__Impl rule__TMTCIFExportSettingFromFile__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromFile__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__0__Impl"
    // InternalEXPORT.g:5009:1: rule__TMTCIFExportSettingFromFile__Group_11__0__Impl : ( 'size' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5013:1: ( ( 'size' ) )
            // InternalEXPORT.g:5014:1: ( 'size' )
            {
            // InternalEXPORT.g:5014:1: ( 'size' )
            // InternalEXPORT.g:5015:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__1"
    // InternalEXPORT.g:5024:1: rule__TMTCIFExportSettingFromFile__Group_11__1 : rule__TMTCIFExportSettingFromFile__Group_11__1__Impl rule__TMTCIFExportSettingFromFile__Group_11__2 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5028:1: ( rule__TMTCIFExportSettingFromFile__Group_11__1__Impl rule__TMTCIFExportSettingFromFile__Group_11__2 )
            // InternalEXPORT.g:5029:2: rule__TMTCIFExportSettingFromFile__Group_11__1__Impl rule__TMTCIFExportSettingFromFile__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingFromFile__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__1__Impl"
    // InternalEXPORT.g:5036:1: rule__TMTCIFExportSettingFromFile__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5040:1: ( ( ':=' ) )
            // InternalEXPORT.g:5041:1: ( ':=' )
            {
            // InternalEXPORT.g:5041:1: ( ':=' )
            // InternalEXPORT.g:5042:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__2"
    // InternalEXPORT.g:5051:1: rule__TMTCIFExportSettingFromFile__Group_11__2 : rule__TMTCIFExportSettingFromFile__Group_11__2__Impl rule__TMTCIFExportSettingFromFile__Group_11__3 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5055:1: ( rule__TMTCIFExportSettingFromFile__Group_11__2__Impl rule__TMTCIFExportSettingFromFile__Group_11__3 )
            // InternalEXPORT.g:5056:2: rule__TMTCIFExportSettingFromFile__Group_11__2__Impl rule__TMTCIFExportSettingFromFile__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__2__Impl"
    // InternalEXPORT.g:5063:1: rule__TMTCIFExportSettingFromFile__Group_11__2__Impl : ( ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5067:1: ( ( ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 ) ) )
            // InternalEXPORT.g:5068:1: ( ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 ) )
            {
            // InternalEXPORT.g:5068:1: ( ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 ) )
            // InternalEXPORT.g:5069:2: ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeAssignment_11_2()); 
            }
            // InternalEXPORT.g:5070:2: ( rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 )
            // InternalEXPORT.g:5070:3: rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__3"
    // InternalEXPORT.g:5078:1: rule__TMTCIFExportSettingFromFile__Group_11__3 : rule__TMTCIFExportSettingFromFile__Group_11__3__Impl ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5082:1: ( rule__TMTCIFExportSettingFromFile__Group_11__3__Impl )
            // InternalEXPORT.g:5083:2: rule__TMTCIFExportSettingFromFile__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_11__3__Impl"
    // InternalEXPORT.g:5089:1: rule__TMTCIFExportSettingFromFile__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5093:1: ( ( ';' ) )
            // InternalEXPORT.g:5094:1: ( ';' )
            {
            // InternalEXPORT.g:5094:1: ( ';' )
            // InternalEXPORT.g:5095:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_11__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__0"
    // InternalEXPORT.g:5105:1: rule__TMTCIFExportSettingFromFile__Group_12__0 : rule__TMTCIFExportSettingFromFile__Group_12__0__Impl rule__TMTCIFExportSettingFromFile__Group_12__1 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5109:1: ( rule__TMTCIFExportSettingFromFile__Group_12__0__Impl rule__TMTCIFExportSettingFromFile__Group_12__1 )
            // InternalEXPORT.g:5110:2: rule__TMTCIFExportSettingFromFile__Group_12__0__Impl rule__TMTCIFExportSettingFromFile__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromFile__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__0__Impl"
    // InternalEXPORT.g:5117:1: rule__TMTCIFExportSettingFromFile__Group_12__0__Impl : ( 'line' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5121:1: ( ( 'line' ) )
            // InternalEXPORT.g:5122:1: ( 'line' )
            {
            // InternalEXPORT.g:5122:1: ( 'line' )
            // InternalEXPORT.g:5123:2: 'line'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__1"
    // InternalEXPORT.g:5132:1: rule__TMTCIFExportSettingFromFile__Group_12__1 : rule__TMTCIFExportSettingFromFile__Group_12__1__Impl rule__TMTCIFExportSettingFromFile__Group_12__2 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5136:1: ( rule__TMTCIFExportSettingFromFile__Group_12__1__Impl rule__TMTCIFExportSettingFromFile__Group_12__2 )
            // InternalEXPORT.g:5137:2: rule__TMTCIFExportSettingFromFile__Group_12__1__Impl rule__TMTCIFExportSettingFromFile__Group_12__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingFromFile__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__1__Impl"
    // InternalEXPORT.g:5144:1: rule__TMTCIFExportSettingFromFile__Group_12__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5148:1: ( ( ':=' ) )
            // InternalEXPORT.g:5149:1: ( ':=' )
            {
            // InternalEXPORT.g:5149:1: ( ':=' )
            // InternalEXPORT.g:5150:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__2"
    // InternalEXPORT.g:5159:1: rule__TMTCIFExportSettingFromFile__Group_12__2 : rule__TMTCIFExportSettingFromFile__Group_12__2__Impl rule__TMTCIFExportSettingFromFile__Group_12__3 ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5163:1: ( rule__TMTCIFExportSettingFromFile__Group_12__2__Impl rule__TMTCIFExportSettingFromFile__Group_12__3 )
            // InternalEXPORT.g:5164:2: rule__TMTCIFExportSettingFromFile__Group_12__2__Impl rule__TMTCIFExportSettingFromFile__Group_12__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromFile__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_12__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__2__Impl"
    // InternalEXPORT.g:5171:1: rule__TMTCIFExportSettingFromFile__Group_12__2__Impl : ( ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5175:1: ( ( ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 ) ) )
            // InternalEXPORT.g:5176:1: ( ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 ) )
            {
            // InternalEXPORT.g:5176:1: ( ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 ) )
            // InternalEXPORT.g:5177:2: ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineAssignment_12_2()); 
            }
            // InternalEXPORT.g:5178:2: ( rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 )
            // InternalEXPORT.g:5178:3: rule__TMTCIFExportSettingFromFile__LineAssignment_12_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__LineAssignment_12_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineAssignment_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__3"
    // InternalEXPORT.g:5186:1: rule__TMTCIFExportSettingFromFile__Group_12__3 : rule__TMTCIFExportSettingFromFile__Group_12__3__Impl ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5190:1: ( rule__TMTCIFExportSettingFromFile__Group_12__3__Impl )
            // InternalEXPORT.g:5191:2: rule__TMTCIFExportSettingFromFile__Group_12__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromFile__Group_12__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__Group_12__3__Impl"
    // InternalEXPORT.g:5197:1: rule__TMTCIFExportSettingFromFile__Group_12__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromFile__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5201:1: ( ( ';' ) )
            // InternalEXPORT.g:5202:1: ( ';' )
            {
            // InternalEXPORT.g:5202:1: ( ';' )
            // InternalEXPORT.g:5203:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSemicolonKeyword_12_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__Group_12__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__0"
    // InternalEXPORT.g:5213:1: rule__TMTCIFExportSettingFromField__Group__0 : rule__TMTCIFExportSettingFromField__Group__0__Impl rule__TMTCIFExportSettingFromField__Group__1 ;
    public final void rule__TMTCIFExportSettingFromField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5217:1: ( rule__TMTCIFExportSettingFromField__Group__0__Impl rule__TMTCIFExportSettingFromField__Group__1 )
            // InternalEXPORT.g:5218:2: rule__TMTCIFExportSettingFromField__Group__0__Impl rule__TMTCIFExportSettingFromField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingFromField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__0__Impl"
    // InternalEXPORT.g:5225:1: rule__TMTCIFExportSettingFromField__Group__0__Impl : ( 'TMTCIFExportSettingFromField' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5229:1: ( ( 'TMTCIFExportSettingFromField' ) )
            // InternalEXPORT.g:5230:1: ( 'TMTCIFExportSettingFromField' )
            {
            // InternalEXPORT.g:5230:1: ( 'TMTCIFExportSettingFromField' )
            // InternalEXPORT.g:5231:2: 'TMTCIFExportSettingFromField'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getTMTCIFExportSettingFromFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__1"
    // InternalEXPORT.g:5240:1: rule__TMTCIFExportSettingFromField__Group__1 : rule__TMTCIFExportSettingFromField__Group__1__Impl rule__TMTCIFExportSettingFromField__Group__2 ;
    public final void rule__TMTCIFExportSettingFromField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5244:1: ( rule__TMTCIFExportSettingFromField__Group__1__Impl rule__TMTCIFExportSettingFromField__Group__2 )
            // InternalEXPORT.g:5245:2: rule__TMTCIFExportSettingFromField__Group__1__Impl rule__TMTCIFExportSettingFromField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__TMTCIFExportSettingFromField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__1__Impl"
    // InternalEXPORT.g:5252:1: rule__TMTCIFExportSettingFromField__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5256:1: ( ( '{' ) )
            // InternalEXPORT.g:5257:1: ( '{' )
            {
            // InternalEXPORT.g:5257:1: ( '{' )
            // InternalEXPORT.g:5258:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__2"
    // InternalEXPORT.g:5267:1: rule__TMTCIFExportSettingFromField__Group__2 : rule__TMTCIFExportSettingFromField__Group__2__Impl rule__TMTCIFExportSettingFromField__Group__3 ;
    public final void rule__TMTCIFExportSettingFromField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5271:1: ( rule__TMTCIFExportSettingFromField__Group__2__Impl rule__TMTCIFExportSettingFromField__Group__3 )
            // InternalEXPORT.g:5272:2: rule__TMTCIFExportSettingFromField__Group__2__Impl rule__TMTCIFExportSettingFromField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__2__Impl"
    // InternalEXPORT.g:5279:1: rule__TMTCIFExportSettingFromField__Group__2__Impl : ( 'fieldRef' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5283:1: ( ( 'fieldRef' ) )
            // InternalEXPORT.g:5284:1: ( 'fieldRef' )
            {
            // InternalEXPORT.g:5284:1: ( 'fieldRef' )
            // InternalEXPORT.g:5285:2: 'fieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__3"
    // InternalEXPORT.g:5294:1: rule__TMTCIFExportSettingFromField__Group__3 : rule__TMTCIFExportSettingFromField__Group__3__Impl rule__TMTCIFExportSettingFromField__Group__4 ;
    public final void rule__TMTCIFExportSettingFromField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5298:1: ( rule__TMTCIFExportSettingFromField__Group__3__Impl rule__TMTCIFExportSettingFromField__Group__4 )
            // InternalEXPORT.g:5299:2: rule__TMTCIFExportSettingFromField__Group__3__Impl rule__TMTCIFExportSettingFromField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingFromField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__3__Impl"
    // InternalEXPORT.g:5306:1: rule__TMTCIFExportSettingFromField__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5310:1: ( ( ':=' ) )
            // InternalEXPORT.g:5311:1: ( ':=' )
            {
            // InternalEXPORT.g:5311:1: ( ':=' )
            // InternalEXPORT.g:5312:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__4"
    // InternalEXPORT.g:5321:1: rule__TMTCIFExportSettingFromField__Group__4 : rule__TMTCIFExportSettingFromField__Group__4__Impl rule__TMTCIFExportSettingFromField__Group__5 ;
    public final void rule__TMTCIFExportSettingFromField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5325:1: ( rule__TMTCIFExportSettingFromField__Group__4__Impl rule__TMTCIFExportSettingFromField__Group__5 )
            // InternalEXPORT.g:5326:2: rule__TMTCIFExportSettingFromField__Group__4__Impl rule__TMTCIFExportSettingFromField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__4__Impl"
    // InternalEXPORT.g:5333:1: rule__TMTCIFExportSettingFromField__Group__4__Impl : ( ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5337:1: ( ( ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 ) ) )
            // InternalEXPORT.g:5338:1: ( ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 ) )
            {
            // InternalEXPORT.g:5338:1: ( ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 ) )
            // InternalEXPORT.g:5339:2: ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefAssignment_4()); 
            }
            // InternalEXPORT.g:5340:2: ( rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 )
            // InternalEXPORT.g:5340:3: rule__TMTCIFExportSettingFromField__FieldRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__FieldRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__5"
    // InternalEXPORT.g:5348:1: rule__TMTCIFExportSettingFromField__Group__5 : rule__TMTCIFExportSettingFromField__Group__5__Impl rule__TMTCIFExportSettingFromField__Group__6 ;
    public final void rule__TMTCIFExportSettingFromField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5352:1: ( rule__TMTCIFExportSettingFromField__Group__5__Impl rule__TMTCIFExportSettingFromField__Group__6 )
            // InternalEXPORT.g:5353:2: rule__TMTCIFExportSettingFromField__Group__5__Impl rule__TMTCIFExportSettingFromField__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingFromField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__5__Impl"
    // InternalEXPORT.g:5360:1: rule__TMTCIFExportSettingFromField__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5364:1: ( ( ';' ) )
            // InternalEXPORT.g:5365:1: ( ';' )
            {
            // InternalEXPORT.g:5365:1: ( ';' )
            // InternalEXPORT.g:5366:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__6"
    // InternalEXPORT.g:5375:1: rule__TMTCIFExportSettingFromField__Group__6 : rule__TMTCIFExportSettingFromField__Group__6__Impl rule__TMTCIFExportSettingFromField__Group__7 ;
    public final void rule__TMTCIFExportSettingFromField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5379:1: ( rule__TMTCIFExportSettingFromField__Group__6__Impl rule__TMTCIFExportSettingFromField__Group__7 )
            // InternalEXPORT.g:5380:2: rule__TMTCIFExportSettingFromField__Group__6__Impl rule__TMTCIFExportSettingFromField__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingFromField__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__6__Impl"
    // InternalEXPORT.g:5387:1: rule__TMTCIFExportSettingFromField__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5391:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:5392:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:5392:1: ( 'toFieldRef' )
            // InternalEXPORT.g:5393:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__7"
    // InternalEXPORT.g:5402:1: rule__TMTCIFExportSettingFromField__Group__7 : rule__TMTCIFExportSettingFromField__Group__7__Impl rule__TMTCIFExportSettingFromField__Group__8 ;
    public final void rule__TMTCIFExportSettingFromField__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5406:1: ( rule__TMTCIFExportSettingFromField__Group__7__Impl rule__TMTCIFExportSettingFromField__Group__8 )
            // InternalEXPORT.g:5407:2: rule__TMTCIFExportSettingFromField__Group__7__Impl rule__TMTCIFExportSettingFromField__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingFromField__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__7__Impl"
    // InternalEXPORT.g:5414:1: rule__TMTCIFExportSettingFromField__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5418:1: ( ( ':=' ) )
            // InternalEXPORT.g:5419:1: ( ':=' )
            {
            // InternalEXPORT.g:5419:1: ( ':=' )
            // InternalEXPORT.g:5420:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__8"
    // InternalEXPORT.g:5429:1: rule__TMTCIFExportSettingFromField__Group__8 : rule__TMTCIFExportSettingFromField__Group__8__Impl rule__TMTCIFExportSettingFromField__Group__9 ;
    public final void rule__TMTCIFExportSettingFromField__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5433:1: ( rule__TMTCIFExportSettingFromField__Group__8__Impl rule__TMTCIFExportSettingFromField__Group__9 )
            // InternalEXPORT.g:5434:2: rule__TMTCIFExportSettingFromField__Group__8__Impl rule__TMTCIFExportSettingFromField__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromField__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__8__Impl"
    // InternalEXPORT.g:5441:1: rule__TMTCIFExportSettingFromField__Group__8__Impl : ( ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5445:1: ( ( ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:5446:1: ( ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:5446:1: ( ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:5447:2: ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:5448:2: ( rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:5448:3: rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__9"
    // InternalEXPORT.g:5456:1: rule__TMTCIFExportSettingFromField__Group__9 : rule__TMTCIFExportSettingFromField__Group__9__Impl rule__TMTCIFExportSettingFromField__Group__10 ;
    public final void rule__TMTCIFExportSettingFromField__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5460:1: ( rule__TMTCIFExportSettingFromField__Group__9__Impl rule__TMTCIFExportSettingFromField__Group__10 )
            // InternalEXPORT.g:5461:2: rule__TMTCIFExportSettingFromField__Group__9__Impl rule__TMTCIFExportSettingFromField__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportSettingFromField__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__9__Impl"
    // InternalEXPORT.g:5468:1: rule__TMTCIFExportSettingFromField__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5472:1: ( ( ';' ) )
            // InternalEXPORT.g:5473:1: ( ';' )
            {
            // InternalEXPORT.g:5473:1: ( ';' )
            // InternalEXPORT.g:5474:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__10"
    // InternalEXPORT.g:5483:1: rule__TMTCIFExportSettingFromField__Group__10 : rule__TMTCIFExportSettingFromField__Group__10__Impl rule__TMTCIFExportSettingFromField__Group__11 ;
    public final void rule__TMTCIFExportSettingFromField__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5487:1: ( rule__TMTCIFExportSettingFromField__Group__10__Impl rule__TMTCIFExportSettingFromField__Group__11 )
            // InternalEXPORT.g:5488:2: rule__TMTCIFExportSettingFromField__Group__10__Impl rule__TMTCIFExportSettingFromField__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingFromField__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__10__Impl"
    // InternalEXPORT.g:5495:1: rule__TMTCIFExportSettingFromField__Group__10__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5499:1: ( ( '}' ) )
            // InternalEXPORT.g:5500:1: ( '}' )
            {
            // InternalEXPORT.g:5500:1: ( '}' )
            // InternalEXPORT.g:5501:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__11"
    // InternalEXPORT.g:5510:1: rule__TMTCIFExportSettingFromField__Group__11 : rule__TMTCIFExportSettingFromField__Group__11__Impl ;
    public final void rule__TMTCIFExportSettingFromField__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5514:1: ( rule__TMTCIFExportSettingFromField__Group__11__Impl )
            // InternalEXPORT.g:5515:2: rule__TMTCIFExportSettingFromField__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingFromField__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__Group__11__Impl"
    // InternalEXPORT.g:5521:1: rule__TMTCIFExportSettingFromField__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingFromField__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5525:1: ( ( ';' ) )
            // InternalEXPORT.g:5526:1: ( ';' )
            {
            // InternalEXPORT.g:5526:1: ( ';' )
            // InternalEXPORT.g:5527:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__0"
    // InternalEXPORT.g:5537:1: rule__TMTCIFExportSettingAIFromConst__Group__0 : rule__TMTCIFExportSettingAIFromConst__Group__0__Impl rule__TMTCIFExportSettingAIFromConst__Group__1 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5541:1: ( rule__TMTCIFExportSettingAIFromConst__Group__0__Impl rule__TMTCIFExportSettingAIFromConst__Group__1 )
            // InternalEXPORT.g:5542:2: rule__TMTCIFExportSettingAIFromConst__Group__0__Impl rule__TMTCIFExportSettingAIFromConst__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingAIFromConst__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__0__Impl"
    // InternalEXPORT.g:5549:1: rule__TMTCIFExportSettingAIFromConst__Group__0__Impl : ( 'TMTCIFExportSettingAIFromConst' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5553:1: ( ( 'TMTCIFExportSettingAIFromConst' ) )
            // InternalEXPORT.g:5554:1: ( 'TMTCIFExportSettingAIFromConst' )
            {
            // InternalEXPORT.g:5554:1: ( 'TMTCIFExportSettingAIFromConst' )
            // InternalEXPORT.g:5555:2: 'TMTCIFExportSettingAIFromConst'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getTMTCIFExportSettingAIFromConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__1"
    // InternalEXPORT.g:5564:1: rule__TMTCIFExportSettingAIFromConst__Group__1 : rule__TMTCIFExportSettingAIFromConst__Group__1__Impl rule__TMTCIFExportSettingAIFromConst__Group__2 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5568:1: ( rule__TMTCIFExportSettingAIFromConst__Group__1__Impl rule__TMTCIFExportSettingAIFromConst__Group__2 )
            // InternalEXPORT.g:5569:2: rule__TMTCIFExportSettingAIFromConst__Group__1__Impl rule__TMTCIFExportSettingAIFromConst__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__TMTCIFExportSettingAIFromConst__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__1__Impl"
    // InternalEXPORT.g:5576:1: rule__TMTCIFExportSettingAIFromConst__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5580:1: ( ( '{' ) )
            // InternalEXPORT.g:5581:1: ( '{' )
            {
            // InternalEXPORT.g:5581:1: ( '{' )
            // InternalEXPORT.g:5582:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__2"
    // InternalEXPORT.g:5591:1: rule__TMTCIFExportSettingAIFromConst__Group__2 : rule__TMTCIFExportSettingAIFromConst__Group__2__Impl rule__TMTCIFExportSettingAIFromConst__Group__3 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5595:1: ( rule__TMTCIFExportSettingAIFromConst__Group__2__Impl rule__TMTCIFExportSettingAIFromConst__Group__3 )
            // InternalEXPORT.g:5596:2: rule__TMTCIFExportSettingAIFromConst__Group__2__Impl rule__TMTCIFExportSettingAIFromConst__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromConst__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__2__Impl"
    // InternalEXPORT.g:5603:1: rule__TMTCIFExportSettingAIFromConst__Group__2__Impl : ( 'value' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5607:1: ( ( 'value' ) )
            // InternalEXPORT.g:5608:1: ( 'value' )
            {
            // InternalEXPORT.g:5608:1: ( 'value' )
            // InternalEXPORT.g:5609:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__3"
    // InternalEXPORT.g:5618:1: rule__TMTCIFExportSettingAIFromConst__Group__3 : rule__TMTCIFExportSettingAIFromConst__Group__3__Impl rule__TMTCIFExportSettingAIFromConst__Group__4 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5622:1: ( rule__TMTCIFExportSettingAIFromConst__Group__3__Impl rule__TMTCIFExportSettingAIFromConst__Group__4 )
            // InternalEXPORT.g:5623:2: rule__TMTCIFExportSettingAIFromConst__Group__3__Impl rule__TMTCIFExportSettingAIFromConst__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromConst__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__3__Impl"
    // InternalEXPORT.g:5630:1: rule__TMTCIFExportSettingAIFromConst__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5634:1: ( ( ':=' ) )
            // InternalEXPORT.g:5635:1: ( ':=' )
            {
            // InternalEXPORT.g:5635:1: ( ':=' )
            // InternalEXPORT.g:5636:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__4"
    // InternalEXPORT.g:5645:1: rule__TMTCIFExportSettingAIFromConst__Group__4 : rule__TMTCIFExportSettingAIFromConst__Group__4__Impl rule__TMTCIFExportSettingAIFromConst__Group__5 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5649:1: ( rule__TMTCIFExportSettingAIFromConst__Group__4__Impl rule__TMTCIFExportSettingAIFromConst__Group__5 )
            // InternalEXPORT.g:5650:2: rule__TMTCIFExportSettingAIFromConst__Group__4__Impl rule__TMTCIFExportSettingAIFromConst__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromConst__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__4__Impl"
    // InternalEXPORT.g:5657:1: rule__TMTCIFExportSettingAIFromConst__Group__4__Impl : ( ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5661:1: ( ( ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 ) ) )
            // InternalEXPORT.g:5662:1: ( ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 ) )
            {
            // InternalEXPORT.g:5662:1: ( ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 ) )
            // InternalEXPORT.g:5663:2: ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueAssignment_4()); 
            }
            // InternalEXPORT.g:5664:2: ( rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 )
            // InternalEXPORT.g:5664:3: rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__5"
    // InternalEXPORT.g:5672:1: rule__TMTCIFExportSettingAIFromConst__Group__5 : rule__TMTCIFExportSettingAIFromConst__Group__5__Impl rule__TMTCIFExportSettingAIFromConst__Group__6 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5676:1: ( rule__TMTCIFExportSettingAIFromConst__Group__5__Impl rule__TMTCIFExportSettingAIFromConst__Group__6 )
            // InternalEXPORT.g:5677:2: rule__TMTCIFExportSettingAIFromConst__Group__5__Impl rule__TMTCIFExportSettingAIFromConst__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingAIFromConst__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__5__Impl"
    // InternalEXPORT.g:5684:1: rule__TMTCIFExportSettingAIFromConst__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5688:1: ( ( ';' ) )
            // InternalEXPORT.g:5689:1: ( ';' )
            {
            // InternalEXPORT.g:5689:1: ( ';' )
            // InternalEXPORT.g:5690:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__6"
    // InternalEXPORT.g:5699:1: rule__TMTCIFExportSettingAIFromConst__Group__6 : rule__TMTCIFExportSettingAIFromConst__Group__6__Impl rule__TMTCIFExportSettingAIFromConst__Group__7 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5703:1: ( rule__TMTCIFExportSettingAIFromConst__Group__6__Impl rule__TMTCIFExportSettingAIFromConst__Group__7 )
            // InternalEXPORT.g:5704:2: rule__TMTCIFExportSettingAIFromConst__Group__6__Impl rule__TMTCIFExportSettingAIFromConst__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromConst__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__6__Impl"
    // InternalEXPORT.g:5711:1: rule__TMTCIFExportSettingAIFromConst__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5715:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:5716:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:5716:1: ( 'toFieldRef' )
            // InternalEXPORT.g:5717:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__7"
    // InternalEXPORT.g:5726:1: rule__TMTCIFExportSettingAIFromConst__Group__7 : rule__TMTCIFExportSettingAIFromConst__Group__7__Impl rule__TMTCIFExportSettingAIFromConst__Group__8 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5730:1: ( rule__TMTCIFExportSettingAIFromConst__Group__7__Impl rule__TMTCIFExportSettingAIFromConst__Group__8 )
            // InternalEXPORT.g:5731:2: rule__TMTCIFExportSettingAIFromConst__Group__7__Impl rule__TMTCIFExportSettingAIFromConst__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingAIFromConst__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__7__Impl"
    // InternalEXPORT.g:5738:1: rule__TMTCIFExportSettingAIFromConst__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5742:1: ( ( ':=' ) )
            // InternalEXPORT.g:5743:1: ( ':=' )
            {
            // InternalEXPORT.g:5743:1: ( ':=' )
            // InternalEXPORT.g:5744:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__8"
    // InternalEXPORT.g:5753:1: rule__TMTCIFExportSettingAIFromConst__Group__8 : rule__TMTCIFExportSettingAIFromConst__Group__8__Impl rule__TMTCIFExportSettingAIFromConst__Group__9 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5757:1: ( rule__TMTCIFExportSettingAIFromConst__Group__8__Impl rule__TMTCIFExportSettingAIFromConst__Group__9 )
            // InternalEXPORT.g:5758:2: rule__TMTCIFExportSettingAIFromConst__Group__8__Impl rule__TMTCIFExportSettingAIFromConst__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromConst__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__8__Impl"
    // InternalEXPORT.g:5765:1: rule__TMTCIFExportSettingAIFromConst__Group__8__Impl : ( ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5769:1: ( ( ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:5770:1: ( ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:5770:1: ( ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:5771:2: ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:5772:2: ( rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:5772:3: rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__9"
    // InternalEXPORT.g:5780:1: rule__TMTCIFExportSettingAIFromConst__Group__9 : rule__TMTCIFExportSettingAIFromConst__Group__9__Impl rule__TMTCIFExportSettingAIFromConst__Group__10 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5784:1: ( rule__TMTCIFExportSettingAIFromConst__Group__9__Impl rule__TMTCIFExportSettingAIFromConst__Group__10 )
            // InternalEXPORT.g:5785:2: rule__TMTCIFExportSettingAIFromConst__Group__9__Impl rule__TMTCIFExportSettingAIFromConst__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TMTCIFExportSettingAIFromConst__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__9__Impl"
    // InternalEXPORT.g:5792:1: rule__TMTCIFExportSettingAIFromConst__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5796:1: ( ( ';' ) )
            // InternalEXPORT.g:5797:1: ( ';' )
            {
            // InternalEXPORT.g:5797:1: ( ';' )
            // InternalEXPORT.g:5798:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__10"
    // InternalEXPORT.g:5807:1: rule__TMTCIFExportSettingAIFromConst__Group__10 : rule__TMTCIFExportSettingAIFromConst__Group__10__Impl rule__TMTCIFExportSettingAIFromConst__Group__11 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5811:1: ( rule__TMTCIFExportSettingAIFromConst__Group__10__Impl rule__TMTCIFExportSettingAIFromConst__Group__11 )
            // InternalEXPORT.g:5812:2: rule__TMTCIFExportSettingAIFromConst__Group__10__Impl rule__TMTCIFExportSettingAIFromConst__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromConst__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__10__Impl"
    // InternalEXPORT.g:5819:1: rule__TMTCIFExportSettingAIFromConst__Group__10__Impl : ( 'toArrayIndex' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5823:1: ( ( 'toArrayIndex' ) )
            // InternalEXPORT.g:5824:1: ( 'toArrayIndex' )
            {
            // InternalEXPORT.g:5824:1: ( 'toArrayIndex' )
            // InternalEXPORT.g:5825:2: 'toArrayIndex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexKeyword_10()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__11"
    // InternalEXPORT.g:5834:1: rule__TMTCIFExportSettingAIFromConst__Group__11 : rule__TMTCIFExportSettingAIFromConst__Group__11__Impl rule__TMTCIFExportSettingAIFromConst__Group__12 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5838:1: ( rule__TMTCIFExportSettingAIFromConst__Group__11__Impl rule__TMTCIFExportSettingAIFromConst__Group__12 )
            // InternalEXPORT.g:5839:2: rule__TMTCIFExportSettingAIFromConst__Group__11__Impl rule__TMTCIFExportSettingAIFromConst__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromConst__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__11__Impl"
    // InternalEXPORT.g:5846:1: rule__TMTCIFExportSettingAIFromConst__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5850:1: ( ( ':=' ) )
            // InternalEXPORT.g:5851:1: ( ':=' )
            {
            // InternalEXPORT.g:5851:1: ( ':=' )
            // InternalEXPORT.g:5852:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__12"
    // InternalEXPORT.g:5861:1: rule__TMTCIFExportSettingAIFromConst__Group__12 : rule__TMTCIFExportSettingAIFromConst__Group__12__Impl rule__TMTCIFExportSettingAIFromConst__Group__13 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5865:1: ( rule__TMTCIFExportSettingAIFromConst__Group__12__Impl rule__TMTCIFExportSettingAIFromConst__Group__13 )
            // InternalEXPORT.g:5866:2: rule__TMTCIFExportSettingAIFromConst__Group__12__Impl rule__TMTCIFExportSettingAIFromConst__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromConst__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__12"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__12__Impl"
    // InternalEXPORT.g:5873:1: rule__TMTCIFExportSettingAIFromConst__Group__12__Impl : ( ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5877:1: ( ( ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 ) ) )
            // InternalEXPORT.g:5878:1: ( ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 ) )
            {
            // InternalEXPORT.g:5878:1: ( ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 ) )
            // InternalEXPORT.g:5879:2: ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexAssignment_12()); 
            }
            // InternalEXPORT.g:5880:2: ( rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 )
            // InternalEXPORT.g:5880:3: rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__13"
    // InternalEXPORT.g:5888:1: rule__TMTCIFExportSettingAIFromConst__Group__13 : rule__TMTCIFExportSettingAIFromConst__Group__13__Impl rule__TMTCIFExportSettingAIFromConst__Group__14 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5892:1: ( rule__TMTCIFExportSettingAIFromConst__Group__13__Impl rule__TMTCIFExportSettingAIFromConst__Group__14 )
            // InternalEXPORT.g:5893:2: rule__TMTCIFExportSettingAIFromConst__Group__13__Impl rule__TMTCIFExportSettingAIFromConst__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportSettingAIFromConst__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__13"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__13__Impl"
    // InternalEXPORT.g:5900:1: rule__TMTCIFExportSettingAIFromConst__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5904:1: ( ( ';' ) )
            // InternalEXPORT.g:5905:1: ( ';' )
            {
            // InternalEXPORT.g:5905:1: ( ';' )
            // InternalEXPORT.g:5906:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__14"
    // InternalEXPORT.g:5915:1: rule__TMTCIFExportSettingAIFromConst__Group__14 : rule__TMTCIFExportSettingAIFromConst__Group__14__Impl rule__TMTCIFExportSettingAIFromConst__Group__15 ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5919:1: ( rule__TMTCIFExportSettingAIFromConst__Group__14__Impl rule__TMTCIFExportSettingAIFromConst__Group__15 )
            // InternalEXPORT.g:5920:2: rule__TMTCIFExportSettingAIFromConst__Group__14__Impl rule__TMTCIFExportSettingAIFromConst__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromConst__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__14"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__14__Impl"
    // InternalEXPORT.g:5927:1: rule__TMTCIFExportSettingAIFromConst__Group__14__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5931:1: ( ( '}' ) )
            // InternalEXPORT.g:5932:1: ( '}' )
            {
            // InternalEXPORT.g:5932:1: ( '}' )
            // InternalEXPORT.g:5933:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__15"
    // InternalEXPORT.g:5942:1: rule__TMTCIFExportSettingAIFromConst__Group__15 : rule__TMTCIFExportSettingAIFromConst__Group__15__Impl ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5946:1: ( rule__TMTCIFExportSettingAIFromConst__Group__15__Impl )
            // InternalEXPORT.g:5947:2: rule__TMTCIFExportSettingAIFromConst__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromConst__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__15"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__Group__15__Impl"
    // InternalEXPORT.g:5953:1: rule__TMTCIFExportSettingAIFromConst__Group__15__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5957:1: ( ( ';' ) )
            // InternalEXPORT.g:5958:1: ( ';' )
            {
            // InternalEXPORT.g:5958:1: ( ';' )
            // InternalEXPORT.g:5959:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_15()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__0"
    // InternalEXPORT.g:5969:1: rule__TMTCIFExportSettingAIFromFile__Group__0 : rule__TMTCIFExportSettingAIFromFile__Group__0__Impl rule__TMTCIFExportSettingAIFromFile__Group__1 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5973:1: ( rule__TMTCIFExportSettingAIFromFile__Group__0__Impl rule__TMTCIFExportSettingAIFromFile__Group__1 )
            // InternalEXPORT.g:5974:2: rule__TMTCIFExportSettingAIFromFile__Group__0__Impl rule__TMTCIFExportSettingAIFromFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportSettingAIFromFile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__0"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__0__Impl"
    // InternalEXPORT.g:5981:1: rule__TMTCIFExportSettingAIFromFile__Group__0__Impl : ( 'TMTCIFExportSettingAIFromFile' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:5985:1: ( ( 'TMTCIFExportSettingAIFromFile' ) )
            // InternalEXPORT.g:5986:1: ( 'TMTCIFExportSettingAIFromFile' )
            {
            // InternalEXPORT.g:5986:1: ( 'TMTCIFExportSettingAIFromFile' )
            // InternalEXPORT.g:5987:2: 'TMTCIFExportSettingAIFromFile'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getTMTCIFExportSettingAIFromFileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__1"
    // InternalEXPORT.g:5996:1: rule__TMTCIFExportSettingAIFromFile__Group__1 : rule__TMTCIFExportSettingAIFromFile__Group__1__Impl rule__TMTCIFExportSettingAIFromFile__Group__2 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6000:1: ( rule__TMTCIFExportSettingAIFromFile__Group__1__Impl rule__TMTCIFExportSettingAIFromFile__Group__2 )
            // InternalEXPORT.g:6001:2: rule__TMTCIFExportSettingAIFromFile__Group__1__Impl rule__TMTCIFExportSettingAIFromFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TMTCIFExportSettingAIFromFile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__1"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__1__Impl"
    // InternalEXPORT.g:6008:1: rule__TMTCIFExportSettingAIFromFile__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6012:1: ( ( '{' ) )
            // InternalEXPORT.g:6013:1: ( '{' )
            {
            // InternalEXPORT.g:6013:1: ( '{' )
            // InternalEXPORT.g:6014:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__2"
    // InternalEXPORT.g:6023:1: rule__TMTCIFExportSettingAIFromFile__Group__2 : rule__TMTCIFExportSettingAIFromFile__Group__2__Impl rule__TMTCIFExportSettingAIFromFile__Group__3 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6027:1: ( rule__TMTCIFExportSettingAIFromFile__Group__2__Impl rule__TMTCIFExportSettingAIFromFile__Group__3 )
            // InternalEXPORT.g:6028:2: rule__TMTCIFExportSettingAIFromFile__Group__2__Impl rule__TMTCIFExportSettingAIFromFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__2__Impl"
    // InternalEXPORT.g:6035:1: rule__TMTCIFExportSettingAIFromFile__Group__2__Impl : ( 'file' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6039:1: ( ( 'file' ) )
            // InternalEXPORT.g:6040:1: ( 'file' )
            {
            // InternalEXPORT.g:6040:1: ( 'file' )
            // InternalEXPORT.g:6041:2: 'file'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__3"
    // InternalEXPORT.g:6050:1: rule__TMTCIFExportSettingAIFromFile__Group__3 : rule__TMTCIFExportSettingAIFromFile__Group__3__Impl rule__TMTCIFExportSettingAIFromFile__Group__4 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6054:1: ( rule__TMTCIFExportSettingAIFromFile__Group__3__Impl rule__TMTCIFExportSettingAIFromFile__Group__4 )
            // InternalEXPORT.g:6055:2: rule__TMTCIFExportSettingAIFromFile__Group__3__Impl rule__TMTCIFExportSettingAIFromFile__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportSettingAIFromFile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__3"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__3__Impl"
    // InternalEXPORT.g:6062:1: rule__TMTCIFExportSettingAIFromFile__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6066:1: ( ( ':=' ) )
            // InternalEXPORT.g:6067:1: ( ':=' )
            {
            // InternalEXPORT.g:6067:1: ( ':=' )
            // InternalEXPORT.g:6068:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__4"
    // InternalEXPORT.g:6077:1: rule__TMTCIFExportSettingAIFromFile__Group__4 : rule__TMTCIFExportSettingAIFromFile__Group__4__Impl rule__TMTCIFExportSettingAIFromFile__Group__5 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6081:1: ( rule__TMTCIFExportSettingAIFromFile__Group__4__Impl rule__TMTCIFExportSettingAIFromFile__Group__5 )
            // InternalEXPORT.g:6082:2: rule__TMTCIFExportSettingAIFromFile__Group__4__Impl rule__TMTCIFExportSettingAIFromFile__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__4"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__4__Impl"
    // InternalEXPORT.g:6089:1: rule__TMTCIFExportSettingAIFromFile__Group__4__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6093:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 ) ) )
            // InternalEXPORT.g:6094:1: ( ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 ) )
            {
            // InternalEXPORT.g:6094:1: ( ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 ) )
            // InternalEXPORT.g:6095:2: ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileAssignment_4()); 
            }
            // InternalEXPORT.g:6096:2: ( rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 )
            // InternalEXPORT.g:6096:3: rule__TMTCIFExportSettingAIFromFile__FileAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__FileAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__5"
    // InternalEXPORT.g:6104:1: rule__TMTCIFExportSettingAIFromFile__Group__5 : rule__TMTCIFExportSettingAIFromFile__Group__5__Impl rule__TMTCIFExportSettingAIFromFile__Group__6 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6108:1: ( rule__TMTCIFExportSettingAIFromFile__Group__5__Impl rule__TMTCIFExportSettingAIFromFile__Group__6 )
            // InternalEXPORT.g:6109:2: rule__TMTCIFExportSettingAIFromFile__Group__5__Impl rule__TMTCIFExportSettingAIFromFile__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__TMTCIFExportSettingAIFromFile__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__5"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__5__Impl"
    // InternalEXPORT.g:6116:1: rule__TMTCIFExportSettingAIFromFile__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6120:1: ( ( ';' ) )
            // InternalEXPORT.g:6121:1: ( ';' )
            {
            // InternalEXPORT.g:6121:1: ( ';' )
            // InternalEXPORT.g:6122:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__6"
    // InternalEXPORT.g:6131:1: rule__TMTCIFExportSettingAIFromFile__Group__6 : rule__TMTCIFExportSettingAIFromFile__Group__6__Impl rule__TMTCIFExportSettingAIFromFile__Group__7 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6135:1: ( rule__TMTCIFExportSettingAIFromFile__Group__6__Impl rule__TMTCIFExportSettingAIFromFile__Group__7 )
            // InternalEXPORT.g:6136:2: rule__TMTCIFExportSettingAIFromFile__Group__6__Impl rule__TMTCIFExportSettingAIFromFile__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__6"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__6__Impl"
    // InternalEXPORT.g:6143:1: rule__TMTCIFExportSettingAIFromFile__Group__6__Impl : ( 'toFieldRef' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6147:1: ( ( 'toFieldRef' ) )
            // InternalEXPORT.g:6148:1: ( 'toFieldRef' )
            {
            // InternalEXPORT.g:6148:1: ( 'toFieldRef' )
            // InternalEXPORT.g:6149:2: 'toFieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__7"
    // InternalEXPORT.g:6158:1: rule__TMTCIFExportSettingAIFromFile__Group__7 : rule__TMTCIFExportSettingAIFromFile__Group__7__Impl rule__TMTCIFExportSettingAIFromFile__Group__8 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6162:1: ( rule__TMTCIFExportSettingAIFromFile__Group__7__Impl rule__TMTCIFExportSettingAIFromFile__Group__8 )
            // InternalEXPORT.g:6163:2: rule__TMTCIFExportSettingAIFromFile__Group__7__Impl rule__TMTCIFExportSettingAIFromFile__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFExportSettingAIFromFile__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__7"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__7__Impl"
    // InternalEXPORT.g:6170:1: rule__TMTCIFExportSettingAIFromFile__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6174:1: ( ( ':=' ) )
            // InternalEXPORT.g:6175:1: ( ':=' )
            {
            // InternalEXPORT.g:6175:1: ( ':=' )
            // InternalEXPORT.g:6176:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__8"
    // InternalEXPORT.g:6185:1: rule__TMTCIFExportSettingAIFromFile__Group__8 : rule__TMTCIFExportSettingAIFromFile__Group__8__Impl rule__TMTCIFExportSettingAIFromFile__Group__9 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6189:1: ( rule__TMTCIFExportSettingAIFromFile__Group__8__Impl rule__TMTCIFExportSettingAIFromFile__Group__9 )
            // InternalEXPORT.g:6190:2: rule__TMTCIFExportSettingAIFromFile__Group__8__Impl rule__TMTCIFExportSettingAIFromFile__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__8"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__8__Impl"
    // InternalEXPORT.g:6197:1: rule__TMTCIFExportSettingAIFromFile__Group__8__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6201:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 ) ) )
            // InternalEXPORT.g:6202:1: ( ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 ) )
            {
            // InternalEXPORT.g:6202:1: ( ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 ) )
            // InternalEXPORT.g:6203:2: ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); 
            }
            // InternalEXPORT.g:6204:2: ( rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 )
            // InternalEXPORT.g:6204:3: rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__9"
    // InternalEXPORT.g:6212:1: rule__TMTCIFExportSettingAIFromFile__Group__9 : rule__TMTCIFExportSettingAIFromFile__Group__9__Impl rule__TMTCIFExportSettingAIFromFile__Group__10 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6216:1: ( rule__TMTCIFExportSettingAIFromFile__Group__9__Impl rule__TMTCIFExportSettingAIFromFile__Group__10 )
            // InternalEXPORT.g:6217:2: rule__TMTCIFExportSettingAIFromFile__Group__9__Impl rule__TMTCIFExportSettingAIFromFile__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__TMTCIFExportSettingAIFromFile__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__9"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__9__Impl"
    // InternalEXPORT.g:6224:1: rule__TMTCIFExportSettingAIFromFile__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6228:1: ( ( ';' ) )
            // InternalEXPORT.g:6229:1: ( ';' )
            {
            // InternalEXPORT.g:6229:1: ( ';' )
            // InternalEXPORT.g:6230:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__10"
    // InternalEXPORT.g:6239:1: rule__TMTCIFExportSettingAIFromFile__Group__10 : rule__TMTCIFExportSettingAIFromFile__Group__10__Impl rule__TMTCIFExportSettingAIFromFile__Group__11 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6243:1: ( rule__TMTCIFExportSettingAIFromFile__Group__10__Impl rule__TMTCIFExportSettingAIFromFile__Group__11 )
            // InternalEXPORT.g:6244:2: rule__TMTCIFExportSettingAIFromFile__Group__10__Impl rule__TMTCIFExportSettingAIFromFile__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__10"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__10__Impl"
    // InternalEXPORT.g:6251:1: rule__TMTCIFExportSettingAIFromFile__Group__10__Impl : ( 'toArrayIndex' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6255:1: ( ( 'toArrayIndex' ) )
            // InternalEXPORT.g:6256:1: ( 'toArrayIndex' )
            {
            // InternalEXPORT.g:6256:1: ( 'toArrayIndex' )
            // InternalEXPORT.g:6257:2: 'toArrayIndex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__11"
    // InternalEXPORT.g:6266:1: rule__TMTCIFExportSettingAIFromFile__Group__11 : rule__TMTCIFExportSettingAIFromFile__Group__11__Impl rule__TMTCIFExportSettingAIFromFile__Group__12 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6270:1: ( rule__TMTCIFExportSettingAIFromFile__Group__11__Impl rule__TMTCIFExportSettingAIFromFile__Group__12 )
            // InternalEXPORT.g:6271:2: rule__TMTCIFExportSettingAIFromFile__Group__11__Impl rule__TMTCIFExportSettingAIFromFile__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromFile__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__11"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__11__Impl"
    // InternalEXPORT.g:6278:1: rule__TMTCIFExportSettingAIFromFile__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6282:1: ( ( ':=' ) )
            // InternalEXPORT.g:6283:1: ( ':=' )
            {
            // InternalEXPORT.g:6283:1: ( ':=' )
            // InternalEXPORT.g:6284:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__12"
    // InternalEXPORT.g:6293:1: rule__TMTCIFExportSettingAIFromFile__Group__12 : rule__TMTCIFExportSettingAIFromFile__Group__12__Impl rule__TMTCIFExportSettingAIFromFile__Group__13 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6297:1: ( rule__TMTCIFExportSettingAIFromFile__Group__12__Impl rule__TMTCIFExportSettingAIFromFile__Group__13 )
            // InternalEXPORT.g:6298:2: rule__TMTCIFExportSettingAIFromFile__Group__12__Impl rule__TMTCIFExportSettingAIFromFile__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__12"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__12__Impl"
    // InternalEXPORT.g:6305:1: rule__TMTCIFExportSettingAIFromFile__Group__12__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6309:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 ) ) )
            // InternalEXPORT.g:6310:1: ( ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 ) )
            {
            // InternalEXPORT.g:6310:1: ( ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 ) )
            // InternalEXPORT.g:6311:2: ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); 
            }
            // InternalEXPORT.g:6312:2: ( rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 )
            // InternalEXPORT.g:6312:3: rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__13"
    // InternalEXPORT.g:6320:1: rule__TMTCIFExportSettingAIFromFile__Group__13 : rule__TMTCIFExportSettingAIFromFile__Group__13__Impl rule__TMTCIFExportSettingAIFromFile__Group__14 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6324:1: ( rule__TMTCIFExportSettingAIFromFile__Group__13__Impl rule__TMTCIFExportSettingAIFromFile__Group__14 )
            // InternalEXPORT.g:6325:2: rule__TMTCIFExportSettingAIFromFile__Group__13__Impl rule__TMTCIFExportSettingAIFromFile__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingAIFromFile__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__13"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__13__Impl"
    // InternalEXPORT.g:6332:1: rule__TMTCIFExportSettingAIFromFile__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6336:1: ( ( ';' ) )
            // InternalEXPORT.g:6337:1: ( ';' )
            {
            // InternalEXPORT.g:6337:1: ( ';' )
            // InternalEXPORT.g:6338:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__14"
    // InternalEXPORT.g:6347:1: rule__TMTCIFExportSettingAIFromFile__Group__14 : rule__TMTCIFExportSettingAIFromFile__Group__14__Impl rule__TMTCIFExportSettingAIFromFile__Group__15 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6351:1: ( rule__TMTCIFExportSettingAIFromFile__Group__14__Impl rule__TMTCIFExportSettingAIFromFile__Group__15 )
            // InternalEXPORT.g:6352:2: rule__TMTCIFExportSettingAIFromFile__Group__14__Impl rule__TMTCIFExportSettingAIFromFile__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingAIFromFile__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__14"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__14__Impl"
    // InternalEXPORT.g:6359:1: rule__TMTCIFExportSettingAIFromFile__Group__14__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )? ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6363:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )? ) )
            // InternalEXPORT.g:6364:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )? )
            {
            // InternalEXPORT.g:6364:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )? )
            // InternalEXPORT.g:6365:2: ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_14()); 
            }
            // InternalEXPORT.g:6366:2: ( rule__TMTCIFExportSettingAIFromFile__Group_14__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEXPORT.g:6366:3: rule__TMTCIFExportSettingAIFromFile__Group_14__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingAIFromFile__Group_14__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__15"
    // InternalEXPORT.g:6374:1: rule__TMTCIFExportSettingAIFromFile__Group__15 : rule__TMTCIFExportSettingAIFromFile__Group__15__Impl rule__TMTCIFExportSettingAIFromFile__Group__16 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6378:1: ( rule__TMTCIFExportSettingAIFromFile__Group__15__Impl rule__TMTCIFExportSettingAIFromFile__Group__16 )
            // InternalEXPORT.g:6379:2: rule__TMTCIFExportSettingAIFromFile__Group__15__Impl rule__TMTCIFExportSettingAIFromFile__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingAIFromFile__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__16();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__15"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__15__Impl"
    // InternalEXPORT.g:6386:1: rule__TMTCIFExportSettingAIFromFile__Group__15__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )? ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6390:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )? ) )
            // InternalEXPORT.g:6391:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )? )
            {
            // InternalEXPORT.g:6391:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )? )
            // InternalEXPORT.g:6392:2: ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_15()); 
            }
            // InternalEXPORT.g:6393:2: ( rule__TMTCIFExportSettingAIFromFile__Group_15__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEXPORT.g:6393:3: rule__TMTCIFExportSettingAIFromFile__Group_15__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingAIFromFile__Group_15__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__16"
    // InternalEXPORT.g:6401:1: rule__TMTCIFExportSettingAIFromFile__Group__16 : rule__TMTCIFExportSettingAIFromFile__Group__16__Impl rule__TMTCIFExportSettingAIFromFile__Group__17 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6405:1: ( rule__TMTCIFExportSettingAIFromFile__Group__16__Impl rule__TMTCIFExportSettingAIFromFile__Group__17 )
            // InternalEXPORT.g:6406:2: rule__TMTCIFExportSettingAIFromFile__Group__16__Impl rule__TMTCIFExportSettingAIFromFile__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__TMTCIFExportSettingAIFromFile__Group__16__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__17();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__16"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__16__Impl"
    // InternalEXPORT.g:6413:1: rule__TMTCIFExportSettingAIFromFile__Group__16__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )? ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6417:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )? ) )
            // InternalEXPORT.g:6418:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )? )
            {
            // InternalEXPORT.g:6418:1: ( ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )? )
            // InternalEXPORT.g:6419:2: ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_16()); 
            }
            // InternalEXPORT.g:6420:2: ( rule__TMTCIFExportSettingAIFromFile__Group_16__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEXPORT.g:6420:3: rule__TMTCIFExportSettingAIFromFile__Group_16__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportSettingAIFromFile__Group_16__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_16()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__16__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__17"
    // InternalEXPORT.g:6428:1: rule__TMTCIFExportSettingAIFromFile__Group__17 : rule__TMTCIFExportSettingAIFromFile__Group__17__Impl rule__TMTCIFExportSettingAIFromFile__Group__18 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6432:1: ( rule__TMTCIFExportSettingAIFromFile__Group__17__Impl rule__TMTCIFExportSettingAIFromFile__Group__18 )
            // InternalEXPORT.g:6433:2: rule__TMTCIFExportSettingAIFromFile__Group__17__Impl rule__TMTCIFExportSettingAIFromFile__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group__17__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__18();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__17"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__17__Impl"
    // InternalEXPORT.g:6440:1: rule__TMTCIFExportSettingAIFromFile__Group__17__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6444:1: ( ( '}' ) )
            // InternalEXPORT.g:6445:1: ( '}' )
            {
            // InternalEXPORT.g:6445:1: ( '}' )
            // InternalEXPORT.g:6446:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__17__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__18"
    // InternalEXPORT.g:6455:1: rule__TMTCIFExportSettingAIFromFile__Group__18 : rule__TMTCIFExportSettingAIFromFile__Group__18__Impl ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6459:1: ( rule__TMTCIFExportSettingAIFromFile__Group__18__Impl )
            // InternalEXPORT.g:6460:2: rule__TMTCIFExportSettingAIFromFile__Group__18__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group__18__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__18"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group__18__Impl"
    // InternalEXPORT.g:6466:1: rule__TMTCIFExportSettingAIFromFile__Group__18__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6470:1: ( ( ';' ) )
            // InternalEXPORT.g:6471:1: ( ';' )
            {
            // InternalEXPORT.g:6471:1: ( ';' )
            // InternalEXPORT.g:6472:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_18()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group__18__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__0"
    // InternalEXPORT.g:6482:1: rule__TMTCIFExportSettingAIFromFile__Group_14__0 : rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__1 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6486:1: ( rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__1 )
            // InternalEXPORT.g:6487:2: rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_14__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__0"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl"
    // InternalEXPORT.g:6494:1: rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl : ( 'offset' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6498:1: ( ( 'offset' ) )
            // InternalEXPORT.g:6499:1: ( 'offset' )
            {
            // InternalEXPORT.g:6499:1: ( 'offset' )
            // InternalEXPORT.g:6500:2: 'offset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetKeyword_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__1"
    // InternalEXPORT.g:6509:1: rule__TMTCIFExportSettingAIFromFile__Group_14__1 : rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__2 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6513:1: ( rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__2 )
            // InternalEXPORT.g:6514:2: rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_14__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__1"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl"
    // InternalEXPORT.g:6521:1: rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6525:1: ( ( ':=' ) )
            // InternalEXPORT.g:6526:1: ( ':=' )
            {
            // InternalEXPORT.g:6526:1: ( ':=' )
            // InternalEXPORT.g:6527:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__2"
    // InternalEXPORT.g:6536:1: rule__TMTCIFExportSettingAIFromFile__Group_14__2 : rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__3 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6540:1: ( rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__3 )
            // InternalEXPORT.g:6541:2: rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_14__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_14__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl"
    // InternalEXPORT.g:6548:1: rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6552:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 ) ) )
            // InternalEXPORT.g:6553:1: ( ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 ) )
            {
            // InternalEXPORT.g:6553:1: ( ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 ) )
            // InternalEXPORT.g:6554:2: ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); 
            }
            // InternalEXPORT.g:6555:2: ( rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 )
            // InternalEXPORT.g:6555:3: rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetAssignment_14_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__3"
    // InternalEXPORT.g:6563:1: rule__TMTCIFExportSettingAIFromFile__Group_14__3 : rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6567:1: ( rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl )
            // InternalEXPORT.g:6568:2: rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__3"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl"
    // InternalEXPORT.g:6574:1: rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6578:1: ( ( ';' ) )
            // InternalEXPORT.g:6579:1: ( ';' )
            {
            // InternalEXPORT.g:6579:1: ( ';' )
            // InternalEXPORT.g:6580:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_14_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_14__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__0"
    // InternalEXPORT.g:6590:1: rule__TMTCIFExportSettingAIFromFile__Group_15__0 : rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__1 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6594:1: ( rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__1 )
            // InternalEXPORT.g:6595:2: rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_15__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__0"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl"
    // InternalEXPORT.g:6602:1: rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl : ( 'size' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6606:1: ( ( 'size' ) )
            // InternalEXPORT.g:6607:1: ( 'size' )
            {
            // InternalEXPORT.g:6607:1: ( 'size' )
            // InternalEXPORT.g:6608:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeKeyword_15_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__1"
    // InternalEXPORT.g:6617:1: rule__TMTCIFExportSettingAIFromFile__Group_15__1 : rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__2 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6621:1: ( rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__2 )
            // InternalEXPORT.g:6622:2: rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_15__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__1"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl"
    // InternalEXPORT.g:6629:1: rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6633:1: ( ( ':=' ) )
            // InternalEXPORT.g:6634:1: ( ':=' )
            {
            // InternalEXPORT.g:6634:1: ( ':=' )
            // InternalEXPORT.g:6635:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__2"
    // InternalEXPORT.g:6644:1: rule__TMTCIFExportSettingAIFromFile__Group_15__2 : rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__3 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6648:1: ( rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__3 )
            // InternalEXPORT.g:6649:2: rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_15__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_15__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl"
    // InternalEXPORT.g:6656:1: rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6660:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 ) ) )
            // InternalEXPORT.g:6661:1: ( ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 ) )
            {
            // InternalEXPORT.g:6661:1: ( ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 ) )
            // InternalEXPORT.g:6662:2: ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeAssignment_15_2()); 
            }
            // InternalEXPORT.g:6663:2: ( rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 )
            // InternalEXPORT.g:6663:3: rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeAssignment_15_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__3"
    // InternalEXPORT.g:6671:1: rule__TMTCIFExportSettingAIFromFile__Group_15__3 : rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6675:1: ( rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl )
            // InternalEXPORT.g:6676:2: rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__3"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl"
    // InternalEXPORT.g:6682:1: rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6686:1: ( ( ';' ) )
            // InternalEXPORT.g:6687:1: ( ';' )
            {
            // InternalEXPORT.g:6687:1: ( ';' )
            // InternalEXPORT.g:6688:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_15_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_15__3__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__0"
    // InternalEXPORT.g:6698:1: rule__TMTCIFExportSettingAIFromFile__Group_16__0 : rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__1 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6702:1: ( rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__1 )
            // InternalEXPORT.g:6703:2: rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_16__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__0"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl"
    // InternalEXPORT.g:6710:1: rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl : ( 'line' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6714:1: ( ( 'line' ) )
            // InternalEXPORT.g:6715:1: ( 'line' )
            {
            // InternalEXPORT.g:6715:1: ( 'line' )
            // InternalEXPORT.g:6716:2: 'line'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineKeyword_16_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__0__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__1"
    // InternalEXPORT.g:6725:1: rule__TMTCIFExportSettingAIFromFile__Group_16__1 : rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__2 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6729:1: ( rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__2 )
            // InternalEXPORT.g:6730:2: rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_16__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__1"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl"
    // InternalEXPORT.g:6737:1: rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6741:1: ( ( ':=' ) )
            // InternalEXPORT.g:6742:1: ( ':=' )
            {
            // InternalEXPORT.g:6742:1: ( ':=' )
            // InternalEXPORT.g:6743:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__1__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__2"
    // InternalEXPORT.g:6752:1: rule__TMTCIFExportSettingAIFromFile__Group_16__2 : rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__3 ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6756:1: ( rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__3 )
            // InternalEXPORT.g:6757:2: rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl rule__TMTCIFExportSettingAIFromFile__Group_16__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_16__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl"
    // InternalEXPORT.g:6764:1: rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl : ( ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6768:1: ( ( ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 ) ) )
            // InternalEXPORT.g:6769:1: ( ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 ) )
            {
            // InternalEXPORT.g:6769:1: ( ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 ) )
            // InternalEXPORT.g:6770:2: ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineAssignment_16_2()); 
            }
            // InternalEXPORT.g:6771:2: ( rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 )
            // InternalEXPORT.g:6771:3: rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineAssignment_16_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__2__Impl"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__3"
    // InternalEXPORT.g:6779:1: rule__TMTCIFExportSettingAIFromFile__Group_16__3 : rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6783:1: ( rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl )
            // InternalEXPORT.g:6784:2: rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__3"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl"
    // InternalEXPORT.g:6790:1: rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6794:1: ( ( ';' ) )
            // InternalEXPORT.g:6795:1: ( ';' )
            {
            // InternalEXPORT.g:6795:1: ( ';' )
            // InternalEXPORT.g:6796:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSemicolonKeyword_16_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__Group_16__3__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__0"
    // InternalEXPORT.g:6806:1: rule__TMTCIFExportActivateDICs__Group__0 : rule__TMTCIFExportActivateDICs__Group__0__Impl rule__TMTCIFExportActivateDICs__Group__1 ;
    public final void rule__TMTCIFExportActivateDICs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6810:1: ( rule__TMTCIFExportActivateDICs__Group__0__Impl rule__TMTCIFExportActivateDICs__Group__1 )
            // InternalEXPORT.g:6811:2: rule__TMTCIFExportActivateDICs__Group__0__Impl rule__TMTCIFExportActivateDICs__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__TMTCIFExportActivateDICs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__0"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__0__Impl"
    // InternalEXPORT.g:6818:1: rule__TMTCIFExportActivateDICs__Group__0__Impl : ( () ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6822:1: ( ( () ) )
            // InternalEXPORT.g:6823:1: ( () )
            {
            // InternalEXPORT.g:6823:1: ( () )
            // InternalEXPORT.g:6824:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0()); 
            }
            // InternalEXPORT.g:6825:2: ()
            // InternalEXPORT.g:6825:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__1"
    // InternalEXPORT.g:6833:1: rule__TMTCIFExportActivateDICs__Group__1 : rule__TMTCIFExportActivateDICs__Group__1__Impl rule__TMTCIFExportActivateDICs__Group__2 ;
    public final void rule__TMTCIFExportActivateDICs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6837:1: ( rule__TMTCIFExportActivateDICs__Group__1__Impl rule__TMTCIFExportActivateDICs__Group__2 )
            // InternalEXPORT.g:6838:2: rule__TMTCIFExportActivateDICs__Group__1__Impl rule__TMTCIFExportActivateDICs__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportActivateDICs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__1"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__1__Impl"
    // InternalEXPORT.g:6845:1: rule__TMTCIFExportActivateDICs__Group__1__Impl : ( 'TMTCIFExportActivateDICs' ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6849:1: ( ( 'TMTCIFExportActivateDICs' ) )
            // InternalEXPORT.g:6850:1: ( 'TMTCIFExportActivateDICs' )
            {
            // InternalEXPORT.g:6850:1: ( 'TMTCIFExportActivateDICs' )
            // InternalEXPORT.g:6851:2: 'TMTCIFExportActivateDICs'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getTMTCIFExportActivateDICsKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__2"
    // InternalEXPORT.g:6860:1: rule__TMTCIFExportActivateDICs__Group__2 : rule__TMTCIFExportActivateDICs__Group__2__Impl rule__TMTCIFExportActivateDICs__Group__3 ;
    public final void rule__TMTCIFExportActivateDICs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6864:1: ( rule__TMTCIFExportActivateDICs__Group__2__Impl rule__TMTCIFExportActivateDICs__Group__3 )
            // InternalEXPORT.g:6865:2: rule__TMTCIFExportActivateDICs__Group__2__Impl rule__TMTCIFExportActivateDICs__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__TMTCIFExportActivateDICs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__2"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__2__Impl"
    // InternalEXPORT.g:6872:1: rule__TMTCIFExportActivateDICs__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6876:1: ( ( '{' ) )
            // InternalEXPORT.g:6877:1: ( '{' )
            {
            // InternalEXPORT.g:6877:1: ( '{' )
            // InternalEXPORT.g:6878:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__3"
    // InternalEXPORT.g:6887:1: rule__TMTCIFExportActivateDICs__Group__3 : rule__TMTCIFExportActivateDICs__Group__3__Impl rule__TMTCIFExportActivateDICs__Group__4 ;
    public final void rule__TMTCIFExportActivateDICs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6891:1: ( rule__TMTCIFExportActivateDICs__Group__3__Impl rule__TMTCIFExportActivateDICs__Group__4 )
            // InternalEXPORT.g:6892:2: rule__TMTCIFExportActivateDICs__Group__3__Impl rule__TMTCIFExportActivateDICs__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportActivateDICs__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__3"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__3__Impl"
    // InternalEXPORT.g:6899:1: rule__TMTCIFExportActivateDICs__Group__3__Impl : ( ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) ) ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* ) ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6903:1: ( ( ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) ) ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* ) ) )
            // InternalEXPORT.g:6904:1: ( ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) ) ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* ) )
            {
            // InternalEXPORT.g:6904:1: ( ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) ) ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* ) )
            // InternalEXPORT.g:6905:2: ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) ) ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* )
            {
            // InternalEXPORT.g:6905:2: ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 ) )
            // InternalEXPORT.g:6906:3: ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); 
            }
            // InternalEXPORT.g:6907:3: ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )
            // InternalEXPORT.g:6907:4: rule__TMTCIFExportActivateDICs__DICAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__TMTCIFExportActivateDICs__DICAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); 
            }

            }

            // InternalEXPORT.g:6910:2: ( ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )* )
            // InternalEXPORT.g:6911:3: ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); 
            }
            // InternalEXPORT.g:6912:3: ( rule__TMTCIFExportActivateDICs__DICAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEXPORT.g:6912:4: rule__TMTCIFExportActivateDICs__DICAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    rule__TMTCIFExportActivateDICs__DICAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3()); 
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
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__4"
    // InternalEXPORT.g:6921:1: rule__TMTCIFExportActivateDICs__Group__4 : rule__TMTCIFExportActivateDICs__Group__4__Impl rule__TMTCIFExportActivateDICs__Group__5 ;
    public final void rule__TMTCIFExportActivateDICs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6925:1: ( rule__TMTCIFExportActivateDICs__Group__4__Impl rule__TMTCIFExportActivateDICs__Group__5 )
            // InternalEXPORT.g:6926:2: rule__TMTCIFExportActivateDICs__Group__4__Impl rule__TMTCIFExportActivateDICs__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportActivateDICs__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__4"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__4__Impl"
    // InternalEXPORT.g:6933:1: rule__TMTCIFExportActivateDICs__Group__4__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6937:1: ( ( '}' ) )
            // InternalEXPORT.g:6938:1: ( '}' )
            {
            // InternalEXPORT.g:6938:1: ( '}' )
            // InternalEXPORT.g:6939:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__5"
    // InternalEXPORT.g:6948:1: rule__TMTCIFExportActivateDICs__Group__5 : rule__TMTCIFExportActivateDICs__Group__5__Impl ;
    public final void rule__TMTCIFExportActivateDICs__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6952:1: ( rule__TMTCIFExportActivateDICs__Group__5__Impl )
            // InternalEXPORT.g:6953:2: rule__TMTCIFExportActivateDICs__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportActivateDICs__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__5"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__Group__5__Impl"
    // InternalEXPORT.g:6959:1: rule__TMTCIFExportActivateDICs__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportActivateDICs__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6963:1: ( ( ';' ) )
            // InternalEXPORT.g:6964:1: ( ';' )
            {
            // InternalEXPORT.g:6964:1: ( ';' )
            // InternalEXPORT.g:6965:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__0"
    // InternalEXPORT.g:6975:1: rule__TMTCIFExportDIC__Group__0 : rule__TMTCIFExportDIC__Group__0__Impl rule__TMTCIFExportDIC__Group__1 ;
    public final void rule__TMTCIFExportDIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6979:1: ( rule__TMTCIFExportDIC__Group__0__Impl rule__TMTCIFExportDIC__Group__1 )
            // InternalEXPORT.g:6980:2: rule__TMTCIFExportDIC__Group__0__Impl rule__TMTCIFExportDIC__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFExportDIC__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__0"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__0__Impl"
    // InternalEXPORT.g:6987:1: rule__TMTCIFExportDIC__Group__0__Impl : ( 'TMTCIFExportDIC' ) ;
    public final void rule__TMTCIFExportDIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:6991:1: ( ( 'TMTCIFExportDIC' ) )
            // InternalEXPORT.g:6992:1: ( 'TMTCIFExportDIC' )
            {
            // InternalEXPORT.g:6992:1: ( 'TMTCIFExportDIC' )
            // InternalEXPORT.g:6993:2: 'TMTCIFExportDIC'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getTMTCIFExportDICKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__1"
    // InternalEXPORT.g:7002:1: rule__TMTCIFExportDIC__Group__1 : rule__TMTCIFExportDIC__Group__1__Impl rule__TMTCIFExportDIC__Group__2 ;
    public final void rule__TMTCIFExportDIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7006:1: ( rule__TMTCIFExportDIC__Group__1__Impl rule__TMTCIFExportDIC__Group__2 )
            // InternalEXPORT.g:7007:2: rule__TMTCIFExportDIC__Group__1__Impl rule__TMTCIFExportDIC__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFExportDIC__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__1"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__1__Impl"
    // InternalEXPORT.g:7014:1: rule__TMTCIFExportDIC__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFExportDIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7018:1: ( ( '{' ) )
            // InternalEXPORT.g:7019:1: ( '{' )
            {
            // InternalEXPORT.g:7019:1: ( '{' )
            // InternalEXPORT.g:7020:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__2"
    // InternalEXPORT.g:7029:1: rule__TMTCIFExportDIC__Group__2 : rule__TMTCIFExportDIC__Group__2__Impl rule__TMTCIFExportDIC__Group__3 ;
    public final void rule__TMTCIFExportDIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7033:1: ( rule__TMTCIFExportDIC__Group__2__Impl rule__TMTCIFExportDIC__Group__3 )
            // InternalEXPORT.g:7034:2: rule__TMTCIFExportDIC__Group__2__Impl rule__TMTCIFExportDIC__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportDIC__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__2"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__2__Impl"
    // InternalEXPORT.g:7041:1: rule__TMTCIFExportDIC__Group__2__Impl : ( 'id' ) ;
    public final void rule__TMTCIFExportDIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7045:1: ( ( 'id' ) )
            // InternalEXPORT.g:7046:1: ( 'id' )
            {
            // InternalEXPORT.g:7046:1: ( 'id' )
            // InternalEXPORT.g:7047:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getIdKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__3"
    // InternalEXPORT.g:7056:1: rule__TMTCIFExportDIC__Group__3 : rule__TMTCIFExportDIC__Group__3__Impl rule__TMTCIFExportDIC__Group__4 ;
    public final void rule__TMTCIFExportDIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7060:1: ( rule__TMTCIFExportDIC__Group__3__Impl rule__TMTCIFExportDIC__Group__4 )
            // InternalEXPORT.g:7061:2: rule__TMTCIFExportDIC__Group__3__Impl rule__TMTCIFExportDIC__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFExportDIC__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__3"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__3__Impl"
    // InternalEXPORT.g:7068:1: rule__TMTCIFExportDIC__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportDIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7072:1: ( ( ':=' ) )
            // InternalEXPORT.g:7073:1: ( ':=' )
            {
            // InternalEXPORT.g:7073:1: ( ':=' )
            // InternalEXPORT.g:7074:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__4"
    // InternalEXPORT.g:7083:1: rule__TMTCIFExportDIC__Group__4 : rule__TMTCIFExportDIC__Group__4__Impl rule__TMTCIFExportDIC__Group__5 ;
    public final void rule__TMTCIFExportDIC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7087:1: ( rule__TMTCIFExportDIC__Group__4__Impl rule__TMTCIFExportDIC__Group__5 )
            // InternalEXPORT.g:7088:2: rule__TMTCIFExportDIC__Group__4__Impl rule__TMTCIFExportDIC__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportDIC__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__4"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__4__Impl"
    // InternalEXPORT.g:7095:1: rule__TMTCIFExportDIC__Group__4__Impl : ( ( rule__TMTCIFExportDIC__IdAssignment_4 ) ) ;
    public final void rule__TMTCIFExportDIC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7099:1: ( ( ( rule__TMTCIFExportDIC__IdAssignment_4 ) ) )
            // InternalEXPORT.g:7100:1: ( ( rule__TMTCIFExportDIC__IdAssignment_4 ) )
            {
            // InternalEXPORT.g:7100:1: ( ( rule__TMTCIFExportDIC__IdAssignment_4 ) )
            // InternalEXPORT.g:7101:2: ( rule__TMTCIFExportDIC__IdAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getIdAssignment_4()); 
            }
            // InternalEXPORT.g:7102:2: ( rule__TMTCIFExportDIC__IdAssignment_4 )
            // InternalEXPORT.g:7102:3: rule__TMTCIFExportDIC__IdAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__IdAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getIdAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__5"
    // InternalEXPORT.g:7110:1: rule__TMTCIFExportDIC__Group__5 : rule__TMTCIFExportDIC__Group__5__Impl rule__TMTCIFExportDIC__Group__6 ;
    public final void rule__TMTCIFExportDIC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7114:1: ( rule__TMTCIFExportDIC__Group__5__Impl rule__TMTCIFExportDIC__Group__6 )
            // InternalEXPORT.g:7115:2: rule__TMTCIFExportDIC__Group__5__Impl rule__TMTCIFExportDIC__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__TMTCIFExportDIC__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__5"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__5__Impl"
    // InternalEXPORT.g:7122:1: rule__TMTCIFExportDIC__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportDIC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7126:1: ( ( ';' ) )
            // InternalEXPORT.g:7127:1: ( ';' )
            {
            // InternalEXPORT.g:7127:1: ( ';' )
            // InternalEXPORT.g:7128:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__6"
    // InternalEXPORT.g:7137:1: rule__TMTCIFExportDIC__Group__6 : rule__TMTCIFExportDIC__Group__6__Impl rule__TMTCIFExportDIC__Group__7 ;
    public final void rule__TMTCIFExportDIC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7141:1: ( rule__TMTCIFExportDIC__Group__6__Impl rule__TMTCIFExportDIC__Group__7 )
            // InternalEXPORT.g:7142:2: rule__TMTCIFExportDIC__Group__6__Impl rule__TMTCIFExportDIC__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFExportDIC__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__6"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__6__Impl"
    // InternalEXPORT.g:7149:1: rule__TMTCIFExportDIC__Group__6__Impl : ( 'DICRef' ) ;
    public final void rule__TMTCIFExportDIC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7153:1: ( ( 'DICRef' ) )
            // InternalEXPORT.g:7154:1: ( 'DICRef' )
            {
            // InternalEXPORT.g:7154:1: ( 'DICRef' )
            // InternalEXPORT.g:7155:2: 'DICRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getDICRefKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__7"
    // InternalEXPORT.g:7164:1: rule__TMTCIFExportDIC__Group__7 : rule__TMTCIFExportDIC__Group__7__Impl rule__TMTCIFExportDIC__Group__8 ;
    public final void rule__TMTCIFExportDIC__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7168:1: ( rule__TMTCIFExportDIC__Group__7__Impl rule__TMTCIFExportDIC__Group__8 )
            // InternalEXPORT.g:7169:2: rule__TMTCIFExportDIC__Group__7__Impl rule__TMTCIFExportDIC__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFExportDIC__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__7"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__7__Impl"
    // InternalEXPORT.g:7176:1: rule__TMTCIFExportDIC__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFExportDIC__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7180:1: ( ( ':=' ) )
            // InternalEXPORT.g:7181:1: ( ':=' )
            {
            // InternalEXPORT.g:7181:1: ( ':=' )
            // InternalEXPORT.g:7182:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__8"
    // InternalEXPORT.g:7191:1: rule__TMTCIFExportDIC__Group__8 : rule__TMTCIFExportDIC__Group__8__Impl rule__TMTCIFExportDIC__Group__9 ;
    public final void rule__TMTCIFExportDIC__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7195:1: ( rule__TMTCIFExportDIC__Group__8__Impl rule__TMTCIFExportDIC__Group__9 )
            // InternalEXPORT.g:7196:2: rule__TMTCIFExportDIC__Group__8__Impl rule__TMTCIFExportDIC__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportDIC__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__8"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__8__Impl"
    // InternalEXPORT.g:7203:1: rule__TMTCIFExportDIC__Group__8__Impl : ( ( rule__TMTCIFExportDIC__DICRefAssignment_8 ) ) ;
    public final void rule__TMTCIFExportDIC__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7207:1: ( ( ( rule__TMTCIFExportDIC__DICRefAssignment_8 ) ) )
            // InternalEXPORT.g:7208:1: ( ( rule__TMTCIFExportDIC__DICRefAssignment_8 ) )
            {
            // InternalEXPORT.g:7208:1: ( ( rule__TMTCIFExportDIC__DICRefAssignment_8 ) )
            // InternalEXPORT.g:7209:2: ( rule__TMTCIFExportDIC__DICRefAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getDICRefAssignment_8()); 
            }
            // InternalEXPORT.g:7210:2: ( rule__TMTCIFExportDIC__DICRefAssignment_8 )
            // InternalEXPORT.g:7210:3: rule__TMTCIFExportDIC__DICRefAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__DICRefAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getDICRefAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__9"
    // InternalEXPORT.g:7218:1: rule__TMTCIFExportDIC__Group__9 : rule__TMTCIFExportDIC__Group__9__Impl rule__TMTCIFExportDIC__Group__10 ;
    public final void rule__TMTCIFExportDIC__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7222:1: ( rule__TMTCIFExportDIC__Group__9__Impl rule__TMTCIFExportDIC__Group__10 )
            // InternalEXPORT.g:7223:2: rule__TMTCIFExportDIC__Group__9__Impl rule__TMTCIFExportDIC__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFExportDIC__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__9"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__9__Impl"
    // InternalEXPORT.g:7230:1: rule__TMTCIFExportDIC__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportDIC__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7234:1: ( ( ';' ) )
            // InternalEXPORT.g:7235:1: ( ';' )
            {
            // InternalEXPORT.g:7235:1: ( ';' )
            // InternalEXPORT.g:7236:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__10"
    // InternalEXPORT.g:7245:1: rule__TMTCIFExportDIC__Group__10 : rule__TMTCIFExportDIC__Group__10__Impl rule__TMTCIFExportDIC__Group__11 ;
    public final void rule__TMTCIFExportDIC__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7249:1: ( rule__TMTCIFExportDIC__Group__10__Impl rule__TMTCIFExportDIC__Group__11 )
            // InternalEXPORT.g:7250:2: rule__TMTCIFExportDIC__Group__10__Impl rule__TMTCIFExportDIC__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFExportDIC__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__10"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__10__Impl"
    // InternalEXPORT.g:7257:1: rule__TMTCIFExportDIC__Group__10__Impl : ( '}' ) ;
    public final void rule__TMTCIFExportDIC__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7261:1: ( ( '}' ) )
            // InternalEXPORT.g:7262:1: ( '}' )
            {
            // InternalEXPORT.g:7262:1: ( '}' )
            // InternalEXPORT.g:7263:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__11"
    // InternalEXPORT.g:7272:1: rule__TMTCIFExportDIC__Group__11 : rule__TMTCIFExportDIC__Group__11__Impl ;
    public final void rule__TMTCIFExportDIC__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7276:1: ( rule__TMTCIFExportDIC__Group__11__Impl )
            // InternalEXPORT.g:7277:2: rule__TMTCIFExportDIC__Group__11__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportDIC__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__11"


    // $ANTLR start "rule__TMTCIFExportDIC__Group__11__Impl"
    // InternalEXPORT.g:7283:1: rule__TMTCIFExportDIC__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFExportDIC__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7287:1: ( ( ';' ) )
            // InternalEXPORT.g:7288:1: ( ';' )
            {
            // InternalEXPORT.g:7288:1: ( ';' )
            // InternalEXPORT.g:7289:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__Group__11__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEXPORT.g:7299:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7303:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEXPORT.g:7304:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalEXPORT.g:7311:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7315:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7316:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7316:1: ( RULE_ID )
            // InternalEXPORT.g:7317:2: RULE_ID
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
    // InternalEXPORT.g:7326:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7330:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEXPORT.g:7331:2: rule__QualifiedName__Group__1__Impl
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
    // InternalEXPORT.g:7337:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7341:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEXPORT.g:7342:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEXPORT.g:7342:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEXPORT.g:7343:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalEXPORT.g:7344:2: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==52) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEXPORT.g:7344:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalEXPORT.g:7353:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7357:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEXPORT.g:7358:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalEXPORT.g:7365:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7369:1: ( ( '.' ) )
            // InternalEXPORT.g:7370:1: ( '.' )
            {
            // InternalEXPORT.g:7370:1: ( '.' )
            // InternalEXPORT.g:7371:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7380:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7384:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEXPORT.g:7385:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalEXPORT.g:7391:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7395:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7396:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7396:1: ( RULE_ID )
            // InternalEXPORT.g:7397:2: RULE_ID
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
    // InternalEXPORT.g:7407:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7411:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalEXPORT.g:7412:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
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
    // InternalEXPORT.g:7419:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7423:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalEXPORT.g:7424:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalEXPORT.g:7424:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalEXPORT.g:7425:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalEXPORT.g:7426:2: ( rule__Version__Alternatives_0 )
            // InternalEXPORT.g:7426:3: rule__Version__Alternatives_0
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
    // InternalEXPORT.g:7434:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7438:1: ( rule__Version__Group__1__Impl )
            // InternalEXPORT.g:7439:2: rule__Version__Group__1__Impl
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
    // InternalEXPORT.g:7445:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7449:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalEXPORT.g:7450:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalEXPORT.g:7450:1: ( ( rule__Version__Group_1__0 )* )
            // InternalEXPORT.g:7451:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalEXPORT.g:7452:2: ( rule__Version__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEXPORT.g:7452:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalEXPORT.g:7461:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7465:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalEXPORT.g:7466:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalEXPORT.g:7473:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7477:1: ( ( ( RULE_INT )? ) )
            // InternalEXPORT.g:7478:1: ( ( RULE_INT )? )
            {
            // InternalEXPORT.g:7478:1: ( ( RULE_INT )? )
            // InternalEXPORT.g:7479:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalEXPORT.g:7480:2: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEXPORT.g:7480:3: RULE_INT
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
    // InternalEXPORT.g:7488:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7492:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalEXPORT.g:7493:2: rule__Version__Group_0_1__1__Impl
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
    // InternalEXPORT.g:7499:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7503:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7504:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7504:1: ( RULE_ID )
            // InternalEXPORT.g:7505:2: RULE_ID
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
    // InternalEXPORT.g:7515:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7519:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalEXPORT.g:7520:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalEXPORT.g:7527:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7531:1: ( ( '.' ) )
            // InternalEXPORT.g:7532:1: ( '.' )
            {
            // InternalEXPORT.g:7532:1: ( '.' )
            // InternalEXPORT.g:7533:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7542:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7546:1: ( rule__Version__Group_1__1__Impl )
            // InternalEXPORT.g:7547:2: rule__Version__Group_1__1__Impl
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
    // InternalEXPORT.g:7553:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7557:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalEXPORT.g:7558:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalEXPORT.g:7558:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalEXPORT.g:7559:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalEXPORT.g:7560:2: ( rule__Version__Alternatives_1_1 )
            // InternalEXPORT.g:7560:3: rule__Version__Alternatives_1_1
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
    // InternalEXPORT.g:7569:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7573:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalEXPORT.g:7574:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalEXPORT.g:7581:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7585:1: ( ( ( RULE_INT )? ) )
            // InternalEXPORT.g:7586:1: ( ( RULE_INT )? )
            {
            // InternalEXPORT.g:7586:1: ( ( RULE_INT )? )
            // InternalEXPORT.g:7587:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalEXPORT.g:7588:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEXPORT.g:7588:3: RULE_INT
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
    // InternalEXPORT.g:7596:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7600:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalEXPORT.g:7601:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalEXPORT.g:7607:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7611:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7612:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7612:1: ( RULE_ID )
            // InternalEXPORT.g:7613:2: RULE_ID
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
    // InternalEXPORT.g:7623:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7627:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalEXPORT.g:7628:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalEXPORT.g:7635:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7639:1: ( ( ruleQualifiedName ) )
            // InternalEXPORT.g:7640:1: ( ruleQualifiedName )
            {
            // InternalEXPORT.g:7640:1: ( ruleQualifiedName )
            // InternalEXPORT.g:7641:2: ruleQualifiedName
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
    // InternalEXPORT.g:7650:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7654:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalEXPORT.g:7655:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalEXPORT.g:7662:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7666:1: ( ( '(' ) )
            // InternalEXPORT.g:7667:1: ( '(' )
            {
            // InternalEXPORT.g:7667:1: ( '(' )
            // InternalEXPORT.g:7668:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7677:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7681:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalEXPORT.g:7682:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalEXPORT.g:7689:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7693:1: ( ( ruleVersion ) )
            // InternalEXPORT.g:7694:1: ( ruleVersion )
            {
            // InternalEXPORT.g:7694:1: ( ruleVersion )
            // InternalEXPORT.g:7695:2: ruleVersion
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
    // InternalEXPORT.g:7704:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7708:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalEXPORT.g:7709:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalEXPORT.g:7715:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7719:1: ( ( ')' ) )
            // InternalEXPORT.g:7720:1: ( ')' )
            {
            // InternalEXPORT.g:7720:1: ( ')' )
            // InternalEXPORT.g:7721:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7731:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7735:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalEXPORT.g:7736:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalEXPORT.g:7743:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7747:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalEXPORT.g:7748:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalEXPORT.g:7748:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalEXPORT.g:7749:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalEXPORT.g:7750:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=52 && LA30_1<=53)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalEXPORT.g:7750:3: rule__VersionedQualifiedReferenceName__Group_0__0
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
    // InternalEXPORT.g:7758:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7762:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalEXPORT.g:7763:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalEXPORT.g:7770:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7774:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7775:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7775:1: ( RULE_ID )
            // InternalEXPORT.g:7776:2: RULE_ID
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
    // InternalEXPORT.g:7785:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7789:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalEXPORT.g:7790:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
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
    // InternalEXPORT.g:7796:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7800:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalEXPORT.g:7801:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalEXPORT.g:7801:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalEXPORT.g:7802:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalEXPORT.g:7803:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==55) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEXPORT.g:7803:3: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalEXPORT.g:7812:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7816:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalEXPORT.g:7817:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalEXPORT.g:7824:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7828:1: ( ( ruleVersionedQualifiedName ) )
            // InternalEXPORT.g:7829:1: ( ruleVersionedQualifiedName )
            {
            // InternalEXPORT.g:7829:1: ( ruleVersionedQualifiedName )
            // InternalEXPORT.g:7830:2: ruleVersionedQualifiedName
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
    // InternalEXPORT.g:7839:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7843:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalEXPORT.g:7844:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
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
    // InternalEXPORT.g:7850:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7854:1: ( ( '::' ) )
            // InternalEXPORT.g:7855:1: ( '::' )
            {
            // InternalEXPORT.g:7855:1: ( '::' )
            // InternalEXPORT.g:7856:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7866:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7870:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalEXPORT.g:7871:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
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
    // InternalEXPORT.g:7878:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7882:1: ( ( '::' ) )
            // InternalEXPORT.g:7883:1: ( '::' )
            {
            // InternalEXPORT.g:7883:1: ( '::' )
            // InternalEXPORT.g:7884:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalEXPORT.g:7893:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7897:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalEXPORT.g:7898:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
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
    // InternalEXPORT.g:7904:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7908:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:7909:1: ( RULE_ID )
            {
            // InternalEXPORT.g:7909:1: ( RULE_ID )
            // InternalEXPORT.g:7910:2: RULE_ID
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
    // InternalEXPORT.g:7920:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7924:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalEXPORT.g:7925:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
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
    // InternalEXPORT.g:7932:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7936:1: ( ( ( '-' )? ) )
            // InternalEXPORT.g:7937:1: ( ( '-' )? )
            {
            // InternalEXPORT.g:7937:1: ( ( '-' )? )
            // InternalEXPORT.g:7938:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalEXPORT.g:7939:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEXPORT.g:7939:3: '-'
                    {
                    match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalEXPORT.g:7947:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7951:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalEXPORT.g:7952:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalEXPORT.g:7958:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:7962:1: ( ( RULE_INT ) )
            // InternalEXPORT.g:7963:1: ( RULE_INT )
            {
            // InternalEXPORT.g:7963:1: ( RULE_INT )
            // InternalEXPORT.g:7964:2: RULE_INT
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


    // $ANTLR start "rule__TMTCIFExportExport__UnorderedGroup_3"
    // InternalEXPORT.g:7974:1: rule__TMTCIFExportExport__UnorderedGroup_3 : rule__TMTCIFExportExport__UnorderedGroup_3__0 {...}?;
    public final void rule__TMTCIFExportExport__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
        	
        try {
            // InternalEXPORT.g:7979:1: ( rule__TMTCIFExportExport__UnorderedGroup_3__0 {...}?)
            // InternalEXPORT.g:7980:2: rule__TMTCIFExportExport__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__TMTCIFExportExport__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__UnorderedGroup_3"


    // $ANTLR start "rule__TMTCIFExportExport__UnorderedGroup_3__Impl"
    // InternalEXPORT.g:7988:1: rule__TMTCIFExportExport__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__TMTCIFExportExport__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalEXPORT.g:7993:1: ( ( ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) ) ) )
            // InternalEXPORT.g:7994:3: ( ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) ) )
            {
            // InternalEXPORT.g:7994:3: ( ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalEXPORT.g:7995:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) )
                    {
                    // InternalEXPORT.g:7995:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) )
                    // InternalEXPORT.g:7996:4: {...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFExportExport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalEXPORT.g:7996:114: ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) )
                    // InternalEXPORT.g:7997:5: ( ( rule__TMTCIFExportExport__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalEXPORT.g:8003:5: ( ( rule__TMTCIFExportExport__Group_3_0__0 ) )
                    // InternalEXPORT.g:8004:6: ( rule__TMTCIFExportExport__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0()); 
                    }
                    // InternalEXPORT.g:8005:6: ( rule__TMTCIFExportExport__Group_3_0__0 )
                    // InternalEXPORT.g:8005:7: rule__TMTCIFExportExport__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:8010:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) )
                    {
                    // InternalEXPORT.g:8010:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) ) )
                    // InternalEXPORT.g:8011:4: {...}? => ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFExportExport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalEXPORT.g:8011:114: ( ( ( rule__TMTCIFExportExport__Group_3_1__0 ) ) )
                    // InternalEXPORT.g:8012:5: ( ( rule__TMTCIFExportExport__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalEXPORT.g:8018:5: ( ( rule__TMTCIFExportExport__Group_3_1__0 ) )
                    // InternalEXPORT.g:8019:6: ( rule__TMTCIFExportExport__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_1()); 
                    }
                    // InternalEXPORT.g:8020:6: ( rule__TMTCIFExportExport__Group_3_1__0 )
                    // InternalEXPORT.g:8020:7: rule__TMTCIFExportExport__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__TMTCIFExportExport__UnorderedGroup_3__0"
    // InternalEXPORT.g:8033:1: rule__TMTCIFExportExport__UnorderedGroup_3__0 : rule__TMTCIFExportExport__UnorderedGroup_3__Impl ( rule__TMTCIFExportExport__UnorderedGroup_3__1 )? ;
    public final void rule__TMTCIFExportExport__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8037:1: ( rule__TMTCIFExportExport__UnorderedGroup_3__Impl ( rule__TMTCIFExportExport__UnorderedGroup_3__1 )? )
            // InternalEXPORT.g:8038:2: rule__TMTCIFExportExport__UnorderedGroup_3__Impl ( rule__TMTCIFExportExport__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__TMTCIFExportExport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalEXPORT.g:8039:2: ( rule__TMTCIFExportExport__UnorderedGroup_3__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 1) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEXPORT.g:0:0: rule__TMTCIFExportExport__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFExportExport__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__TMTCIFExportExport__UnorderedGroup_3__0"


    // $ANTLR start "rule__TMTCIFExportExport__UnorderedGroup_3__1"
    // InternalEXPORT.g:8045:1: rule__TMTCIFExportExport__UnorderedGroup_3__1 : rule__TMTCIFExportExport__UnorderedGroup_3__Impl ;
    public final void rule__TMTCIFExportExport__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8049:1: ( rule__TMTCIFExportExport__UnorderedGroup_3__Impl )
            // InternalEXPORT.g:8050:2: rule__TMTCIFExportExport__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFExportExport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__UnorderedGroup_3__1"


    // $ANTLR start "rule__TMTCIFModelFile__ImportsAssignment_0"
    // InternalEXPORT.g:8057:1: rule__TMTCIFModelFile__ImportsAssignment_0 : ( ruleTMTCIFModelFileImport ) ;
    public final void rule__TMTCIFModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8061:1: ( ( ruleTMTCIFModelFileImport ) )
            // InternalEXPORT.g:8062:2: ( ruleTMTCIFModelFileImport )
            {
            // InternalEXPORT.g:8062:2: ( ruleTMTCIFModelFileImport )
            // InternalEXPORT.g:8063:3: ruleTMTCIFModelFileImport
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
    // InternalEXPORT.g:8072:1: rule__TMTCIFModelFile__ElementAssignment_1 : ( ruleTMTCIFExportExport ) ;
    public final void rule__TMTCIFModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8076:1: ( ( ruleTMTCIFExportExport ) )
            // InternalEXPORT.g:8077:2: ( ruleTMTCIFExportExport )
            {
            // InternalEXPORT.g:8077:2: ( ruleTMTCIFExportExport )
            // InternalEXPORT.g:8078:3: ruleTMTCIFExportExport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportExport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFExportExportParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalEXPORT.g:8087:1: rule__TMTCIFModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8091:1: ( ( RULE_STRING ) )
            // InternalEXPORT.g:8092:2: ( RULE_STRING )
            {
            // InternalEXPORT.g:8092:2: ( RULE_STRING )
            // InternalEXPORT.g:8093:3: RULE_STRING
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


    // $ANTLR start "rule__TMTCIFExportExport__NameAssignment_1"
    // InternalEXPORT.g:8102:1: rule__TMTCIFExportExport__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportExport__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8106:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8107:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8107:2: ( RULE_ID )
            // InternalEXPORT.g:8108:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__NameAssignment_1"


    // $ANTLR start "rule__TMTCIFExportExport__UriAssignment_3_0_2"
    // InternalEXPORT.g:8117:1: rule__TMTCIFExportExport__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__TMTCIFExportExport__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8121:1: ( ( ruleQualifiedName ) )
            // InternalEXPORT.g:8122:2: ( ruleQualifiedName )
            {
            // InternalEXPORT.g:8122:2: ( ruleQualifiedName )
            // InternalEXPORT.g:8123:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__UriAssignment_3_0_2"


    // $ANTLR start "rule__TMTCIFExportExport__VersionAssignment_3_1_2"
    // InternalEXPORT.g:8132:1: rule__TMTCIFExportExport__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__TMTCIFExportExport__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8136:1: ( ( ruleVersion ) )
            // InternalEXPORT.g:8137:2: ( ruleVersion )
            {
            // InternalEXPORT.g:8137:2: ( ruleVersion )
            // InternalEXPORT.g:8138:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__VersionAssignment_3_1_2"


    // $ANTLR start "rule__TMTCIFExportExport__FromAssignment_6_1"
    // InternalEXPORT.g:8147:1: rule__TMTCIFExportExport__FromAssignment_6_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFExportExport__FromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8151:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalEXPORT.g:8152:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalEXPORT.g:8152:2: ( ( ruleVersionedQualifiedName ) )
            // InternalEXPORT.g:8153:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0()); 
            }
            // InternalEXPORT.g:8154:3: ( ruleVersionedQualifiedName )
            // InternalEXPORT.g:8155:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getFromTMTCIFFormatFormatCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__FromAssignment_6_1"


    // $ANTLR start "rule__TMTCIFExportExport__ToAssignment_10"
    // InternalEXPORT.g:8166:1: rule__TMTCIFExportExport__ToAssignment_10 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFExportExport__ToAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8170:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalEXPORT.g:8171:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalEXPORT.g:8171:2: ( ( ruleVersionedQualifiedName ) )
            // InternalEXPORT.g:8172:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0()); 
            }
            // InternalEXPORT.g:8173:3: ( ruleVersionedQualifiedName )
            // InternalEXPORT.g:8174:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getToTMTCIFFormatFormatCrossReference_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__ToAssignment_10"


    // $ANTLR start "rule__TMTCIFExportExport__SizesAssignment_12"
    // InternalEXPORT.g:8185:1: rule__TMTCIFExportExport__SizesAssignment_12 : ( ruleTMTCIFExportSizes ) ;
    public final void rule__TMTCIFExportExport__SizesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8189:1: ( ( ruleTMTCIFExportSizes ) )
            // InternalEXPORT.g:8190:2: ( ruleTMTCIFExportSizes )
            {
            // InternalEXPORT.g:8190:2: ( ruleTMTCIFExportSizes )
            // InternalEXPORT.g:8191:3: ruleTMTCIFExportSizes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSizes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSizesTMTCIFExportSizesParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__SizesAssignment_12"


    // $ANTLR start "rule__TMTCIFExportExport__SettingsAssignment_13"
    // InternalEXPORT.g:8200:1: rule__TMTCIFExportExport__SettingsAssignment_13 : ( ruleTMTCIFExportSettings ) ;
    public final void rule__TMTCIFExportExport__SettingsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8204:1: ( ( ruleTMTCIFExportSettings ) )
            // InternalEXPORT.g:8205:2: ( ruleTMTCIFExportSettings )
            {
            // InternalEXPORT.g:8205:2: ( ruleTMTCIFExportSettings )
            // InternalEXPORT.g:8206:3: ruleTMTCIFExportSettings
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getSettingsTMTCIFExportSettingsParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__SettingsAssignment_13"


    // $ANTLR start "rule__TMTCIFExportExport__ActivateDICsAssignment_14"
    // InternalEXPORT.g:8215:1: rule__TMTCIFExportExport__ActivateDICsAssignment_14 : ( ruleTMTCIFExportActivateDICs ) ;
    public final void rule__TMTCIFExportExport__ActivateDICsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8219:1: ( ( ruleTMTCIFExportActivateDICs ) )
            // InternalEXPORT.g:8220:2: ( ruleTMTCIFExportActivateDICs )
            {
            // InternalEXPORT.g:8220:2: ( ruleTMTCIFExportActivateDICs )
            // InternalEXPORT.g:8221:3: ruleTMTCIFExportActivateDICs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportActivateDICs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsTMTCIFExportActivateDICsParserRuleCall_14_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportExport__ActivateDICsAssignment_14"


    // $ANTLR start "rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0"
    // InternalEXPORT.g:8230:1: rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0 : ( ruleTMTCIFExportSizeFromFileLength ) ;
    public final void rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8234:1: ( ( ruleTMTCIFExportSizeFromFileLength ) )
            // InternalEXPORT.g:8235:2: ( ruleTMTCIFExportSizeFromFileLength )
            {
            // InternalEXPORT.g:8235:2: ( ruleTMTCIFExportSizeFromFileLength )
            // InternalEXPORT.g:8236:3: ruleTMTCIFExportSizeFromFileLength
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSizeFromFileLength();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthTMTCIFExportSizeFromFileLengthParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0"


    // $ANTLR start "rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1"
    // InternalEXPORT.g:8245:1: rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1 : ( ruleTMTCIFExportSizeFromFileLine ) ;
    public final void rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8249:1: ( ( ruleTMTCIFExportSizeFromFileLine ) )
            // InternalEXPORT.g:8250:2: ( ruleTMTCIFExportSizeFromFileLine )
            {
            // InternalEXPORT.g:8250:2: ( ruleTMTCIFExportSizeFromFileLine )
            // InternalEXPORT.g:8251:3: ruleTMTCIFExportSizeFromFileLine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSizeFromFileLine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineTMTCIFExportSizeFromFileLineParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1"


    // $ANTLR start "rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2"
    // InternalEXPORT.g:8260:1: rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2 : ( ruleTMTCIFExportSizeInBits ) ;
    public final void rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8264:1: ( ( ruleTMTCIFExportSizeInBits ) )
            // InternalEXPORT.g:8265:2: ( ruleTMTCIFExportSizeInBits )
            {
            // InternalEXPORT.g:8265:2: ( ruleTMTCIFExportSizeInBits )
            // InternalEXPORT.g:8266:3: ruleTMTCIFExportSizeInBits
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSizeInBits();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsTMTCIFExportSizeInBitsParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__IdAssignment_4"
    // InternalEXPORT.g:8275:1: rule__TMTCIFExportSizeFromFileLength__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8279:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8280:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8280:2: ( ruleINTEGER )
            // InternalEXPORT.g:8281:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8"
    // InternalEXPORT.g:8290:1: rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8294:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8295:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8295:2: ( RULE_ID )
            // InternalEXPORT.g:8296:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2"
    // InternalEXPORT.g:8305:1: rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8309:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8310:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8310:2: ( ruleINTEGER )
            // InternalEXPORT.g:8311:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2"
    // InternalEXPORT.g:8320:1: rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2 : ( ruleTMTCIFExportUnit ) ;
    public final void rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8324:1: ( ( ruleTMTCIFExportUnit ) )
            // InternalEXPORT.g:8325:2: ( ruleTMTCIFExportUnit )
            {
            // InternalEXPORT.g:8325:2: ( ruleTMTCIFExportUnit )
            // InternalEXPORT.g:8326:3: ruleTMTCIFExportUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__IdAssignment_4"
    // InternalEXPORT.g:8335:1: rule__TMTCIFExportSizeFromFileLine__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8339:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8340:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8340:2: ( ruleINTEGER )
            // InternalEXPORT.g:8341:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8"
    // InternalEXPORT.g:8350:1: rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8354:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8355:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8355:2: ( RULE_ID )
            // InternalEXPORT.g:8356:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__LineAssignment_12"
    // InternalEXPORT.g:8365:1: rule__TMTCIFExportSizeFromFileLine__LineAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__LineAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8369:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8370:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8370:2: ( ruleINTEGER )
            // InternalEXPORT.g:8371:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__LineAssignment_12"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2"
    // InternalEXPORT.g:8380:1: rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8384:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8385:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8385:2: ( ruleINTEGER )
            // InternalEXPORT.g:8386:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2"


    // $ANTLR start "rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2"
    // InternalEXPORT.g:8395:1: rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2 : ( ruleTMTCIFExportUnit ) ;
    public final void rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8399:1: ( ( ruleTMTCIFExportUnit ) )
            // InternalEXPORT.g:8400:2: ( ruleTMTCIFExportUnit )
            {
            // InternalEXPORT.g:8400:2: ( ruleTMTCIFExportUnit )
            // InternalEXPORT.g:8401:3: ruleTMTCIFExportUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitTMTCIFExportUnitEnumRuleCall_15_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__IdAssignment_4"
    // InternalEXPORT.g:8410:1: rule__TMTCIFExportSizeInBits__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeInBits__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8414:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8415:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8415:2: ( ruleINTEGER )
            // InternalEXPORT.g:8416:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__FromAssignment_8"
    // InternalEXPORT.g:8425:1: rule__TMTCIFExportSizeInBits__FromAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportSizeInBits__FromAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8429:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8430:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8430:2: ( RULE_ID )
            // InternalEXPORT.g:8431:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__FromAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2"
    // InternalEXPORT.g:8440:1: rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8444:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8445:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8445:2: ( ruleINTEGER )
            // InternalEXPORT.g:8446:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2"


    // $ANTLR start "rule__TMTCIFExportSizeInBits__UnitAssignment_11_2"
    // InternalEXPORT.g:8455:1: rule__TMTCIFExportSizeInBits__UnitAssignment_11_2 : ( ruleTMTCIFExportUnit ) ;
    public final void rule__TMTCIFExportSizeInBits__UnitAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8459:1: ( ( ruleTMTCIFExportUnit ) )
            // InternalEXPORT.g:8460:2: ( ruleTMTCIFExportUnit )
            {
            // InternalEXPORT.g:8460:2: ( ruleTMTCIFExportUnit )
            // InternalEXPORT.g:8461:3: ruleTMTCIFExportUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitTMTCIFExportUnitEnumRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSizeInBits__UnitAssignment_11_2"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0"
    // InternalEXPORT.g:8470:1: rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0 : ( ruleTMTCIFExportSettingFromConst ) ;
    public final void rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8474:1: ( ( ruleTMTCIFExportSettingFromConst ) )
            // InternalEXPORT.g:8475:2: ( ruleTMTCIFExportSettingFromConst )
            {
            // InternalEXPORT.g:8475:2: ( ruleTMTCIFExportSettingFromConst )
            // InternalEXPORT.g:8476:3: ruleTMTCIFExportSettingFromConst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingFromConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstTMTCIFExportSettingFromConstParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1"
    // InternalEXPORT.g:8485:1: rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1 : ( ruleTMTCIFExportSettingFromSize ) ;
    public final void rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8489:1: ( ( ruleTMTCIFExportSettingFromSize ) )
            // InternalEXPORT.g:8490:2: ( ruleTMTCIFExportSettingFromSize )
            {
            // InternalEXPORT.g:8490:2: ( ruleTMTCIFExportSettingFromSize )
            // InternalEXPORT.g:8491:3: ruleTMTCIFExportSettingFromSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingFromSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeTMTCIFExportSettingFromSizeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2"
    // InternalEXPORT.g:8500:1: rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2 : ( ruleTMTCIFExportSettingFromFile ) ;
    public final void rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8504:1: ( ( ruleTMTCIFExportSettingFromFile ) )
            // InternalEXPORT.g:8505:2: ( ruleTMTCIFExportSettingFromFile )
            {
            // InternalEXPORT.g:8505:2: ( ruleTMTCIFExportSettingFromFile )
            // InternalEXPORT.g:8506:3: ruleTMTCIFExportSettingFromFile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingFromFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileTMTCIFExportSettingFromFileParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3"
    // InternalEXPORT.g:8515:1: rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3 : ( ruleTMTCIFExportSettingFromField ) ;
    public final void rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8519:1: ( ( ruleTMTCIFExportSettingFromField ) )
            // InternalEXPORT.g:8520:2: ( ruleTMTCIFExportSettingFromField )
            {
            // InternalEXPORT.g:8520:2: ( ruleTMTCIFExportSettingFromField )
            // InternalEXPORT.g:8521:3: ruleTMTCIFExportSettingFromField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingFromField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldTMTCIFExportSettingFromFieldParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4"
    // InternalEXPORT.g:8530:1: rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4 : ( ruleTMTCIFExportSettingAIFromConst ) ;
    public final void rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8534:1: ( ( ruleTMTCIFExportSettingAIFromConst ) )
            // InternalEXPORT.g:8535:2: ( ruleTMTCIFExportSettingAIFromConst )
            {
            // InternalEXPORT.g:8535:2: ( ruleTMTCIFExportSettingAIFromConst )
            // InternalEXPORT.g:8536:3: ruleTMTCIFExportSettingAIFromConst
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingAIFromConst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstTMTCIFExportSettingAIFromConstParserRuleCall_3_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4"


    // $ANTLR start "rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5"
    // InternalEXPORT.g:8545:1: rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5 : ( ruleTMTCIFExportSettingAIFromFile ) ;
    public final void rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8549:1: ( ( ruleTMTCIFExportSettingAIFromFile ) )
            // InternalEXPORT.g:8550:2: ( ruleTMTCIFExportSettingAIFromFile )
            {
            // InternalEXPORT.g:8550:2: ( ruleTMTCIFExportSettingAIFromFile )
            // InternalEXPORT.g:8551:3: ruleTMTCIFExportSettingAIFromFile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportSettingAIFromFile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileTMTCIFExportSettingAIFromFileParserRuleCall_3_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__ValueAssignment_4"
    // InternalEXPORT.g:8560:1: rule__TMTCIFExportSettingFromConst__ValueAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingFromConst__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8564:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8565:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8565:2: ( ruleINTEGER )
            // InternalEXPORT.g:8566:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__ValueAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8575:1: rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8579:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8580:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8580:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8581:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8582:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8583:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4"
    // InternalEXPORT.g:8594:1: rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8598:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8599:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8599:2: ( ruleINTEGER )
            // InternalEXPORT.g:8600:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8609:1: rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8613:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8614:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8614:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8615:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8616:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8617:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__FileAssignment_4"
    // InternalEXPORT.g:8628:1: rule__TMTCIFExportSettingFromFile__FileAssignment_4 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportSettingFromFile__FileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8632:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8633:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8633:2: ( RULE_ID )
            // InternalEXPORT.g:8634:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__FileAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8643:1: rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8647:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8648:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8648:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8649:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8650:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8651:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2"
    // InternalEXPORT.g:8662:1: rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8666:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8667:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8667:2: ( ruleINTEGER )
            // InternalEXPORT.g:8668:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2"
    // InternalEXPORT.g:8677:1: rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8681:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8682:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8682:2: ( ruleINTEGER )
            // InternalEXPORT.g:8683:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2"


    // $ANTLR start "rule__TMTCIFExportSettingFromFile__LineAssignment_12_2"
    // InternalEXPORT.g:8692:1: rule__TMTCIFExportSettingFromFile__LineAssignment_12_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingFromFile__LineAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8696:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8697:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8697:2: ( ruleINTEGER )
            // InternalEXPORT.g:8698:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromFile__LineAssignment_12_2"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__FieldRefAssignment_4"
    // InternalEXPORT.g:8707:1: rule__TMTCIFExportSettingFromField__FieldRefAssignment_4 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingFromField__FieldRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8711:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8712:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8712:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8713:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }
            // InternalEXPORT.g:8714:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8715:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__FieldRefAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8726:1: rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8730:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8731:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8731:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8732:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8733:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8734:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefTMTCIFFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4"
    // InternalEXPORT.g:8745:1: rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8749:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8750:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8750:2: ( ruleINTEGER )
            // InternalEXPORT.g:8751:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8760:1: rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8764:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8765:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8765:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8766:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8767:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8768:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12"
    // InternalEXPORT.g:8779:1: rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8783:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8784:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8784:2: ( ruleINTEGER )
            // InternalEXPORT.g:8785:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__FileAssignment_4"
    // InternalEXPORT.g:8794:1: rule__TMTCIFExportSettingAIFromFile__FileAssignment_4 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__FileAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8798:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8799:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8799:2: ( RULE_ID )
            // InternalEXPORT.g:8800:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__FileAssignment_4"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8"
    // InternalEXPORT.g:8809:1: rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8813:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalEXPORT.g:8814:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalEXPORT.g:8814:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:8815:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); 
            }
            // InternalEXPORT.g:8816:3: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:8817:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefTMTCIFFormatAIFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12"
    // InternalEXPORT.g:8828:1: rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8832:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8833:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8833:2: ( ruleINTEGER )
            // InternalEXPORT.g:8834:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2"
    // InternalEXPORT.g:8843:1: rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8847:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8848:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8848:2: ( ruleINTEGER )
            // InternalEXPORT.g:8849:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2"
    // InternalEXPORT.g:8858:1: rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8862:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8863:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8863:2: ( ruleINTEGER )
            // InternalEXPORT.g:8864:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2"


    // $ANTLR start "rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2"
    // InternalEXPORT.g:8873:1: rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8877:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8878:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8878:2: ( ruleINTEGER )
            // InternalEXPORT.g:8879:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2"


    // $ANTLR start "rule__TMTCIFExportActivateDICs__DICAssignment_3"
    // InternalEXPORT.g:8888:1: rule__TMTCIFExportActivateDICs__DICAssignment_3 : ( ruleTMTCIFExportDIC ) ;
    public final void rule__TMTCIFExportActivateDICs__DICAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8892:1: ( ( ruleTMTCIFExportDIC ) )
            // InternalEXPORT.g:8893:2: ( ruleTMTCIFExportDIC )
            {
            // InternalEXPORT.g:8893:2: ( ruleTMTCIFExportDIC )
            // InternalEXPORT.g:8894:3: ruleTMTCIFExportDIC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFExportDIC();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICTMTCIFExportDICParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportActivateDICs__DICAssignment_3"


    // $ANTLR start "rule__TMTCIFExportDIC__IdAssignment_4"
    // InternalEXPORT.g:8903:1: rule__TMTCIFExportDIC__IdAssignment_4 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFExportDIC__IdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8907:1: ( ( ruleINTEGER ) )
            // InternalEXPORT.g:8908:2: ( ruleINTEGER )
            {
            // InternalEXPORT.g:8908:2: ( ruleINTEGER )
            // InternalEXPORT.g:8909:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getIdINTEGERParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__IdAssignment_4"


    // $ANTLR start "rule__TMTCIFExportDIC__DICRefAssignment_8"
    // InternalEXPORT.g:8918:1: rule__TMTCIFExportDIC__DICRefAssignment_8 : ( RULE_ID ) ;
    public final void rule__TMTCIFExportDIC__DICRefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEXPORT.g:8922:1: ( ( RULE_ID ) )
            // InternalEXPORT.g:8923:2: ( RULE_ID )
            {
            // InternalEXPORT.g:8923:2: ( RULE_ID )
            // InternalEXPORT.g:8924:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFExportDICAccess().getDICRefIDTerminalRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFExportDIC__DICRefAssignment_8"

    // $ANTLR start synpred38_InternalEXPORT
    public final void synpred38_InternalEXPORT_fragment() throws RecognitionException {   
        // InternalEXPORT.g:7995:3: ( ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) ) )
        // InternalEXPORT.g:7995:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) )
        {
        // InternalEXPORT.g:7995:3: ({...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) ) )
        // InternalEXPORT.g:7996:4: {...}? => ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred38_InternalEXPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalEXPORT.g:7996:114: ( ( ( rule__TMTCIFExportExport__Group_3_0__0 ) ) )
        // InternalEXPORT.g:7997:5: ( ( rule__TMTCIFExportExport__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), 0);
        // InternalEXPORT.g:8003:5: ( ( rule__TMTCIFExportExport__Group_3_0__0 ) )
        // InternalEXPORT.g:8004:6: ( rule__TMTCIFExportExport__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0()); 
        }
        // InternalEXPORT.g:8005:6: ( rule__TMTCIFExportExport__Group_3_0__0 )
        // InternalEXPORT.g:8005:7: rule__TMTCIFExportExport__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFExportExport__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred38_InternalEXPORT

    // $ANTLR start synpred39_InternalEXPORT
    public final void synpred39_InternalEXPORT_fragment() throws RecognitionException {   
        // InternalEXPORT.g:8039:2: ( rule__TMTCIFExportExport__UnorderedGroup_3__1 )
        // InternalEXPORT.g:8039:2: rule__TMTCIFExportExport__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFExportExport__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalEXPORT

    // Delegated rules

    public final boolean synpred38_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalEXPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEXPORT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001040L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000402000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000284000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000284000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0100000000000030L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060400000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001514800400000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001514800000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0100400000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000010L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001800002L});
    }


}