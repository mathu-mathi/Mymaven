package utilis;

import java.io.File;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import constants.FileConstants;

public class ExcelUtils {
	public static String[] readLoginTestData(int row) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException 
	{
	
	XSSFWorkbook loginWorkBook = new XSSFWorkbook(new File(FileConstants.LOGIN_TESTDATA_FILE_PATH));
	XSSFSheet loginCreds = loginWorkBook.getSheet("UserCredentials");
	XSSFRow rows = loginCreds.getRow(row);
	String[] creds = new String[rows.getLastCellNum()];
	for(int ro = row; ro <= rows.getLastCellNum(); ro++) {
		creds[ro] = rows.getCell(ro+1).getStringCellValue();
	}
	
	return creds;
}
}

