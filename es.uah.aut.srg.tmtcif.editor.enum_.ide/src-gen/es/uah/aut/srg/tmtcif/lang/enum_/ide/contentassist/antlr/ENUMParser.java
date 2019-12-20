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
package es.uah.aut.srg.tmtcif.lang.enum_.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.enum_.ide.contentassist.antlr.internal.InternalENUMParser;
import es.uah.aut.srg.tmtcif.lang.enum_.services.ENUMGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class ENUMParser extends AbstractContentAssistParser {

	@Inject
	private ENUMGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalENUMParser createParser() {
		InternalENUMParser result = new InternalENUMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getTMTCIFEnumAccess().getGroup(), "rule__TMTCIFEnum__Group__0");
					put(grammarAccess.getTMTCIFEnumValueAccess().getGroup(), "rule__TMTCIFEnumValue__Group__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getTMTCIFEnumAccess().getNameAssignment_2(), "rule__TMTCIFEnum__NameAssignment_2");
					put(grammarAccess.getTMTCIFEnumAccess().getValuesAssignment_4(), "rule__TMTCIFEnum__ValuesAssignment_4");
					put(grammarAccess.getTMTCIFEnumValueAccess().getNameAssignment_2(), "rule__TMTCIFEnumValue__NameAssignment_2");
					put(grammarAccess.getTMTCIFEnumValueAccess().getRawAssignment_4(), "rule__TMTCIFEnumValue__RawAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalENUMParser typedParser = (InternalENUMParser) parser;
			typedParser.entryRuleTMTCIFEnum();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ENUMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENUMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
