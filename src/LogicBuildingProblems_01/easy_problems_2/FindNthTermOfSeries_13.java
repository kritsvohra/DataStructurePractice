package LogicBuildingProblems_01.easy_problems_2;

/**
 * Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21...
 */

public class FindNthTermOfSeries_13 {

    public static int findNthTerm(int n){

        int nth_term = 1;
        for (int i=1; i<n; i++){
            nth_term = nth_term + (i+1);
        }
        return nth_term;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(findNthTerm(n));

    }
}
