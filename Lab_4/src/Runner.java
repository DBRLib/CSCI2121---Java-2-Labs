/**
 * Runner that creates an <code>EventPlanner</code> instance,
 * manipulates it, and demonstrates that the object serialization
 * I/O of that class functions correctly.
 *
 * @author	Franklin D. Worrell, Deven Ronquillo
 * @version	12 February 2017
 * @see EventPlanner
 */ 
public class Runner {
	public static void main(String[] args) { 
		// Create the EventPlanner instance and add the prefab Events. 
		EventPlanner planner = new EventPlanner(); 
		planner.addEvents(); 
		planner.printEvents(); 
		
		// Save the EventPlanner instance's events. 
		planner.openOutputStream();
		planner.writeObjects();
		planner.closeOutputStream();
		
		// Empty the EventPlanner and print it to prove it is empty. 
		planner.clearSchedule();
		planner.printEvents();
		
		// Read in the saved Events. 
		planner.openInputStream();
		planner.readObjects();
		planner.closeInputStream();
		
		// Print the EventPlanner's Events to prove reading worked. 
		planner.printEvents();
	} // end method main
} // end class Runner