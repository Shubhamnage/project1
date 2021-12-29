package Utility.java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import ConfigrationClass.cp;
import POM1.ConP;

public class Excel {

	
	public String excel(int row, int colum) throws EncryptedDocumentException, IOException {

		FileInputStream f = new FileInputStream(cp.excelJeroda);
		Sheet file = WorkbookFactory.create(f).getSheet("sheet");
		CellType datatype = file.getRow(row).getCell(colum).getCellType();

		String a;
		if (datatype == CellType.STRING) {
			a = file.getRow(row).getCell(colum).getStringCellValue();

		} else {
			long numv = (long) file.getRow(row).getCell(colum).getNumericCellValue();
			a= Long.toString(numv);

		}
		return a;
	
}
