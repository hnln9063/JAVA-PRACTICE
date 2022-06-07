/*
 ALL PAIRS SHORTEST PATH
 -----------------------
 */

import java.util.*;
public class AllPairsShortestPath {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of vertices : ");
		int n=sc.nextInt();
		System.out.println("Enter the cost adjacency matrix : ");
		int cost[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				cost[i][j]=sc.nextInt();
			}
		}
		for(int k = 0; k < n; k++) {
                        for(int i = 0; i < n; i++) {
                                for(int j = 0; j < n; j++) {
                                        cost[i][j]=Math.min(cost[i][j], cost[i][k]+cost[k][j]);
				}
			}
		}
		System.out.println("The shortest path matrix : ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(cost[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
/*
OUTPUT
------
enter the number of vertices : 3
Enter the cost adjacency matrix :
0 4 11
6 0 2
3 99 0
The shortest path matrix :
0 4 6
5 0 2
3 7 0
*/
