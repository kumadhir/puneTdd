package test.java;

import main.java.Largest;
import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testPositive1()
	{
		int arr[]= {8,7,9,6,5};
		Largest large = new Largest();
		assertEquals(9, large.FindLargest(arr));
	}
	public void testPositive2()
	{
		int arr[]= {8,7,9,6,5,11,2};
		Largest large = new Largest();
		assertEquals(11, large.FindLargest(arr));
	}
	public void testPositive3()
	{
		int arr[]= {-8,-7,-9,-6,-5};
		Largest large = new Largest();
		assertEquals(-5, large.FindLargest(arr));
	}

}
