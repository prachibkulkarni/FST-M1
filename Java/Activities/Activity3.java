package activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convert all planets days into earth seconds
		int seconds = 1000000000;
		double EarthSeconds = 31557600;
		double MercurySeconds = (0.2408467*365.25*24*3600);
		double VenusSeconds = (0.61519726*365.25*24*3600);
		double MarsSeconds = (1.8808158*365.25*24*3600);
		double JupiterSeconds = (11.862615*365.25*24*3600);
		double SaturnSeconds = (29.447498*365.25*24*3600);
		double UranusSeconds = (84.016846*365.25*24*3600);
		double NeptuneSeconds = (164.79132*365.25*24*3600);
		
		//Convert given seconds into years by dividing days by seconds
		
	     
	    //Calculate age for above variable seconds
	    double age= seconds/EarthSeconds;
	    System.out.println("Age for seconds in years is on Earth ="+age);
	    
	    //Age on Mercury
	    age = seconds/MercurySeconds;
	    System.out.println("Age for seconds in Earth years is on Mercury ="+age);
	    
	    //Age on Venus
	    age=seconds/VenusSeconds;
	    System.out.println("Age for seconds in Earth years is on Venus="+age);
	    
	    //Age on Mars
	    age=seconds/MarsSeconds;
	    System.out.println("Age for seconds in Earth years is on Mars="+age);
	    
	    //Age on Jupiter
	    age=seconds/JupiterSeconds;
	    System.out.println("Age for seconds in earth years is on Jupiter="+age);
	    
	    //Age on Saturn
	    age=seconds/SaturnSeconds;
	    System.out.println("Age for seconds in Earth years is on Saturn="+age);
	    
	    //Age on Uranus
	    age=seconds/UranusSeconds;
	    System.out.println("Age for seconds in Earth years is on Uranus="+age);
	    
	    //Age on Neptune
	    age=seconds/NeptuneSeconds;
	    System.out.println("Age for seconds in Earth years is on Neptune="+age);

	     


	}

}
