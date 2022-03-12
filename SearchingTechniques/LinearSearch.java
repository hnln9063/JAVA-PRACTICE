/*
 * Linear Search

 Write a method Met that takes as parameter a 1D integer array and also another integer, the key. You have to find the position of the key in the array. If the key does not exist, print No. Otherwise, print the index.

Note: The array is sorted and without duplicates.

Use the System.out.println() statement to print.

Don’t write the Class and main method - assume they are already there.

Example Input:
1 2 3 4 5
5
Output:
4
Example Input:
10 15 17 22 31
16
Output:
No
*/
import java.util.*;

class LinearSearch {

	public static void Met(int a[],int key) {

		int len = a.length;
		int i=0;
		boolean flag = false;
		for(i=0;i<len;i++) {
			if(a[i] == key) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Key found at index : "+i);
		} else {
			System.out.println("No");
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
		System.out.print("Enter the key value to find : ");
		int key = sc.nextInt();
		Met(arr,key);
	}

}
