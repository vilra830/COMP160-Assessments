/** This application shows 3 arrays and the average of each set.
  * coded by : Rhea Villafuerte 05/09/2018
  */
public class Average{
  public static void main(String [] args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}};
    
    
    for (int row = 0; row < table.length ; row++){
      double sum = 0;
      
      for (int col = 0; col < table[row].length; col++){
        
        sum += table[row][col];
        System.out.print(table[row][col] + " ");
       
        
      }
      
       System.out.print(  " Average : " + (sum/table[row].length));
      System.out.println();
    }
    
  }
}
