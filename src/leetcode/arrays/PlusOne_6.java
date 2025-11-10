package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne_6 {

    public static int[] plusOne(int[] digits){

//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i = 0; i< digits.length; i++){
//            if (i== digits.length-1){
//                if (digits[i] == 9){
//                    arrayList.add(1);
//                    arrayList.add(0);
//                }else {
//                    arrayList.add(digits[i]+1);
//                }
//            }else {
//                arrayList.add(digits[i]);
//            }
//        }
//
//        int[] newArr = new int[arrayList.size()];
//
//        int i = 0;
//        for (Integer item: arrayList){
//            newArr[i] = item;
//            i++;
//        }
//        return  newArr;
        // Array to int
        int num = 0;
        for (int i = 0; i< digits.length; i++){
            num = (num*10)+digits[i];
        }
        num = num + 1;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (num>0){
            int last = num%10;
            arrayList.add(last);
            num = num / 10;
        }

        int[] finalArr = new int[arrayList.size()];
        int k=0;
        for (int i = arrayList.size()-1; i>=0; i--){
            finalArr[k] = arrayList.get(i);
            k++;
        }
        return finalArr;
    }

    public static void convertArrayToInteger(int[] digits){

        int num = 0;
        for (int i = 0; i<digits.length; i++){
            num = (num*10)+digits[i];
        }
        System.out.println(num);

    }

    public static void main(String[] args) {

        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
        //convertArrayToInteger(digits);
    }
}
