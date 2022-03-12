/*
Binary Search, with a twist

Write a method Met that takes as parameter a 1D integer array and also another integer, the key. You have to find the position of the key in the array. If the key does not exist, print No. Otherwise, print the index.

Note: The array is sorted in descending order and without duplicates.

Use the System.out.println() statement to print.

Don’t write the Class and main method - assume they are already there.

Example Input:
12 6 4 3 2 1
12
Output:
0
Exmample Input:
45 31 22 17 15 10
25
Output:
No
*/
import java.util.*;
class ReverseBinarySearch {

        public static void Met(int a[],int key) {

                int high = a.length-1;
                int low = 0;
                int mid;
                while(high >= low) {
                        mid = (high+low)/2;
                        if(a[mid] == key){
                                System.out.println("Key value found at index : "+mid);
                                return;
                        } else if(key > a[mid]){
                                high = mid - 1;
                        } else {
                                low = mid + 1;
                        }
                }
                System.out.println("No");
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
