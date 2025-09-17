package arrays.arrayInsertions_2;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertElementAtEndOfArray_3 {

    public static void addElementAtEnd(int[] arr, int element){
        int n = arr.length;
        arr[n-1] = element;

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        int element = 50;
        arrayList.add(element);
        System.out.println(arrayList.toString());

        // Approach 2
        int[] arr = {10, 20, 30, 40, 0};
        addElementAtEnd(arr, element);
    }
}
