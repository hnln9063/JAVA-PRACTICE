/*Write a method Met that takes as parameter a positive integer n.

  You have to print the largest power of 2 less than or equal to n.

  For example, for 10 the largest power of 2 less than or equal to 10 is 8. For 64 largest power of 2 less than or equal to it is 64

Hint: instead of doing ++ in your loops, can you think of a different operator?

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example Input: 1
Output: 1
Example Input: 5
Output: 4
Example Input: 10000
Output: 8192
*/

import java.util.*;

class LargestPowerOfTwo {

	public static void Met(int n) {

		int i;
		for(i=1;i<=n;i = i<<1);
		System.out.println(i/2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Met(a);
	}

}
