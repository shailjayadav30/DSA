public class MergeSort {
    public static int[] mergesort(int arr[], int low, int high) {
        return arr;
    }

    public static void  main(String args[]) {
        int arr[] = { 3, 5, 1, 2, 6, 7, 8, 9, 10, 3, 4, 5 };
        int start=0;
        int end=arr.length/2;
        mergesort(arr, start,end);
    }

}
