import java.util.*;
class Swap_without_3rd_variable {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		int a, b ,c,n;
		System.out.println("Enter number of test cases : ");
		n = scan.nextInt();
		while(n-- > 0)
		{
			System.out.println("Enter a value : ");
			a = scan.nextInt(); // 9 
			System.out.println("Enter b value : ");
			b = scan.nextInt(); // 7
			System.out.println("Input: a = " +a + " b = " +b);
			
			a = a + b; // 16
			b = a - b; // 16 - 7 = 9
			a = a - b; // 16 - 9 = 7
			System.out.println("Output: a = " +a + " b = " +b);
			System.out.println("---");
		}

	}
}
