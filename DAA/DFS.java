/*
 DEPTH FIRST SEARCH
 ------------------
 */

import java.util.*;

public class DFS {
	static int V;
	static LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")DFS(int v)
	{
		this.V = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList();
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				DFSUtil(n, visited);
			}
		}
	}
	
	void DFSs(int s)
	{
		boolean visited[] = new boolean[V];
		DFSUtil(s, visited);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of edges : ");
		int n = sc.nextInt();
		DFS g = new DFS(n);
		System.out.println("Enter edges : ");
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			g.addEdge(x, y);
		}
		System.out.print("Enter Source Vertex : ");
		int s = sc.nextInt();
		System.out.print("The DFS Traversal is ");
		g.DFSs(s);
		System.out.println();
		sc.close();
	}

}

/*
OUTPUT:
-------
Enter no. of edges : 12
Enter edges :
1 2
2 1
1 3
3 1
1 4
4 1
2 5
5 2
3 5
5 3
4 5
5 4
Enter Source Vertex : 1
The DFS Traversal is 1 2 5 3 4
*/
