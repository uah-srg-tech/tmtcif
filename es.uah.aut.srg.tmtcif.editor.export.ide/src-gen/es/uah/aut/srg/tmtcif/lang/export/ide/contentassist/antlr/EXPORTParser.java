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
package es.uah.aut.srg.tmtcif.lang.export.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.export.ide.contentassist.antlr.internal.InternalEXPORTParser;
import es.uah.aut.srg.tmtcif.lang.export.services.EXPORTGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class EXPORTParser extends AbstractContentAssistParser {

	@Inject
	private EXPORTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEXPORTParser createParser() {
		InternalEXPORTParser result = new InternalEXPORTParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTMTCIFExportExportAccess().getAlternatives_6(), "rule__TMTCIFExportExport__Alternatives_6");
					put(grammarAccess.getTMTCIFExportSizesAccess().getAlternatives_3(), "rule__TMTCIFExportSizes__Alternatives_3");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getAlternatives_3(), "rule__TMTCIFExportSettings__Alternatives_3");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getTMTCIFExportUnitAccess().getAlternatives(), "rule__TMTCIFExportUnit__Alternatives");
					put(grammarAccess.getTMTCIFModelFileAccess().getGroup(), "rule__TMTCIFModelFile__Group__0");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getGroup(), "rule__TMTCIFModelFileImport__Group__0");
					put(grammarAccess.getTMTCIFExportExportAccess().getGroup(), "rule__TMTCIFExportExport__Group__0");
					put(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_0(), "rule__TMTCIFExportExport__Group_3_0__0");
					put(grammarAccess.getTMTCIFExportExportAccess().getGroup_3_1(), "rule__TMTCIFExportExport__Group_3_1__0");
					put(grammarAccess.getTMTCIFExportSizesAccess().getGroup(), "rule__TMTCIFExportSizes__Group__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup(), "rule__TMTCIFExportSizeFromFileLength__Group__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_10(), "rule__TMTCIFExportSizeFromFileLength__Group_10__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getGroup_11(), "rule__TMTCIFExportSizeFromFileLength__Group_11__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup(), "rule__TMTCIFExportSizeFromFileLine__Group__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_14(), "rule__TMTCIFExportSizeFromFileLine__Group_14__0");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getGroup_15(), "rule__TMTCIFExportSizeFromFileLine__Group_15__0");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup(), "rule__TMTCIFExportSizeInBits__Group__0");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_10(), "rule__TMTCIFExportSizeInBits__Group_10__0");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getGroup_11(), "rule__TMTCIFExportSizeInBits__Group_11__0");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getGroup(), "rule__TMTCIFExportSettings__Group__0");
					put(grammarAccess.getTMTCIFExportSettingFromConstAccess().getGroup(), "rule__TMTCIFExportSettingFromConst__Group__0");
					put(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getGroup(), "rule__TMTCIFExportSettingFromSize__Group__0");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup(), "rule__TMTCIFExportSettingFromFile__Group__0");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_10(), "rule__TMTCIFExportSettingFromFile__Group_10__0");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_11(), "rule__TMTCIFExportSettingFromFile__Group_11__0");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getGroup_12(), "rule__TMTCIFExportSettingFromFile__Group_12__0");
					put(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getGroup(), "rule__TMTCIFExportSettingFromField__Group__0");
					put(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getGroup(), "rule__TMTCIFExportSettingAIFromConst__Group__0");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup(), "rule__TMTCIFExportSettingAIFromFile__Group__0");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_14(), "rule__TMTCIFExportSettingAIFromFile__Group_14__0");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_15(), "rule__TMTCIFExportSettingAIFromFile__Group_15__0");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getGroup_16(), "rule__TMTCIFExportSettingAIFromFile__Group_16__0");
					put(grammarAccess.getTMTCIFExportActivateDICsAccess().getGroup(), "rule__TMTCIFExportActivateDICs__Group__0");
					put(grammarAccess.getTMTCIFExportDICAccess().getGroup(), "rule__TMTCIFExportDIC__Group__0");
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
					put(grammarAccess.getTMTCIFExportExportAccess().getNameAssignment_1(), "rule__TMTCIFExportExport__NameAssignment_1");
					put(grammarAccess.getTMTCIFExportExportAccess().getUriAssignment_3_0_2(), "rule__TMTCIFExportExport__UriAssignment_3_0_2");
					put(grammarAccess.getTMTCIFExportExportAccess().getVersionAssignment_3_1_2(), "rule__TMTCIFExportExport__VersionAssignment_3_1_2");
					put(grammarAccess.getTMTCIFExportExportAccess().getFromAssignment_6_1(), "rule__TMTCIFExportExport__FromAssignment_6_1");
					put(grammarAccess.getTMTCIFExportExportAccess().getToAssignment_10(), "rule__TMTCIFExportExport__ToAssignment_10");
					put(grammarAccess.getTMTCIFExportExportAccess().getSizesAssignment_12(), "rule__TMTCIFExportExport__SizesAssignment_12");
					put(grammarAccess.getTMTCIFExportExportAccess().getSettingsAssignment_13(), "rule__TMTCIFExportExport__SettingsAssignment_13");
					put(grammarAccess.getTMTCIFExportExportAccess().getActivateDICsAssignment_14(), "rule__TMTCIFExportExport__ActivateDICsAssignment_14");
					put(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLengthAssignment_3_0(), "rule__TMTCIFExportSizes__SizeFromFileLengthAssignment_3_0");
					put(grammarAccess.getTMTCIFExportSizesAccess().getSizeFromFileLineAssignment_3_1(), "rule__TMTCIFExportSizes__SizeFromFileLineAssignment_3_1");
					put(grammarAccess.getTMTCIFExportSizesAccess().getSizeInBitsAssignment_3_2(), "rule__TMTCIFExportSizes__SizeInBitsAssignment_3_2");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getIdAssignment_4(), "rule__TMTCIFExportSizeFromFileLength__IdAssignment_4");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getFromFileAssignment_8(), "rule__TMTCIFExportSizeFromFileLength__FromFileAssignment_8");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getAddSizeAssignment_10_2(), "rule__TMTCIFExportSizeFromFileLength__AddSizeAssignment_10_2");
					put(grammarAccess.getTMTCIFExportSizeFromFileLengthAccess().getUnitAssignment_11_2(), "rule__TMTCIFExportSizeFromFileLength__UnitAssignment_11_2");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getIdAssignment_4(), "rule__TMTCIFExportSizeFromFileLine__IdAssignment_4");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getFromFileAssignment_8(), "rule__TMTCIFExportSizeFromFileLine__FromFileAssignment_8");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getLineAssignment_12(), "rule__TMTCIFExportSizeFromFileLine__LineAssignment_12");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getAddSizeAssignment_14_2(), "rule__TMTCIFExportSizeFromFileLine__AddSizeAssignment_14_2");
					put(grammarAccess.getTMTCIFExportSizeFromFileLineAccess().getUnitAssignment_15_2(), "rule__TMTCIFExportSizeFromFileLine__UnitAssignment_15_2");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getIdAssignment_4(), "rule__TMTCIFExportSizeInBits__IdAssignment_4");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getFromAssignment_8(), "rule__TMTCIFExportSizeInBits__FromAssignment_8");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getAddSizeAssignment_10_2(), "rule__TMTCIFExportSizeInBits__AddSizeAssignment_10_2");
					put(grammarAccess.getTMTCIFExportSizeInBitsAccess().getUnitAssignment_11_2(), "rule__TMTCIFExportSizeInBits__UnitAssignment_11_2");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromConstAssignment_3_0(), "rule__TMTCIFExportSettings__SettingFromConstAssignment_3_0");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromSizeAssignment_3_1(), "rule__TMTCIFExportSettings__SettingFromSizeAssignment_3_1");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFileAssignment_3_2(), "rule__TMTCIFExportSettings__SettingFromFileAssignment_3_2");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingFromFieldAssignment_3_3(), "rule__TMTCIFExportSettings__SettingFromFieldAssignment_3_3");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromConstAssignment_3_4(), "rule__TMTCIFExportSettings__SettingAIFromConstAssignment_3_4");
					put(grammarAccess.getTMTCIFExportSettingsAccess().getSettingAIFromFileAssignment_3_5(), "rule__TMTCIFExportSettings__SettingAIFromFileAssignment_3_5");
					put(grammarAccess.getTMTCIFExportSettingFromConstAccess().getValueAssignment_4(), "rule__TMTCIFExportSettingFromConst__ValueAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingFromConstAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingFromConst__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getSizeRefAssignment_4(), "rule__TMTCIFExportSettingFromSize__SizeRefAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingFromSizeAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingFromSize__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getFileAssignment_4(), "rule__TMTCIFExportSettingFromFile__FileAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingFromFile__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getOffsetAssignment_10_2(), "rule__TMTCIFExportSettingFromFile__OffsetAssignment_10_2");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getSizeAssignment_11_2(), "rule__TMTCIFExportSettingFromFile__SizeAssignment_11_2");
					put(grammarAccess.getTMTCIFExportSettingFromFileAccess().getLineAssignment_12_2(), "rule__TMTCIFExportSettingFromFile__LineAssignment_12_2");
					put(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getFieldRefAssignment_4(), "rule__TMTCIFExportSettingFromField__FieldRefAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingFromFieldAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingFromField__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getValueAssignment_4(), "rule__TMTCIFExportSettingAIFromConst__ValueAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingAIFromConst__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingAIFromConstAccess().getToArrayIndexAssignment_12(), "rule__TMTCIFExportSettingAIFromConst__ToArrayIndexAssignment_12");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getFileAssignment_4(), "rule__TMTCIFExportSettingAIFromFile__FileAssignment_4");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToFieldRefAssignment_8(), "rule__TMTCIFExportSettingAIFromFile__ToFieldRefAssignment_8");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getToArrayIndexAssignment_12(), "rule__TMTCIFExportSettingAIFromFile__ToArrayIndexAssignment_12");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getOffsetAssignment_14_2(), "rule__TMTCIFExportSettingAIFromFile__OffsetAssignment_14_2");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getSizeAssignment_15_2(), "rule__TMTCIFExportSettingAIFromFile__SizeAssignment_15_2");
					put(grammarAccess.getTMTCIFExportSettingAIFromFileAccess().getLineAssignment_16_2(), "rule__TMTCIFExportSettingAIFromFile__LineAssignment_16_2");
					put(grammarAccess.getTMTCIFExportActivateDICsAccess().getDICAssignment_3(), "rule__TMTCIFExportActivateDICs__DICAssignment_3");
					put(grammarAccess.getTMTCIFExportDICAccess().getIdAssignment_4(), "rule__TMTCIFExportDIC__IdAssignment_4");
					put(grammarAccess.getTMTCIFExportDICAccess().getDICRefAssignment_8(), "rule__TMTCIFExportDIC__DICRefAssignment_8");
					put(grammarAccess.getTMTCIFExportExportAccess().getUnorderedGroup_3(), "rule__TMTCIFExportExport__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEXPORTParser typedParser = (InternalEXPORTParser) parser;
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

	public EXPORTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EXPORTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
