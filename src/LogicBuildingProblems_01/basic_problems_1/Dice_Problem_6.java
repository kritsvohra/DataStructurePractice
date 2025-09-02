package LogicBuildingProblems_01.basic_problems_1;
/*
You are given a cubic dice with 6 faces. All the individual faces have a number printed on them.
The numbers are in the range of 1 to 6, like any ordinary dice.
You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.
n a normal 6-faced dice, 1 is opposite to 6, 2 is opposite to 5, and 3 is opposite to 4.
Hence a normal if-else-if block can be placed
 */

public class Dice_Problem_6 {

    public static int dice(int n){

        int ans;
        if (n == 1){
            ans = 6;
        } else if (n == 2) {
            ans = 5;
        } else if (n == 3) {
            ans = 4;
        } else if (n == 4) {
            ans = 3;
        } else if (n == 5) {
            ans = 2;
        } else if (n == 6) {
            ans = 1;
        }else {
            ans = 0;
        }
        return ans;
    }

    public static void main(String[] args) {

        int n = 6;
        System.out.println("Number opposite "+n+" is :"+dice(n));
    }
}
