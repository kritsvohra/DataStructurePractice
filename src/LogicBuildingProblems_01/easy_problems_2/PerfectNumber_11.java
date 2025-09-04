package LogicBuildingProblems_01.easy_problems_2;

/**
 * A number is a perfect number if it is equal to the sum of its proper divisors, that is,
 * the sum of its positive divisors excluding the number itself. Find whether a given positive integer n is perfect or not.
 *
 * Input: n = 15
 * Output: false
 * Explanation: Divisors of 15 are 1, 3 and 5. Sum of divisors is 9 which is not equal to 15.
 */

public class PerfectNumber_11 {

    public static boolean findPerfectNumberOrNot(int n){
        int sum = 0;
        for (int i = 1; i<n; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if (sum == n){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 6;
        System.out.println(findPerfectNumberOrNot(n));
    }

}
