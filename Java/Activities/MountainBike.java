package Activity7;

public class MountainBike extends Bicycle{
	
	public int seatHeight;
	
public MountainBike(int gears,int speed, int seatHeight) {
	// TODO Auto-generated constructor stub
	super();
	this.seatHeight=seatHeight;
}
	

public void setHeight(int newValue) {
    seatHeight = newValue;
}

public static void main(String args[]) {
    MountainBike mb = new MountainBike(3, 0, 25);
    System.out.println(mb.bicycleDesc());
    mb.speedUp(20);
    mb.applyBrake(5);
}
	

}
