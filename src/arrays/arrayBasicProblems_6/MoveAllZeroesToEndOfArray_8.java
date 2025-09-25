package arrays.arrayBasicProblems_6;

import java.util.ArrayList;

public class MoveAllZeroesToEndOfArray_8 {

    public static void moveALlZeroToEnd(int[] arr){

        int[] arrFinal = new int[arr.length];
        int j = 0;

        for (int i = 0; i< arr.length; i++){

            if (arr[i] != 0){
                arrFinal[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length){
            arrFinal[j] = 0;
            j++;
        }

        for (int i = 0; i< arrFinal.length; i++){
            arr[i] = arrFinal[i];
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

       // int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] arr = {3, 5, 0, 0, 4};
        moveALlZeroToEnd(arr);
    }
}
