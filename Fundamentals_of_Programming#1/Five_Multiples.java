/*Write a method Met which takes an integer as a parameter.
 *

  You have to print the first 5 multiples of the integer, in a single line. You don’t have to return anything.

  Only write the method - assume that the Main class & main method have been defined.

  Example input: 4
  Example output: 4 8 12 16 20
  */
import java.util.*;
class Five_Multiples {

	public static void Met(int num) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.print(num*i+" ");
		}
		System.out.println();
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Met(num);
	}
}
