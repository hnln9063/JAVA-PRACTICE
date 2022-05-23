/*
 MERGING ARRAYS IN REVERSE:
 --------------------------

 Write a method Met that takes as parameter 2 1D integer arrays sorted in descending order. You have to merge the 2 arrays such that the resulting array is sorted in descending order. return the merged array.

Don’t write the Class and main method - assume they are already there.

Example Input:
7 6 4 2
8 5 3 1
Output:
8 7 6 5 4 3 2 1
Example Input:
40 35 30 25
13 12 9 0
Output:
40 35 30 25 13 12 9 0
 */

public static int[] Met(int a[],int b[]) {
    
    int len_of_a = a.length;
    int len_of_b = b.length;
    int c[] = new int[len_of_a+len_of_b];
    int i=0,j=0,k=0;
    while(i < len_of_a && j < len_of_b) {
        if(a[i] > b[j])
            c[k++] = a[i++];
        else
            c[k++] = b[j++];
    }
    while( i < len_of_a) {
        c[k++] = a[i++];
    }
    while(j < len_of_b) {
        c[k++] = b[j++];
    }
    return c;
}
