package package3Test;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class Package3TestClass {
	
	@Test
	public void testMethod()
	{
	
		int[] inputNumbers = new int[11];
		ArrayList numbersList = new ArrayList<>();
		
		for(int i = 0; i<=10; i++)
		{
			inputNumbers[i] = i+1;
			System.out.println(inputNumbers[i]);
			
			Collections.addAll(numbersList, inputNumbers[i]);
			
			
		}
		
		System.out.println(numbersList);
		

	}

}
