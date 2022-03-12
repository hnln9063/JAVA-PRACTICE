/*Write a method called Met that takes as parameters an integer n and a String word.

  Your method should return the character which is at the nth position of word.

  It returns the value of the character at the nth position. Eg, Met(3,"Earth") returns r.

  Only write the method - assume that the Main class & main method have been defined.
  */

import java.util.*;

class Nth_Character {

	public static char Met(int n, String word) {
		char ch;
		n = n - 1;
		ch = word.charAt(n);
		return ch;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String s = "Earth";
		int num = sc.nextInt();

		System.out.println(Met(3,s));

	}

}
