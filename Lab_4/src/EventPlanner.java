import java.io.*;
import java.util.ArrayList;

/**
 * Stores a set of <code>Events</code> in an 
 * <code>ArrayList</code> for processing and 
 * printing. Allows the <code>Events</code> 
 * to be serialized and stored to a file for
 * saving them between runs of the program.  
 *
 * @author	deven ronquillo
 * @version	13/2/17
 * @see	Event
 * @see Runner
 */ 
public class EventPlanner {
	ArrayList<Event> events; 						// List of Events to process.
	ObjectOutputStream serializationOutput = null; 	// Streams for serialization.
	ObjectInputStream deserializationInput = null;
	
	
	/**
	 * Constructor initializes the ArrayList of Events and 
	 * leaves it empty.
	 */ 
	public EventPlanner() {
		this.events = new ArrayList<Event>();
	} // end constructor

	
	/**
	 * Adds two precreated Event instances to the ArrayList.
	 */ 
	public void addEvents() {
        this.events.add(new Event( "Redmann's Party", "2014-03-03 22:00", "Redmann's House", "Come pass a good time" ));
        this.events.add(new Event( "CSCI 2120 Test", "2014-03-24 16:30", "MATH 226", "2nd Test" ));		
	} // end method addEvents
	
	
	/**
	 * Prints the EventPlanner instance's contents.
	 */ 
	public void printEvents() {
		// Planner is empty, inform the user. 
		if (this.events.size() < 1) {
			System.out.println("Planner is empty."); 
		} 
		
		// Otherwise print the Events. 
		else {
			for (Event event : this.events) {
				System.out.println(event.toString());
				System.out.println(); 
			}
		}
	} // end method printEvents
	
	
	/**
	 * Clears all the Events from this. 
	 */ 
	public void clearSchedule() {
		this.events.clear(); 
	} // end method clearSchedule
	
	
	/**
	 * Opens an ObjectOutputStream to serialize the contents
	 * of the ArrayList of Events.
	 */ 
	public void openOutputStream() {
		/* Stubbed */

		try{

			serializationOutput = new ObjectOutputStream(new FileOutputStream("myEvents.ser"));
		}
		catch(IOException e){

			System.out.println("Error in file open.");
			System.exit(1);//exit one denotes termination due to error
		}
	} // end method openOutputStream 
	
	
	/**
	 * Serializes the Events in the ArrayList and writes 
	 * them to the ObjectOutputStream.
	 */ 
	public void writeObjects() {
		/* Stubbed */

		try{

			for(Event event : events){

				serializationOutput.writeObject(event);
			}
		}
		catch(IOException e){

			System.out.println("Error in file write.");
			System.exit(1);
		}
		catch(NullPointerException e){

			System.out.println("outputstream not opened.");
			System.exit(1);
		}
	} // end method writeObjects 
	
	
	/**
	 * Closes the ObjectOutputStream.
	 */ 
	public void closeOutputStream() {
		/* Stubbed */

		try{

			serializationOutput.close();
		}
		catch(NullPointerException e){

			System.out.println("outputstream not opened.");
			System.exit(1);
		}
		catch (IOException e){

			System.out.println("Error in file close.");
			System.exit(1);
		}
	} // end method closeOutputStream
	
	
	/**opens a stream to prepare to read in the specified file.
	 * 
	 */ 
	public void openInputStream() {
		/* Stubbed */

		try{

			deserializationInput = new ObjectInputStream(new FileInputStream("myEvents.ser"));
		}
		catch(IOException e){

			System.out.println("Error in file open.");
			System.exit(1);

		}
	} // end method openInputStream
	
	
	/** uses the input stream to read data from the specified file then sort it into an arraylist.
	 * 
	 */ 
	public void readObjects() {
		/* Stubbed */

		try{

			while(true){

				events.add((Event) deserializationInput.readObject());
			}
		}
		catch(NullPointerException e){

			System.out.println("input stream closed");
			System.exit(1);
		}
		catch(EOFException e){

			System.out.println("Events read properly.");
		}
		catch(ClassNotFoundException e){

			System.out.println("Error in object cast.");
			System.exit(1);
		}
		catch(IOException e){

			System.out.println("Error in file read-in.");
			System.exit(1);
		}
	} // end method readObjects
	
	
	/**closes the inputstream used to read in the ser. data
	 * 
	 */ 
	public void closeInputStream() {
		/* Stubbed */

		try{

			deserializationInput.close();
		}
		catch (NullPointerException e){

			System.out.println("input stream closed.");
			System.exit(1);
		}
		catch (IOException e){

			System.out.println("error in file closing");
			System.exit(1);
		}
	} // end method closeInputStream
} // end class Calendar