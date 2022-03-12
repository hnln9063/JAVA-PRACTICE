/*Dr. CooCoo just loves the number 7 and considers it lucky. She loves it so much that she has a formula to understand if a pair of numbers are lucky are not.

    If any or both of the numbers are 7, then the pair is lucky
    If the sum of the numbers is 7, then the pair is lucky
    If the absolute difference of the 2 numbers is 7, then the pair is lucky

Write a function Met that takes as parameters 2 integers and prints Lucky! if the pair is lucky. Otherwise it prints Not Lucky!

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Use the System.out.println() statement for printing.

Example Input: 1 6
Output: Lucky!
Example Input: -9 -16
Output: Lucky!
Example Input: 7 95
Output: Lucky!
Example Input: 28 57
Output: Not Lucky!
*/

import java.util.*;

class DrCoocoo_Lucky {
  public static void Met(int num1, int num2) {
      /* write your solution here */
      if(num1 == 7 || num2 == 7) {
          System.out.println("Lucky!");
      } else if(num1 +  num2 == 7) {
          System.out.println("Lucky!");
      } else if( (num1 - num2 == 7) || (num2 - num1 == 7) ) {
          System.out.println("Lucky!");
      } else {
          System.out.println("Not Lucky!");
      }
  }

  public static void main(String args[]) {
  
  	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	Met(num1,num2);

  }

}
