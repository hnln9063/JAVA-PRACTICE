/*
 BINARY SEARCH
 -------------
 */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static void iterator(int a[], int low, int high, int e) {
		long start = System.nanoTime(), end;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] < e)
				low = mid + 1;
			else if (a[mid] == e) {
				System.out.println("Element founded at " + mid);
				end = System.nanoTime();
				System.out.println("Time complexity Iterator: " + (end - start)*Math.pow(10,-9));
				return;
			} else
				high = mid - 1;
		}
		System.out.println("Element not founded");
		end = System.nanoTime();
		System.out.println("Time complexity Iterator: " + (end - start)*Math.pow(10,-9));
	}
	static void recursive(int a[], int lb, int ub, int k) {
		long start = System.nanoTime(), end;
		int mid = 0;
		if (lb <= ub) {
			mid = (lb + ub) / 2;
			if (a[mid] == k) {
				System.out.println("Element founded at " + mid);
				end = System.nanoTime();
				System.out.println("Time complexity for recersive: " + (end - start)*Math.pow(10,-9));
				return;
			}
			if (a[mid] > k)
				recursive(a, lb, mid - 1, k);
			else
				recursive(a, mid + 1, ub, k);
		} else {
			System.out.println("Element not founded");
			end = System.nanoTime();
			System.out.println("Time complexity recursive: " + (end - start)*Math.pow(10,-9));
		}
	}
	public static void main(String[] args) {
		int n, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements : ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched : ");
		e = sc.nextInt();
		Arrays.sort(a);
		int op, c = 0;
		do {
			c++;
			System.out.println("1.Iterator\t2.Recursive\nEnter your choice ");
			op = sc.nextInt();
			switch (op) {
				case 1:
					iterator(a, 0, n - 1, e);
					break;
				case 2:
					recursive(a, 0, n - 1, e);
					break;
			}
		} while (op < 3 && c < 2);
	}
}

/*
OUTPUT:
-------
Enter the size of the array :
5
Enter 5 elements :
2 8 4 6 12
Enter element to be searched :
12
1.Iterator      2.Recursive
Enter your choice
1
Element founded at 4
Time complexity Iterator: 8.869E-4
1.Iterator      2.Recursive
Enter your choice
2
Element founded at 4
Time complexity for recersive: 6.07E-4
*/
