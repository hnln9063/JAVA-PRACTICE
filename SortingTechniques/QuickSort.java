/*
Quicksort:
---------

Write a method Met that takes as parameter an integer array and sorts the array in ascending order using Quicksort.

You have to return the sorted array.

Don’t write the Class and main method - assume they are already there.

Example Input:
10 5 1 7 4 6
Output:
1 4 5 6 7 10
 */

public static int[] Met(int a[]) {
    sort(a,0,a.length-1);
    return a;
}

public static void sort(int a[],int low, int high) {
    if(low < high) {
        int val = partition(a,low,high);
        sort(a,low,val-1);
        sort(a,val+1,high);
    }
}

public static int partition(int a[], int low, int high) {
    int pivot = a[high];
    int i = low-1;
    for(int j=low;j<high;j++) {

        if(a[j] <= pivot) {
            i++;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    int temp = a[i+1];
    a[i+1] = a[high];
    a[high] = temp;
    return i+1;

}
