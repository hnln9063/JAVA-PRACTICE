/*
   Bubble Sort

   Write a method Met that takes as parameter an integer array and sorts the array in ascending order using Bubble Sort. At each step of the sort, you have to print the array.

   Use the System.out.println() statement to print.

   Don’t write the Class and main method - assume they are already there.

   Example Input:
   4 1 3 2
Output:
1 3 2 4
1 2 3 4
1 2 3 4
1 2 3 4

*/
import java.util.*;
class BubbleSort {

	public static void Met(int a[]) {

		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {

				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			}
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println();

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of an Array : ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.print("Enter values into the array : ");
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		Met(arr);
	}
}
