package es.uah.aut.srg.tmtcif.lang.imports.ide.contentassist.antlr.internal;

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
import es.uah.aut.srg.tmtcif.lang.imports.services.IMPORTSGrammarAccess;



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
public class InternalIMPORTSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NULL'", "'bits'", "'bytes'", "'import'", "':='", "';'", "'TMTCIFImportImport'", "'{'", "'from'", "'to'", "'}'", "'uri'", "'version'", "'TMTCIFImportDataSource'", "'FieldRef'", "'leftTrim'", "'rightTrim'", "'TMTCIFImportVirtualSize'", "'addSize'", "'unit'", "'.'", "'('", "')'", "'::'", "'-'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

    // delegates
    // delegators


        public InternalIMPORTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMPORTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMPORTSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIMPORTS.g"; }


    	private IMPORTSGrammarAccess grammarAccess;

    	public void setGrammarAccess(IMPORTSGrammarAccess grammarAccess) {
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
    // InternalIMPORTS.g:61:1: entryRuleTMTCIFModelFile : ruleTMTCIFModelFile EOF ;
    public final void entryRuleTMTCIFModelFile() throws RecognitionException {
        try {
            // InternalIMPORTS.g:62:1: ( ruleTMTCIFModelFile EOF )
            // InternalIMPORTS.g:63:1: ruleTMTCIFModelFile EOF
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
    // InternalIMPORTS.g:70:1: ruleTMTCIFModelFile : ( ( rule__TMTCIFModelFile__Group__0 ) ) ;
    public final void ruleTMTCIFModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:74:2: ( ( ( rule__TMTCIFModelFile__Group__0 ) ) )
            // InternalIMPORTS.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            {
            // InternalIMPORTS.g:75:2: ( ( rule__TMTCIFModelFile__Group__0 ) )
            // InternalIMPORTS.g:76:3: ( rule__TMTCIFModelFile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getGroup()); 
            }
            // InternalIMPORTS.g:77:3: ( rule__TMTCIFModelFile__Group__0 )
            // InternalIMPORTS.g:77:4: rule__TMTCIFModelFile__Group__0
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
    // InternalIMPORTS.g:86:1: entryRuleTMTCIFModelFileImport : ruleTMTCIFModelFileImport EOF ;
    public final void entryRuleTMTCIFModelFileImport() throws RecognitionException {
        try {
            // InternalIMPORTS.g:87:1: ( ruleTMTCIFModelFileImport EOF )
            // InternalIMPORTS.g:88:1: ruleTMTCIFModelFileImport EOF
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
    // InternalIMPORTS.g:95:1: ruleTMTCIFModelFileImport : ( ( rule__TMTCIFModelFileImport__Group__0 ) ) ;
    public final void ruleTMTCIFModelFileImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:99:2: ( ( ( rule__TMTCIFModelFileImport__Group__0 ) ) )
            // InternalIMPORTS.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            {
            // InternalIMPORTS.g:100:2: ( ( rule__TMTCIFModelFileImport__Group__0 ) )
            // InternalIMPORTS.g:101:3: ( rule__TMTCIFModelFileImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getGroup()); 
            }
            // InternalIMPORTS.g:102:3: ( rule__TMTCIFModelFileImport__Group__0 )
            // InternalIMPORTS.g:102:4: rule__TMTCIFModelFileImport__Group__0
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


    // $ANTLR start "entryRuleTMTCIFImportImport"
    // InternalIMPORTS.g:111:1: entryRuleTMTCIFImportImport : ruleTMTCIFImportImport EOF ;
    public final void entryRuleTMTCIFImportImport() throws RecognitionException {
        try {
            // InternalIMPORTS.g:112:1: ( ruleTMTCIFImportImport EOF )
            // InternalIMPORTS.g:113:1: ruleTMTCIFImportImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFImportImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportRule()); 
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
    // $ANTLR end "entryRuleTMTCIFImportImport"


    // $ANTLR start "ruleTMTCIFImportImport"
    // InternalIMPORTS.g:120:1: ruleTMTCIFImportImport : ( ( rule__TMTCIFImportImport__Group__0 ) ) ;
    public final void ruleTMTCIFImportImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:124:2: ( ( ( rule__TMTCIFImportImport__Group__0 ) ) )
            // InternalIMPORTS.g:125:2: ( ( rule__TMTCIFImportImport__Group__0 ) )
            {
            // InternalIMPORTS.g:125:2: ( ( rule__TMTCIFImportImport__Group__0 ) )
            // InternalIMPORTS.g:126:3: ( rule__TMTCIFImportImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getGroup()); 
            }
            // InternalIMPORTS.g:127:3: ( rule__TMTCIFImportImport__Group__0 )
            // InternalIMPORTS.g:127:4: rule__TMTCIFImportImport__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFImportImport"


    // $ANTLR start "entryRuleTMTCIFImportDataSource"
    // InternalIMPORTS.g:136:1: entryRuleTMTCIFImportDataSource : ruleTMTCIFImportDataSource EOF ;
    public final void entryRuleTMTCIFImportDataSource() throws RecognitionException {
        try {
            // InternalIMPORTS.g:137:1: ( ruleTMTCIFImportDataSource EOF )
            // InternalIMPORTS.g:138:1: ruleTMTCIFImportDataSource EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFImportDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceRule()); 
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
    // $ANTLR end "entryRuleTMTCIFImportDataSource"


    // $ANTLR start "ruleTMTCIFImportDataSource"
    // InternalIMPORTS.g:145:1: ruleTMTCIFImportDataSource : ( ( rule__TMTCIFImportDataSource__Group__0 ) ) ;
    public final void ruleTMTCIFImportDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:149:2: ( ( ( rule__TMTCIFImportDataSource__Group__0 ) ) )
            // InternalIMPORTS.g:150:2: ( ( rule__TMTCIFImportDataSource__Group__0 ) )
            {
            // InternalIMPORTS.g:150:2: ( ( rule__TMTCIFImportDataSource__Group__0 ) )
            // InternalIMPORTS.g:151:3: ( rule__TMTCIFImportDataSource__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getGroup()); 
            }
            // InternalIMPORTS.g:152:3: ( rule__TMTCIFImportDataSource__Group__0 )
            // InternalIMPORTS.g:152:4: rule__TMTCIFImportDataSource__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFImportDataSource"


    // $ANTLR start "entryRuleTMTCIFImportVirtualSize"
    // InternalIMPORTS.g:161:1: entryRuleTMTCIFImportVirtualSize : ruleTMTCIFImportVirtualSize EOF ;
    public final void entryRuleTMTCIFImportVirtualSize() throws RecognitionException {
        try {
            // InternalIMPORTS.g:162:1: ( ruleTMTCIFImportVirtualSize EOF )
            // InternalIMPORTS.g:163:1: ruleTMTCIFImportVirtualSize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTMTCIFImportVirtualSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeRule()); 
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
    // $ANTLR end "entryRuleTMTCIFImportVirtualSize"


    // $ANTLR start "ruleTMTCIFImportVirtualSize"
    // InternalIMPORTS.g:170:1: ruleTMTCIFImportVirtualSize : ( ( rule__TMTCIFImportVirtualSize__Group__0 ) ) ;
    public final void ruleTMTCIFImportVirtualSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:174:2: ( ( ( rule__TMTCIFImportVirtualSize__Group__0 ) ) )
            // InternalIMPORTS.g:175:2: ( ( rule__TMTCIFImportVirtualSize__Group__0 ) )
            {
            // InternalIMPORTS.g:175:2: ( ( rule__TMTCIFImportVirtualSize__Group__0 ) )
            // InternalIMPORTS.g:176:3: ( rule__TMTCIFImportVirtualSize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup()); 
            }
            // InternalIMPORTS.g:177:3: ( rule__TMTCIFImportVirtualSize__Group__0 )
            // InternalIMPORTS.g:177:4: rule__TMTCIFImportVirtualSize__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFImportVirtualSize"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIMPORTS.g:186:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIMPORTS.g:187:1: ( ruleQualifiedName EOF )
            // InternalIMPORTS.g:188:1: ruleQualifiedName EOF
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
    // InternalIMPORTS.g:195:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:199:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIMPORTS.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIMPORTS.g:200:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIMPORTS.g:201:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIMPORTS.g:202:3: ( rule__QualifiedName__Group__0 )
            // InternalIMPORTS.g:202:4: rule__QualifiedName__Group__0
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
    // InternalIMPORTS.g:211:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalIMPORTS.g:212:1: ( ruleVersion EOF )
            // InternalIMPORTS.g:213:1: ruleVersion EOF
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
    // InternalIMPORTS.g:220:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:224:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalIMPORTS.g:225:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalIMPORTS.g:225:2: ( ( rule__Version__Group__0 ) )
            // InternalIMPORTS.g:226:3: ( rule__Version__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // InternalIMPORTS.g:227:3: ( rule__Version__Group__0 )
            // InternalIMPORTS.g:227:4: rule__Version__Group__0
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
    // InternalIMPORTS.g:236:1: entryRuleVersionedQualifiedName : ruleVersionedQualifiedName EOF ;
    public final void entryRuleVersionedQualifiedName() throws RecognitionException {
        try {
            // InternalIMPORTS.g:237:1: ( ruleVersionedQualifiedName EOF )
            // InternalIMPORTS.g:238:1: ruleVersionedQualifiedName EOF
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
    // InternalIMPORTS.g:245:1: ruleVersionedQualifiedName : ( ( rule__VersionedQualifiedName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:249:2: ( ( ( rule__VersionedQualifiedName__Group__0 ) ) )
            // InternalIMPORTS.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            {
            // InternalIMPORTS.g:250:2: ( ( rule__VersionedQualifiedName__Group__0 ) )
            // InternalIMPORTS.g:251:3: ( rule__VersionedQualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getGroup()); 
            }
            // InternalIMPORTS.g:252:3: ( rule__VersionedQualifiedName__Group__0 )
            // InternalIMPORTS.g:252:4: rule__VersionedQualifiedName__Group__0
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
    // InternalIMPORTS.g:261:1: entryRuleVersionedQualifiedReferenceName : ruleVersionedQualifiedReferenceName EOF ;
    public final void entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        try {
            // InternalIMPORTS.g:262:1: ( ruleVersionedQualifiedReferenceName EOF )
            // InternalIMPORTS.g:263:1: ruleVersionedQualifiedReferenceName EOF
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
    // InternalIMPORTS.g:270:1: ruleVersionedQualifiedReferenceName : ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) ;
    public final void ruleVersionedQualifiedReferenceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:274:2: ( ( ( rule__VersionedQualifiedReferenceName__Group__0 ) ) )
            // InternalIMPORTS.g:275:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            {
            // InternalIMPORTS.g:275:2: ( ( rule__VersionedQualifiedReferenceName__Group__0 ) )
            // InternalIMPORTS.g:276:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup()); 
            }
            // InternalIMPORTS.g:277:3: ( rule__VersionedQualifiedReferenceName__Group__0 )
            // InternalIMPORTS.g:277:4: rule__VersionedQualifiedReferenceName__Group__0
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
    // InternalIMPORTS.g:286:1: entryRuleINTEGER : ruleINTEGER EOF ;
    public final void entryRuleINTEGER() throws RecognitionException {
        try {
            // InternalIMPORTS.g:287:1: ( ruleINTEGER EOF )
            // InternalIMPORTS.g:288:1: ruleINTEGER EOF
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
    // InternalIMPORTS.g:295:1: ruleINTEGER : ( ( rule__INTEGER__Alternatives ) ) ;
    public final void ruleINTEGER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:299:2: ( ( ( rule__INTEGER__Alternatives ) ) )
            // InternalIMPORTS.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            {
            // InternalIMPORTS.g:300:2: ( ( rule__INTEGER__Alternatives ) )
            // InternalIMPORTS.g:301:3: ( rule__INTEGER__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getAlternatives()); 
            }
            // InternalIMPORTS.g:302:3: ( rule__INTEGER__Alternatives )
            // InternalIMPORTS.g:302:4: rule__INTEGER__Alternatives
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


    // $ANTLR start "ruleTMTCIFImportUnit"
    // InternalIMPORTS.g:311:1: ruleTMTCIFImportUnit : ( ( rule__TMTCIFImportUnit__Alternatives ) ) ;
    public final void ruleTMTCIFImportUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:315:1: ( ( ( rule__TMTCIFImportUnit__Alternatives ) ) )
            // InternalIMPORTS.g:316:2: ( ( rule__TMTCIFImportUnit__Alternatives ) )
            {
            // InternalIMPORTS.g:316:2: ( ( rule__TMTCIFImportUnit__Alternatives ) )
            // InternalIMPORTS.g:317:3: ( rule__TMTCIFImportUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportUnitAccess().getAlternatives()); 
            }
            // InternalIMPORTS.g:318:3: ( rule__TMTCIFImportUnit__Alternatives )
            // InternalIMPORTS.g:318:4: rule__TMTCIFImportUnit__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTMTCIFImportUnit"


    // $ANTLR start "rule__TMTCIFImportImport__Alternatives_10"
    // InternalIMPORTS.g:326:1: rule__TMTCIFImportImport__Alternatives_10 : ( ( 'NULL' ) | ( ( rule__TMTCIFImportImport__ToAssignment_10_1 ) ) );
    public final void rule__TMTCIFImportImport__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:330:1: ( ( 'NULL' ) | ( ( rule__TMTCIFImportImport__ToAssignment_10_1 ) ) )
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
                    // InternalIMPORTS.g:331:2: ( 'NULL' )
                    {
                    // InternalIMPORTS.g:331:2: ( 'NULL' )
                    // InternalIMPORTS.g:332:3: 'NULL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportImportAccess().getNULLKeyword_10_0()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportImportAccess().getNULLKeyword_10_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORTS.g:337:2: ( ( rule__TMTCIFImportImport__ToAssignment_10_1 ) )
                    {
                    // InternalIMPORTS.g:337:2: ( ( rule__TMTCIFImportImport__ToAssignment_10_1 ) )
                    // InternalIMPORTS.g:338:3: ( rule__TMTCIFImportImport__ToAssignment_10_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportImportAccess().getToAssignment_10_1()); 
                    }
                    // InternalIMPORTS.g:339:3: ( rule__TMTCIFImportImport__ToAssignment_10_1 )
                    // InternalIMPORTS.g:339:4: rule__TMTCIFImportImport__ToAssignment_10_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportImport__ToAssignment_10_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportImportAccess().getToAssignment_10_1()); 
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
    // $ANTLR end "rule__TMTCIFImportImport__Alternatives_10"


    // $ANTLR start "rule__Version__Alternatives_0"
    // InternalIMPORTS.g:347:1: rule__Version__Alternatives_0 : ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) );
    public final void rule__Version__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:351:1: ( ( RULE_INT ) | ( ( rule__Version__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==17||LA2_1==32||LA2_1==34) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIMPORTS.g:352:2: ( RULE_INT )
                    {
                    // InternalIMPORTS.g:352:2: ( RULE_INT )
                    // InternalIMPORTS.g:353:3: RULE_INT
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
                    // InternalIMPORTS.g:358:2: ( ( rule__Version__Group_0_1__0 ) )
                    {
                    // InternalIMPORTS.g:358:2: ( ( rule__Version__Group_0_1__0 ) )
                    // InternalIMPORTS.g:359:3: ( rule__Version__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_0_1()); 
                    }
                    // InternalIMPORTS.g:360:3: ( rule__Version__Group_0_1__0 )
                    // InternalIMPORTS.g:360:4: rule__Version__Group_0_1__0
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
    // InternalIMPORTS.g:368:1: rule__Version__Alternatives_1_1 : ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) );
    public final void rule__Version__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:372:1: ( ( RULE_INT ) | ( ( rule__Version__Group_1_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==17||LA3_1==32||LA3_1==34) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIMPORTS.g:373:2: ( RULE_INT )
                    {
                    // InternalIMPORTS.g:373:2: ( RULE_INT )
                    // InternalIMPORTS.g:374:3: RULE_INT
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
                    // InternalIMPORTS.g:379:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    {
                    // InternalIMPORTS.g:379:2: ( ( rule__Version__Group_1_1_1__0 ) )
                    // InternalIMPORTS.g:380:3: ( rule__Version__Group_1_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVersionAccess().getGroup_1_1_1()); 
                    }
                    // InternalIMPORTS.g:381:3: ( rule__Version__Group_1_1_1__0 )
                    // InternalIMPORTS.g:381:4: rule__Version__Group_1_1_1__0
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
    // InternalIMPORTS.g:389:1: rule__INTEGER__Alternatives : ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) );
    public final void rule__INTEGER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:393:1: ( ( ( rule__INTEGER__Group_0__0 ) ) | ( RULE_HEXADECIMAL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_HEXADECIMAL) ) {
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
                    // InternalIMPORTS.g:394:2: ( ( rule__INTEGER__Group_0__0 ) )
                    {
                    // InternalIMPORTS.g:394:2: ( ( rule__INTEGER__Group_0__0 ) )
                    // InternalIMPORTS.g:395:3: ( rule__INTEGER__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getINTEGERAccess().getGroup_0()); 
                    }
                    // InternalIMPORTS.g:396:3: ( rule__INTEGER__Group_0__0 )
                    // InternalIMPORTS.g:396:4: rule__INTEGER__Group_0__0
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
                    // InternalIMPORTS.g:400:2: ( RULE_HEXADECIMAL )
                    {
                    // InternalIMPORTS.g:400:2: ( RULE_HEXADECIMAL )
                    // InternalIMPORTS.g:401:3: RULE_HEXADECIMAL
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


    // $ANTLR start "rule__TMTCIFImportUnit__Alternatives"
    // InternalIMPORTS.g:410:1: rule__TMTCIFImportUnit__Alternatives : ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) );
    public final void rule__TMTCIFImportUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:414:1: ( ( ( 'bits' ) ) | ( ( 'bytes' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
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
                    // InternalIMPORTS.g:415:2: ( ( 'bits' ) )
                    {
                    // InternalIMPORTS.g:415:2: ( ( 'bits' ) )
                    // InternalIMPORTS.g:416:3: ( 'bits' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }
                    // InternalIMPORTS.g:417:3: ( 'bits' )
                    // InternalIMPORTS.g:417:4: 'bits'
                    {
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportUnitAccess().getBitsEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORTS.g:421:2: ( ( 'bytes' ) )
                    {
                    // InternalIMPORTS.g:421:2: ( ( 'bytes' ) )
                    // InternalIMPORTS.g:422:3: ( 'bytes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
                    }
                    // InternalIMPORTS.g:423:3: ( 'bytes' )
                    // InternalIMPORTS.g:423:4: 'bytes'
                    {
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportUnitAccess().getBytesEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__TMTCIFImportUnit__Alternatives"


    // $ANTLR start "rule__TMTCIFModelFile__Group__0"
    // InternalIMPORTS.g:431:1: rule__TMTCIFModelFile__Group__0 : rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 ;
    public final void rule__TMTCIFModelFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:435:1: ( rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1 )
            // InternalIMPORTS.g:436:2: rule__TMTCIFModelFile__Group__0__Impl rule__TMTCIFModelFile__Group__1
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
    // InternalIMPORTS.g:443:1: rule__TMTCIFModelFile__Group__0__Impl : ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) ;
    public final void rule__TMTCIFModelFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:447:1: ( ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* ) )
            // InternalIMPORTS.g:448:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            {
            // InternalIMPORTS.g:448:1: ( ( rule__TMTCIFModelFile__ImportsAssignment_0 )* )
            // InternalIMPORTS.g:449:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0()); 
            }
            // InternalIMPORTS.g:450:2: ( rule__TMTCIFModelFile__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIMPORTS.g:450:3: rule__TMTCIFModelFile__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__TMTCIFModelFile__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalIMPORTS.g:458:1: rule__TMTCIFModelFile__Group__1 : rule__TMTCIFModelFile__Group__1__Impl ;
    public final void rule__TMTCIFModelFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:462:1: ( rule__TMTCIFModelFile__Group__1__Impl )
            // InternalIMPORTS.g:463:2: rule__TMTCIFModelFile__Group__1__Impl
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
    // InternalIMPORTS.g:469:1: rule__TMTCIFModelFile__Group__1__Impl : ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) ;
    public final void rule__TMTCIFModelFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:473:1: ( ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) ) )
            // InternalIMPORTS.g:474:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            {
            // InternalIMPORTS.g:474:1: ( ( rule__TMTCIFModelFile__ElementAssignment_1 ) )
            // InternalIMPORTS.g:475:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1()); 
            }
            // InternalIMPORTS.g:476:2: ( rule__TMTCIFModelFile__ElementAssignment_1 )
            // InternalIMPORTS.g:476:3: rule__TMTCIFModelFile__ElementAssignment_1
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
    // InternalIMPORTS.g:485:1: rule__TMTCIFModelFileImport__Group__0 : rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 ;
    public final void rule__TMTCIFModelFileImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:489:1: ( rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1 )
            // InternalIMPORTS.g:490:2: rule__TMTCIFModelFileImport__Group__0__Impl rule__TMTCIFModelFileImport__Group__1
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
    // InternalIMPORTS.g:497:1: rule__TMTCIFModelFileImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__TMTCIFModelFileImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:501:1: ( ( 'import' ) )
            // InternalIMPORTS.g:502:1: ( 'import' )
            {
            // InternalIMPORTS.g:502:1: ( 'import' )
            // InternalIMPORTS.g:503:2: 'import'
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
    // InternalIMPORTS.g:512:1: rule__TMTCIFModelFileImport__Group__1 : rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 ;
    public final void rule__TMTCIFModelFileImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:516:1: ( rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2 )
            // InternalIMPORTS.g:517:2: rule__TMTCIFModelFileImport__Group__1__Impl rule__TMTCIFModelFileImport__Group__2
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
    // InternalIMPORTS.g:524:1: rule__TMTCIFModelFileImport__Group__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFModelFileImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:528:1: ( ( ':=' ) )
            // InternalIMPORTS.g:529:1: ( ':=' )
            {
            // InternalIMPORTS.g:529:1: ( ':=' )
            // InternalIMPORTS.g:530:2: ':='
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
    // InternalIMPORTS.g:539:1: rule__TMTCIFModelFileImport__Group__2 : rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 ;
    public final void rule__TMTCIFModelFileImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:543:1: ( rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3 )
            // InternalIMPORTS.g:544:2: rule__TMTCIFModelFileImport__Group__2__Impl rule__TMTCIFModelFileImport__Group__3
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
    // InternalIMPORTS.g:551:1: rule__TMTCIFModelFileImport__Group__2__Impl : ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) ;
    public final void rule__TMTCIFModelFileImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:555:1: ( ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) ) )
            // InternalIMPORTS.g:556:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            {
            // InternalIMPORTS.g:556:1: ( ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 ) )
            // InternalIMPORTS.g:557:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2()); 
            }
            // InternalIMPORTS.g:558:2: ( rule__TMTCIFModelFileImport__ImportURIAssignment_2 )
            // InternalIMPORTS.g:558:3: rule__TMTCIFModelFileImport__ImportURIAssignment_2
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
    // InternalIMPORTS.g:566:1: rule__TMTCIFModelFileImport__Group__3 : rule__TMTCIFModelFileImport__Group__3__Impl ;
    public final void rule__TMTCIFModelFileImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:570:1: ( rule__TMTCIFModelFileImport__Group__3__Impl )
            // InternalIMPORTS.g:571:2: rule__TMTCIFModelFileImport__Group__3__Impl
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
    // InternalIMPORTS.g:577:1: rule__TMTCIFModelFileImport__Group__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFModelFileImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:581:1: ( ( ';' ) )
            // InternalIMPORTS.g:582:1: ( ';' )
            {
            // InternalIMPORTS.g:582:1: ( ';' )
            // InternalIMPORTS.g:583:2: ';'
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


    // $ANTLR start "rule__TMTCIFImportImport__Group__0"
    // InternalIMPORTS.g:593:1: rule__TMTCIFImportImport__Group__0 : rule__TMTCIFImportImport__Group__0__Impl rule__TMTCIFImportImport__Group__1 ;
    public final void rule__TMTCIFImportImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:597:1: ( rule__TMTCIFImportImport__Group__0__Impl rule__TMTCIFImportImport__Group__1 )
            // InternalIMPORTS.g:598:2: rule__TMTCIFImportImport__Group__0__Impl rule__TMTCIFImportImport__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__0"


    // $ANTLR start "rule__TMTCIFImportImport__Group__0__Impl"
    // InternalIMPORTS.g:605:1: rule__TMTCIFImportImport__Group__0__Impl : ( 'TMTCIFImportImport' ) ;
    public final void rule__TMTCIFImportImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:609:1: ( ( 'TMTCIFImportImport' ) )
            // InternalIMPORTS.g:610:1: ( 'TMTCIFImportImport' )
            {
            // InternalIMPORTS.g:610:1: ( 'TMTCIFImportImport' )
            // InternalIMPORTS.g:611:2: 'TMTCIFImportImport'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getTMTCIFImportImportKeyword_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getTMTCIFImportImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__1"
    // InternalIMPORTS.g:620:1: rule__TMTCIFImportImport__Group__1 : rule__TMTCIFImportImport__Group__1__Impl rule__TMTCIFImportImport__Group__2 ;
    public final void rule__TMTCIFImportImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:624:1: ( rule__TMTCIFImportImport__Group__1__Impl rule__TMTCIFImportImport__Group__2 )
            // InternalIMPORTS.g:625:2: rule__TMTCIFImportImport__Group__1__Impl rule__TMTCIFImportImport__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFImportImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__1"


    // $ANTLR start "rule__TMTCIFImportImport__Group__1__Impl"
    // InternalIMPORTS.g:632:1: rule__TMTCIFImportImport__Group__1__Impl : ( ( rule__TMTCIFImportImport__NameAssignment_1 ) ) ;
    public final void rule__TMTCIFImportImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:636:1: ( ( ( rule__TMTCIFImportImport__NameAssignment_1 ) ) )
            // InternalIMPORTS.g:637:1: ( ( rule__TMTCIFImportImport__NameAssignment_1 ) )
            {
            // InternalIMPORTS.g:637:1: ( ( rule__TMTCIFImportImport__NameAssignment_1 ) )
            // InternalIMPORTS.g:638:2: ( rule__TMTCIFImportImport__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getNameAssignment_1()); 
            }
            // InternalIMPORTS.g:639:2: ( rule__TMTCIFImportImport__NameAssignment_1 )
            // InternalIMPORTS.g:639:3: rule__TMTCIFImportImport__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__2"
    // InternalIMPORTS.g:647:1: rule__TMTCIFImportImport__Group__2 : rule__TMTCIFImportImport__Group__2__Impl rule__TMTCIFImportImport__Group__3 ;
    public final void rule__TMTCIFImportImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:651:1: ( rule__TMTCIFImportImport__Group__2__Impl rule__TMTCIFImportImport__Group__3 )
            // InternalIMPORTS.g:652:2: rule__TMTCIFImportImport__Group__2__Impl rule__TMTCIFImportImport__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TMTCIFImportImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__2"


    // $ANTLR start "rule__TMTCIFImportImport__Group__2__Impl"
    // InternalIMPORTS.g:659:1: rule__TMTCIFImportImport__Group__2__Impl : ( '{' ) ;
    public final void rule__TMTCIFImportImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:663:1: ( ( '{' ) )
            // InternalIMPORTS.g:664:1: ( '{' )
            {
            // InternalIMPORTS.g:664:1: ( '{' )
            // InternalIMPORTS.g:665:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__3"
    // InternalIMPORTS.g:674:1: rule__TMTCIFImportImport__Group__3 : rule__TMTCIFImportImport__Group__3__Impl rule__TMTCIFImportImport__Group__4 ;
    public final void rule__TMTCIFImportImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:678:1: ( rule__TMTCIFImportImport__Group__3__Impl rule__TMTCIFImportImport__Group__4 )
            // InternalIMPORTS.g:679:2: rule__TMTCIFImportImport__Group__3__Impl rule__TMTCIFImportImport__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__TMTCIFImportImport__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__3"


    // $ANTLR start "rule__TMTCIFImportImport__Group__3__Impl"
    // InternalIMPORTS.g:686:1: rule__TMTCIFImportImport__Group__3__Impl : ( ( rule__TMTCIFImportImport__UnorderedGroup_3 ) ) ;
    public final void rule__TMTCIFImportImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:690:1: ( ( ( rule__TMTCIFImportImport__UnorderedGroup_3 ) ) )
            // InternalIMPORTS.g:691:1: ( ( rule__TMTCIFImportImport__UnorderedGroup_3 ) )
            {
            // InternalIMPORTS.g:691:1: ( ( rule__TMTCIFImportImport__UnorderedGroup_3 ) )
            // InternalIMPORTS.g:692:2: ( rule__TMTCIFImportImport__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()); 
            }
            // InternalIMPORTS.g:693:2: ( rule__TMTCIFImportImport__UnorderedGroup_3 )
            // InternalIMPORTS.g:693:3: rule__TMTCIFImportImport__UnorderedGroup_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__4"
    // InternalIMPORTS.g:701:1: rule__TMTCIFImportImport__Group__4 : rule__TMTCIFImportImport__Group__4__Impl rule__TMTCIFImportImport__Group__5 ;
    public final void rule__TMTCIFImportImport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:705:1: ( rule__TMTCIFImportImport__Group__4__Impl rule__TMTCIFImportImport__Group__5 )
            // InternalIMPORTS.g:706:2: rule__TMTCIFImportImport__Group__4__Impl rule__TMTCIFImportImport__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportImport__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__4"


    // $ANTLR start "rule__TMTCIFImportImport__Group__4__Impl"
    // InternalIMPORTS.g:713:1: rule__TMTCIFImportImport__Group__4__Impl : ( 'from' ) ;
    public final void rule__TMTCIFImportImport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:717:1: ( ( 'from' ) )
            // InternalIMPORTS.g:718:1: ( 'from' )
            {
            // InternalIMPORTS.g:718:1: ( 'from' )
            // InternalIMPORTS.g:719:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getFromKeyword_4()); 
            }
            match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getFromKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__5"
    // InternalIMPORTS.g:728:1: rule__TMTCIFImportImport__Group__5 : rule__TMTCIFImportImport__Group__5__Impl rule__TMTCIFImportImport__Group__6 ;
    public final void rule__TMTCIFImportImport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:732:1: ( rule__TMTCIFImportImport__Group__5__Impl rule__TMTCIFImportImport__Group__6 )
            // InternalIMPORTS.g:733:2: rule__TMTCIFImportImport__Group__5__Impl rule__TMTCIFImportImport__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportImport__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__5"


    // $ANTLR start "rule__TMTCIFImportImport__Group__5__Impl"
    // InternalIMPORTS.g:740:1: rule__TMTCIFImportImport__Group__5__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportImport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:744:1: ( ( ':=' ) )
            // InternalIMPORTS.g:745:1: ( ':=' )
            {
            // InternalIMPORTS.g:745:1: ( ':=' )
            // InternalIMPORTS.g:746:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_5()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__6"
    // InternalIMPORTS.g:755:1: rule__TMTCIFImportImport__Group__6 : rule__TMTCIFImportImport__Group__6__Impl rule__TMTCIFImportImport__Group__7 ;
    public final void rule__TMTCIFImportImport__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:759:1: ( rule__TMTCIFImportImport__Group__6__Impl rule__TMTCIFImportImport__Group__7 )
            // InternalIMPORTS.g:760:2: rule__TMTCIFImportImport__Group__6__Impl rule__TMTCIFImportImport__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportImport__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__6"


    // $ANTLR start "rule__TMTCIFImportImport__Group__6__Impl"
    // InternalIMPORTS.g:767:1: rule__TMTCIFImportImport__Group__6__Impl : ( ( rule__TMTCIFImportImport__FromAssignment_6 ) ) ;
    public final void rule__TMTCIFImportImport__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:771:1: ( ( ( rule__TMTCIFImportImport__FromAssignment_6 ) ) )
            // InternalIMPORTS.g:772:1: ( ( rule__TMTCIFImportImport__FromAssignment_6 ) )
            {
            // InternalIMPORTS.g:772:1: ( ( rule__TMTCIFImportImport__FromAssignment_6 ) )
            // InternalIMPORTS.g:773:2: ( rule__TMTCIFImportImport__FromAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getFromAssignment_6()); 
            }
            // InternalIMPORTS.g:774:2: ( rule__TMTCIFImportImport__FromAssignment_6 )
            // InternalIMPORTS.g:774:3: rule__TMTCIFImportImport__FromAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__FromAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getFromAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__7"
    // InternalIMPORTS.g:782:1: rule__TMTCIFImportImport__Group__7 : rule__TMTCIFImportImport__Group__7__Impl rule__TMTCIFImportImport__Group__8 ;
    public final void rule__TMTCIFImportImport__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:786:1: ( rule__TMTCIFImportImport__Group__7__Impl rule__TMTCIFImportImport__Group__8 )
            // InternalIMPORTS.g:787:2: rule__TMTCIFImportImport__Group__7__Impl rule__TMTCIFImportImport__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFImportImport__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__7"


    // $ANTLR start "rule__TMTCIFImportImport__Group__7__Impl"
    // InternalIMPORTS.g:794:1: rule__TMTCIFImportImport__Group__7__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportImport__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:798:1: ( ( ';' ) )
            // InternalIMPORTS.g:799:1: ( ';' )
            {
            // InternalIMPORTS.g:799:1: ( ';' )
            // InternalIMPORTS.g:800:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_7()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__8"
    // InternalIMPORTS.g:809:1: rule__TMTCIFImportImport__Group__8 : rule__TMTCIFImportImport__Group__8__Impl rule__TMTCIFImportImport__Group__9 ;
    public final void rule__TMTCIFImportImport__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:813:1: ( rule__TMTCIFImportImport__Group__8__Impl rule__TMTCIFImportImport__Group__9 )
            // InternalIMPORTS.g:814:2: rule__TMTCIFImportImport__Group__8__Impl rule__TMTCIFImportImport__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportImport__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__8"


    // $ANTLR start "rule__TMTCIFImportImport__Group__8__Impl"
    // InternalIMPORTS.g:821:1: rule__TMTCIFImportImport__Group__8__Impl : ( 'to' ) ;
    public final void rule__TMTCIFImportImport__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:825:1: ( ( 'to' ) )
            // InternalIMPORTS.g:826:1: ( 'to' )
            {
            // InternalIMPORTS.g:826:1: ( 'to' )
            // InternalIMPORTS.g:827:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getToKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getToKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__9"
    // InternalIMPORTS.g:836:1: rule__TMTCIFImportImport__Group__9 : rule__TMTCIFImportImport__Group__9__Impl rule__TMTCIFImportImport__Group__10 ;
    public final void rule__TMTCIFImportImport__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:840:1: ( rule__TMTCIFImportImport__Group__9__Impl rule__TMTCIFImportImport__Group__10 )
            // InternalIMPORTS.g:841:2: rule__TMTCIFImportImport__Group__9__Impl rule__TMTCIFImportImport__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__TMTCIFImportImport__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__9"


    // $ANTLR start "rule__TMTCIFImportImport__Group__9__Impl"
    // InternalIMPORTS.g:848:1: rule__TMTCIFImportImport__Group__9__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportImport__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:852:1: ( ( ':=' ) )
            // InternalIMPORTS.g:853:1: ( ':=' )
            {
            // InternalIMPORTS.g:853:1: ( ':=' )
            // InternalIMPORTS.g:854:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_9()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__10"
    // InternalIMPORTS.g:863:1: rule__TMTCIFImportImport__Group__10 : rule__TMTCIFImportImport__Group__10__Impl rule__TMTCIFImportImport__Group__11 ;
    public final void rule__TMTCIFImportImport__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:867:1: ( rule__TMTCIFImportImport__Group__10__Impl rule__TMTCIFImportImport__Group__11 )
            // InternalIMPORTS.g:868:2: rule__TMTCIFImportImport__Group__10__Impl rule__TMTCIFImportImport__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportImport__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__10"


    // $ANTLR start "rule__TMTCIFImportImport__Group__10__Impl"
    // InternalIMPORTS.g:875:1: rule__TMTCIFImportImport__Group__10__Impl : ( ( rule__TMTCIFImportImport__Alternatives_10 ) ) ;
    public final void rule__TMTCIFImportImport__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:879:1: ( ( ( rule__TMTCIFImportImport__Alternatives_10 ) ) )
            // InternalIMPORTS.g:880:1: ( ( rule__TMTCIFImportImport__Alternatives_10 ) )
            {
            // InternalIMPORTS.g:880:1: ( ( rule__TMTCIFImportImport__Alternatives_10 ) )
            // InternalIMPORTS.g:881:2: ( rule__TMTCIFImportImport__Alternatives_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getAlternatives_10()); 
            }
            // InternalIMPORTS.g:882:2: ( rule__TMTCIFImportImport__Alternatives_10 )
            // InternalIMPORTS.g:882:3: rule__TMTCIFImportImport__Alternatives_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Alternatives_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getAlternatives_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__11"
    // InternalIMPORTS.g:890:1: rule__TMTCIFImportImport__Group__11 : rule__TMTCIFImportImport__Group__11__Impl rule__TMTCIFImportImport__Group__12 ;
    public final void rule__TMTCIFImportImport__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:894:1: ( rule__TMTCIFImportImport__Group__11__Impl rule__TMTCIFImportImport__Group__12 )
            // InternalIMPORTS.g:895:2: rule__TMTCIFImportImport__Group__11__Impl rule__TMTCIFImportImport__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__TMTCIFImportImport__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__11"


    // $ANTLR start "rule__TMTCIFImportImport__Group__11__Impl"
    // InternalIMPORTS.g:902:1: rule__TMTCIFImportImport__Group__11__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportImport__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:906:1: ( ( ';' ) )
            // InternalIMPORTS.g:907:1: ( ';' )
            {
            // InternalIMPORTS.g:907:1: ( ';' )
            // InternalIMPORTS.g:908:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_11()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__12"
    // InternalIMPORTS.g:917:1: rule__TMTCIFImportImport__Group__12 : rule__TMTCIFImportImport__Group__12__Impl rule__TMTCIFImportImport__Group__13 ;
    public final void rule__TMTCIFImportImport__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:921:1: ( rule__TMTCIFImportImport__Group__12__Impl rule__TMTCIFImportImport__Group__13 )
            // InternalIMPORTS.g:922:2: rule__TMTCIFImportImport__Group__12__Impl rule__TMTCIFImportImport__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFImportImport__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__12"


    // $ANTLR start "rule__TMTCIFImportImport__Group__12__Impl"
    // InternalIMPORTS.g:929:1: rule__TMTCIFImportImport__Group__12__Impl : ( ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) ) ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* ) ) ;
    public final void rule__TMTCIFImportImport__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:933:1: ( ( ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) ) ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* ) ) )
            // InternalIMPORTS.g:934:1: ( ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) ) ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* ) )
            {
            // InternalIMPORTS.g:934:1: ( ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) ) ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* ) )
            // InternalIMPORTS.g:935:2: ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) ) ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* )
            {
            // InternalIMPORTS.g:935:2: ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 ) )
            // InternalIMPORTS.g:936:3: ( rule__TMTCIFImportImport__DataSourceAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); 
            }
            // InternalIMPORTS.g:937:3: ( rule__TMTCIFImportImport__DataSourceAssignment_12 )
            // InternalIMPORTS.g:937:4: rule__TMTCIFImportImport__DataSourceAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__TMTCIFImportImport__DataSourceAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); 
            }

            }

            // InternalIMPORTS.g:940:2: ( ( rule__TMTCIFImportImport__DataSourceAssignment_12 )* )
            // InternalIMPORTS.g:941:3: ( rule__TMTCIFImportImport__DataSourceAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); 
            }
            // InternalIMPORTS.g:942:3: ( rule__TMTCIFImportImport__DataSourceAssignment_12 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIMPORTS.g:942:4: rule__TMTCIFImportImport__DataSourceAssignment_12
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__TMTCIFImportImport__DataSourceAssignment_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12()); 
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
    // $ANTLR end "rule__TMTCIFImportImport__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__13"
    // InternalIMPORTS.g:951:1: rule__TMTCIFImportImport__Group__13 : rule__TMTCIFImportImport__Group__13__Impl rule__TMTCIFImportImport__Group__14 ;
    public final void rule__TMTCIFImportImport__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:955:1: ( rule__TMTCIFImportImport__Group__13__Impl rule__TMTCIFImportImport__Group__14 )
            // InternalIMPORTS.g:956:2: rule__TMTCIFImportImport__Group__13__Impl rule__TMTCIFImportImport__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__TMTCIFImportImport__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__13"


    // $ANTLR start "rule__TMTCIFImportImport__Group__13__Impl"
    // InternalIMPORTS.g:963:1: rule__TMTCIFImportImport__Group__13__Impl : ( ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )? ) ;
    public final void rule__TMTCIFImportImport__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:967:1: ( ( ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )? ) )
            // InternalIMPORTS.g:968:1: ( ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )? )
            {
            // InternalIMPORTS.g:968:1: ( ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )? )
            // InternalIMPORTS.g:969:2: ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeAssignment_13()); 
            }
            // InternalIMPORTS.g:970:2: ( rule__TMTCIFImportImport__VirtualSizeAssignment_13 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIMPORTS.g:970:3: rule__TMTCIFImportImport__VirtualSizeAssignment_13
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportImport__VirtualSizeAssignment_13();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeAssignment_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__14"
    // InternalIMPORTS.g:978:1: rule__TMTCIFImportImport__Group__14 : rule__TMTCIFImportImport__Group__14__Impl rule__TMTCIFImportImport__Group__15 ;
    public final void rule__TMTCIFImportImport__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:982:1: ( rule__TMTCIFImportImport__Group__14__Impl rule__TMTCIFImportImport__Group__15 )
            // InternalIMPORTS.g:983:2: rule__TMTCIFImportImport__Group__14__Impl rule__TMTCIFImportImport__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportImport__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__14"


    // $ANTLR start "rule__TMTCIFImportImport__Group__14__Impl"
    // InternalIMPORTS.g:990:1: rule__TMTCIFImportImport__Group__14__Impl : ( '}' ) ;
    public final void rule__TMTCIFImportImport__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:994:1: ( ( '}' ) )
            // InternalIMPORTS.g:995:1: ( '}' )
            {
            // InternalIMPORTS.g:995:1: ( '}' )
            // InternalIMPORTS.g:996:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group__15"
    // InternalIMPORTS.g:1005:1: rule__TMTCIFImportImport__Group__15 : rule__TMTCIFImportImport__Group__15__Impl ;
    public final void rule__TMTCIFImportImport__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1009:1: ( rule__TMTCIFImportImport__Group__15__Impl )
            // InternalIMPORTS.g:1010:2: rule__TMTCIFImportImport__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__15"


    // $ANTLR start "rule__TMTCIFImportImport__Group__15__Impl"
    // InternalIMPORTS.g:1016:1: rule__TMTCIFImportImport__Group__15__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportImport__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1020:1: ( ( ';' ) )
            // InternalIMPORTS.g:1021:1: ( ';' )
            {
            // InternalIMPORTS.g:1021:1: ( ';' )
            // InternalIMPORTS.g:1022:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_15()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__0"
    // InternalIMPORTS.g:1032:1: rule__TMTCIFImportImport__Group_3_0__0 : rule__TMTCIFImportImport__Group_3_0__0__Impl rule__TMTCIFImportImport__Group_3_0__1 ;
    public final void rule__TMTCIFImportImport__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1036:1: ( rule__TMTCIFImportImport__Group_3_0__0__Impl rule__TMTCIFImportImport__Group_3_0__1 )
            // InternalIMPORTS.g:1037:2: rule__TMTCIFImportImport__Group_3_0__0__Impl rule__TMTCIFImportImport__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportImport__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__0"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__0__Impl"
    // InternalIMPORTS.g:1044:1: rule__TMTCIFImportImport__Group_3_0__0__Impl : ( 'uri' ) ;
    public final void rule__TMTCIFImportImport__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1048:1: ( ( 'uri' ) )
            // InternalIMPORTS.g:1049:1: ( 'uri' )
            {
            // InternalIMPORTS.g:1049:1: ( 'uri' )
            // InternalIMPORTS.g:1050:2: 'uri'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getUriKeyword_3_0_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getUriKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__0__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__1"
    // InternalIMPORTS.g:1059:1: rule__TMTCIFImportImport__Group_3_0__1 : rule__TMTCIFImportImport__Group_3_0__1__Impl rule__TMTCIFImportImport__Group_3_0__2 ;
    public final void rule__TMTCIFImportImport__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1063:1: ( rule__TMTCIFImportImport__Group_3_0__1__Impl rule__TMTCIFImportImport__Group_3_0__2 )
            // InternalIMPORTS.g:1064:2: rule__TMTCIFImportImport__Group_3_0__1__Impl rule__TMTCIFImportImport__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportImport__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__1"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__1__Impl"
    // InternalIMPORTS.g:1071:1: rule__TMTCIFImportImport__Group_3_0__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportImport__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1075:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1076:1: ( ':=' )
            {
            // InternalIMPORTS.g:1076:1: ( ':=' )
            // InternalIMPORTS.g:1077:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__1__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__2"
    // InternalIMPORTS.g:1086:1: rule__TMTCIFImportImport__Group_3_0__2 : rule__TMTCIFImportImport__Group_3_0__2__Impl rule__TMTCIFImportImport__Group_3_0__3 ;
    public final void rule__TMTCIFImportImport__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1090:1: ( rule__TMTCIFImportImport__Group_3_0__2__Impl rule__TMTCIFImportImport__Group_3_0__3 )
            // InternalIMPORTS.g:1091:2: rule__TMTCIFImportImport__Group_3_0__2__Impl rule__TMTCIFImportImport__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportImport__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__2"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__2__Impl"
    // InternalIMPORTS.g:1098:1: rule__TMTCIFImportImport__Group_3_0__2__Impl : ( ( rule__TMTCIFImportImport__UriAssignment_3_0_2 ) ) ;
    public final void rule__TMTCIFImportImport__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1102:1: ( ( ( rule__TMTCIFImportImport__UriAssignment_3_0_2 ) ) )
            // InternalIMPORTS.g:1103:1: ( ( rule__TMTCIFImportImport__UriAssignment_3_0_2 ) )
            {
            // InternalIMPORTS.g:1103:1: ( ( rule__TMTCIFImportImport__UriAssignment_3_0_2 ) )
            // InternalIMPORTS.g:1104:2: ( rule__TMTCIFImportImport__UriAssignment_3_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getUriAssignment_3_0_2()); 
            }
            // InternalIMPORTS.g:1105:2: ( rule__TMTCIFImportImport__UriAssignment_3_0_2 )
            // InternalIMPORTS.g:1105:3: rule__TMTCIFImportImport__UriAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__UriAssignment_3_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getUriAssignment_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__2__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__3"
    // InternalIMPORTS.g:1113:1: rule__TMTCIFImportImport__Group_3_0__3 : rule__TMTCIFImportImport__Group_3_0__3__Impl ;
    public final void rule__TMTCIFImportImport__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1117:1: ( rule__TMTCIFImportImport__Group_3_0__3__Impl )
            // InternalIMPORTS.g:1118:2: rule__TMTCIFImportImport__Group_3_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__3"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_0__3__Impl"
    // InternalIMPORTS.g:1124:1: rule__TMTCIFImportImport__Group_3_0__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportImport__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1128:1: ( ( ';' ) )
            // InternalIMPORTS.g:1129:1: ( ';' )
            {
            // InternalIMPORTS.g:1129:1: ( ';' )
            // InternalIMPORTS.g:1130:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_0_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_0__3__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__0"
    // InternalIMPORTS.g:1140:1: rule__TMTCIFImportImport__Group_3_1__0 : rule__TMTCIFImportImport__Group_3_1__0__Impl rule__TMTCIFImportImport__Group_3_1__1 ;
    public final void rule__TMTCIFImportImport__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1144:1: ( rule__TMTCIFImportImport__Group_3_1__0__Impl rule__TMTCIFImportImport__Group_3_1__1 )
            // InternalIMPORTS.g:1145:2: rule__TMTCIFImportImport__Group_3_1__0__Impl rule__TMTCIFImportImport__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportImport__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__0"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__0__Impl"
    // InternalIMPORTS.g:1152:1: rule__TMTCIFImportImport__Group_3_1__0__Impl : ( 'version' ) ;
    public final void rule__TMTCIFImportImport__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1156:1: ( ( 'version' ) )
            // InternalIMPORTS.g:1157:1: ( 'version' )
            {
            // InternalIMPORTS.g:1157:1: ( 'version' )
            // InternalIMPORTS.g:1158:2: 'version'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getVersionKeyword_3_1_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getVersionKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__0__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__1"
    // InternalIMPORTS.g:1167:1: rule__TMTCIFImportImport__Group_3_1__1 : rule__TMTCIFImportImport__Group_3_1__1__Impl rule__TMTCIFImportImport__Group_3_1__2 ;
    public final void rule__TMTCIFImportImport__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1171:1: ( rule__TMTCIFImportImport__Group_3_1__1__Impl rule__TMTCIFImportImport__Group_3_1__2 )
            // InternalIMPORTS.g:1172:2: rule__TMTCIFImportImport__Group_3_1__1__Impl rule__TMTCIFImportImport__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TMTCIFImportImport__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__1"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__1__Impl"
    // InternalIMPORTS.g:1179:1: rule__TMTCIFImportImport__Group_3_1__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportImport__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1183:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1184:1: ( ':=' )
            {
            // InternalIMPORTS.g:1184:1: ( ':=' )
            // InternalIMPORTS.g:1185:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getColonEqualsSignKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__1__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__2"
    // InternalIMPORTS.g:1194:1: rule__TMTCIFImportImport__Group_3_1__2 : rule__TMTCIFImportImport__Group_3_1__2__Impl rule__TMTCIFImportImport__Group_3_1__3 ;
    public final void rule__TMTCIFImportImport__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1198:1: ( rule__TMTCIFImportImport__Group_3_1__2__Impl rule__TMTCIFImportImport__Group_3_1__3 )
            // InternalIMPORTS.g:1199:2: rule__TMTCIFImportImport__Group_3_1__2__Impl rule__TMTCIFImportImport__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportImport__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__2"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__2__Impl"
    // InternalIMPORTS.g:1206:1: rule__TMTCIFImportImport__Group_3_1__2__Impl : ( ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 ) ) ;
    public final void rule__TMTCIFImportImport__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1210:1: ( ( ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 ) ) )
            // InternalIMPORTS.g:1211:1: ( ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 ) )
            {
            // InternalIMPORTS.g:1211:1: ( ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 ) )
            // InternalIMPORTS.g:1212:2: ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getVersionAssignment_3_1_2()); 
            }
            // InternalIMPORTS.g:1213:2: ( rule__TMTCIFImportImport__VersionAssignment_3_1_2 )
            // InternalIMPORTS.g:1213:3: rule__TMTCIFImportImport__VersionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__VersionAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getVersionAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__2__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__3"
    // InternalIMPORTS.g:1221:1: rule__TMTCIFImportImport__Group_3_1__3 : rule__TMTCIFImportImport__Group_3_1__3__Impl ;
    public final void rule__TMTCIFImportImport__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1225:1: ( rule__TMTCIFImportImport__Group_3_1__3__Impl )
            // InternalIMPORTS.g:1226:2: rule__TMTCIFImportImport__Group_3_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__Group_3_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__3"


    // $ANTLR start "rule__TMTCIFImportImport__Group_3_1__3__Impl"
    // InternalIMPORTS.g:1232:1: rule__TMTCIFImportImport__Group_3_1__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportImport__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1236:1: ( ( ';' ) )
            // InternalIMPORTS.g:1237:1: ( ';' )
            {
            // InternalIMPORTS.g:1237:1: ( ';' )
            // InternalIMPORTS.g:1238:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_1_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getSemicolonKeyword_3_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__Group_3_1__3__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__0"
    // InternalIMPORTS.g:1248:1: rule__TMTCIFImportDataSource__Group__0 : rule__TMTCIFImportDataSource__Group__0__Impl rule__TMTCIFImportDataSource__Group__1 ;
    public final void rule__TMTCIFImportDataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1252:1: ( rule__TMTCIFImportDataSource__Group__0__Impl rule__TMTCIFImportDataSource__Group__1 )
            // InternalIMPORTS.g:1253:2: rule__TMTCIFImportDataSource__Group__0__Impl rule__TMTCIFImportDataSource__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFImportDataSource__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__0"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__0__Impl"
    // InternalIMPORTS.g:1260:1: rule__TMTCIFImportDataSource__Group__0__Impl : ( 'TMTCIFImportDataSource' ) ;
    public final void rule__TMTCIFImportDataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1264:1: ( ( 'TMTCIFImportDataSource' ) )
            // InternalIMPORTS.g:1265:1: ( 'TMTCIFImportDataSource' )
            {
            // InternalIMPORTS.g:1265:1: ( 'TMTCIFImportDataSource' )
            // InternalIMPORTS.g:1266:2: 'TMTCIFImportDataSource'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getTMTCIFImportDataSourceKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getTMTCIFImportDataSourceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__1"
    // InternalIMPORTS.g:1275:1: rule__TMTCIFImportDataSource__Group__1 : rule__TMTCIFImportDataSource__Group__1__Impl rule__TMTCIFImportDataSource__Group__2 ;
    public final void rule__TMTCIFImportDataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1279:1: ( rule__TMTCIFImportDataSource__Group__1__Impl rule__TMTCIFImportDataSource__Group__2 )
            // InternalIMPORTS.g:1280:2: rule__TMTCIFImportDataSource__Group__1__Impl rule__TMTCIFImportDataSource__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TMTCIFImportDataSource__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__1"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__1__Impl"
    // InternalIMPORTS.g:1287:1: rule__TMTCIFImportDataSource__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFImportDataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1291:1: ( ( '{' ) )
            // InternalIMPORTS.g:1292:1: ( '{' )
            {
            // InternalIMPORTS.g:1292:1: ( '{' )
            // InternalIMPORTS.g:1293:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__2"
    // InternalIMPORTS.g:1302:1: rule__TMTCIFImportDataSource__Group__2 : rule__TMTCIFImportDataSource__Group__2__Impl rule__TMTCIFImportDataSource__Group__3 ;
    public final void rule__TMTCIFImportDataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1306:1: ( rule__TMTCIFImportDataSource__Group__2__Impl rule__TMTCIFImportDataSource__Group__3 )
            // InternalIMPORTS.g:1307:2: rule__TMTCIFImportDataSource__Group__2__Impl rule__TMTCIFImportDataSource__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportDataSource__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__2"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__2__Impl"
    // InternalIMPORTS.g:1314:1: rule__TMTCIFImportDataSource__Group__2__Impl : ( 'FieldRef' ) ;
    public final void rule__TMTCIFImportDataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1318:1: ( ( 'FieldRef' ) )
            // InternalIMPORTS.g:1319:1: ( 'FieldRef' )
            {
            // InternalIMPORTS.g:1319:1: ( 'FieldRef' )
            // InternalIMPORTS.g:1320:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__3"
    // InternalIMPORTS.g:1329:1: rule__TMTCIFImportDataSource__Group__3 : rule__TMTCIFImportDataSource__Group__3__Impl rule__TMTCIFImportDataSource__Group__4 ;
    public final void rule__TMTCIFImportDataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1333:1: ( rule__TMTCIFImportDataSource__Group__3__Impl rule__TMTCIFImportDataSource__Group__4 )
            // InternalIMPORTS.g:1334:2: rule__TMTCIFImportDataSource__Group__3__Impl rule__TMTCIFImportDataSource__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportDataSource__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__3"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__3__Impl"
    // InternalIMPORTS.g:1341:1: rule__TMTCIFImportDataSource__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportDataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1345:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1346:1: ( ':=' )
            {
            // InternalIMPORTS.g:1346:1: ( ':=' )
            // InternalIMPORTS.g:1347:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__4"
    // InternalIMPORTS.g:1356:1: rule__TMTCIFImportDataSource__Group__4 : rule__TMTCIFImportDataSource__Group__4__Impl rule__TMTCIFImportDataSource__Group__5 ;
    public final void rule__TMTCIFImportDataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1360:1: ( rule__TMTCIFImportDataSource__Group__4__Impl rule__TMTCIFImportDataSource__Group__5 )
            // InternalIMPORTS.g:1361:2: rule__TMTCIFImportDataSource__Group__4__Impl rule__TMTCIFImportDataSource__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportDataSource__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__4"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__4__Impl"
    // InternalIMPORTS.g:1368:1: rule__TMTCIFImportDataSource__Group__4__Impl : ( ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 ) ) ;
    public final void rule__TMTCIFImportDataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1372:1: ( ( ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 ) ) )
            // InternalIMPORTS.g:1373:1: ( ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 ) )
            {
            // InternalIMPORTS.g:1373:1: ( ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 ) )
            // InternalIMPORTS.g:1374:2: ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefAssignment_4()); 
            }
            // InternalIMPORTS.g:1375:2: ( rule__TMTCIFImportDataSource__FieldRefAssignment_4 )
            // InternalIMPORTS.g:1375:3: rule__TMTCIFImportDataSource__FieldRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__FieldRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__5"
    // InternalIMPORTS.g:1383:1: rule__TMTCIFImportDataSource__Group__5 : rule__TMTCIFImportDataSource__Group__5__Impl rule__TMTCIFImportDataSource__Group__6 ;
    public final void rule__TMTCIFImportDataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1387:1: ( rule__TMTCIFImportDataSource__Group__5__Impl rule__TMTCIFImportDataSource__Group__6 )
            // InternalIMPORTS.g:1388:2: rule__TMTCIFImportDataSource__Group__5__Impl rule__TMTCIFImportDataSource__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__TMTCIFImportDataSource__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__5"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__5__Impl"
    // InternalIMPORTS.g:1395:1: rule__TMTCIFImportDataSource__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportDataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1399:1: ( ( ';' ) )
            // InternalIMPORTS.g:1400:1: ( ';' )
            {
            // InternalIMPORTS.g:1400:1: ( ';' )
            // InternalIMPORTS.g:1401:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__6"
    // InternalIMPORTS.g:1410:1: rule__TMTCIFImportDataSource__Group__6 : rule__TMTCIFImportDataSource__Group__6__Impl rule__TMTCIFImportDataSource__Group__7 ;
    public final void rule__TMTCIFImportDataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1414:1: ( rule__TMTCIFImportDataSource__Group__6__Impl rule__TMTCIFImportDataSource__Group__7 )
            // InternalIMPORTS.g:1415:2: rule__TMTCIFImportDataSource__Group__6__Impl rule__TMTCIFImportDataSource__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportDataSource__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__6"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__6__Impl"
    // InternalIMPORTS.g:1422:1: rule__TMTCIFImportDataSource__Group__6__Impl : ( 'leftTrim' ) ;
    public final void rule__TMTCIFImportDataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1426:1: ( ( 'leftTrim' ) )
            // InternalIMPORTS.g:1427:1: ( 'leftTrim' )
            {
            // InternalIMPORTS.g:1427:1: ( 'leftTrim' )
            // InternalIMPORTS.g:1428:2: 'leftTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimKeyword_6()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__7"
    // InternalIMPORTS.g:1437:1: rule__TMTCIFImportDataSource__Group__7 : rule__TMTCIFImportDataSource__Group__7__Impl rule__TMTCIFImportDataSource__Group__8 ;
    public final void rule__TMTCIFImportDataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1441:1: ( rule__TMTCIFImportDataSource__Group__7__Impl rule__TMTCIFImportDataSource__Group__8 )
            // InternalIMPORTS.g:1442:2: rule__TMTCIFImportDataSource__Group__7__Impl rule__TMTCIFImportDataSource__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFImportDataSource__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__7"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__7__Impl"
    // InternalIMPORTS.g:1449:1: rule__TMTCIFImportDataSource__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportDataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1453:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1454:1: ( ':=' )
            {
            // InternalIMPORTS.g:1454:1: ( ':=' )
            // InternalIMPORTS.g:1455:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__8"
    // InternalIMPORTS.g:1464:1: rule__TMTCIFImportDataSource__Group__8 : rule__TMTCIFImportDataSource__Group__8__Impl rule__TMTCIFImportDataSource__Group__9 ;
    public final void rule__TMTCIFImportDataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1468:1: ( rule__TMTCIFImportDataSource__Group__8__Impl rule__TMTCIFImportDataSource__Group__9 )
            // InternalIMPORTS.g:1469:2: rule__TMTCIFImportDataSource__Group__8__Impl rule__TMTCIFImportDataSource__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportDataSource__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__8"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__8__Impl"
    // InternalIMPORTS.g:1476:1: rule__TMTCIFImportDataSource__Group__8__Impl : ( ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 ) ) ;
    public final void rule__TMTCIFImportDataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1480:1: ( ( ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 ) ) )
            // InternalIMPORTS.g:1481:1: ( ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 ) )
            {
            // InternalIMPORTS.g:1481:1: ( ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 ) )
            // InternalIMPORTS.g:1482:2: ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimAssignment_8()); 
            }
            // InternalIMPORTS.g:1483:2: ( rule__TMTCIFImportDataSource__LeftTrimAssignment_8 )
            // InternalIMPORTS.g:1483:3: rule__TMTCIFImportDataSource__LeftTrimAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__LeftTrimAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__9"
    // InternalIMPORTS.g:1491:1: rule__TMTCIFImportDataSource__Group__9 : rule__TMTCIFImportDataSource__Group__9__Impl rule__TMTCIFImportDataSource__Group__10 ;
    public final void rule__TMTCIFImportDataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1495:1: ( rule__TMTCIFImportDataSource__Group__9__Impl rule__TMTCIFImportDataSource__Group__10 )
            // InternalIMPORTS.g:1496:2: rule__TMTCIFImportDataSource__Group__9__Impl rule__TMTCIFImportDataSource__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__TMTCIFImportDataSource__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__9"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__9__Impl"
    // InternalIMPORTS.g:1503:1: rule__TMTCIFImportDataSource__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportDataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1507:1: ( ( ';' ) )
            // InternalIMPORTS.g:1508:1: ( ';' )
            {
            // InternalIMPORTS.g:1508:1: ( ';' )
            // InternalIMPORTS.g:1509:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__10"
    // InternalIMPORTS.g:1518:1: rule__TMTCIFImportDataSource__Group__10 : rule__TMTCIFImportDataSource__Group__10__Impl rule__TMTCIFImportDataSource__Group__11 ;
    public final void rule__TMTCIFImportDataSource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1522:1: ( rule__TMTCIFImportDataSource__Group__10__Impl rule__TMTCIFImportDataSource__Group__11 )
            // InternalIMPORTS.g:1523:2: rule__TMTCIFImportDataSource__Group__10__Impl rule__TMTCIFImportDataSource__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportDataSource__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__10"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__10__Impl"
    // InternalIMPORTS.g:1530:1: rule__TMTCIFImportDataSource__Group__10__Impl : ( 'rightTrim' ) ;
    public final void rule__TMTCIFImportDataSource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1534:1: ( ( 'rightTrim' ) )
            // InternalIMPORTS.g:1535:1: ( 'rightTrim' )
            {
            // InternalIMPORTS.g:1535:1: ( 'rightTrim' )
            // InternalIMPORTS.g:1536:2: 'rightTrim'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimKeyword_10()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__11"
    // InternalIMPORTS.g:1545:1: rule__TMTCIFImportDataSource__Group__11 : rule__TMTCIFImportDataSource__Group__11__Impl rule__TMTCIFImportDataSource__Group__12 ;
    public final void rule__TMTCIFImportDataSource__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1549:1: ( rule__TMTCIFImportDataSource__Group__11__Impl rule__TMTCIFImportDataSource__Group__12 )
            // InternalIMPORTS.g:1550:2: rule__TMTCIFImportDataSource__Group__11__Impl rule__TMTCIFImportDataSource__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFImportDataSource__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__11"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__11__Impl"
    // InternalIMPORTS.g:1557:1: rule__TMTCIFImportDataSource__Group__11__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportDataSource__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1561:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1562:1: ( ':=' )
            {
            // InternalIMPORTS.g:1562:1: ( ':=' )
            // InternalIMPORTS.g:1563:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_11()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getColonEqualsSignKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__12"
    // InternalIMPORTS.g:1572:1: rule__TMTCIFImportDataSource__Group__12 : rule__TMTCIFImportDataSource__Group__12__Impl rule__TMTCIFImportDataSource__Group__13 ;
    public final void rule__TMTCIFImportDataSource__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1576:1: ( rule__TMTCIFImportDataSource__Group__12__Impl rule__TMTCIFImportDataSource__Group__13 )
            // InternalIMPORTS.g:1577:2: rule__TMTCIFImportDataSource__Group__12__Impl rule__TMTCIFImportDataSource__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportDataSource__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__12"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__12__Impl"
    // InternalIMPORTS.g:1584:1: rule__TMTCIFImportDataSource__Group__12__Impl : ( ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 ) ) ;
    public final void rule__TMTCIFImportDataSource__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1588:1: ( ( ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 ) ) )
            // InternalIMPORTS.g:1589:1: ( ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 ) )
            {
            // InternalIMPORTS.g:1589:1: ( ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 ) )
            // InternalIMPORTS.g:1590:2: ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimAssignment_12()); 
            }
            // InternalIMPORTS.g:1591:2: ( rule__TMTCIFImportDataSource__RightTrimAssignment_12 )
            // InternalIMPORTS.g:1591:3: rule__TMTCIFImportDataSource__RightTrimAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__RightTrimAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimAssignment_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__13"
    // InternalIMPORTS.g:1599:1: rule__TMTCIFImportDataSource__Group__13 : rule__TMTCIFImportDataSource__Group__13__Impl rule__TMTCIFImportDataSource__Group__14 ;
    public final void rule__TMTCIFImportDataSource__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1603:1: ( rule__TMTCIFImportDataSource__Group__13__Impl rule__TMTCIFImportDataSource__Group__14 )
            // InternalIMPORTS.g:1604:2: rule__TMTCIFImportDataSource__Group__13__Impl rule__TMTCIFImportDataSource__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__TMTCIFImportDataSource__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__13"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__13__Impl"
    // InternalIMPORTS.g:1611:1: rule__TMTCIFImportDataSource__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportDataSource__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1615:1: ( ( ';' ) )
            // InternalIMPORTS.g:1616:1: ( ';' )
            {
            // InternalIMPORTS.g:1616:1: ( ';' )
            // InternalIMPORTS.g:1617:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__14"
    // InternalIMPORTS.g:1626:1: rule__TMTCIFImportDataSource__Group__14 : rule__TMTCIFImportDataSource__Group__14__Impl rule__TMTCIFImportDataSource__Group__15 ;
    public final void rule__TMTCIFImportDataSource__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1630:1: ( rule__TMTCIFImportDataSource__Group__14__Impl rule__TMTCIFImportDataSource__Group__15 )
            // InternalIMPORTS.g:1631:2: rule__TMTCIFImportDataSource__Group__14__Impl rule__TMTCIFImportDataSource__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportDataSource__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__14"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__14__Impl"
    // InternalIMPORTS.g:1638:1: rule__TMTCIFImportDataSource__Group__14__Impl : ( '}' ) ;
    public final void rule__TMTCIFImportDataSource__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1642:1: ( ( '}' ) )
            // InternalIMPORTS.g:1643:1: ( '}' )
            {
            // InternalIMPORTS.g:1643:1: ( '}' )
            // InternalIMPORTS.g:1644:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__14__Impl"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__15"
    // InternalIMPORTS.g:1653:1: rule__TMTCIFImportDataSource__Group__15 : rule__TMTCIFImportDataSource__Group__15__Impl ;
    public final void rule__TMTCIFImportDataSource__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1657:1: ( rule__TMTCIFImportDataSource__Group__15__Impl )
            // InternalIMPORTS.g:1658:2: rule__TMTCIFImportDataSource__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportDataSource__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__15"


    // $ANTLR start "rule__TMTCIFImportDataSource__Group__15__Impl"
    // InternalIMPORTS.g:1664:1: rule__TMTCIFImportDataSource__Group__15__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportDataSource__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1668:1: ( ( ';' ) )
            // InternalIMPORTS.g:1669:1: ( ';' )
            {
            // InternalIMPORTS.g:1669:1: ( ';' )
            // InternalIMPORTS.g:1670:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_15()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getSemicolonKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__Group__15__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__0"
    // InternalIMPORTS.g:1680:1: rule__TMTCIFImportVirtualSize__Group__0 : rule__TMTCIFImportVirtualSize__Group__0__Impl rule__TMTCIFImportVirtualSize__Group__1 ;
    public final void rule__TMTCIFImportVirtualSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1684:1: ( rule__TMTCIFImportVirtualSize__Group__0__Impl rule__TMTCIFImportVirtualSize__Group__1 )
            // InternalIMPORTS.g:1685:2: rule__TMTCIFImportVirtualSize__Group__0__Impl rule__TMTCIFImportVirtualSize__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__TMTCIFImportVirtualSize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__0"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__0__Impl"
    // InternalIMPORTS.g:1692:1: rule__TMTCIFImportVirtualSize__Group__0__Impl : ( 'TMTCIFImportVirtualSize' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1696:1: ( ( 'TMTCIFImportVirtualSize' ) )
            // InternalIMPORTS.g:1697:1: ( 'TMTCIFImportVirtualSize' )
            {
            // InternalIMPORTS.g:1697:1: ( 'TMTCIFImportVirtualSize' )
            // InternalIMPORTS.g:1698:2: 'TMTCIFImportVirtualSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getTMTCIFImportVirtualSizeKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getTMTCIFImportVirtualSizeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__0__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__1"
    // InternalIMPORTS.g:1707:1: rule__TMTCIFImportVirtualSize__Group__1 : rule__TMTCIFImportVirtualSize__Group__1__Impl rule__TMTCIFImportVirtualSize__Group__2 ;
    public final void rule__TMTCIFImportVirtualSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1711:1: ( rule__TMTCIFImportVirtualSize__Group__1__Impl rule__TMTCIFImportVirtualSize__Group__2 )
            // InternalIMPORTS.g:1712:2: rule__TMTCIFImportVirtualSize__Group__1__Impl rule__TMTCIFImportVirtualSize__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__TMTCIFImportVirtualSize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__1"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__1__Impl"
    // InternalIMPORTS.g:1719:1: rule__TMTCIFImportVirtualSize__Group__1__Impl : ( '{' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1723:1: ( ( '{' ) )
            // InternalIMPORTS.g:1724:1: ( '{' )
            {
            // InternalIMPORTS.g:1724:1: ( '{' )
            // InternalIMPORTS.g:1725:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__1__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__2"
    // InternalIMPORTS.g:1734:1: rule__TMTCIFImportVirtualSize__Group__2 : rule__TMTCIFImportVirtualSize__Group__2__Impl rule__TMTCIFImportVirtualSize__Group__3 ;
    public final void rule__TMTCIFImportVirtualSize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1738:1: ( rule__TMTCIFImportVirtualSize__Group__2__Impl rule__TMTCIFImportVirtualSize__Group__3 )
            // InternalIMPORTS.g:1739:2: rule__TMTCIFImportVirtualSize__Group__2__Impl rule__TMTCIFImportVirtualSize__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportVirtualSize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__2"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__2__Impl"
    // InternalIMPORTS.g:1746:1: rule__TMTCIFImportVirtualSize__Group__2__Impl : ( 'FieldRef' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1750:1: ( ( 'FieldRef' ) )
            // InternalIMPORTS.g:1751:1: ( 'FieldRef' )
            {
            // InternalIMPORTS.g:1751:1: ( 'FieldRef' )
            // InternalIMPORTS.g:1752:2: 'FieldRef'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__2__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__3"
    // InternalIMPORTS.g:1761:1: rule__TMTCIFImportVirtualSize__Group__3 : rule__TMTCIFImportVirtualSize__Group__3__Impl rule__TMTCIFImportVirtualSize__Group__4 ;
    public final void rule__TMTCIFImportVirtualSize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1765:1: ( rule__TMTCIFImportVirtualSize__Group__3__Impl rule__TMTCIFImportVirtualSize__Group__4 )
            // InternalIMPORTS.g:1766:2: rule__TMTCIFImportVirtualSize__Group__3__Impl rule__TMTCIFImportVirtualSize__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportVirtualSize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__3"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__3__Impl"
    // InternalIMPORTS.g:1773:1: rule__TMTCIFImportVirtualSize__Group__3__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1777:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1778:1: ( ':=' )
            {
            // InternalIMPORTS.g:1778:1: ( ':=' )
            // InternalIMPORTS.g:1779:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__3__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__4"
    // InternalIMPORTS.g:1788:1: rule__TMTCIFImportVirtualSize__Group__4 : rule__TMTCIFImportVirtualSize__Group__4__Impl rule__TMTCIFImportVirtualSize__Group__5 ;
    public final void rule__TMTCIFImportVirtualSize__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1792:1: ( rule__TMTCIFImportVirtualSize__Group__4__Impl rule__TMTCIFImportVirtualSize__Group__5 )
            // InternalIMPORTS.g:1793:2: rule__TMTCIFImportVirtualSize__Group__4__Impl rule__TMTCIFImportVirtualSize__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportVirtualSize__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__4"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__4__Impl"
    // InternalIMPORTS.g:1800:1: rule__TMTCIFImportVirtualSize__Group__4__Impl : ( ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 ) ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1804:1: ( ( ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 ) ) )
            // InternalIMPORTS.g:1805:1: ( ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 ) )
            {
            // InternalIMPORTS.g:1805:1: ( ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 ) )
            // InternalIMPORTS.g:1806:2: ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefAssignment_4()); 
            }
            // InternalIMPORTS.g:1807:2: ( rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 )
            // InternalIMPORTS.g:1807:3: rule__TMTCIFImportVirtualSize__FieldRefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__FieldRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__4__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__5"
    // InternalIMPORTS.g:1815:1: rule__TMTCIFImportVirtualSize__Group__5 : rule__TMTCIFImportVirtualSize__Group__5__Impl rule__TMTCIFImportVirtualSize__Group__6 ;
    public final void rule__TMTCIFImportVirtualSize__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1819:1: ( rule__TMTCIFImportVirtualSize__Group__5__Impl rule__TMTCIFImportVirtualSize__Group__6 )
            // InternalIMPORTS.g:1820:2: rule__TMTCIFImportVirtualSize__Group__5__Impl rule__TMTCIFImportVirtualSize__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__TMTCIFImportVirtualSize__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__5"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__5__Impl"
    // InternalIMPORTS.g:1827:1: rule__TMTCIFImportVirtualSize__Group__5__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1831:1: ( ( ';' ) )
            // InternalIMPORTS.g:1832:1: ( ';' )
            {
            // InternalIMPORTS.g:1832:1: ( ';' )
            // InternalIMPORTS.g:1833:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_5()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__5__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__6"
    // InternalIMPORTS.g:1842:1: rule__TMTCIFImportVirtualSize__Group__6 : rule__TMTCIFImportVirtualSize__Group__6__Impl rule__TMTCIFImportVirtualSize__Group__7 ;
    public final void rule__TMTCIFImportVirtualSize__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1846:1: ( rule__TMTCIFImportVirtualSize__Group__6__Impl rule__TMTCIFImportVirtualSize__Group__7 )
            // InternalIMPORTS.g:1847:2: rule__TMTCIFImportVirtualSize__Group__6__Impl rule__TMTCIFImportVirtualSize__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportVirtualSize__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__6"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__6__Impl"
    // InternalIMPORTS.g:1854:1: rule__TMTCIFImportVirtualSize__Group__6__Impl : ( 'to' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1858:1: ( ( 'to' ) )
            // InternalIMPORTS.g:1859:1: ( 'to' )
            {
            // InternalIMPORTS.g:1859:1: ( 'to' )
            // InternalIMPORTS.g:1860:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToKeyword_6()); 
            }
            match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__6__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__7"
    // InternalIMPORTS.g:1869:1: rule__TMTCIFImportVirtualSize__Group__7 : rule__TMTCIFImportVirtualSize__Group__7__Impl rule__TMTCIFImportVirtualSize__Group__8 ;
    public final void rule__TMTCIFImportVirtualSize__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1873:1: ( rule__TMTCIFImportVirtualSize__Group__7__Impl rule__TMTCIFImportVirtualSize__Group__8 )
            // InternalIMPORTS.g:1874:2: rule__TMTCIFImportVirtualSize__Group__7__Impl rule__TMTCIFImportVirtualSize__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TMTCIFImportVirtualSize__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__7"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__7__Impl"
    // InternalIMPORTS.g:1881:1: rule__TMTCIFImportVirtualSize__Group__7__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1885:1: ( ( ':=' ) )
            // InternalIMPORTS.g:1886:1: ( ':=' )
            {
            // InternalIMPORTS.g:1886:1: ( ':=' )
            // InternalIMPORTS.g:1887:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__7__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__8"
    // InternalIMPORTS.g:1896:1: rule__TMTCIFImportVirtualSize__Group__8 : rule__TMTCIFImportVirtualSize__Group__8__Impl rule__TMTCIFImportVirtualSize__Group__9 ;
    public final void rule__TMTCIFImportVirtualSize__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1900:1: ( rule__TMTCIFImportVirtualSize__Group__8__Impl rule__TMTCIFImportVirtualSize__Group__9 )
            // InternalIMPORTS.g:1901:2: rule__TMTCIFImportVirtualSize__Group__8__Impl rule__TMTCIFImportVirtualSize__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportVirtualSize__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__8"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__8__Impl"
    // InternalIMPORTS.g:1908:1: rule__TMTCIFImportVirtualSize__Group__8__Impl : ( ( rule__TMTCIFImportVirtualSize__ToAssignment_8 ) ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1912:1: ( ( ( rule__TMTCIFImportVirtualSize__ToAssignment_8 ) ) )
            // InternalIMPORTS.g:1913:1: ( ( rule__TMTCIFImportVirtualSize__ToAssignment_8 ) )
            {
            // InternalIMPORTS.g:1913:1: ( ( rule__TMTCIFImportVirtualSize__ToAssignment_8 ) )
            // InternalIMPORTS.g:1914:2: ( rule__TMTCIFImportVirtualSize__ToAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToAssignment_8()); 
            }
            // InternalIMPORTS.g:1915:2: ( rule__TMTCIFImportVirtualSize__ToAssignment_8 )
            // InternalIMPORTS.g:1915:3: rule__TMTCIFImportVirtualSize__ToAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__ToAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__8__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__9"
    // InternalIMPORTS.g:1923:1: rule__TMTCIFImportVirtualSize__Group__9 : rule__TMTCIFImportVirtualSize__Group__9__Impl rule__TMTCIFImportVirtualSize__Group__10 ;
    public final void rule__TMTCIFImportVirtualSize__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1927:1: ( rule__TMTCIFImportVirtualSize__Group__9__Impl rule__TMTCIFImportVirtualSize__Group__10 )
            // InternalIMPORTS.g:1928:2: rule__TMTCIFImportVirtualSize__Group__9__Impl rule__TMTCIFImportVirtualSize__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFImportVirtualSize__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__9"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__9__Impl"
    // InternalIMPORTS.g:1935:1: rule__TMTCIFImportVirtualSize__Group__9__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1939:1: ( ( ';' ) )
            // InternalIMPORTS.g:1940:1: ( ';' )
            {
            // InternalIMPORTS.g:1940:1: ( ';' )
            // InternalIMPORTS.g:1941:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_9()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__9__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__10"
    // InternalIMPORTS.g:1950:1: rule__TMTCIFImportVirtualSize__Group__10 : rule__TMTCIFImportVirtualSize__Group__10__Impl rule__TMTCIFImportVirtualSize__Group__11 ;
    public final void rule__TMTCIFImportVirtualSize__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1954:1: ( rule__TMTCIFImportVirtualSize__Group__10__Impl rule__TMTCIFImportVirtualSize__Group__11 )
            // InternalIMPORTS.g:1955:2: rule__TMTCIFImportVirtualSize__Group__10__Impl rule__TMTCIFImportVirtualSize__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFImportVirtualSize__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__10"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__10__Impl"
    // InternalIMPORTS.g:1962:1: rule__TMTCIFImportVirtualSize__Group__10__Impl : ( ( rule__TMTCIFImportVirtualSize__Group_10__0 )? ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1966:1: ( ( ( rule__TMTCIFImportVirtualSize__Group_10__0 )? ) )
            // InternalIMPORTS.g:1967:1: ( ( rule__TMTCIFImportVirtualSize__Group_10__0 )? )
            {
            // InternalIMPORTS.g:1967:1: ( ( rule__TMTCIFImportVirtualSize__Group_10__0 )? )
            // InternalIMPORTS.g:1968:2: ( rule__TMTCIFImportVirtualSize__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_10()); 
            }
            // InternalIMPORTS.g:1969:2: ( rule__TMTCIFImportVirtualSize__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalIMPORTS.g:1969:3: rule__TMTCIFImportVirtualSize__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportVirtualSize__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__10__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__11"
    // InternalIMPORTS.g:1977:1: rule__TMTCIFImportVirtualSize__Group__11 : rule__TMTCIFImportVirtualSize__Group__11__Impl rule__TMTCIFImportVirtualSize__Group__12 ;
    public final void rule__TMTCIFImportVirtualSize__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1981:1: ( rule__TMTCIFImportVirtualSize__Group__11__Impl rule__TMTCIFImportVirtualSize__Group__12 )
            // InternalIMPORTS.g:1982:2: rule__TMTCIFImportVirtualSize__Group__11__Impl rule__TMTCIFImportVirtualSize__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__TMTCIFImportVirtualSize__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__11"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__11__Impl"
    // InternalIMPORTS.g:1989:1: rule__TMTCIFImportVirtualSize__Group__11__Impl : ( ( rule__TMTCIFImportVirtualSize__Group_11__0 )? ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:1993:1: ( ( ( rule__TMTCIFImportVirtualSize__Group_11__0 )? ) )
            // InternalIMPORTS.g:1994:1: ( ( rule__TMTCIFImportVirtualSize__Group_11__0 )? )
            {
            // InternalIMPORTS.g:1994:1: ( ( rule__TMTCIFImportVirtualSize__Group_11__0 )? )
            // InternalIMPORTS.g:1995:2: ( rule__TMTCIFImportVirtualSize__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_11()); 
            }
            // InternalIMPORTS.g:1996:2: ( rule__TMTCIFImportVirtualSize__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalIMPORTS.g:1996:3: rule__TMTCIFImportVirtualSize__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportVirtualSize__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__11__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__12"
    // InternalIMPORTS.g:2004:1: rule__TMTCIFImportVirtualSize__Group__12 : rule__TMTCIFImportVirtualSize__Group__12__Impl rule__TMTCIFImportVirtualSize__Group__13 ;
    public final void rule__TMTCIFImportVirtualSize__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2008:1: ( rule__TMTCIFImportVirtualSize__Group__12__Impl rule__TMTCIFImportVirtualSize__Group__13 )
            // InternalIMPORTS.g:2009:2: rule__TMTCIFImportVirtualSize__Group__12__Impl rule__TMTCIFImportVirtualSize__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportVirtualSize__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__12"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__12__Impl"
    // InternalIMPORTS.g:2016:1: rule__TMTCIFImportVirtualSize__Group__12__Impl : ( '}' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2020:1: ( ( '}' ) )
            // InternalIMPORTS.g:2021:1: ( '}' )
            {
            // InternalIMPORTS.g:2021:1: ( '}' )
            // InternalIMPORTS.g:2022:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__12__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__13"
    // InternalIMPORTS.g:2031:1: rule__TMTCIFImportVirtualSize__Group__13 : rule__TMTCIFImportVirtualSize__Group__13__Impl ;
    public final void rule__TMTCIFImportVirtualSize__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2035:1: ( rule__TMTCIFImportVirtualSize__Group__13__Impl )
            // InternalIMPORTS.g:2036:2: rule__TMTCIFImportVirtualSize__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__13"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group__13__Impl"
    // InternalIMPORTS.g:2042:1: rule__TMTCIFImportVirtualSize__Group__13__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2046:1: ( ( ';' ) )
            // InternalIMPORTS.g:2047:1: ( ';' )
            {
            // InternalIMPORTS.g:2047:1: ( ';' )
            // InternalIMPORTS.g:2048:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_13()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group__13__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__0"
    // InternalIMPORTS.g:2058:1: rule__TMTCIFImportVirtualSize__Group_10__0 : rule__TMTCIFImportVirtualSize__Group_10__0__Impl rule__TMTCIFImportVirtualSize__Group_10__1 ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2062:1: ( rule__TMTCIFImportVirtualSize__Group_10__0__Impl rule__TMTCIFImportVirtualSize__Group_10__1 )
            // InternalIMPORTS.g:2063:2: rule__TMTCIFImportVirtualSize__Group_10__0__Impl rule__TMTCIFImportVirtualSize__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportVirtualSize__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__0"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__0__Impl"
    // InternalIMPORTS.g:2070:1: rule__TMTCIFImportVirtualSize__Group_10__0__Impl : ( 'addSize' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2074:1: ( ( 'addSize' ) )
            // InternalIMPORTS.g:2075:1: ( 'addSize' )
            {
            // InternalIMPORTS.g:2075:1: ( 'addSize' )
            // InternalIMPORTS.g:2076:2: 'addSize'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeKeyword_10_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__0__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__1"
    // InternalIMPORTS.g:2085:1: rule__TMTCIFImportVirtualSize__Group_10__1 : rule__TMTCIFImportVirtualSize__Group_10__1__Impl rule__TMTCIFImportVirtualSize__Group_10__2 ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2089:1: ( rule__TMTCIFImportVirtualSize__Group_10__1__Impl rule__TMTCIFImportVirtualSize__Group_10__2 )
            // InternalIMPORTS.g:2090:2: rule__TMTCIFImportVirtualSize__Group_10__1__Impl rule__TMTCIFImportVirtualSize__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__TMTCIFImportVirtualSize__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__1"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__1__Impl"
    // InternalIMPORTS.g:2097:1: rule__TMTCIFImportVirtualSize__Group_10__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2101:1: ( ( ':=' ) )
            // InternalIMPORTS.g:2102:1: ( ':=' )
            {
            // InternalIMPORTS.g:2102:1: ( ':=' )
            // InternalIMPORTS.g:2103:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__1__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__2"
    // InternalIMPORTS.g:2112:1: rule__TMTCIFImportVirtualSize__Group_10__2 : rule__TMTCIFImportVirtualSize__Group_10__2__Impl rule__TMTCIFImportVirtualSize__Group_10__3 ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2116:1: ( rule__TMTCIFImportVirtualSize__Group_10__2__Impl rule__TMTCIFImportVirtualSize__Group_10__3 )
            // InternalIMPORTS.g:2117:2: rule__TMTCIFImportVirtualSize__Group_10__2__Impl rule__TMTCIFImportVirtualSize__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportVirtualSize__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__2"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__2__Impl"
    // InternalIMPORTS.g:2124:1: rule__TMTCIFImportVirtualSize__Group_10__2__Impl : ( ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 ) ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2128:1: ( ( ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 ) ) )
            // InternalIMPORTS.g:2129:1: ( ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 ) )
            {
            // InternalIMPORTS.g:2129:1: ( ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 ) )
            // InternalIMPORTS.g:2130:2: ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeAssignment_10_2()); 
            }
            // InternalIMPORTS.g:2131:2: ( rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 )
            // InternalIMPORTS.g:2131:3: rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeAssignment_10_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__2__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__3"
    // InternalIMPORTS.g:2139:1: rule__TMTCIFImportVirtualSize__Group_10__3 : rule__TMTCIFImportVirtualSize__Group_10__3__Impl ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2143:1: ( rule__TMTCIFImportVirtualSize__Group_10__3__Impl )
            // InternalIMPORTS.g:2144:2: rule__TMTCIFImportVirtualSize__Group_10__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__3"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_10__3__Impl"
    // InternalIMPORTS.g:2150:1: rule__TMTCIFImportVirtualSize__Group_10__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2154:1: ( ( ';' ) )
            // InternalIMPORTS.g:2155:1: ( ';' )
            {
            // InternalIMPORTS.g:2155:1: ( ';' )
            // InternalIMPORTS.g:2156:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_10_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_10_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_10__3__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__0"
    // InternalIMPORTS.g:2166:1: rule__TMTCIFImportVirtualSize__Group_11__0 : rule__TMTCIFImportVirtualSize__Group_11__0__Impl rule__TMTCIFImportVirtualSize__Group_11__1 ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2170:1: ( rule__TMTCIFImportVirtualSize__Group_11__0__Impl rule__TMTCIFImportVirtualSize__Group_11__1 )
            // InternalIMPORTS.g:2171:2: rule__TMTCIFImportVirtualSize__Group_11__0__Impl rule__TMTCIFImportVirtualSize__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TMTCIFImportVirtualSize__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__0"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__0__Impl"
    // InternalIMPORTS.g:2178:1: rule__TMTCIFImportVirtualSize__Group_11__0__Impl : ( 'unit' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2182:1: ( ( 'unit' ) )
            // InternalIMPORTS.g:2183:1: ( 'unit' )
            {
            // InternalIMPORTS.g:2183:1: ( 'unit' )
            // InternalIMPORTS.g:2184:2: 'unit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitKeyword_11_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__0__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__1"
    // InternalIMPORTS.g:2193:1: rule__TMTCIFImportVirtualSize__Group_11__1 : rule__TMTCIFImportVirtualSize__Group_11__1__Impl rule__TMTCIFImportVirtualSize__Group_11__2 ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2197:1: ( rule__TMTCIFImportVirtualSize__Group_11__1__Impl rule__TMTCIFImportVirtualSize__Group_11__2 )
            // InternalIMPORTS.g:2198:2: rule__TMTCIFImportVirtualSize__Group_11__1__Impl rule__TMTCIFImportVirtualSize__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__TMTCIFImportVirtualSize__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_11__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__1"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__1__Impl"
    // InternalIMPORTS.g:2205:1: rule__TMTCIFImportVirtualSize__Group_11__1__Impl : ( ':=' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2209:1: ( ( ':=' ) )
            // InternalIMPORTS.g:2210:1: ( ':=' )
            {
            // InternalIMPORTS.g:2210:1: ( ':=' )
            // InternalIMPORTS.g:2211:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); 
            }
            match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__1__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__2"
    // InternalIMPORTS.g:2220:1: rule__TMTCIFImportVirtualSize__Group_11__2 : rule__TMTCIFImportVirtualSize__Group_11__2__Impl rule__TMTCIFImportVirtualSize__Group_11__3 ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2224:1: ( rule__TMTCIFImportVirtualSize__Group_11__2__Impl rule__TMTCIFImportVirtualSize__Group_11__3 )
            // InternalIMPORTS.g:2225:2: rule__TMTCIFImportVirtualSize__Group_11__2__Impl rule__TMTCIFImportVirtualSize__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TMTCIFImportVirtualSize__Group_11__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_11__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__2"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__2__Impl"
    // InternalIMPORTS.g:2232:1: rule__TMTCIFImportVirtualSize__Group_11__2__Impl : ( ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 ) ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2236:1: ( ( ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 ) ) )
            // InternalIMPORTS.g:2237:1: ( ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 ) )
            {
            // InternalIMPORTS.g:2237:1: ( ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 ) )
            // InternalIMPORTS.g:2238:2: ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitAssignment_11_2()); 
            }
            // InternalIMPORTS.g:2239:2: ( rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 )
            // InternalIMPORTS.g:2239:3: rule__TMTCIFImportVirtualSize__UnitAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__UnitAssignment_11_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitAssignment_11_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__2__Impl"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__3"
    // InternalIMPORTS.g:2247:1: rule__TMTCIFImportVirtualSize__Group_11__3 : rule__TMTCIFImportVirtualSize__Group_11__3__Impl ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2251:1: ( rule__TMTCIFImportVirtualSize__Group_11__3__Impl )
            // InternalIMPORTS.g:2252:2: rule__TMTCIFImportVirtualSize__Group_11__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportVirtualSize__Group_11__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__3"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__Group_11__3__Impl"
    // InternalIMPORTS.g:2258:1: rule__TMTCIFImportVirtualSize__Group_11__3__Impl : ( ';' ) ;
    public final void rule__TMTCIFImportVirtualSize__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2262:1: ( ( ';' ) )
            // InternalIMPORTS.g:2263:1: ( ';' )
            {
            // InternalIMPORTS.g:2263:1: ( ';' )
            // InternalIMPORTS.g:2264:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_11_3()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getSemicolonKeyword_11_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__Group_11__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIMPORTS.g:2274:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2278:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIMPORTS.g:2279:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalIMPORTS.g:2286:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2290:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2291:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2291:1: ( RULE_ID )
            // InternalIMPORTS.g:2292:2: RULE_ID
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
    // InternalIMPORTS.g:2301:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2305:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIMPORTS.g:2306:2: rule__QualifiedName__Group__1__Impl
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
    // InternalIMPORTS.g:2312:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2316:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIMPORTS.g:2317:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIMPORTS.g:2317:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIMPORTS.g:2318:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIMPORTS.g:2319:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIMPORTS.g:2319:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalIMPORTS.g:2328:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2332:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIMPORTS.g:2333:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalIMPORTS.g:2340:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2344:1: ( ( '.' ) )
            // InternalIMPORTS.g:2345:1: ( '.' )
            {
            // InternalIMPORTS.g:2345:1: ( '.' )
            // InternalIMPORTS.g:2346:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2355:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2359:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIMPORTS.g:2360:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalIMPORTS.g:2366:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2370:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2371:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2371:1: ( RULE_ID )
            // InternalIMPORTS.g:2372:2: RULE_ID
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
    // InternalIMPORTS.g:2382:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2386:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalIMPORTS.g:2387:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalIMPORTS.g:2394:1: rule__Version__Group__0__Impl : ( ( rule__Version__Alternatives_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2398:1: ( ( ( rule__Version__Alternatives_0 ) ) )
            // InternalIMPORTS.g:2399:1: ( ( rule__Version__Alternatives_0 ) )
            {
            // InternalIMPORTS.g:2399:1: ( ( rule__Version__Alternatives_0 ) )
            // InternalIMPORTS.g:2400:2: ( rule__Version__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_0()); 
            }
            // InternalIMPORTS.g:2401:2: ( rule__Version__Alternatives_0 )
            // InternalIMPORTS.g:2401:3: rule__Version__Alternatives_0
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
    // InternalIMPORTS.g:2409:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2413:1: ( rule__Version__Group__1__Impl )
            // InternalIMPORTS.g:2414:2: rule__Version__Group__1__Impl
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
    // InternalIMPORTS.g:2420:1: rule__Version__Group__1__Impl : ( ( rule__Version__Group_1__0 )* ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2424:1: ( ( ( rule__Version__Group_1__0 )* ) )
            // InternalIMPORTS.g:2425:1: ( ( rule__Version__Group_1__0 )* )
            {
            // InternalIMPORTS.g:2425:1: ( ( rule__Version__Group_1__0 )* )
            // InternalIMPORTS.g:2426:2: ( rule__Version__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup_1()); 
            }
            // InternalIMPORTS.g:2427:2: ( rule__Version__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIMPORTS.g:2427:3: rule__Version__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__Version__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalIMPORTS.g:2436:1: rule__Version__Group_0_1__0 : rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 ;
    public final void rule__Version__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2440:1: ( rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1 )
            // InternalIMPORTS.g:2441:2: rule__Version__Group_0_1__0__Impl rule__Version__Group_0_1__1
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
    // InternalIMPORTS.g:2448:1: rule__Version__Group_0_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2452:1: ( ( ( RULE_INT )? ) )
            // InternalIMPORTS.g:2453:1: ( ( RULE_INT )? )
            {
            // InternalIMPORTS.g:2453:1: ( ( RULE_INT )? )
            // InternalIMPORTS.g:2454:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0()); 
            }
            // InternalIMPORTS.g:2455:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIMPORTS.g:2455:3: RULE_INT
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
    // InternalIMPORTS.g:2463:1: rule__Version__Group_0_1__1 : rule__Version__Group_0_1__1__Impl ;
    public final void rule__Version__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2467:1: ( rule__Version__Group_0_1__1__Impl )
            // InternalIMPORTS.g:2468:2: rule__Version__Group_0_1__1__Impl
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
    // InternalIMPORTS.g:2474:1: rule__Version__Group_0_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2478:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2479:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2479:1: ( RULE_ID )
            // InternalIMPORTS.g:2480:2: RULE_ID
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
    // InternalIMPORTS.g:2490:1: rule__Version__Group_1__0 : rule__Version__Group_1__0__Impl rule__Version__Group_1__1 ;
    public final void rule__Version__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2494:1: ( rule__Version__Group_1__0__Impl rule__Version__Group_1__1 )
            // InternalIMPORTS.g:2495:2: rule__Version__Group_1__0__Impl rule__Version__Group_1__1
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
    // InternalIMPORTS.g:2502:1: rule__Version__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2506:1: ( ( '.' ) )
            // InternalIMPORTS.g:2507:1: ( '.' )
            {
            // InternalIMPORTS.g:2507:1: ( '.' )
            // InternalIMPORTS.g:2508:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2517:1: rule__Version__Group_1__1 : rule__Version__Group_1__1__Impl ;
    public final void rule__Version__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2521:1: ( rule__Version__Group_1__1__Impl )
            // InternalIMPORTS.g:2522:2: rule__Version__Group_1__1__Impl
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
    // InternalIMPORTS.g:2528:1: rule__Version__Group_1__1__Impl : ( ( rule__Version__Alternatives_1_1 ) ) ;
    public final void rule__Version__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2532:1: ( ( ( rule__Version__Alternatives_1_1 ) ) )
            // InternalIMPORTS.g:2533:1: ( ( rule__Version__Alternatives_1_1 ) )
            {
            // InternalIMPORTS.g:2533:1: ( ( rule__Version__Alternatives_1_1 ) )
            // InternalIMPORTS.g:2534:2: ( rule__Version__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getAlternatives_1_1()); 
            }
            // InternalIMPORTS.g:2535:2: ( rule__Version__Alternatives_1_1 )
            // InternalIMPORTS.g:2535:3: rule__Version__Alternatives_1_1
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
    // InternalIMPORTS.g:2544:1: rule__Version__Group_1_1_1__0 : rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 ;
    public final void rule__Version__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2548:1: ( rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1 )
            // InternalIMPORTS.g:2549:2: rule__Version__Group_1_1_1__0__Impl rule__Version__Group_1_1_1__1
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
    // InternalIMPORTS.g:2556:1: rule__Version__Group_1_1_1__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__Version__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2560:1: ( ( ( RULE_INT )? ) )
            // InternalIMPORTS.g:2561:1: ( ( RULE_INT )? )
            {
            // InternalIMPORTS.g:2561:1: ( ( RULE_INT )? )
            // InternalIMPORTS.g:2562:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0()); 
            }
            // InternalIMPORTS.g:2563:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIMPORTS.g:2563:3: RULE_INT
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
    // InternalIMPORTS.g:2571:1: rule__Version__Group_1_1_1__1 : rule__Version__Group_1_1_1__1__Impl ;
    public final void rule__Version__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2575:1: ( rule__Version__Group_1_1_1__1__Impl )
            // InternalIMPORTS.g:2576:2: rule__Version__Group_1_1_1__1__Impl
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
    // InternalIMPORTS.g:2582:1: rule__Version__Group_1_1_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Version__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2586:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2587:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2587:1: ( RULE_ID )
            // InternalIMPORTS.g:2588:2: RULE_ID
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
    // InternalIMPORTS.g:2598:1: rule__VersionedQualifiedName__Group__0 : rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 ;
    public final void rule__VersionedQualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2602:1: ( rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1 )
            // InternalIMPORTS.g:2603:2: rule__VersionedQualifiedName__Group__0__Impl rule__VersionedQualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalIMPORTS.g:2610:1: rule__VersionedQualifiedName__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__VersionedQualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2614:1: ( ( ruleQualifiedName ) )
            // InternalIMPORTS.g:2615:1: ( ruleQualifiedName )
            {
            // InternalIMPORTS.g:2615:1: ( ruleQualifiedName )
            // InternalIMPORTS.g:2616:2: ruleQualifiedName
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
    // InternalIMPORTS.g:2625:1: rule__VersionedQualifiedName__Group__1 : rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 ;
    public final void rule__VersionedQualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2629:1: ( rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2 )
            // InternalIMPORTS.g:2630:2: rule__VersionedQualifiedName__Group__1__Impl rule__VersionedQualifiedName__Group__2
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
    // InternalIMPORTS.g:2637:1: rule__VersionedQualifiedName__Group__1__Impl : ( '(' ) ;
    public final void rule__VersionedQualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2641:1: ( ( '(' ) )
            // InternalIMPORTS.g:2642:1: ( '(' )
            {
            // InternalIMPORTS.g:2642:1: ( '(' )
            // InternalIMPORTS.g:2643:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2652:1: rule__VersionedQualifiedName__Group__2 : rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 ;
    public final void rule__VersionedQualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2656:1: ( rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3 )
            // InternalIMPORTS.g:2657:2: rule__VersionedQualifiedName__Group__2__Impl rule__VersionedQualifiedName__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalIMPORTS.g:2664:1: rule__VersionedQualifiedName__Group__2__Impl : ( ruleVersion ) ;
    public final void rule__VersionedQualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2668:1: ( ( ruleVersion ) )
            // InternalIMPORTS.g:2669:1: ( ruleVersion )
            {
            // InternalIMPORTS.g:2669:1: ( ruleVersion )
            // InternalIMPORTS.g:2670:2: ruleVersion
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
    // InternalIMPORTS.g:2679:1: rule__VersionedQualifiedName__Group__3 : rule__VersionedQualifiedName__Group__3__Impl ;
    public final void rule__VersionedQualifiedName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2683:1: ( rule__VersionedQualifiedName__Group__3__Impl )
            // InternalIMPORTS.g:2684:2: rule__VersionedQualifiedName__Group__3__Impl
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
    // InternalIMPORTS.g:2690:1: rule__VersionedQualifiedName__Group__3__Impl : ( ')' ) ;
    public final void rule__VersionedQualifiedName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2694:1: ( ( ')' ) )
            // InternalIMPORTS.g:2695:1: ( ')' )
            {
            // InternalIMPORTS.g:2695:1: ( ')' )
            // InternalIMPORTS.g:2696:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2706:1: rule__VersionedQualifiedReferenceName__Group__0 : rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2710:1: ( rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1 )
            // InternalIMPORTS.g:2711:2: rule__VersionedQualifiedReferenceName__Group__0__Impl rule__VersionedQualifiedReferenceName__Group__1
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
    // InternalIMPORTS.g:2718:1: rule__VersionedQualifiedReferenceName__Group__0__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2722:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? ) )
            // InternalIMPORTS.g:2723:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            {
            // InternalIMPORTS.g:2723:1: ( ( rule__VersionedQualifiedReferenceName__Group_0__0 )? )
            // InternalIMPORTS.g:2724:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0()); 
            }
            // InternalIMPORTS.g:2725:2: ( rule__VersionedQualifiedReferenceName__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=32 && LA15_1<=33)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalIMPORTS.g:2725:3: rule__VersionedQualifiedReferenceName__Group_0__0
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
    // InternalIMPORTS.g:2733:1: rule__VersionedQualifiedReferenceName__Group__1 : rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 ;
    public final void rule__VersionedQualifiedReferenceName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2737:1: ( rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2 )
            // InternalIMPORTS.g:2738:2: rule__VersionedQualifiedReferenceName__Group__1__Impl rule__VersionedQualifiedReferenceName__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalIMPORTS.g:2745:1: rule__VersionedQualifiedReferenceName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2749:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2750:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2750:1: ( RULE_ID )
            // InternalIMPORTS.g:2751:2: RULE_ID
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
    // InternalIMPORTS.g:2760:1: rule__VersionedQualifiedReferenceName__Group__2 : rule__VersionedQualifiedReferenceName__Group__2__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2764:1: ( rule__VersionedQualifiedReferenceName__Group__2__Impl )
            // InternalIMPORTS.g:2765:2: rule__VersionedQualifiedReferenceName__Group__2__Impl
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
    // InternalIMPORTS.g:2771:1: rule__VersionedQualifiedReferenceName__Group__2__Impl : ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) ;
    public final void rule__VersionedQualifiedReferenceName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2775:1: ( ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* ) )
            // InternalIMPORTS.g:2776:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            {
            // InternalIMPORTS.g:2776:1: ( ( rule__VersionedQualifiedReferenceName__Group_2__0 )* )
            // InternalIMPORTS.g:2777:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2()); 
            }
            // InternalIMPORTS.g:2778:2: ( rule__VersionedQualifiedReferenceName__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIMPORTS.g:2778:3: rule__VersionedQualifiedReferenceName__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    rule__VersionedQualifiedReferenceName__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIMPORTS.g:2787:1: rule__VersionedQualifiedReferenceName__Group_0__0 : rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2791:1: ( rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1 )
            // InternalIMPORTS.g:2792:2: rule__VersionedQualifiedReferenceName__Group_0__0__Impl rule__VersionedQualifiedReferenceName__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalIMPORTS.g:2799:1: rule__VersionedQualifiedReferenceName__Group_0__0__Impl : ( ruleVersionedQualifiedName ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2803:1: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORTS.g:2804:1: ( ruleVersionedQualifiedName )
            {
            // InternalIMPORTS.g:2804:1: ( ruleVersionedQualifiedName )
            // InternalIMPORTS.g:2805:2: ruleVersionedQualifiedName
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
    // InternalIMPORTS.g:2814:1: rule__VersionedQualifiedReferenceName__Group_0__1 : rule__VersionedQualifiedReferenceName__Group_0__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2818:1: ( rule__VersionedQualifiedReferenceName__Group_0__1__Impl )
            // InternalIMPORTS.g:2819:2: rule__VersionedQualifiedReferenceName__Group_0__1__Impl
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
    // InternalIMPORTS.g:2825:1: rule__VersionedQualifiedReferenceName__Group_0__1__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2829:1: ( ( '::' ) )
            // InternalIMPORTS.g:2830:1: ( '::' )
            {
            // InternalIMPORTS.g:2830:1: ( '::' )
            // InternalIMPORTS.g:2831:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2841:1: rule__VersionedQualifiedReferenceName__Group_2__0 : rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2845:1: ( rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1 )
            // InternalIMPORTS.g:2846:2: rule__VersionedQualifiedReferenceName__Group_2__0__Impl rule__VersionedQualifiedReferenceName__Group_2__1
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
    // InternalIMPORTS.g:2853:1: rule__VersionedQualifiedReferenceName__Group_2__0__Impl : ( '::' ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2857:1: ( ( '::' ) )
            // InternalIMPORTS.g:2858:1: ( '::' )
            {
            // InternalIMPORTS.g:2858:1: ( '::' )
            // InternalIMPORTS.g:2859:2: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
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
    // InternalIMPORTS.g:2868:1: rule__VersionedQualifiedReferenceName__Group_2__1 : rule__VersionedQualifiedReferenceName__Group_2__1__Impl ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2872:1: ( rule__VersionedQualifiedReferenceName__Group_2__1__Impl )
            // InternalIMPORTS.g:2873:2: rule__VersionedQualifiedReferenceName__Group_2__1__Impl
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
    // InternalIMPORTS.g:2879:1: rule__VersionedQualifiedReferenceName__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__VersionedQualifiedReferenceName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2883:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:2884:1: ( RULE_ID )
            {
            // InternalIMPORTS.g:2884:1: ( RULE_ID )
            // InternalIMPORTS.g:2885:2: RULE_ID
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
    // InternalIMPORTS.g:2895:1: rule__INTEGER__Group_0__0 : rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 ;
    public final void rule__INTEGER__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2899:1: ( rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1 )
            // InternalIMPORTS.g:2900:2: rule__INTEGER__Group_0__0__Impl rule__INTEGER__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalIMPORTS.g:2907:1: rule__INTEGER__Group_0__0__Impl : ( ( '-' )? ) ;
    public final void rule__INTEGER__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2911:1: ( ( ( '-' )? ) )
            // InternalIMPORTS.g:2912:1: ( ( '-' )? )
            {
            // InternalIMPORTS.g:2912:1: ( ( '-' )? )
            // InternalIMPORTS.g:2913:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0()); 
            }
            // InternalIMPORTS.g:2914:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIMPORTS.g:2914:3: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // InternalIMPORTS.g:2922:1: rule__INTEGER__Group_0__1 : rule__INTEGER__Group_0__1__Impl ;
    public final void rule__INTEGER__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2926:1: ( rule__INTEGER__Group_0__1__Impl )
            // InternalIMPORTS.g:2927:2: rule__INTEGER__Group_0__1__Impl
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
    // InternalIMPORTS.g:2933:1: rule__INTEGER__Group_0__1__Impl : ( RULE_INT ) ;
    public final void rule__INTEGER__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:2937:1: ( ( RULE_INT ) )
            // InternalIMPORTS.g:2938:1: ( RULE_INT )
            {
            // InternalIMPORTS.g:2938:1: ( RULE_INT )
            // InternalIMPORTS.g:2939:2: RULE_INT
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


    // $ANTLR start "rule__TMTCIFImportImport__UnorderedGroup_3"
    // InternalIMPORTS.g:2949:1: rule__TMTCIFImportImport__UnorderedGroup_3 : rule__TMTCIFImportImport__UnorderedGroup_3__0 {...}?;
    public final void rule__TMTCIFImportImport__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
        	
        try {
            // InternalIMPORTS.g:2954:1: ( rule__TMTCIFImportImport__UnorderedGroup_3__0 {...}?)
            // InternalIMPORTS.g:2955:2: rule__TMTCIFImportImport__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__TMTCIFImportImport__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__UnorderedGroup_3"


    // $ANTLR start "rule__TMTCIFImportImport__UnorderedGroup_3__Impl"
    // InternalIMPORTS.g:2963:1: rule__TMTCIFImportImport__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__TMTCIFImportImport__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalIMPORTS.g:2968:1: ( ( ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) ) ) )
            // InternalIMPORTS.g:2969:3: ( ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) ) )
            {
            // InternalIMPORTS.g:2969:3: ( ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIMPORTS.g:2970:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) )
                    {
                    // InternalIMPORTS.g:2970:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) )
                    // InternalIMPORTS.g:2971:4: {...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFImportImport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalIMPORTS.g:2971:114: ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) )
                    // InternalIMPORTS.g:2972:5: ( ( rule__TMTCIFImportImport__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalIMPORTS.g:2978:5: ( ( rule__TMTCIFImportImport__Group_3_0__0 ) )
                    // InternalIMPORTS.g:2979:6: ( rule__TMTCIFImportImport__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0()); 
                    }
                    // InternalIMPORTS.g:2980:6: ( rule__TMTCIFImportImport__Group_3_0__0 )
                    // InternalIMPORTS.g:2980:7: rule__TMTCIFImportImport__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportImport__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORTS.g:2985:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) )
                    {
                    // InternalIMPORTS.g:2985:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) ) )
                    // InternalIMPORTS.g:2986:4: {...}? => ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__TMTCIFImportImport__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalIMPORTS.g:2986:114: ( ( ( rule__TMTCIFImportImport__Group_3_1__0 ) ) )
                    // InternalIMPORTS.g:2987:5: ( ( rule__TMTCIFImportImport__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalIMPORTS.g:2993:5: ( ( rule__TMTCIFImportImport__Group_3_1__0 ) )
                    // InternalIMPORTS.g:2994:6: ( rule__TMTCIFImportImport__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_1()); 
                    }
                    // InternalIMPORTS.g:2995:6: ( rule__TMTCIFImportImport__Group_3_1__0 )
                    // InternalIMPORTS.g:2995:7: rule__TMTCIFImportImport__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportImport__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_1()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__TMTCIFImportImport__UnorderedGroup_3__0"
    // InternalIMPORTS.g:3008:1: rule__TMTCIFImportImport__UnorderedGroup_3__0 : rule__TMTCIFImportImport__UnorderedGroup_3__Impl ( rule__TMTCIFImportImport__UnorderedGroup_3__1 )? ;
    public final void rule__TMTCIFImportImport__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3012:1: ( rule__TMTCIFImportImport__UnorderedGroup_3__Impl ( rule__TMTCIFImportImport__UnorderedGroup_3__1 )? )
            // InternalIMPORTS.g:3013:2: rule__TMTCIFImportImport__UnorderedGroup_3__Impl ( rule__TMTCIFImportImport__UnorderedGroup_3__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__TMTCIFImportImport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalIMPORTS.g:3014:2: ( rule__TMTCIFImportImport__UnorderedGroup_3__1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 1) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIMPORTS.g:0:0: rule__TMTCIFImportImport__UnorderedGroup_3__1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TMTCIFImportImport__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__TMTCIFImportImport__UnorderedGroup_3__0"


    // $ANTLR start "rule__TMTCIFImportImport__UnorderedGroup_3__1"
    // InternalIMPORTS.g:3020:1: rule__TMTCIFImportImport__UnorderedGroup_3__1 : rule__TMTCIFImportImport__UnorderedGroup_3__Impl ;
    public final void rule__TMTCIFImportImport__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3024:1: ( rule__TMTCIFImportImport__UnorderedGroup_3__Impl )
            // InternalIMPORTS.g:3025:2: rule__TMTCIFImportImport__UnorderedGroup_3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TMTCIFImportImport__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__UnorderedGroup_3__1"


    // $ANTLR start "rule__TMTCIFModelFile__ImportsAssignment_0"
    // InternalIMPORTS.g:3032:1: rule__TMTCIFModelFile__ImportsAssignment_0 : ( ruleTMTCIFModelFileImport ) ;
    public final void rule__TMTCIFModelFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3036:1: ( ( ruleTMTCIFModelFileImport ) )
            // InternalIMPORTS.g:3037:2: ( ruleTMTCIFModelFileImport )
            {
            // InternalIMPORTS.g:3037:2: ( ruleTMTCIFModelFileImport )
            // InternalIMPORTS.g:3038:3: ruleTMTCIFModelFileImport
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
    // InternalIMPORTS.g:3047:1: rule__TMTCIFModelFile__ElementAssignment_1 : ( ruleTMTCIFImportImport ) ;
    public final void rule__TMTCIFModelFile__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3051:1: ( ( ruleTMTCIFImportImport ) )
            // InternalIMPORTS.g:3052:2: ( ruleTMTCIFImportImport )
            {
            // InternalIMPORTS.g:3052:2: ( ruleTMTCIFImportImport )
            // InternalIMPORTS.g:3053:3: ruleTMTCIFImportImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFImportImportParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFImportImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFModelFileAccess().getElementTMTCIFImportImportParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // InternalIMPORTS.g:3062:1: rule__TMTCIFModelFileImport__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TMTCIFModelFileImport__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3066:1: ( ( RULE_STRING ) )
            // InternalIMPORTS.g:3067:2: ( RULE_STRING )
            {
            // InternalIMPORTS.g:3067:2: ( RULE_STRING )
            // InternalIMPORTS.g:3068:3: RULE_STRING
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


    // $ANTLR start "rule__TMTCIFImportImport__NameAssignment_1"
    // InternalIMPORTS.g:3077:1: rule__TMTCIFImportImport__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TMTCIFImportImport__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3081:1: ( ( RULE_ID ) )
            // InternalIMPORTS.g:3082:2: ( RULE_ID )
            {
            // InternalIMPORTS.g:3082:2: ( RULE_ID )
            // InternalIMPORTS.g:3083:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__NameAssignment_1"


    // $ANTLR start "rule__TMTCIFImportImport__UriAssignment_3_0_2"
    // InternalIMPORTS.g:3092:1: rule__TMTCIFImportImport__UriAssignment_3_0_2 : ( ruleQualifiedName ) ;
    public final void rule__TMTCIFImportImport__UriAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3096:1: ( ( ruleQualifiedName ) )
            // InternalIMPORTS.g:3097:2: ( ruleQualifiedName )
            {
            // InternalIMPORTS.g:3097:2: ( ruleQualifiedName )
            // InternalIMPORTS.g:3098:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__UriAssignment_3_0_2"


    // $ANTLR start "rule__TMTCIFImportImport__VersionAssignment_3_1_2"
    // InternalIMPORTS.g:3107:1: rule__TMTCIFImportImport__VersionAssignment_3_1_2 : ( ruleVersion ) ;
    public final void rule__TMTCIFImportImport__VersionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3111:1: ( ( ruleVersion ) )
            // InternalIMPORTS.g:3112:2: ( ruleVersion )
            {
            // InternalIMPORTS.g:3112:2: ( ruleVersion )
            // InternalIMPORTS.g:3113:3: ruleVersion
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__VersionAssignment_3_1_2"


    // $ANTLR start "rule__TMTCIFImportImport__FromAssignment_6"
    // InternalIMPORTS.g:3122:1: rule__TMTCIFImportImport__FromAssignment_6 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFImportImport__FromAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3126:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalIMPORTS.g:3127:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalIMPORTS.g:3127:2: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORTS.g:3128:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatCrossReference_6_0()); 
            }
            // InternalIMPORTS.g:3129:3: ( ruleVersionedQualifiedName )
            // InternalIMPORTS.g:3130:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getFromTMTCIFFormatFormatCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__FromAssignment_6"


    // $ANTLR start "rule__TMTCIFImportImport__ToAssignment_10_1"
    // InternalIMPORTS.g:3141:1: rule__TMTCIFImportImport__ToAssignment_10_1 : ( ( ruleVersionedQualifiedName ) ) ;
    public final void rule__TMTCIFImportImport__ToAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3145:1: ( ( ( ruleVersionedQualifiedName ) ) )
            // InternalIMPORTS.g:3146:2: ( ( ruleVersionedQualifiedName ) )
            {
            // InternalIMPORTS.g:3146:2: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORTS.g:3147:3: ( ruleVersionedQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatCrossReference_10_1_0()); 
            }
            // InternalIMPORTS.g:3148:3: ( ruleVersionedQualifiedName )
            // InternalIMPORTS.g:3149:4: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatVersionedQualifiedNameParserRuleCall_10_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getToTMTCIFFormatFormatCrossReference_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__ToAssignment_10_1"


    // $ANTLR start "rule__TMTCIFImportImport__DataSourceAssignment_12"
    // InternalIMPORTS.g:3160:1: rule__TMTCIFImportImport__DataSourceAssignment_12 : ( ruleTMTCIFImportDataSource ) ;
    public final void rule__TMTCIFImportImport__DataSourceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3164:1: ( ( ruleTMTCIFImportDataSource ) )
            // InternalIMPORTS.g:3165:2: ( ruleTMTCIFImportDataSource )
            {
            // InternalIMPORTS.g:3165:2: ( ruleTMTCIFImportDataSource )
            // InternalIMPORTS.g:3166:3: ruleTMTCIFImportDataSource
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFImportDataSource();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getDataSourceTMTCIFImportDataSourceParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__DataSourceAssignment_12"


    // $ANTLR start "rule__TMTCIFImportImport__VirtualSizeAssignment_13"
    // InternalIMPORTS.g:3175:1: rule__TMTCIFImportImport__VirtualSizeAssignment_13 : ( ruleTMTCIFImportVirtualSize ) ;
    public final void rule__TMTCIFImportImport__VirtualSizeAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3179:1: ( ( ruleTMTCIFImportVirtualSize ) )
            // InternalIMPORTS.g:3180:2: ( ruleTMTCIFImportVirtualSize )
            {
            // InternalIMPORTS.g:3180:2: ( ruleTMTCIFImportVirtualSize )
            // InternalIMPORTS.g:3181:3: ruleTMTCIFImportVirtualSize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFImportVirtualSize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeTMTCIFImportVirtualSizeParserRuleCall_13_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportImport__VirtualSizeAssignment_13"


    // $ANTLR start "rule__TMTCIFImportDataSource__FieldRefAssignment_4"
    // InternalIMPORTS.g:3190:1: rule__TMTCIFImportDataSource__FieldRefAssignment_4 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFImportDataSource__FieldRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3194:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORTS.g:3195:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORTS.g:3195:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORTS.g:3196:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }
            // InternalIMPORTS.g:3197:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORTS.g:3198:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__FieldRefAssignment_4"


    // $ANTLR start "rule__TMTCIFImportDataSource__LeftTrimAssignment_8"
    // InternalIMPORTS.g:3209:1: rule__TMTCIFImportDataSource__LeftTrimAssignment_8 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFImportDataSource__LeftTrimAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3213:1: ( ( ruleINTEGER ) )
            // InternalIMPORTS.g:3214:2: ( ruleINTEGER )
            {
            // InternalIMPORTS.g:3214:2: ( ruleINTEGER )
            // InternalIMPORTS.g:3215:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__LeftTrimAssignment_8"


    // $ANTLR start "rule__TMTCIFImportDataSource__RightTrimAssignment_12"
    // InternalIMPORTS.g:3224:1: rule__TMTCIFImportDataSource__RightTrimAssignment_12 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFImportDataSource__RightTrimAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3228:1: ( ( ruleINTEGER ) )
            // InternalIMPORTS.g:3229:2: ( ruleINTEGER )
            {
            // InternalIMPORTS.g:3229:2: ( ruleINTEGER )
            // InternalIMPORTS.g:3230:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportDataSource__RightTrimAssignment_12"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__FieldRefAssignment_4"
    // InternalIMPORTS.g:3239:1: rule__TMTCIFImportVirtualSize__FieldRefAssignment_4 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFImportVirtualSize__FieldRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3243:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORTS.g:3244:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORTS.g:3244:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORTS.g:3245:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }
            // InternalIMPORTS.g:3246:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORTS.g:3247:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefTMTCIFFormatFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__FieldRefAssignment_4"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__ToAssignment_8"
    // InternalIMPORTS.g:3258:1: rule__TMTCIFImportVirtualSize__ToAssignment_8 : ( ( ruleVersionedQualifiedReferenceName ) ) ;
    public final void rule__TMTCIFImportVirtualSize__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3262:1: ( ( ( ruleVersionedQualifiedReferenceName ) ) )
            // InternalIMPORTS.g:3263:2: ( ( ruleVersionedQualifiedReferenceName ) )
            {
            // InternalIMPORTS.g:3263:2: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORTS.g:3264:3: ( ruleVersionedQualifiedReferenceName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldCrossReference_8_0()); 
            }
            // InternalIMPORTS.g:3265:3: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORTS.g:3266:4: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldVersionedQualifiedReferenceNameParserRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToTMTCIFFormatFieldCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__ToAssignment_8"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2"
    // InternalIMPORTS.g:3277:1: rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2 : ( ruleINTEGER ) ;
    public final void rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3281:1: ( ( ruleINTEGER ) )
            // InternalIMPORTS.g:3282:2: ( ruleINTEGER )
            {
            // InternalIMPORTS.g:3282:2: ( ruleINTEGER )
            // InternalIMPORTS.g:3283:3: ruleINTEGER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTEGER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2"


    // $ANTLR start "rule__TMTCIFImportVirtualSize__UnitAssignment_11_2"
    // InternalIMPORTS.g:3292:1: rule__TMTCIFImportVirtualSize__UnitAssignment_11_2 : ( ruleTMTCIFImportUnit ) ;
    public final void rule__TMTCIFImportVirtualSize__UnitAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIMPORTS.g:3296:1: ( ( ruleTMTCIFImportUnit ) )
            // InternalIMPORTS.g:3297:2: ( ruleTMTCIFImportUnit )
            {
            // InternalIMPORTS.g:3297:2: ( ruleTMTCIFImportUnit )
            // InternalIMPORTS.g:3298:3: ruleTMTCIFImportUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitTMTCIFImportUnitEnumRuleCall_11_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTMTCIFImportUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitTMTCIFImportUnitEnumRuleCall_11_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMTCIFImportVirtualSize__UnitAssignment_11_2"

    // $ANTLR start synpred18_InternalIMPORTS
    public final void synpred18_InternalIMPORTS_fragment() throws RecognitionException {   
        // InternalIMPORTS.g:2970:3: ( ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) ) )
        // InternalIMPORTS.g:2970:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) )
        {
        // InternalIMPORTS.g:2970:3: ({...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) ) )
        // InternalIMPORTS.g:2971:4: {...}? => ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred18_InternalIMPORTS", "getUnorderedGroupHelper().canSelect(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIMPORTS.g:2971:114: ( ( ( rule__TMTCIFImportImport__Group_3_0__0 ) ) )
        // InternalIMPORTS.g:2972:5: ( ( rule__TMTCIFImportImport__Group_3_0__0 ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), 0);
        // InternalIMPORTS.g:2978:5: ( ( rule__TMTCIFImportImport__Group_3_0__0 ) )
        // InternalIMPORTS.g:2979:6: ( rule__TMTCIFImportImport__Group_3_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0()); 
        }
        // InternalIMPORTS.g:2980:6: ( rule__TMTCIFImportImport__Group_3_0__0 )
        // InternalIMPORTS.g:2980:7: rule__TMTCIFImportImport__Group_3_0__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFImportImport__Group_3_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalIMPORTS

    // $ANTLR start synpred19_InternalIMPORTS
    public final void synpred19_InternalIMPORTS_fragment() throws RecognitionException {   
        // InternalIMPORTS.g:3014:2: ( rule__TMTCIFImportImport__UnorderedGroup_3__1 )
        // InternalIMPORTS.g:3014:2: rule__TMTCIFImportImport__UnorderedGroup_3__1
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__TMTCIFImportImport__UnorderedGroup_3__1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalIMPORTS

    // Delegated rules

    public final boolean synpred19_InternalIMPORTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalIMPORTS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalIMPORTS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalIMPORTS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000030L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001800002L});
    }


}