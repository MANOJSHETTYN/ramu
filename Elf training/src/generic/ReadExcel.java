package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
        static File file=new File("./testdata/TestData.xlsx");
        static FileInputStream fis;
        static Workbook workbook;
        static Sheet sheet;
         
	public static String readStringvalue(String sheetname,int RowNum,int ColNum) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	}
	public static double readNumberValue(String sheetname,int RowNum,int ColNum) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
	}
	public static Date readDatevalue(String sheetname,int RowNum,int ColNum) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(RowNum).getCell(ColNum).getDateCellValue();
	}
	public static boolean readBooleanvalue(String sheetname,int RowNum,int ColNum) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream(file);
		workbook=WorkbookFactory.create(fis);
		sheet=workbook.getSheet(sheetname);
		return sheet.getRow(RowNum).getCell(ColNum).getBooleanCellValue();
	}
}
