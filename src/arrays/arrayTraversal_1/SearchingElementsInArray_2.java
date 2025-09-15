package arrays.arrayTraversal_1;

public class SearchingElementsInArray_2 {

    public static boolean searchElement(int[] arr, int target){
        boolean found = false;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==target){
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        System.out.println(searchElement(arr, target));
    }
}
