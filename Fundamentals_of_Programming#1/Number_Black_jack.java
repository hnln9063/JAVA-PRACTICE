/*
   Mr. Jack has recently started gambling. He plays Number BlackJack. In this game, the players draw numbered cards and whoever has a value closer to 21 wins. However, if the number goes over 21 then both lose. If both have the same value, then also both of them lose.

   Given the values possessed by 2 players, you have to tell us who wins.

   Write a method Met that takes input 2 integers: the first integer is Player 1’s value and 2nd integer is Player2’s value. You have to print Player1 if Player1 wins, Player2 if Player2 wins and Rematch if both lose.

   Only write the method - assume that the Class & main method have been defined.

   Use the System.out.println() statement for printing.

   Example Input: 14 18
Output: Player2
Example Input: 21 3
Output: Player1
Example Input: 27 32
Output: Rematch

*/

import java.util.*;

class Number_Black_jack {

	public static void Met(int a, int b) {

		int c = 21 - a;
		int d = 21 - b;
		if( (a > 21 || b > 21) || (a == b)) {
			System.out.println("Rematch");
		} else if(c > d) {
			System.out.println("Player2");
		} else if(d > c) {
			System.out.println("Player1");
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Met(a,b);

	}

}
