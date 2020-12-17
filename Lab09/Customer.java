/** This program will represent a potential customer
  * for a discounted meal and harbour cruise package. **/


public class Customer{
  //data field declarations 
  private String name;
  private boolean student ;
  private boolean child ;
  private boolean booked;
  
  /** Returns the name of the customer.
    * @return the customers name*/
  public String getName(){
    return name;
  }
  
  /*returns the value of the datafield child
   *@return child */
  public boolean isChild(){
    return child;
  }
  
  /*returns the value of the datafield student
   * return whether the customer is a student or not*/
  public boolean isStudent(){
    return student;
  }
  
  /*Sets the value of the data field booked to input parameter value
   @param c booked*/
   public void setBooked(boolean c){      
     booked = c;      
   } 
   
   /*returns the value of the datafield booked
    * Evaluates whether the customer is booked or not*/  
   public boolean isBooked(){
     return booked;
   }
   
   /* Shows structure of the object with 3 parameters */
   public Customer(String nameIn, int age, boolean studentIn){
     name = nameIn;
     child = age <= 16;
     student = studentIn;
     
   }
   
   
   
   
}