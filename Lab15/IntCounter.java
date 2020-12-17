/* This class contains a single data field of type int array and a constructor that sets its value. It also contains a 
 * method that sends an integer and finds its match with the array. 
 */

public class IntCounter{
  private int[] numArray;
  
  
  public IntCounter(int[] numArray ) {
    this.numArray = numArray;
    
    for( int i : numArray){
      System.out.print(i + " ");
      
    }
    System.out.print("Array is of length " + numArray.length + "\n");
  }
  
  public void showTarget(int target){
    boolean found = false;
    for (int i = 0 ; i < numArray.length; i++){
      if (target == numArray[i]){
        found = true;
        System.out.println("\tThere is a " + target + " at position " + i);
      }   
    }
    
    if (found == false) {
    System.out.println("\tThere are no "+ target + " in this array. ");
    }
    
    
  }
}