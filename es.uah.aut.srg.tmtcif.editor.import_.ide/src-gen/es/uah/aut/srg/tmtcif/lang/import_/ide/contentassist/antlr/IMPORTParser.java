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
package es.uah.aut.srg.tmtcif.lang.import_.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.import_.ide.contentassist.antlr.internal.InternalIMPORTParser;
import es.uah.aut.srg.tmtcif.lang.import_.services.IMPORTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class IMPORTParser extends AbstractContentAssistParser {

	@Inject
	private IMPORTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalIMPORTParser createParser() {
		InternalIMPORTParser result = new InternalIMPORTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTMTCIFImportImportAccess().getAlternatives_10(), "rule__TMTCIFImportImport__Alternatives_10");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getTMTCIFImportUnitAccess().getAlternatives(), "rule__TMTCIFImportUnit__Alternatives");
					put(grammarAccess.getTMTCIFModelFileAccess().getGroup(), "rule__TMTCIFModelFile__Group__0");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getGroup(), "rule__TMTCIFModelFileImport__Group__0");
					put(grammarAccess.getTMTCIFImportImportAccess().getGroup(), "rule__TMTCIFImportImport__Group__0");
					put(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_0(), "rule__TMTCIFImportImport__Group_3_0__0");
					put(grammarAccess.getTMTCIFImportImportAccess().getGroup_3_1(), "rule__TMTCIFImportImport__Group_3_1__0");
					put(grammarAccess.getTMTCIFImportDataSourceAccess().getGroup(), "rule__TMTCIFImportDataSource__Group__0");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup(), "rule__TMTCIFImportVirtualSize__Group__0");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_10(), "rule__TMTCIFImportVirtualSize__Group_10__0");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getGroup_11(), "rule__TMTCIFImportVirtualSize__Group_11__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0(), "rule__TMTCIFModelFile__ImportsAssignment_0");
					put(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1(), "rule__TMTCIFModelFile__ElementAssignment_1");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2(), "rule__TMTCIFModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getTMTCIFImportImportAccess().getNameAssignment_1(), "rule__TMTCIFImportImport__NameAssignment_1");
					put(grammarAccess.getTMTCIFImportImportAccess().getUriAssignment_3_0_2(), "rule__TMTCIFImportImport__UriAssignment_3_0_2");
					put(grammarAccess.getTMTCIFImportImportAccess().getVersionAssignment_3_1_2(), "rule__TMTCIFImportImport__VersionAssignment_3_1_2");
					put(grammarAccess.getTMTCIFImportImportAccess().getFromAssignment_6(), "rule__TMTCIFImportImport__FromAssignment_6");
					put(grammarAccess.getTMTCIFImportImportAccess().getToAssignment_10_1(), "rule__TMTCIFImportImport__ToAssignment_10_1");
					put(grammarAccess.getTMTCIFImportImportAccess().getDataSourceAssignment_12(), "rule__TMTCIFImportImport__DataSourceAssignment_12");
					put(grammarAccess.getTMTCIFImportImportAccess().getVirtualSizeAssignment_13(), "rule__TMTCIFImportImport__VirtualSizeAssignment_13");
					put(grammarAccess.getTMTCIFImportDataSourceAccess().getFieldRefAssignment_4(), "rule__TMTCIFImportDataSource__FieldRefAssignment_4");
					put(grammarAccess.getTMTCIFImportDataSourceAccess().getLeftTrimAssignment_8(), "rule__TMTCIFImportDataSource__LeftTrimAssignment_8");
					put(grammarAccess.getTMTCIFImportDataSourceAccess().getRightTrimAssignment_12(), "rule__TMTCIFImportDataSource__RightTrimAssignment_12");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getFieldRefAssignment_4(), "rule__TMTCIFImportVirtualSize__FieldRefAssignment_4");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getToAssignment_8(), "rule__TMTCIFImportVirtualSize__ToAssignment_8");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getAddSizeAssignment_10_2(), "rule__TMTCIFImportVirtualSize__AddSizeAssignment_10_2");
					put(grammarAccess.getTMTCIFImportVirtualSizeAccess().getUnitAssignment_11_2(), "rule__TMTCIFImportVirtualSize__UnitAssignment_11_2");
					put(grammarAccess.getTMTCIFImportImportAccess().getUnorderedGroup_3(), "rule__TMTCIFImportImport__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalIMPORTParser typedParser = (InternalIMPORTParser) parser;
			typedParser.entryRuleTMTCIFModelFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IMPORTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IMPORTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
