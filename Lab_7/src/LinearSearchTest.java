import java.util.ArrayList; 
import org.junit.Before;
import org.junit.Test; 
import static org.junit.Assert.assertEquals; 

/**
 * A JUnit test class for class LinearSearch.
 * @author	Franklin D. Worrell
 * @revised	2 October 2016 at 9:47
 */ 
public class LinearSearchTest {
	// Test fixture instances. 
	ArrayList<String> strings; 
	ArrayList<Integer> integers; 
	
	// Arrays used to initialize text fixture. 
	String[] stringsArray = {"hello", "goodbye", "try", "fun", "!", "#!", 
							 "coding", "Java", "C++", "Try", "AWESOME"};
	int[] intsArray = {-1212, 13, 7, 7896, 10192, 4573625, -12, -1, 0, 1, 18}; 
	
	
	/**
	 * Initializes the test fixture of ArrayLists with the elements contained
	 * the String[] and int[] class variables.
	 */ 
	@Before
	public void setup() {
		// Initialize and populate the ArrayList of Strings. 
		strings =  new ArrayList<String>(); 
		for (int i = 0; i < stringsArray.length; i++) {
			strings.add(stringsArray[i]); 
		} 
		
		// Initialize and populate the ArrayList of Integers. 
		integers = new ArrayList<Integer>(); 
		for (int i = 0; i < intsArray.length; i++) {
			integers.add(intsArray[i]); 
		} 
	} // end method setup
	
	
	/**
	 * Tests the linearSearch method of LinearSearch.
	 */ 
	@Test
	public void testLinearSearch() {
		/* Tests with the ArrayList<String>. */ 
		assertEquals(4, LinearSearch.linearSearch(strings, stringsArray[4])); 
		assertEquals(-1, LinearSearch.linearSearch(strings, "me")); 
		assertEquals(0, LinearSearch.linearSearch(strings, stringsArray[0])); 
		assertEquals(8, LinearSearch.linearSearch(strings, "C++")); 
		assertEquals(-1, LinearSearch.linearSearch(strings, "awesome")); 
		
		/* Tests with the ArrayList<Integer>. */ 
		assertEquals(-1, LinearSearch.linearSearch(integers, -7)); 
		assertEquals(0, LinearSearch.linearSearch(integers, -1212)); 
		assertEquals(4, LinearSearch.linearSearch(integers, intsArray[4])); 
		assertEquals(10, LinearSearch.linearSearch(integers, 18)); 
		assertEquals(8, LinearSearch.linearSearch(integers, intsArray[8])); 
	} // end method testLinearSearch
} // end class LinearSearchTest