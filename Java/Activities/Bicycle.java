package Activity7;

public class Bicycle implements BicycleParts, BicycleOperations {


	

	@Override
	public void speedUp(int increment) {
		// Increase the speed as per 
		System.out.println("current speed of bike is increased to ="+(Bicycle.speed + increment));
			
	}

	@Override
	public void applyBrake(int decrement) {
		//Decrease the speed as per passed parameter
	  System.out.println("current speed of bike reduced to ="+(Bicycle.speed - decrement));
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + Bicycle.speed);
	}

	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String currentSpeed;
       Bicycle bi=new Bicycle();
       	bi.speedUp(3);
        currentSpeed = bi.bicycleDesc();
        System.out.println(currentSpeed);
        bi.applyBrake(2);
        currentSpeed = bi.bicycleDesc();
        System.out.println(currentSpeed);
	}*/

}
