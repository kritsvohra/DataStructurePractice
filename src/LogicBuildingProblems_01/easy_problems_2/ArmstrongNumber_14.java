package LogicBuildingProblems_01.easy_problems_2;

/**
 * Given a number x, determine whether the given number is Armstrong's number or not. A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if
 *
 * abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
 *
 * Here a, b, c and d are digits of input number abcd.....
 *
 * Input: n = 153
 * Output: true
 * Explanation: 153 is an Armstrong number, 1*1*1 + 5*5*5 + 3*3*3 = 153
 */

public class ArmstrongNumber_14 {

    public static boolean checkArmstrongNumber(int n){
        int length = String.valueOf(n).length();
        System.out.println(length);
        char[] digit = String.valueOf(n).toCharArray();
        int num = 0;
        for (int i = 0; i<length; i++){
            num = (int) (num + Math.pow(digit[i]-'0', length));
        }
        if (num == n){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 153;
        System.out.println(checkArmstrongNumber(n));
    }
}
