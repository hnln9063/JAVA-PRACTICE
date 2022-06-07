/*
 KRUSKALS ALGORITHM
 ------------------
 */

import java.util.*;

public class Kruskals {

	int parent[] = new int[10];
	int find(int i) {
		while(parent[i] != 0) {
			i = parent[i];
		}
		return i;
	}
	
	void union(int i, int j) {
		if(i < j) {
			parent[i] = j;
		} else {
			parent[j] = i;
		}
	}
	
	void solve(int g[][], int V) {
		int u = 0, v = 0, sum = 0, e = 1, min;
		while(e <= V - 1) {
			min = 99;
			for(int i = 1; i <= V; i++) {
				for(int j = 1; j <= V; j++) {
					if(i != j && min > g[i][j] && g[i][j] != 0) {
						min = g[i][j];
						u = i;
						v = j;
					}
				}
			}
			int x = find(u);
			int y = find(v);
			if(x != y) {
				union(x, y);
				System.out.println(u + " - " + v + " -> " + g[u][v]);
				sum += min;
				e++;
			}
			g[u][v] = g[v][u] = 99;
		}
		System.out.println("Cost of the spanning Tree = " + sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of vertices : ");
		int v = sc.nextInt();
		int g[][] = new int[10][10];
		Kruskals k = new Kruskals();
		k.parent  = new int[10];
		System.out.println("Enter the Cost matrix : ");
		for(int i = 1; i <= v; i++) {
			for(int j = 1; j <= v; j++) {
				g[i][j] = sc.nextInt();
			}
		}
		k.solve(g, v);
		sc.close();
	}
}
/*
OUTPUT:
-------
Enter no of vertices : 4
Enter the Cost matrix :
0 3 4 10
3 0 20 5
4 20 0 6
10 5 6 0
1 - 2 -> 3
1 - 3 -> 4
2 - 4 -> 5
Cost of the spanning Tree = 12
*/
