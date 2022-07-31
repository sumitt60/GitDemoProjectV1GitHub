package package2;

import org.testng.annotations.Test;

public class Package2Test {
	
	

	@Test
	public void TestMethod()
	{
		int count = 0;
		for(int i =  0; i<=10; i++)
		{
		System.out.println("Say Hi!");
		count = count+1;
		//System.out.println(count);
		}
		System.out.println(count);
		//return count;
	}
	
}
