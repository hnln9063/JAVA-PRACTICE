// NQUEENS PROBLEM TO PRINT ALL POSSIBLE SOLUTIONS

import java.util.*;
public class NQueensAllSolutions {
	static int count=0;
	public static boolean isSafe(char[][] mat, int r, int c) {
		for (int i = 0; i < r; i++) {
			if (mat[i][c] == 'Q') {
				return false;
			}
		}

		for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
			if (mat[i][j] == 'Q') {
				return false;
			}
		}

		for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
			if (mat[i][j] == 'Q') {
				return false;
			}
		}

		return true;
	}

	private static void printSolution(char[][] mat) {
		int arr[] = new int[mat.length];
		for (int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j] == 'Q') {
					arr[i] = j;
				}
			}
		}
		for(int i=0;i<mat.length;i++) {
			System.out.print( (arr[i]+1)+" ");
		}
		System.out.println();
		count++;
	}

	private static void nQueen(char[][] mat, int r) {
		if (r == mat.length) {
			printSolution(mat);
			return;
		}
		for (int i = 0; i < mat.length; i++) {
			if (isSafe(mat, r, i)) {
				mat[r][i] = 'Q'; 
				nQueen(mat, r + 1);
				mat[r][i] = '–';
			}
		}
	}

	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Queens : ");
		N=sc.nextInt();
		char[][] mat = new char[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(mat[i], '–');
		}
		nQueen(mat, 0);
		System.out.println("Total Solutions : "+count);
	}
}
/* 
OUTPUT:
------
Enter number of Queens : 4
2 4 1 3
3 1 4 2
Total Solutions : 2
*/
