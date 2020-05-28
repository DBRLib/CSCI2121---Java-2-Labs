/**
 * A class that implements the Singleton
 * design pattern. 
 * 
 * @author	Franklin D. Worrell
 * @revised	31 October 2016
 */ 
public class TheOneRing {
	private String bearer; 					   // the ring's bearer
	private static TheOneRing instance = null;

	private TheOneRing(){

		this.bearer = "Tantabus";
	}

	public  static TheOneRing getInstance(){//checkes if an instance is already created and returns based on this.

		if(instance == null){

			instance = new TheOneRing();
		}

		return instance;
	}
	
	/**
	 * Reveals the ring's secrets to the clever wizard.
	 */ 
	public void castIntoTheFire() {
		System.out.println(); 
		System.out.println("One Ring to rule them all, One Ring to find them, "); 
		System.out.println("One Ring to bring them all and in the darkness bind them. "); 
		System.out.println(); 
	} // end method castIntoTheFire
} // end class TheOneRing