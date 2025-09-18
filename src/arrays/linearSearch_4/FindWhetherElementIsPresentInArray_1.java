package arrays.linearSearch_4;

public class FindWhetherElementIsPresentInArray_1 {

    public static int findElementPresentAndreturnItsIndex(int[] arr, int element){

        for (int i = 0; i<arr.length; i++){

            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int x = 3;
        System.out.println(findElementPresentAndreturnItsIndex(arr, x));
    }
}
