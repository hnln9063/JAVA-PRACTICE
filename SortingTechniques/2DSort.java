/*
 2D Sort

Write a method Met that takes as parameter a 2D integer array and returns a 2D integer array that is sorted such that:

A[i][j] < A[i][j+1] and also any A[i][x] < A[i+1][y], where x and y are any numbers less than the array’s length.

Don’t write the Class and main method - assume they are already there.

Example Input:
2 3 1 5
4 7 9 8
Output:
1 2 3 4
5 7 8 9
 
 */


public static int[][] Met(int a[][]) {
    int row = a.length;
    int col = a[0].length;
    int mat[] = new int[row*col];
    int k = 0;
    for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++) {
            mat[k++] = a[i][j];
        }
    }
    java.util.Arrays.sort(mat);
	k = 0;
    for(int i=0;i<row;i++) {
        for(int j=0;j<col;j++)
            a[i][j] = mat[k++];
    }
    return a;
}
