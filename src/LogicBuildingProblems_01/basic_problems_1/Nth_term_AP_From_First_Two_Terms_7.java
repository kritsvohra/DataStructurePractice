package LogicBuildingProblems_01.basic_problems_1;

public class Nth_term_AP_From_First_Two_Terms_7 {

    public static int findNthTerm(int a1, int a2, int n){

        int d = a2 - a1;
        int num=a1;
        for (int i = 1; i<n; i++){
            num = num + d;
        }
        return num;
    }

    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 3;
        int n = 10;
        System.out.println(findNthTerm(a1, a2, n));
    }
}
