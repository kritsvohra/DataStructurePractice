package LogicBuildingProblems_01.basic_problems_1;

import java.util.Scanner;

public class Sum_Of_Square_Of_n_Natural_Number_4 {

    public static int sumOfSquare(int n){
        int sum = 0;
        for (int i = 1; i<=n;i++){
            sum = sum + (i*i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquare(n));
    }
}
