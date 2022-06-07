/*
 MERGE SORT
 ----------
 */

import java.util.*;
public class MergeSort {
    static void merge(int a[], int l, int n, int r) {
        int n1 = n - l + 1;
        int n2 = r - n;
        int l1[] = new int[n1];
        int l2[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            l1[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            l2[j] = a[n + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (l1[i] <= l2[j]) {
                a[k] = l1[i];
                i++;
            } else {
                a[k] = l2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = l1[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = l2[j];
            j++;
            k++;
        }
        printArray(a, a.length);
    }
    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + (r - 1)) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Before sorting: ");
        printArray(a, n);
        long start = System.nanoTime();
        sort(a, 0, n - 1);
        long end = System.nanoTime();
        System.out.println("Sorted array: ");
        printArray(a, n);
        System.out.println("Time complexity is : " + (end - start)*Math.pow(10,-9));
    }
}

/*OUTPUT
Enter size of array: 
5
Enter array elements: 
3 4 2 5 1
Before sorting: 
3 4 2 5 1 
3 4 2 5 1 
3 4 2 1 5 
3 4 1 2 5 
1 2 3 4 5 
Sorted array: 
1 2 3 4 5 
Time complexity is : 6.337E-4
*/
