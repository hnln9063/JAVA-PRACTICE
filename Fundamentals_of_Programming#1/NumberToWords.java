/*Write a method that takes as paramater an integer. This integer is a 2 digit number.

  Depending on the value of the number, print the English word for this number.

  The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

  Example Input: 45
Output: forty-five
Example Input: 13
Output: thirteen
Example Input: 87
Output: eighty-seven
*/

import java.util.*;

class NumberToWords {

	public static void Met(int n) {
		/* write your solution here */
		String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

		if(n > 19) {
			if( n == 20 || n == 30 || n == 40 || n == 50 || n == 60 || n == 70 || n == 80  || n == 90 ) {
				System.out.println(tens[n/10]);
			} else {
				System.out.println(tens[(n/10)]+"-"+ones[n%10]);
			}
		}

		else
			System.out.println(ones[n]);

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		Met(a);
	}

}
