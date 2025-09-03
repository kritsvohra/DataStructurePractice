package LogicBuildingProblems_01.easy_problems_2;

import java.util.Scanner;

public class Factorial_7 {

    public static int factorial(int n){

        int fact = 1;
        if (n == 0 ){
            return 1;
        }
        while (n > 0){
            fact = fact * n;
            n = n-1;
        }
        return fact;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is :"+factorial(n));
    }
}
