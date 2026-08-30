import java.util.Arrays;

public class Sumtrianglearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sumtriangle(arr);
    }

    public static void sumtriangle(int arr[]) {
        if (arr.length < 1) {
            return;
        }
        int temp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
              int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }
        sumtriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
