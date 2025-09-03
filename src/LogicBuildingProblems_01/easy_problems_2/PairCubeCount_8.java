package LogicBuildingProblems_01.easy_problems_2;

public class PairCubeCount_8 {

    public static int pairCubeCount(int n){
        int count = 0;
        for (int a = 1; a<=n; a++){
            for (int b = 0; b<n; b++){
                if ((Math.pow(a, 3)+Math.pow(b, 3))==n){
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int n = 28;
        System.out.println(pairCubeCount(n));
    }
}
