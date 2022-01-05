package activities;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> arrPassengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	public Plane()
	{
		maxPassengers=10;
		String[] passengers=new String[5];
		
	}
	
	public void onboard()
	{
		//add passengers to the array using the add() method
	    arrPassengers = new ArrayList<>();
		arrPassengers.add("Prachi");
		arrPassengers.add("Rahu");
		arrPassengers.add("Ketu");
		arrPassengers.add("Shani");
		arrPassengers.add("Neptune");
		arrPassengers.add("Pluto");
		arrPassengers.add("Earth");
		arrPassengers.add("Moon");
		arrPassengers.add("Sun");
		arrPassengers.add("Jupiter");
		

		
	}
	
	public LocalDateTime takeOff()
	{
			
		//returns the current date and time
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Take off Date and time="+ dt);
		return dt;
		
	}
	
	public void land()
	{
		// sets the value of lastTimeLanded to the current date and time. Also clear() the array.
		LocalDateTime dt=getLastTimeLanded();
		System.out.println("Plane landed on time="+dt);
		arrPassengers.clear();
	}
	
	public LocalDateTime getLastTimeLanded()
	{
		LocalDateTime dt=LocalDateTime.now();
		//System.out.println("Plane landed");
		return dt;
	}
	
	public List<String> getPassengers()
    {
		System.out.println("Passenger list="+ arrPassengers);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// returns the array of passengers
		return arrPassengers;
	}

}
