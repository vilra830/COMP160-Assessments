/** This application class identifies a leap year. **/

public class LeapYearApp{
  
  private int year ;
  
  
  public static void main(String[]args){
     
  
    
    leapYear(2014);
    leapYear(2016);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
    

    
    
  }
  
  /*This method evaluates whether a year is a leap year or not.*/
  public static void leapYear(int year){
    
    if ( year < 1582 ){
      System.out.println(year + ": predates the Gregorian calendar");
    } else if (year % 400 == 0){
      System.out.println(year + ": is a leap year ");
    } else if (year % 4 == 0 && !(year % 100 == 0)){
      System.out.println(year + ": is a leap year");
    } else {
      System.out.println(year + ": is not a leap year");
    }
  }                                                                          
}