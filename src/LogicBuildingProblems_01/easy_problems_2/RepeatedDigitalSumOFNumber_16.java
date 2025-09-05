package LogicBuildingProblems_01.easy_problems_2;

/**
 * Input : num = "1234"
 * Output : 1
 * Explanation : The sum of 1+2+3+4 = 10, digSum(x) == 10,Hence ans will be 1+0 = 1
 */

public class RepeatedDigitalSumOFNumber_16 {

    public static int findDigitalSUm(int n){

        int length = String.valueOf(n).length();
        char[] digit = String.valueOf(n).toCharArray();
        int sum = 0;

        for (int i = 0; i<length; i++){
            sum = sum + (digit[i]-'0');
        }
        char[] sumDigit = String.valueOf(sum).toCharArray();
        int sumDigitLength = sumDigit.length;
        int sumOfDigit = 0, x = 0;
        while (sumDigitLength > 0){
            sumOfDigit = sumOfDigit + (sumDigit[x] - '0');
            x++;
            sumDigitLength--;
        }
        return sumOfDigit;
    }

    public static void main(String[] args) {

        int n = 5674;
        System.out.println(findDigitalSUm(n));
    }
}
