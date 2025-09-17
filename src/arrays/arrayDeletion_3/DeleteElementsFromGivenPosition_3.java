package arrays.arrayDeletion_3;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementsFromGivenPosition_3 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        int pos = 3;
        arrayList.remove(pos-1);
        System.out.println(arrayList.toString());

        int arr[] = {10, 20, 30, 40};

        int n = arr.length;
        for(int i = pos; i<n; i++){
            arr[i-1] = arr[i];
        }

        if (pos < n){
            n = n-1;
        }

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }


}
