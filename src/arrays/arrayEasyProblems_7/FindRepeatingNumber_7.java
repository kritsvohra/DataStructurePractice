package arrays.arrayEasyProblems_7;

public class FindRepeatingNumber_7 {

    public static void findRepeatingNumber(int[] arr){

        int repeatingNumber = -1;
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 1; i<arr.length; i++){
            if (arr[i]==arr[i-1]){
                repeatingNumber = arr[i];
                break;
            }
        }

        System.out.println(repeatingNumber);
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2,3,4};
        findRepeatingNumber(arr);
    }
}
