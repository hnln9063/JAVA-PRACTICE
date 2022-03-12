/*
Bubble Sort - in reverse

Write a method Met that takes as parameter an integer array and sorts the array in descending order using Bubble Sort. At each step of the sort, you have to print the array.

Use the System.out.println() statement to print.

Don’t write the Class and main method - assume they are already there.

Example Input:
5 9 2 10
Output:
9 5 10 2
9 10 5 2
10 9 5 2
10 9 5 2

*/

import java.util.*;
class ReverseBubbleSort {

        public static void Met(int a[]) {

                for(int i=0;i<a.length-1;i++) {
                        for(int j=0;j<a.length-1;j++) {

                                if(a[j] < a[j+1]) {
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
