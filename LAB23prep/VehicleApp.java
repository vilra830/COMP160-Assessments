public class VehicleApp{
public static void main(String[]args){
Vehicle[] vehicles = {new Car("Toyota Starlet", "Japan", 25, 0), new Car
  ("Volvo XC40", "Sweden", 20, 2)};

  for(Vehicle car : vehicles){
  car.toString();
  }  
}
}