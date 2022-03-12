/* Write a program to calculate the simple interest over 1 year. You are given the following:

    The Principal amount is stored in a float variable P
    The Rate of interest is stored in a float variable R
    The interest variable is of float type and has already been declared.

You are required to only write the statements that store the correct interest in the interest variable. We have already written the print statements.

Don’t write the Class & Main method, assume that they have already been defined.
*/
import java.util.*;

class IntrestProblem {

	public static void Met(double P,int T, double R) {
		double interest = (P*T*R);
		System.out.println(interest);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		double P = sc.nextDouble();
		int T = sc.nextInt();
		double R = sc.nextDouble();

		Met(P,T,R);

	}
}
