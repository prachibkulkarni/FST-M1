package activities;

public class Car {
	
	public String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car()
	{
		this.tyres=4;
		this.doors=4;
	}
	
	
	
	public void displayCharacteristics()
	{
		System.out.println("Tyress="+this.tyres);
		System.out.println("Color="+this.color);
		System.out.println("transmission="+this.transmission);
		System.out.println("make="+this.make);
		System.out.println("doors="+this.doors);
	}
	
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	
	public void brake() 
	{
		System.out.println("Car has stopped.");
		
	}

}
