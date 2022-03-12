/*Write a method called Met that takes the Cartesian coordinates of two points and returns the distance between the 2 points.

  Define the parameters in this order: x1, y1, x2, y2.

  Here (x1,y1) are the coordinates of the first point and (x2,y2) are the coordinates of the second point.

  Only write the method - assume that the Main class & main method have been defined.

Note: x1, y1, x2, y2 are integers. The distance to be returned is double type.

Eg, Distance between (1,0) and (0,0) is 1.0
Distance between (0,3) and (4,0) is 5.0
*/

import java.util.*;

class Distance_bet_two {

	public static double Met(int x1, int y1, int x2, int y2) {
		double dist = (double)Math.sqrt((double)Math.pow(x2 - x1,2)+(double)Math.pow(y2 - y1,2));
		return dist;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int x1,x2,y1,y2;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		double dist = Met(x1,y1,x2,y2);
		System.out.println(dist);
	}
}
