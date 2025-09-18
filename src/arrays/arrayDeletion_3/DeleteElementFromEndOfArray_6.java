package arrays.arrayDeletion_3;

import arrays.arrayInsertions_2.InsertElementAtEndOfArray_3;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementFromEndOfArray_6 {

    public static void main(String[] args) {

        // Approach 1
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        arrayList.remove(arrayList.size()-1);
        System.out.println(arrayList.toString());

        // Approach 2
        int[] arr = {10, 20, 30, 40};
        int n = arr.length-1;

        for (int i = 0; i< n; i++){
            System.out.println(arr[i]);
        }


    }
}
