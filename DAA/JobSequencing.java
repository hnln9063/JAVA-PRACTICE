/* 
 JOB SEQUENCING USING DEADLNES
 -----------------------------
 */

import java.util.*;
public class JobSequencing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of jobs: ");
		int n = sc.nextInt();
		String a[] = new String[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter job : ");
			a[i] = sc.next();
			//System.out.println();
			System.out.print("Enter profit: ");
			b[i] = sc.nextInt();
			//System.out.println();
			System.out.print("Enter dead line: ");
			c[i] = sc.nextInt();
			//System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j = i+1;j<n;j++) {
				if(b[i]<b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					String temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}	
			}
		}
		System.out.println("------Sorted order-------");
		System.out.print("Jobs: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Profit: ");
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.print("Deadline: ");
		for(int i=0;i<n;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		int max = c[0];
		for(int i=0;i<n;i++) {
			if(c[i]>max) {
				max = c[i];
			}
		}
		String x[] = new String[max];
		//int xx[] = new int[max];
		int profit = 0;
		for(int i=0;i<n;i++) {
			int pp=c[i];
			pp=pp-1;
			if(x[pp]==null) {
				x[pp] = a[i];
				profit = profit+b[i];
			} else {
				while(pp!=-1) {
					if(x[pp]==null) {
						x[pp] = a[i];
						profit = profit+b[i];
						break;
					}
					pp=pp-1;
				}
			}
		}
		for(int i=0;i<max;i++){
			System.out.print("-->"+x[i]);
		}
		System.out.println();
		System.out.println("Profit earned: "+profit);
	}

}
/*
OUTPUT:
-------
Enter the number of jobs:5
Enter job : j1
Enter profit: 20
Enter dead line: 2
Enter job : j2
Enter profit: 15
Enter dead line: 2
Enter job : j3
Enter profit: 10
Enter dead line: 1
Enter job : j4
Enter profit: 5
Enter dead line: 3
Enter job : j5
Enter profit: 1
Enter dead line: 3
------Sorted order-------
Jobs: j1 j2 j3 j4 j5
Profit: 20 15 10 5 1
Deadline: 2 2 1 3 3
-->j2-->j1-->j4
Profit earned: 40
*/
