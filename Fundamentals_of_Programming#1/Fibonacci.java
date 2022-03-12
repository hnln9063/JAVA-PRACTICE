/*
   In Fibonacci series, the next number is the sum of previous two numbers. The series starts with 0 and 1, and then the next numbers are a sum of the previous 2 numbers.

   For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

   Here the first 2 numbers are 0 and 1

   The next numbers are:

   1 (= 1 + 0)
   2 (= 1 + 1)
   3 (= 2 + 1)
   5 (= 3 + 2)

   And so on…

   Write a method Met that prints the first n numbers of the Fibonacci series. The value of n is passed as an integer parameter to the method.

   The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Hint: You already know the first 2 values. How can you calculate the remaining?

Print the values on a single line, separated by a space character. At the end of the line, print a new line.

Example Input: 1
Output: 0
Example Input: 0
Output:
Example Input: 6
Output: 0 1 1 2 3 5
Example Input: 3
Output: 0 1 1
Example Input: 2
Output: 0 1
*/
import java.util.*;

class Fibonacci {

	public static void Met(int n) {
		/* write your solution here */
		int sum = 0;
		if(n == 0) {
		} else if(n == 1) {
			System.out.println("0");
		} else if(n == 2) {
			System.out.println("0 1");
		} else {
			int prev = 0;
			int newVal = 1;
			System.out.print("0 1 ");
			for(int i=3;i<=n;i++) {
				sum = prev + newVal;
				System.out.print(sum+" ");
				prev = newVal;
				newVal = sum;
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		Met(a);
	}

}
