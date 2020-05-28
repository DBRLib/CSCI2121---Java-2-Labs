import org.junit.Before; 			// import JUnit types for annotations
import org.junit.Test;
import static org.junit.Assert.*; 	// import JUnit methods for testi

/**  
 * A test class for a few of the methods of 
 * Java’s <code>String</code> class.  
 *  
 * @author  Franklin D. Worrell, Deven Ronquillo  
 * @version 11 January 2017
 */ 
public class StringTest {
    // The Strings to test. 
    private String letters; 		// a simple string of letters
    private String numbers; 		// a simple string of numbers
    private String empty; 			// edge case: the empty string
    private String simpleSentence; 	// a simple sentence
    private String complexSentence; // a sentence containing several punction marks
    
	/**
	 * Initializes test fixtures before each test
	 * is run. 
	 */ 
    @Before
    public void setUp() {
        letters = new String("abcdefg"); 
        numbers = new String("1234567"); 
        empty = new String(""); 
        simpleSentence = new String("This is a sentence.\n"); 
        complexSentence = new String("%Punctuation!, Can cr\te8 <problems.$"); 
    } // end method setUp
    
	/**
	 * Tests the <code>length()</code> method of 
	 * <code>String</code>.
	 */ 
    @Test
    public void testLength() {
        assertTrue(letters.length() == 7); 
        assertTrue(numbers.length() == 7); 
        assertTrue(empty.length() == 0); 
        assertTrue(simpleSentence.length() == 20); 
        assertTrue(complexSentence.length() == 36);
    } // end method testLength
    
	/**
	* Tests <code>String</code> class’s <code>equals()</code> 
	* method.
	*/
	@Test
	public void testEquals() {
		assertTrue(letters.equals("abcdefg"));
		assertTrue(numbers.equals("1234567"));
		assertTrue(empty.equals(""));
		assertTrue(simpleSentence.equals("This is a sentence.\n"));
		assertTrue(complexSentence.equals("%Punctuation!, Can cr\te8 <problems.$"));
	} // end method testEquals

	/**
	 * Tests the <code>toLowerCase</code> method of 
	 * <code>String</code>. 
	 */ 
	@Test
    public void testToLowerCase() {
		assertEquals("abcdefg", letters.toLowerCase());
		assertEquals("1234567", numbers.toLowerCase());
		assertEquals("", empty.toLowerCase());
		assertEquals("this is a sentence.\n", simpleSentence.toLowerCase());
		assertEquals("%punctuation!, can cr\te8 <problems.$", complexSentence.toLowerCase());
    } // end method testToLowerCase
} // end class TestString