package _03_04_2022;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class methodoverloading_datadriven {
	@DataProvider
	public  Object[][] testdata() {
		Object[][] data=new Object[2][2];
		
	data[0][0]="test";
	data[0][1]="yantra";
	
	data[1][0]="test";
	data[1][1]="yantra";
	
	return data;
}
	@DataProvider
	public  Object[][] testdata1() {
		Object[][] data=new Object[2][2];
		
	data[0][0]=1;
	data[0][1]=2;
	
	data[1][0]=3;
	data[1][1]=4;
	
	return data;
}
	@DataProvider
	public  Object[][] testdata2() {
		Object[][] data=new Object[2][2];
		
	data[0][0]=true;
	data[0][1]=false;
	
	data[1][0]=true;
	data[1][1]=false;
	
	return data;
}
	@Test(dataProvider="testdata")
	public void test(String s1,String s2){
		System.out.println("s1"+" "+s1+" s2 "+s2);
	}
	@Test(dataProvider="testdata1")
	public void test1(int s1,int s2){
		System.out.println("s1"+" "+s1+" s2 "+s2);
	}
	@Test(dataProvider="testdata2")
	public void test2(boolean s1,boolean s2){
		System.out.println("s1"+" "+s1+" s2 "+s2);
	}

}
