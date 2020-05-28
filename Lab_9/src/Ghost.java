/**
 * A class that models the behavior of a ghost. It will
 * be wrapped by Geist.java to illustrate the Adapter
 * design pattern.
 *
 * @author	Franklin D. Worrell
 * @revised	31 October 2016
 */ 
public class Ghost {
	private String name; 
	
	/**
	 * Creates a new Ghost instance with the name passed
	 * as argument.
	 *
	 * @param	name	the Ghost's name
	 */ 
	public Ghost(String name) {
		this.name = name; 
	} // end constructor
	
	/**
	 * Allows this to half-heartedly creep out the user. 
	 */ 
	public void haunt() {
		System.out.println("Wooooo...wooooo..."); 
	} // end method haunt
	
	/**
	 * Allows this to startle the user. 
	 */ 
	public void scare() {
		System.out.println("BOOOO!!!");
	} // end method scare
} // end class Ghost