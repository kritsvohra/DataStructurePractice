package LogicBuildingProblems_01.medium_problems_3;

/**
 * Since input number may be very large, we cannot use n % 11 to check if a number is divisible by 11 or not.
 * The idea is based on following fact.
 * A number is divisible by 11 if difference of following two is divisible by 11.
 *
 * Sum of digits at odd places.
 * Sum of digits at even places.
 */

public class CheckIfLargeNumberDivisibleBy11_4 {

    public static boolean checkLargeNumberDivisibleBy11(String str){

        int oddSum = 0, evenSum = 0;
        int length  =str.length();

        for (int i = 0; i<length; i++){

            int digit = str.charAt(i)-'0';

            if (i%2==0){
                evenSum = evenSum+digit;
            }else {
                oddSum = oddSum+digit;
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);

        int finalSum = evenSum - oddSum;
        if (finalSum%11==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "1234567589333892";
        System.out.println(checkLargeNumberDivisibleBy11(s));
    }
}
