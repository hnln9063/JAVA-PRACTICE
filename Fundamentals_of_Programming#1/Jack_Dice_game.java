/*Mr. Jack is now playing some dice games. In this game, 2 dice are rolled.

  The score is calculated by summing the value on the 2 dice. However, when playing in special mode, if the number on both dice are equal, then one value is incremented, wrapping around to 1 if its value was 6.

  Write a method Met to calculate the score. The parameters are 2 integers and 1 boolean. Each integer has the value of one of the dice. The boolean is true if the special mode is being played, otherwise it is false. You have to print the score depending on the values.

  Only write the method - assume that the Class & main method have been defined.

  Use the System.out.println() statement for printing.

  Example Input: 4 3 false
Output: 7
Example Input: 4 4 false
Output: 8
Example Input: 4 4 true
Output: 9
Example Input: 6 6 true
Output: 7
*/

import java.util.*;

class Jack_Dice_game {

	public static void Met(int a, int b, boolean val) {
		int sum = 0;
		if(val == true) {
			if( (a == b && a == 6) ) {
				sum = a + 1;
			} else if(a==b) {
				sum = a + b + 1;
			} else {
				sum = a + b;
			}
		} else {
			sum = a + b;
		}
		System.out.println(sum);
	}



	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean val = sc.nextBoolean();
		Met(a,b,val);
	}

}
