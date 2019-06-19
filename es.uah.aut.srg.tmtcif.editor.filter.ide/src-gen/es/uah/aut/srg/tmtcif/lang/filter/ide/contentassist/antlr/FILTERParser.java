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
package es.uah.aut.srg.tmtcif.lang.filter.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.filter.ide.contentassist.antlr.internal.InternalFILTERParser;
import es.uah.aut.srg.tmtcif.lang.filter.services.FILTERGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FILTERParser extends AbstractContentAssistParser {

	@Inject
	private FILTERGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFILTERParser createParser() {
		InternalFILTERParser result = new InternalFILTERParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTMTCIFFilterFilterAccess().getAlternatives(), "rule__TMTCIFFilterFilter__Alternatives");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getAlternatives_3_1_5(), "rule__TMTCIFFilterMaxtermFilter__Alternatives_3_1_5");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getAlternatives_3_1_5(), "rule__TMTCIFFilterMintermFilter__Alternatives_3_1_5");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getAlternatives_19(), "rule__TMTCIFFilterBoolVar__Alternatives_19");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAlternatives_19(), "rule__TMTCIFFilterBoolVarFromArrayItem__Alternatives_19");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAlternatives_23(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Alternatives_23");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getTMTCIFFilterConstantTypeAccess().getAlternatives(), "rule__TMTCIFFilterConstantType__Alternatives");
					put(grammarAccess.getTMTCIFFilterOPTypeAccess().getAlternatives(), "rule__TMTCIFFilterOPType__Alternatives");
					put(grammarAccess.getTMTCIFFilterSelectTypeAccess().getAlternatives(), "rule__TMTCIFFilterSelectType__Alternatives");
					put(grammarAccess.getTMTCIFModelFileAccess().getGroup(), "rule__TMTCIFModelFile__Group__0");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getGroup(), "rule__TMTCIFModelFileImport__Group__0");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup(), "rule__TMTCIFFilterMaxtermFilter__Group__0");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_0(), "rule__TMTCIFFilterMaxtermFilter__Group_3_0__0");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1(), "rule__TMTCIFFilterMaxtermFilter__Group_3_1__0");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getGroup_3_1_0(), "rule__TMTCIFFilterMaxtermFilter__Group_3_1_0__0");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup(), "rule__TMTCIFFilterMintermFilter__Group__0");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_0(), "rule__TMTCIFFilterMintermFilter__Group_3_0__0");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1(), "rule__TMTCIFFilterMintermFilter__Group_3_1__0");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getGroup_3_1_0(), "rule__TMTCIFFilterMintermFilter__Group_3_1_0__0");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getGroup(), "rule__TMTCIFFilterBoolVar__Group__0");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getGroup(), "rule__TMTCIFFilterBoolVarFromArrayItem__Group__0");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroup(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__Group__0");
					put(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getGroup(), "rule__TMTCIFFilterBoolVarFDIC__Group__0");
					put(grammarAccess.getTMTCIFFilterFieldOpAccess().getGroup(), "rule__TMTCIFFilterFieldOp__Group__0");
					put(grammarAccess.getTMTCIFFilterConstantAccess().getGroup(), "rule__TMTCIFFilterConstant__Group__0");
					put(grammarAccess.getTMTCIFFilterConstantAccess().getGroup_6(), "rule__TMTCIFFilterConstant__Group_6__0");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getGroup(), "rule__TMTCIFFilterSelect__Group__0");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_10(), "rule__TMTCIFFilterSelect__Group_10__0");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_11(), "rule__TMTCIFFilterSelect__Group_11__0");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getGroup_12(), "rule__TMTCIFFilterSelect__Group_12__0");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup(), "rule__TMTCIFFilterSelectLine__Group__0");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_10(), "rule__TMTCIFFilterSelectLine__Group_10__0");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_11(), "rule__TMTCIFFilterSelectLine__Group_11__0");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getGroup_12(), "rule__TMTCIFFilterSelectLine__Group_12__0");
					put(grammarAccess.getTMTCIFFilterMaxtermAccess().getGroup(), "rule__TMTCIFFilterMaxterm__Group__0");
					put(grammarAccess.getTMTCIFFilterMintermAccess().getGroup(), "rule__TMTCIFFilterMinterm__Group__0");
					put(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getGroup(), "rule__TMTCIFFilterBoolVarRef__Group__0");
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
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getNameAssignment_1(), "rule__TMTCIFFilterMaxtermFilter__NameAssignment_1");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUriAssignment_3_0_2(), "rule__TMTCIFFilterMaxtermFilter__UriAssignment_3_0_2");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getVersionAssignment_3_1_0_2(), "rule__TMTCIFFilterMaxtermFilter__VersionAssignment_3_1_0_2");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getFormatFileAssignment_3_1_3(), "rule__TMTCIFFilterMaxtermFilter__FormatFileAssignment_3_1_3");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarAssignment_3_1_5_0(), "rule__TMTCIFFilterMaxtermFilter__BoolVarAssignment_3_1_5_0");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1(), "rule__TMTCIFFilterMaxtermFilter__BoolVarFromArrayItemAssignment_3_1_5_1");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2(), "rule__TMTCIFFilterMaxtermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getBoolVarFDICAssignment_3_1_5_3(), "rule__TMTCIFFilterMaxtermFilter__BoolVarFDICAssignment_3_1_5_3");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getMaxtermAssignment_4(), "rule__TMTCIFFilterMaxtermFilter__MaxtermAssignment_4");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getNameAssignment_1(), "rule__TMTCIFFilterMintermFilter__NameAssignment_1");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUriAssignment_3_0_2(), "rule__TMTCIFFilterMintermFilter__UriAssignment_3_0_2");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getVersionAssignment_3_1_0_2(), "rule__TMTCIFFilterMintermFilter__VersionAssignment_3_1_0_2");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getFormatFileAssignment_3_1_3(), "rule__TMTCIFFilterMintermFilter__FormatFileAssignment_3_1_3");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarAssignment_3_1_5_0(), "rule__TMTCIFFilterMintermFilter__BoolVarAssignment_3_1_5_0");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromArrayItemAssignment_3_1_5_1(), "rule__TMTCIFFilterMintermFilter__BoolVarFromArrayItemAssignment_3_1_5_1");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemAssignment_3_1_5_2(), "rule__TMTCIFFilterMintermFilter__BoolVarFromGroupedArrayItemAssignment_3_1_5_2");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getBoolVarFDICAssignment_3_1_5_3(), "rule__TMTCIFFilterMintermFilter__BoolVarFDICAssignment_3_1_5_3");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getMintermAssignment_4(), "rule__TMTCIFFilterMintermFilter__MintermAssignment_4");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getIdAssignment_4(), "rule__TMTCIFFilterBoolVar__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getNameAssignment_8(), "rule__TMTCIFFilterBoolVar__NameAssignment_8");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantTypeAssignment_12(), "rule__TMTCIFFilterBoolVar__ConstantTypeAssignment_12");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getFieldRefAssignment_16(), "rule__TMTCIFFilterBoolVar__FieldRefAssignment_16");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getOpAssignment_18(), "rule__TMTCIFFilterBoolVar__OpAssignment_18");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getConstantAssignment_19_0(), "rule__TMTCIFFilterBoolVar__ConstantAssignment_19_0");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectAssignment_19_1(), "rule__TMTCIFFilterBoolVar__SelectAssignment_19_1");
					put(grammarAccess.getTMTCIFFilterBoolVarAccess().getSelectLineAssignment_19_2(), "rule__TMTCIFFilterBoolVar__SelectLineAssignment_19_2");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getIdAssignment_4(), "rule__TMTCIFFilterBoolVarFromArrayItem__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getNameAssignment_8(), "rule__TMTCIFFilterBoolVarFromArrayItem__NameAssignment_8");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantTypeAssignment_12(), "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantTypeAssignment_12");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getAIFieldRefAssignment_16(), "rule__TMTCIFFilterBoolVarFromArrayItem__AIFieldRefAssignment_16");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getOpAssignment_18(), "rule__TMTCIFFilterBoolVarFromArrayItem__OpAssignment_18");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getConstantAssignment_19_0(), "rule__TMTCIFFilterBoolVarFromArrayItem__ConstantAssignment_19_0");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectAssignment_19_1(), "rule__TMTCIFFilterBoolVarFromArrayItem__SelectAssignment_19_1");
					put(grammarAccess.getTMTCIFFilterBoolVarFromArrayItemAccess().getSelectLineAssignment_19_2(), "rule__TMTCIFFilterBoolVarFromArrayItem__SelectLineAssignment_19_2");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getIdAssignment_4(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getNameAssignment_8(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__NameAssignment_8");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeAssignment_12(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantTypeAssignment_12");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getGroupAssignment_16(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__GroupAssignment_16");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsAssignment_20(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__AIFieldRefsAssignment_20");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getOpAssignment_22(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__OpAssignment_22");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getConstantAssignment_23_0(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__ConstantAssignment_23_0");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectAssignment_23_1(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectAssignment_23_1");
					put(grammarAccess.getTMTCIFFilterBoolVarFromGroupedArrayItemAccess().getSelectLineAssignment_23_2(), "rule__TMTCIFFilterBoolVarFromGroupedArrayItem__SelectLineAssignment_23_2");
					put(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getIdAssignment_4(), "rule__TMTCIFFilterBoolVarFDIC__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getNameAssignment_8(), "rule__TMTCIFFilterBoolVarFDIC__NameAssignment_8");
					put(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getFieldRefAssignment_12(), "rule__TMTCIFFilterBoolVarFDIC__FieldRefAssignment_12");
					put(grammarAccess.getTMTCIFFilterBoolVarFDICAccess().getOpAssignment_14(), "rule__TMTCIFFilterBoolVarFDIC__OpAssignment_14");
					put(grammarAccess.getTMTCIFFilterFieldOpAccess().getTypeAssignment_4(), "rule__TMTCIFFilterFieldOp__TypeAssignment_4");
					put(grammarAccess.getTMTCIFFilterConstantAccess().getValueAssignment_4(), "rule__TMTCIFFilterConstant__ValueAssignment_4");
					put(grammarAccess.getTMTCIFFilterConstantAccess().getMaskAssignment_6_2(), "rule__TMTCIFFilterConstant__MaskAssignment_6_2");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getFromFileAssignment_4(), "rule__TMTCIFFilterSelect__FromFileAssignment_4");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getTypeAssignment_8(), "rule__TMTCIFFilterSelect__TypeAssignment_8");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getOffsetAssignment_10_2(), "rule__TMTCIFFilterSelect__OffsetAssignment_10_2");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getSizeAssignment_11_2(), "rule__TMTCIFFilterSelect__SizeAssignment_11_2");
					put(grammarAccess.getTMTCIFFilterSelectAccess().getMaskAssignment_12_2(), "rule__TMTCIFFilterSelect__MaskAssignment_12_2");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getFromFileAssignment_4(), "rule__TMTCIFFilterSelectLine__FromFileAssignment_4");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getLineAssignment_8(), "rule__TMTCIFFilterSelectLine__LineAssignment_8");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getLeftTrimAssignment_10_2(), "rule__TMTCIFFilterSelectLine__LeftTrimAssignment_10_2");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getRightTrimAssignment_11_2(), "rule__TMTCIFFilterSelectLine__RightTrimAssignment_11_2");
					put(grammarAccess.getTMTCIFFilterSelectLineAccess().getMaskAssignment_12_2(), "rule__TMTCIFFilterSelectLine__MaskAssignment_12_2");
					put(grammarAccess.getTMTCIFFilterMaxtermAccess().getIdAssignment_4(), "rule__TMTCIFFilterMaxterm__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterMaxtermAccess().getBoolVarRefAssignment_6(), "rule__TMTCIFFilterMaxterm__BoolVarRefAssignment_6");
					put(grammarAccess.getTMTCIFFilterMintermAccess().getIdAssignment_4(), "rule__TMTCIFFilterMinterm__IdAssignment_4");
					put(grammarAccess.getTMTCIFFilterMintermAccess().getBoolVarRefAssignment_6(), "rule__TMTCIFFilterMinterm__BoolVarRefAssignment_6");
					put(grammarAccess.getTMTCIFFilterBoolVarRefAccess().getIdRefAssignment_4(), "rule__TMTCIFFilterBoolVarRef__IdRefAssignment_4");
					put(grammarAccess.getTMTCIFFilterMaxtermFilterAccess().getUnorderedGroup_3(), "rule__TMTCIFFilterMaxtermFilter__UnorderedGroup_3");
					put(grammarAccess.getTMTCIFFilterMintermFilterAccess().getUnorderedGroup_3(), "rule__TMTCIFFilterMintermFilter__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFILTERParser typedParser = (InternalFILTERParser) parser;
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

	public FILTERGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FILTERGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
