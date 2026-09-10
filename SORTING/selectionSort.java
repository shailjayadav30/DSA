
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class selectionSort {

    public static int[] SelectionSorting(int arr[]) {

        for (int i = 0; i <= arr.length - 2; i++) {

            int min = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter size of array");
        // int n = scanner.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter values in array");
        // for (int i = 0; i < n; i++) {
        // arr[i] = scanner.nextInt();
        // }
        // SelectionSorting(arr);
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }
        // or directly print the sorted array
        int arr[] = { 4, 32, 1, 21, 3, 23 };
        System.out.println(Arrays.toString(SelectionSorting(arr)));
    }
}