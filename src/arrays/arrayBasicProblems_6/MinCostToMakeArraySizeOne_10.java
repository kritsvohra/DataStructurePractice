package arrays.arrayBasicProblems_6;

import java.util.ArrayList;
import java.util.Arrays;

public class MinCostToMakeArraySizeOne_10 {

    public static int minCostToMakeArraySizeOne(int[] arr){

        int min = arr[0];

        for (int i = 1; i<arr.length; i++){
                if (arr[i] < min){
                    min = arr[i];
                }
        }

        return (arr.length-1)*min;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2};
        System.out.println(minCostToMakeArraySizeOne(arr));
    }
}
