package LogicBuildingProblems_01.easy_problems_2;

import java.util.Scanner;

public class CheckPrimeNumber_3 {

    public static boolean checkPrime(int num){
        if(num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for (int i = 2; i*i<=num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkPrime(num));
    }
}
