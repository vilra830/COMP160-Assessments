import java.text.NumberFormat;
import java.util.Scanner;

/** application class for Customer.java
  * This program will represent a potential customer
  * for a discounted meal and harbour cruise package.
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  
  
  public static void main(String[]args){
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    
    
    
    confirmBooking(customer1); 
    confirmBooking(customer2); 
    confirmBooking(customer3); 
    confirmBooking(customer4);
    confirmBooking(customer5); 
    confirmBooking(customer6);
    confirmBooking(customer7); 
    confirmBooking(customer8);
    
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer5);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8) ; 
      
  
  }
  

  
  /*This method will evaluate the category of the customer 
   * and will calculate the corresponding discount for each */
  
  public static void confirmBooking(Customer cust){
    double ticketPrice = 56.0;
    double mealPrice = 30.0;
    
    
    
    
    if (cust.isChild() && (cust.isStudent())){
      ticketPrice = ticketPrice / 2;
      mealPrice = mealPrice/2;
    }
    
    if (!(cust.isChild()) && (cust.isStudent())){
      ticketPrice = ticketPrice / 2;
      mealPrice = mealPrice - mealPrice*.10;
    }
    if ((cust.isChild()) && !(cust.isStudent())){
      ticketPrice = ticketPrice / 2;
      mealPrice = mealPrice/ 2;
    }
    
    
    if (!(cust.isStudent()) && !(cust.isChild())){
      ticketPrice = ticketPrice - ticketPrice*.2;
      mealPrice = mealPrice - mealPrice*.10;
    }
    
    
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    System.out.println(cust.getName()+ "\nTicket Price: " +  fmt.format(ticketPrice) + "\nMeal Price: "+ fmt.format(mealPrice) + "\nTotal Price: " + fmt.format(ticketPrice+ mealPrice));
    Scanner scan = new Scanner(System.in);
    System.out.println("Confirm Booking for "+ cust.getName() + "(Y/N):");
    char c = scan.next().charAt(0);
    if ((c == 'Y') || (c == 'y')){
      cust.setBooked(true);
      System.out.println("Booked");
      
      
    }
  }
  
  /*This method will show customers who are booked*/
  
  public static void showBooked(Customer cust){
      if (cust.isBooked()){
      System.out.println(cust.getName()+ " is booked ");
    }
    
    
    
    
  }
}