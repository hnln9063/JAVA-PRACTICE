/*
Insertion Sort - in reverse

Write a method Met that takes as parameter an integer array and sorts the array in descending order using Insertion Sort. At each step of the sort, you have to print the array.

Use the System.out.println() statement to print.

Don’t write the Class and main method - assume they are already there.

Example Input:
3 2 1 5 6 4 8 7
Output:
3 2 1 5 6 4 8 7
3 2 1 5 6 4 8 7
5 3 2 1 6 4 8 7
6 5 3 2 1 4 8 7
6 5 4 3 2 1 8 7
8 6 5 4 3 2 1 7
8 7 6 5 4 3 2 1

*/


import java.util.*;

class ReverseInsertionSort {


        public static void Met(int a[]) {

                int len = a.length;
                for(int i=1;i<len;i++) {

                        int j=i;

                        while(j > 0 && a[j] > a[j-1]) {
                                int temp = a[j];
                                a[j] = a[j-1];
                                a[j-1] = temp;
                                j--;
                        }

                        for(int k=0;k<len;k++) {
                                System.out.print(a[k]+" ");
                        }
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
