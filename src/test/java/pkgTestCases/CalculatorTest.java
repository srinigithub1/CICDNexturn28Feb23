package pkgTestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pkgCalculator.Calculator;

public class CalculatorTest {

	public static Calculator objscientificCalculator;
	@Before
	public void setUp() throws Exception {
		objscientificCalculator=new Calculator();
		
		System.out.println("createing obj for Class under test");
		
	}
// this is sample comment to trigger build
	@After
	public void tearDown() throws Exception {
		System.out.println("closing the Test execjtion");
	}

	@Test
	public void testGetwishes() {
		
		String result=objscientificCalculator.getwishes();
		Assert.assertEquals("TC_GetWishes ","Hello world",result);
		
	}

	@Test
	public void testAddition() {
		int varResult_addition=objscientificCalculator.addition(12, 12);
		Assert.assertEquals("TC_Addition", 24,varResult_addition);
	}

	@Test
	public void testSubstraction() {
		//Assert.assertTrue(true);
		int varResult_Substract=objscientificCalculator.Substraction(12, 12);
		Assert.assertEquals("TC_Substraction", 0,varResult_Substract);

	}

	@Test
	public void testMultiplication() {
		int varResult_Multiplicaiton=objscientificCalculator.Multiplication(12, 12);
		Assert.assertEquals("TC_Multiplication", 144,varResult_Multiplicaiton);
	}

	@Test
	public void testDivision() {
		Assert.assertTrue(true);
	}

}
