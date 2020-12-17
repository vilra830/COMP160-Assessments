/** This application fills and then displays a multiplication table up to 12x12.
  * Coded by Rhea Villafuerte 04/09/2018
  */
   
public class Multiplication{
  public static void main (String[] args){
 
    int cols = 12;
    int rows = 12;
    int [] [] table = new int[rows][cols];
    for (int row = 0; row < rows; row++){
      for (int col = 0; col < cols; col++){
        table[row][col] = (row+1) * (col+1);
      }
    }
    
    
    
    for (int[] row : table){
      for(int col : row){
        System.out.print( (col) + "\t");
      }
      System.out.println();
    }
  }           
}