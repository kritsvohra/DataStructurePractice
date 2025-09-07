package LogicBuildingProblems_01.medium_problems_3;

import java.util.ArrayList;
import java.util.List;

public class CountNumbersWithExactly3Divisors_2 {

    public static List<Integer> numbersWith3Divisors(int n){


        List<Integer> numberWith3Divisors = new ArrayList<Integer>();

        for (int i = 1; i<=n; i++){
            int no_if_divisors = 0;
            for (int j = 1; j<=i; j++){
                if (i%j==0){
                    no_if_divisors = no_if_divisors + 1;
                }
            }
            System.out.println(no_if_divisors);
            if (no_if_divisors == 3){
                numberWith3Divisors.add(i);
            }
        }
        return numberWith3Divisors;
    }

    public static void main(String[] args) {

        int n = 100;
        System.out.println(numbersWith3Divisors(n));

    }
}
