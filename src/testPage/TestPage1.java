package testPage;

import org.testng.annotations.Test;

public class TestPage1 {

	
	@Test
	public void method1()
	{
		String s1 = "Sumit";
		String s2 = "Todkare";
		System.out.println("First Name: "+s1);
		System.out.println("Last Name: "+s2);
		String FullName = s1.concat(s2);
		System.out.println("Full Name: "+FullName);
		
	}
	
}
