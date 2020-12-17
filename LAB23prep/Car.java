public class Car extends Vehicle{
  private int numAirBags; 
  private int litresPerKilometre;
//(Adapted from LDC Section 8.3)
  public Car(String name, String countryOfOrigin, int lpK, int airBags){
    super(name,countryOfOrigin);
    litresPerKilometre = lpK;
    numAirBags = airBags;
  }
  public int fuelConsumption(int tripLength){
    
    return litresPerKilometre * tripLength;
  }
  
  public String toString(){
    return "Car with " + numAirBags + " air bags made in " + countryOfOrigin;
  }
}