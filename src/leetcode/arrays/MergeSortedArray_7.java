package leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArray_7 {

    public static void merge(int[] num1, int m, int[] num2, int n){

        int k = 0;
        for (int i = m; i<num1.length; i++){
            num1[i] = num2[k];
            k++;
        }

        for (int i = 0; i<m+n; i++){
            for (int j = 0; j<m+n; j++){
                if (num1[i]< num1[j]){
                    int temp = num1[i];
                    num1[i] = num1[j];
                    num1[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(num1));
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int m = 3;
        int[] num2 = {2, 3, 6};
        int n = 3;
        merge(num1, m, num2, n);
    }
}
