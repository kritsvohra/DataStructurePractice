package LogicBuildingProblems_01.medium_problems_3;

public class FIndSquareRootOfNumber_1 {

    public static int squareRoot(int n){
        double squareRoot = (Math.sqrt(n));
        int floorValue = (int) Math.floor(squareRoot);
        return floorValue;
    }

    public static int secondWayForSquareRoot(int n){

        int res = 1;
        while (res*res<=n){
            res++;
        }
        return res-1;
    }

    public static void main(String[] args) {

        int n = 9;
        System.out.println(squareRoot(n));
        System.out.println(secondWayForSquareRoot(n));
    }
}
