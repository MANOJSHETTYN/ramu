package _03_04_2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class working_with_multipleread {

	public static  Object[][] data1(String string) throws EncryptedDocumentException, IOException {
		File file=new File("./testdata/Book1.xlsx");
		FileInputStream fls=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fls);
		Sheet sheet=wb.getSheet("Register");                 //you can write Sheet 2

		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data=new Object[rowcount-1][colcount];
		for (int i=1;i<rowcount;i++){
			for(int j=0;j<colcount;j++){
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		/*for (int i=0;i<rowcount;i++){              //you can remove this for loop to execute datadriven_output_in_another_class
			for(int j=0;j<colcount;j++){
				System.out.println(data[i][j]);
			}
		}*/
		return data;

	}

	

}
