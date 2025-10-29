package searchingSortingalgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void sortUsingBubbleSort(int[] arr){

        for (int i = 0; i<arr.length; i++){

            for (int j = 0; j< arr.length; j++){

                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        sortUsingBubbleSort(arr);
    }
}
