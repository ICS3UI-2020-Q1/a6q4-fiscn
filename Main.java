import java.util.Scanner; 

/**
 * This program Calculates the dot product of two vectors 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner (System.in); 

    //prompt the user to enter in the values for the first vector 
    System.out.println("Please enter the 3 values for the first vector"); 

    //create array for values 
    int[] veC = new int[3]; 

    //use for loop to get values for the array 
    for(int i = 0; i < veC.length; i++){
      veC[i] = input.nextInt(); 
    } 

    //create array for second vector values 
    int[] veC2 = new int[3];  

    //prompt the user to enter second values 
    System.out.println("Please enter the 3 values for the second vector");

    //create for statrment for values 
    for(int i = 0; i < veC2.length; i++){
      veC2[i] = input.nextInt(); 
    } 


    //create variables for the multiplication part of the dot product  
    int X1 = veC[0] * veC2[0];
    int Y1 = veC[1] * veC2[1];
    int Z1 = veC[2] * veC2[2]; 

    //create a variable for the total 
    int total = X1 + Y1 + Z1; 

    //display answer to screen 
    System.out.println("The dot product is " + total);


    
    
  }
}
