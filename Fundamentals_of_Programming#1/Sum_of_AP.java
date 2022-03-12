/*Write a program to calculate the sum of the first 100 terms in an AP.

You are given the following:

    The first term of the AP is stored in an int variable called a
    The common difference of the AP is stored in an int variable called d
    a float variable called sum has already been declared.

You are required to only write the statements that store the sum of first 100 terms in the sum variable. We have already written the print statements.

Don’t write the Class & Main method, assume that they have already been defined.
*/
import java.util.*;
class Sum_of_AP {

	public static void Met(int a, int d) {
	
		int sum = (100/2)*(2*a+(100-1)*d);
		System.out.println(sum);

	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int starting_val = sc.nextInt();
		int common_difference = sc.nextInt();

		Met(starting_val,common_difference);
	
	}


}
