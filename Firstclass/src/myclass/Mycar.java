package myclass;

public class Mycar {
  int number = 0;
   String model = "Toyota";
   public static void print(int CarNumber , String CarModel) {
    System.out.println("Car Number : " + CarNumber + "CarModel: " + CarModel);
   }
	public static void main(String[] args) {
		
    Mycar Car  = new Mycar();
    Car.print(156778, "Honda");
    
	}

}
