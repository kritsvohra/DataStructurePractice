package LogicBuildingProblems_01.medium_problems_3;

/**
 * We process the number digit by digit from left to right, maintaining the remainder modulo 13 at each step using the formula:
 * rem = (rem * 10 + digit) % 13.
 *
 * Step by Step Approach -
 *
 * Initialize remainder:
 * -> rem = 0
 * Process each digit from left to right:
 * -> Digit '2': rem = (0 * 10 + 2) % 13 = 2
 * -> Digit '9': rem = (2 * 10 + 9) % 13 = 29 % 13 = 3
 * -> Digit '1': rem = (3 * 10 + 1) % 13 = 31 % 13 = 5
 * -> Digit '1': rem = (5 * 10 + 1) % 13 = 51 % 13 = 12
 * -> Digit '2': rem = (12 * 10 + 2) % 13 = 122 % 13 = 5
 * -> Digit '8': rem = (5 * 10 + 8) % 13 = 58 % 13 = 6
 * -> Digit '5': rem = (6 * 10 + 5) % 13 = 65 % 13 = 0
 * Since final rem = 0, the number 2911285 is divisible by 13.
 */

public class CheckIfLargeNumberDivisibleBy13_5 {

    public static boolean checkDivisibleBy13(String str){

        int rem = 0;
        for (int i = 0; i<str.length(); i++){
            rem = (rem * 10+(str.charAt(i)-'0'))%13;
        }
        return rem ==0;
    }

    public static void main(String[] args) {

        String str = "2911285";
        System.out.println(checkDivisibleBy13(str));

    }
}
