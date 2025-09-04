package LogicBuildingProblems_01.easy_problems_2;

public class FindLCMOfTwoNumbers_10 {

    public static int findLCM(int a, int b){

        int g = Math.max(a, b);
        int s = Math.min(a, b);

        for (int i = g; i<=a*b; i = i+g){
            if (i%s == 0){
                return i;
            }
        }
        return a*b;
    }

    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println(findLCM(a, b));
    }
}
