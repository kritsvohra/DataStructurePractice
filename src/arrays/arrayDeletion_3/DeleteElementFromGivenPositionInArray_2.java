package arrays.arrayDeletion_3;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementFromGivenPositionInArray_2 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        int pos = 4;
        //arrayList.remove(pos-1);
        //arrayList.remove(pos-1);
        arrayList.remove(pos-1);
        System.out.println(arrayList.toString());
    }
}
