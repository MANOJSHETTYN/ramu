package _03_04_2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven_Testing {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testdata/Book1.xlsx");
		FileInputStream fls=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fls);
		Sheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(3).getCell(2).getNumericCellValue());
		System.out.println(sheet.getRow(1).getCell(3).toString());
		
		

	}

}
