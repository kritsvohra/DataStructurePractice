package arrays.arrayDeletion_3;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteOnlyFirstOccurranceOfElementInArray_4 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 30, 40, 20));
        int element = 20;
        arrayList.remove(Integer.valueOf(20));
        System.out.println(arrayList.toString());

        int[] arr = {10, 20, 20, 30, 40, 20};
        boolean found = false;
        int n = arr.length;

        for (int i = 0; i<n; i++){

            if (found == true){
                arr[i-1] = arr[i];
            }

            else if (arr[i] == element){
                found = true;
            }
        }

        n = n-1;

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }

    }
}
