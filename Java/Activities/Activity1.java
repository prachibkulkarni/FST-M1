package Activity1;

public class Activity1 extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car objCar= new Car();
        
      
      objCar.make=2014;
      objCar.color="Black";
      objCar.transmission="Manual";
      
      objCar.displayCharacteristics();
      objCar.accelarate();
      objCar.brake();
     
	}

}
