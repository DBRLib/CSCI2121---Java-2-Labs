import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Implements entries for a calendar. To be used with 
 * <code>EventSerializer</code>. Each <code>Event</code> 
 * has fields indicating different pieces of information 
 * about the event, e.g., location, time, etc. 
 *
 * @author	Deven Ronquillo
 * @version	7/02/2017
 */ 
public class Event {
    private String name;
    private SimpleDateFormat dateFormat;
    private Date date;
    private String location;
    private String description;

    /**
	 * Constructor
	 *
	 * @param	name		name of the Event
	 * @param	date		date of the Event
	 * @param	location	location of the Event
	 * @param	description	description of the Event
	 */ 
	public Event( String name, String date, String location, String description ) {
        this.name = name;
		// Set the format for the date.
        this.dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm" );
        
		// Format the date. 
        try {
            this.date = dateFormat.parse( date );
        }
        catch( ParseException e ) {
            System.out.println( "Date unparseable using" + this.dateFormat );
        }

        this.location = location;
        this.description = description;
    } // end constructor

    /**
	 * Returns the <code>Event</code>'s name. 
	 *
	 * @return	this.name
	 */ 
	public String getName() {
        return this.name;
    } // end method getName

    /**
	 * Returns the <code>Event</code>'s date.
	 *
	 * @return	this.date
	 */ 
	public String getDate() {
        return this.date.toString();
    } // end method getDate

	/**
	 * Returns the <code>Event</code>'s location.
	 *
	 * @return	this.location
	 */ 
    public String getLocation() {
        return this.location;
    } // end method getLocation

	/**
	 * Return's the <code>Event</code>'s description.
	 * 
	 * @return	this.description
	 */ 
    public String getDescription() {
        return this.description;
    } // end method getDescription
	
	/**
	 * Returns String representation of the <code>Event</code>. 
	 * 
	 * @return	String containing fields of Event
	 */ 
	@Override
    public String toString() {
        String obj = "Name: " + this.getName() + "\nDate: " + this.getDate() + "\nLocation: " + this.getLocation() + "\nDescription: " + this.getDescription();

        return obj;
    } // end method toString
} // end class Event