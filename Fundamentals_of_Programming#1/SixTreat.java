/*
   We are going to play a game called 6’s treat. In this, we take 2 numbers and print the larger number. However, if the 2 values have the same remainder when divided by 6, then we print the smaller value. However, in all cases, if the two values are the same, we print 0.

   Write a method Met that takes in 2 integer values and prints the result as per 6’s treat.

   Only write the method - assume that the Class & main method have been defined.

   Use the System.out.println() statement for printing.

   Example Input: 1 7
Output: 1
Example Input: 35 28
Output: 35
Example Input: 44 44
Output: 0
*/

import java.util.*;

class SixTreat {

	public static void Met(int a, int b) {
		int c = a%6;
		int d = b%6;
		if(a == b) {
			System.out.println("0");
		}else if(c == d) {
			if(a > b) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		} else {
			if(a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
	}


	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Met(a,b);
	}

}
