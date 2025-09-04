package LogicBuildingProblems_01.easy_problems_2;

public class NthFibonacciNumber_12 {

    public static int findNthFibonacciNumber(int n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // code here
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 2; i<=n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(findNthFibonacciNumber(n));
    }
}
