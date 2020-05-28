import java.util.ArrayList; 
import java.util.Arrays; 
import org.junit.Before;
import org.junit.Test; 
import static org.junit.Assert.assertEquals; 

/**
 * A JUnit test class for class SelectionSort.
 * 
 * @author	Franklin D. Worrell
 * @version	26 March 2017
 */ 
public class SelectionSortTest {
	// Test fixture instances. 
	ArrayList<String> strings; 
	ArrayList<Integer> integers; 
	ArrayList<Character> characters;
	ArrayList<String> oneElement; 
	
	// Arrays used to initialize text fixture. 
	String[] stringsArray = {"hello", "goodbye", "try", "fun", "!", "#!", 
							 "coding", "Java", "C++", "Try", "AWESOME"};
	int[] intsArray = {-1212, 13, 7, 7896, 10192, 4573625, -12, -1, 0, 1, 18};
	char[] charsArray = {'a', 'b', 'c', 'd'};
	
	
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
		
		// Initialize and populate the ArrayList of Characters.
		characters = new ArrayList<Character>(); 
		for (int i = 0; i < charsArray.length; i++) {
			characters.add(charsArray[i]); 
		} 
		
		// Initialize and populate the single element ArrayList of Strings.
		oneElement = new ArrayList<String>(); 
		oneElement.add("bye"); 
	} // end method setup
	
	
	/**
	 * Tests the selectionSort method of <code>SelectionSort</code>.
	 */ 
	@Test
	public void testSelectionSort() {
		/* Tests with the ArrayList<String>. */ 
		SelectionSort.sort(strings); 
		Arrays.sort(stringsArray); 
		for (int i = 0; i < strings.size(); i++) {
			assertEquals(stringsArray[i], strings.get(i)); 
		} 
		
		/* Tests with the ArrayList<Integer>. */ 
		SelectionSort.sort(integers); 
		Arrays.sort(intsArray); 
		for (int i = 0; i < integers.size(); i++) {
			assertEquals((Integer) intsArray[i], integers.get(i)); 
		} 
		
		/* Tests with presorted ArrayList<Characters>. */ 
		SelectionSort.sort(characters); 
		for (int i = 0; i < characters.size(); i++) {
			assertEquals((Character) charsArray[i], characters.get(i)); 
		} 
		
		/* Test with ArrayList<String> with a single element. */ 
		SelectionSort.sort(oneElement); 
		assertEquals("bye", oneElement.get(0)); 
	} // end method testSelectionSort
} // end class SelectionSortTest