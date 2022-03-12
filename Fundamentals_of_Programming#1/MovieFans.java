/*ou and your friend are movie fans and want to predict if the movie is going to be a hit!

The movie’s success formula depends on 2 parameters:

    the acting power of the actor (range 0 to 10)
    the critic’s rating of the movie (range 0 to 10)

The movie is a hit if the acting power is excellent (more than 8) or the rating is excellent (more than 8). This holds true except if either the acting power is poor (less than 2) or rating is poor (less than 2), then the movie is a flop. Otherwise the movie is average.

Write a method Met that takes as parameters 2 integers:

    the first integer is the acting power
    second integer is the critic’s rating.

You have to print Yes if the movie is a hit, Maybe if the movie is average and No if the movie is flop.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example input: 9 5
Output: Yes
Example input: 1 9
Output: No
Example input: 6 4
Output: Maybe
*/

import java.util.*;

class MovieFans {
  public static void Met (int acting_power, int rating) {

      if( (acting_power > 8 && rating < 2) || (rating > 8 && acting_power < 2) ) {
          System.out.println("No");
      } else if(acting_power < 2 || rating < 2) {
          System.out.println("No");
      } else if(acting_power > 8 || rating > 8 ){
          System.out.println("Yes");
      } else {
          System.out.println("Maybe");
      }
  }
  public static void main(String args[]) {
  	
	  Scanner sc = new Scanner(System.in);
	  int acting_power = sc.nextInt();
	  int rating = sc.nextInt();
	  Met(acting_power,rating);
  
  }
}

