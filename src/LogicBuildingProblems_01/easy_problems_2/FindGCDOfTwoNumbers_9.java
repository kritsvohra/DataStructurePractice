package LogicBuildingProblems_01.easy_problems_2;

public class FindGCDOfTwoNumbers_9 {

    public static int findGCD(int a, int b){

        int result = Math.min(a, b);
        while (result>0){
            if (a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {

        int a = 36, b = 60;
        System.out.println(findGCD(a, b));
    }
}
