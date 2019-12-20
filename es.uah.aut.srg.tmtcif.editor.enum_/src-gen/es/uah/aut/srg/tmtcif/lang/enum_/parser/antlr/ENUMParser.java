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
package es.uah.aut.srg.tmtcif.lang.enum_.parser.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.enum_.parser.antlr.internal.InternalENUMParser;
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ENUMParser extends AbstractAntlrParser {

	@Inject
	private ENUMGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalENUMParser createParser(XtextTokenStream stream) {
		return new InternalENUMParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TMTCIFEnum";
	}

	public ENUMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENUMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
