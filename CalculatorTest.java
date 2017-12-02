import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	@BeforeClass
	public static void beforeClassMethod()
	{
		System.out.println("Inside Before Class");
	}
	@AfterClass
	public static void afterClassMethod()
	{
		System.out.println("Inside After Class");
	}
	
	@Before
	public void beforeMethod()
	{
		System.out.println("Inside before method");
	}

	@After
	public void afterMethod()
	{
		System.out.println("Inside after method");
	}
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		int actual=c.add(3,7);
		int expected=10;
		assertEquals(actual,expected);
		System.out.println("Inside testAdd method");
		
	}
	@Test
	public void testIsPositive()
	{
		Calculator c=new Calculator();
		assertTrue(c.isPositive(4));
		assertFalse(c.isPositive(-3));
		System.out.println("Inside testIsPositive method");
	}

}
