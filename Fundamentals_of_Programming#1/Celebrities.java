/*When celebrities get together for a party, they like to have chocolates.
A celebrity party is successful when the number of chocolates is between 20 and 40, inclusive.

Unless it is the weekend, in which case there is no upper bound on the number of chocolates.

You have to write a method Met that prints true if the party is successful and false if the party fails.

Write a method Met that takes 2 parameters: an integer and a boolean value.

    The integer has the number of chocolates
    the boolean is true if it’s the weekend and false if it’s not the weekend.

Met has to print true or false to tell us if the party is successful or not with the given values.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

For students writing in C, please use the C++ option and complete the method. The syntax is the same for both C and C++ in this question.

Example Input: 30 false
Output: true
Example Input: 50 false
Output: false
Example Input: 70 true
Output: true
*/
import java.util.*;

class Celebrities {
  public static void Met(int chocolates, boolean is_weekend) {
      /* write your solution here */
      if(is_weekend == true) {
          if(chocolates >= 20) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
      } else {
          if(chocolates >= 20 && chocolates <= 40) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
      }
  }
  public static void main(String args[]) {
  
  	Scanner sc = new Scanner(System.in);
	int chocolates = sc.nextInt();
	boolean is_weekend = sc.nextBoolean();

	Met(chocolates,is_weekend);
  }
}
