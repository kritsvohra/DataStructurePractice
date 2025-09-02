package LogicBuildingProblems_01.easy_problems_2;

import java.util.Scanner;

public class SumOfDigits_1 {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigits(num));
    }
}
