package LogicBuildingProblems_01.easy_problems_2;

/**
 * A triangle is valid if sum of its two sides is greater than the third side.
 * If three sides are a, b and c, then three conditions should be met.
 *
 * (a + b) > c
 * (a + c) > b
 * (b + c) > a
 */

public class CheckWhetherTriangleIsValidOrNot_6 {

    public static void checkTriangleValidOrNot(int a, int b, int c){

        if ((a+b) > c){
            if ((b+c)>a){
                if ((a+c)>b){
                    System.out.println("Valid triangle");
                }else {
                    System.out.println("Not a valid triangle");
                }
            }else {
                System.out.println("Not a valid triangle");
            }
        }else {
            System.out.println("Not a valid triangle");
        }
    }

    public static void main(String[] args) {

        int a = 7, b = 10, c = 5;
        checkTriangleValidOrNot(a, b, c);
    }
}
