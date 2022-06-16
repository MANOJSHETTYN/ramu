package _03_04_2022;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class creating_data_in_excel {
	@Test(dataProvider="TestData")

	public void Logintestcases(String fn,String Ln, String surname) {
		System.out.println("Sn"+" "+surname);
		System.out.println("fn"+" "+fn);
		System.out.println("Ln"+" "+Ln);
		//System.out.println("Sn"+" "+surname);
	}


	@DataProvider(name="TestData")
	public Object[][] datap(){
		Object[][] data=new Object[3][3];
		data[0][0]="ram";
		data[0][1]="shetty ";
		data[0][2]="mr";
		data[1][0]="gouthum";
		data[1][1]="reddy";
		data[1][2]="mr";
		data[2][0]="naveev";
		data[2][1]="gowda";
		data[2][2]="mr";
		return data;
	}
//throws EncryptedDocumentException, IOException
}
