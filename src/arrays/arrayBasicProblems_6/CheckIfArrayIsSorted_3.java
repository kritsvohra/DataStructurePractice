package arrays.arrayBasicProblems_6;

import java.util.Arrays;

public class CheckIfArrayIsSorted_3 {

    public static boolean checkIfArrayIsSorted(int[] arr){


        for (int i = 0; i< arr.length; i++){

            for (int j = i+1; j< arr.length; j++){

                if (arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {90, 180, 100, 70, 40, 30};
        //int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array is sorted: "+ checkIfArrayIsSorted(arr));


    }
}
