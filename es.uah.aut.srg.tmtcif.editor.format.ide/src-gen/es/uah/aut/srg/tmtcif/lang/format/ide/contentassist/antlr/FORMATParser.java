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
package es.uah.aut.srg.tmtcif.lang.format.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uah.aut.srg.tmtcif.lang.format.ide.contentassist.antlr.internal.InternalFORMATParser;
import es.uah.aut.srg.tmtcif.lang.format.services.FORMATGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FORMATParser extends AbstractContentAssistParser {

	@Inject
	private FORMATGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFORMATParser createParser() {
		InternalFORMATParser result = new InternalFORMATParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTMTCIFFormatFormatAccess().getAlternatives_3_3_1(), "rule__TMTCIFFormatFormat__Alternatives_3_3_1");
					put(grammarAccess.getTMTCIFFormatFieldAccess().getAlternatives(), "rule__TMTCIFFormatField__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getTMTCIFFormatFormatTypeAccess().getAlternatives(), "rule__TMTCIFFormatFormatType__Alternatives");
					put(grammarAccess.getTMTCIFFormatFieldTypeAccess().getAlternatives(), "rule__TMTCIFFormatFieldType__Alternatives");
					put(grammarAccess.getTMTCIFFormatFieldByteOrderAccess().getAlternatives(), "rule__TMTCIFFormatFieldByteOrder__Alternatives");
					put(grammarAccess.getTMTCIFFormatSFieldFirstBitAccess().getAlternatives(), "rule__TMTCIFFormatSFieldFirstBit__Alternatives");
					put(grammarAccess.getTMTCIFFormatUnitAccess().getAlternatives(), "rule__TMTCIFFormatUnit__Alternatives");
					put(grammarAccess.getTMTCIFFormatPowerAccess().getAlternatives(), "rule__TMTCIFFormatPower__Alternatives");
					put(grammarAccess.getTMTCIFFormatCheckTypeAccess().getAlternatives(), "rule__TMTCIFFormatCheckType__Alternatives");
					put(grammarAccess.getTMTCIFModelFileAccess().getGroup(), "rule__TMTCIFModelFile__Group__0");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getGroup(), "rule__TMTCIFModelFileImport__Group__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup(), "rule__TMTCIFFormatFormat__Group__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_0(), "rule__TMTCIFFormatFormat__Group_3_0__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_1(), "rule__TMTCIFFormatFormat__Group_3_1__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_2(), "rule__TMTCIFFormatFormat__Group_3_2__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3(), "rule__TMTCIFFormatFormat__Group_3_3__0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getGroup_3_3_0(), "rule__TMTCIFFormatFormat__Group_3_3_0__0");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup(), "rule__TMTCIFFormatCSField__Group__0");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getGroup_14(), "rule__TMTCIFFormatCSField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup(), "rule__TMTCIFFormatCSFormulaField__Group__0");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGroup_14(), "rule__TMTCIFFormatCSFormulaField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup(), "rule__TMTCIFFormatVSField__Group__0");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getGroup_14(), "rule__TMTCIFFormatVSField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getGroup(), "rule__TMTCIFFormatVRFieldSize__Group__0");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup(), "rule__TMTCIFFormatFDICField__Group__0");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getGroup_14(), "rule__TMTCIFFormatFDICField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup(), "rule__TMTCIFFormatAField__Group__0");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getGroup_14(), "rule__TMTCIFFormatAField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup(), "rule__TMTCIFFormatAIField__Group__0");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getGroup_14(), "rule__TMTCIFFormatAIField__Group_14__0");
					put(grammarAccess.getTMTCIFFormatSizeAccess().getGroup(), "rule__TMTCIFFormatSize__Group__0");
					put(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getGroup(), "rule__TMTCIFFormatGlobalOffset__Group__0");
					put(grammarAccess.getTMTCIFFormatFormulaAccess().getGroup(), "rule__TMTCIFFormatFormula__Group__0");
					put(grammarAccess.getTMTCIFFormatConstSizeAccess().getGroup(), "rule__TMTCIFFormatConstSize__Group__0");
					put(grammarAccess.getTMTCIFFormatMaxSizeAccess().getGroup(), "rule__TMTCIFFormatMaxSize__Group__0");
					put(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup(), "rule__TMTCIFFormatVariableSize__Group__0");
					put(grammarAccess.getTMTCIFFormatVariableSizeAccess().getGroup_10(), "rule__TMTCIFFormatVariableSize__Group_10__0");
					put(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getGroup(), "rule__TMTCIFFormatFloatingOffset__Group__0");
					put(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getGroup(), "rule__TMTCIFFormatSortedFieldsToCheck__Group__0");
					put(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getGroup(), "rule__TMTCIFFormatFieldToCheck__Group__0");
					put(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getGroup(), "rule__TMTCIFFormatArrayDimension__Group__0");
					put(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getGroup(), "rule__TMTCIFFormatLocalOffset__Group__0");
					put(grammarAccess.getTMTCIFFormatArrayRefAccess().getGroup(), "rule__TMTCIFFormatArrayRef__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getTMTCIFModelFileAccess().getImportsAssignment_0(), "rule__TMTCIFModelFile__ImportsAssignment_0");
					put(grammarAccess.getTMTCIFModelFileAccess().getElementAssignment_1(), "rule__TMTCIFModelFile__ElementAssignment_1");
					put(grammarAccess.getTMTCIFModelFileImportAccess().getImportURIAssignment_2(), "rule__TMTCIFModelFileImport__ImportURIAssignment_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getNameAssignment_1(), "rule__TMTCIFFormatFormat__NameAssignment_1");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getUriAssignment_3_0_2(), "rule__TMTCIFFormatFormat__UriAssignment_3_0_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getVersionAssignment_3_1_2(), "rule__TMTCIFFormatFormat__VersionAssignment_3_1_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getProtocolAssignment_3_2_2(), "rule__TMTCIFFormatFormat__ProtocolAssignment_3_2_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getTypeAssignment_3_3_0_2(), "rule__TMTCIFFormatFormat__TypeAssignment_3_3_0_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getCSFieldAssignment_3_3_1_0(), "rule__TMTCIFFormatFormat__CSFieldAssignment_3_3_1_0");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getCSFormulaFieldAssignment_3_3_1_1(), "rule__TMTCIFFormatFormat__CSFormulaFieldAssignment_3_3_1_1");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getVSFieldAssignment_3_3_1_2(), "rule__TMTCIFFormatFormat__VSFieldAssignment_3_3_1_2");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getFDICFieldAssignment_3_3_1_3(), "rule__TMTCIFFormatFormat__FDICFieldAssignment_3_3_1_3");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getVRFieldSizeAssignment_3_3_1_4(), "rule__TMTCIFFormatFormat__VRFieldSizeAssignment_3_3_1_4");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getAFieldAssignment_3_3_1_5(), "rule__TMTCIFFormatFormat__AFieldAssignment_3_3_1_5");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getAIFieldAssignment_3_3_1_6(), "rule__TMTCIFFormatFormat__AIFieldAssignment_3_3_1_6");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatCSField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatCSField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatCSField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatCSField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getTypeAssignment_17(), "rule__TMTCIFFormatCSField__TypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatCSField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatCSField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getSizeAssignment_27(), "rule__TMTCIFFormatCSField__SizeAssignment_27");
					put(grammarAccess.getTMTCIFFormatCSFieldAccess().getGlobalOffsetAssignment_28(), "rule__TMTCIFFormatCSField__GlobalOffsetAssignment_28");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatCSFormulaField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatCSFormulaField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatCSFormulaField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatCSFormulaField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getTypeAssignment_17(), "rule__TMTCIFFormatCSFormulaField__TypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatCSFormulaField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatCSFormulaField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getSizeAssignment_27(), "rule__TMTCIFFormatCSFormulaField__SizeAssignment_27");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getGlobalOffsetAssignment_28(), "rule__TMTCIFFormatCSFormulaField__GlobalOffsetAssignment_28");
					put(grammarAccess.getTMTCIFFormatCSFormulaFieldAccess().getFormulaAssignment_29(), "rule__TMTCIFFormatCSFormulaField__FormulaAssignment_29");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatVSField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatVSField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatVSField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatVSField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getTypeAssignment_17(), "rule__TMTCIFFormatVSField__TypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatVSField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatVSField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getConstSizeAssignment_27(), "rule__TMTCIFFormatVSField__ConstSizeAssignment_27");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getVariableSizeAssignment_28(), "rule__TMTCIFFormatVSField__VariableSizeAssignment_28");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getMaxSizeAssignment_29(), "rule__TMTCIFFormatVSField__MaxSizeAssignment_29");
					put(grammarAccess.getTMTCIFFormatVSFieldAccess().getGlobalOffsetAssignment_30(), "rule__TMTCIFFormatVSField__GlobalOffsetAssignment_30");
					put(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getFidAssignment_4(), "rule__TMTCIFFormatVRFieldSize__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getPfidAssignment_8(), "rule__TMTCIFFormatVRFieldSize__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatVRFieldSizeAccess().getNameAssignment_12(), "rule__TMTCIFFormatVRFieldSize__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatFDICField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatFDICField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatFDICField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatFDICField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getCheckTypeAssignment_17(), "rule__TMTCIFFormatFDICField__CheckTypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatFDICField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatFDICField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSizeAssignment_27(), "rule__TMTCIFFormatFDICField__SizeAssignment_27");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getFloatingOffsetAssignment_28(), "rule__TMTCIFFormatFDICField__FloatingOffsetAssignment_28");
					put(grammarAccess.getTMTCIFFormatFDICFieldAccess().getSortedFieldsToCheckAssignment_29(), "rule__TMTCIFFormatFDICField__SortedFieldsToCheckAssignment_29");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatAField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatAField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatAField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatAField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getTypeAssignment_17(), "rule__TMTCIFFormatAField__TypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatAField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatAField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getArrayDimensionAssignment_27(), "rule__TMTCIFFormatAField__ArrayDimensionAssignment_27");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getSizeAssignment_28(), "rule__TMTCIFFormatAField__SizeAssignment_28");
					put(grammarAccess.getTMTCIFFormatAFieldAccess().getGlobalOffsetAssignment_29(), "rule__TMTCIFFormatAField__GlobalOffsetAssignment_29");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getFidAssignment_4(), "rule__TMTCIFFormatAIField__FidAssignment_4");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getPfidAssignment_8(), "rule__TMTCIFFormatAIField__PfidAssignment_8");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getNameAssignment_12(), "rule__TMTCIFFormatAIField__NameAssignment_12");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getDescriptionAssignment_14_2(), "rule__TMTCIFFormatAIField__DescriptionAssignment_14_2");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getTypeAssignment_17(), "rule__TMTCIFFormatAIField__TypeAssignment_17");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getByteOrderAssignment_21(), "rule__TMTCIFFormatAIField__ByteOrderAssignment_21");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getFirstBitAssignment_25(), "rule__TMTCIFFormatAIField__FirstBitAssignment_25");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getArrayRefAssignment_27(), "rule__TMTCIFFormatAIField__ArrayRefAssignment_27");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getSizeAssignment_28(), "rule__TMTCIFFormatAIField__SizeAssignment_28");
					put(grammarAccess.getTMTCIFFormatAIFieldAccess().getLocalOffsetAssignment_29(), "rule__TMTCIFFormatAIField__LocalOffsetAssignment_29");
					put(grammarAccess.getTMTCIFFormatSizeAccess().getBytesAssignment_4(), "rule__TMTCIFFormatSize__BytesAssignment_4");
					put(grammarAccess.getTMTCIFFormatSizeAccess().getBitsAssignment_8(), "rule__TMTCIFFormatSize__BitsAssignment_8");
					put(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBytesAssignment_4(), "rule__TMTCIFFormatGlobalOffset__BytesAssignment_4");
					put(grammarAccess.getTMTCIFFormatGlobalOffsetAccess().getBitsAssignment_8(), "rule__TMTCIFFormatGlobalOffset__BitsAssignment_8");
					put(grammarAccess.getTMTCIFFormatFormulaAccess().getSlopeAssignment_4(), "rule__TMTCIFFormatFormula__SlopeAssignment_4");
					put(grammarAccess.getTMTCIFFormatFormulaAccess().getInterceptAssignment_8(), "rule__TMTCIFFormatFormula__InterceptAssignment_8");
					put(grammarAccess.getTMTCIFFormatConstSizeAccess().getBytesAssignment_4(), "rule__TMTCIFFormatConstSize__BytesAssignment_4");
					put(grammarAccess.getTMTCIFFormatConstSizeAccess().getBitsAssignment_8(), "rule__TMTCIFFormatConstSize__BitsAssignment_8");
					put(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBytesAssignment_4(), "rule__TMTCIFFormatMaxSize__BytesAssignment_4");
					put(grammarAccess.getTMTCIFFormatMaxSizeAccess().getBitsAssignment_8(), "rule__TMTCIFFormatMaxSize__BitsAssignment_8");
					put(grammarAccess.getTMTCIFFormatVariableSizeAccess().getFidRefAssignment_4(), "rule__TMTCIFFormatVariableSize__FidRefAssignment_4");
					put(grammarAccess.getTMTCIFFormatVariableSizeAccess().getUnitAssignment_8(), "rule__TMTCIFFormatVariableSize__UnitAssignment_8");
					put(grammarAccess.getTMTCIFFormatVariableSizeAccess().getPowerAssignment_10_2(), "rule__TMTCIFFormatVariableSize__PowerAssignment_10_2");
					put(grammarAccess.getTMTCIFFormatFloatingOffsetAccess().getFidRefAssignment_4(), "rule__TMTCIFFormatFloatingOffset__FidRefAssignment_4");
					put(grammarAccess.getTMTCIFFormatSortedFieldsToCheckAccess().getFieldToCheckAssignment_3(), "rule__TMTCIFFormatSortedFieldsToCheck__FieldToCheckAssignment_3");
					put(grammarAccess.getTMTCIFFormatFieldToCheckAccess().getFidRefAssignment_4(), "rule__TMTCIFFormatFieldToCheck__FidRefAssignment_4");
					put(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getFidRefAssignment_4(), "rule__TMTCIFFormatArrayDimension__FidRefAssignment_4");
					put(grammarAccess.getTMTCIFFormatArrayDimensionAccess().getMaxItemsAssignment_8(), "rule__TMTCIFFormatArrayDimension__MaxItemsAssignment_8");
					put(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBytesAssignment_4(), "rule__TMTCIFFormatLocalOffset__BytesAssignment_4");
					put(grammarAccess.getTMTCIFFormatLocalOffsetAccess().getBitsAssignment_8(), "rule__TMTCIFFormatLocalOffset__BitsAssignment_8");
					put(grammarAccess.getTMTCIFFormatArrayRefAccess().getFidRefAssignment_4(), "rule__TMTCIFFormatArrayRef__FidRefAssignment_4");
					put(grammarAccess.getTMTCIFFormatFormatAccess().getUnorderedGroup_3(), "rule__TMTCIFFormatFormat__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFORMATParser typedParser = (InternalFORMATParser) parser;
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

	public FORMATGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FORMATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
