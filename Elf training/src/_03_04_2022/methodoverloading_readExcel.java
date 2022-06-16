package _03_04_2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class methodoverloading_readExcel {

	public static String read(String sheet1,int row,int column) throws EncryptedDocumentException, IOException {
		File file=new File("./testdata/Book1.xlsx");
		FileInputStream fls=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fls);
		Sheet sheet11=wb.getSheet("Sheet1");
        return sheet11.getRow(row).getCell(column).getStringCellValue();  
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		System.out.println(methodoverloading_readExcel.read("Sheet1", 0,0));
		System.out.println(methodoverloading_readExcel.read("Sheet1", 0,1));

		System.out.println(methodoverloading_readExcel.read("Sheet1", 0,2));

	}

}
