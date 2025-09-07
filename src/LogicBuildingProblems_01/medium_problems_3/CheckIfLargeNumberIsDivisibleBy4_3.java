package LogicBuildingProblems_01.medium_problems_3;

/**
 * A number is divisible by 4 if number formed by last two digits of it is divisible by 4.
 * For example, let us consider 76952. Number formed by last two digits = 52. Since 52 is divisible by 4, answer is YES.
 */

public class CheckIfLargeNumberIsDivisibleBy4_3 {

    public static boolean checkLargeNumberDivisibleBy4_way1(long n){
        if (n%4==0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkLargeNumberDivisibleBy4_way2(String str){
        int length = str.length();

        // Empty string
        if (length==0){
            return false;
        }

        // If there is a single digit in the string
        if (length == 1){
            if ((str.charAt(0)-'0')%4==0){
                return true;
            }else {
                return false;
            }
        }

        // If more than one digit
        int last = str.charAt(length-1)-'0';
        int second_last = str.charAt(length-2)-'0';

        if (((second_last*10)+last)%4==0){
            return true;
        }else {
            return false;
        }
    }



    public static void main(String[] args) {

        long n = 1234567589333864l;
        String str = "1234567589333864";
        System.out.println(checkLargeNumberDivisibleBy4_way1(n));
        System.out.println(checkLargeNumberDivisibleBy4_way2(str));

    }
}
