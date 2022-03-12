/*Tomorrow is the local picnic day and the parents are excited to take their children to the park. The organizers are giving some chocolates to the children. We know that every family has 2 children.

  The organizers will give chocolates corresponding to the age of the children. So a family with a four-year old and a 7-year old child will get 11 chocolates.

  However, if any of the child in that family is a teenager (between 13 to 19 inclusive), then that family receives a total of 40 chocolates.

  Write a method Met that takes as parameters 2 integers, each storing the age of a child. You have to print the number of chocolates the family will get.

  Only write the method - assume that the Class & main method have been defined.

  Use the System.out.println() statement for printing.

  Example Input: 4 7
Output: 11
Example Input: 11 20
Output: 31
Example Input: 5 13
Output: 40
*/

import java.util.*;

class Picnic_time {
	public static void Met(int a, int b) {
		int count = 0;
		if( (a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
			count = 40;
		} else {
			count = a + b;
		}

		System.out.println(count);

	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Met(a,b);
	}

}
