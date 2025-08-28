package LogicBuildingProblems_01;

import java.util.Scanner;

public class Check_Even_Odd_1 {

    public static void checkEvenOrOdd(int n){

        if (n%2==0){
            System.out.println(n+" is an even number");
        }else {
            System.out.println(n+" is an odd number");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEvenOrOdd(n);

    }
}
