/*Given a  number n, print the factorial of the number.

Example Input:

1

Output:

1

Example Input:

4

Output:

24
*/

import java.util.*;
class Factorial {
    public static void fact(int n) {
        int fact = 1;

        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        fact(num);
    }


}
