package LogicBuildingProblems_01.easy_problems_2;

/**
 * Given an integer n, determine whether it is a palindrome number or not.
 * A number is called a palindrome if it reads the same from forward and backward.
 *
 * Input: n = 12321
 * Output: True
 * Explanation: 12321 is a palindrome number because it reads same  forward and backward.
 *
 * Input: n = 1234
 * Output:  False
 * Explanation: 1234 is not a palindrome number because it does not read the same forward and backward.
 */

public class CheckIfNumberIsPalindrome_15 {

    public static boolean checkNumberPalindrome(int n){
        int initialNUm = n;
        int revNum = 0;
        while (n>0){
            int rem = n%10;
            revNum = (revNum * 10) + rem;
            n = n/10;
        }

        if (revNum==initialNUm){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 12321;
        System.out.println(checkNumberPalindrome(n));

    }
}
