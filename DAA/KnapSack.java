/*
 KNAPSACK PROBLEM USING GREEDY METHOD
 ------------------------------------
*/

import java.util.*;

public class KnapSack {

	public static void print(int a[]) {
		for(int k : a)
			System.out.print(k + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of objects : ");
		int object = sc.nextInt();
		int w[] = new int[object];
		int p[] = new int[object];
		for(int i = 0; i < object; i++)
		{
			System.out.print("Enter profit and weight : ");
			p[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		System.out.print("Enter Knapsack weight : ");
		int m = sc.nextInt();
		double pw[] = new double[object];
		for(int i=0;i<object;i++) {
			pw[i] = (double)p[i]/(double)w[i];
		}

		for(int i = 0; i < object - 1; i++)
		{
			for(int j = i+1; j < object ; j++)
			{
				if(pw[i] < pw[j])
				{
					double temp = pw[j];
					pw[j] = pw[i];
					pw[i] = temp;

					int temp1 = p[j];
					p[j] = p[i];
					p[i] = temp1;

					int temp2 = w[j];
					w[j] = w[i];
					w[i] = temp2;
				}
			}
		}
		System.out.println("After sorting according to the p/w ratio");
		System.out.print("OBJECT : ");
		for(int i = 1; i <= object; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("PROFIT : ");
		print(p);
		System.out.print("WEIGHT : ");
		print(w);
		int k = 0;
		double sum = 0;
		while(k <  object && m > 0)
		{
			if(w[k] < m)
			{
				sum += p[k];
				m -= w[k];
			}
			else
			{
				sum += ((double)m / (double)w[k] * (double)p[k]);
				m = 0;
			}
			k++;
		}
		System.out.println("MAX PROFIT = " + sum);
		sc.close();
	}
}

/* 
OUTPUT:
------
Enter number of objects : 4
Enter profit and weight : 10 2
Enter profit and weight : 20 4
Enter profit and weight : 30 5
Enter profit and weight : 40 4
Enter Knapsack weight : 10
After sorting according to the p/w ratio
OBJECT : 1 2 3 4
PROFIT : 40 30 10 20
WEIGHT : 4 5 2 4
MAX PROFIT = 75.0
*/
