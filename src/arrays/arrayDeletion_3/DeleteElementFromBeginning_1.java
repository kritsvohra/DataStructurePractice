package arrays.arrayDeletion_3;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementFromBeginning_1 {

    public static void deleteArrayFromBeginning(int[] arr){

        int n = arr.length;
        for (int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }

        n = n-1;

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        int[] arr = {10, 20, 30, 40};
        deleteArrayFromBeginning(arr);
    }
}
