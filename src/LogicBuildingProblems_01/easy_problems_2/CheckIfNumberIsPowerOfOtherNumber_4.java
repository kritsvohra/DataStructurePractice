package LogicBuildingProblems_01.easy_problems_2;

public class CheckIfNumberIsPowerOfOtherNumber_4 {

    public static boolean checkNumberIsPowerOfOtherNUm(int x, int y){
        for (int i = 0; i<=y; i++){
            if (y==Math.pow(x, i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 1000;
        System.out.println(checkNumberIsPowerOfOtherNUm(x, y));

    }
}
