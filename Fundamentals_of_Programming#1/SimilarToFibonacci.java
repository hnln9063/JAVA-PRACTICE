/*
   Consider a sequence of the form 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149…

   Write a method Met which takes as parameter an integer n and prints the nth term of the above sequence. The nth term will fit in an integer value.

Hint: Does this pattern look familiar? Remember the logic for Fibonacci series?

Only write the method - assume that the Main class & main method have been defined.

Example Input: 5
Output: 4
Example Input: 8
Output: 24
Example Input: 11
Output: 149
*/
import java.util.*;

class SimilarToFibonacci {

	public static void Met(int n) {
		int first = 0;
		int second = 1;
		int third = 1;
		int sum=0;
		if(n == 1) {
			System.out.println(first);
		} else if(n == 2) {
			System.out.println(second);
		} else if(n == 3) {
			System.out.println(third);
		} else {
			first = 0;
			second = 1;
			third = 1;
			for(int i=4;i<=n;i++) {
				sum = (first + second + third);
				first = second;
				second = third;
				third = sum;
			}
			System.out.println(sum);
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int a = sc.nextInt();

		Met(a);
	}

}
