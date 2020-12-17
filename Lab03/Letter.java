/** Displays a job offer*/

import java.util.Scanner;

public class Letter{
  private static String yours = "Yours sincerely";
  private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager" + 
    "\nButtery Baps Unlimited\nwww.bb.co.nz";
  public static void main(String [] args){
    int junior = 25000; // standard pay rate for Junior employee
    int intermediate = 35000; // standard pay rate for Intermediate employee
    int senior = 50000; // standard pay rate for Senior employee
    
    Scanner scan = new Scanner(System.in);
    System.out.println( "Enter the successful applicant's name:" );
    String name = scan.nextLine(); // call a method on sc to read a line from the
// keyboard and store it in String variable s
    
    
    
    
    jobOffer();
    jobOffer("Chief Cook");
    jobOffer("Chief Cook", senior);
    jobOffer(name, "Chief Cook", senior);
    
  } // end method
  
  /** displays a job offer for Bottle Washer at $25K */
  public static void jobOffer(){
    System.out.println("Dear applicant" + 
                       "\nI wish to offer you the position of Bottle Washer." +
                       "\nThe pay rate will be $25000 per annum.");
    signature();
  } // end method
  
  /** displays a job offer for a  certain Job at $25K */
  public static void jobOffer(String jobTitle){
    System.out.println("Dear applicant" + 
                       "\nI wish to offer you the position of " + 
                       jobTitle + ".\nThe pay rate will be $25000 per annum.");
    signature();
  } // end method
  
  /** displays a job offer for a certain job title and rate */
  public static void jobOffer(String jobTitle, int payRate){
    System.out.println("Dear applicant" + 
                       "\nI wish to offer you the position of " + 
                       jobTitle + ".\nThe pay rate will be " + payRate +" per annum.");
    signature();
  } // end method
  
  /** displays a job offer for a successful applicant with a certain job title and rate */
  public static void jobOffer (String name, String jobTitle, int payRate){
    System.out.println("Dear "+ name + "\nI wish to offer you the position of " +
                       jobTitle + ".\nThe pay rate will be " + payRate + " per annum.");
    signature();
    
    
  } // end method
  
  public static void signature(){// displays the closing statement
    System.out.println(yours + "\n" + sign + "\n");
    
  } // end method
  
  
  
} // end class 