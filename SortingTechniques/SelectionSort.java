/*
 * Selection Sort

 Write a method Met that takes as parameter an integer array and sorts the array in ascending order using Selection Sort. At each step of the sort, you have to print the array.

 Use the System.out.println() statement to print.

 Don’t write the Class and main method - assume they are already there.

 Example Input:
 5 2 7 3 4 8 1 6
Output:
1 2 7 3 4 8 5 6
1 2 7 3 4 8 5 6
1 2 3 7 4 8 5 6
1 2 3 4 7 8 5 6
1 2 3 4 5 8 7 6
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8

*/
import java.util.*;

class SelectionSort {

	public static void Met(int a[]) {
		int len = a.length;

		for(int i=0;i<len;i++) {

			int min = a[i], min_index = i;
			for(int j=i+1;j<len;j++) {

				if(a[j] < min) {
					min_index = j;
					min = a[j];
				}

			}
			int temp = a[i];
			a[i] = a[min_index];
			a[min_index] = temp;

			for(int k=0;k<len;k++)
				System.out.print(a[k]+" ");
			System.out.println();
		}

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
