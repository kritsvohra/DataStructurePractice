package LogicBuildingProblems_01.basic_problems_1;

import java.util.ArrayList;
import java.util.List;

public class Swap_Two_Numbers_5 {

    public static List<Integer> swapNumbers(int a, int b){

        List<Integer> numbers = new ArrayList<Integer>();
        int temp = a;
        a = b;
        b = temp;
        numbers.add(a);
        numbers.add(b);
        return numbers;
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        System.out.println(swapNumbers(a, b));
    }
}
