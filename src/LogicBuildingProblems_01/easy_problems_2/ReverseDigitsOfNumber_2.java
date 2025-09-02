package LogicBuildingProblems_01.easy_problems_2;

import java.util.Arrays;

public class ReverseDigitsOfNumber_2 {

    public static int reverseNumber(int n){
        int revNum = 0;
        while (n > 0) {
            int rem = n % 10;
            revNum = revNum * 10 + rem;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {

        int n = 12345;
        System.out.println(reverseNumber(n));
    }
}
