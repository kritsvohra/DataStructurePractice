package arrays.arrayEasyProblems_7;

public class SumOfAllSubArray_3 {

    public static int sumOfSubArray(int[] arr){

        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            int temp = 0;
            for (int j = i; j<arr.length; j++){
                temp = temp + arr[j];
                sum = sum + temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(sumOfSubArray(arr));

    }
}
