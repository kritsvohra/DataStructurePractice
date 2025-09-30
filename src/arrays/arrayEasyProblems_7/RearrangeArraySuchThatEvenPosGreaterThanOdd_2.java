package arrays.arrayEasyProblems_7;

public class RearrangeArraySuchThatEvenPosGreaterThanOdd_2 {

    public static int[] rearrangeArr(int[] arr){

        for (int i = 1; i<arr.length; i++){

            if (i%2==1){
                if (arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            } else if (i%2==0){
                if (arr[i]>arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1};
        int[] rearrangedArr = rearrangeArr(arr);

        for (int i = 0; i< rearrangedArr.length; i++){
            System.out.println(rearrangedArr[i]);
        }


    }
}
