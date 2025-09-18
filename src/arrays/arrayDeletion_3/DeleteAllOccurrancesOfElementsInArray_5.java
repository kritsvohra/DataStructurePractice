package arrays.arrayDeletion_3;

public class DeleteAllOccurrancesOfElementsInArray_5 {

    public static void removeAllOccurrances(int[] arr, int element){

        int[] arr2 = new int[arr.length];
        int x = 0;

        for (int i = 0; i< arr.length; i++){

            if (arr[i] != element){
                arr2[x] = arr[i];
                x++;
            }
        }

        for (int i = 0; i< arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int element = 2;
        removeAllOccurrances(arr, element);
    }
}
