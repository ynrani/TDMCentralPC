/*---------------------------------------------------------------------------------------
 * Object Name: SearchPolicyRecordOutputListExcel.Java
 * 
 * Modification Block:
 * --------------------------------------------------------------------------------------
 * S.No. Name                Date      Bug Fix no. Desc
 * --------------------------------------------------------------------------------------
 * 1     Seshadri Chowdary          3/09/15  NA          Created
 * --------------------------------------------------------------------------------------
 *
 * Copyright: 2015 <CapGemini>
 *---------------------------------------------------------------------------------------*/
package com.tdm.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.tdm.constant.AppConstant;
import com.tdm.constant.MessageConstant;
import com.tdm.model.DTO.TdmPolicySearchResultDTO;

/**
 * 
 * @author Seshadri Chowdary
 *
 */
public class SearchPolicyRecordOutputListExcel extends AbstractExcelView
{
	private static Logger logger = Logger.getLogger(SearchPolicyRecordOutputListExcel.class);

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		logger.info(MessageConstant.TDM_EXCEL_POLICY + MessageConstant.TDM_EXCEL_BUILD
				+ MessageConstant.LOG_INFO_PARAMS_NO);
		HSSFSheet excelSheet = workbook.createSheet(MessageConstant.TDM_EXCEL_POLICY_REC);
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.LIME.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		HSSFFont font = workbook.createFont();
		font.setColor(HSSFColor.DARK_TEAL.index);
		style.setFont(font);
		HSSFCellStyle style2 = workbook.createCellStyle();
		style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		setExcelHeader(excelSheet, style);
		@SuppressWarnings(AppConstant.UNCHECKED)
		List<TdmPolicySearchResultDTO> searchProviderOutputList = (List<TdmPolicySearchResultDTO>) model
				.get(MessageConstant.TDM_POLICY_RESULT_EXPO_DTOS);
		setExcelRows(excelSheet, searchProviderOutputList, style2);
	}

	public void setExcelHeader(HSSFSheet excelSheet, HSSFCellStyle style) {
		logger.info(MessageConstant.TDM_EXCEL_POLICY + MessageConstant.TDM_EXCEL_SET_HEADER
				+ MessageConstant.LOG_INFO_PARAMS_NO);
		HSSFRow excelHeader = excelSheet.createRow(2);
		excelSheet.setDisplayGridlines(false);
		excelHeader = excelSheet.createRow(2);
		excelHeader.createCell(0).setCellValue("User ID ");
		excelHeader = excelSheet.createRow(4);
		excelHeader.createCell(2).setCellValue("Policy Number");
		excelHeader.createCell(3).setCellValue("Company");
		excelHeader.createCell(4).setCellValue("Product Name");
		excelHeader.createCell(5).setCellValue("Face Amount");
		excelHeader.createCell(6).setCellValue("Insured First Name");
		excelHeader.createCell(7).setCellValue("Insured Last Name");
		excelHeader.createCell(8).setCellValue("SSN");
		excelHeader.createCell(9).setCellValue("Gender");

		excelHeader.createCell(10).setCellValue("Date of Birth");
		excelHeader.createCell(11).setCellValue("Distribution Channel");
		excelHeader.createCell(12).setCellValue("Agent ID");
		excelHeader.createCell(13).setCellValue("Riders");
		excelHeader.createCell(14).setCellValue("Benefits");
		excelHeader.createCell(15).setCellValue("Owner");
		excelHeader.createCell(16).setCellValue("Beneficiary");
		excelHeader.createCell(17).setCellValue("Payment Mode");
		excelHeader.createCell(18).setCellValue("Payment Method");

		excelHeader.createCell(0).setCellValue("Test Case Id");
		excelHeader.createCell(1).setCellValue("Test Case Name");

		excelHeader.getCell(0).setCellStyle(style);
		excelHeader.getCell(1).setCellStyle(style);
		excelHeader.getCell(2).setCellStyle(style);
		excelHeader.getCell(3).setCellStyle(style);
		excelHeader.getCell(4).setCellStyle(style);
		excelHeader.getCell(5).setCellStyle(style);
		excelHeader.getCell(6).setCellStyle(style);
		excelHeader.getCell(7).setCellStyle(style);
		excelHeader.getCell(8).setCellStyle(style);
		excelHeader.getCell(9).setCellStyle(style);

		excelHeader.getCell(10).setCellStyle(style);
		excelHeader.getCell(11).setCellStyle(style);
		excelHeader.getCell(12).setCellStyle(style);
		excelHeader.getCell(13).setCellStyle(style);
		excelHeader.getCell(14).setCellStyle(style);
		excelHeader.getCell(15).setCellStyle(style);
		excelHeader.getCell(16).setCellStyle(style);
		excelHeader.getCell(17).setCellStyle(style);
		excelHeader.getCell(18).setCellStyle(style);

		excelSheet.autoSizeColumn(0);
		excelSheet.autoSizeColumn(1);
		excelSheet.autoSizeColumn(2);
		excelSheet.autoSizeColumn(3);
		excelSheet.autoSizeColumn(4);
		excelSheet.autoSizeColumn(5);
		excelSheet.autoSizeColumn(6);
		excelSheet.autoSizeColumn(7);
		excelSheet.autoSizeColumn(8);
		excelSheet.autoSizeColumn(9);
		excelSheet.autoSizeColumn(10);
		excelSheet.autoSizeColumn(11);
		excelSheet.autoSizeColumn(12);
		excelSheet.autoSizeColumn(13);
		excelSheet.autoSizeColumn(14);
		excelSheet.autoSizeColumn(15);
		excelSheet.autoSizeColumn(16);
		excelSheet.autoSizeColumn(17);
		excelSheet.autoSizeColumn(18);
	}

	public HSSFColor setColor(HSSFWorkbook workbook, byte r, byte g, byte b) {
		logger.info(MessageConstant.TDM_EXCEL_POLICY + MessageConstant.TDM_EXCEL_SET_COLOR
				+ MessageConstant.LOG_INFO_PARAMS_NO);
		HSSFPalette palette = workbook.getCustomPalette();
		HSSFColor hssfColor = null;
		try {
			hssfColor = palette.findColor(r, g, b);
			if (hssfColor == null) {
				palette.setColorAtIndex(HSSFColor.LAVENDER.index, r, g, b);
				hssfColor = palette.getColor(HSSFColor.LAVENDER.index);
			}
		} catch (Exception ex) {
			logger.error(MessageConstant.TDM_EXCEL_POLICY + MessageConstant.TDM_EXCEL_SET_COLOR
					+ MessageConstant.LOG_INFO_PARAMS_NO + ex);
		}
		return hssfColor;
	}

	public void setExcelRows(HSSFSheet excelSheet,
			List<TdmPolicySearchResultDTO> searchProviderOutputList, HSSFCellStyle style) {
		logger.info(MessageConstant.TDM_EXCEL_POLICY + MessageConstant.TDM_EXCEL_SET_ROWS
				+ MessageConstant.LOG_INFO_PARAMS_NO);
		int record = 5;
		for (TdmPolicySearchResultDTO tdmPolicySearchResultDTO : searchProviderOutputList) {
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(2).setCellValue(tdmPolicySearchResultDTO.getPolicyNo());
			excelRow.createCell(3).setCellValue(tdmPolicySearchResultDTO.getCompanyName());
			excelRow.createCell(4).setCellValue(tdmPolicySearchResultDTO.getProductName());
			excelRow.createCell(5).setCellValue(tdmPolicySearchResultDTO.getFaceAmt());
			excelRow.createCell(6).setCellValue(tdmPolicySearchResultDTO.getFristName());
			excelRow.createCell(7).setCellValue(tdmPolicySearchResultDTO.getLastName());
			excelRow.createCell(8).setCellValue(tdmPolicySearchResultDTO.getSsn());
			excelRow.createCell(9).setCellValue(tdmPolicySearchResultDTO.getGender());

			excelRow.createCell(10).setCellValue(tdmPolicySearchResultDTO.getDob());
			excelRow.createCell(11).setCellValue(tdmPolicySearchResultDTO.getDistChnal());
			excelRow.createCell(12).setCellValue(tdmPolicySearchResultDTO.getAgentId());
			excelRow.createCell(13).setCellValue(tdmPolicySearchResultDTO.getRiders());
			excelRow.createCell(14).setCellValue(tdmPolicySearchResultDTO.getBenefits());
			excelRow.createCell(15).setCellValue(tdmPolicySearchResultDTO.getOwner());
			excelRow.createCell(16).setCellValue(tdmPolicySearchResultDTO.getBeneficiary());
			excelRow.createCell(17).setCellValue(tdmPolicySearchResultDTO.getPaymentMode());
			excelRow.createCell(18).setCellValue(tdmPolicySearchResultDTO.getPaymentMethod());

			excelRow.createCell(0).setCellValue(tdmPolicySearchResultDTO.getTestCaseId());
			excelRow.createCell(1).setCellValue(tdmPolicySearchResultDTO.getTestCaseName());

			excelRow.getCell(0).setCellStyle(style);
			excelRow.getCell(1).setCellStyle(style);
			excelRow.getCell(2).setCellStyle(style);
			excelRow.getCell(3).setCellStyle(style);
			excelRow.getCell(4).setCellStyle(style);
			excelRow.getCell(5).setCellStyle(style);
			excelRow.getCell(6).setCellStyle(style);
			excelRow.getCell(7).setCellStyle(style);
			excelRow.getCell(8).setCellStyle(style);
			excelRow.getCell(9).setCellStyle(style);

			excelRow.getCell(10).setCellStyle(style);
			excelRow.getCell(11).setCellStyle(style);
			excelRow.getCell(12).setCellStyle(style);
			excelRow.getCell(13).setCellStyle(style);
			excelRow.getCell(14).setCellStyle(style);
			excelRow.getCell(15).setCellStyle(style);
			excelRow.getCell(16).setCellStyle(style);
			excelRow.getCell(17).setCellStyle(style);
			excelRow.getCell(18).setCellStyle(style);
			excelSheet.autoSizeColumn(0);
			excelSheet.autoSizeColumn(1);
			excelSheet.autoSizeColumn(2);
			excelSheet.autoSizeColumn(3);
			excelSheet.autoSizeColumn(4);
			excelSheet.autoSizeColumn(5);
			excelSheet.autoSizeColumn(6);
			excelSheet.autoSizeColumn(7);
			excelSheet.autoSizeColumn(8);
			excelSheet.autoSizeColumn(9);
			excelSheet.autoSizeColumn(10);
			excelSheet.autoSizeColumn(11);
			excelSheet.autoSizeColumn(12);
			excelSheet.autoSizeColumn(13);
			excelSheet.autoSizeColumn(14);
			excelSheet.autoSizeColumn(15);
			excelSheet.autoSizeColumn(16);
			excelSheet.autoSizeColumn(17);
			excelSheet.autoSizeColumn(18);

		}
	}
}
