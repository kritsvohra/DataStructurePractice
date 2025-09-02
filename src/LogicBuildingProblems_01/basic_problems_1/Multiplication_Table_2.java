package LogicBuildingProblems_01.basic_problems_1;

import java.util.Scanner;

public class Multiplication_Table_2 {

    public static void mulTable(int n){

        for (int i = 1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mulTable(n);
    }
}
