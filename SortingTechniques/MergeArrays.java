/*
 Write a method Met that takes as parameter 2 sorted 1D integer arrays. You have to merge the 2 arrays such that the resulting array is also sorted. return the merged array.

Don’t write the Class and main method - assume they are already there.

Example Input:
2 4 6 7
1 3 5 8
Output:
1 2 3 4 5 6 7 8
Example Input:
25 30 35 40
0 9 12 13
Output:
0 9 12 13 25 30 35 40
 */

public static int[] Met(int a[],int b[]) {

    int len_of_a = a.length;
    int len_of_b = b.length;

    int c[] = new int[len_of_a+len_of_b];
    int len_of_c = c.length;

    int i=0,j=0,k=0;
    while (i < len_of_a && j < len_of_b) {
         if (a[i] < b[j])
            c[k++] = a[i++];
         else
            c[k++] = b[j++];
      }
      while (i < len_of_a)
      c[k++] = a[i++];
      while (j < len_of_b)
      c[k++] = b[j++];

    return c;
}
