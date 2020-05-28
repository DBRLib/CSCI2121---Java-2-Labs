import java.io.*;
import java.util.ArrayList;

/**
 * Creates instance of Event and stores them as local 
 * variables in main. Reads text from file, parses it, 
 * and creates Events based on it. Writes Events out 
 * to a text file. 
 *
 * @author	Deven Ronquillo
 * @version	7/2/2017
 */ 
public class EventTextProcessor {
    public static void main(String[] args) {
		ArrayList<Event> events = new ArrayList<Event>(); // List of Events to process.

		BufferedReader input = null;
		FileReader inputFile = null;

		BufferedWriter output = null;
		FileWriter outputFile = null;

		
		// Add two new events to the Calendar. 
        events.add(new Event( "Redmann's Party", "2014-03-03 22:00", "Redmann's House", "Come pass a good time" ));
        events.add(new Event( "CSCI 2120 Test", "2014-03-24 16:30", "MATH 226", "2nd Test" ));
		
		/* Create Events from info contained in a text file. */ 
		//Open a buffered character-based stream to read Events from.

		try{// trys to read in a file and parse its info

			inputFile = new FileReader("src/eventData.txt");
			input = new BufferedReader(inputFile);

			String lastLine;

			do{

				// Read Events from the text file and adds them to the ArrayList.

				String name = (lastLine = input.readLine());
				String date = (lastLine = input.readLine());
				String location = (lastLine = input.readLine());
				String description = (lastLine = input.readLine());

				lastLine = input.readLine();//advances line

				events.add(new Event(name, date, location, description));

			}while((lastLine = input.readLine()) != null);//checks to see if file is at end

			// Close the buffered character-based stream used to create Events.

			input.close();
		}
		catch(IOException e){

			System.out.println("Error in file read-in.");
		}

		/* Write the Events in the ArrayList out to a text file. */
		// Open a text file for writing.

		try{

			outputFile = new FileWriter("src/eventDataOuput.txt");
			output = new BufferedWriter(outputFile);

			for(int i = 0; i <= events.size() - 1; i++){

				System.out.println("working");
				output.write(events.get(i) + "\n\n");

			}

			output.close();
		}
		catch(IOException e){

			System.out.println("Error in File Write-out");
		}

		// Add the Events from the ArrayList to the text file. 
		
		// Close the text file. 
		
		
		// Print the Events. 
		for (Event event : events) {
			System.out.println(event.toString());
			System.out.println(); 
		}
    } // end method main
} // end class EventTextProcessor