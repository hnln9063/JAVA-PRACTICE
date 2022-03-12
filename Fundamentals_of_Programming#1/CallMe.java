/*Pooja just got a new cellphone. She carries it everywhere, even to her morning college classes.

  She normally answers calls, except in the morning. In the morning she answers only if her Mom calls. However she never answers any calls when she is sleeping.

  Write a method Met to that takes in 3 boolean parameters:

  the first boolean is true if it is morning and false if it is not morning
  the second boolean is true if her mom is calling and false if her mom is not calling
  the third boolean is true if she is sleeping and false if she is not sleeping

  You have to print True if Pooja will answer the call and False if she will not answer it.

  Only write the method - assume that the Class & main method have been defined.

  Use the System.out.println() statement for printing.

  Example Input: true false false
Output: False
Example Input: true true false
Output: True
Example Input: false true true
Output: False
*/

import java.util.*;

class CallMe {

	public static void Met(boolean a, boolean b, boolean c) {
		if(c == true) {
			System.out.println("False");
		} else if(a == false) {
			System.out.println("True");
		} else if(a == true && b == true) {
			System.out.println("True");
		} else if(a == true && b == false) {
			System.out.println("False");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		boolean c = sc.nextBoolean();
		Met(a,b,c);
	}

}
