import org.junit.*;
import static org.junit.Assert.*; 

/**
 * A test class for the methods written in the recursion lab.
 * All three methods should be static methods of a class named
 * Recursion. The method names and signatures can be inferred 
 * from the calls made in the tests below. 
 *
 * @author	Franklin D. Worrell, Deven Ronquillo
 * @version	10 September 2016
 */ 
public class RecursionTest {
	// No test fixture is initialized, because we're working 
	// with primitives and simple arithmetic operations. 
	
	/**
	 * Tests the factorial method of class Recursion. Edge cases 
	 * include the base cases. 
	 */ 
	/*@Test
	public void testFactorial() {
		assertEquals(1, Recursion.factorial(0)); 
		assertEquals(1, Recursion.factorial(1)); 
		assertEquals(6, Recursion.factorial(3)); 
		assertEquals(120, Recursion.factorial(5)); 
		assertEquals(362880, Recursion.factorial(9)); 
		// Highest factorial that will not overflow int data type. 
		assertEquals(479001600, Recursion.factorial(12));
	} // end method testFactorial

	*/
	
	
	/**
	 * Tests the fibonacci method of class Recursion. Edge cases
	 * include the base cases. 
	 */ 
/*	@Test
	public void testFibonacci() {
		assertEquals(0, Recursion.fibonacci(0)); 
		assertEquals(1, Recursion.fibonacci(1)); 
		assertEquals(5, Recursion.fibonacci(5)); 
		assertEquals(144, Recursion.fibonacci(12)); 
		assertEquals(75025, Recursion.fibonacci(25)); 
		assertEquals(14930352, Recursion.fibonacci(36)); 
		// Largest Fibonacci number that will not overflow int type.
		// Be sure to comment this out before submitting your work. 
//		assertEquals(1836311903, Recursion.fibonacci(46)); 
	} // end method testFibonacci
*/
	
	/**
	 * Tests the tailFactorial method of class Recursion. Edge 
	 * cases include the base cases. 
	 */ 
	@Test
	public void testTailFactorial() {
		assertEquals(1, Recursion.tailFactorial(0)); 
		assertEquals(1, Recursion.tailFactorial(1)); 
		assertEquals(6, Recursion.tailFactorial(3)); 
		assertEquals(5040, Recursion.tailFactorial(7)); 
		assertEquals(3628800, Recursion.tailFactorial(10)); 
		// Highest factorial that will not overflow int data type. 
		assertEquals(479001600, Recursion.tailFactorial(12));
	} // end method testTailFactorial
} // end class RecursionTest