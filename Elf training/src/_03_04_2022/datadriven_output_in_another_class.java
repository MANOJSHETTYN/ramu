package _03_04_2022;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="TestData")
public class datadriven_output_in_another_class {
	public void logintestcase(String Firstname,String Lastname,String phonenumber,String mail,String execution){
		System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(phonenumber);
		System.out.println(mail);
		System.out.println(execution);

	}
	@DataProvider (name="TestData")
	public static Object main1() throws EncryptedDocumentException, IOException {
		return working_with_multipleread.data1("Sheet2");

	}

}
