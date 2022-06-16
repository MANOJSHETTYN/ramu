package _03_04_2022;

import org.testng.annotations.Test;

public class Sample_class {

	@Test
	public static void sports() {
		System.out.println("crickrt");
		System.out.println("Football");
		System.out.println("Kabadi");
	}
	@Test(groups="regression")
	public static void movies(){
		System.out.println("charlie 777");
		System.out.println("Rajakumara");
		System.out.println("KGF-2");
		//int a=1/0;
	}
	@Test(groups="smoke")
	public static void states(){
		System.out.println("karnataka");
		System.out.println("Andrapradesh");
		System.out.println("Tamilnadu");
	}
	
	@Test(enabled=false)
	public static void district(){
		System.out.println("bengaluru");
		System.out.println("mysore");
		System.out.println("Madikeri");
	}
	
	@Test
	public static void countries(){
		System.out.println("India");
		System.out.println("London");
		System.out.println("India");

	}

}
