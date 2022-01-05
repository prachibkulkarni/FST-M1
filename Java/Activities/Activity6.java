package activities;

public class Activity6 extends Plane {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Plane plane=new Plane();
      System.out.println(plane.getMaxPassengers());
      //Onboarded passengers list should be  assigned
      plane.onboard();
      plane.takeOff();
      plane.getPassengers();
      plane.getLastTimeLanded();
      plane.land();
	}

}
